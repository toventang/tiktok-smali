package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f7300a;

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f7301b;

    /* renamed from: c  reason: collision with root package name */
    OrientationEventListener f7302c;

    /* renamed from: d  reason: collision with root package name */
    public c f7303d;

    static {
        Covode.recordClassIndex(3502);
    }

    public final void a() {
        OrientationEventListener orientationEventListener = this.f7302c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f7302c = null;
        this.f7301b = null;
        this.f7303d = null;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5171);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5171);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
