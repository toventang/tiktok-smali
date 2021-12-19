package androidx.work.impl.a.b;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class e extends d<androidx.work.impl.a.b> {

    /* renamed from: b  reason: collision with root package name */
    static final String f4537b = g.a("NetworkStateTracker");

    /* renamed from: c  reason: collision with root package name */
    private final ConnectivityManager f4538c = ((ConnectivityManager) a(this.f4533a, "connectivity"));

    /* renamed from: d  reason: collision with root package name */
    private b f4539d;

    /* renamed from: e  reason: collision with root package name */
    private a f4540e;

    static {
        Covode.recordClassIndex(1780);
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.a.b.d
    public final void c() {
        if (e()) {
            g.a();
            this.f4538c.registerDefaultNetworkCallback(this.f4539d);
            return;
        }
        g.a();
        b(this.f4533a, this.f4540e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // androidx.work.impl.a.b.d
    public final void d() {
        if (e()) {
            try {
                g.a();
                this.f4538c.unregisterNetworkCallback(this.f4539d);
            } catch (IllegalArgumentException e2) {
                g.a();
                new Throwable[1][0] = e2;
            }
        } else {
            g.a();
            this.f4533a.unregisterReceiver(this.f4540e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final androidx.work.impl.a.b b() {
        boolean z;
        boolean z2;
        NetworkCapabilities networkCapabilities;
        NetworkInfo a2 = a(this.f4538c);
        boolean z3 = true;
        if (a2 == null || !a2.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23 || (networkCapabilities = this.f4538c.getNetworkCapabilities(this.f4538c.getActiveNetwork())) == null || !networkCapabilities.hasCapability(16)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean a3 = androidx.core.c.a.a(this.f4538c);
        if (a2 == null || a2.isRoaming()) {
            z3 = false;
        }
        return new androidx.work.impl.a.b(z, z2, a3, z3);
    }

    class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(1781);
        }

        a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                g.a();
                e eVar = e.this;
                eVar.a(eVar.b());
            }
        }
    }

    class b extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(1782);
        }

        b() {
        }

        public final void onLost(Network network) {
            g.a();
            e eVar = e.this;
            eVar.a(eVar.b());
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            g.a();
            com.a.a("Network capabilities changed: %s", new Object[]{networkCapabilities});
            e eVar = e.this;
            eVar.a(eVar.b());
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public e(Context context) {
        super(context);
        if (e()) {
            this.f4539d = new b();
        } else {
            this.f4540e = new a();
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.a.b.e.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
