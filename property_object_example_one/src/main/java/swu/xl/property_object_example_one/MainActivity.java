package swu.xl.property_object_example_one;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到视图
        View view = findViewById(R.id.view);

        //创建动画
        ObjectAnimator objectAnimator = ObjectAnimator.ofObject(view, "Color", new ColorEvaluator(), "#9999AA", "#EEDDCC");
        //动画时间
        objectAnimator.setDuration(8000);
        //开启动画
        objectAnimator.start();
    }
}
