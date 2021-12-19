package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;

public final class bh<T> implements bk<T> {

    /* renamed from: a  reason: collision with root package name */
    private bk<T> f53130a;

    static {
        Covode.recordClassIndex(32816);
    }

    public static <T> void a(bk<T> bkVar, bk<T> bkVar2) {
        bh bhVar = (bh) bkVar;
        if (bhVar.f53130a == null) {
            bhVar.f53130a = bkVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.play.core.b.bk
    public final T a() {
        bk<T> bkVar = this.f53130a;
        if (bkVar != null) {
            return bkVar.a();
        }
        throw new IllegalStateException();
    }
}
