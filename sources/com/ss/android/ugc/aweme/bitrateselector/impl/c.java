package com.ss.android.ugc.aweme.bitrateselector.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.d;
import com.ss.android.ugc.f.a.a.a.b.f;
import com.ss.android.ugc.f.a.a.a.b.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends f {

    /* renamed from: f  reason: collision with root package name */
    private final g f68718f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, g> f68719g;

    static {
        Covode.recordClassIndex(42303);
    }

    public static class a extends f.a {
        static {
            Covode.recordClassIndex(42304);
        }

        @Override // com.ss.android.ugc.f.a.a.a.b.f.a, com.ss.android.ugc.f.a.a.a.b.a.AbstractC3868a
        public final g a() {
            c cVar = new c(this.f145555a, new f.a(this.f145555a).a(this.f145556b).b(this.f145557c).a(this.f145558d).a());
            cVar.a(this.f145556b);
            cVar.b(this.f145557c);
            cVar.a(this.f145558d);
            return cVar;
        }

        public a(d dVar) {
            super(dVar);
        }
    }

    private static int b(com.ss.android.ugc.f.a.a.a.a.a aVar) {
        if (aVar == null) {
            return -1;
        }
        return com.ss.android.ugc.aweme.cf.a.a.a(Double.valueOf(aVar.a()), Double.valueOf(aVar.b()), Double.valueOf(aVar.c()), Double.valueOf(aVar.d()), Double.valueOf(aVar.e()));
    }

    protected c(d dVar, g gVar) {
        super(dVar);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f68719g = concurrentHashMap;
        this.f68718f = gVar;
        concurrentHashMap.put(Integer.valueOf(b(this.f145554d)), gVar);
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.f, com.ss.android.ugc.f.a.a.a.b.g
    public final com.ss.android.ugc.f.a.a.a.a.f a(List<? extends com.ss.android.ugc.f.a.a.a.a.c> list, Map<String, Object> map) {
        Object obj = map.get("KEY_AUTO_BITRATE_SET");
        if (!(obj instanceof com.ss.android.ugc.f.a.a.a.a.a)) {
            return this.f68718f.a(list, map);
        }
        com.ss.android.ugc.f.a.a.a.a.a aVar = (com.ss.android.ugc.f.a.a.a.a.a) obj;
        g gVar = this.f68719g.get(Integer.valueOf(b(aVar)));
        if (gVar == null) {
            gVar = new f.a(this.f145551a).a(aVar).b(this.f145553c).a(this.f145552b).a();
            this.f68719g.put(Integer.valueOf(b(aVar)), gVar);
        }
        return gVar.a(list, map);
    }
}
