package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class eu {
    static {
        Covode.recordClassIndex(84226);
    }

    public static void a(Activity activity) {
        if (activity != null) {
            a(activity.getWindow());
        }
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
        InputMethodManager inputMethodManager;
        if (activity != null && activity.getCurrentFocus() != null && (inputMethodManager = (InputMethodManager) a(activity, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static void a(Dialog dialog) {
        if (dialog != null) {
            a(dialog.getWindow());
        }
    }

    public static void c(Activity activity) {
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

    private static void a(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i2 = Build.VERSION.SDK_INT;
            window.getDecorView().setSystemUiVisibility(4102);
        }
    }

    public static void b(View view, int i2) {
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(7440);
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
                    MethodCollector.o(7440);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    public static void a(View view, int i2) {
        if (view != null && view.getVisibility() != i2) {
            if (i2 == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i2);
        }
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence)) {
                textView.setText(charSequence);
            }
        }
    }
}
