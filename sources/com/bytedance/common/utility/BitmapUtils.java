package com.bytedance.common.utility;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BitmapUtils {
    static {
        Covode.recordClassIndex(15864);
    }

    private BitmapUtils() {
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i2, int i3) {
        MethodCollector.i(1283);
        if (bArr == null || i2 <= 0 || i3 <= 0) {
            MethodCollector.o(1283);
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int i6 = 1;
            while (true) {
                if (i4 / 2 >= i2 || i5 / 2 >= i3) {
                    i4 /= 2;
                    i5 /= 2;
                    i6 *= 2;
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i6;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    MethodCollector.o(1283);
                    return decodeByteArray;
                }
            }
        } catch (Exception unused) {
            MethodCollector.o(1283);
            return null;
        }
    }

    public static Bitmap getBitmapFromSD(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return decodeBitmap(file);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int readPictureDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean com_bytedance_common_utility_BitmapUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(1307);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1307);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1307);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC, Splitter:B:30:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[SYNTHETIC, Splitter:B:43:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void rotateImage(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.rotateImage(java.lang.String):void");
    }

    public static Bitmap decodeBitmap(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        MethodCollector.i(1319);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.o(1319);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                MethodCollector.o(1319);
                return decodeStream;
            } catch (Exception e4) {
                e2 = e4;
                try {
                    e2.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    MethodCollector.o(1319);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    MethodCollector.o(1319);
                    throw th;
                }
            }
        } catch (Exception e7) {
            e2 = e7;
            fileInputStream = null;
            e2.printStackTrace();
            fileInputStream.close();
            MethodCollector.o(1319);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2.close();
            MethodCollector.o(1319);
            throw th;
        }
    }

    public static Bitmap decodeBitmap(File file, int i2) {
        return decodeBitmap(file, i2, false);
    }

    public static Bitmap getBitmapFromSD(String str, int i2) {
        return getBitmapFromSD(str, i2, false);
    }

    public static Bitmap loadBitmap(int i2, String str) {
        return loadBitmap(i2, str, false);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i2) {
        MethodCollector.i(1355);
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            MethodCollector.o(1355);
            return createBitmap;
        }
        MethodCollector.o(1355);
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r4 == 1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap r8, long r9) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.compressBitmap(android.graphics.Bitmap, long):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapFromSD(String str, int i2, int i3) {
        return getBitmapFromSD(str, i2, i3, -1, null);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i2, int i3) {
        MethodCollector.i(1631);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > i2 || height > i3) {
            if (width <= height || width <= i2) {
                i2 = (int) (((float) width) * (((float) i3) / ((float) height)));
            } else {
                i3 = (int) (((float) height) * (((float) i2) / ((float) width)));
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
            MethodCollector.o(1631);
            return createScaledBitmap;
        }
        MethodCollector.o(1631);
        return bitmap;
    }

    public static Bitmap loadBitmap(int i2, String str, boolean z) {
        Bitmap.CompressFormat compressFormat;
        Bitmap.Config config;
        MethodCollector.i(1654);
        Bitmap bitmapFromSD = getBitmapFromSD(str, i2, z);
        if (bitmapFromSD == null) {
            MethodCollector.o(1654);
            return null;
        }
        int width = bitmapFromSD.getWidth();
        int height = bitmapFromSD.getHeight();
        if (width > i2 + 150 || (width > i2 && height > 4000)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromSD, i2, (int) (((((float) i2) * 1.0f) * ((float) height)) / ((float) width)), true);
            bitmapFromSD.recycle();
            if (createScaledBitmap == null) {
                MethodCollector.o(1654);
                return null;
            }
            bitmapFromSD = createScaledBitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmapFromSD.compress(compressFormat, 80, byteArrayOutputStream);
        bitmapFromSD.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        options.inPreferredConfig = config;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        MethodCollector.o(1654);
        return decodeByteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (0 == 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveImageData(byte[] r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 1336(0x538, float:1.872E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            r2 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.mkdirs()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0022:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r7)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r5)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.flush()     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.close()     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x003a:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0042
        L_0x003f:
            r2 = r1
            goto L_0x0048
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x0046:
            if (r2 == 0) goto L_0x004b
        L_0x0048:
            r2.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.saveImageData(byte[], java.lang.String, java.lang.String):boolean");
    }

    public static boolean saveBitmapToSD(Bitmap bitmap, String str, String str2) {
        Throwable th;
        Exception e2;
        MethodCollector.i(1329);
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file + "/" + str2);
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    MethodCollector.o(1329);
                    return false;
                }
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    MethodCollector.o(1329);
                    return true;
                } catch (Exception e5) {
                    e2 = e5;
                    fileOutputStream = fileOutputStream2;
                    try {
                        e2.printStackTrace();
                        try {
                            fileOutputStream.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        MethodCollector.o(1329);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        MethodCollector.o(1329);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream.close();
                    MethodCollector.o(1329);
                    throw th;
                }
            } catch (Exception e8) {
                e2 = e8;
                e2.printStackTrace();
                fileOutputStream.close();
                MethodCollector.o(1329);
                return false;
            }
        } else {
            MethodCollector.o(1329);
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getBitmapFromSD(java.lang.String r4, int r5, boolean r6) {
        /*
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            boolean r0 = r3.exists()
            r2 = 0
            if (r0 != 0) goto L_0x000d
            return r2
        L_0x000d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0014 }
            r3.setLastModified(r0)     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            android.graphics.Bitmap r0 = decodeBitmap(r3, r5, r6)     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            r0.printStackTrace()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(java.lang.String, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i2, boolean z) {
        Bitmap.Config config;
        MethodCollector.i(1304);
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                com_bytedance_common_utility_BitmapUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                MethodCollector.o(1304);
                return null;
            }
            int i3 = 1;
            while (options.outWidth >= i2 * 2 && options.outHeight >= 4000) {
                options.outWidth /= 2;
                options.outHeight /= 2;
                i3 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i3;
            options2.inPurgeable = true;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options2.inPreferredConfig = config;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
            fileInputStream2.close();
            if (bitmap == null) {
                com_bytedance_common_utility_BitmapUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            }
            MethodCollector.o(1304);
            return bitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i2, int i3, int i4) {
        return getBitmapFromSD(str, i2, i3, i4, null);
    }

    public static Bitmap decodeBitmap(ContentResolver contentResolver, Uri uri, int i2, int i3) {
        MethodCollector.i(1664);
        byte[] bArr = null;
        if (contentResolver == null || uri == null || i2 <= 0 || i3 <= 0) {
            MethodCollector.o(1664);
            return null;
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                MethodCollector.o(1664);
                return null;
            }
            byte[] bArr2 = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = openInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            bArr = byteArrayOutputStream.toByteArray();
            Bitmap decodeBitmap = decodeBitmap(bArr, i2, i3);
            MethodCollector.o(1664);
            return decodeBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Bitmap decodeBitmap(Context context, int i2, int i3, int i4) {
        MethodCollector.i(1667);
        if (context == null || i2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(1667);
            return null;
        }
        Resources resources = context.getResources();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i2, options);
            int i5 = options.outWidth;
            int i6 = options.outHeight;
            int i7 = 1;
            while (true) {
                if (i5 / 2 >= i3 || i6 / 2 >= i4) {
                    i5 /= 2;
                    i6 /= 2;
                    i7 *= 2;
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i7;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    return BitmapFactory.decodeResource(resources, i2, options2);
                }
            }
        } catch (Exception unused) {
            return null;
        } finally {
            MethodCollector.o(1667);
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i2, int i3, Bitmap.Config config) {
        return getBitmapFromSD(str, i2, i3, -1, config);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e A[SYNTHETIC, Splitter:B:36:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC, Splitter:B:45:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeBitmap(java.io.File r8, int r9, int r10, android.graphics.Bitmap.Config r11) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.decodeBitmap(java.io.File, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapFromSD(String str, int i2, int i3, int i4, Bitmap.Config config) {
        try {
            File file = new File(str);
            if (!file.isFile()) {
                return null;
            }
            if (i4 <= 0 || file.length() <= ((long) i4)) {
                try {
                    file.setLastModified(System.currentTimeMillis());
                } catch (Exception unused) {
                }
                return decodeBitmap(file, i2, i3, config);
            }
            com_bytedance_common_utility_BitmapUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
