package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f102421a = new l();

    private l() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputMethodManager f102422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f102423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f102424c = 0;

        static {
            Covode.recordClassIndex(65569);
        }

        public a(InputMethodManager inputMethodManager, View view) {
            this.f102422a = inputMethodManager;
            this.f102423b = view;
        }

        public final void run() {
            this.f102422a.showSoftInput(this.f102423b, this.f102424c);
        }
    }

    static {
        Covode.recordClassIndex(65568);
    }

    public static InputMethodManager a(Context context) {
        Object a2 = a(context, "input_method");
        if (!(a2 instanceof InputMethodManager)) {
            a2 = null;
        }
        return (InputMethodManager) a2;
    }

    public static final void a(Activity activity, View view) {
        InputMethodManager a2;
        if (activity != null && view != null && (a2 = a(activity)) != null) {
            a2.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5663);
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
                    MethodCollector.o(5663);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
