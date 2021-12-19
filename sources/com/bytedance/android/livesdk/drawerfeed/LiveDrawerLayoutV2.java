package com.bytedance.android.livesdk.drawerfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.customview.a.a;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerDraggableEnable;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public class LiveDrawerLayoutV2 extends DrawerLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17093a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17094b;

    /* renamed from: c  reason: collision with root package name */
    private int f17095c;

    /* renamed from: d  reason: collision with root package name */
    private float f17096d;

    /* renamed from: e  reason: collision with root package name */
    private float f17097e;

    static {
        Covode.recordClassIndex(9494);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f17096d = x;
                this.f17097e = y;
            } else if (action == 2) {
                float f2 = this.f17096d;
                if (x > f2 && !this.f17093a) {
                    return false;
                }
                int abs = (int) Math.abs(x - f2);
                int abs2 = (int) Math.abs(y - this.f17097e);
                int i2 = (abs * abs) + (abs2 * abs2);
                int i3 = this.f17095c;
                if (i2 > i3 * i3 * 2) {
                    if (!this.f17093a && abs < abs2 * 4) {
                        return false;
                    }
                    if (this.f17093a) {
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

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!LiveDrawerDraggableEnable.INSTANCE.getValue() || !LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                if (this.f17094b || isDrawerOpen(8388613)) {
                    return super.onTouchEvent(motionEvent);
                }
                closeDrawer(8388613);
                return false;
            } else if (isDrawerOpen(8388613)) {
                return super.onTouchEvent(motionEvent);
            } else {
                closeDrawer(8388613);
                return false;
            }
        } catch (Exception e2) {
            a.a("LiveDrawerLayoutV2", e2);
            if (motionEvent.getAction() != 1 || !(e2 instanceof IllegalArgumentException)) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setRightEdgePercentage(float f2) {
        if (f2 >= 0.0f && f2 <= 1.0f) {
            try {
                Field declaredField = getClass().getSuperclass().getDeclaredField("mRightCallback");
                declaredField.setAccessible(true);
                a.AbstractC0038a aVar = (a.AbstractC0038a) declaredField.get(this);
                Field declaredField2 = aVar.getClass().getDeclaredField("mPeekRunnable");
                declaredField2.setAccessible(true);
                declaredField2.set(aVar, null);
                Field declaredField3 = getClass().getSuperclass().getDeclaredField("mLeftCallback");
                declaredField3.setAccessible(true);
                a.AbstractC0038a aVar2 = (a.AbstractC0038a) declaredField3.get(this);
                Field declaredField4 = aVar2.getClass().getDeclaredField("mPeekRunnable");
                declaredField4.setAccessible(true);
                declaredField4.set(aVar2, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public LiveDrawerLayoutV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveDrawerLayoutV2(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f17095c = viewConfiguration.getScaledTouchSlop();
        setRightEdgePercentage(0.0f);
        addDrawerListener(new DrawerLayout.c() {
            /* class com.bytedance.android.livesdk.drawerfeed.LiveDrawerLayoutV2.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9495);
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerSlide(View view, float f2) {
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerClosed(View view) {
                LiveDrawerLayoutV2.this.f17093a = false;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerOpened(View view) {
                LiveDrawerLayoutV2.this.f17093a = true;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.c
            public final void onDrawerStateChanged(int i2) {
                if (i2 == 0) {
                    LiveDrawerLayoutV2.this.f17094b = false;
                } else {
                    LiveDrawerLayoutV2.this.f17094b = true;
                }
            }
        });
    }
}
