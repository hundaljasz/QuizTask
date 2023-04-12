package com.example.quiztask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button startQuizBTN;
    EditText getUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuizBTN = findViewById(R.id.startBTN);
        getUserName  = findViewById(R.id.username);
    }

    public void startQuiz(View v) {
        String userName = getUserName.getText().toString();

        Intent QuizIntent = new Intent(MainActivity.this,QuizActivity.class);
        QuizIntent.putExtra("userName",userName);
        startActivity(QuizIntent);

    }
}