package swu.xl.property_object_set;

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
     * java的方式
     * @param view
     */
    public void setOfJava(View view) {
        startActivity(new Intent(this,Animation_java_Activity.class));
    }

    /**
     * xml的方式
     * @param view
     */
    public void setOfXml(View view) {
        startActivity(new Intent(this,Animation_xml_Activity.class));
    }
}
