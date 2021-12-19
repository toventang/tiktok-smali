package com.ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class GlRenderDrawer {
    private long mNativeObj = nativeCreateRender();

    static {
        Covode.recordClassIndex(100533);
    }

    private native long nativeCreateRender();

    private native boolean nativeDrawOes(long j2, int i2, float[] fArr, float[] fArr2, int i3, int i4, int i5, int i6);

    private native boolean nativeDrawRectangle(long j2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawRgb(long j2, int i2, float[] fArr, float[] fArr2, int i3, int i4, int i5, int i6);

    private native boolean nativeDrawYuv(long j2, int[] iArr, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5, int i6);

    private native void nativeRelease(long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    public GlRenderDrawer() {
        MethodCollector.i(9708);
        MethodCollector.o(9708);
    }

    public void release() {
        MethodCollector.i(10214);
        long j2 = this.mNativeObj;
        if (j2 != 0) {
            nativeRelease(j2);
        }
        this.mNativeObj = 0;
        MethodCollector.o(10214);
    }

    public boolean drawRectangle(int i2, int i3, int i4, int i5) {
        MethodCollector.i(10213);
        boolean nativeDrawRectangle = nativeDrawRectangle(this.mNativeObj, i2, i3, i4, i5);
        MethodCollector.o(10213);
        return nativeDrawRectangle;
    }

    public boolean drawOes(int i2, float[] fArr, float[] fArr2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(10048);
        boolean nativeDrawOes = nativeDrawOes(this.mNativeObj, i2, fArr, fArr2, i3, i4, i5, i6);
        MethodCollector.o(10048);
        return nativeDrawOes;
    }

    public boolean drawRgb(int i2, float[] fArr, float[] fArr2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(9880);
        boolean nativeDrawRgb = nativeDrawRgb(this.mNativeObj, i2, fArr, fArr2, i3, i4, i5, i6);
        MethodCollector.o(9880);
        return nativeDrawRgb;
    }

    public boolean drawYuv(int[] iArr, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(10049);
        boolean nativeDrawYuv = nativeDrawYuv(this.mNativeObj, iArr, fArr, fArr2, i2, i3, i4, i5, i6);
        MethodCollector.o(10049);
        return nativeDrawYuv;
    }
}
