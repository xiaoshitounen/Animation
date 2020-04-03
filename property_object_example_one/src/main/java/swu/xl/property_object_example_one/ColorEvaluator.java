package swu.xl.property_object_example_one;

import android.animation.TypeEvaluator;

public class ColorEvaluator implements TypeEvaluator {

    //当前的RGB
    private int currentRed;
    private int currentGreen;
    private int currentBlue;

    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        //获取颜色开始值和结束值
        String startColor = (String) startValue;
        String endColor = (String) endValue;

        //通过字符串截取的方式将初始颜色分为RGB三个部分
        int startRed = Integer.parseInt(startColor.substring(1,3),16);
        int startGreen = Integer.parseInt(startColor.substring(3,5),16);
        int startBlue = Integer.parseInt(startColor.substring(5,7),16);

        //通过字符串截取的方式将结束颜色分为RGB三个部分
        int endRed = Integer.parseInt(endColor.substring(1,3),16);
        int endGreen = Integer.parseInt(endColor.substring(3,5),16);
        int endBlue = Integer.parseInt(endColor.substring(5,7),16);

        //计算RGB三部分的差值
        int redDiff = Math.abs(startRed-endRed);
        int greenDiff = Math.abs(startGreen-endGreen);
        int blueDiff = Math.abs(startBlue-endBlue);
        int colorDiff = redDiff + greenDiff + blueDiff;

        //计算RGB三部分当前的值
        if (currentRed != endRed){
            currentRed = getCurrentColor(startRed,endRed,colorDiff,0,fraction);
        }
        if (currentGreen != endGreen){
            currentGreen = getCurrentColor(startGreen,endGreen,colorDiff,redDiff,fraction);
        }
        if (currentBlue != endBlue){
            currentBlue = getCurrentColor(startBlue,endBlue,colorDiff,redDiff+greenDiff,fraction);
        }

        //计算当前RGB三部分的组装值 返回
        return "#" + getHexString(currentRed) + getHexString(currentGreen) + getHexString(currentBlue);
    }

    /**
     * 根据 fraction 计算 RGB 某部分的值
     * @param startColor
     * @param endColor
     * @param colorDiff
     * @param fraction
     * @return
     */
    public int getCurrentColor(int startColor,int endColor,int colorDiff,int offset,float fraction){
        //存储新的值
        int currentColor;

        //判断是增加还是减少
        if (startColor >= endColor){
            currentColor = (int) (startColor - (fraction * colorDiff - offset));
        }else {
            currentColor = (int) (startColor + (fraction * colorDiff - offset));
        }

        return currentColor;
    }

    /**
     * 10进制->16进制
     * @param value
     * @return
     */
    private String getHexString(int value){
        //转化为16进制
        String hexString = Integer.toHexString(value);

        //如果只有一位，需要补0
        if (hexString.length() == 1){
            hexString = "0" + hexString;
        }

        return hexString;
    }
}
