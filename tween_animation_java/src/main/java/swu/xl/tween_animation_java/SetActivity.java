package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

public class SetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //创建 组合动画类
        final AnimationSet animationSet = new AnimationSet(true);

        //设置动画集合的相关属性
        animationSet.setFillBefore(false);
        animationSet.setFillAfter(false);

        //缩放动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 2.0f, 0.5f, 2.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(3000);
        scaleAnimation.setFillEnabled(false);

        //旋转动画
        RotateAnimation rotateAnimation = new RotateAnimation(45, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setStartOffset(3000);

        //将子动画添加到动画集合中
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(animationSet);
            }
        });
    }
}
