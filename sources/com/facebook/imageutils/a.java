package com.facebook.imageutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final f.c<ByteBuffer> f48468a = new f.c<>(12);

    static {
        Covode.recordClassIndex(29228);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imageutils.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48469a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 29229(0x722d, float:4.0959E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imageutils.a.AnonymousClass1.f48469a = r2
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imageutils.a.AnonymousClass1.f48469a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imageutils.a.AnonymousClass1.f48469a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imageutils.a.AnonymousClass1.f48469a     // Catch:{ NoSuchFieldError -> 0x0038 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.facebook.imageutils.a.AnonymousClass1.f48469a     // Catch:{ NoSuchFieldError -> 0x0043 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.a.AnonymousClass1.<clinit>():void");
        }
    }

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        return bitmap.getByteCount();
    }

    public static int a(Bitmap.Config config) {
        int i2 = AnonymousClass1.f48469a[config.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3 || i2 == 4) {
            return 2;
        }
        if (i2 == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        MethodCollector.i(2203);
        i.a(inputStream);
        f.c<ByteBuffer> cVar = f48468a;
        ByteBuffer acquire = cVar.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            cVar.release(acquire);
            MethodCollector.o(2203);
            return pair;
        } catch (Throwable th) {
            f48468a.release(acquire);
            MethodCollector.o(2203);
            throw th;
        }
    }

    public static d b(InputStream inputStream) {
        MethodCollector.i(2215);
        i.a(inputStream);
        f.c<ByteBuffer> cVar = f48468a;
        ByteBuffer acquire = cVar.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            d dVar = new d(options.outWidth, options.outHeight, colorSpace);
            cVar.release(acquire);
            MethodCollector.o(2215);
            return dVar;
        } catch (Throwable th) {
            f48468a.release(acquire);
            MethodCollector.o(2215);
            throw th;
        }
    }

    public static int a(int i2, int i3, Bitmap.Config config) {
        return i2 * i3 * a(config);
    }
}
