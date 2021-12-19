package com.facebook.imagepipeline.o;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.c.f;

public interface d {
    static {
        Covode.recordClassIndex(29211);
    }

    String getName();

    e getPostprocessorCacheKey();

    a<Bitmap> process(Bitmap bitmap, f fVar);
}
