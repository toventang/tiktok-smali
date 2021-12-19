package com.facebook.webpsupport;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.l.a;
import com.facebook.common.l.b;
import com.facebook.common.l.c;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl implements b {
    public static final boolean IN_BITMAP_SUPPORTED = true;
    private static a mBitmapCreator;
    private static b.a mWebpErrorLogger;

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options, float f2, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f2, byte[] bArr);

    private static native long nativeSeek(FileDescriptor fileDescriptor, long j2, boolean z);

    private static void sendWebpErrorLog(String str) {
    }

    static {
        Covode.recordClassIndex(30784);
        int i2 = Build.VERSION.SDK_INT;
    }

    @Override // com.facebook.common.l.b
    public void setBitmapCreator(a aVar) {
        mBitmapCreator = aVar;
    }

    @Override // com.facebook.common.l.b
    public void setWebpErrorLogger(b.a aVar) {
        mWebpErrorLogger = aVar;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        if (options == null || options.inTempStorage == null) {
            return new byte[8192];
        }
        return options.inTempStorage;
    }

    private static Bitmap originalDecodeFile(String str) {
        MethodCollector.i(9062);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        MethodCollector.o(9062);
        return decodeFile;
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        MethodCollector.i(9066);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
        MethodCollector.o(9066);
        return decodeFileDescriptor;
    }

    private static Bitmap originalDecodeStream(InputStream inputStream) {
        MethodCollector.i(8265);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        MethodCollector.o(8265);
        return decodeStream;
    }

    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        int i2 = Build.VERSION.SDK_INT;
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f2 = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i2 = options.inSampleSize;
        if (i2 > 1) {
            f2 = 1.0f / ((float) i2);
        }
        if (!options.inScaled) {
            return f2;
        }
        int i3 = options.inDensity;
        int i4 = options.inTargetDensity;
        int i5 = options.inScreenDensity;
        if (i3 == 0 || i4 == 0 || i3 == i5) {
            return f2;
        }
        return ((float) i4) / ((float) i3);
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        MethodCollector.i(7988);
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        MethodCollector.o(7988);
        return inputStream;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i2) {
        return hookDecodeResource(resources, i2, null);
    }

    public Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return hookDecodeFile(str, options);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i2) {
        MethodCollector.i(8859);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2);
        MethodCollector.o(8859);
        return decodeResource;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        MethodCollector.i(8865);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        MethodCollector.o(8865);
        return decodeFile;
    }

    private static byte[] getWebpHeader(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        MethodCollector.i(8023);
        inputStream.mark(20);
        if (options == null || options.inTempStorage == null || options.inTempStorage.length < 20) {
            bArr = new byte[20];
        } else {
            bArr = options.inTempStorage;
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            MethodCollector.o(8023);
            return bArr;
        } catch (IOException unused) {
            MethodCollector.o(8023);
            return null;
        }
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        MethodCollector.i(8270);
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                MethodCollector.o(8270);
                throw th;
            }
        } catch (Exception unused) {
        }
        MethodCollector.o(8270);
        return bitmap;
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i2 = options.inDensity;
            if (i2 != 0) {
                bitmap.setDensity(i2);
                int i3 = options.inTargetDensity;
                if (i3 != 0 && i2 != i3 && i2 != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i3);
                }
            } else if (IN_BITMAP_SUPPORTED && options.inBitmap != null) {
                int i4 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i4 != 0) {
                    bitmap.setDensity(i4);
                } else {
                    bitmap.setDensity(160);
                }
            }
        }
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i2, int i3) {
        return hookDecodeByteArray(bArr, i2, i3, null);
    }

    private static void setBitmapSize(BitmapFactory.Options options, int i2, int i3) {
        if (options != null) {
            options.outWidth = i2;
            options.outHeight = i3;
        }
    }

    @Override // com.facebook.common.l.b
    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @Override // com.facebook.common.l.b
    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8146);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i2, i3);
        MethodCollector.o(8146);
        return decodeByteArray;
    }

    private static boolean setOutDimensions(BitmapFactory.Options options, int i2, int i3) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i2;
        options.outHeight = i3;
        return true;
    }

    private static Bitmap createBitmap(int i2, int i3, BitmapFactory.Options options) {
        if (!IN_BITMAP_SUPPORTED || options == null || options.inBitmap == null || !options.inBitmap.isMutable()) {
            return mBitmapCreator.a(i2, i3, Bitmap.Config.ARGB_8888);
        }
        return options.inBitmap;
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        MethodCollector.i(9065);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        MethodCollector.o(9065);
        return decodeFileDescriptor;
    }

    private static Bitmap originalDecodeResource(Resources resources, int i2, BitmapFactory.Options options) {
        MethodCollector.i(8856);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
        MethodCollector.o(8856);
        return decodeResource;
    }

    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        MethodCollector.i(8262);
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
        MethodCollector.o(8262);
        return decodeStream;
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        MethodCollector.i(9064);
        com.facebook.imagepipeline.nativecode.b.a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
            try {
                byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
                if (!c.f47136a || !c.a(webpHeader, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    wrapToMarkSupportedStream.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } else {
            bitmap = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
        }
        MethodCollector.o(9064);
        return bitmap;
        MethodCollector.o(9064);
        throw th;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i2, BitmapFactory.Options options) {
        MethodCollector.i(8544);
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i2, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } catch (Throwable th) {
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                MethodCollector.o(8544);
                throw th;
            }
        } catch (Exception unused) {
        }
        if (!IN_BITMAP_SUPPORTED || bitmap != null || options == null || options.inBitmap == null) {
            MethodCollector.o(8544);
            return bitmap;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Problem decoding into existing bitmap");
        MethodCollector.o(8544);
        throw illegalArgumentException;
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap originalDecodeStream;
        MethodCollector.i(8216);
        com.facebook.imagepipeline.nativecode.b.a();
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
        if ((c.f47136a || Build.VERSION.SDK_INT == 28) && c.a(webpHeader, 0, 20) && options.inPreferredConfig == Bitmap.Config.ARGB_8888) {
            originalDecodeStream = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream");
            }
            setWebpBitmapOptions(originalDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            originalDecodeStream = originalDecodeStream(wrapToMarkSupportedStream, rect, options);
            if (originalDecodeStream == null) {
                sendWebpErrorLog("webp_direct_decode_stream_failed_on_no_webp");
            }
        }
        MethodCollector.o(8216);
        return originalDecodeStream;
    }

    public Bitmap decodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options) {
        return hookDecodeByteArray(bArr, i2, i3, options);
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options) {
        MethodCollector.i(8142);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i2, i3, options);
        MethodCollector.o(8142);
        return decodeByteArray;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i2, int i3, BitmapFactory.Options options) {
        Bitmap originalDecodeByteArray;
        MethodCollector.i(8138);
        com.facebook.imagepipeline.nativecode.b.a();
        if (!c.f47136a || !c.a(bArr, i2, i3)) {
            originalDecodeByteArray = originalDecodeByteArray(bArr, i2, i3, options);
            if (originalDecodeByteArray == null) {
                sendWebpErrorLog("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            originalDecodeByteArray = nativeDecodeByteArray(bArr, i2, i3, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeByteArray == null) {
                sendWebpErrorLog("webp_direct_decode_array");
            }
            setWebpBitmapOptions(originalDecodeByteArray, options);
        }
        MethodCollector.o(8138);
        return originalDecodeByteArray;
    }

    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        MethodCollector.i(8386);
        Bitmap decodeResourceStream = BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
        MethodCollector.o(8386);
        return decodeResourceStream;
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i2 = typedValue.density;
            if (i2 == 0) {
                options.inDensity = 160;
            } else if (i2 != 65535) {
                options.inDensity = i2;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }
}
