package swu.xl.tween_animation_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class SetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //加载Xml东动画文件
        final Animation scale = AnimationUtils.loadAnimation(this, R.anim.set_animation);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(scale);
            }
        });
    }
}
