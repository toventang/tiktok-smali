package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class HitResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(33019);
    }

    protected HitResult() {
    }

    private native long nativeCreateAnchor(long j2, long j3);

    private static native void nativeDestroyHitResult(long j2, long j3);

    private native float nativeGetDistance(long j2, long j3);

    private native Pose nativeGetPose(long j2, long j3);

    /* access modifiers changed from: package-private */
    public native long nativeAcquireTrackable(long j2, long j3);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public Anchor createAnchor() {
        MethodCollector.i(14052);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
        MethodCollector.o(14052);
        return anchor;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(13885);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j2);
        }
        super.finalize();
        MethodCollector.o(13885);
    }

    public float getDistance() {
        MethodCollector.i(14049);
        float nativeGetDistance = nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(14049);
        return nativeGetDistance;
    }

    public Pose getHitPose() {
        MethodCollector.i(13937);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13937);
        return nativeGetPose;
    }

    public Trackable getTrackable() {
        MethodCollector.i(14051);
        Trackable createTrackable = this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(14051);
        return createTrackable;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HitResult) && ((HitResult) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    HitResult(long j2, Session session2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
