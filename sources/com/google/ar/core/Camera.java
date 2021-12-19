package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;

public class Camera {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32996);
    }

    protected Camera() {
    }

    private static native long nativeAcquireCamera(long j2, long j3);

    private native long nativeCreateCameraIntrinsics(long j2);

    private native Pose nativeDisplayOrientedPose(long j2, long j3);

    private static native int nativeGetEarthLocalizationState(long j2, long j3);

    private native void nativeGetImageIntrinsics(long j2, long j3, long j4);

    private native Pose nativeGetPose(long j2, long j3);

    private native void nativeGetProjectionMatrix(long j2, long j3, float[] fArr, int i2, float f2, float f3);

    private native void nativeGetTextureIntrinsics(long j2, long j3, long j4);

    private native int nativeGetTrackingFailureReason(long j2, long j3);

    private native int nativeGetTrackingState(long j2, long j3);

    private native void nativeGetViewMatrix(long j2, long j3, float[] fArr, int i2);

    private static native void nativeReleaseCamera(long j2, long j3);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(14273);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(14273);
    }

    public Pose getDisplayOrientedPose() {
        MethodCollector.i(14305);
        Pose nativeDisplayOrientedPose = nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14305);
        return nativeDisplayOrientedPose;
    }

    public EarthLocalizationState getEarthLocalizationState() {
        MethodCollector.i(14402);
        EarthLocalizationState forNumber = EarthLocalizationState.forNumber(nativeGetEarthLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14402);
        return forNumber;
    }

    public Pose getPose() {
        MethodCollector.i(14304);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14304);
        return nativeGetPose;
    }

    public TrackingFailureReason getTrackingFailureReason() {
        MethodCollector.i(14303);
        TrackingFailureReason forNumber = TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14303);
        return forNumber;
    }

    public TrackingState getTrackingState() {
        MethodCollector.i(14302);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14302);
        return forNumber;
    }

    public enum EarthLocalizationState {
        NOT_LOCALIZED(0),
        LOCALIZED(1),
        UNAVAILABLE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32997);
        }

        static EarthLocalizationState forNumber(int i2) {
            EarthLocalizationState[] values = values();
            for (EarthLocalizationState earthLocalizationState : values) {
                if (earthLocalizationState.nativeCode == i2) {
                    return earthLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Unexpected value for native ArEarthLocalizationState, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private EarthLocalizationState(int i2) {
            this.nativeCode = i2;
        }
    }

    public CameraIntrinsics getImageIntrinsics() {
        MethodCollector.i(14365);
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        MethodCollector.o(14365);
        return cameraIntrinsics;
    }

    public CameraIntrinsics getTextureIntrinsics() {
        MethodCollector.i(14383);
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        MethodCollector.o(14383);
        return cameraIntrinsics;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Camera) && ((Camera) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    Camera(Session session2, Frame frame) {
        MethodCollector.i(14271);
        this.session = session2;
        this.nativeHandle = nativeAcquireCamera(session2.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.o(14271);
    }

    public void getViewMatrix(float[] fArr, int i2) {
        MethodCollector.i(14306);
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2);
        MethodCollector.o(14306);
    }

    public void getProjectionMatrix(float[] fArr, int i2, float f2, float f3) {
        MethodCollector.i(14337);
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2, f2, f3);
        MethodCollector.o(14337);
    }
}
