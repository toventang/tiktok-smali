package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class f implements bk<e> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f52702a;

    static {
        Covode.recordClassIndex(32640);
    }

    public f(bk<Context> bkVar) {
        this.f52702a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ e a() {
        return new e(((l) this.f52702a).a());
    }
}
