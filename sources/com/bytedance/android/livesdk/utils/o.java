package com.bytedance.android.livesdk.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class o {
    static {
        Covode.recordClassIndex(13193);
    }

    public static void a(Context context, EditText editText) {
        InputMethodManager inputMethodManager;
        if (context != null && editText != null && (inputMethodManager = (InputMethodManager) a(context, "input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    public static void b(Context context, EditText editText) {
        InputMethodManager inputMethodManager;
        if (context != null && (inputMethodManager = (InputMethodManager) a(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13084);
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
                    MethodCollector.o(13084);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
