package com.facebook.imagepipeline.f;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.j.c;

public abstract class b extends com.facebook.d.b<a<c>> {
    static {
        Covode.recordClassIndex(28998);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bitmap bitmap);

    @Override // com.facebook.d.b
    public void onNewResultImpl(com.facebook.d.c<a<c>> cVar) {
        if (cVar.b()) {
            a<c> d2 = cVar.d();
            Bitmap bitmap = null;
            if (d2 != null && (d2.a() instanceof com.facebook.imagepipeline.j.b)) {
                bitmap = ((com.facebook.imagepipeline.j.b) d2.a()).d();
            }
            try {
                a(bitmap);
            } finally {
                a.c(d2);
            }
        }
    }
}
