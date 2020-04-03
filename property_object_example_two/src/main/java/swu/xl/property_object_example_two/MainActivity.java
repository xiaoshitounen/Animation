package swu.xl.property_object_example_two;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到待包装的类
        View view = findViewById(R.id.btn);
        //包装
        final ViewWrapper viewWrapper = new ViewWrapper(view);

        //点击
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofInt(viewWrapper,"width",300,600).setDuration(3000).start();
            }
        });
   }

    //包装类
    private static class ViewWrapper{
       private View target;

       //设置待包装对象
       public ViewWrapper(View target){
           this.target = target;
       }

       //添加的属性
       public void setWidth(int width){
           //找到待包装类的布局
           ViewGroup.LayoutParams layoutParams = target.getLayoutParams();
           //重新设置宽度
           layoutParams.width = width;
           //重新复制约束
           target.setLayoutParams(layoutParams);
       }
       public int getWidth(){
           return target.getLayoutParams().width;
       }

    }

}
