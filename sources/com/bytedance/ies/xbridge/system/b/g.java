package com.bytedance.ies.xbridge.system.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.system.a.g;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class g extends com.bytedance.ies.xbridge.system.a.g {

    /* renamed from: a  reason: collision with root package name */
    private final String f36486a = "XVibrateMethod";

    public enum a {
        LIGHT(50),
        MEDIUM(125),
        HEAVY(255),
        UNKNOWN(0);
        
        public static final C0886a Companion = new C0886a((byte) 0);
        private final int amplitude;

        /* renamed from: com.bytedance.ies.xbridge.system.b.g$a$a  reason: collision with other inner class name */
        public static final class C0886a {
            static {
                Covode.recordClassIndex(21885);
            }

            private C0886a() {
            }

            public /* synthetic */ C0886a(byte b2) {
                this();
            }

            public static a a(String str) {
                if (str == null) {
                    return a.UNKNOWN;
                }
                try {
                    String upperCase = str.toUpperCase();
                    l.a((Object) upperCase, "");
                    return a.valueOf(upperCase);
                } catch (Exception unused) {
                    return a.UNKNOWN;
                }
            }
        }

        public final int getAmplitude() {
            return this.amplitude;
        }

        static {
            Covode.recordClassIndex(21884);
        }

        private a(int i2) {
            this.amplitude = i2;
        }
    }

    static {
        Covode.recordClassIndex(21883);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1689);
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
                    MethodCollector.o(1689);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.ies.xbridge.system.a.g
    public final void a(com.bytedance.ies.xbridge.system.c.i iVar, g.a aVar, e eVar) {
        l.c(iVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            ALog.i(this.f36486a, "Context is null");
            aVar.a((g.a) 0, "Context is null.");
            return;
        }
        try {
            a a2 = a.C0886a.a(iVar.f36515b);
            if (a2 == a.UNKNOWN) {
                aVar.a(-3, "Illegal style");
                return;
            }
            int amplitude = a2.getAmplitude();
            long j2 = (long) iVar.f36514a;
            Object a3 = a(context, "vibrator");
            if (a3 != null) {
                Vibrator vibrator = (Vibrator) a3;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(j2, amplitude), (AudioAttributes) null);
                } else {
                    vibrator.vibrate(j2);
                }
                ALog.i(this.f36486a, "Vibrate success");
                aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "vibrate execute success.");
                return;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception e2) {
            aVar.a((g.a) 0, "Can not get vibrate service.");
            ALog.e(this.f36486a, e2);
        }
    }
}
