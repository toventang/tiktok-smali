package com.facebook.imagepipeline.n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.o.b;

public final class ar extends r {

    /* renamed from: c  reason: collision with root package name */
    private final f f48221c;

    static {
        Covode.recordClassIndex(29119);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.r
    /* renamed from: b */
    public final Pair<e, b.EnumC1183b> a(al alVar) {
        b a2 = alVar.a();
        f fVar = this.f48221c;
        alVar.d();
        return Pair.create(fVar.b(a2), alVar.e());
    }

    public ar(f fVar, ak akVar) {
        super(fVar, akVar);
        this.f48221c = fVar;
    }
}
