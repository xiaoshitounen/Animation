package swu.xl.property_object_example_one;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    //圆的半径
    public static final float RADIUS = 100f;
    //画笔
    private Paint paint;
    //圆的背景颜色
    private String color;

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        //初始化画笔 并赋予默认颜色
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
    }

    /**
     * 重绘
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(500,500,RADIUS,paint);
    }

    //setter getter 方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

        //设置画笔颜色
        paint.setColor(Color.parseColor(color));

        //刷新 重绘
        invalidate();
    }
}
