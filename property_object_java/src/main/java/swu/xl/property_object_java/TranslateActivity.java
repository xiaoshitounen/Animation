package swu.xl.property_object_java;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

public class TranslateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        //x方向平移动画
        final ObjectAnimator translationX = ObjectAnimator.ofFloat(findViewById(R.id.view), "TranslationX", 0f, 100f);
        //设置动画时间
        translationX.setDuration(1000);
        //设置动画重复次数
        translationX.setRepeatCount(1);
        //设置动画重复模式
        translationX.setRepeatMode(ValueAnimator.RESTART);

        //y方向平移动画
        final ObjectAnimator translationY = ObjectAnimator.ofFloat(findViewById(R.id.view), "TranslationY", 0f, 100f);
        //设置动画时间
        translationY.setDuration(1000);
        //设置动画重复次数
        translationY.setRepeatCount(1);
        //设置动画重复模式
        translationY.setRepeatMode(ValueAnimator.RESTART);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开启动画
                translationX.start();
                translationY.start();
            }
        });
    }
}
