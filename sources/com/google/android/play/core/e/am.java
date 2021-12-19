package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class am implements bk<al> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53238a;

    static {
        Covode.recordClassIndex(32907);
    }

    private am(bk<Context> bkVar) {
        this.f53238a = bkVar;
    }

    public static am a(bk<Context> bkVar) {
        return new am(bkVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ al a() {
        return new al(this.f53238a.a());
    }
}
