package com.bytedance.android.livesdk.ag;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    NetworkUtils.h f13699a = NetworkUtils.h.NONE;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f13700b;

    /* renamed from: c  reason: collision with root package name */
    private List<WeakReference<AbstractC0288a>> f13701c = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.ag.a$a  reason: collision with other inner class name */
    public interface AbstractC0288a {
        static {
            Covode.recordClassIndex(7606);
        }

        void a(NetworkUtils.h hVar);
    }

    static {
        Covode.recordClassIndex(7605);
    }

    public final void a() {
        WeakReference<Context> weakReference = this.f13700b;
        if (weakReference != null && weakReference.get() != null) {
            try {
                this.f13700b.get().unregisterReceiver(this);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(AbstractC0288a aVar) {
        this.f13701c.add(new WeakReference<>(aVar));
    }

    private static NetworkUtils.h b(Context context) {
        if (j.f107228g != NetworkUtils.h.NONE && j.b() && !j.c()) {
            return j.f107228g;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        j.f107228g = networkType;
        return networkType;
    }

    public final void a(Context context) {
        this.f13700b = new WeakReference<>(context);
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            b(context, this, intentFilter);
        }
        this.f13699a = b(context);
    }

    public final void b(AbstractC0288a aVar) {
        for (WeakReference<AbstractC0288a> weakReference : this.f13701c) {
            if (weakReference != null && weakReference.get() == aVar) {
                this.f13701c.remove(weakReference);
                return;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
            NetworkUtils.h hVar = this.f13699a;
            NetworkUtils.h b2 = b(context);
            this.f13699a = b2;
            List<WeakReference<AbstractC0288a>> list = this.f13701c;
            if (!(list == null || hVar == b2)) {
                for (WeakReference<AbstractC0288a> weakReference : list) {
                    if (weakReference != null) {
                        weakReference.get().a(this.f13699a);
                    }
                }
            }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ag.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
