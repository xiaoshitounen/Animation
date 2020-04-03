package swu.xl.property_object_java;

import androidx.appcompat.app.AppCompatActivity;

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

        //获取测量好的坐标
        view.post(new Runnable() {
            @Override
            public void run() {
                //设置缩放的基准点
                view.setPivotX(view.getWidth());
                view.setPivotY(view.getHeight());

                //创建动画 x方向的缩放大小
                final ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "ScaleX", 1.0f, 1.5f);
                //设置动画时间
                scaleX.setDuration(1000);
                //设置重复次数
                scaleX.setRepeatCount(1);
                //设置重复模式
                scaleX.setRepeatMode(ValueAnimator.RESTART);

                //创建动画 y方向的缩放大小
                final ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "ScaleY", 1.0f, 1.5f);
                //设置动画时间
                scaleY.setDuration(1000);
                //设置重复次数
                scaleY.setRepeatCount(1);
                //设置重复模式
                scaleY.setRepeatMode(ValueAnimator.RESTART);

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
