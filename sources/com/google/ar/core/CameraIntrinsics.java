package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CameraIntrinsics {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33004);
    }

    protected CameraIntrinsics() {
    }

    private native long nativeCreateIntrinsics(long j2, float f2, float f3, float f4, float f5, int i2, int i3);

    private native void nativeDestroyCameraIntrinsics(long j2, long j3);

    private native void nativeGetFocalLength(long j2, long j3, float[] fArr, int i2);

    private native void nativeGetImageDimensions(long j2, long j3, int[] iArr, int i2);

    private native void nativeGetPrincipalPoint(long j2, long j3, float[] fArr, int i2);

    public float[] getFocalLength() {
        float[] fArr = new float[2];
        getFocalLength(fArr, 0);
        return fArr;
    }

    public int[] getImageDimensions() {
        int[] iArr = new int[2];
        getImageDimensions(iArr, 0);
        return iArr;
    }

    public float[] getPrincipalPoint() {
        float[] fArr = new float[2];
        getPrincipalPoint(fArr, 0);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(14160);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyCameraIntrinsics(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(14160);
    }

    CameraIntrinsics(long j2, Session session2) {
        this.nativeHandle = j2;
        this.session = session2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public void getFocalLength(float[] fArr, int i2) {
        MethodCollector.i(14162);
        nativeGetFocalLength(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2);
        MethodCollector.o(14162);
    }

    public void getImageDimensions(int[] iArr, int i2) {
        MethodCollector.i(14198);
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr, i2);
        MethodCollector.o(14198);
    }

    public void getPrincipalPoint(float[] fArr, int i2) {
        MethodCollector.i(14196);
        nativeGetPrincipalPoint(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2);
        MethodCollector.o(14196);
    }
}
