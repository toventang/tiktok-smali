package com.bytedance.apm.q;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.services.apm.api.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static float f25248a;

    /* renamed from: b  reason: collision with root package name */
    public static int f25249b;

    /* renamed from: c  reason: collision with root package name */
    public static int f25250c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f25251d;

    static {
        Covode.recordClassIndex(14702);
        Context context = c.f24685a;
        boolean z = true;
        if (!c.o || Build.VERSION.SDK_INT < 23 || context == null) {
            f25250c = 60;
            f25249b = 60;
            f25251d = true;
            f25248a = 1000.0f / ((float) 60);
            return;
        }
        Display defaultDisplay = ((WindowManager) a(context, "window")).getDefaultDisplay();
        float refreshRate = defaultDisplay.getRefreshRate();
        float f2 = 0.0f;
        for (Display.Mode mode : defaultDisplay.getSupportedModes()) {
            float refreshRate2 = mode.getRefreshRate();
            if (refreshRate2 > f2) {
                f2 = refreshRate2;
            }
        }
        f25249b = a(refreshRate);
        int a2 = a(f2);
        f25250c = a2;
        int i2 = f25249b;
        if (i2 != a2) {
            z = false;
        }
        f25251d = z;
        f25248a = 1000.0f / ((float) i2);
        ActivityLifeObserver.getInstance().register(new d() {
            /* class com.bytedance.apm.q.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14703);
            }

            @Override // com.bytedance.services.apm.api.d
            public final void a(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void a(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void c(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void l_() {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void b(Activity activity) {
                boolean z;
                int a2 = f.a(activity.getWindowManager().getDefaultDisplay().getRefreshRate());
                f.f25249b = a2;
                if (a2 == f.f25250c) {
                    z = true;
                } else {
                    z = false;
                }
                f.f25251d = z;
                f.f25248a = 1000.0f / ((float) f.f25249b);
            }
        });
    }

    static int a(float f2) {
        if (Math.abs(f2 - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f2 - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f2 - 120.0f) < 5.1f) {
            return 120;
        }
        return (int) f2;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
