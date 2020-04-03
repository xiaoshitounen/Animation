package swu.xl.property_value_java;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到要处理的控件
        final View view = findViewById(R.id.btn_animation);

        view.post(new Runnable() {
            @Override
            public void run() {
                //创建ValueAnimator动画 设置值的变化范围
                final ValueAnimator valueAnimator = ValueAnimator.ofInt(view.getWidth(), 500);

                //动画持续的时间
                valueAnimator.setDuration(1000);

                //动画的重复次数
                valueAnimator.setRepeatCount(1);

                //动画的延迟时间
                valueAnimator.setStartDelay(1000);

                //动画的重复模式
                valueAnimator.setRepeatMode(ValueAnimator.RESTART);

                //设置更新监听器，数值每次变化更新都会调用该方法
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        //获得当前应该设置的值
                        int currentValue = (int) animation.getAnimatedValue();

                        //将属性数值手动赋值给对象的属性（重新设置参数）
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.width = currentValue;
                        view.setLayoutParams(layoutParams);
                    }
                });

                //开启动画
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        valueAnimator.start();
                    }
                });
            }
        });
    }
}
