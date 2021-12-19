package com.facebook.imagepipeline.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.g.c;

public interface a {
    static {
        Covode.recordClassIndex(28889);
    }

    com.facebook.imagepipeline.h.a getAnimatedDrawableFactory(Context context);

    c getGifDecoder(Bitmap.Config config);

    c getWebPDecoder(Bitmap.Config config);
}
