package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.internal.r;

/* access modifiers changed from: package-private */
public class el extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    private static final String f51515b = el.class.getName();

    /* renamed from: a  reason: collision with root package name */
    final jo f51516a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51517c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f51518d;

    static {
        Covode.recordClassIndex(32206);
    }

    public final void a() {
        this.f51516a.h();
        this.f51516a.p().c();
        if (!this.f51517c) {
            b(this.f51516a.m(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f51518d = this.f51516a.c().e();
            this.f51516a.q().f51476k.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f51518d));
            this.f51517c = true;
        }
    }

    public final void b() {
        this.f51516a.h();
        this.f51516a.p().c();
        this.f51516a.p().c();
        if (this.f51517c) {
            this.f51516a.q().f51476k.a("Unregistering connectivity change receiver");
            this.f51517c = false;
            this.f51518d = false;
            try {
                this.f51516a.m().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f51516a.q().f51468c.a("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    el(jo joVar) {
        r.a(joVar);
        this.f51516a = joVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f51516a.h();
        String action = intent.getAction();
        this.f51516a.q().f51476k.a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e2 = this.f51516a.c().e();
            if (this.f51518d != e2) {
                this.f51518d = e2;
                this.f51516a.p().a(new ek(this, e2));
                return;
            }
            return;
        }
        this.f51516a.q().f51471f.a("NetworkBroadcastReceiver received unknown action", action);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.el.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
