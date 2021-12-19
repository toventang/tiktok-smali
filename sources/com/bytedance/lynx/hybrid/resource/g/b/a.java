package com.bytedance.lynx.hybrid.resource.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.c;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Map<String, c>> f41187a = new HashMap<>();

    static {
        Covode.recordClassIndex(25229);
    }

    public final c a(String str, String str2) {
        boolean z;
        MethodCollector.i(10362);
        l.c(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        c cVar = null;
        if (z) {
            MethodCollector.o(10362);
            return null;
        }
        synchronized (this.f41187a) {
            try {
                Map<String, c> map = this.f41187a.get(str2);
                if (map != null) {
                    cVar = map.get(str);
                }
            } finally {
                MethodCollector.o(10362);
            }
        }
        return cVar;
    }
}
