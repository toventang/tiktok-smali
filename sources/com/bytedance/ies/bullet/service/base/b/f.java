package com.bytedance.ies.bullet.service.base.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.c;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<String, c> f32580a;

    /* renamed from: b  reason: collision with root package name */
    private String f32581b;

    static {
        Covode.recordClassIndex(19338);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentHashMap<String, c> f32582a = new ConcurrentHashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public String f32583b = "default_bid";

        static {
            Covode.recordClassIndex(19339);
        }

        public final f a() {
            return new f(this, (byte) 0);
        }

        public final a a(String str) {
            l.c(str, "");
            this.f32583b = str;
            return this;
        }

        public final <T extends c> a a(Class<? extends T> cls, T t) {
            l.c(cls, "");
            l.c(t, "");
            ConcurrentHashMap<String, c> concurrentHashMap = this.f32582a;
            String name = cls.getName();
            l.a((Object) name, "");
            concurrentHashMap.put(name, t);
            return this;
        }
    }

    private f() {
        this.f32580a = new ConcurrentHashMap<>();
    }

    public final c a(String str) {
        l.c(str, "");
        return this.f32580a.get(str);
    }

    private f(a aVar) {
        this();
        this.f32581b = aVar.f32583b;
        this.f32580a.putAll(aVar.f32582a);
    }

    public /* synthetic */ f(a aVar, byte b2) {
        this(aVar);
    }

    public final void a(String str, c cVar) {
        l.c(str, "");
        l.c(cVar, "");
        c cVar2 = this.f32580a.get(str);
        if (cVar2 != null) {
            cVar2.a();
        }
        String str2 = this.f32581b;
        if (str2 == null) {
            l.a("bid");
        }
        cVar.b(str2);
        this.f32580a.put(str, cVar);
    }
}
