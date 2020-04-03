package swu.xl.property_object_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        //将要动画的控件
        final View view = findViewById(R.id.view);

        //加载动画 旋转动画
        final ObjectAnimator rotate = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.rotate_animation);
        rotate.setTarget(view);

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
                        rotate.start();
                    }
                });
            }
        });
    }
}
