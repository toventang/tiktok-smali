package com.facebook.imagepipeline.f;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.d.b;
import com.facebook.imagepipeline.j.d;

public abstract class c extends b<a<com.facebook.imagepipeline.j.c>> {
    static {
        Covode.recordClassIndex(28999);
    }

    /* access modifiers changed from: protected */
    public abstract void a(a<Bitmap> aVar);

    @Override // com.facebook.d.b
    public void onNewResultImpl(com.facebook.d.c<a<com.facebook.imagepipeline.j.c>> cVar) {
        if (cVar.b()) {
            a<com.facebook.imagepipeline.j.c> d2 = cVar.d();
            a<Bitmap> aVar = null;
            if (d2 != null && (d2.a() instanceof d)) {
                aVar = ((d) d2.a()).f();
            }
            try {
                a(aVar);
            } finally {
                a.c(aVar);
                a.c(d2);
            }
        }
    }
}
