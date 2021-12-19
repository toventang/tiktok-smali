package com.facebook.imagepipeline.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.common.d.i;

public final class a extends com.facebook.imagepipeline.o.a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f48013a = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f48014b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f48015c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48016d;

    /* renamed from: e  reason: collision with root package name */
    private e f48017e;

    static {
        Covode.recordClassIndex(29033);
        int i2 = Build.VERSION.SDK_INT;
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        String a2;
        if (this.f48017e == null) {
            if (f48013a) {
                a2 = com.a.a(null, "IntrinsicBlur;%d", new Object[]{Integer.valueOf(this.f48016d)});
            } else {
                a2 = com.a.a(null, "IterativeBoxBlur;%d;%d", new Object[]{Integer.valueOf(this.f48014b), Integer.valueOf(this.f48016d)});
            }
            this.f48017e = new j(a2);
        }
        return this.f48017e;
    }

    @Override // com.facebook.imagepipeline.o.a
    public final void process(Bitmap bitmap) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        OutOfMemoryError e2;
        int i2 = this.f48014b;
        int i3 = this.f48016d;
        i.a(bitmap);
        i.a(bitmap.isMutable());
        int i4 = 1;
        if (((float) bitmap.getHeight()) <= 2048.0f) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (((float) bitmap.getWidth()) <= 2048.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (i3 <= 0 || i3 > 25) {
            z3 = false;
        } else {
            z3 = true;
        }
        i.a(z3);
        if (i2 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        i.a(z4);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i5 = i3 + 1;
            int i6 = i5 + i3;
            int[] iArr2 = new int[(i6 * 256)];
            int i7 = 1;
            do {
                for (int i8 = 0; i8 < i6; i8++) {
                    iArr2[i5] = i7;
                    i5++;
                }
                i7++;
            } while (i7 <= 255);
            int[] iArr3 = new int[Math.max(width, height)];
            int i9 = 0;
            while (i9 < i2) {
                int i10 = 0;
                while (i10 < height) {
                    int i11 = width * i10;
                    i10++;
                    int i12 = (width * i10) - i4;
                    int i13 = i6 >> 1;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = -i13; i18 < width + i13; i18++) {
                        int i19 = iArr[com.facebook.imagepipeline.i.a.a(i11 + i18, i11, i12)];
                        i14 += (i19 >> 16) & 255;
                        i15 += (i19 >> 8) & 255;
                        i16 += i19 & 255;
                        i17 += i19 >>> 24;
                        if (i18 >= i13) {
                            iArr3[i18 - i13] = (iArr2[i17] << 24) | (iArr2[i14] << 16) | (iArr2[i15] << 8) | iArr2[i16];
                            int i20 = iArr[com.facebook.imagepipeline.i.a.a((i18 - (i6 - 1)) + i11, i11, i12)];
                            i14 -= (i20 >> 16) & 255;
                            i15 -= (i20 >> 8) & 255;
                            i16 -= i20 & 255;
                            i17 -= i20 >>> 24;
                        }
                    }
                    System.arraycopy(iArr3, 0, iArr, i11, width);
                    i4 = 1;
                }
                for (int i21 = 0; i21 < width; i21++) {
                    int i22 = ((height - 1) * width) + i21;
                    int i23 = (i6 >> 1) * width;
                    int i24 = (i6 - 1) * width;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    for (int i30 = i21 - i23; i30 <= i22 + i23; i30 += width) {
                        try {
                            int i31 = iArr[com.facebook.imagepipeline.i.a.a(i30, i21, i22)];
                            i25 += (i31 >> 16) & 255;
                            i26 += (i31 >> 8) & 255;
                            i27 += i31 & 255;
                            i28 += i31 >>> 24;
                            if (i30 - i23 >= i21) {
                                try {
                                    iArr3[i29] = (iArr2[i28] << 24) | (iArr2[i25] << 16) | (iArr2[i26] << 8) | iArr2[i27];
                                    i29++;
                                    int i32 = iArr[com.facebook.imagepipeline.i.a.a(i30 - i24, i21, i22)];
                                    i25 -= (i32 >> 16) & 255;
                                    i26 -= (i32 >> 8) & 255;
                                    i27 -= i32 & 255;
                                    i28 -= i32 >>> 24;
                                } catch (OutOfMemoryError e3) {
                                    e2 = e3;
                                    com.facebook.common.e.a.c("IterativeBoxBlurFilter", com.a.a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i3)}));
                                    throw e2;
                                }
                            }
                        } catch (OutOfMemoryError e4) {
                            e2 = e4;
                            com.facebook.common.e.a.c("IterativeBoxBlurFilter", com.a.a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i3)}));
                            throw e2;
                        }
                    }
                    int i33 = i21;
                    for (int i34 = 0; i34 < height; i34++) {
                        iArr[i33] = iArr3[i34];
                        i33 += width;
                    }
                }
                i9++;
                i4 = 1;
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        } catch (OutOfMemoryError e5) {
            e2 = e5;
            com.facebook.common.e.a.c("IterativeBoxBlurFilter", com.a.a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i3)}));
            throw e2;
        }
    }

    @Override // com.facebook.imagepipeline.o.a
    public final void process(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        if (f48013a) {
            Context context = this.f48015c;
            int i2 = this.f48016d;
            i.a(bitmap);
            i.a(bitmap2);
            i.a(context);
            if (i2 <= 0 || i2 > 25) {
                z = false;
            } else {
                z = true;
            }
            i.a(z);
            RenderScript renderScript = null;
            try {
                renderScript = RenderScript.create(context);
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap2);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(renderScript, bitmap);
                create.setRadius((float) i2);
                create.setInput(createFromBitmap);
                create.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(bitmap);
            } finally {
                if (renderScript != null) {
                    renderScript.destroy();
                }
            }
        } else {
            super.process(bitmap, bitmap2);
        }
    }

    public a(int i2, Context context, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 <= 0 || i2 > 25) {
            z = false;
        } else {
            z = true;
        }
        i.a(z);
        i.a(i3 <= 0 ? false : z2);
        i.a(context);
        this.f48014b = i3;
        this.f48016d = i2;
        this.f48015c = context;
    }
}
