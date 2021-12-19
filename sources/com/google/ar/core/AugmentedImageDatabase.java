package com.google.ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32995);
    }

    private native int nativeAddImage(long j2, long j3, String str, ByteBuffer byteBuffer, int i2, int i3, int i4);

    private native int nativeAddImageWithPhysicalSize(long j2, long j3, String str, ByteBuffer byteBuffer, int i2, int i3, int i4, float f2);

    private static native long nativeCreate(long j2);

    private static native long nativeDeserialize(long j2, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j2, long j3);

    private native void nativeReleaseDatabase(long j2, long j3);

    private native ByteBuffer nativeSerialize(long j2, long j3);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(12179);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(12179);
    }

    public int getNumImages() {
        MethodCollector.i(11540);
        int nativeGetNumImages = nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(11540);
        return nativeGetNumImages;
    }

    public AugmentedImageDatabase(Session session2) {
        this(session2, nativeCreate(session2.nativeWrapperHandle));
        MethodCollector.i(11215);
        MethodCollector.o(11215);
    }

    public void serialize(OutputStream outputStream) {
        MethodCollector.i(11706);
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(11706);
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) {
        MethodCollector.i(12701);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                MethodCollector.o(12701);
                return allocateDirect;
            }
        }
    }

    static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        MethodCollector.i(12586);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight());
        for (int i2 = 0; i2 < bitmap.getHeight(); i2++) {
            for (int i3 = 0; i3 < bitmap.getWidth(); i3++) {
                allocateDirect.put((bitmap.getWidth() * i2) + i3, (byte) Color.red(createBitmap.getPixel(i3, i2)));
            }
        }
        MethodCollector.o(12586);
        return allocateDirect;
    }

    AugmentedImageDatabase(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public static AugmentedImageDatabase deserialize(Session session2, InputStream inputStream) {
        MethodCollector.i(11214);
        AugmentedImageDatabase augmentedImageDatabase = new AugmentedImageDatabase(session2, nativeDeserialize(session2.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
        MethodCollector.o(11214);
        return augmentedImageDatabase;
    }

    public int addImage(String str, Bitmap bitmap) {
        MethodCollector.i(11217);
        int nativeAddImage = nativeAddImage(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
        MethodCollector.o(11217);
        return nativeAddImage;
    }

    public int addImage(String str, Bitmap bitmap, float f2) {
        MethodCollector.i(11538);
        int nativeAddImageWithPhysicalSize = nativeAddImageWithPhysicalSize(this.session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f2);
        MethodCollector.o(11538);
        return nativeAddImageWithPhysicalSize;
    }
}
