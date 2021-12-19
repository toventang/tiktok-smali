package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.client.k;
import com.bytedance.common.wschannel.d;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.notice.api.e.ac;
import com.ss.android.ugc.aweme.notice.api.e.p;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f27224a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static com.bytedance.common.wschannel.client.j f27225b = new k();

    /* renamed from: c  reason: collision with root package name */
    public static Application f27226c;

    /* renamed from: d  reason: collision with root package name */
    public static Map<Integer, a> f27227d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static Map<Integer, com.bytedance.common.wschannel.c.a> f27228e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static b f27229f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f27230g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f27231h;

    /* renamed from: i  reason: collision with root package name */
    private static a f27232i = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private static String f27233j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f27234k;

    /* access modifiers changed from: package-private */
    public static class a implements d.a {
        static {
            Covode.recordClassIndex(16051);
        }

        private a() {
        }

        @Override // com.bytedance.common.wschannel.d.a
        public final void a() {
            j.f27230g = false;
            if (j.f27229f == null || j.f27229f.f27235a) {
                j.f27225b.a(j.f27226c);
            }
        }

        @Override // com.bytedance.common.wschannel.d.a
        public final void b() {
            j.f27230g = true;
            if (j.f27229f == null || j.f27229f.f27235a) {
                j.f27225b.b(j.f27226c);
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27235a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Integer, a> f27236b;

        static {
            Covode.recordClassIndex(16052);
        }

        private b() {
            this.f27236b = new ConcurrentHashMap();
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static void b() {
        if (!f27231h) {
            throw new IllegalStateException("please init first");
        }
    }

    static {
        Covode.recordClassIndex(16049);
    }

    public static void a() {
        MethodCollector.i(10558);
        b();
        synchronized (f27224a) {
            try {
                b bVar = f27229f;
                if (!(bVar == null || bVar.f27235a)) {
                    f27229f.f27235a = true;
                    if (!f27229f.f27236b.isEmpty()) {
                        for (a aVar : f27229f.f27236b.values()) {
                            a(aVar);
                        }
                        f27229f.f27236b.clear();
                    } else {
                        f27225b.a((Context) f27226c, true);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.common.wschannel.j.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(16050);
                        }

                        public final void run() {
                            if (j.f27230g) {
                                j.f27225b.b(j.f27226c);
                            } else {
                                j.f27225b.a(j.f27226c);
                            }
                        }
                    }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    MethodCollector.o(10558);
                }
            } finally {
                MethodCollector.o(10558);
            }
        }
    }

    public static void a(a aVar) {
        MethodCollector.i(10716);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", p.f112733a);
        jSONObject.put("status", 2);
        com.bytedance.apm.b.a("aweme_long_connection_status", jSONObject, (JSONObject) null, (JSONObject) null);
        ac.a("2->registerChannel ");
        b();
        synchronized (f27224a) {
            try {
                b bVar = f27229f;
                if (bVar == null || bVar.f27235a) {
                    ac.a("3->doRealRegisterOrParametersChangedMethod ");
                    f27227d.put(Integer.valueOf(aVar.f26993a), aVar);
                    f27225b.a(f27226c, b(aVar));
                } else {
                    f27229f.f27236b.put(Integer.valueOf(aVar.f26993a), aVar);
                }
            } finally {
                MethodCollector.o(10716);
            }
        }
    }

    private static SsWsApp b(a aVar) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cf, code lost:
        if (r5 != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Application r20, com.bytedance.common.wschannel.app.e r21) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.j.a(android.app.Application, com.bytedance.common.wschannel.app.e):void");
    }

    private static Intent a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
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
    private static android.content.Intent b(android.app.Application r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.j.b(android.app.Application, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
