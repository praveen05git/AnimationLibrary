package com.hencesimplified.animationlibarysample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    /*
    Button button2;
    Button animationButton;
    Button backButton;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        animationButton = findViewById(R.id.animationButton);
        backButton = findViewById(R.id.backButton);


        animationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Object for the class
                Animator animator = new Animator();

                //Animation for Views
                animator.doLeftEnterAnimation(textView2, getApplicationContext());
                animator.doRightExitAnimation(button2, getApplicationContext());
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(homeIntent);

                //Object for the class
                Animator animator = new Animator();
                //Transition Animation between Activities
                animator.leftEnterRightOut(MainActivity2.this);
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(homeIntent);
        Animator animator = new Animator();
        animator.leftEnterRightOut(MainActivity2.this);
    }
     */
}