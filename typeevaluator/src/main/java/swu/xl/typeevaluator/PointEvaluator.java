package swu.xl.typeevaluator;

import android.animation.TypeEvaluator;


public class PointEvaluator implements TypeEvaluator {

    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        //将动画的初始值和结束值强制转化为Point
        Point startPoint = (Point) startValue;
        Point endPoint = (Point) endValue;

        //根据fraction计算当前点的x和y

        float x = startPoint.getX() + fraction * (endPoint.getX() - startPoint.getX());
        float y = startPoint.getY() + fraction * (endPoint.getY() - startPoint.getY());

        //封装成对象返回
        return new Point(x,y);
    }
}
