package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class s implements bk<r> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53087a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<ay> f53088b;

    static {
        Covode.recordClassIndex(32773);
    }

    public s(bk<Context> bkVar, bk<ay> bkVar2) {
        this.f53087a = bkVar;
        this.f53088b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ r a() {
        return new r(df.a(((df) this.f53087a).f53039a), this.f53088b.a());
    }
}
