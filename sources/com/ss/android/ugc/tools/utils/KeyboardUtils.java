package com.ss.android.ugc.tools.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class KeyboardUtils {

    /* renamed from: a  reason: collision with root package name */
    public static List<ClearCursorDecorator> f149968a = new ArrayList(2);

    /* renamed from: b  reason: collision with root package name */
    public static List<AndroidBug5497Workaround> f149969b = new ArrayList(2);

    public interface a {
        static {
            Covode.recordClassIndex(98727);
        }
    }

    public static class ClearCursorDecorator implements au {

        /* renamed from: a  reason: collision with root package name */
        public EditText f149973a;

        static {
            Covode.recordClassIndex(98726);
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_DESTROY) {
                onDestroy();
            }
        }

        @v(a = i.a.ON_DESTROY)
        public void onDestroy() {
            this.f149973a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f149968a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f149968a.remove(this);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(98724);
    }

    static class AndroidBug5497Workaround implements au {

        /* renamed from: a  reason: collision with root package name */
        private ViewTreeObserver.OnGlobalLayoutListener f149970a;

        /* renamed from: b  reason: collision with root package name */
        private View f149971b;

        /* renamed from: c  reason: collision with root package name */
        private a f149972c;

        static {
            Covode.recordClassIndex(98725);
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_STOP) {
                onStop();
            }
        }

        @v(a = i.a.ON_STOP)
        public void onStop() {
            Iterator<AndroidBug5497Workaround> it = KeyboardUtils.f149969b.iterator();
            while (true) {
                if (it.hasNext()) {
                    AndroidBug5497Workaround next = it.next();
                    if (next == this) {
                        KeyboardUtils.f149969b.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.f149971b.getViewTreeObserver() != null && this.f149971b.getViewTreeObserver().isAlive()) {
                this.f149971b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f149970a);
            }
            this.f149971b = null;
            this.f149970a = null;
            this.f149972c = null;
        }
    }

    public static void a(View view, Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) a(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void b(View view, Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) a(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static void c(View view, Context context) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) a(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8100);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8100);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
