package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class v implements bk<u> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f52735a;

    static {
        Covode.recordClassIndex(32656);
    }

    public v(bk<Context> bkVar) {
        this.f52735a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ u a() {
        return new u(((l) this.f52735a).a());
    }
}
