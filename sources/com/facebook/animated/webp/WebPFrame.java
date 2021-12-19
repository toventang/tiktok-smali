package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.a.a.d;

public class WebPFrame implements d {
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28552);
    }

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native void nativeRenderFrame(int i2, int i3, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native void nativeDispose();

    /* access modifiers changed from: package-private */
    public native int nativeGetHeight();

    /* access modifiers changed from: package-private */
    public native int nativeGetWidth();

    /* access modifiers changed from: package-private */
    public native int nativeGetXOffset();

    /* access modifiers changed from: package-private */
    public native int nativeGetYOffset();

    /* access modifiers changed from: package-private */
    public native boolean nativeIsBlendWithPreviousFrame();

    /* access modifiers changed from: package-private */
    public native boolean nativeShouldDisposeToBackgroundColor();

    @Override // com.facebook.imagepipeline.a.a.d
    public final void a() {
        MethodCollector.i(5917);
        nativeDispose();
        MethodCollector.o(5917);
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int b() {
        MethodCollector.i(5987);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.o(5987);
        return nativeGetWidth;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int c() {
        MethodCollector.i(6057);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.o(6057);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int d() {
        MethodCollector.i(6060);
        int nativeGetXOffset = nativeGetXOffset();
        MethodCollector.o(6060);
        return nativeGetXOffset;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final int e() {
        MethodCollector.i(6149);
        int nativeGetYOffset = nativeGetYOffset();
        MethodCollector.o(6149);
        return nativeGetYOffset;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(5853);
        nativeFinalize();
        MethodCollector.o(5853);
    }

    WebPFrame(long j2) {
        this.mNativeContext = j2;
    }

    @Override // com.facebook.imagepipeline.a.a.d
    public final void a(int i2, int i3, Bitmap bitmap) {
        MethodCollector.i(5921);
        nativeRenderFrame(i2, i3, bitmap);
        MethodCollector.o(5921);
    }
}
