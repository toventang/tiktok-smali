package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.CameraConfig;
import java.util.EnumSet;
import java.util.Iterator;

public class CameraConfigFilter {
    private static final String TAG = CameraConfigFilter.class.getSimpleName();
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected CameraConfigFilter() {
    }

    private static native long nativeCreateCameraConfigFilter(long j2);

    private static native void nativeDestroyCameraConfigFilter(long j2, long j3);

    private native int nativeGetDepthSensorUsage(long j2, long j3);

    private native int nativeGetFacingDirection(long j2, long j3);

    private native int nativeGetStereoCameraUsage(long j2, long j3);

    private native int nativeGetTargetFps(long j2, long j3);

    private native void nativeSetDepthSensorUsage(long j2, long j3, int i2);

    private native void nativeSetFacingDirection(long j2, long j3, int i2);

    private native void nativeSetStereoCameraUsage(long j2, long j3, int i2);

    private native void nativeSetTargetFps(long j2, long j3, int i2);

    static {
        Covode.recordClassIndex(33003);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(9425);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyCameraConfigFilter(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(9425);
    }

    public EnumSet<CameraConfig.DepthSensorUsage> getDepthSensorUsage() {
        MethodCollector.i(9746);
        EnumSet<CameraConfig.DepthSensorUsage> forBitFlags = CameraConfig.DepthSensorUsage.forBitFlags(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(9746);
        return forBitFlags;
    }

    public CameraConfig.FacingDirection getFacingDirection() {
        MethodCollector.i(9903);
        CameraConfig.FacingDirection forNumber = CameraConfig.FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(9903);
        return forNumber;
    }

    public EnumSet<CameraConfig.StereoCameraUsage> getStereoCameraUsage() {
        MethodCollector.i(9899);
        EnumSet<CameraConfig.StereoCameraUsage> forBitFlags = CameraConfig.StereoCameraUsage.forBitFlags(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(9899);
        return forBitFlags;
    }

    public EnumSet<CameraConfig.TargetFps> getTargetFps() {
        MethodCollector.i(9583);
        EnumSet<CameraConfig.TargetFps> forBitFlags = CameraConfig.TargetFps.forBitFlags(nativeGetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(9583);
        return forBitFlags;
    }

    public CameraConfigFilter(Session session2) {
        MethodCollector.i(9223);
        this.session = session2;
        this.nativeHandle = nativeCreateCameraConfigFilter(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.o(9223);
    }

    public CameraConfigFilter setFacingDirection(CameraConfig.FacingDirection facingDirection) {
        MethodCollector.i(9901);
        nativeSetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle, facingDirection.nativeCode);
        MethodCollector.o(9901);
        return this;
    }

    public CameraConfigFilter setDepthSensorUsage(EnumSet<CameraConfig.DepthSensorUsage> enumSet) {
        MethodCollector.i(9584);
        Iterator it = enumSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 |= ((CameraConfig.DepthSensorUsage) it.next()).nativeCode;
        }
        nativeSetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle, i2);
        MethodCollector.o(9584);
        return this;
    }

    public CameraConfigFilter setStereoCameraUsage(EnumSet<CameraConfig.StereoCameraUsage> enumSet) {
        MethodCollector.i(9748);
        Iterator it = enumSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 |= ((CameraConfig.StereoCameraUsage) it.next()).nativeCode;
        }
        nativeSetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle, i2);
        MethodCollector.o(9748);
        return this;
    }

    public CameraConfigFilter setTargetFps(EnumSet<CameraConfig.TargetFps> enumSet) {
        MethodCollector.i(9428);
        Iterator it = enumSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 |= ((CameraConfig.TargetFps) it.next()).nativeCode;
        }
        nativeSetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle, i2);
        MethodCollector.o(9428);
        return this;
    }
}
