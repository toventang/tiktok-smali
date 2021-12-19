package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import h.a.n;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class dq {

    /* renamed from: a  reason: collision with root package name */
    public static final dq f142835a = new dq();

    private dq() {
    }

    static {
        Covode.recordClassIndex(93445);
    }

    public static void a(String str) {
        c cVar = new c();
        if (str == null) {
            cVar.a("referrer", "referrer is null");
        } else if (str.hashCode() == 0 && str.equals("")) {
            cVar.a("referrer", "empty referrer");
        } else {
            Map<String, String> b2 = b(str);
            cVar.a("referrer", str);
            cVar.a("key_set", n.i(b2.keySet()).toString());
            for (Map.Entry<String, String> entry : b2.entrySet()) {
                cVar.a(entry.getKey(), entry.getValue());
            }
        }
        r.a("google_install_referrer", cVar.a());
    }

    private static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : p.c(str, new String[]{"&"})) {
            if (p.e((CharSequence) str2, (CharSequence) "=")) {
                List c2 = p.c(str2, new String[]{"="});
                if (c2.size() > 1) {
                    hashMap.put(c2.get(0), c2.get(1));
                }
            }
        }
        return hashMap;
    }
}
