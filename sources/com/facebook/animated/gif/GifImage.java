package com.facebook.animated.gif;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.a.a.b;
import com.facebook.imagepipeline.a.a.c;
import com.facebook.imageutils.b;
import java.nio.ByteBuffer;

public class GifImage implements c, com.facebook.imagepipeline.a.b.c {
    private static volatile boolean sInitialized;
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28551);
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native GifImage nativeCreateFromNativeMemory(long j2, int i2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i2);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // com.facebook.imagepipeline.a.a.c
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public GifImage() {
    }

    public void dispose() {
        MethodCollector.i(6701);
        nativeDispose();
        MethodCollector.o(6701);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(6624);
        nativeFinalize();
        MethodCollector.o(6624);
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getDuration() {
        MethodCollector.i(7018);
        int nativeGetDuration = nativeGetDuration();
        MethodCollector.o(7018);
        return nativeGetDuration;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getFrameCount() {
        MethodCollector.i(7012);
        int nativeGetFrameCount = nativeGetFrameCount();
        MethodCollector.o(7012);
        return nativeGetFrameCount;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int[] getFrameDurations() {
        MethodCollector.i(7022);
        int[] nativeGetFrameDurations = nativeGetFrameDurations();
        MethodCollector.o(7022);
        return nativeGetFrameDurations;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getHeight() {
        MethodCollector.i(6944);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.o(6944);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getSizeInBytes() {
        MethodCollector.i(7125);
        int nativeGetSizeInBytes = nativeGetSizeInBytes();
        MethodCollector.o(7125);
        return nativeGetSizeInBytes;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getWidth() {
        MethodCollector.i(6849);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.o(6849);
        return nativeGetWidth;
    }

    private static synchronized void ensure() {
        synchronized (GifImage.class) {
            MethodCollector.i(6513);
            if (!sInitialized) {
                sInitialized = true;
                b.a("gifimage");
            }
            MethodCollector.o(6513);
        }
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getLoopCount() {
        MethodCollector.i(7076);
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            MethodCollector.o(7076);
            return 1;
        } else if (nativeGetLoopCount != 0) {
            int i2 = nativeGetLoopCount + 1;
            MethodCollector.o(7076);
            return i2;
        } else {
            MethodCollector.o(7076);
            return 0;
        }
    }

    GifImage(long j2) {
        this.mNativeContext = j2;
    }

    @Override // com.facebook.imagepipeline.a.b.c
    public c decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public GifFrame getFrame(int i2) {
        MethodCollector.i(7119);
        GifFrame nativeGetFrame = nativeGetFrame(i2);
        MethodCollector.o(7119);
        return nativeGetFrame;
    }

    private static b.EnumC1178b fromGifDisposalMethod(int i2) {
        if (i2 == 0) {
            return b.EnumC1178b.DISPOSE_DO_NOT;
        }
        if (i2 == 1) {
            return b.EnumC1178b.DISPOSE_DO_NOT;
        }
        if (i2 == 2) {
            return b.EnumC1178b.DISPOSE_TO_BACKGROUND;
        }
        if (i2 == 3) {
            return b.EnumC1178b.DISPOSE_TO_PREVIOUS;
        }
        return b.EnumC1178b.DISPOSE_DO_NOT;
    }

    public static GifImage create(ByteBuffer byteBuffer) {
        MethodCollector.i(6590);
        ensure();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        MethodCollector.o(6590);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public com.facebook.imagepipeline.a.a.b getFrameInfo(int i2) {
        MethodCollector.i(7184);
        GifFrame frame = getFrame(i2);
        try {
            return new com.facebook.imagepipeline.a.a.b(i2, frame.nativeGetXOffset(), frame.nativeGetYOffset(), frame.nativeGetWidth(), frame.nativeGetHeight(), b.a.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.nativeGetDisposalMode()));
        } finally {
            frame.nativeDispose();
            MethodCollector.o(7184);
        }
    }

    public static GifImage create(byte[] bArr) {
        MethodCollector.i(6586);
        ensure();
        i.a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect);
        MethodCollector.o(6586);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.a.b.c
    public c decode(long j2, int i2) {
        return create(j2, i2);
    }

    public static GifImage create(long j2, int i2) {
        boolean z;
        MethodCollector.i(6597);
        ensure();
        if (j2 != 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j2, i2);
        MethodCollector.o(6597);
        return nativeCreateFromNativeMemory;
    }
}
