package com.bytedance.android.ecommerce.e;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.android.ecommerce.j.b;
import com.bytedance.android.ecommerce.j.d;
import com.bytedance.android.ecommerce.j.e;
import com.bytedance.android.ecommerce.j.f;
import com.bytedance.android.ecommerce.j.g;
import com.bytedance.android.ecommerce.j.h;
import com.bytedance.android.ecommerce.j.i;
import com.bytedance.android.ecommerce.j.j;
import com.bytedance.android.ecommerce.j.k;
import com.bytedance.android.ecommerce.j.l;
import com.bytedance.android.ecommerce.j.m;
import com.bytedance.android.ecommerce.j.n;
import com.bytedance.android.ecommerce.j.o;
import com.bytedance.android.ecommerce.j.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public static c f7063a = new c();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7064b;

    /* renamed from: c  reason: collision with root package name */
    private a f7065c;

    /* renamed from: d  reason: collision with root package name */
    private volatile e f7066d;

    /* renamed from: e  reason: collision with root package name */
    private volatile h f7067e;

    /* renamed from: f  reason: collision with root package name */
    private volatile a f7068f;

    /* renamed from: g  reason: collision with root package name */
    private volatile f f7069g;

    /* renamed from: h  reason: collision with root package name */
    private volatile i f7070h;

    /* renamed from: i  reason: collision with root package name */
    private volatile j f7071i;

    /* renamed from: j  reason: collision with root package name */
    private volatile d f7072j;

    /* renamed from: k  reason: collision with root package name */
    private volatile k f7073k;

    /* renamed from: l  reason: collision with root package name */
    private volatile g f7074l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7075m;

    @Override // com.bytedance.android.ecommerce.e.e
    public final boolean a() {
        return this.f7064b;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final a d() {
        return this.f7065c;
    }

    static {
        Covode.recordClassIndex(3380);
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final e b() {
        MethodCollector.i(7618);
        if (this.f7066d == null) {
            synchronized (this) {
                try {
                    if (this.f7066d == null) {
                        this.f7066d = new com.bytedance.android.ecommerce.j.a(this.f7065c.f7031c, this.f7065c.f7032d, this.f7065c.f7033e, h());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7618);
                    throw th;
                }
            }
        }
        e eVar = this.f7066d;
        MethodCollector.o(7618);
        return eVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final h c() {
        MethodCollector.i(7620);
        if (this.f7067e == null) {
            synchronized (this) {
                try {
                    if (this.f7067e == null) {
                        this.f7067e = new m();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7620);
                    throw th;
                }
            }
        }
        h hVar = this.f7067e;
        MethodCollector.o(7620);
        return hVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final a e() {
        MethodCollector.i(7682);
        if (this.f7068f == null) {
            synchronized (this) {
                try {
                    if (this.f7068f == null) {
                        this.f7068f = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7682);
                    throw th;
                }
            }
        }
        a aVar = this.f7068f;
        MethodCollector.o(7682);
        return aVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final f f() {
        MethodCollector.i(7683);
        if (this.f7069g == null) {
            synchronized (this) {
                try {
                    if (this.f7069g == null) {
                        this.f7069g = new com.bytedance.android.ecommerce.j.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7683);
                    throw th;
                }
            }
        }
        f fVar = this.f7069g;
        MethodCollector.o(7683);
        return fVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final i g() {
        MethodCollector.i(7684);
        if (this.f7070h == null) {
            synchronized (this) {
                try {
                    if (this.f7070h == null) {
                        this.f7070h = new n(this.f7065c.f7029a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7684);
                    throw th;
                }
            }
        }
        i iVar = this.f7070h;
        MethodCollector.o(7684);
        return iVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final j h() {
        MethodCollector.i(7685);
        if (this.f7071i == null) {
            synchronized (this) {
                try {
                    if (this.f7071i == null) {
                        this.f7071i = new o();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7685);
                    throw th;
                }
            }
        }
        j jVar = this.f7071i;
        MethodCollector.o(7685);
        return jVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final d i() {
        MethodCollector.i(7687);
        if (this.f7072j == null) {
            synchronized (this) {
                try {
                    if (this.f7072j == null) {
                        this.f7072j = new com.bytedance.android.ecommerce.k.b(this.f7065c.f7029a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7687);
                    throw th;
                }
            }
        }
        d dVar = this.f7072j;
        MethodCollector.o(7687);
        return dVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final k j() {
        MethodCollector.i(7688);
        if (this.f7073k == null) {
            synchronized (this) {
                try {
                    if (this.f7073k == null) {
                        this.f7073k = new p(this.f7065c.p);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7688);
                    throw th;
                }
            }
        }
        k kVar = this.f7073k;
        MethodCollector.o(7688);
        return kVar;
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final g k() {
        MethodCollector.i(7690);
        if (this.f7074l == null) {
            synchronized (this) {
                try {
                    if (this.f7074l == null) {
                        this.f7074l = new l(this.f7065c.f7029a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7690);
                    throw th;
                }
            }
        }
        g gVar = this.f7074l;
        MethodCollector.o(7690);
        return gVar;
    }

    private static void a(Class cls) {
        com.bytedance.ies.xbridge.a.a(cls, com.bytedance.ies.xbridge.e.ALL, null, 4);
    }

    @Override // com.bytedance.android.ecommerce.e.e
    public final void a(final a aVar) {
        a aVar2 = this.f7065c;
        if (aVar2 == null) {
            this.f7065c = aVar;
        } else {
            if (TextUtils.isEmpty(aVar2.f7030b) && !TextUtils.isEmpty(aVar.f7030b)) {
                aVar2.f7030b = aVar.f7030b;
            }
            if (!(aVar.f7031c == null || aVar.f7032d == null || aVar.f7033e == null)) {
                aVar2.f7031c = aVar.f7031c;
                aVar2.f7032d = aVar.f7032d;
                aVar2.f7033e = aVar.f7033e;
            }
            if (!TextUtils.isEmpty(aVar.f7035g)) {
                aVar2.f7035g = aVar.f7035g;
            }
            if (!TextUtils.isEmpty(aVar.f7036h)) {
                aVar2.f7036h = aVar.f7036h;
            }
            if (!TextUtils.isEmpty(aVar.f7037i)) {
                aVar2.f7037i = aVar.f7037i;
            }
            if (!TextUtils.isEmpty(aVar.f7038j)) {
                aVar2.f7038j = aVar.f7038j;
            }
            if (aVar.f7039k != null) {
                aVar2.f7039k = aVar.f7039k;
            }
            if (!TextUtils.isEmpty(aVar.f7040l)) {
                aVar2.f7040l = aVar.f7040l;
            }
            if (aVar.f7041m != null) {
                aVar2.f7041m = aVar.f7041m;
            }
            if (!TextUtils.isEmpty(aVar.o)) {
                aVar2.o = aVar.o;
            }
            if (!TextUtils.isEmpty(aVar.n)) {
                aVar2.n = aVar.n;
            }
            if (aVar.p != null) {
                aVar2.p = aVar.p;
            }
            if (!TextUtils.isEmpty(aVar.q)) {
                aVar2.q = aVar.q;
            }
            if (!TextUtils.isEmpty(aVar.r)) {
                aVar2.r = aVar.r;
            }
            if (aVar.s != null) {
                aVar2.s = aVar.s;
            }
        }
        this.f7066d = null;
        h().a(this.f7065c.f7040l, new j.a() {
            /* class com.bytedance.android.ecommerce.e.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3381);
            }

            @Override // com.bytedance.android.ecommerce.j.j.a
            public final void a(Map<String, String> map) {
                c.this.f7064b = true;
                com.bytedance.android.ecommerce.c.b bVar = aVar.s;
                if (bVar != null) {
                    bVar.a();
                }
            }
        });
        if (!this.f7075m) {
            a(com.bytedance.android.ecommerce.b.c.class);
            a(com.bytedance.android.ecommerce.b.d.class);
            a(com.bytedance.android.ecommerce.b.f.class);
            a(com.bytedance.android.ecommerce.b.g.class);
            a(com.bytedance.android.ecommerce.b.g.class);
            a(com.bytedance.android.ecommerce.b.h.class);
            a(com.bytedance.android.ecommerce.b.i.class);
            a(com.bytedance.android.ecommerce.b.b.class);
            a(com.bytedance.android.ecommerce.b.e.class);
        }
        this.f7075m = true;
    }
}
