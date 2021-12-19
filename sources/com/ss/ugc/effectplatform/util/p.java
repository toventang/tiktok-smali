package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f153988a = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(102685);
    }

    public static String a(Map<String, String> map, String str) {
        l.c(map, "");
        l.c(str, "");
        StringBuilder sb = new StringBuilder(str);
        if (!map.isEmpty()) {
            sb.append("?");
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!u.a(key) && !u.a(value)) {
                    if (i2 == 0) {
                        sb.append(key).append("=").append(value);
                    } else {
                        sb.append("&").append(key).append("=").append(value);
                    }
                }
                i2++;
            }
        }
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
