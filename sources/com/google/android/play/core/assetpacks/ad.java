package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class ad implements bk<ac> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f52773a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<cg> f52774b;

    static {
        Covode.recordClassIndex(32669);
    }

    public ad(bk<Context> bkVar, bk<cg> bkVar2) {
        this.f52773a = bkVar;
        this.f52774b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ ac a() {
        return new ac(df.a(((df) this.f52773a).f53039a), this.f52774b.a());
    }
}
