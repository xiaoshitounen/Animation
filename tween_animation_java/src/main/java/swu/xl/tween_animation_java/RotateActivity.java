package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //创建 RotateAnimation 动画类
        final RotateAnimation rotate = new RotateAnimation(0f,90f,Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,1.0f);

        //设置动画时间
        rotate.setDuration(1000);

        //设置重复次数 重复次数 0 代表 执行一次
        rotate.setRepeatCount(1);

        //设置重复模式
        rotate.setRepeatMode(Animation.RESTART);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(rotate);
            }
        });

    }
}
