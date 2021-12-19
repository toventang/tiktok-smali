package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.d.m;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.common.f;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.l.g;
import com.facebook.imagepipeline.memory.b;
import com.facebook.imagepipeline.memory.c;
import java.util.Locale;

public abstract class DalvikPurgeableDecoder implements g {
    protected static final byte[] EOI = {-1, -39};
    private final b mUnpooledBitmapsCounter = c.a();

    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeByteArrayAsPurgeable(a<h> aVar, BitmapFactory.Options options);

    /* access modifiers changed from: protected */
    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(a<h> aVar, int i2, BitmapFactory.Options options);

    static {
        Covode.recordClassIndex(29196);
        com.facebook.imageutils.b.a("imagepipeline");
    }

    public a<Bitmap> pinBitmap(Bitmap bitmap) {
        i.a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.a(bitmap)) {
                return a.a(bitmap, this.mUnpooledBitmapsCounter.f48069a);
            }
            int a2 = com.facebook.imageutils.a.a(bitmap);
            bitmap.recycle();
            throw new f(com.a.a(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a2), Integer.valueOf(this.mUnpooledBitmapsCounter.a()), Long.valueOf(this.mUnpooledBitmapsCounter.b()), Integer.valueOf(this.mUnpooledBitmapsCounter.c()), Integer.valueOf(this.mUnpooledBitmapsCounter.d())}));
        } catch (Exception e2) {
            bitmap.recycle();
            throw m.b(e2);
        }
    }

    public static boolean endsWithEOI(a<h> aVar, int i2) {
        h a2 = aVar.a();
        if (i2 >= 2 && a2.a(i2 - 2) == -1 && a2.a(i2 - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options getBitmapFactoryOptions(int i2, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        int i3 = Build.VERSION.SDK_INT;
        options.inMutable = true;
        return options;
    }

    public a<Bitmap> decodeFromEncodedImage(e eVar, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, false);
    }

    @Override // com.facebook.imagepipeline.l.g
    public a<Bitmap> decodeJPEGFromEncodedImage(e eVar, Bitmap.Config config, Rect rect, int i2) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i2, false);
    }

    @Override // com.facebook.imagepipeline.l.g
    public a<Bitmap> decodeFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f47996h, config);
        a<h> b2 = a.b(eVar.f47989a);
        i.a(b2);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(b2, bitmapFactoryOptions));
        } finally {
            a.c(b2);
        }
    }

    @Override // com.facebook.imagepipeline.l.g
    public a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, int i2, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(eVar.f47996h, config);
        a<h> b2 = a.b(eVar.f47989a);
        i.a(b2);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(b2, i2, bitmapFactoryOptions));
        } finally {
            a.c(b2);
        }
    }
}
