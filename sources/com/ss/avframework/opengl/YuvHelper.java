package com.ss.avframework.opengl;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

public class YuvHelper {
    static {
        Covode.recordClassIndex(100549);
    }

    private static native void nativeAndroid420ToI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, ByteBuffer byteBuffer4, int i6, ByteBuffer byteBuffer5, int i7, ByteBuffer byteBuffer6, int i8, int i9, int i10);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9, int i10);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8);

    private static native void nativeNV21ToI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8);

    public static void I420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6) {
        MethodCollector.i(11683);
        int i7 = (i5 + 1) / 2;
        int i8 = i5 * i6;
        int i9 = ((i6 + 1) / 2) * i7;
        int i10 = (i9 * 2) + i8;
        if (byteBuffer4.capacity() >= i10) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i8);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i9 + i8);
            nativeI420Copy(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, slice, i5, slice2, i7, byteBuffer4.slice(), i7, i5, i6);
            MethodCollector.o(11683);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i10 + " was " + byteBuffer4.capacity());
        MethodCollector.o(11683);
        throw illegalArgumentException;
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6) {
        MethodCollector.i(11999);
        int i7 = (i5 + 1) / 2;
        int i8 = i5 * i6;
        int i9 = (((i6 + 1) / 2) * i7 * 2) + i8;
        if (byteBuffer4.capacity() >= i9) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i8);
            nativeI420ToNV12(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, slice, i5, byteBuffer4.slice(), i7 * 2, i5, i6);
            MethodCollector.o(11999);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i9 + " was " + byteBuffer4.capacity());
        MethodCollector.o(11999);
        throw illegalArgumentException;
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6, int i7) {
        int i8;
        int i9;
        MethodCollector.i(12145);
        if (i7 % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            i8 = i5;
            i9 = i6;
        } else {
            i8 = i6;
            i9 = i5;
        }
        int i10 = (i9 + 1) / 2;
        int i11 = (i8 + 1) / 2;
        int i12 = i9 * i8;
        int i13 = i10 * i11;
        int i14 = (i13 * 2) + i12;
        if (byteBuffer4.capacity() >= i14) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i12);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i13 + i12);
            nativeI420Rotate(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, slice, i8, slice2, i11, byteBuffer4.slice(), i11, i5, i6, i7);
            MethodCollector.o(12145);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i14 + " was " + byteBuffer4.capacity());
        MethodCollector.o(12145);
        throw illegalArgumentException;
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8) {
        MethodCollector.i(12288);
        nativeI420ToNV12(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, i7, i8);
        MethodCollector.o(12288);
    }

    public static void NV21ToI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8) {
        MethodCollector.i(12291);
        nativeNV21ToI420(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, i7, i8);
        MethodCollector.o(12291);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9) {
        MethodCollector.i(12287);
        nativeI420Copy(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, byteBuffer6, i7, i8, i9);
        MethodCollector.o(12287);
    }

    public static void Android420ToI420(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, ByteBuffer byteBuffer4, int i6, ByteBuffer byteBuffer5, int i7, ByteBuffer byteBuffer6, int i8, int i9, int i10) {
        MethodCollector.i(12292);
        nativeAndroid420ToI420(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, i5, byteBuffer4, i6, byteBuffer5, i7, byteBuffer6, i8, i9, i10);
        MethodCollector.o(12292);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9, int i10) {
        MethodCollector.i(12290);
        nativeI420Rotate(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, byteBuffer6, i7, i8, i9, i10);
        MethodCollector.o(12290);
    }
}
