package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.uikit.a.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class BannerSwipeRefreshLayout extends b {

    /* renamed from: m  reason: collision with root package name */
    ViewPager f17219m;
    View n;
    public RecyclerView o;
    private List<RecyclerView> p = new ArrayList();
    private int q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;

    public interface a {
        static {
            Covode.recordClassIndex(9557);
        }
    }

    static {
        Covode.recordClassIndex(9556);
    }

    @Override // com.bytedance.android.live.uikit.a.b
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        try {
            if (!((this.f17219m == null || this.n == null) && this.o == null)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    float x = motionEvent.getX();
                    this.s = x;
                    this.u = x;
                    float y = motionEvent.getY();
                    this.t = y;
                    this.v = y;
                    this.r = false;
                    this.w = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.r) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.w);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x2 - this.u);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.v);
                    ViewPager viewPager = this.f17219m;
                    if (viewPager == null || this.n == null) {
                        RecyclerView recyclerView = this.o;
                        if (recyclerView != null) {
                            if ((x2 - this.u <= 0.0f || recyclerView.getScrollX() != 0) && abs > ((float) this.q) && abs * 0.5f > abs2 && ((float) this.o.getBottom()) > y2) {
                                this.r = true;
                                return false;
                            }
                            int i2 = this.q;
                            if (abs2 < ((float) (i2 + 100))) {
                                return false;
                            }
                            float f4 = this.s;
                            if (x2 - f4 > 0.0f) {
                                f2 = f4 + ((float) i2);
                            } else {
                                f2 = f4 - ((float) i2);
                            }
                            this.u = f2;
                            this.v = y2;
                        }
                    } else {
                        if (x2 - this.u > 0.0f && viewPager.getCurrentItem() == 0) {
                            com.bytedance.android.live.core.c.a.a(4, "onInterceptTouchEvent", "do nothing");
                        } else if (abs > ((float) this.q) && abs * 0.5f > abs2 && ((float) this.n.getBottom()) > y2) {
                            this.r = true;
                            return false;
                        }
                        int i3 = this.q;
                        if (abs2 < ((float) (i3 + 100))) {
                            return false;
                        }
                        float f5 = this.s;
                        if (x2 - f5 > 0.0f) {
                            f3 = f5 + ((float) i3);
                        } else {
                            f3 = f5 - ((float) i3);
                        }
                        this.u = f3;
                        this.v = y2;
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
        this.q = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.r = false;
    }
}
