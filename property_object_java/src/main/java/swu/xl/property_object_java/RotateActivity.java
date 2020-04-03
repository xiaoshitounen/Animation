package swu.xl.property_object_java;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        //将要动画的控件
        final View view = findViewById(R.id.view);

        //获取测量好的坐标
        view.post(new Runnable() {
            @Override
            public void run() {
                //设置旋转的基准点
                view.setPivotX(view.getWidth());
                view.setPivotY(view.getHeight());

                //创建动画
                final ObjectAnimator rotation = ObjectAnimator.ofFloat(view, "Rotation", 0.0f, 90.0f);
                //设置动画时间
                rotation.setDuration(1000);
                //设置重复次数
                rotation.setRepeatCount(1);
                //设置重复模式
                rotation.setRepeatMode(ValueAnimator.RESTART);

                //开启动画
                findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rotation.start();
                    }
                });
            }
        });
    }
}
