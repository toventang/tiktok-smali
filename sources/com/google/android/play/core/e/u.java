package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class u implements bk<t> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53346a;

    static {
        Covode.recordClassIndex(32949);
    }

    public u(bk<Context> bkVar) {
        this.f53346a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ t a() {
        return new t(((av) this.f53346a).a());
    }
}
