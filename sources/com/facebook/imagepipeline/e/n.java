package com.facebook.imagepipeline.e;

import android.content.ContentResolver;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.common.d.i;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ab;
import com.facebook.imagepipeline.n.ac;
import com.facebook.imagepipeline.n.ad;
import com.facebook.imagepipeline.n.af;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.n.ai;
import com.facebook.imagepipeline.n.aj;
import com.facebook.imagepipeline.n.ak;
import com.facebook.imagepipeline.n.ao;
import com.facebook.imagepipeline.n.ap;
import com.facebook.imagepipeline.n.ar;
import com.facebook.imagepipeline.n.as;
import com.facebook.imagepipeline.n.az;
import com.facebook.imagepipeline.n.bc;
import com.facebook.imagepipeline.n.j;
import com.facebook.imagepipeline.n.l;
import com.facebook.imagepipeline.n.o;
import com.facebook.imagepipeline.n.w;
import com.facebook.imagepipeline.n.x;
import com.facebook.imagepipeline.n.y;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.p.b;
import com.facebook.imagepipeline.q.c;
import java.util.HashMap;
import java.util.Map;

public final class n {
    private final boolean A;
    private final boolean B;
    private final c C;
    private ak<e> D;

    /* renamed from: a  reason: collision with root package name */
    final boolean f47946a;

    /* renamed from: b  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47947b;

    /* renamed from: c  reason: collision with root package name */
    ak<e> f47948c;

    /* renamed from: d  reason: collision with root package name */
    ak<e> f47949d;

    /* renamed from: e  reason: collision with root package name */
    ak<a<h>> f47950e;

    /* renamed from: f  reason: collision with root package name */
    ak<a<h>> f47951f;

    /* renamed from: g  reason: collision with root package name */
    ak<Void> f47952g;

    /* renamed from: h  reason: collision with root package name */
    ak<Void> f47953h;

    /* renamed from: i  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47954i;

    /* renamed from: j  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47955j;

    /* renamed from: k  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47956k;

    /* renamed from: l  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47957l;

    /* renamed from: m  reason: collision with root package name */
    ak<a<com.facebook.imagepipeline.j.c>> f47958m;
    ak<a<com.facebook.imagepipeline.j.c>> n;
    ak<a<com.facebook.imagepipeline.j.c>> o;
    ak<a<com.facebook.imagepipeline.j.c>> p;
    Map<ak<a<com.facebook.imagepipeline.j.c>>, ak<a<com.facebook.imagepipeline.j.c>>> q = new HashMap();
    Map<ak<a<com.facebook.imagepipeline.j.c>>, ak<Void>> r = new HashMap();
    Map<ak<a<com.facebook.imagepipeline.j.c>>, ak<a<com.facebook.imagepipeline.j.c>>> s = new HashMap();
    private final ContentResolver t;
    private final m u;
    private final ag v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final az z;

    static {
        Covode.recordClassIndex(28995);
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> i() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13008);
        if (this.f47954i == null) {
            this.f47954i = d(this.u.b());
        }
        akVar = this.f47954i;
        MethodCollector.o(13008);
        return akVar;
    }

    private ak<a<h>> a() {
        MethodCollector.i(12293);
        synchronized (this) {
            try {
                b.a();
                if (this.f47951f == null) {
                    b.a();
                    this.f47951f = new ap(d());
                    b.a();
                }
                b.a();
            } catch (Throwable th) {
                MethodCollector.o(12293);
                throw th;
            }
        }
        ak<a<h>> akVar = this.f47951f;
        MethodCollector.o(12293);
        return akVar;
    }

    private ak<a<h>> b() {
        MethodCollector.i(12435);
        synchronized (this) {
            try {
                b.a();
                if (this.f47950e == null) {
                    b.a();
                    this.f47950e = new ap(h());
                    b.a();
                }
                b.a();
            } catch (Throwable th) {
                MethodCollector.o(12435);
                throw th;
            }
        }
        ak<a<h>> akVar = this.f47950e;
        MethodCollector.o(12435);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> c() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(12568);
        b.a();
        if (this.f47947b == null) {
            b.a();
            this.f47947b = e(f());
            b.a();
        }
        b.a();
        akVar = this.f47947b;
        MethodCollector.o(12568);
        return akVar;
    }

    private synchronized ak<e> d() {
        ak<e> akVar;
        MethodCollector.i(12569);
        b.a();
        if (this.f47949d == null) {
            b.a();
            this.f47949d = m.a(f(), this.z);
            b.a();
        }
        b.a();
        akVar = this.f47949d;
        MethodCollector.o(12569);
        return akVar;
    }

    private synchronized ak<Void> e() {
        ak<Void> akVar;
        MethodCollector.i(12679);
        b.a();
        if (this.f47953h == null) {
            b.a();
            this.f47953h = m.k(d());
            b.a();
        }
        b.a();
        akVar = this.f47953h;
        MethodCollector.o(12679);
        return akVar;
    }

    private synchronized ak<Void> g() {
        ak<Void> akVar;
        MethodCollector.i(12910);
        b.a();
        if (this.f47952g == null) {
            b.a();
            this.f47952g = m.k(h());
            b.a();
        }
        b.a();
        akVar = this.f47952g;
        MethodCollector.o(12910);
        return akVar;
    }

    private synchronized ak<e> h() {
        ak<e> akVar;
        MethodCollector.i(12912);
        b.a();
        if (this.f47948c == null) {
            b.a();
            this.f47948c = m.a(f(this.u.b()), this.z);
            b.a();
        }
        b.a();
        akVar = this.f47948c;
        MethodCollector.o(12912);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> k() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13184);
        if (this.f47956k == null) {
            m mVar = this.u;
            this.f47956k = h(new ad(mVar.f47937e.a(), mVar.f47933a));
        }
        akVar = this.f47956k;
        MethodCollector.o(13184);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> m() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13342);
        if (this.p == null) {
            m mVar = this.u;
            this.p = d(new ao(mVar.f47937e.a(), mVar.f47938f, mVar.f47933a));
        }
        akVar = this.p;
        MethodCollector.o(13342);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> n() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13417);
        if (this.f47958m == null) {
            m mVar = this.u;
            this.f47958m = d(new ac(mVar.f47937e.a(), mVar.f47938f, mVar.f47934b));
        }
        akVar = this.f47958m;
        MethodCollector.o(13417);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> o() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13418);
        if (this.n == null) {
            m mVar = this.u;
            this.n = d(new w(mVar.f47937e.a(), mVar.f47938f, mVar.f47935c));
        }
        akVar = this.n;
        MethodCollector.o(13418);
        return akVar;
    }

    private synchronized ak<e> f() {
        ak<e> akVar;
        boolean z2;
        MethodCollector.i(12801);
        b.a();
        if (this.D == null) {
            b.a();
            m mVar = this.u;
            com.facebook.imagepipeline.n.a a2 = m.a(f(new af(mVar.f47938f, mVar.f47936d, this.v)));
            this.D = a2;
            m mVar2 = this.u;
            if (!this.w || this.A) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.D = mVar2.a(a2, z2, this.C);
            b.a();
        }
        b.a();
        akVar = this.D;
        MethodCollector.o(12801);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> j() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13099);
        if (this.f47955j == null) {
            ab b2 = this.u.b();
            bc[] bcVarArr = {this.u.a()};
            j a2 = m.a(this.u.a(m.a(bcVarArr), this.C), this.u.l(this.u.a(m.a(f(b2)), this.C)));
            m mVar = this.u;
            this.f47955j = e(new ar(this.u.f47942j, new as(mVar.f47939g, mVar.f47940h, mVar.f47942j, a2)));
        }
        akVar = this.f47955j;
        MethodCollector.o(13099);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> l() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13262);
        if (this.f47957l == null) {
            m mVar = this.u;
            x xVar = new x(mVar.f47937e.a(), mVar.f47938f, mVar.f47933a);
            m mVar2 = this.u;
            this.f47957l = a(xVar, new bc[]{new y(mVar2.f47937e.a(), mVar2.f47938f, mVar2.f47933a), this.u.a()});
        }
        akVar = this.f47957l;
        MethodCollector.o(13262);
        return akVar;
    }

    private synchronized ak<a<com.facebook.imagepipeline.j.c>> p() {
        ak<a<com.facebook.imagepipeline.j.c>> akVar;
        MethodCollector.i(13505);
        if (this.o == null) {
            ak<e> lVar = new l(this.u.f47938f);
            if (com.facebook.common.l.c.f47136a && (!this.x || com.facebook.common.l.c.f47139d == null)) {
                lVar = this.u.m(lVar);
            }
            this.o = e(this.u.a(m.a(lVar), true, this.C));
        }
        akVar = this.o;
        MethodCollector.o(13505);
        return akVar;
    }

    private ak<e> a(bc<e>[] bcVarArr) {
        return this.u.a(m.a(bcVarArr), true, this.C);
    }

    private ak<a<com.facebook.imagepipeline.j.c>> d(ak<e> akVar) {
        return a(akVar, new bc[]{this.u.a()});
    }

    private ak<a<com.facebook.imagepipeline.j.c>> e(ak<e> akVar) {
        b.a();
        ak<a<com.facebook.imagepipeline.j.c>> h2 = h(this.u.e(akVar));
        b.a();
        return h2;
    }

    private ak<e> g(ak<e> akVar) {
        b.a();
        if (this.y) {
            akVar = this.u.h(akVar);
        }
        o f2 = this.u.f(this.u.g(akVar));
        b.a();
        return f2;
    }

    private ak<a<com.facebook.imagepipeline.j.c>> h(ak<a<com.facebook.imagepipeline.j.c>> akVar) {
        return this.u.b(m.a(this.u.c(this.u.d(akVar)), this.z));
    }

    private ak<e> f(ak<e> akVar) {
        if (com.facebook.common.l.c.f47136a && (!this.x || com.facebook.common.l.c.f47139d == null)) {
            akVar = this.u.m(akVar);
        }
        if (this.B) {
            akVar = g(akVar);
        }
        return this.u.i(this.u.j(akVar));
    }

    private static String a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private static void d(com.facebook.imagepipeline.o.b bVar) {
        boolean z2;
        i.a(bVar);
        if (bVar.mLowestPermittedRequestLevel.getValue() <= b.EnumC1183b.ENCODED_MEMORY_CACHE.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized ak<Void> b(ak<a<com.facebook.imagepipeline.j.c>> akVar) {
        ak<Void> akVar2;
        MethodCollector.i(13716);
        if (!this.r.containsKey(akVar)) {
            this.r.put(akVar, m.k(akVar));
        }
        akVar2 = this.r.get(akVar);
        MethodCollector.o(13716);
        return akVar2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ak<a<com.facebook.imagepipeline.j.c>> c(ak<a<com.facebook.imagepipeline.j.c>> akVar) {
        ak<a<com.facebook.imagepipeline.j.c>> akVar2;
        MethodCollector.i(13771);
        akVar2 = this.s.get(akVar);
        if (akVar2 == null) {
            m mVar = this.u;
            akVar2 = new com.facebook.imagepipeline.n.i(akVar, mVar.f47944l, mVar.f47945m, mVar.n);
            this.s.put(akVar, akVar2);
        }
        MethodCollector.o(13771);
        return akVar2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ak<a<com.facebook.imagepipeline.j.c>> a(ak<a<com.facebook.imagepipeline.j.c>> akVar) {
        ak<a<com.facebook.imagepipeline.j.c>> akVar2;
        MethodCollector.i(13715);
        if (!this.q.containsKey(akVar)) {
            m mVar = this.u;
            aj ajVar = new aj(akVar, mVar.f47943k, mVar.f47937e.d());
            m mVar2 = this.u;
            this.q.put(akVar, new ai(mVar2.f47941i, mVar2.f47942j, ajVar));
        }
        akVar2 = this.q.get(akVar);
        MethodCollector.o(13715);
        return akVar2;
    }

    public final ak<Void> b(com.facebook.imagepipeline.o.b bVar) {
        d(bVar);
        int i2 = bVar.mSourceUriType;
        if (i2 == 0) {
            return e();
        }
        if (i2 == 2 || i2 == 3) {
            return g();
        }
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(bVar.mSourceUri));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final ak<a<com.facebook.imagepipeline.j.c>> c(com.facebook.imagepipeline.o.b bVar) {
        try {
            com.facebook.imagepipeline.p.b.a();
            i.a(bVar);
            Uri uri = bVar.mSourceUri;
            i.a(uri, "Uri is null.");
            int i2 = bVar.mSourceUriType;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        ak<a<com.facebook.imagepipeline.j.c>> k2 = k();
                        com.facebook.imagepipeline.p.b.a();
                        return k2;
                    case 3:
                        if (bVar.isResizedImageDiskCacheActuallyEnabled()) {
                            ak<a<com.facebook.imagepipeline.j.c>> j2 = j();
                            com.facebook.imagepipeline.p.b.a();
                            return j2;
                        }
                        ak<a<com.facebook.imagepipeline.j.c>> i3 = i();
                        com.facebook.imagepipeline.p.b.a();
                        return i3;
                    case 4:
                        if (com.facebook.common.f.a.a(this.t.getType(uri))) {
                            ak<a<com.facebook.imagepipeline.j.c>> k3 = k();
                            com.facebook.imagepipeline.p.b.a();
                            return k3;
                        }
                        ak<a<com.facebook.imagepipeline.j.c>> l2 = l();
                        com.facebook.imagepipeline.p.b.a();
                        return l2;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        ak<a<com.facebook.imagepipeline.j.c>> o2 = o();
                        com.facebook.imagepipeline.p.b.a();
                        return o2;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        ak<a<com.facebook.imagepipeline.j.c>> n2 = n();
                        com.facebook.imagepipeline.p.b.a();
                        return n2;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        ak<a<com.facebook.imagepipeline.j.c>> p2 = p();
                        com.facebook.imagepipeline.p.b.a();
                        return p2;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        ak<a<com.facebook.imagepipeline.j.c>> m2 = m();
                        com.facebook.imagepipeline.p.b.a();
                        return m2;
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a(uri));
                }
            } else {
                ak<a<com.facebook.imagepipeline.j.c>> c2 = c();
                com.facebook.imagepipeline.p.b.a();
                return c2;
            }
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final ak<a<h>> a(com.facebook.imagepipeline.o.b bVar) {
        try {
            com.facebook.imagepipeline.p.b.a();
            d(bVar);
            Uri uri = bVar.mSourceUri;
            int i2 = bVar.mSourceUriType;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(uri));
                    }
                }
                ak<a<h>> b2 = b();
                com.facebook.imagepipeline.p.b.a();
                return b2;
            }
            ak<a<h>> a2 = a();
            com.facebook.imagepipeline.p.b.a();
            return a2;
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    private ak<a<com.facebook.imagepipeline.j.c>> a(ak<e> akVar, bc<e>[] bcVarArr) {
        return e(b(f(akVar), bcVarArr));
    }

    private ak<e> b(ak<e> akVar, bc<e>[] bcVarArr) {
        return m.a(a(bcVarArr), this.u.l(this.u.a(m.a(akVar), true, this.C)));
    }

    public n(ContentResolver contentResolver, m mVar, ag agVar, boolean z2, boolean z3, az azVar, boolean z4, boolean z5, boolean z6, boolean z7, c cVar) {
        this.t = contentResolver;
        this.u = mVar;
        this.v = agVar;
        this.w = z2;
        this.x = z3;
        this.z = azVar;
        this.A = z4;
        this.f47946a = z5;
        this.y = z6;
        this.B = z7;
        this.C = cVar;
    }
}
