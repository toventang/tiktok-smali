package com.bytedance.helios.sdk.a;

import android.app.AppOpsManager;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a.a;
import com.bytedance.helios.sdk.utils.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static b f30749c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f30750d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AppOpsManager f30751a;

    /* renamed from: b  reason: collision with root package name */
    public final AppOpsManager$OnOpNotedCallbackC0645b f30752b;

    /* renamed from: e  reason: collision with root package name */
    private Context f30753e;

    /* renamed from: f  reason: collision with root package name */
    private final AppOpsManager.OnOpActiveChangedListener f30754f;

    static {
        Covode.recordClassIndex(17873);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17874);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Context context) {
            MethodCollector.i(1359);
            l.c(context, "");
            if (b.f30749c == null) {
                synchronized (b.class) {
                    try {
                        if (b.f30749c == null) {
                            b.f30749c = new b(context, (byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(1359);
                        throw th;
                    }
                }
            }
            b bVar = b.f30749c;
            MethodCollector.o(1359);
            return bVar;
        }
    }

    /* renamed from: com.bytedance.helios.sdk.a.b$b  reason: collision with other inner class name */
    public static final class AppOpsManager$OnOpNotedCallbackC0645b extends AppOpsManager.OnOpNotedCallback {
        static {
            Covode.recordClassIndex(17875);
        }

        AppOpsManager$OnOpNotedCallbackC0645b() {
        }

        public final void onAsyncNoted(AsyncNotedAppOp asyncNotedAppOp) {
            l.c(asyncNotedAppOp, "");
            String op = asyncNotedAppOp.getOp();
            l.a((Object) op, "");
            a.a(op, 2, new Throwable());
        }

        public final void onNoted(SyncNotedAppOp syncNotedAppOp) {
            l.c(syncNotedAppOp, "");
            String op = syncNotedAppOp.getOp();
            l.a((Object) op, "");
            a.a(op, 0, new Throwable());
        }

        public final void onSelfNoted(SyncNotedAppOp syncNotedAppOp) {
            l.c(syncNotedAppOp, "");
            String op = syncNotedAppOp.getOp();
            l.a((Object) op, "");
            a.a(op, 1, new Throwable());
        }
    }

    private b(Context context) {
        this.f30754f = c.f30755a;
        this.f30752b = new AppOpsManager$OnOpNotedCallbackC0645b();
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f30753e = applicationContext;
        Object a2 = a(context, "appops");
        if (a2 != null) {
            this.f30751a = (AppOpsManager) a2;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1385);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1385);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    static final class c implements AppOpsManager.OnOpActiveChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f30755a = new c();

        static {
            Covode.recordClassIndex(17876);
        }

        c() {
        }

        public final void onOpActiveChanged(String str, int i2, String str2, boolean z) {
            l.c(str, "");
            l.c(str2, "");
            Throwable th = new Throwable();
            l.c(str, "");
            l.c(th, "");
            g.b().post(new a.RunnableC0644a(str, th, z));
        }
    }
}
