package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class BannerSwipeRefreshLayout extends SwipeRefreshLayout {
    private View n;
    private int o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private int t;

    static {
        Covode.recordClassIndex(51614);
    }

    public void setHeader(View view) {
        this.n = view;
    }

    public BannerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        try {
            if (this.n != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    float x = motionEvent.getX();
                    this.q = x;
                    this.r = x;
                    this.s = motionEvent.getY();
                    this.p = false;
                    this.t = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.p) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.t);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x2 - this.r);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.s);
                    if (abs <= ((float) this.o) || abs * 0.5f <= abs2 || ((float) this.n.getBottom()) <= y) {
                        if (x2 - this.r > 0.0f) {
                            f2 = this.q + ((float) this.o);
                        } else {
                            f2 = this.q - ((float) this.o);
                        }
                        this.r = f2;
                        this.s = y;
                    } else {
                        this.p = true;
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.p = false;
        setDoNotCatchException(true);
    }
}
