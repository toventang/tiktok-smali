package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import java.util.concurrent.Executor;

public final class bn implements bk<bm> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<ac> f52899a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<dj> f52900b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<ay> f52901c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<Executor> f52902d;

    static {
        Covode.recordClassIndex(32706);
    }

    public bn(bk<ac> bkVar, bk<dj> bkVar2, bk<ay> bkVar3, bk<Executor> bkVar4) {
        this.f52899a = bkVar;
        this.f52900b = bkVar2;
        this.f52901c = bkVar3;
        this.f52902d = bkVar4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ bm a() {
        ac a2 = this.f52899a.a();
        return new bm(a2, bi.b(this.f52900b), this.f52901c.a(), bi.b(this.f52902d));
    }
}
