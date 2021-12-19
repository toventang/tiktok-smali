package com.bytedance.android.livesdk.drawerfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;

public class LiveDrawerLayout extends DrawerLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17086a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17087b;

    /* renamed from: c  reason: collision with root package name */
    private int f17088c;

    /* renamed from: d  reason: collision with root package name */
    private int f17089d;

    /* renamed from: e  reason: collision with root package name */
    private float f17090e;

    /* renamed from: f  reason: collision with root package name */
    private float f17091f;

    static {
        Covode.recordClassIndex(9492);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f17090e = x;
                this.f17091f = y;
            } else if (action == 2) {
                float f2 = this.f17090e;
                if (x > f2 && !this.f17086a) {
                    return false;
                }
                int abs = (int) Math.abs(x - f2);
                int abs2 = (int) Math.abs(y - this.f17091f);
                int i2 = (abs * abs) + (abs2 * abs2);
                int i3 = this.f17089d;
                if (i2 > i3 * i3) {
                    if (!this.f17086a && abs < abs2 * 4) {
                        return false;
                    }
                    if (this.f17086a) {
                        if (abs > abs2 * 4) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public LiveDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveDrawerLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f17089d = viewConfiguration.getScaledTouchSlop();
        this.f17088c = (int) ((f2 * 20.0f) + 0.5f);
        addDrawerListener(new DrawerLayout.c() {
            /* class com.bytedance.android.livesdk.drawerfeed.LiveDrawerLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9493);
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerOpened(View view) {
                LiveDrawerLayout.this.f17086a = true;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerStateChanged(int i2) {
                if (i2 == 0) {
                    LiveDrawerLayout.this.f17087b = false;
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerClosed(View view) {
                LiveDrawerLayout.this.f17086a = false;
                LiveDrawerLayout.this.f17087b = false;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerSlide(View view, float f2) {
                LiveDrawerLayout.this.f17087b = true;
            }
        });
    }
}
