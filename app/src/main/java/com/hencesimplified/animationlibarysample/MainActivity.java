package com.hencesimplified.animationlibarysample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*

    Button button;
    Button animateButton;
    Button intentButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        animateButton = findViewById(R.id.animateButton);
        intentButton = findViewById(R.id.intentButton);

        animateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Object for the class
                Animator animator = new Animator();

                //Animation for Views
                animator.doFadeInAnimation(textView, getApplicationContext());
                animator.doShakeAnimation(button, getApplicationContext());
            }
        });

        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

                //Object for the class
                Animator animator = new Animator();
                //Transition Animation between Activities
                animator.rightEnterLeftOut(MainActivity.this);
            }
        });
    }

     */
}