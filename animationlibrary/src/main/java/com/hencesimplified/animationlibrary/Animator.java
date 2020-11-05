package com.hencesimplified.animationlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Animator {

    //Shake Animation
    public void doShakeAnimation(View view, Context applicationContext) {
        Animation shakeAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.shake);
        view.startAnimation(shakeAnimation);
    }

    //Fade In Animation
    public void doFadeInAnimation(View view, Context applicationContext) {
        Animation fadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.item_anim);
        view.startAnimation(fadeIn);
    }

    //Enter Animations
    public void doEnterAnimation(View view, Context applicationContext) {
        Animation enter = AnimationUtils.loadAnimation(applicationContext, R.anim.enter_anim);
        view.startAnimation(enter);
    }

    public void doLeftEnterAnimation(View view, Context applicationContext) {
        Animation leftEnter = AnimationUtils.loadAnimation(applicationContext, R.anim.left_enter);
        view.startAnimation(leftEnter);
    }

    public void doRightEnterAnimation(View view, Context applicationContext) {
        Animation rightEnter = AnimationUtils.loadAnimation(applicationContext, R.anim.right_enter);
        view.startAnimation(rightEnter);
    }

    //Exit Animations
    public void doExitAnimation(View view, Context applicationContext) {
        Animation exit = AnimationUtils.loadAnimation(applicationContext, R.anim.exit_anim);
        view.startAnimation(exit);
    }

    public void doLeftExitAnimation(View view, Context applicationContext) {
        Animation leftExit = AnimationUtils.loadAnimation(applicationContext, R.anim.left_exit);
        view.startAnimation(leftExit);
    }

    public void doRightExitAnimation(View view, Context applicationContext) {
        Animation rightExit = AnimationUtils.loadAnimation(applicationContext, R.anim.right_exit);
        view.startAnimation(rightExit);
    }

    //Transition Animations
    public void rightEnterLeftOut(Activity activity) {
        activity.overridePendingTransition(R.anim.right_enter, R.anim.left_exit);
    }

    public void leftEnterRightOut(Activity activity) {
        activity.overridePendingTransition(R.anim.left_enter, R.anim.right_exit);
    }
}
