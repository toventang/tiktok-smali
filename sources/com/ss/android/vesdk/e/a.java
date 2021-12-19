package com.ss.android.vesdk.e;

import android.graphics.SurfaceTexture;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends SurfaceTexture {

    /* renamed from: a  reason: collision with root package name */
    private boolean f151267a;

    static {
        Covode.recordClassIndex(99431);
    }

    public final boolean isReleased() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.isReleased();
        }
        return this.f151267a;
    }

    public final synchronized void detachFromGLContext() {
        MethodCollector.i(1793);
        if (isReleased()) {
            MethodCollector.o(1793);
            return;
        }
        super.detachFromGLContext();
        MethodCollector.o(1793);
    }

    public final synchronized long getTimestamp() {
        MethodCollector.i(1800);
        if (isReleased()) {
            MethodCollector.o(1800);
            return -1;
        }
        long timestamp = super.getTimestamp();
        MethodCollector.o(1800);
        return timestamp;
    }

    public final synchronized void release() {
        MethodCollector.i(1802);
        if (isReleased()) {
            MethodCollector.o(1802);
            return;
        }
        super.release();
        this.f151267a = true;
        MethodCollector.o(1802);
    }

    public final synchronized void releaseTexImage() {
        MethodCollector.i(1790);
        if (isReleased()) {
            MethodCollector.o(1790);
            return;
        }
        super.releaseTexImage();
        MethodCollector.o(1790);
    }

    public final synchronized void updateTexImage() {
        MethodCollector.i(1789);
        if (isReleased()) {
            MethodCollector.o(1789);
            return;
        }
        super.updateTexImage();
        MethodCollector.o(1789);
    }

    public a(int i2) {
        super(i2);
    }

    public final synchronized void attachToGLContext(int i2) {
        MethodCollector.i(1796);
        if (isReleased()) {
            MethodCollector.o(1796);
            return;
        }
        super.attachToGLContext(i2);
        MethodCollector.o(1796);
    }

    public final synchronized void getTransformMatrix(float[] fArr) {
        MethodCollector.i(1798);
        if (isReleased()) {
            MethodCollector.o(1798);
            return;
        }
        super.getTransformMatrix(fArr);
        MethodCollector.o(1798);
    }

    public final synchronized void setDefaultBufferSize(int i2, int i3) {
        MethodCollector.i(1782);
        if (isReleased()) {
            MethodCollector.o(1782);
            return;
        }
        super.setDefaultBufferSize(i2, i3);
        MethodCollector.o(1782);
    }
}
