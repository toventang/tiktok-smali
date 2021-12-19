package com.ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.c.a;
import java.util.WeakHashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<View, Long> f68439a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static View.OnTouchListener f68440b = q.f68445a;

    static {
        Covode.recordClassIndex(42141);
    }

    public static boolean a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static Activity a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    public static Activity d(View view) {
        if (view != null) {
            for (Context context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        return null;
    }

    public static Rect c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    private static boolean e(View view) {
        if (view != null && v.y(view)) {
            while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
                if (view.getId() == 16908290) {
                    return true;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
        }
        return false;
    }

    public static boolean b(View view) {
        Rect rect = new Rect();
        if (!e(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void a(Activity activity) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT < 21) {
            int i2 = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
        } else if (window.getStatusBarColor() != 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    public static Drawable a(int i2, float f2) {
        return a(i2, new float[]{f2, f2, f2, f2});
    }

    public static void b(boolean z, View... viewArr) {
        int i2;
        for (View view : viewArr) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a(view, i2);
        }
    }

    private static Drawable a(int i2, float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]};
        AnonymousClass1 r0 = new GradientDrawable() {
            /* class com.ss.android.ugc.aweme.base.utils.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42142);
            }

            public final int getOpacity() {
                return -3;
            }
        };
        r0.setColor(i2);
        r0.setCornerRadii(fArr2);
        return r0;
    }

    public static void a(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        a.a(activity, i2);
    }

    public static void a(View view, int i2) {
        if (view != null && view.getVisibility() != i2) {
            if (i2 == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i2);
        }
    }

    public static void a(boolean z, View... viewArr) {
        int i2;
        for (View view : viewArr) {
            if (view != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }
}
