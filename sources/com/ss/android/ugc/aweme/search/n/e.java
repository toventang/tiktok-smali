package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.track.b;
import com.bytedance.track.c;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class e implements b<e> {

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f121546b = n.b("general_search", "search_result", "goods_search");

    /* renamed from: c  reason: collision with root package name */
    public static final a f121547c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f121548a;

    /* renamed from: d  reason: collision with root package name */
    private final String f121549d;

    public static e a(Map<String, String> map) {
        l.d(map, "");
        return new e(map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f121548a, ((e) obj).f121548a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f121548a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchExtraSource(extraParamMap=" + this.f121548a + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79171);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.search.n.e$a$a  reason: collision with other inner class name */
        static final class C3140a extends m implements h.f.a.a<e> {
            final /* synthetic */ Map $map;
            final /* synthetic */ e $source;

            static {
                Covode.recordClassIndex(79172);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3140a(e eVar, Map map) {
                super(0);
                this.$source = eVar;
                this.$map = map;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ e invoke() {
                Map map = this.$map;
                Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
                return e.a(ad.h(map));
            }
        }

        private static e a() {
            return (e) c.a(null, "tracker_key", e.class);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static boolean b(String str) {
            return e.f121546b.contains(str);
        }

        public static void a(Map<String, String> map) {
            l.d(map, "");
            e a2 = a();
            if (a2 != null) {
                a2.a(new C3140a(a2, map));
            }
        }

        public static Map<String, String> a(String str) {
            Map<String, String> map;
            l.d(str, "");
            if (!b(str)) {
                return new LinkedHashMap();
            }
            e eVar = (e) c.a(null, "tracker_key", e.class);
            if (eVar == null || (map = eVar.f121548a) == null) {
                return new LinkedHashMap();
            }
            return map;
        }
    }

    @Override // com.bytedance.provider.h
    public final String getSourceId() {
        return this.f121549d;
    }

    /* Return type fixed from 'com.bytedance.provider.h' to match base method */
    @Override // com.bytedance.track.b
    public final /* synthetic */ e makeCopy() {
        return a(this.f121548a);
    }

    public /* synthetic */ e() {
        this(new LinkedHashMap());
    }

    static {
        Covode.recordClassIndex(79170);
    }

    private e(Map<String, String> map) {
        l.d(map, "");
        this.f121548a = map;
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        this.f121549d = uuid;
    }

    public final void a(h.f.a.a<e> aVar) {
        l.d(aVar, "");
        b.a.a(this, aVar);
    }
}
