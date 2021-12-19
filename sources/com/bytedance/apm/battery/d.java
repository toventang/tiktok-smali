package com.bytedance.apm.battery;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.k.a;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private BroadcastReceiver f24499a;

    /* renamed from: b  reason: collision with root package name */
    private IntentFilter f24500b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24501c;

    static {
        Covode.recordClassIndex(14437);
    }

    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.apm.k.a
    public final long c() {
        return 0;
    }

    public d() {
        this.p = "battery";
    }

    @Override // com.bytedance.apm.k.a
    public final void a() {
        this.f24499a = new BroadcastReceiver() {
            /* class com.bytedance.apm.battery.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14438);
            }

            public final void onReceive(Context context, Intent intent) {
                final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                final float intExtra2 = (((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100));
                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                if (!TextUtils.isEmpty(topActivityClassName)) {
                    b.a.f25210a.a(new Runnable() {
                        /* class com.bytedance.apm.battery.d.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14439);
                        }

                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("battery_temperature", (double) intExtra);
                                jSONObject.put("remaining_energy", (double) intExtra2);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("scene", topActivityClassName);
                                com.bytedance.apm.c.a.a.b().a(new f("temperature", "", jSONObject, jSONObject2, null, (byte) 0));
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f24500b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void b(Activity activity) {
        super.b(activity);
        if (!this.f24501c) {
            try {
                b(c.f24685a, this.f24499a, this.f24500b);
                this.f24501c = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.services.apm.api.d, com.bytedance.apm.k.a
    public final void a(Activity activity) {
        super.a(activity);
        if (this.f24501c) {
            try {
                c.f24685a.unregisterReceiver(this.f24499a);
                this.f24501c = false;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        boolean z = false;
        if (jSONObject.optInt("temperature_enable_upload", 0) == 1) {
            z = true;
        }
        this.q = z;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.d.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
