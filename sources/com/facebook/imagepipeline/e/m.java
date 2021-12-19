package com.facebook.imagepipeline.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.facebook.common.g.a;
import com.facebook.common.g.h;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.d.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.n.ab;
import com.facebook.imagepipeline.n.ah;
import com.facebook.imagepipeline.n.ak;
import com.facebook.imagepipeline.n.aq;
import com.facebook.imagepipeline.n.at;
import com.facebook.imagepipeline.n.aw;
import com.facebook.imagepipeline.n.ay;
import com.facebook.imagepipeline.n.az;
import com.facebook.imagepipeline.n.ba;
import com.facebook.imagepipeline.n.bb;
import com.facebook.imagepipeline.n.bc;
import com.facebook.imagepipeline.n.be;
import com.facebook.imagepipeline.n.g;
import com.facebook.imagepipeline.n.j;
import com.facebook.imagepipeline.n.o;
import com.facebook.imagepipeline.n.r;
import com.facebook.imagepipeline.n.s;
import com.facebook.imagepipeline.n.z;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    ContentResolver f47933a;

    /* renamed from: b  reason: collision with root package name */
    Resources f47934b;

    /* renamed from: c  reason: collision with root package name */
    AssetManager f47935c;

    /* renamed from: d  reason: collision with root package name */
    final a f47936d;

    /* renamed from: e  reason: collision with root package name */
    final e f47937e;

    /* renamed from: f  reason: collision with root package name */
    final i f47938f;

    /* renamed from: g  reason: collision with root package name */
    final e f47939g;

    /* renamed from: h  reason: collision with root package name */
    final e f47940h;

    /* renamed from: i  reason: collision with root package name */
    final p<com.facebook.c.a.e, c> f47941i;

    /* renamed from: j  reason: collision with root package name */
    final f f47942j;

    /* renamed from: k  reason: collision with root package name */
    final com.facebook.imagepipeline.c.f f47943k;

    /* renamed from: l  reason: collision with root package name */
    final int f47944l;

    /* renamed from: m  reason: collision with root package name */
    final int f47945m;
    boolean n;
    private final com.facebook.imagepipeline.g.c o;
    private final com.facebook.imagepipeline.g.e p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final p<com.facebook.c.a.e, h> t;
    private final int u;

    static {
        Covode.recordClassIndex(28994);
    }

    public final ab b() {
        return new ab(this.f47937e.a(), this.f47938f);
    }

    public final z a() {
        return new z(this.f47937e.a(), this.f47938f, this.f47933a);
    }

    public static com.facebook.imagepipeline.n.a a(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new com.facebook.imagepipeline.n.a(akVar);
    }

    public static <T> aw<T> k(ak<T> akVar) {
        return new aw<>(akVar);
    }

    public final g c(ak<com.facebook.common.h.a<c>> akVar) {
        return new g(this.f47942j, akVar);
    }

    public final r i(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new r(this.f47942j, akVar);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final com.facebook.imagepipeline.n.h d(ak<com.facebook.common.h.a<c>> akVar) {
        return new com.facebook.imagepipeline.n.h(this.f47941i, this.f47942j, akVar);
    }

    public final o f(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new o(this.f47939g, this.f47940h, this.f47942j, akVar);
    }

    public final com.facebook.imagepipeline.n.p g(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new com.facebook.imagepipeline.n.p(this.f47939g, this.f47940h, this.f47942j, akVar);
    }

    public final ah h(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new ah(this.f47939g, this.f47942j, this.f47938f, this.f47936d, akVar);
    }

    public final s j(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new s(this.t, this.f47942j, akVar);
    }

    public final <T> ba<T> l(ak<T> akVar) {
        return new ba<>(this.f47937e.e(), akVar);
    }

    public final be m(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new be(this.f47937e.d(), this.f47938f, akVar);
    }

    public final com.facebook.imagepipeline.n.f b(ak<com.facebook.common.h.a<c>> akVar) {
        return new com.facebook.imagepipeline.n.f(this.f47941i, this.f47942j, akVar);
    }

    public final com.facebook.imagepipeline.n.m e(ak<com.facebook.imagepipeline.j.e> akVar) {
        return new com.facebook.imagepipeline.n.m(this.f47936d, this.f47937e.c(), this.o, this.p, this.q, this.r, this.s, akVar, this.u);
    }

    public static bb a(bc<com.facebook.imagepipeline.j.e>[] bcVarArr) {
        return new bb(bcVarArr);
    }

    public static <T> ay<T> a(ak<T> akVar, az azVar) {
        return new ay<>(akVar, azVar);
    }

    public static j a(ak<com.facebook.imagepipeline.j.e> akVar, ak<com.facebook.imagepipeline.j.e> akVar2) {
        return new j(akVar, akVar2);
    }

    public final at a(ak<com.facebook.imagepipeline.j.e> akVar, com.facebook.imagepipeline.q.c cVar) {
        return new at(this.f47937e.d(), this.f47938f, akVar, cVar, this.f47939g, this.f47940h, this.f47942j);
    }

    public final aq a(ak<com.facebook.imagepipeline.j.e> akVar, boolean z, com.facebook.imagepipeline.q.c cVar) {
        return new aq(this.f47937e.d(), this.f47938f, akVar, z, cVar);
    }

    public m(Context context, a aVar, com.facebook.imagepipeline.g.c cVar, com.facebook.imagepipeline.g.e eVar, boolean z, boolean z2, boolean z3, e eVar2, i iVar, p<com.facebook.c.a.e, c> pVar, p<com.facebook.c.a.e, h> pVar2, e eVar3, e eVar4, f fVar, com.facebook.imagepipeline.c.f fVar2, int i2, int i3, boolean z4, int i4) {
        this.f47933a = a(context).getContentResolver();
        this.f47934b = a(context).getResources();
        this.f47935c = a(context).getAssets();
        this.f47936d = aVar;
        this.o = cVar;
        this.p = eVar;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.f47937e = eVar2;
        this.f47938f = iVar;
        this.f47941i = pVar;
        this.t = pVar2;
        this.f47939g = eVar3;
        this.f47940h = eVar4;
        this.f47942j = fVar;
        this.f47943k = fVar2;
        this.f47944l = i2;
        this.f47945m = i3;
        this.n = z4;
        this.u = i4;
    }
}
