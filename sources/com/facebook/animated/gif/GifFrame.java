package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.a.a.d;

public class GifFrame implements d {
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28550);
    }

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetTransparentPixelColor();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i2, int i3, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native void nativeDispose();

    /* access modifiers changed from: package-private */
    public native int nativeGetDisposalMode();

    /* access modifiers changed from: package-private */
    public native int nativeGetHeight();

    /* access modifiers changed from: package-private */
    public native int nativeGetWidth();

    /* access modifiers changed from: package-private */
    public native int nativeGetXOffset();

    /* access modifiers changed from: package-private */
    public native int nativeGetYOffset();

    @Override // com.facebook.imagepipeline.a.a.d
    public final void a() {
        MethodCollector.i(7909);
        nativeDispose();
        MethodCollector.o(7909);
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int b() {
        MethodCollector.i(8043);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.o(8043);
        return nativeGetWidth;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int c() {
        MethodCollector.i(8140);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.o(8140);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int d() {
        MethodCollector.i(8204);
        int nativeGetXOffset = nativeGetXOffset();
        MethodCollector.o(8204);
        return nativeGetXOffset;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int e() {
        MethodCollector.i(8213);
        int nativeGetYOffset = nativeGetYOffset();
        MethodCollector.o(8213);
        return nativeGetYOffset;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(7906);
        nativeFinalize();
        MethodCollector.o(7906);
    }

    GifFrame(long j2) {
        this.mNativeContext = j2;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final void a(int i2, int i3, Bitmap bitmap) {
        MethodCollector.i(7961);
        nativeRenderFrame(i2, i3, bitmap);
        MethodCollector.o(7961);
    }
}
