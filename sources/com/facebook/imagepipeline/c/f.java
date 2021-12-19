package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.h.a;

public abstract class f {
    static {
        Covode.recordClassIndex(28919);
    }

    public abstract a<Bitmap> a(int i2, int i3, Bitmap.Config config);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.c.f$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47718a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28920(0x70f8, float:4.0526E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.c.f.AnonymousClass1.f47718a = r2
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.c.f.AnonymousClass1.f47718a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.c.f.AnonymousClass1.f47718a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.c.f.AnonymousClass1.f47718a     // Catch:{ NoSuchFieldError -> 0x0038 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.c.f.AnonymousClass1.<clinit>():void");
        }
    }

    private static Bitmap.Config a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = bitmap.getConfig();
        if (config2 == null) {
            return config;
        }
        int i2 = AnonymousClass1.f47718a[config2.ordinal()];
        if (i2 == 1) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 != 2) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.ALPHA_8;
    }

    public final a<Bitmap> a(int i2, int i3) {
        return b(i2, i3, Bitmap.Config.ARGB_8888);
    }

    private static void c(int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "x must be >= 0");
        if (i3 < 0) {
            z2 = false;
        }
        i.a(z2, "y must be >= 0");
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
        int i2 = Build.VERSION.SDK_INT;
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        int i3 = Build.VERSION.SDK_INT;
        bitmap2.setPremultiplied(bitmap.isPremultiplied());
    }

    private static void b(int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "width must be > 0");
        if (i3 <= 0) {
            z2 = false;
        }
        i.a(z2, "height must be > 0");
    }

    public final a<Bitmap> b(int i2, int i3, Bitmap.Config config) {
        return a(i2, i3, config);
    }

    private a<Bitmap> a(int i2, int i3, Bitmap.Config config, boolean z) {
        return b(i2, i3, config, z);
    }

    private a<Bitmap> b(int i2, int i3, Bitmap.Config config, boolean z) {
        b(i2, i3);
        a<Bitmap> a2 = a(i2, i3, config);
        Bitmap a3 = a2.a();
        int i4 = Build.VERSION.SDK_INT;
        a3.setHasAlpha(z);
        if (config == Bitmap.Config.ARGB_8888 && !z) {
            a3.eraseColor(-16777216);
        }
        return a2;
    }

    private static void c(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2 = true;
        if (i2 + i4 <= bitmap.getWidth()) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "x + width must be <= bitmap.width()");
        if (i3 + i5 > bitmap.getHeight()) {
            z2 = false;
        }
        i.a(z2, "y + height must be <= bitmap.height()");
    }

    private a<Bitmap> b(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        i.a(bitmap, "Source bitmap cannot be null");
        c(i2, i3);
        b(i4, i5);
        c(bitmap, i2, i3, i4, i5);
        Rect rect = new Rect(i2, i3, i2 + i4, i3 + i5);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i5);
        a<Bitmap> a2 = a(i4, i5, a(bitmap), bitmap.hasAlpha());
        a(bitmap, a2.a());
        Canvas canvas = new Canvas(a2.a());
        canvas.drawBitmap(bitmap, rect, rectF, (Paint) null);
        canvas.setBitmap(null);
        return a2;
    }

    public final a<Bitmap> a(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        return b(bitmap, i2, i3, i4, i5);
    }
}
