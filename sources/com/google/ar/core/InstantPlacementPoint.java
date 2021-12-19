package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class InstantPlacementPoint extends TrackableBase {
    static {
        Covode.recordClassIndex(33023);
    }

    private native Pose nativeGetPose(long j2, long j3);

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

    public Pose getPose() {
        MethodCollector.i(13118);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13118);
        return nativeGetPose;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.i(13031);
        TrackingMethod fromNumber = TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13031);
        return fromNumber;
    }

    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33024);
        }

        static TrackingMethod fromNumber(int i2) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i2) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i2) {
            this.nativeCode = i2;
        }
    }

    InstantPlacementPoint(long j2, Session session) {
        super(j2, session);
    }
}
