package com.ss.android.ugc.aweme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.common.net.g;
import com.ss.android.ugc.aweme.video.d;
import java.util.ArrayList;
import java.util.List;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    private List<BroadcastReceiver> f67045a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f67046b = null;

    static {
        Covode.recordClassIndex(41315);
    }

    public final synchronized void a(Context context) {
        MethodCollector.i(7452);
        a(context, new g(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        if (SettingsManager.a().a("ear_phone_unplug_experiment", true)) {
            d dVar = new d();
            this.f67046b = dVar;
            b(context, dVar, new String[]{"android.media.AUDIO_BECOMING_NOISY"});
        }
        if (context == null || Build.VERSION.SDK_INT < 26) {
            MethodCollector.o(7452);
            return;
        }
        a(context, new NetWorkStateReceiver(), new String[]{"android.net.conn.CONNECTIVITY_CHANGE"});
        MethodCollector.o(7452);
    }

    public final synchronized void b(Context context) {
        MethodCollector.i(7459);
        if (this.f67046b == null || !SettingsManager.a().a("ear_phone_unplug_experiment", true)) {
            if (context != null) {
            }
            MethodCollector.o(7459);
        }
        context.unregisterReceiver(this.f67046b);
        if (Build.VERSION.SDK_INT >= 26) {
            for (BroadcastReceiver broadcastReceiver : this.f67045a) {
                if (broadcastReceiver != null) {
                    context.unregisterReceiver(broadcastReceiver);
                }
            }
            this.f67045a.clear();
            MethodCollector.o(7459);
            return;
        }
        MethodCollector.o(7459);
    }

    public final void a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        this.f67045a.add(broadcastReceiver);
        b(context, broadcastReceiver, strArr);
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

    private static void b(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        b(context, broadcastReceiver, intentFilter);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.at.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
