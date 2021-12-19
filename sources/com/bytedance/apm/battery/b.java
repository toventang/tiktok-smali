package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.k.c.e;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.q;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.bytedance.apm.k.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f24444a;

    /* renamed from: b  reason: collision with root package name */
    public int f24445b;

    /* renamed from: c  reason: collision with root package name */
    public String f24446c;

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, a> f24447d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f24448e;

    /* renamed from: f  reason: collision with root package name */
    public long f24449f;

    /* renamed from: g  reason: collision with root package name */
    public float f24450g;

    /* renamed from: h  reason: collision with root package name */
    public long f24451h;

    /* renamed from: i  reason: collision with root package name */
    public long f24452i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24453j;

    /* renamed from: k  reason: collision with root package name */
    public e f24454k;

    /* renamed from: l  reason: collision with root package name */
    public CopyOnWriteArrayList<Long> f24455l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.b.b f24456m;
    private long r;

    static {
        Covode.recordClassIndex(14422);
    }

    @Override // com.bytedance.apm.k.a
    public final long c() {
        return this.r;
    }

    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        if (!this.o) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.f24449f = 0;
        this.f24450g = 0.0f;
    }

    /* renamed from: com.bytedance.apm.battery.b$b  reason: collision with other inner class name */
    public static final class C0524b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24467a = new b((byte) 0);

        static {
            Covode.recordClassIndex(14425);
        }
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.f24446c)) {
            this.f24446c = null;
            b.a.f25210a.b(this);
            com.ss.b.a.a();
            g();
        }
    }

    private b() {
        boolean z;
        this.f24447d = new ConcurrentHashMap<>();
        this.f24448e = new Object();
        this.f24449f = 0;
        this.f24450g = 0.0f;
        this.f24451h = 0;
        this.f24452i = 0;
        this.f24454k = e.a.f25097a;
        this.f24455l = new CopyOnWriteArrayList<>();
        this.f24456m = new com.ss.b.b() {
            /* class com.bytedance.apm.battery.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14423);
            }

            @Override // com.ss.b.b
            public final void a() {
                b.this.g();
            }

            @Override // com.ss.b.b
            public final void b() {
                b.this.g();
            }

            @Override // com.ss.b.b
            public final void a(float f2, long j2) {
                synchronized (b.this.f24448e) {
                    if (!TextUtils.isEmpty(b.this.f24446c)) {
                        if (b.this.o || b.this.f24453j) {
                            b.this.f();
                            return;
                        }
                        if (b.this.f24449f == 0) {
                            b.this.f24451h = com.bytedance.apm.q.b.c();
                            b.this.f24452i = 0;
                            b.this.f24455l.clear();
                        }
                        b.this.f24449f++;
                        b.this.f24450g += f2;
                        if (b.this.f24449f > 20) {
                            if (b.this.f24450g > 200.0f) {
                                float f3 = b.this.f24450g / ((float) b.this.f24449f);
                                a aVar = new a();
                                aVar.f24458a = f3;
                                aVar.f24461d = j2;
                                aVar.f24459b = com.bytedance.apm.q.b.c() - b.this.f24451h;
                                aVar.f24460c = 0 - b.this.f24452i;
                                CopyOnWriteArrayList<Long> copyOnWriteArrayList = b.this.f24455l;
                                if (!(copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0)) {
                                    for (int i2 = 0; i2 < copyOnWriteArrayList.size() - 1; i2++) {
                                        aVar.f24462e.append(copyOnWriteArrayList.get(i2)).append(',');
                                    }
                                    aVar.f24462e.append(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1));
                                }
                                b.this.f24447d.put(b.this.f24446c, aVar);
                            }
                            b.this.g();
                        }
                    }
                }
            }
        };
        this.p = "battery";
        Context context = com.bytedance.apm.c.f24685a;
        try {
            Intent b2 = b(context, new c(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b2 != null) {
                int intExtra = b2.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24453j = z;
                return;
            }
        } catch (Throwable unused) {
        }
        this.f24453j = true;
    }

    @Override // com.bytedance.apm.k.a
    public final void e() {
        super.e();
        for (Map.Entry<String, a> entry : this.f24447d.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", entry.getKey());
                jSONObject.put("current", (double) entry.getValue().f24458a);
                jSONObject.put("capacity", entry.getValue().f24461d);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cpu_time", entry.getValue().f24459b);
                jSONObject3.put("traffic", entry.getValue().f24460c);
                jSONObject3.put(q.f30917a, entry.getValue().f24462e.toString());
                com.bytedance.apm.c.a.a.b().a(new f("battery", "", jSONObject, jSONObject2, jSONObject3, (byte) 0));
            } catch (JSONException unused) {
            }
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void b(Activity activity) {
        super.b(activity);
    }

    public class c extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(14426);
        }

        public c() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z;
            int intExtra = intent.getIntExtra("status", -1);
            b bVar = b.this;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            } else {
                z = false;
            }
            bVar.f24453j = z;
            if (b.this.f24453j) {
                synchronized (b.this.f24448e) {
                    b.this.f();
                }
            }
        }
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public float f24458a;

        /* renamed from: b  reason: collision with root package name */
        public long f24459b;

        /* renamed from: c  reason: collision with root package name */
        public long f24460c;

        /* renamed from: d  reason: collision with root package name */
        public long f24461d;

        /* renamed from: e  reason: collision with root package name */
        StringBuilder f24462e = new StringBuilder();

        static {
            Covode.recordClassIndex(14424);
        }

        public a() {
        }
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void a(Activity activity) {
        super.a(activity);
        b.a.f25210a.b(this);
        synchronized (this.f24448e) {
            f();
        }
    }

    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21 || jSONObject.optInt("energy_enable", 0) != 1) {
            z = false;
        }
        this.f24444a = z;
        if (z) {
            this.f24445b = jSONObject.optInt("battery_energy_sample_interval", 3000);
            this.r = jSONObject.optLong("battery_energy_upload_interval", 120000);
            return;
        }
        ActivityLifeObserver.getInstance().unregister(this);
        b.a.f25210a.b(this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.b.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
