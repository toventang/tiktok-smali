package com.facebook.imagepipeline.l;

import android.graphics.BitmapFactory;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.memory.d;

public final class a extends b {
    static {
        Covode.recordClassIndex(29026);
    }

    public a(d dVar, int i2, f.c cVar) {
        super(dVar, i2, cVar);
    }

    @Override // com.facebook.imagepipeline.l.b
    public final int a(int i2, int i3, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.a(i2, i3, options.inPreferredConfig);
    }
}
