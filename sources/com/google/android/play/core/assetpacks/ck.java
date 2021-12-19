package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;

public final class ck implements bk<cj> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<ac> f52979a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<dj> f52980b;

    static {
        Covode.recordClassIndex(32730);
    }

    public ck(bk<ac> bkVar, bk<dj> bkVar2) {
        this.f52979a = bkVar;
        this.f52980b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ cj a() {
        return new cj(this.f52979a.a(), bi.b(this.f52980b));
    }
}
