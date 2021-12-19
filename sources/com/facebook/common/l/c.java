package com.facebook.common.l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.UnsupportedEncodingException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f47136a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f47137b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f47138c;

    /* renamed from: d  reason: collision with root package name */
    public static b f47139d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f47140e = a("VP8 ");

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f47141f = a("VP8L");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f47142g = a("VP8X");

    /* renamed from: h  reason: collision with root package name */
    private static boolean f47143h = false;

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f47144i = a("RIFF");

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f47145j = a("WEBP");

    public static b a() {
        if (f47143h) {
            return f47139d;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f47143h = true;
        return bVar;
    }

    static {
        MethodCollector.i(4376);
        Covode.recordClassIndex(28686);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                z = false;
            }
        }
        f47138c = z;
        MethodCollector.o(4376);
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        if (i3 < 20 || !a(bArr, i2, f47144i) || !a(bArr, i2 + 8, f47145j)) {
            return false;
        }
        return true;
    }

    public static boolean a(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
