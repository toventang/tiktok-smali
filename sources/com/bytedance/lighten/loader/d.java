package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.f;
import com.facebook.imagepipeline.o.a;

final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private f f39969a;

    static {
        Covode.recordClassIndex(24642);
    }

    d(f fVar) {
        this.f39969a = fVar;
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, com.facebook.imagepipeline.c.f fVar) {
        return com.facebook.common.h.a.b(fVar.a(bitmap, this.f39969a.f39840a, this.f39969a.f39841b, this.f39969a.f39842c, this.f39969a.f39843d));
    }
}
