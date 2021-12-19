package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;

public final class ReleaseWindowBackgroundTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107869a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Activity> f107870b;

    static {
        Covode.recordClassIndex(69108);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69109);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        l.d(activity, "");
        this.f107870b = new WeakReference<>(activity);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        View decorView;
        l.d(context, "");
        Drawable drawable = null;
        if (!(b.a().a(true, "is_release_window_background", true) || (weakReference = this.f107870b) == null || (activity = weakReference.get()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            drawable = decorView.getBackground();
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            Object a2 = a(applicationContext, "input_method");
            if (a2 != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) a2;
                if (inputMethodManager != null) {
                    try {
                        Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurRootView");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(inputMethodManager);
                        if (obj != null && (obj instanceof View)) {
                            Field declaredField2 = ((View) obj).getClass().getDeclaredField("mResizingBackgroundDrawable");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, drawable);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3583);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(3583);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
