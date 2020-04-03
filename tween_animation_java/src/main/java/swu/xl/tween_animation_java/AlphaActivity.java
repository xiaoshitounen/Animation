package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

public class AlphaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //创建 AlphaAnimation 动画类
        final AlphaAnimation alpha = new AlphaAnimation(1.0f,0.5f);

        //设置动画时间
        alpha.setDuration(1000);

        //设置重复次数 重复次数 0 代表 执行一次
        alpha.setRepeatCount(1);

        //设置重复模式
        alpha.setRepeatMode(Animation.RESTART);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(alpha);
            }
        });

    }
}
