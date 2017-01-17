package example.com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class WordCountActivity extends AppCompatActivity {

    TextView answerText;
    TextView questionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        questionText = (TextView)findViewById(R.id.answer_question);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");
        String question = extras.getString("question");

        questionText.setText(question);

        answerText.setText(answer);

        Log.d(getClass().toString(), "Answer activity onCreate");

    }
}
