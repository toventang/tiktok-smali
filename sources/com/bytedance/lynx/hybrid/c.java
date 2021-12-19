package com.bytedance.lynx.hybrid;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.e;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.i;
import h.m;
import java.util.HashMap;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final h f40899e = i.a(m.SYNCHRONIZED, b.f40913a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f40900f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f40901a;

    /* renamed from: b  reason: collision with root package name */
    public Application f40902b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<com.bytedance.lynx.hybrid.h.a, e> f40903c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.lynx.hybrid.a.a f40904d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f40912a = {new y(ab.a(a.class), "instance", "getInstance()Lcom/bytedance/lynx/hybrid/HybridEnvironment;")};

        public static c a() {
            return (c) c.f40899e.getValue();
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(25077);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40913a = new b();

        static {
            Covode.recordClassIndex(25078);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    public final Application a() {
        Application application = this.f40902b;
        if (application == null) {
            l.a("context");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(25076);
    }

    public final <T> T a(com.bytedance.lynx.hybrid.h.a aVar, Class<T> cls) {
        l.c(aVar, "");
        l.c(cls, "");
        e eVar = this.f40903c.get(aVar);
        if (eVar != null) {
            return (T) eVar.a(cls);
        }
        return null;
    }

    public final <T> void a(com.bytedance.lynx.hybrid.h.a aVar, Class<T> cls, T t) {
        l.c(aVar, "");
        l.c(cls, "");
        if (this.f40903c.get(aVar) == null) {
            this.f40903c.put(aVar, new com.bytedance.lynx.hybrid.service.b.a());
        }
        e eVar = this.f40903c.get(aVar);
        if (eVar != null) {
            eVar.a(cls, t);
        }
    }
}
