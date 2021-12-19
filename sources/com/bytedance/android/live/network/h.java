package com.bytedance.android.live.network;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.live.network.b;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.model.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class h {

    /* renamed from: d  reason: collision with root package name */
    private static volatile h f12121d;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, Object> f12122a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f12123b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class, b> f12124c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(6637);
    }

    public static String c() {
        return ((IHostNetwork) a.a(IHostNetwork.class)).getHostDomain();
    }

    private h() {
    }

    public final Map<String, String> b() {
        Map<String, String> commonParams = ((IHostNetwork) a.a(IHostNetwork.class)).getCommonParams();
        b bVar = this.f12123b;
        if (bVar != null) {
            bVar.a(commonParams);
        }
        return commonParams;
    }

    public static h a() {
        MethodCollector.i(9608);
        if (f12121d == null) {
            synchronized (h.class) {
                try {
                    if (f12121d == null) {
                        f12121d = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9608);
                    throw th;
                }
            }
        }
        h hVar = f12121d;
        MethodCollector.o(9608);
        return hVar;
    }

    public final void a(Map<Class, b> map) {
        this.f12124c.putAll(map);
    }

    public final <T> b<T> a(Class<T> cls) {
        return this.f12124c.get(cls);
    }

    public final c<com.bytedance.android.livesdkapi.model.a> a(String str, List<com.bytedance.android.live.base.model.a> list, Object obj) {
        b bVar = this.f12123b;
        if (bVar == null) {
            return ((IHostNetwork) a.a(IHostNetwork.class)).get(str, list, obj);
        }
        b.a a2 = bVar.a(new b.a(str, list));
        return ((IHostNetwork) a.a(IHostNetwork.class)).get(a2.f12103a, a2.f12104b, obj);
    }

    public final c<com.bytedance.android.livesdkapi.model.a> a(String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr) {
        return a(str, list, str2, bArr, null);
    }

    public final c<com.bytedance.android.livesdkapi.model.a> a(String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr, Object obj) {
        b bVar = this.f12123b;
        if (bVar == null) {
            return ((IHostNetwork) a.a(IHostNetwork.class)).post(str, list, str2, bArr, obj);
        }
        b.a a2 = bVar.a(new b.a(str, list));
        return ((IHostNetwork) a.a(IHostNetwork.class)).post(a2.f12103a, a2.f12104b, str2, bArr, obj);
    }

    public final c<com.bytedance.android.livesdkapi.model.a> a(int i2, String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr, long j2, String str3) {
        b bVar = this.f12123b;
        if (bVar == null) {
            return ((IHostNetwork) a.a(IHostNetwork.class)).uploadFile(i2, str, list, str2, bArr, j2, str3);
        }
        b.a a2 = bVar.a(new b.a(str, list));
        return ((IHostNetwork) a.a(IHostNetwork.class)).uploadFile(i2, a2.f12103a, a2.f12104b, str2, bArr, j2, str3);
    }
}
