package com.b.a.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.b.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public final class a extends FrameLayout {
    static {
        Covode.recordClassIndex(2818);
    }

    private static void a() {
        if (b.f5994b != null) {
            b.f5994b.a(new HashMap());
        }
    }

    private static boolean b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void requestLayout() {
        if (!b()) {
            a();
        }
        super.requestLayout();
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(8503);
        MethodCollector.o(8503);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        b.f5994b.b(this, true);
        super.dispatchDraw(canvas);
        b.f5994b.b(this, false);
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (!b()) {
            a();
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(8507);
        b.f5994b.a(this, true);
        super.onLayout(z, i2, i3, i4, i5);
        b.f5994b.a(this, false);
        MethodCollector.o(8507);
    }
}
