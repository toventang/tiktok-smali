package org.webrtc;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

public class YuvHelper {
    static {
        Covode.recordClassIndex(106725);
    }

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9, int i10);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8);

    public static void copyPlane(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4, int i5) {
        MethodCollector.i(10857);
        nativeCopyPlane(byteBuffer, i2, byteBuffer2, i3, i4, i5);
        MethodCollector.o(10857);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6) {
        MethodCollector.i(10392);
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
            MethodCollector.o(10392);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i10 + " was " + byteBuffer4.capacity());
        MethodCollector.o(10392);
        throw illegalArgumentException;
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6) {
        MethodCollector.i(10549);
        int i7 = (i5 + 1) / 2;
        int i8 = i5 * i6;
        int i9 = (((i6 + 1) / 2) * i7 * 2) + i8;
        if (byteBuffer4.capacity() >= i9) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i8);
            nativeI420ToNV12(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, slice, i5, byteBuffer4.slice(), i7 * 2, i5, i6);
            MethodCollector.o(10549);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i9 + " was " + byteBuffer4.capacity());
        MethodCollector.o(10549);
        throw illegalArgumentException;
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, int i6, int i7) {
        int i8;
        int i9;
        MethodCollector.i(10707);
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
            MethodCollector.o(10707);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected destination buffer capacity to be at least " + i14 + " was " + byteBuffer4.capacity());
        MethodCollector.o(10707);
        throw illegalArgumentException;
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, int i7, int i8) {
        MethodCollector.i(10859);
        nativeI420ToNV12(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, i7, i8);
        MethodCollector.o(10859);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9) {
        MethodCollector.i(10858);
        nativeI420Copy(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, byteBuffer6, i7, i8, i9);
        MethodCollector.o(10858);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9, int i10) {
        MethodCollector.i(10860);
        nativeI420Rotate(byteBuffer, i2, byteBuffer2, i3, byteBuffer3, i4, byteBuffer4, i5, byteBuffer5, i6, byteBuffer6, i7, i8, i9, i10);
        MethodCollector.o(10860);
    }
}
