package com.bytedance.ies.im.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.a;
import com.bytedance.ies.im.core.api.a.b;
import com.bytedance.ies.im.core.api.a.c;
import com.bytedance.ies.im.core.api.d.d;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f34068a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f34069b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f34070c;

    private g() {
    }

    static {
        Covode.recordClassIndex(20289);
        g gVar = new g();
        f34068a = gVar;
        a.e().a(gVar);
    }

    public static final Map<String, String> a() {
        MethodCollector.i(326);
        if (SettingsManager.a().a("im_sdk_request_header_disable_cache", false)) {
            Map<String, String> b2 = b();
            MethodCollector.o(326);
            return b2;
        }
        synchronized (f34068a) {
            try {
                if (f34069b == null || f34070c) {
                    f34069b = b();
                }
            } finally {
                MethodCollector.o(326);
            }
        }
        Map<String, String> map = f34069b;
        if (map == null) {
            l.b();
        }
        map.put("iid", a.a().e());
        Map<String, String> map2 = f34069b;
        if (map2 == null) {
            l.b();
        }
        return map2;
    }

    private static Map<String, String> b() {
        f34070c = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d a2 = a.a();
        String e2 = a2.e();
        if (!TextUtils.isEmpty(e2)) {
            linkedHashMap.put("iid", e2);
        } else {
            f34070c = true;
        }
        int b2 = a2.b();
        if (b2 <= 0) {
            f34070c = true;
        }
        linkedHashMap.put("aid", String.valueOf(b2));
        String i2 = a2.i();
        if (!TextUtils.isEmpty(i2)) {
            linkedHashMap.put("user-agent", i2);
        } else {
            f34070c = true;
        }
        String j2 = a2.j();
        if (!TextUtils.isEmpty(j2)) {
            linkedHashMap.put("sim_mcc_mnc", j2);
        }
        String k2 = a2.k();
        if (!TextUtils.isEmpty(k2)) {
            linkedHashMap.put("net_mcc_mnc", k2);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.im.core.api.a.b
    public final void a(com.bytedance.ies.im.core.api.a.a aVar, c cVar) {
        l.d(aVar, "");
        a.b().b("SDKRequestHeader", "onAccountChange: ".concat(String.valueOf(aVar)));
        f34069b = null;
        f34070c = true;
    }
}
