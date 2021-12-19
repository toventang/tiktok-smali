package com.lynx.tasm.ui.image.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.o.a;
import com.lynx.tasm.base.LLog;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f56913a;

    /* renamed from: b  reason: collision with root package name */
    private int f56914b;

    /* renamed from: c  reason: collision with root package name */
    private int f56915c;

    /* renamed from: d  reason: collision with root package name */
    private int f56916d;

    /* renamed from: e  reason: collision with root package name */
    private int f56917e;

    /* renamed from: f  reason: collision with root package name */
    private int f56918f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f56919g;

    /* renamed from: h  reason: collision with root package name */
    private q.b f56920h;

    /* renamed from: i  reason: collision with root package name */
    private j f56921i;

    /* renamed from: j  reason: collision with root package name */
    private String[] f56922j;

    /* renamed from: k  reason: collision with root package name */
    private float f56923k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap.Config f56924l;

    static {
        Covode.recordClassIndex(35424);
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public e getPostprocessorCacheKey() {
        return this.f56921i;
    }

    private static float a(String str) {
        float f2 = 1.0f;
        if (str == null || str.equalsIgnoreCase("")) {
            return 1.0f;
        }
        try {
            f2 = Float.parseFloat(str);
            return f2;
        } catch (Throwable th) {
            LLog.c("BaseRoundedCornerPostprocessor", "initCapInsetsScale error " + th.getMessage());
            return f2;
        }
    }

    private static String[] b(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 4) {
            return null;
        }
        boolean z = true;
        for (int i2 = 0; i2 < Math.min(split.length, 4); i2++) {
            if (split[i2].endsWith("px") || split[i2].endsWith("%")) {
                if (!split[i2].endsWith("px")) {
                    if (split[i2].endsWith("%")) {
                        if (split[i2].length() > 1) {
                            z = split[i2].substring(0, split[i2].length() - 1).matches("[+]?[0-9]*\\.?[0-9]+");
                        }
                    }
                } else if (split[i2].length() > 2) {
                    z = split[i2].substring(0, split[i2].length() - 2).matches("[+]?[0-9]*\\.?[0-9]+");
                }
            }
            z = false;
        }
        if (z) {
            return split;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0130 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01db A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0529 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.h.a<android.graphics.Bitmap> process(android.graphics.Bitmap r35, com.facebook.imagepipeline.c.f r36) {
        /*
        // Method dump skipped, instructions count: 1333
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.ui.image.a.b.process(android.graphics.Bitmap, com.facebook.imagepipeline.c.f):com.facebook.common.h.a");
    }

    private Canvas a(Bitmap bitmap, int i2, int i3) {
        Canvas canvas = new Canvas(bitmap);
        canvas.clipRect(this.f56915c, this.f56918f, i2 - this.f56916d, i3 - this.f56917e);
        canvas.drawARGB(0, 0, 0, 0);
        return canvas;
    }

    private static float[] a(String[] strArr, int i2, int i3) {
        if (strArr == null || strArr.length > 4) {
            return null;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4].endsWith("px")) {
                fArr[i4] = Float.parseFloat(strArr[i4].substring(0, strArr[i4].length() - 2));
            } else if (strArr[i4].endsWith("%")) {
                if (i4 == 0 || i4 == 2) {
                    fArr[i4] = Float.parseFloat(strArr[i4].substring(0, strArr[i4].length() - 2)) * ((float) i3);
                } else {
                    fArr[i4] = Float.parseFloat(strArr[i4].substring(0, strArr[i4].length() - 2)) * ((float) i2);
                }
            }
        }
        return fArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[Catch:{ all -> 0x036a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[Catch:{ all -> 0x036a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int r32, int r33, int r34, int r35, com.facebook.drawee.e.q.b r36, java.lang.String r37, java.lang.String r38, android.graphics.Canvas r39, android.graphics.Bitmap r40) {
        /*
        // Method dump skipped, instructions count: 902
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.ui.image.a.b.a(int, int, int, int, com.facebook.drawee.e.q$b, java.lang.String, java.lang.String, android.graphics.Canvas, android.graphics.Bitmap):boolean");
    }

    public b(String str, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, q.b bVar, String str2, String str3, Bitmap.Config config) {
        this.f56920h = bVar;
        this.f56913a = i2;
        this.f56914b = i3;
        this.f56915c = i4;
        this.f56918f = i5;
        this.f56916d = i6;
        this.f56917e = i7;
        this.f56919g = fArr;
        this.f56922j = b(str2);
        this.f56923k = a(str3);
        this.f56924l = config;
        StringBuilder sb = new StringBuilder(str);
        sb.append(bVar);
        if (fArr != null) {
            for (float f2 : fArr) {
                sb.append(f2);
            }
        }
        sb.append(this.f56913a);
        sb.append(this.f56914b);
        sb.append(this.f56917e);
        sb.append(this.f56918f);
        sb.append(this.f56915c);
        sb.append(this.f56916d);
        sb.append(this.f56920h);
        String[] strArr = this.f56922j;
        if (strArr != null) {
            sb.append(strArr);
            sb.append(this.f56923k);
        }
        sb.append(this.f56924l);
        this.f56921i = new j(sb.toString());
        int i8 = this.f56915c;
        int i9 = this.f56916d;
        int i10 = i8 + i9;
        int i11 = this.f56913a;
        if (i10 > i11 && i11 > 0) {
            float f3 = (float) (i11 / (i8 + i9));
            this.f56915c = (int) (((float) i8) * f3);
            this.f56916d = (int) (((float) i9) * f3);
        }
        int i12 = this.f56918f;
        int i13 = this.f56917e;
        int i14 = i12 + i13;
        int i15 = this.f56914b;
        if (i14 > i15 && i15 > 0) {
            float f4 = (float) (i15 / (i12 + i13));
            this.f56918f = (int) (((float) i12) * f4);
            this.f56917e = (int) (((float) i13) * f4);
        }
    }
}
