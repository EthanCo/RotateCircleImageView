package com.heiko.rotatecircleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 旋转的圆形ImageView
 *
 * @author EthanCo
 * @since 2016/12/9
 */

public class RotateCircleImageView extends CircleImageView {
    public static final int DEF_ANIM_DURATION = 1200;
    private SimpleRotateAnim rotateAnim;

    public RotateCircleImageView(Context context) {
        super(context);
        initRotateAnim(DEF_ANIM_DURATION);
    }

    public RotateCircleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RotateCircleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.RotateCircleImageView);
        int animDuration = ta.getInteger(R.styleable.RotateCircleImageView_rotate_duration, DEF_ANIM_DURATION);
        ta.recycle();

        initRotateAnim(animDuration);
    }

    private void initRotateAnim(int animDuration) {
        rotateAnim = new SimpleRotateAnim(this, animDuration);
    }

    //开始/继续 旋转动画
    public void startRotate() {
        rotateAnim.startRotate();
    }

    //暂停旋转动画
    public void pauseRotate() {
        rotateAnim.pauseRotate();
    }

    //开始/继续 旋转动画
    public void reStartRotate() {
        rotateAnim.reStartRotate();
    }

    //取消旋转动画 在Activity销毁的时候需要调用，否则，会造成内存泄漏
    public void cancelRotate() {
        rotateAnim.cancelRotate();
    }

    public void setStartRotate(boolean start) {
        rotateAnim.setStartRotate(start);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelRotate();
    }
}
