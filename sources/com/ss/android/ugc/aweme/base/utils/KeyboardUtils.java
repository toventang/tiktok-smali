package com.ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class KeyboardUtils {

    /* renamed from: a  reason: collision with root package name */
    public static List<ClearCursorDecorator> f68417a = new ArrayList(2);

    /* renamed from: b  reason: collision with root package name */
    public static List<AndroidBug5497Workaround> f68418b = new ArrayList(2);

    /* renamed from: c  reason: collision with root package name */
    private static final int f68419c = n.a(73.0d);

    public interface a {
        static {
            Covode.recordClassIndex(42123);
        }

        void b();

        void c();
    }

    public static class ClearCursorDecorator implements au {

        /* renamed from: a  reason: collision with root package name */
        public EditText f68423a;

        static {
            Covode.recordClassIndex(42122);
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_DESTROY) {
                onDestroy();
            }
        }

        @v(a = i.a.ON_DESTROY)
        public void onDestroy() {
            this.f68423a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f68417a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f68417a.remove(this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class AndroidBug5497Workaround implements au {

        /* renamed from: a  reason: collision with root package name */
        View f68420a;

        /* renamed from: b  reason: collision with root package name */
        a f68421b;

        /* renamed from: c  reason: collision with root package name */
        private ViewTreeObserver.OnGlobalLayoutListener f68422c;

        static {
            Covode.recordClassIndex(42121);
        }

        @Override // androidx.lifecycle.k
        public void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_STOP) {
                onStop();
            }
        }

        @v(a = i.a.ON_STOP)
        public void onStop() {
            Iterator<AndroidBug5497Workaround> it = KeyboardUtils.f68418b.iterator();
            while (true) {
                if (it.hasNext()) {
                    AndroidBug5497Workaround next = it.next();
                    if (next == this) {
                        KeyboardUtils.f68418b.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            View view = this.f68420a;
            if (!(view == null || view.getViewTreeObserver() == null || !this.f68420a.getViewTreeObserver().isAlive())) {
                this.f68420a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f68422c);
            }
            this.f68420a = null;
            this.f68422c = null;
            this.f68421b = null;
        }

        private AndroidBug5497Workaround(m mVar, View view, a aVar) {
            mVar.getLifecycle().a(this);
            this.f68421b = aVar;
            this.f68422c = new c(this);
            View rootView = view.getRootView();
            this.f68420a = rootView;
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.f68422c);
        }

        /* synthetic */ AndroidBug5497Workaround(m mVar, View view, a aVar, byte b2) {
            this(mVar, view, aVar);
        }
    }

    static {
        Covode.recordClassIndex(42120);
    }

    public static void b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) a(d.a(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static void c(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) a(d.a(), "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) a(d.a(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void a(Activity activity, int i2) {
        Window window = activity.getWindow();
        int i3 = window.getAttributes().softInputMode;
        int i4 = i2 & 240;
        if ((i3 & 240) != i4) {
            window.setSoftInputMode(i4 ^ (i3 & -241));
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(897);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(897);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(m mVar, View view, a aVar) {
        f68418b.add(new AndroidBug5497Workaround(mVar, view, aVar, (byte) 0));
    }
}
