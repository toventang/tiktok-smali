package com.ss.android.ttve.nativePort;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.vesdk.u;
import java.io.File;

public class TEImageFactory {
    static {
        Covode.recordClassIndex(37721);
    }

    public static class ImageInfo {
        Bitmap bitmap;
        int height;
        String mimeType;
        int rotation;
        int width;

        static {
            Covode.recordClassIndex(37722);
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static boolean com_ss_android_ttve_nativePort_TEImageFactory_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(1659);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1659);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1659);
        return delete;
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str) {
        return decodeFile(contentResolver, str, null, 0, 0, -1);
    }

    private static Bitmap copyByDraw(Bitmap.Config config, Bitmap bitmap) {
        MethodCollector.i(1669);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        MethodCollector.o(1669);
        return createBitmap;
    }

    public static String getImageColorSpace(ContentResolver contentResolver, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return "Unknown";
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        if (options.outColorSpace != null) {
            return options.outColorSpace.getName();
        }
        return "Unknown";
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        String str2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf + 1 >= str.length()) {
            str2 = null;
        } else {
            str2 = str.substring(str.lastIndexOf(46) + 1);
        }
        if (!(imageInfo.mimeType == null || str2 == null || !str2.equals("mpg"))) {
            imageInfo.mimeType = null;
        }
        return imageInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[SYNTHETIC, Splitter:B:36:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFileCompat(android.content.ContentResolver r10, java.lang.String r11, android.graphics.BitmapFactory.Options r12) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.decodeFileCompat(android.content.ContentResolver, java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i2, int i3, int i4) {
        int calBestSampleSize2;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i4 != 1) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            }
        }
        if (i2 > 0 && i3 > 0) {
            options.inJustDecodeBounds = true;
            decodeFileCompat(contentResolver, str, options);
            if (!((Boolean) u.a().a("ve_enable_img_downsample_calculate_opt", (Object) false)).booleanValue()) {
                calBestSampleSize2 = TEJpegUtils.calBestSampleSize(options.outWidth, options.outHeight, i2, i3);
            } else {
                calBestSampleSize2 = TEJpegUtils.calBestSampleSize2(options.outWidth, options.outHeight, i2, i3);
            }
            if (calBestSampleSize2 > 0) {
                options.inSampleSize = calBestSampleSize2;
            }
            options.inJustDecodeBounds = false;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        if (decodeFileCompat == null) {
            return null;
        }
        if (decodeFileCompat.getConfig() != Bitmap.Config.ARGB_8888) {
            Bitmap copyByDraw = copyByDraw(Bitmap.Config.ARGB_8888, decodeFileCompat);
            recycleBitmap(decodeFileCompat);
            decodeFileCompat = copyByDraw;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = decodeFileCompat.getWidth();
        imageInfo.height = decodeFileCompat.getHeight();
        imageInfo.bitmap = decodeFileCompat;
        imageInfo.mimeType = "bitmap";
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083 A[SYNTHETIC, Splitter:B:34:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int writeFrame2file(byte[] r7, int r8, int r9, int r10, int r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.writeFrame2file(byte[], int, int, int, int, java.lang.String):int");
    }
}
