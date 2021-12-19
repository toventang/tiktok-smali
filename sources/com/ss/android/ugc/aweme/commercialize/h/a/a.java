package com.ss.android.ugc.aweme.commercialize.h.a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.commercialize.depend.t;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74444a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45918);
    }

    private static InputMethodManager b(Context context) {
        Object a2 = a(context, "input_method");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) a2;
    }

    public static final void a(Context context) {
        Context context2;
        Window window;
        View decorView;
        View view = null;
        if (!(context instanceof Activity)) {
            context2 = null;
        } else {
            context2 = context;
        }
        Activity activity = (Activity) context2;
        if (!(activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            view = decorView.findFocus();
        }
        if (context != null && view != null) {
            try {
                b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            view.clearFocus();
        }
    }

    public static final void a(Context context, View view) {
        if (context != null && view != null) {
            try {
                view.requestFocus();
                b(context).showSoftInput(view, 2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11786);
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
                    MethodCollector.o(11786);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final void a(Context context, boolean z) {
        int i2;
        t a2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (a2 != null) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                i2 = activity.hashCode();
            } else {
                i2 = 0;
            }
            a2.a(i2, z);
        }
    }
}
