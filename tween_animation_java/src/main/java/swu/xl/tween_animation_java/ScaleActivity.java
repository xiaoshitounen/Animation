package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //创建 ScaleAnimation 动画类
        final ScaleAnimation scale = new ScaleAnimation(1.0f,1.5f,1.0f,1.5f,Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,1.0f);

        //设置动画时间
        scale.setDuration(1000);

        //设置重复次数 重复次数 0 代表 执行一次
        scale.setRepeatCount(1);

        //设置重复模式
        scale.setRepeatMode(Animation.RESTART);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(scale);
            }
        });
    }
}
