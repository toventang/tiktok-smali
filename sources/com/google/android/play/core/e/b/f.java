package com.google.android.play.core.e.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.a;

final /* synthetic */ class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final int f53290a;

    static {
        Covode.recordClassIndex(32923);
    }

    f(int i2) {
        this.f53290a = i2;
    }

    @Override // com.google.android.play.core.e.b.k
    public final com.google.android.play.core.e.f a(com.google.android.play.core.e.f fVar) {
        int b2;
        int i2 = this.f53290a;
        if (fVar != null && i2 == fVar.a() && ((b2 = fVar.b()) == 1 || b2 == 2 || b2 == 8 || b2 == 9 || b2 == 7)) {
            return com.google.android.play.core.e.f.a(i2, 7, fVar.c(), fVar.d(), fVar.e(), fVar.f(), fVar.g());
        }
        throw new a(-3);
    }
}
