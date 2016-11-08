package com.example.user.wordcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity {

    EditText mSentenceEditText;
    Button mCountButton;
    TextView mAnswerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSentenceEditText = (EditText)findViewById(R.id.sentence_text);
        mCountButton = (Button)findViewById(R.id.count_button);
        mAnswerText = (TextView)findViewById(R.id.answer_text);

        mCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Wordcounter", "Count button clicked!");
                String sentence = mSentenceEditText.getText().toString();
                Counter counter = new Counter(sentence);
                mAnswerText.setText(counter.countWord().toString());


            }
        });
    }
}
