package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.client.j;
import com.bytedance.common.wschannel.client.l;
import com.bytedance.common.wschannel.d;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.server.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static j f27237a = new l();

    /* renamed from: b  reason: collision with root package name */
    static Map<Integer, i> f27238b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static AtomicBoolean f27239c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27240d = true;

    static class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final Application f27241a;

        static {
            Covode.recordClassIndex(16054);
        }

        @Override // com.bytedance.common.wschannel.d.a
        public final void a() {
            k.f27240d = false;
            if (k.f27239c.get()) {
                k.f27237a.a(this.f27241a);
            }
        }

        @Override // com.bytedance.common.wschannel.d.a
        public final void b() {
            k.f27240d = true;
            if (k.f27239c.get()) {
                k.f27237a.b(this.f27241a);
            }
        }

        a(Application application) {
            this.f27241a = application;
        }
    }

    static {
        Covode.recordClassIndex(16053);
    }

    static i a(int i2) {
        return f27238b.get(Integer.valueOf(i2));
    }

    static SsWsApp a(a aVar) {
        Map<String, String> map = aVar.f26996d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
        }
        int i2 = aVar.f26999g;
        if (i2 > 0) {
            String str = aVar.f26994b;
            if (!m.a(str)) {
                String str2 = aVar.f26995c;
                if (!m.a(str2)) {
                    int i3 = aVar.f26998f;
                    if (i3 > 0) {
                        String str3 = aVar.f27000h;
                        if (!m.a(str3)) {
                            int i4 = aVar.f27001i;
                            if (i4 > 0) {
                                int i5 = aVar.f26993a;
                                if (i5 > 0) {
                                    SsWsApp.a aVar2 = new SsWsApp.a();
                                    aVar2.f27284a = i2;
                                    aVar2.f27285b = str;
                                    aVar2.f27286c = str2;
                                    aVar2.f27289f = i3;
                                    aVar2.f27290g = str3;
                                    aVar2.f27293j = aVar.f26997e;
                                    aVar2.f27287d = i4;
                                    aVar2.f27288e = 0;
                                    aVar2.f27292i = i5;
                                    aVar2.f27291h = TextUtils.join("&", arrayList.toArray());
                                    return aVar2.a();
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.k.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public static h a(Context context, a aVar, e eVar) {
        if (f27239c.compareAndSet(false, true)) {
            if (f27240d) {
                f27237a.b(context);
            } else {
                f27237a.a(context);
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                b(context, new com.bytedance.common.wschannel.server.l(context, f.a(context)), intentFilter);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        i iVar = new i(context, f27237a, aVar, eVar);
        f27238b.put(Integer.valueOf(aVar.f26993a), iVar);
        iVar.f27219c.a(iVar.f27220d, iVar.f27221e);
        return iVar;
    }
}
