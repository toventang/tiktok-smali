package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.o.b;
import java.util.ArrayList;
import java.util.List;

public class d implements al {

    /* renamed from: a  reason: collision with root package name */
    public final b f48307a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48308b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f48309c;

    /* renamed from: d  reason: collision with root package name */
    private final an f48310d;

    /* renamed from: e  reason: collision with root package name */
    private final b.EnumC1183b f48311e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48312f;

    /* renamed from: g  reason: collision with root package name */
    private c f48313g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f48314h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f48315i;

    /* renamed from: j  reason: collision with root package name */
    private final List<am> f48316j = new ArrayList();

    static {
        Covode.recordClassIndex(29150);
    }

    @Override // com.facebook.imagepipeline.n.al
    public final b a() {
        return this.f48307a;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final String b() {
        return this.f48308b;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final an c() {
        return this.f48310d;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final Object d() {
        return this.f48309c;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final b.EnumC1183b e() {
        return this.f48311e;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final synchronized boolean f() {
        boolean z;
        MethodCollector.i(14353);
        z = this.f48312f;
        MethodCollector.o(14353);
        return z;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final synchronized c g() {
        c cVar;
        MethodCollector.i(14354);
        cVar = this.f48313g;
        MethodCollector.o(14354);
        return cVar;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final synchronized boolean h() {
        boolean z;
        MethodCollector.i(14355);
        z = this.f48314h;
        MethodCollector.o(14355);
        return z;
    }

    public final synchronized List<am> i() {
        MethodCollector.i(14376);
        if (this.f48315i) {
            MethodCollector.o(14376);
            return null;
        }
        this.f48315i = true;
        ArrayList arrayList = new ArrayList(this.f48316j);
        MethodCollector.o(14376);
        return arrayList;
    }

    public static void a(List<am> list) {
        if (list != null) {
            for (am amVar : list) {
                amVar.a();
            }
        }
    }

    public static void b(List<am> list) {
        if (list != null) {
            for (am amVar : list) {
                amVar.b();
            }
        }
    }

    public static void c(List<am> list) {
        if (list != null) {
            for (am amVar : list) {
                amVar.c();
            }
        }
    }

    public static void d(List<am> list) {
        if (list != null) {
            for (am amVar : list) {
                amVar.d();
            }
        }
    }

    public final synchronized List<am> a(c cVar) {
        MethodCollector.i(14358);
        if (cVar == this.f48313g) {
            MethodCollector.o(14358);
            return null;
        }
        this.f48313g = cVar;
        ArrayList arrayList = new ArrayList(this.f48316j);
        MethodCollector.o(14358);
        return arrayList;
    }

    public final synchronized List<am> b(boolean z) {
        MethodCollector.i(14359);
        if (z == this.f48314h) {
            MethodCollector.o(14359);
            return null;
        }
        this.f48314h = z;
        ArrayList arrayList = new ArrayList(this.f48316j);
        MethodCollector.o(14359);
        return arrayList;
    }

    public final synchronized List<am> a(boolean z) {
        MethodCollector.i(14357);
        if (z == this.f48312f) {
            MethodCollector.o(14357);
            return null;
        }
        this.f48312f = z;
        ArrayList arrayList = new ArrayList(this.f48316j);
        MethodCollector.o(14357);
        return arrayList;
    }

    @Override // com.facebook.imagepipeline.n.al
    public final void a(am amVar) {
        boolean z;
        MethodCollector.i(14356);
        synchronized (this) {
            try {
                this.f48316j.add(amVar);
                z = this.f48315i;
            } finally {
                MethodCollector.o(14356);
            }
        }
        if (z) {
            amVar.a();
        }
    }

    public d(b bVar, String str, an anVar, Object obj, b.EnumC1183b bVar2, boolean z, boolean z2, c cVar) {
        this.f48307a = bVar;
        this.f48308b = str;
        this.f48310d = anVar;
        this.f48309c = obj;
        this.f48311e = bVar2;
        this.f48312f = z;
        this.f48313g = cVar;
        this.f48314h = z2;
    }
}
