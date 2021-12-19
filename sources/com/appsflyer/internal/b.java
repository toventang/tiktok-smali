package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public final class b {

    /* renamed from: ı  reason: contains not printable characters */
    private IntentFilter f221 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        Covode.recordClassIndex(2725);
    }

    public static final class e {

        /* renamed from: ı  reason: contains not printable characters */
        public static final b f224 = new b();

        static {
            Covode.recordClassIndex(2727);
        }
    }

    b() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final d m159(Context context) {
        String str = null;
        float f2 = 0.0f;
        try {
            Intent com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(context, null, this.f221);
            if (com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver != null) {
                if (2 == com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra != 4) {
                        str = "other";
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
                int intExtra3 = com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f2 = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new d(f2, str);
    }

    public static final class d {

        /* renamed from: ı  reason: contains not printable characters */
        public final float f222;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f223;

        static {
            Covode.recordClassIndex(2726);
        }

        d(float f2, String str) {
            this.f222 = f2;
            this.f223 = str;
        }
    }

    public static Intent com_appsflyer_internal_b_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_appsflyer_internal_b_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.b.com_appsflyer_internal_b_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
