package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bh;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.common.c;
import com.google.android.play.core.common.d;
import com.google.android.play.core.e.al;
import com.google.android.play.core.e.am;
import java.util.concurrent.Executor;

public final class aq implements e {

    /* renamed from: a  reason: collision with root package name */
    private final da f52802a;

    /* renamed from: b  reason: collision with root package name */
    private bk<Context> f52803b;

    /* renamed from: c  reason: collision with root package name */
    private bk<cg> f52804c;

    /* renamed from: d  reason: collision with root package name */
    private bk<ac> f52805d;

    /* renamed from: e  reason: collision with root package name */
    private bk<ay> f52806e;

    /* renamed from: f  reason: collision with root package name */
    private bk<r> f52807f;

    /* renamed from: g  reason: collision with root package name */
    private bk<String> f52808g = bi.a(new dg(this.f52803b));

    /* renamed from: h  reason: collision with root package name */
    private bk<dj> f52809h = new bh();

    /* renamed from: i  reason: collision with root package name */
    private bk<Executor> f52810i;

    /* renamed from: j  reason: collision with root package name */
    private bk<bm> f52811j;

    /* renamed from: k  reason: collision with root package name */
    private bk<w> f52812k;

    /* renamed from: l  reason: collision with root package name */
    private bk<as> f52813l;

    /* renamed from: m  reason: collision with root package name */
    private bk<cq> f52814m;
    private bk<ca> n;
    private bk<ce> o;
    private bk<cj> p;
    private bk<aj> q;
    private bk<bp> r;
    private bk<av> s;
    private bk<am> t;
    private bk<c> u;
    private bk<Executor> v;
    private bk<bu> w;
    private bk<al> x;
    private bk<cw> y;
    private bk<Object> z;

    static {
        Covode.recordClassIndex(32682);
    }

    @Override // com.google.android.play.core.assetpacks.e
    public final void a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f52754a = df.a(this.f52802a);
        assetPackExtractionService.f52755b = this.y.a();
        assetPackExtractionService.f52756c = this.f52805d.a();
    }

    /* synthetic */ aq(da daVar) {
        this.f52802a = daVar;
        df dfVar = new df(daVar);
        this.f52803b = dfVar;
        bk<cg> a2 = bi.a(new ch(dfVar));
        this.f52804c = a2;
        this.f52805d = bi.a(new ad(this.f52803b, a2));
        bk<ay> a3 = bi.a(az.f52861a);
        this.f52806e = a3;
        this.f52807f = bi.a(new s(this.f52803b, a3));
        bk<Executor> a4 = bi.a(db.f53033a);
        this.f52810i = a4;
        this.f52811j = bi.a(new bn(this.f52805d, this.f52809h, this.f52806e, a4));
        bh bhVar = new bh();
        this.f52812k = bhVar;
        this.f52813l = bi.a(new at(this.f52805d, this.f52809h, bhVar, this.f52806e));
        this.f52814m = bi.a(new cr(this.f52805d));
        this.n = bi.a(new cb(this.f52805d));
        this.o = bi.a(new cf(this.f52805d, this.f52809h, this.f52811j, this.f52810i, this.f52806e));
        this.p = bi.a(new ck(this.f52805d, this.f52809h));
        bk<aj> a5 = bi.a(new ak(this.f52809h));
        this.q = a5;
        bk<bp> a6 = bi.a(new bq(this.f52811j, this.f52805d, a5));
        this.r = a6;
        this.s = bi.a(new aw(this.f52811j, this.f52809h, this.f52813l, this.f52814m, this.n, this.o, this.p, a6));
        this.t = bi.a(an.f52800a);
        this.u = bi.a(d.f53188a);
        bk<Executor> a7 = bi.a(dh.f53041a);
        this.v = a7;
        bh.a(this.f52812k, bi.a(new x(this.f52803b, this.f52811j, this.s, this.f52809h, this.f52806e, this.t, this.u, this.f52810i, a7)));
        bk<bu> a8 = bi.a(new bv(this.f52808g, this.f52812k, this.f52806e, this.f52803b, this.f52804c, this.f52810i));
        this.w = a8;
        bh.a(this.f52809h, bi.a(new de(this.f52803b, this.f52807f, a8)));
        bk<al> a9 = bi.a(am.a(this.f52803b));
        this.x = a9;
        bk<cw> a10 = bi.a(new cx(this.f52805d, this.f52809h, this.f52812k, a9, this.f52811j, this.f52806e, this.t, this.f52810i));
        this.y = a10;
        this.z = bi.a(new dd(a10, this.f52803b));
    }
}
