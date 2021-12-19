package com.facebook.animated.webp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.a.a.b;
import com.facebook.imagepipeline.a.a.c;
import com.facebook.imagepipeline.nativecode.b;
import java.nio.ByteBuffer;

public class WebPImage implements c, com.facebook.imagepipeline.a.b.c {
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28553);
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j2, int i2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i2);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // com.facebook.imagepipeline.a.a.c
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage() {
    }

    public void dispose() {
        MethodCollector.i(6349);
        nativeDispose();
        MethodCollector.o(6349);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(6296);
        nativeFinalize();
        MethodCollector.o(6296);
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getDuration() {
        MethodCollector.i(6576);
        int nativeGetDuration = nativeGetDuration();
        MethodCollector.o(6576);
        return nativeGetDuration;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getFrameCount() {
        MethodCollector.i(6568);
        int nativeGetFrameCount = nativeGetFrameCount();
        MethodCollector.o(6568);
        return nativeGetFrameCount;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int[] getFrameDurations() {
        MethodCollector.i(6579);
        int[] nativeGetFrameDurations = nativeGetFrameDurations();
        MethodCollector.o(6579);
        return nativeGetFrameDurations;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getHeight() {
        MethodCollector.i(6544);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.o(6544);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getLoopCount() {
        MethodCollector.i(6712);
        int nativeGetLoopCount = nativeGetLoopCount();
        MethodCollector.o(6712);
        return nativeGetLoopCount;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getSizeInBytes() {
        MethodCollector.i(6723);
        int nativeGetSizeInBytes = nativeGetSizeInBytes();
        MethodCollector.o(6723);
        return nativeGetSizeInBytes;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public int getWidth() {
        MethodCollector.i(6542);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.o(6542);
        return nativeGetWidth;
    }

    WebPImage(long j2) {
        this.mNativeContext = j2;
    }

    @Override // com.facebook.imagepipeline.a.b.c
    public c decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public WebPFrame getFrame(int i2) {
        MethodCollector.i(6717);
        WebPFrame nativeGetFrame = nativeGetFrame(i2);
        MethodCollector.o(6717);
        return nativeGetFrame;
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        MethodCollector.i(6523);
        b.a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        MethodCollector.o(6523);
        return nativeCreateFromDirectByteBuffer;
    }

    public static WebPImage create(byte[] bArr) {
        MethodCollector.i(6435);
        b.a();
        i.a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect);
        MethodCollector.o(6435);
        return nativeCreateFromDirectByteBuffer;
    }

    @Override // com.facebook.imagepipeline.a.a.c
    public com.facebook.imagepipeline.a.a.b getFrameInfo(int i2) {
        b.a aVar;
        b.EnumC1178b bVar;
        MethodCollector.i(6736);
        WebPFrame frame = getFrame(i2);
        try {
            int nativeGetXOffset = frame.nativeGetXOffset();
            int nativeGetYOffset = frame.nativeGetYOffset();
            int nativeGetWidth = frame.nativeGetWidth();
            int nativeGetHeight = frame.nativeGetHeight();
            if (frame.nativeIsBlendWithPreviousFrame()) {
                aVar = b.a.BLEND_WITH_PREVIOUS;
            } else {
                aVar = b.a.NO_BLEND;
            }
            if (frame.nativeShouldDisposeToBackgroundColor()) {
                bVar = b.EnumC1178b.DISPOSE_TO_BACKGROUND;
            } else {
                bVar = b.EnumC1178b.DISPOSE_DO_NOT;
            }
            return new com.facebook.imagepipeline.a.a.b(i2, nativeGetXOffset, nativeGetYOffset, nativeGetWidth, nativeGetHeight, aVar, bVar);
        } finally {
            frame.nativeDispose();
            MethodCollector.o(6736);
        }
    }

    @Override // com.facebook.imagepipeline.a.b.c
    public c decode(long j2, int i2) {
        return create(j2, i2);
    }

    public static WebPImage create(long j2, int i2) {
        boolean z;
        MethodCollector.i(6526);
        com.facebook.imagepipeline.nativecode.b.a();
        if (j2 != 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j2, i2);
        MethodCollector.o(6526);
        return nativeCreateFromNativeMemory;
    }
}
