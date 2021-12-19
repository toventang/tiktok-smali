package com.bytedance.tux.h;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45101a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Vibrator f45102b;

    static {
        Covode.recordClassIndex(27510);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27511);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                VibrationEffect createOneShot = VibrationEffect.createOneShot(12, 200);
                Vibrator vibrator = this.f45102b;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                    return;
                }
                return;
            }
            Vibrator vibrator2 = this.f45102b;
            if (vibrator2 != null) {
                vibrator2.vibrate(12);
            }
        } catch (Exception unused) {
        }
    }

    public h(Context context) {
        l.c(context, "");
        Object a2 = a(context, "vibrator");
        if (a2 != null) {
            this.f45102b = (Vibrator) a2;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9056);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9056);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
