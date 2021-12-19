package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.common.c;
import java.util.concurrent.Executor;

public final class x implements bk<w> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53105a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<bm> f53106b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<av> f53107c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<dj> f53108d;

    /* renamed from: e  reason: collision with root package name */
    private final bk<ay> f53109e;

    /* renamed from: f  reason: collision with root package name */
    private final bk<am> f53110f;

    /* renamed from: g  reason: collision with root package name */
    private final bk<c> f53111g;

    /* renamed from: h  reason: collision with root package name */
    private final bk<Executor> f53112h;

    /* renamed from: i  reason: collision with root package name */
    private final bk<Executor> f53113i;

    static {
        Covode.recordClassIndex(32778);
    }

    public x(bk<Context> bkVar, bk<bm> bkVar2, bk<av> bkVar3, bk<dj> bkVar4, bk<ay> bkVar5, bk<am> bkVar6, bk<c> bkVar7, bk<Executor> bkVar8, bk<Executor> bkVar9) {
        this.f53105a = bkVar;
        this.f53106b = bkVar2;
        this.f53107c = bkVar3;
        this.f53108d = bkVar4;
        this.f53109e = bkVar5;
        this.f53110f = bkVar6;
        this.f53111g = bkVar7;
        this.f53112h = bkVar8;
        this.f53113i = bkVar9;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ w a() {
        Context a2 = df.a(((df) this.f53105a).f53039a);
        bm a3 = this.f53106b.a();
        av a4 = this.f53107c.a();
        bg b2 = bi.b(this.f53108d);
        ay a5 = this.f53109e.a();
        return new w(a2, a3, a4, b2, a5, this.f53110f.a(), this.f53111g.a(), bi.b(this.f53112h), bi.b(this.f53113i));
    }
}
