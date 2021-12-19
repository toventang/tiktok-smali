package com.facebook.imagepipeline.n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.o.b;

public class r extends ae<Pair<e, b.EnumC1183b>, com.facebook.imagepipeline.j.e> {

    /* renamed from: c  reason: collision with root package name */
    private final f f48382c;

    static {
        Covode.recordClassIndex(29175);
    }

    /* Return type fixed from 'java.io.Closeable' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.io.Closeable] */
    @Override // com.facebook.imagepipeline.n.ae
    public final /* bridge */ /* synthetic */ com.facebook.imagepipeline.j.e a(com.facebook.imagepipeline.j.e eVar) {
        return com.facebook.imagepipeline.j.e.a(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Pair<e, b.EnumC1183b> a(al alVar) {
        f fVar = this.f48382c;
        b a2 = alVar.a();
        alVar.d();
        return Pair.create(fVar.a(a2), alVar.e());
    }

    public r(f fVar, ak akVar) {
        super(akVar);
        this.f48382c = fVar;
    }
}
