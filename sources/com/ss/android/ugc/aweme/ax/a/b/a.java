package com.ss.android.ugc.aweme.ax.a.b;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.ax.a.b.a$a  reason: collision with other inner class name */
    public static class C1528a {

        /* renamed from: a  reason: collision with root package name */
        public int f67706a;

        /* renamed from: b  reason: collision with root package name */
        public int f67707b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f67708c;

        static {
            Covode.recordClassIndex(41675);
        }
    }

    static {
        Covode.recordClassIndex(41674);
    }

    public static C1528a a(View view) {
        int i2;
        int i3;
        C1528a aVar = new C1528a();
        if (view == null || Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f67706a = 3;
            return aVar;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        if (!isDrawingCacheEnabled) {
            try {
                view.setDrawingCacheEnabled(true);
            } catch (Throwable th) {
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(false);
                }
                throw th;
            }
        }
        SystemClock.uptimeMillis();
        Bitmap drawingCache = view.getDrawingCache();
        SystemClock.uptimeMillis();
        if (drawingCache != null) {
            int width = drawingCache.getWidth();
            int height = drawingCache.getHeight();
            aVar.f67708c = drawingCache.getConfig();
            if (width > 0 && height > 0) {
                int pixel = drawingCache.getPixel(0, 0);
                aVar.f67707b = pixel;
                g gVar = new g(pixel);
                int width2 = drawingCache.getWidth();
                int height2 = drawingCache.getHeight();
                if (width2 > 0 && height2 > 0) {
                    if (gVar.f67723a == 0) {
                        i3 = drawingCache.getPixel(0, 0);
                    } else {
                        i3 = gVar.f67723a;
                    }
                    int[] iArr = new int[width2];
                    Arrays.fill(iArr, i3);
                    int[] iArr2 = new int[width2];
                    int i4 = 0;
                    while (true) {
                        drawingCache.getPixels(iArr2, 0, width2, 0, i4, width2, 1);
                        if (Arrays.equals(iArr, iArr2)) {
                            i4++;
                            iArr2 = iArr2;
                            width2 = width2;
                            if (i4 >= height2) {
                                Integer.toHexString(i3);
                                i2 = 1;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                i2 = 2;
                aVar.f67706a = i2;
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(false);
                }
                return aVar;
            }
        }
        if (!isDrawingCacheEnabled) {
            view.setDrawingCacheEnabled(false);
        }
        aVar.f67706a = 2;
        return aVar;
    }
}
