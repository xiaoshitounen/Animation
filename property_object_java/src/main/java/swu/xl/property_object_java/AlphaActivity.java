package swu.xl.property_object_java;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

public class AlphaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);

        //透明度动画
        final ObjectAnimator alpha = ObjectAnimator.ofFloat(findViewById(R.id.view), "Alpha", 1.0f, 0.5f);
        //设置动画时间
        alpha.setDuration(1000);
        //设置动画重复次数
        alpha.setRepeatCount(1);
        //设置动画重复模式
        alpha.setRepeatMode(ValueAnimator.RESTART);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开启动画
                alpha.start();
            }
        });
    }
}
