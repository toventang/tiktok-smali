package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.b.a;
import androidx.core.h.e;
import androidx.core.h.v;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerDraggableEnable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

public class FullDraggableContainer extends FrameLayout implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f17220a;

    /* renamed from: b  reason: collision with root package name */
    private DrawerLayout f17221b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17222c;

    static {
        Covode.recordClassIndex(9559);
    }

    public View getDrawerMainContainer() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final void b() {
        DrawerLayout drawerLayout = this.f17221b;
        if (drawerLayout != null) {
            drawerLayout.closeDrawer(8388613, true);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final void c() {
        List<DrawerLayout.c> drawerListeners = getDrawerListeners();
        if (drawerListeners != null) {
            for (int size = drawerListeners.size() - 1; size >= 0; size--) {
                drawerListeners.get(size).onDrawerStateChanged(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<DrawerLayout.c> getDrawerListeners() {
        try {
            Field declaredField = DrawerLayout.class.getDeclaredField("mListeners");
            declaredField.setAccessible(true);
            return (List) declaredField.get(this.f17221b);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final void a() {
        if (this.f17221b != null) {
            b.a.a("livesdk_explore_click").a().a("ops_type", "draw").b();
            this.f17221b.openDrawer(8388613, true);
        }
    }

    public void setDrawerLayout(DrawerLayout drawerLayout) {
        this.f17221b = drawerLayout;
    }

    public void setClearScreen(boolean z) {
        this.f17220a.f17491m = z;
    }

    public void setDrawerEnable(boolean z) {
        this.f17222c = !z;
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final boolean a(int i2) {
        DrawerLayout drawerLayout = this.f17221b;
        if (drawerLayout == null) {
            return false;
        }
        return drawerLayout.isDrawerOpen(i2);
    }

    private int a(View view) {
        if (this.f17221b == null) {
            return 0;
        }
        return e.a(((DrawerLayout.d) view.getLayoutParams()).f2691a, v.e(this.f17221b));
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final boolean b(int i2) {
        DrawerLayout drawerLayout = this.f17221b;
        if (drawerLayout == null || drawerLayout.getDrawerLockMode(i2) != 0 || c(i2) == null) {
            return false;
        }
        return true;
    }

    private View c(int i2) {
        DrawerLayout drawerLayout = this.f17221b;
        if (drawerLayout == null) {
            return null;
        }
        int a2 = e.a(i2, v.e(drawerLayout)) & 7;
        int childCount = this.f17221b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f17221b.getChildAt(i3);
            if ((a(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.feed.g.a
    public final void a(float f2) {
        if (this.f17221b != null) {
            View c2 = c(8388613);
            float a2 = a.a(f2 / ((float) ((View) Objects.requireNonNull(c2)).getWidth()), 0.0f, 1.0f);
            try {
                Method declaredMethod = DrawerLayout.class.getDeclaredMethod("moveDrawerToOffset", View.class, Float.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f17221b, c2, Float.valueOf(a2));
                c2.setVisibility(0);
                this.f17221b.invalidate();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!LiveDrawerDraggableEnable.INSTANCE.getValue() || this.f17222c || !LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        g gVar = this.f17220a;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            gVar.f17481c = x;
            gVar.f17483e = x;
            gVar.f17482d = y;
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            gVar.f17483e = x;
            float f2 = x - gVar.f17481c;
            float f3 = y - gVar.f17482d;
            if ((!gVar.f17480b || f2 <= 0.0f) && (gVar.f17480b || f2 >= 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            if (Math.abs(f2) <= ((float) (gVar.f17484f * 2)) || Math.abs(f2) <= Math.abs(f3) || !gVar.a(f2) || !z || gVar.f17491m) {
                return false;
            }
            double abs = (double) Math.abs(f2);
            double abs2 = (double) Math.abs(f3);
            double sqrt = Math.sqrt(3.0d);
            Double.isNaN(abs2);
            if (abs > abs2 * sqrt) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r3 != 3) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.FullDraggableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FullDraggableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private FullDraggableContainer(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9193);
        this.f17220a = new g(context, this);
        MethodCollector.o(9193);
    }
}
