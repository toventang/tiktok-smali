package com.bytedance.bpea.core.a;

import com.bytedance.bpea.basics.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<d, List<a>> f26616a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final b f26617b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(15675);
    }

    public static c a(f fVar, d dVar) {
        l.c(fVar, "");
        l.c(dVar, "");
        List<a> list = f26616a.get(dVar);
        if (list != null) {
            for (T t : list) {
                if (t.a(fVar)) {
                    return t.b(fVar);
                }
            }
        }
        return c.NOTHING;
    }
}
