package swu.xl.frame_animation_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
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

        //获得控件
        ImageView imageView = findViewById(R.id.frame_image_view);

        //获得AnimationDrawable
        animationDrawable = (AnimationDrawable) imageView.getDrawable();
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
