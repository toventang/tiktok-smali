package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.a;

public class NestedScrollingRecyclerView extends a {
    private int O;
    private int P;
    private int Q;
    private int R;

    static {
        Covode.recordClassIndex(47250);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i2) {
        super.setScrollingTouchSlop(i2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0) {
            this.R = viewConfiguration.getScaledTouchSlop();
        } else if (i2 == 1) {
            this.R = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.O = motionEvent.getPointerId(0);
            this.P = (int) (motionEvent.getX() + 0.5f);
            this.Q = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.O);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i2 = x - this.P;
            int i3 = y - this.Q;
            boolean f2 = getLayoutManager().f();
            boolean g2 = getLayoutManager().g();
            if (!f2 || Math.abs(i2) <= this.R) {
                z = false;
            } else {
                if (Math.abs(i2) >= Math.abs(i3) || g2) {
                    z = true;
                }
                return false;
            }
            if (((!g2 || Math.abs(i3) <= this.R || (Math.abs(i3) < Math.abs(i2) && !f2)) && !z) || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.O = motionEvent.getPointerId(actionIndex);
            this.P = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.Q = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NestedScrollingRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        this.O = -1;
        this.R = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addOnAttachStateChangeListener(new f());
    }
}
