package swu.xl.typeevaluator;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    //圆的半径
    public static final float RADIUS = 70f;

    //当前点的坐标
    private Point currentPoint;

    //绘图画笔
    private Paint paint;

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        //初始化画笔
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        //设置画笔颜色
        paint.setColor(Color.MAGENTA);
    }

    //重绘
    @Override
    protected void onDraw(Canvas canvas) {
        //判断当前点是否为空（即是否是第一次）
        if (currentPoint == null){
            //初始化点
            currentPoint = new Point(RADIUS,RADIUS);

            //画圆 以(RADIUS,RADIUS)为圆心，RADIUS为半径画圆
            canvas.drawCircle(currentPoint.getX(),currentPoint.getY(),RADIUS,paint);

            //动画开始的点和动画结束的点
            Point startPoint = new Point(RADIUS,RADIUS);
            Point endPoint = new Point(700,700);

            //创建动画
            ValueAnimator valueAnimator = ValueAnimator.ofObject(new PointEvaluator(),startPoint,endPoint);

            //设置动画开始的时间
            valueAnimator.setDuration(8000);

            //监听更新，手动赋值
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator animation) {
                    //将更新的值传入变量存储
                    currentPoint = (Point) animation.getAnimatedValue();

                    //刷新界面 进入else部分重绘
                    invalidate();
                }
            });

            //开启动画
            //valueAnimator.start();
            //valueAnimator.end();
            //valueAnimator.cancel();

            //valueAnimator.pause();
            //valueAnimator.resume();
        }else {
            //重绘
            canvas.drawCircle(currentPoint.getX(),currentPoint.getY(),RADIUS,paint);
        }
    }
}
