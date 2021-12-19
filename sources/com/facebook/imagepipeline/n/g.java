package com.facebook.imagepipeline.n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.o.b;

public final class g extends ae<Pair<e, b.EnumC1183b>, a<c>> {

    /* renamed from: c  reason: collision with root package name */
    private final f f48317c;

    static {
        Covode.recordClassIndex(29153);
    }

    /* Return type fixed from 'java.io.Closeable' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Closeable] */
    @Override // com.facebook.imagepipeline.n.ae
    public final /* synthetic */ a<c> a(a<c> aVar) {
        return a.b(aVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.ae
    public final /* synthetic */ Pair<e, b.EnumC1183b> a(al alVar) {
        return Pair.create(this.f48317c.a(alVar.a(), alVar.d()), alVar.e());
    }

    public g(f fVar, ak akVar) {
        super(akVar);
        this.f48317c = fVar;
    }
}
