package swu.xl.property_object_xml;

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
    public void translate(View view) {
        startActivity(new Intent(this,TranslateActivity.class));
    }

    /**
     * 缩放
     * @param view
     */
    public void scale(View view) {
        startActivity(new Intent(this,ScaleActivity.class));
    }

    /**
     * 旋转
     * @param view
     */
    public void rotate(View view) {
        startActivity(new Intent(this,RotateActivity.class));
    }

    /**
     * 透明度
     * @param view
     */
    public void alpha(View view) {
        startActivity(new Intent(this,AlphaActivity.class));
    }
}
