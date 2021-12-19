package com.google.android.material.snackbar;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f52612j = {R.attr.acw};

    /* renamed from: k  reason: collision with root package name */
    private final AccessibilityManager f52613k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f52614l;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void b() {
        super.b();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void c() {
        super.c();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final boolean d() {
        return super.d();
    }

    static {
        Covode.recordClassIndex(32592);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int a() {
        if (!this.f52614l || !this.f52613k.isTouchExplorationEnabled()) {
            return super.a();
        }
        return -2;
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.d {
        static {
            Covode.recordClassIndex(32593);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3065);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3065);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public Snackbar(ViewGroup viewGroup, View view, a aVar) {
        super(viewGroup, view, aVar);
        this.f52613k = (AccessibilityManager) a(viewGroup.getContext(), "accessibility");
    }
}
