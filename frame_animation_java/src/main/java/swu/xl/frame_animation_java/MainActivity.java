package swu.xl.frame_animation_java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //全局化
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建AnimationDrawable
        animationDrawable = new AnimationDrawable();
        //animationDrawable.setOneShot(true);

        //添加每一帧的动画
        int[] resID = {R.drawable.campfire01,R.drawable.campfire02,
                R.drawable.campfire03, R.drawable.campfire04,
                R.drawable.campfire05,R.drawable.campfire06,
                R.drawable.campfire07,R.drawable.campfire08,
                R.drawable.campfire09,R.drawable.campfire10,
                R.drawable.campfire11,R.drawable.campfire12,
                R.drawable.campfire13,R.drawable.campfire14,
                R.drawable.campfire15,R.drawable.campfire16,
                R.drawable.campfire17};
        for (int i = 0; i < resID.length; i++) {
            animationDrawable.addFrame(getResources().getDrawable(resID[i],null),100);
        }

        //找到控件
        ImageView imageView = findViewById(R.id.frame_image_view);
        imageView.setImageDrawable(animationDrawable);
    }

    /**
     * 开启逐帧动画
     * @param view
     */
    public void start_frame_animation(View view) {
        animationDrawable.start();
    }

    /**
     * 停止逐帧动画
     * @param view
     */
    public void stop_frame_animation(View view) {
        animationDrawable.stop();
    }
}
