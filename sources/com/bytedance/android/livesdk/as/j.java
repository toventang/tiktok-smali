package com.bytedance.android.livesdk.as;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.g;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import h.v;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14116a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(7820);
    }

    public static final Map<String, String> a(String str) {
        l.d(str, "");
        URI b2 = g.b(str);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        try {
            HashMap hashMap = new HashMap();
            Map<String, List<String>> map = null;
            if (cookieHandler != null) {
                try {
                    map = cookieHandler.get(b2, hashMap);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (map != null && (!map.isEmpty())) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    StringBuilder sb = new StringBuilder();
                    if ((p.a("X-SS-Cookie", key, true) || p.a("Cookie", key, true) || p.a("Cookie2", key, true)) && (!value.isEmpty())) {
                        int i2 = 0;
                        for (String str2 : value) {
                            if (i2 > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i2++;
                        }
                        return ag.c(v.a(key, sb.toString()));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return new HashMap();
    }
}
