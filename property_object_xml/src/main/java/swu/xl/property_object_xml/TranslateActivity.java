package swu.xl.property_object_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

public class TranslateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        //找到动画视图
        View view = findViewById(R.id.view);

        //加载动画
        final ObjectAnimator translateX = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.translatex_animator);
        final ObjectAnimator translateY = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.translatey_animator);

        //设置动画对象
        translateX.setTarget(view);
        translateY.setTarget(view);

        //开启动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateX.start();
                translateY.start();
            }
        });
    }
}
