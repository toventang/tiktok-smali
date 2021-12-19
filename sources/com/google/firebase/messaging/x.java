package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.iid.ae;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class x implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f54654f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f54655g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f54656h = null;

    /* renamed from: a  reason: collision with root package name */
    public final Context f54657a;

    /* renamed from: b  reason: collision with root package name */
    public final v f54658b;

    /* renamed from: c  reason: collision with root package name */
    private final ae f54659c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager.WakeLock f54660d;

    /* renamed from: e  reason: collision with root package name */
    private final long f54661e;

    static {
        Covode.recordClassIndex(33904);
    }

    public static boolean b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final void run() {
        if (a(this.f54657a)) {
            this.f54660d.acquire(b.f54602a);
        }
        try {
            this.f54658b.a(true);
            if (!this.f54659c.a()) {
                this.f54658b.a(false);
                if (a(this.f54657a)) {
                    try {
                        this.f54660d.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!b(this.f54657a) || a()) {
                if (this.f54658b.a()) {
                    this.f54658b.a(false);
                } else {
                    this.f54658b.a(this.f54661e);
                }
                if (a(this.f54657a)) {
                    try {
                        this.f54660d.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                a aVar = new a(this);
                b();
                a.a(x.this.f54657a, aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (a(this.f54657a)) {
                    try {
                        this.f54660d.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                new String("Failed to sync topics. Won't retry sync. ");
            }
            this.f54658b.a(false);
            if (a(this.f54657a)) {
                try {
                    this.f54660d.release();
                } catch (RuntimeException unused4) {
                }
            }
        } catch (Throwable th) {
            if (a(this.f54657a)) {
                try {
                    this.f54660d.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }

    public final synchronized boolean a() {
        NetworkInfo a2;
        MethodCollector.i(6128);
        ConnectivityManager connectivityManager = (ConnectivityManager) a(this.f54657a, "connectivity");
        if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isConnected()) {
            MethodCollector.o(6128);
            return false;
        }
        MethodCollector.o(6128);
        return true;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static String a(String str) {
        return new StringBuilder(String.valueOf(str).length() + 142).append("Missing Permission: ").append(str).append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest").toString();
    }

    private static boolean b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        MethodCollector.i(6144);
        synchronized (f54654f) {
            try {
                Boolean bool = f54656h;
                if (bool == null) {
                    booleanValue = a(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f54656h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } finally {
                MethodCollector.o(6144);
            }
        }
        return booleanValue2;
    }

    private static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        MethodCollector.i(6138);
        synchronized (f54654f) {
            try {
                Boolean bool = f54655g;
                if (bool == null) {
                    booleanValue = a(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f54655g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } finally {
                MethodCollector.o(6138);
            }
        }
        return booleanValue2;
    }

    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private x f54663b;

        static {
            Covode.recordClassIndex(33905);
        }

        public a(x xVar) {
            this.f54663b = xVar;
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            MethodCollector.i(5517);
            x xVar = this.f54663b;
            if (xVar == null) {
                MethodCollector.o(5517);
            } else if (!xVar.a()) {
                MethodCollector.o(5517);
            } else {
                x.b();
                this.f54663b.f54658b.a(this.f54663b, 0);
                context.unregisterReceiver(this);
                this.f54663b = null;
                MethodCollector.o(5517);
            }
        }

        private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.x.a.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6098);
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
                    MethodCollector.o(6098);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static boolean a(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        a(str);
        return false;
    }

    x(v vVar, Context context, ae aeVar, long j2) {
        this.f54658b = vVar;
        this.f54657a = context;
        this.f54661e = j2;
        this.f54659c = aeVar;
        this.f54660d = ((PowerManager) a(context, "power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
