package com.ss.android.ugc.aweme.account.login.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.Status;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.account.n.f;
import com.ss.android.ugc.aweme.account.util.m;
import com.ss.android.ugc.aweme.common.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f63431a;

    /* renamed from: b  reason: collision with root package name */
    private t<String> f63432b;

    static {
        Covode.recordClassIndex(39083);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public e(Context context, t<String> tVar) {
        this.f63431a = context;
        this.f63432b = tVar;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Status status;
        if (TextUtils.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle a2 = a(intent);
            String str = null;
            if (a2 == null || (status = (Status) a(a2, "com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
                z = false;
            } else {
                if (status.f49967g == 0) {
                    Matcher matcher = Pattern.compile("[0-9]{4,}").matcher((String) a(a2, "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        if (!TextUtils.isEmpty(group)) {
                            this.f63432b.setValue(group);
                            z = true;
                            str = String.valueOf(status.f49967g);
                        }
                    }
                }
                z = false;
                str = String.valueOf(status.f49967g);
            }
            boolean a3 = m.a(this.f63431a);
            int b2 = f.b(this.f63431a);
            if (z) {
                a(true, "", a3, b2);
            } else {
                a(false, "Failed to get SMS data from Broadcast Receiver, status code = ".concat(String.valueOf(str)), a3, b2);
            }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.e.e.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    private static void a(boolean z, String str, boolean z2, int i2) {
        a.b(z, str, z2, i2);
        a.C1450a.a(z, str, z2, i2);
        r.a("sms_auto_fill", new com.ss.android.ugc.aweme.account.a.b.a().a("is_successful", z ? 1 : 0).a("error_desc", str).a("has_sim_card", z2 ? 1 : 0).a("google_availability", i2).f62575a);
    }
}
