package com.bytedance.webx.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.c.a.b;
import com.bytedance.webx.c.a.c;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f45927a = new b();

    /* renamed from: com.bytedance.webx.c.a$a  reason: collision with other inner class name */
    public static class C1137a {

        /* renamed from: a  reason: collision with root package name */
        public int f45928a = 3;

        /* renamed from: b  reason: collision with root package name */
        public int f45929b;

        /* renamed from: c  reason: collision with root package name */
        public long f45930c;

        /* renamed from: d  reason: collision with root package name */
        public int f45931d = -1;

        /* renamed from: e  reason: collision with root package name */
        public String f45932e;

        /* renamed from: f  reason: collision with root package name */
        public int f45933f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap.Config f45934g;

        static {
            Covode.recordClassIndex(28077);
        }
    }

    static {
        Covode.recordClassIndex(28076);
    }

    public static C1137a a(View view) {
        return a(view, new com.bytedance.webx.c.a.a());
    }

    private static C1137a a(View view, b bVar) {
        int i2;
        int i3;
        C1137a aVar = new C1137a();
        int i4 = 0;
        if (view == null) {
            aVar.f45931d = 1;
            aVar.f45932e = "view is null.";
            aVar.f45928a = 3;
            return aVar;
        }
        Context context = view.getContext();
        if (context == null || context.getResources() == null) {
            aVar.f45931d = 4;
            aVar.f45932e = "context or context.getResources is null";
            aVar.f45928a = 3;
            return aVar;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            aVar.f45931d = 4;
            aVar.f45932e = "width and height must be > 0";
            aVar.f45928a = 3;
            return aVar;
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f45931d = 2;
            aVar.f45932e = "current thread is not main thread.";
            aVar.f45928a = 3;
            return aVar;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                c a2 = bVar.a(view);
                Bitmap bitmap = a2.f45938a;
                if (bitmap != null) {
                    aVar.f45934g = bitmap.getConfig();
                    int width2 = bitmap.getWidth();
                    int height2 = bitmap.getHeight();
                    if (width2 > 0 && height2 > 0) {
                        int pixel = bitmap.getPixel(0, 0);
                        aVar.f45929b = pixel;
                        f45927a.f45940a = pixel;
                        b bVar2 = f45927a;
                        int width3 = bitmap.getWidth();
                        int height3 = bitmap.getHeight();
                        if (width3 > 0 && height3 > 0) {
                            if (bVar2.f45940a == 0) {
                                i3 = bitmap.getPixel(0, 0);
                            } else {
                                i3 = bVar2.f45940a;
                            }
                            int[] iArr = new int[width3];
                            Arrays.fill(iArr, i3);
                            int[] iArr2 = new int[width3];
                            while (true) {
                                bitmap.getPixels(iArr2, 0, width3, 0, i4, width3, 1);
                                if (Arrays.equals(iArr, iArr2)) {
                                    i4++;
                                    if (i4 >= height3) {
                                        Integer.toHexString(i3);
                                        i2 = 1;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            aVar.f45928a = i2;
                        }
                        i2 = 2;
                        aVar.f45928a = i2;
                    }
                } else {
                    aVar.f45931d = 3;
                    aVar.f45932e = "bitmap is null.";
                    aVar.f45928a = 3;
                }
                aVar.f45933f = a2.f45939b;
                aVar.f45930c = System.currentTimeMillis() - currentTimeMillis2;
                return aVar;
            } catch (Throwable th) {
                aVar.f45931d = 4;
                aVar.f45932e = th.getMessage();
                aVar.f45928a = 3;
                aVar.f45930c = System.currentTimeMillis() - currentTimeMillis;
                return aVar;
            }
        }
    }
}
