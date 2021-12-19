package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class dg implements bk<String> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53040a;

    static {
        Covode.recordClassIndex(32753);
    }

    public dg(bk<Context> bkVar) {
        this.f53040a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* bridge */ /* synthetic */ String a() {
        return da.a(df.a(((df) this.f53040a).f53039a));
    }
}
