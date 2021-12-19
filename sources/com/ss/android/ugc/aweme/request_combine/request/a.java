package com.ss.android.ugc.aweme.request_combine.request;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120629a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(78555);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1778);
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
                    MethodCollector.o(1778);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
