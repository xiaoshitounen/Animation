package swu.xl.view_property_animator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到需要动画的控件
        Button button = findViewById(R.id.Button);

        //简便动画
        button.animate().alpha(0.5f).setDuration(1000);
    }
}
