package com.bytedance.lynx.hybrid.service.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.service.b.e;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f41242a = i.a(m.SYNCHRONIZED, b.f41246a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f41243b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, e> f41244c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f41245a = {new y(ab.a(a.class), "service", "getService()Lcom/bytedance/lynx/hybrid/service/impl/HybridService;")};

        public static c a() {
            return (c) c.f41242a.getValue();
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(25266);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(String str, ConcurrentHashMap<String, e> concurrentHashMap) {
            e eVar = concurrentHashMap.get(str);
            if (eVar != null) {
                return eVar;
            }
            e a2 = new e.a().a(str).a();
            concurrentHashMap.put(str, a2);
            return a2;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41246a = new b();

        static {
            Covode.recordClassIndex(25267);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    private c() {
        this.f41244c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(25265);
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final <T extends com.bytedance.lynx.hybrid.service.a.a> T a(Class<T> cls) {
        l.c(cls, "");
        return (T) a("default_bid", cls);
    }

    public final <T extends com.bytedance.lynx.hybrid.service.a.a> T a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        e a2 = a.a(str, this.f41244c);
        String name = cls.getName();
        l.a((Object) name, "");
        T t = (T) a2.a(name);
        if (t != null) {
            return t;
        }
        e a3 = a.a("default_bid", this.f41244c);
        String name2 = cls.getName();
        l.a((Object) name2, "");
        T t2 = (T) a3.a(name2);
        if (!(t2 instanceof com.bytedance.lynx.hybrid.service.a.a)) {
            return null;
        }
        return t2;
    }

    public final <T extends com.bytedance.lynx.hybrid.service.a.a> c a(Class<T> cls, T t) {
        l.c(cls, "");
        l.c(t, "");
        return a("default_bid", cls, t);
    }

    private <T extends com.bytedance.lynx.hybrid.service.a.a> c a(String str, Class<T> cls, T t) {
        l.c(str, "");
        l.c(cls, "");
        l.c(t, "");
        e a2 = a.a(str, this.f41244c);
        String name = cls.getName();
        l.a((Object) name, "");
        a2.a(name, t);
        return this;
    }
}
