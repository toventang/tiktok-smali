package com.ss.android.ugc.aweme.common.f;

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

public final class e {
    static {
        Covode.recordClassIndex(47178);
    }

    public static int a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void b(View view) {
        if (view != null) {
            int i2 = Build.VERSION.SDK_INT;
            view.getLayoutParams().height = a(view.getContext());
        }
    }

    public static void a(final View view) {
        final InputMethodManager inputMethodManager = (InputMethodManager) a(view.getContext(), "input_method");
        if (!inputMethodManager.showSoftInput(view, 0)) {
            view.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.common.f.e.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f76423c = 0;

                static {
                    Covode.recordClassIndex(47179);
                }

                public final void run() {
                    inputMethodManager.showSoftInput(view, this.f76423c);
                }
            }, 100);
        }
    }

    public static void a(Activity activity, View view) {
        if (activity != null) {
            ((InputMethodManager) a(activity, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(777);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
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
                    MethodCollector.o(777);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(630);
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
                    MethodCollector.o(630);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
