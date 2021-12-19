package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.e.al;
import java.util.concurrent.Executor;

public final class cx implements bk<cw> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<ac> f53022a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<dj> f53023b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<w> f53024c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<al> f53025d;

    /* renamed from: e  reason: collision with root package name */
    private final bk<bm> f53026e;

    /* renamed from: f  reason: collision with root package name */
    private final bk<ay> f53027f;

    /* renamed from: g  reason: collision with root package name */
    private final bk<am> f53028g;

    /* renamed from: h  reason: collision with root package name */
    private final bk<Executor> f53029h;

    static {
        Covode.recordClassIndex(32743);
    }

    public cx(bk<ac> bkVar, bk<dj> bkVar2, bk<w> bkVar3, bk<al> bkVar4, bk<bm> bkVar5, bk<ay> bkVar6, bk<am> bkVar7, bk<Executor> bkVar8) {
        this.f53022a = bkVar;
        this.f53023b = bkVar2;
        this.f53024c = bkVar3;
        this.f53025d = bkVar4;
        this.f53026e = bkVar5;
        this.f53027f = bkVar6;
        this.f53028g = bkVar7;
        this.f53029h = bkVar8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ cw a() {
        ac a2 = this.f53022a.a();
        bg b2 = bi.b(this.f53023b);
        w a3 = this.f53024c.a();
        bm a4 = this.f53026e.a();
        ay a5 = this.f53027f.a();
        return new cw(a2, b2, a3, this.f53025d.a(), a4, a5, this.f53028g.a(), bi.b(this.f53029h));
    }
}
