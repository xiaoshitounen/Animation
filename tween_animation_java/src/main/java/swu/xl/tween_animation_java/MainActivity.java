package swu.xl.tween_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 平移
     * @param view
     */
    public void TranslateAnimation(View view) {
        startActivity(new Intent(this, TranslateActivity.class));
    }

    /**
     * 缩放
     * @param view
     */
    public void ScaleAnimation(View view) {
        startActivity(new Intent(this, ScaleActivity.class));
    }

    /**
     * 旋转
     * @param view
     */
    public void RotateAnimation(View view) {
        startActivity(new Intent(this, RotateActivity.class));
    }

    /**
     * 淡入浅出
     * @param view
     */
    public void AlphaAnimation(View view) {
        startActivity(new Intent(this, AlphaActivity.class));
    }

    /**
     * 动画组合
     * @param view
     */
    public void AnimationSet(View view) {
        startActivity(new Intent(this, SetActivity.class));
    }
}
