package com.ss.avframework.livestreamv2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class DragSurfaceView extends SurfaceView implements View.OnTouchListener {
    private int lastX;
    private int lastY;
    private Activity mActivity;
    private boolean mDragable;
    private boolean mIsFirstTouch = true;
    private boolean mIsScale;
    private onUpdataLocationListener mLocationListener;
    int offset = 20;
    private int oriBottom;
    private int oriLeft;
    private int oriRight;
    private int oriTop;
    private int screenHeight;
    private int screenWidth;
    private int viewOrigHeight;
    private int viewOrigWidth;

    public interface onUpdataLocationListener {
        static {
            Covode.recordClassIndex(99854);
        }

        void onUpdateLocation(float f2, float f3, float f4, float f5);
    }

    static {
        Covode.recordClassIndex(99852);
    }

    private void initView() {
        setFocusable(true);
        setLongClickable(true);
        setClickable(true);
        super.setOnTouchListener(this);
    }

    private int getTitleTopHeight() {
        Rect rect = new Rect();
        Activity activity = (Activity) getContext();
        this.mActivity = activity;
        try {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private ViewGroup.LayoutParams getNewLayoutParams() {
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.leftMargin = this.oriLeft;
            layoutParams.topMargin = this.oriTop;
            layoutParams.width = this.oriRight - this.oriLeft;
            layoutParams.height = this.oriBottom - this.oriTop;
            return layoutParams;
        } else if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return null;
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.leftMargin = this.oriLeft;
            layoutParams2.topMargin = this.oriTop;
            layoutParams2.width = this.oriRight - this.oriLeft;
            layoutParams2.height = this.oriBottom - this.oriTop;
            return layoutParams2;
        }
    }

    public void setDragable(boolean z) {
        this.mDragable = z;
    }

    public void setUpdateLocationListener(onUpdataLocationListener onupdatalocationlistener) {
        this.mLocationListener = onupdatalocationlistener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new DragSurfaceView$$Lambda$0(this, onTouchListener));
    }

    public DragSurfaceView(Context context) {
        super(context);
        MethodCollector.i(14377);
        initView();
        MethodCollector.o(14377);
    }

    private boolean onTouchInternal(View view, MotionEvent motionEvent) {
        return onTouch(view, motionEvent);
    }

    public DragSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(14378);
        initView();
        MethodCollector.o(14378);
    }

    private void scaleView(View view, int i2) {
        int i3 = (this.viewOrigHeight * i2) / this.viewOrigWidth;
        int i4 = this.oriRight + i2;
        this.oriRight = i4;
        int i5 = this.oriBottom + i3;
        this.oriBottom = i5;
        int i6 = this.screenWidth;
        int i7 = this.offset;
        if (i4 > i6 - i7 || i5 > this.screenHeight - i7 || (i4 - this.oriLeft) - (i7 * 2) < 200 || (i5 - this.oriTop) - (i7 * 2) < 200) {
            this.oriRight = i4 - i2;
            this.oriBottom = i5 - i3;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mIsFirstTouch) {
            this.viewOrigHeight = view.getHeight();
            this.viewOrigWidth = view.getWidth();
            this.screenHeight = (getResources().getDisplayMetrics().heightPixels - 40) - getTitleTopHeight();
            this.screenWidth = getResources().getDisplayMetrics().widthPixels;
            this.mIsFirstTouch = false;
        }
        if (!this.mDragable) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oriLeft = view.getLeft();
            this.oriRight = view.getRight();
            this.oriTop = view.getTop();
            this.oriBottom = view.getBottom();
            this.lastY = (int) motionEvent.getRawY();
            this.lastX = (int) motionEvent.getRawX();
            this.mIsScale = isScale(view, (int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (action == 2) {
            int rawX = ((int) motionEvent.getRawX()) - this.lastX;
            int rawY = ((int) motionEvent.getRawY()) - this.lastY;
            if (this.mIsScale) {
                scaleView(view, rawX);
            } else {
                moveView(view, rawX, rawY);
            }
            view.layout(this.oriLeft, this.oriTop, this.oriRight, this.oriBottom);
            this.lastX = (int) motionEvent.getRawX();
            this.lastY = (int) motionEvent.getRawY();
            onUpdataLocationListener onupdatalocationlistener = this.mLocationListener;
            if (onupdatalocationlistener != null) {
                int i2 = this.screenWidth;
                int i3 = this.screenHeight;
                onupdatalocationlistener.onUpdateLocation((((float) this.oriLeft) * 1.0f) / ((float) i2), (((float) this.oriRight) * 1.0f) / ((float) i2), (((float) this.oriTop) * 1.0f) / ((float) i3), (((float) this.oriBottom) * 1.0f) / ((float) i3));
            }
        } else if (action == 1) {
            ViewGroup.LayoutParams newLayoutParams = getNewLayoutParams();
            if (newLayoutParams != null) {
                view.setLayoutParams(newLayoutParams);
            }
            this.mIsScale = false;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean lambda$setOnTouchListener$0$DragSurfaceView(View.OnTouchListener onTouchListener, View view, MotionEvent motionEvent) {
        boolean onTouch = onTouchListener.onTouch(view, motionEvent);
        onTouchInternal(view, motionEvent);
        return onTouch;
    }

    private boolean isScale(View view, int i2, int i3) {
        int left = view.getLeft();
        int right = view.getRight();
        int bottom = view.getBottom();
        int top = view.getTop();
        if ((right - left) - i2 >= 80 || (bottom - top) - i3 >= 80) {
            return false;
        }
        return true;
    }

    private void moveView(View view, int i2, int i3) {
        int i4 = this.oriLeft;
        int i5 = i4 + i2;
        int i6 = this.offset;
        if (i5 > i6) {
            int i7 = this.oriRight;
            if (i7 + i2 < this.screenWidth - i6) {
                this.oriLeft = i4 + i2;
                this.oriRight = i7 + i2;
            }
        }
        int i8 = this.oriTop;
        if (i8 + i3 > i6) {
            int i9 = this.oriBottom;
            if (i9 + i3 < this.screenHeight - i6) {
                this.oriTop = i8 + i3;
                this.oriBottom = i9 + i3;
            }
        }
    }

    public DragSurfaceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(14379);
        initView();
        MethodCollector.o(14379);
    }
}
