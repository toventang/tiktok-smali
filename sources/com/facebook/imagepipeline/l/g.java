package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.j.e;

public interface g {
    static {
        Covode.recordClassIndex(29032);
    }

    a<Bitmap> decodeFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, boolean z);

    a<Bitmap> decodeJPEGFromEncodedImage(e eVar, Bitmap.Config config, Rect rect, int i2);

    a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, int i2, boolean z);
}
