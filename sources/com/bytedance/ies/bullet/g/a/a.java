package com.bytedance.ies.bullet.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.c;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Map<String, c>> f32161a = new HashMap<>();

    static {
        Covode.recordClassIndex(18856);
    }

    public final c a(String str, String str2) {
        boolean z;
        MethodCollector.i(6973);
        l.c(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        c cVar = null;
        if (z) {
            MethodCollector.o(6973);
            return null;
        }
        synchronized (this.f32161a) {
            try {
                Map<String, c> map = this.f32161a.get(str2);
                if (map != null) {
                    cVar = map.get(str);
                }
            } finally {
                MethodCollector.o(6973);
            }
        }
        return cVar;
    }
}
