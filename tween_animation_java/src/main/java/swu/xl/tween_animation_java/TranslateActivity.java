package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class TranslateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //创建 TranslateAnimation 动画类
        final TranslateAnimation translate = new TranslateAnimation(0,100,0,100);

        //设置动画时间
        translate.setDuration(1000);

        //设置重复次数 重复次数 0 代表 执行一次
        translate.setRepeatCount(1);

        //设置重复模式
        translate.setRepeatMode(Animation.RESTART);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(translate);
            }
        });
    }
}
