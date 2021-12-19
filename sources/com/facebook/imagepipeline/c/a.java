package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.memory.d;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final d f47708a;

    static {
        Covode.recordClassIndex(28914);
    }

    public a(d dVar) {
        this.f47708a = dVar;
    }

    @Override // com.facebook.imagepipeline.c.f
    public final com.facebook.common.h.a<Bitmap> a(int i2, int i3, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f47708a.a(com.facebook.imageutils.a.a(i2, i3, config));
        if (bitmap.getAllocationByteCount() >= i2 * i3 * com.facebook.imageutils.a.a(config)) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        bitmap.reconfigure(i2, i3, config);
        return com.facebook.common.h.a.a(bitmap, this.f47708a);
    }
}
