package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class w implements bk<v> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53348a;

    static {
        Covode.recordClassIndex(32951);
    }

    public w(bk<Context> bkVar) {
        this.f53348a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ v a() {
        return new v(((av) this.f53348a).a());
    }
}
