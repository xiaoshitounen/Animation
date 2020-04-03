package swu.xl.tween_animation_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        //找到需要动画的控件
        final View view = findViewById(R.id.view);

        //加载Xml东动画文件
        final Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);

        //开始动画
        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation(rotate);
            }
        });
    }
}
