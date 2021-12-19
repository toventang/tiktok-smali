package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;

public final class at implements bk<as> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<ac> f52830a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<dj> f52831b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<w> f52832c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<ay> f52833d;

    static {
        Covode.recordClassIndex(32685);
    }

    public at(bk<ac> bkVar, bk<dj> bkVar2, bk<w> bkVar3, bk<ay> bkVar4) {
        this.f52830a = bkVar;
        this.f52831b = bkVar2;
        this.f52832c = bkVar3;
        this.f52833d = bkVar4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ as a() {
        return new as(this.f52830a.a(), bi.b(this.f52831b), bi.b(this.f52832c), this.f52833d.a());
    }
}
