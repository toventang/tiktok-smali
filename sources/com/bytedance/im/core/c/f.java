package com.bytedance.im.core.c;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;

public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    static boolean f37629a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Context f37630b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f37631c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f37632d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static c f37633e;

    /* renamed from: f  reason: collision with root package name */
    private static final LinkedList<Activity> f37634f = new LinkedList<>();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.c(activity, "");
    }

    public final void onActivityPaused(Activity activity) {
        l.c(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.c(activity, "");
    }

    public final void onActivityStarted(Activity activity) {
        l.c(activity, "");
    }

    private f() {
    }

    private static boolean a(String str) {
        l.c(str, "");
        return Math.random() < com.bytedance.im.core.internal.a.a(str);
    }

    public static boolean a(Context context) {
        l.c(context, "");
        try {
            Object a2 = a(context, "connectivity");
            if (a2 != null) {
                NetworkInfo a3 = a((ConnectivityManager) a2);
                if (a3 == null || !a3.isConnected()) {
                    return false;
                }
                return true;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final class a extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(22638);
        }

        public final void onUnavailable() {
            j.a("monitorNetChange onUnavailable");
            super.onUnavailable();
            f.f37631c = false;
        }

        public final void onLost(Network network) {
            j.a("monitorNetChange onLost");
            super.onLost(network);
            f.f37631c = false;
        }

        public final void onAvailable(Network network) {
            super.onAvailable(network);
            j.a("monitorNetChange onAvailable");
            boolean a2 = f.a(f.a());
            if (a2 != f.f37631c && com.bytedance.im.core.internal.a.k()) {
                d a3 = d.a();
                l.a((Object) a3, "");
                if (a3.f37564d) {
                    d.a().a(3);
                }
            }
            f.f37631c = a2;
        }
    }

    public static Context a() {
        Context context = f37630b;
        if (context == null) {
            l.a("appContext");
        }
        return context;
    }

    static {
        Covode.recordClassIndex(22637);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void onActivityDestroyed(Activity activity) {
        l.c(activity, "");
        f37634f.remove(activity);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public final void onActivityStopped(Activity activity) {
        l.c(activity, "");
        LinkedList<Activity> linkedList = f37634f;
        linkedList.remove(activity);
        if (linkedList.isEmpty()) {
            f37629a = true;
            j.b("switchToBackground");
        }
    }

    public final void onActivityResumed(Activity activity) {
        l.c(activity, "");
        LinkedList<Activity> linkedList = f37634f;
        if (linkedList.isEmpty()) {
            f37629a = false;
            j.b("switchToForeground");
            if (com.bytedance.im.core.internal.a.j()) {
                d a2 = d.a();
                l.a((Object) a2, "");
                if (a2.f37564d) {
                    d.a().a(10);
                }
            }
        }
        linkedList.remove(activity);
        linkedList.add(activity);
    }

    public static final class b extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(22639);
        }

        public final void onReceive(Context context, Intent intent) {
            l.c(context, "");
            l.c(intent, "");
            try {
                boolean a2 = f.a(f.a());
                j.a("monitorNetChange dataNetworkInfo.isConnected  = ".concat(String.valueOf(a2)));
                if (a2 != f.f37631c && a2 && com.bytedance.im.core.internal.a.k()) {
                    d a3 = d.a();
                    l.a((Object) a3, "");
                    if (a3.f37564d) {
                        d.a().a(3);
                    }
                }
                f.f37631c = a2;
            } catch (Exception e2) {
                e2.printStackTrace();
                e.a(e2);
            }
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9342);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9342);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, c cVar) {
        l.c(context, "");
        l.c(cVar, "");
        Context b2 = b(context);
        if (b2 != null) {
            f37630b = (Application) b2;
            f37633e = cVar;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public static void a(String str, JSONObject jSONObject) {
        l.c(str, "");
        l.c(jSONObject, "");
        a(str, jSONObject, false);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.c.f.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public static void b(String str, String str2, Throwable th) {
        l.c(str, "");
        l.c(str2, "");
        c cVar = f37633e;
        if (cVar != null) {
            cVar.b(str, str2, th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        l.c(str, "");
        l.c(str2, "");
        c cVar = f37633e;
        if (cVar != null) {
            cVar.a(str, str2, th);
        }
    }

    public static void a(String str, JSONObject jSONObject, boolean z) {
        c cVar;
        l.c(str, "");
        l.c(jSONObject, "");
        if ((z || a(str)) && (cVar = f37633e) != null) {
            cVar.a(str, jSONObject);
        }
        if (com.bytedance.im.core.internal.a.i()) {
            b("imsdk", "monitorTeaEvent() called with: event = " + str + ", data = " + jSONObject, (Throwable) null);
        }
    }
}
