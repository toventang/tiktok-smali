package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class i implements bk<h> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<s> f52708a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<e> f52709b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<Context> f52710c;

    static {
        Covode.recordClassIndex(32643);
    }

    public i(bk<s> bkVar, bk<e> bkVar2, bk<Context> bkVar3) {
        this.f52708a = bkVar;
        this.f52709b = bkVar2;
        this.f52710c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ h a() {
        return new h(this.f52708a.a(), this.f52709b.a(), ((l) this.f52710c).a());
    }
}
