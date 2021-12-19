package com.google.firebase.iid;

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
import com.google.firebase.iid.aq;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class ar implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseInstanceId f54431a;

    /* renamed from: b  reason: collision with root package name */
    private final long f54432b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f54433c;

    static {
        Covode.recordClassIndex(33788);
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f54431a.getApp().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        NetworkInfo a2;
        ConnectivityManager connectivityManager = (ConnectivityManager) a(a(), "connectivity");
        if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isConnected()) {
            return false;
        }
        return true;
    }

    private boolean c() {
        aq.a tokenWithoutTriggeringSync = this.f54431a.getTokenWithoutTriggeringSync();
        if (!this.f54431a.tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return true;
        }
        try {
            String blockingGetMasterToken = this.f54431a.blockingGetMasterToken();
            if (blockingGetMasterToken == null) {
                return false;
            }
            if ((tokenWithoutTriggeringSync == null || !blockingGetMasterToken.equals(tokenWithoutTriggeringSync.f54428b)) && "[DEFAULT]".equals(this.f54431a.getApp().b())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f54431a.getApp().b());
                    if (valueOf.length() != 0) {
                        "Invoking onNewToken for app: ".concat(valueOf);
                    } else {
                        new String("Invoking onNewToken for app: ");
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", blockingGetMasterToken);
                Context a2 = a();
                Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a2.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                String.valueOf(e2.getMessage()).length();
                return false;
            } else if (e2.getMessage() == null) {
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void run() {
        if (ap.a().a(a())) {
            this.f54433c.acquire();
        }
        try {
            boolean z = true;
            this.f54431a.setSyncScheduledOrRunning(true);
            if (!this.f54431a.isGmsCorePresent()) {
                this.f54431a.setSyncScheduledOrRunning(false);
                if (ap.a().a(a())) {
                    this.f54433c.release();
                    return;
                }
                return;
            }
            ap a2 = ap.a();
            Context a3 = a();
            if (a2.f54421b == null) {
                if (a3.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                a2.f54421b = Boolean.valueOf(z);
            }
            a2.f54420a.booleanValue();
            if (!a2.f54421b.booleanValue() || b()) {
                if (c()) {
                    this.f54431a.setSyncScheduledOrRunning(false);
                } else {
                    this.f54431a.syncWithDelaySecondsInternal(this.f54432b);
                }
                if (ap.a().a(a())) {
                    this.f54433c.release();
                    return;
                }
                return;
            }
            a aVar = new a(this);
            FirebaseInstanceId.isDebugLogEnabled();
            a.a(aVar.f54434a.a(), aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (ap.a().a(a())) {
                this.f54433c.release();
            }
        } catch (IOException e2) {
            String.valueOf(e2.getMessage()).length();
            this.f54431a.setSyncScheduledOrRunning(false);
            if (ap.a().a(a())) {
                this.f54433c.release();
            }
        } catch (Throwable th) {
            if (ap.a().a(a())) {
                this.f54433c.release();
            }
            throw th;
        }
    }

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        ar f54434a;

        static {
            Covode.recordClassIndex(33789);
        }

        public a(ar arVar) {
            this.f54434a = arVar;
        }

        public final void onReceive(Context context, Intent intent) {
            ar arVar = this.f54434a;
            if (arVar != null && arVar.b()) {
                FirebaseInstanceId.isDebugLogEnabled();
                this.f54434a.f54431a.enqueueTaskWithDelaySeconds(this.f54434a, 0);
                this.f54434a.a().unregisterReceiver(this);
                this.f54434a = null;
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ar.a.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
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

    ar(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f54431a = firebaseInstanceId;
        this.f54432b = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a(a(), "power")).newWakeLock(1, "fiid-sync");
        this.f54433c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12694);
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
                    MethodCollector.o(12694);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
