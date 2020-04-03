package swu.xl.interpolator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;

import java.sql.NClob;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //平移动画
        final TranslateAnimation translateAnimation = new TranslateAnimation(0, 500, 0, 0);
        translateAnimation.setDuration(2000);

        findViewById(R.id.accelerate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new AccelerateInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.overshoot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new OvershootInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.ac_de_celerate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.anticipate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new AnticipateInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.anti_overshoot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new AnticipateOvershootInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.bounce).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new BounceInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.cycle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new CycleInterpolator(1.5f));

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.decelerate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new DecelerateInterpolator());

                v.startAnimation(translateAnimation);
            }
        });

        findViewById(R.id.linear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation.setInterpolator(new LinearInterpolator());

                v.startAnimation(translateAnimation);
            }
        });
    }
}
