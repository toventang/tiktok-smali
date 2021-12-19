package androidx.activity;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements k {

    /* renamed from: a  reason: collision with root package name */
    private static int f810a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f811b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f812c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f813d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f814e;

    static {
        Covode.recordClassIndex(216);
    }

    private static Object a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!i.f107219a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            if (f810a == 0) {
                try {
                    f810a = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f812c = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    f813d = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    f811b = declaredField3;
                    declaredField3.setAccessible(true);
                    f810a = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f810a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) a(this.f814e, "input_method");
                try {
                    Object obj = f811b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f812c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f813d.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
