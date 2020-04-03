package swu.xl.property_object_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        //将要动画的控件
        final View view = findViewById(R.id.view);

        //创建动画 x方向的缩放大小
        final ObjectAnimator scaleX = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.scalex_animator);
        scaleX.setTarget(view);

        //创建动画 y方向的缩放大小
        final ObjectAnimator scaleY = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.scaley_animator);
        scaleY.setTarget(view);

        //获取测量好的坐标
        view.post(new Runnable() {
            @Override
            public void run() {
                //设置缩放的基准点
                view.setPivotX(view.getWidth());
                view.setPivotY(view.getHeight());

                //开启动画
                findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        scaleX.start();
                        scaleY.start();
                    }
                });
            }
        });
    }
}
