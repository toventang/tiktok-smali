package com.bytedance.android.livesdk.performance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20208a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20209b;

    /* renamed from: c  reason: collision with root package name */
    public float f20210c;

    /* renamed from: d  reason: collision with root package name */
    public int f20211d;

    /* renamed from: e  reason: collision with root package name */
    public int f20212e;

    /* renamed from: f  reason: collision with root package name */
    public int f20213f;

    /* renamed from: g  reason: collision with root package name */
    public int f20214g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20215h;

    /* renamed from: i  reason: collision with root package name */
    public int f20216i;

    /* renamed from: j  reason: collision with root package name */
    public String f20217j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f20218k;

    /* renamed from: l  reason: collision with root package name */
    private BroadcastReceiver f20219l;

    /* renamed from: m  reason: collision with root package name */
    private IntentFilter f20220m;

    static {
        Covode.recordClassIndex(11926);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20222a = new d((byte) 0);

        static {
            Covode.recordClassIndex(11928);
        }
    }

    private d() {
        this.f20210c = -1.0f;
        this.f20211d = -1;
        this.f20212e = -1;
        this.f20213f = 1;
        this.f20214g = 1;
        this.f20215h = true;
        this.f20216i = -1;
        this.f20217j = "unknow";
        this.f20219l = new BroadcastReceiver() {
            /* class com.bytedance.android.livesdk.performance.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11927);
            }

            private static String a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void onReceive(Context context, Intent intent) {
                String str;
                if (intent != null) {
                    boolean z = true;
                    d.this.f20209b = true;
                    d.this.f20210c = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                    d.this.f20211d = intent.getIntExtra("level", -1);
                    d.this.f20212e = intent.getIntExtra("scale", -1);
                    d.this.f20213f = intent.getIntExtra("status", 1);
                    d.this.f20214g = intent.getIntExtra("health", 1);
                    d.this.f20215h = intent.getBooleanExtra("present", true);
                    d.this.f20216i = intent.getIntExtra("voltage", -1);
                    d dVar = d.this;
                    if (a(intent, "technology") != null) {
                        str = a(intent, "technology");
                    } else {
                        str = "unknow";
                    }
                    dVar.f20217j = str;
                    int intExtra = intent.getIntExtra("status", -1);
                    d dVar2 = d.this;
                    if (!(intExtra == 2 || intExtra == 5)) {
                        z = false;
                    }
                    dVar2.f20218k = z;
                }
            }
        };
        this.f20220m = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public final synchronized void a() {
        boolean z;
        MethodCollector.i(10232);
        if (this.f20208a) {
            MethodCollector.o(10232);
            return;
        }
        try {
            this.f20208a = true;
            Intent b2 = b(y.e(), this.f20219l, this.f20220m);
            if (b2 != null) {
                int intExtra = b2.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.f20218k = z;
            }
        } catch (Exception unused) {
        }
        this.f20218k = true;
        MethodCollector.o(10232);
    }

    public final synchronized void b() {
        MethodCollector.i(10548);
        if (!this.f20208a) {
            MethodCollector.o(10548);
            return;
        }
        try {
            y.e().unregisterReceiver(this.f20219l);
            this.f20208a = false;
            MethodCollector.o(10548);
        } catch (Exception unused) {
            MethodCollector.o(10548);
        }
    }

    /* synthetic */ d(byte b2) {
        this();
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.d.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
