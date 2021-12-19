package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class AugmentedImage extends TrackableBase {
    static {
        Covode.recordClassIndex(32993);
    }

    private native Pose nativeGetCenterPose(long j2, long j3);

    private native float nativeGetExtentX(long j2, long j3);

    private native float nativeGetExtentZ(long j2, long j3);

    private native int nativeGetIndex(long j2, long j3);

    private native String nativeGetName(long j2, long j3);

    private native int nativeGetTrackingMethod(long j2, long j3);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Pose getCenterPose() {
        MethodCollector.i(9854);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(9854);
        return nativeGetCenterPose;
    }

    public float getExtentX() {
        MethodCollector.i(9855);
        float nativeGetExtentX = nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(9855);
        return nativeGetExtentX;
    }

    public float getExtentZ() {
        MethodCollector.i(9856);
        float nativeGetExtentZ = nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(9856);
        return nativeGetExtentZ;
    }

    public int getIndex() {
        MethodCollector.i(9857);
        int nativeGetIndex = nativeGetIndex(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(9857);
        return nativeGetIndex;
    }

    public String getName() {
        MethodCollector.i(10027);
        String nativeGetName = nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(10027);
        return nativeGetName;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.i(10185);
        TrackingMethod forNumber = TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(10185);
        return forNumber;
    }

    public enum TrackingMethod {
        NOT_TRACKING(0),
        FULL_TRACKING(1),
        LAST_KNOWN_POSE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32994);
        }

        static TrackingMethod forNumber(int i2) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i2) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Unexpected value for native TrackingMethod, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i2) {
            this.nativeCode = i2;
        }
    }

    AugmentedImage(long j2, Session session) {
        super(j2, session);
    }
}
