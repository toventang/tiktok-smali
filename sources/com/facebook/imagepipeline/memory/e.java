package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imageutils.a;

public final class e extends q<Bitmap> {
    static {
        Covode.recordClassIndex(29050);
    }

    @Override // com.facebook.imagepipeline.memory.aa
    public final /* synthetic */ int b(Object obj) {
        return a.a((Bitmap) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.imagepipeline.memory.aa, com.facebook.imagepipeline.memory.q
    public final /* bridge */ /* synthetic */ void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (a(bitmap2)) {
            super.a((Object) bitmap2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.imagepipeline.memory.aa, com.facebook.imagepipeline.memory.q
    public final /* synthetic */ Bitmap a(int i2) {
        Bitmap bitmap = (Bitmap) super.a(i2);
        if (bitmap == null || !a(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    private static boolean a(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            com.facebook.common.e.a.d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            com.facebook.common.e.a.d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }
}
