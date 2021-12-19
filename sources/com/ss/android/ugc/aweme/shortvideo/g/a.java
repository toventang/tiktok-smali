package com.ss.android.ugc.aweme.shortvideo.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f128518a = i.a((h.f.a.a) b.f128521a);

    /* renamed from: b  reason: collision with root package name */
    public static final C3352a f128519b = new C3352a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f128520c = i.a((h.f.a.a) c.f128522a);

    public final Keva a() {
        return (Keva) this.f128520c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.a$a  reason: collision with other inner class name */
    public static final class C3352a {
        static {
            Covode.recordClassIndex(84265);
        }

        public static Map<String, Integer> a() {
            return (Map) a.f128518a.getValue();
        }

        private C3352a() {
        }

        public /* synthetic */ C3352a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Map<String, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f128521a = new b();

        static {
            Covode.recordClassIndex(84266);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class c extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f128522a = new c();

        static {
            Covode.recordClassIndex(84267);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("publish_bubble");
        }
    }

    static {
        Covode.recordClassIndex(84264);
    }

    public final int a(b bVar) {
        l.d(bVar, "");
        if (C3352a.a().get(bVar.f128524a) == null) {
            int i2 = a().getInt(bVar.f128524a, 0);
            C3352a.a().put(bVar.f128524a, Integer.valueOf(i2));
            return i2;
        }
        Integer num = C3352a.a().get(bVar.f128524a);
        if (num != null) {
            return num.intValue();
        }
        return bVar.f128525b;
    }
}
