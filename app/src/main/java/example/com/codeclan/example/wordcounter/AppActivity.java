package example.com.codeclan.example.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class AppActivity extends AppCompatActivity {
    EditText questionEditText;
    Intent intent;
    Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question_text);
        shakeButton = (Button)findViewById(R.id.shake_button);

        intent = new Intent(WordCountActivity.this, WordCountActivity.class);

        Log.d(getClass().toString(), "onCreate got called");
    }

    public void onShakeButtonPressed(View button){
        Log.d(getClass().toString(), questionEditText.getText().toString());

        Words words = new Words();
        String answer = words.changeToString();
        intent.putExtra("answer", answer);
        intent.putExtra("question", questionEditText.getText().toString());

        startActivity(intent);
    }
}
