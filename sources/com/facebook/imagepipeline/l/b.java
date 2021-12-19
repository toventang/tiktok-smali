package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.memory.d;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class b implements g {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f48005b = b.class;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f48006d = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    final f.c<ByteBuffer> f48007a;

    /* renamed from: c  reason: collision with root package name */
    private final d f48008c;

    public abstract int a(int i2, int i3, BitmapFactory.Options options);

    static {
        Covode.recordClassIndex(29027);
    }

    private static BitmapFactory.Options a(e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.f47996h;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.b(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public b(d dVar, int i2, f.c cVar) {
        this.f48008c = dVar;
        this.f48007a = cVar;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f48007a.release(ByteBuffer.allocate(16384));
        }
    }

    @Override // com.facebook.imagepipeline.l.g
    public a<Bitmap> decodeJPEGFromEncodedImage(e eVar, Bitmap.Config config, Rect rect, int i2) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i2, false);
    }

    @Override // com.facebook.imagepipeline.l.g
    public a<Bitmap> decodeFromEncodedImageWithColorSpace(e eVar, Bitmap.Config config, Rect rect, boolean z) {
        boolean z2;
        BitmapFactory.Options a2 = a(eVar, config);
        if (a2.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return a(eVar.b(), a2, rect, z);
        } catch (RuntimeException e2) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(eVar, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        com.facebook.common.e.a.c(com.facebook.imagepipeline.l.b.f48005b, "Could not decode region %s, decoding full bitmap instead.", r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r7 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r7 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.h.a<android.graphics.Bitmap> a(java.io.InputStream r15, android.graphics.BitmapFactory.Options r16, android.graphics.Rect r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.l.b.a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):com.facebook.common.h.a");
    }

    /* access modifiers changed from: protected */
    public Bitmap a(InputStream inputStream, BitmapFactory.Options options, int i2, int i3, Bitmap bitmap) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.facebook.imagepipeline.l.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.h.a<android.graphics.Bitmap> decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.j.e r11, android.graphics.Bitmap.Config r12, android.graphics.Rect r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.l.b.decodeJPEGFromEncodedImageWithColorSpace(com.facebook.imagepipeline.j.e, android.graphics.Bitmap$Config, android.graphics.Rect, int, boolean):com.facebook.common.h.a");
    }
}
