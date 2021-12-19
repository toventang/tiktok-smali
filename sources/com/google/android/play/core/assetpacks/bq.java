package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class bq implements bk<bp> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<bm> f52909a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<ac> f52910b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<aj> f52911c;

    static {
        Covode.recordClassIndex(32709);
    }

    public bq(bk<bm> bkVar, bk<ac> bkVar2, bk<aj> bkVar3) {
        this.f52909a = bkVar;
        this.f52910b = bkVar2;
        this.f52911c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ bp a() {
        return new bp(this.f52909a.a(), this.f52910b.a(), this.f52911c.a());
    }
}
