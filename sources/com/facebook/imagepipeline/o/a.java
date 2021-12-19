package com.facebook.imagepipeline.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.nativecode.Bitmaps;

public abstract class a implements d {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;

    @Override // com.facebook.imagepipeline.o.d
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.o.d
    public e getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    static {
        Covode.recordClassIndex(29205);
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // com.facebook.imagepipeline.o.d
    public com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        com.facebook.common.h.a<Bitmap> a2 = fVar.a(width, height, config);
        try {
            process(a2.a(), bitmap);
            return com.facebook.common.h.a.b(a2);
        } finally {
            com.facebook.common.h.a.c(a2);
        }
    }
}
