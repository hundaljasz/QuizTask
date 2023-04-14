package com.example.quiztask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        String input = userName.trim();
        if(TextUtils.isEmpty(input)) {
            Toast.makeText(MainActivity.this, "Input Field is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent QuizIntent = new Intent(MainActivity.this,QuizActivity.class);
        QuizIntent.putExtra("userName",userName);
        startActivity(QuizIntent);

    }
}