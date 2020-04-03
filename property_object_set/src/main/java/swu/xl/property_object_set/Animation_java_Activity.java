package swu.xl.property_object_set;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animation_java_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_java_);

        //找到需要动画的控件
        Button button = findViewById(R.id.btn);

        //动画组合类
        final AnimatorSet animatorSet = new AnimatorSet();

        //平移动画
        ObjectAnimator translationX = ObjectAnimator.ofFloat(button, "TranslationX", 0.0f, 200.0f);
        translationX.setDuration(2000);

        //旋转动画
        ObjectAnimator rotation = ObjectAnimator.ofFloat(button, "Rotation", 0.0f, 360.0f);
        rotation.setDuration(3000);

        //透明动画
        ObjectAnimator alpha = ObjectAnimator.ofFloat(button, "Alpha", 1.0f, 0.5f);
        alpha.setDuration(2000);

        //组合动画
        animatorSet.play(translationX).with(rotation).before(alpha);

        //触发动画
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animatorSet.start();
            }
        });
    }
}
