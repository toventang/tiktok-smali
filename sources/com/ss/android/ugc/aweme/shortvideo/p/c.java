package com.ss.android.ugc.aweme.shortvideo.p;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f129554a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f129555b = i.a((h.f.a.a) a.f129556a);

    private static Map<String, e> a() {
        return (Map) f129555b.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Map<String, e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129556a = new a();

        static {
            Covode.recordClassIndex(85033);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, e> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(85032);
    }

    public static final e a(String str) {
        l.d(str, "");
        e eVar = a().get(str);
        if (eVar != null) {
            return eVar;
        }
        b bVar = new b(str);
        a().put(str, bVar);
        return bVar;
    }
}
