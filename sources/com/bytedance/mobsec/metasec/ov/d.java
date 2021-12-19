package com.bytedance.mobsec.metasec.ov;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import ms.bd.o.b;
import ms.bd.o.s1;
import ms.bd.o.t1;

public final class d {

    public static class b extends b.a {
        static {
            Covode.recordClassIndex(25343);
        }

        @Override // ms.bd.o.b.a
        public final Object a(long j2, String str, Object obj) {
            return "";
        }
    }

    public static class c extends b.a {
        static {
            Covode.recordClassIndex(25344);
        }

        @Override // ms.bd.o.b.a
        public final Object a(long j2, String str, Object obj) {
            return s1.a();
        }
    }

    static {
        Covode.recordClassIndex(25341);
    }

    public static class a extends b.a {
        static {
            Covode.recordClassIndex(25342);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(9864);
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
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(9864);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        @Override // ms.bd.o.b.a
        public final Object a(long j2, String str, Object obj) {
            try {
                Display defaultDisplay = ((WindowManager) a(ms.bd.o.a.f159493a.f159494b, "window")).getDefaultDisplay();
                Point point = new Point();
                int i2 = Build.VERSION.SDK_INT;
                defaultDisplay.getRealSize(point);
                t1.f159555a = point.x;
                t1.f159556b = point.y;
            } catch (Throwable unused) {
            }
            return t1.f159555a + "*" + t1.f159556b;
        }
    }
}
