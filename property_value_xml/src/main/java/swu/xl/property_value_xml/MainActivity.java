package swu.xl.property_value_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到要处理的控件
        final View view = findViewById(R.id.btn_animation);

        //加载动画文件
        final ValueAnimator valueAnimator = (ValueAnimator)AnimatorInflater.loadAnimator(this, R.animator.value_animator);

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
}
