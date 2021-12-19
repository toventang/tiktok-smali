package com.bytedance.sdk.b;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Context f43538a = a.c();

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.sdk.b.e.a f43539b = com.bytedance.sdk.b.e.a.a();

    /* renamed from: c  reason: collision with root package name */
    final HandlerThread f43540c = new HandlerThread("mobile-data-monitor-thread");

    /* renamed from: d  reason: collision with root package name */
    BroadcastReceiver f43541d;

    /* renamed from: e  reason: collision with root package name */
    public b f43542e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f43543f;

    /* renamed from: g  reason: collision with root package name */
    public volatile int f43544g;

    /* renamed from: h  reason: collision with root package name */
    C1052d f43545h;

    /* renamed from: i  reason: collision with root package name */
    public c f43546i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f43547j;

    /* renamed from: k  reason: collision with root package name */
    Handler f43548k;

    public interface b {
        static {
            Covode.recordClassIndex(26658);
        }

        void a(int i2);

        void b(int i2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(26659);
        }

        void a(String str, int i2);

        void b(String str, int i2);
    }

    static {
        Covode.recordClassIndex(26651);
    }

    d() {
    }

    /* access modifiers changed from: package-private */
    public class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26657);
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && d.this.f43547j != null) {
                d.this.f43547j.sendEmptyMessage(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d$d  reason: collision with other inner class name */
    public class C1052d extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26660);
        }

        private C1052d() {
        }

        /* synthetic */ C1052d(d dVar, byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (("android.intent.action.SIM_STATE_CHANGED".equals(action) || "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(action)) && d.this.f43547j != null) {
                d.this.f43547j.sendEmptyMessage(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final SoftReference<d> f43591a;

        static {
            Covode.recordClassIndex(26661);
        }

        public final void handleMessage(Message message) {
            Runnable runnable;
            SoftReference<d> softReference = this.f43591a;
            if (softReference != null && softReference.get() != null) {
                d dVar = this.f43591a.get();
                if (message == null) {
                    return;
                }
                if (message.what == 3) {
                    dVar.f43544g = com.bytedance.sdk.b.f.b.a(dVar.f43538a);
                    if (dVar.f43542e != null && dVar.f43548k != null) {
                        dVar.f43548k.post(new Runnable() {
                            /* class com.bytedance.sdk.b.d.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(26652);
                            }

                            public final void run() {
                                d.this.f43542e.a(d.this.f43544g);
                                d.this.f43547j.sendEmptyMessage(4);
                            }
                        });
                    }
                } else if (message.what == 1) {
                    int i2 = dVar.f43544g;
                    dVar.f43544g = com.bytedance.sdk.b.f.b.a(dVar.f43538a);
                    if (dVar.f43542e != null && i2 != dVar.f43544g && dVar.f43548k != null) {
                        dVar.f43548k.post(new Runnable() {
                            /* class com.bytedance.sdk.b.d.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(26653);
                            }

                            public final void run() {
                                d.this.f43542e.b(d.this.f43544g);
                            }
                        });
                    }
                } else if (message.what == 4) {
                    String a2 = com.bytedance.sdk.b.f.c.a(dVar.f43538a, true);
                    com.bytedance.sdk.b.f.c.b(dVar.f43538a, true);
                    int c2 = com.bytedance.sdk.b.f.c.c(dVar.f43538a, true);
                    if (dVar.f43546i != null && dVar.f43548k != null) {
                        dVar.f43548k.post(new Runnable(a2, c2) {
                            /* class com.bytedance.sdk.b.d.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f43551a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ int f43552b;

                            static {
                                Covode.recordClassIndex(26654);
                            }

                            public final void run() {
                                d.this.f43546i.a(this.f43551a, this.f43552b);
                            }

                            {
                                this.f43551a = r2;
                                this.f43552b = r3;
                            }
                        });
                    }
                } else if (message.what == 2 && dVar.f43538a != null) {
                    Runnable runnable2 = null;
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) d.a(dVar.f43538a, "phone");
                        String a3 = com.bytedance.sdk.b.f.c.a(dVar.f43538a, true);
                        com.bytedance.sdk.b.f.c.b(dVar.f43538a, true);
                        int c3 = com.bytedance.sdk.b.f.c.c(dVar.f43538a, true);
                        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                            if (!com.bytedance.sdk.b.f.a.a(dVar.f43538a, "android.permission.READ_PHONE_STATE")) {
                                String b2 = dVar.f43539b.b("sim_operator");
                                if (TextUtils.isEmpty(b2) && TextUtils.isEmpty(a3)) {
                                    return;
                                }
                                if (TextUtils.isEmpty(b2) || !b2.equals(a3)) {
                                    runnable = new Runnable(a3, c3) {
                                        /* class com.bytedance.sdk.b.d.AnonymousClass5 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ String f43557a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ int f43558b;

                                        static {
                                            Covode.recordClassIndex(26656);
                                        }

                                        public final void run() {
                                            if (d.this.f43546i != null) {
                                                d.this.f43546i.b(this.f43557a, this.f43558b);
                                            }
                                        }

                                        {
                                            this.f43557a = r2;
                                            this.f43558b = r3;
                                        }
                                    };
                                } else {
                                    return;
                                }
                            } else if (c3 != dVar.f43539b.c("key_sim_subscription_id")) {
                                runnable = new Runnable(a3, c3) {
                                    /* class com.bytedance.sdk.b.d.AnonymousClass4 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ String f43554a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ int f43555b;

                                    static {
                                        Covode.recordClassIndex(26655);
                                    }

                                    public final void run() {
                                        if (d.this.f43546i != null) {
                                            d.this.f43546i.b(this.f43554a, this.f43555b);
                                        }
                                    }

                                    {
                                        this.f43554a = r2;
                                        this.f43555b = r3;
                                    }
                                };
                            } else {
                                return;
                            }
                            runnable2 = runnable;
                        }
                    } catch (Exception e2) {
                        com.bytedance.sdk.b.c.a.d(e2.getMessage());
                    }
                    if (dVar.f43548k != null && runnable2 != null) {
                        dVar.f43548k.post(runnable2);
                    }
                }
            }
        }

        e(Looper looper, d dVar) {
            super(looper);
            this.f43591a = new SoftReference<>(dVar);
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3463);
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
                    MethodCollector.o(3463);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.b.d.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
