package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;

public final class de implements bk<dj> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53036a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<r> f53037b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<bu> f53038c;

    static {
        Covode.recordClassIndex(32751);
    }

    public de(bk<Context> bkVar, bk<r> bkVar2, bk<bu> bkVar3) {
        this.f53036a = bkVar;
        this.f53037b = bkVar2;
        this.f53038c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ dj a() {
        Object a2 = da.a(df.a(((df) this.f53036a).f53039a)) == null ? bi.b(this.f53037b).a() : bi.b(this.f53038c).a();
        an.a(a2);
        return a2;
    }
}
