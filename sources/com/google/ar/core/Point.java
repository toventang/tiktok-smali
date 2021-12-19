package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class Point extends TrackableBase {
    static {
        Covode.recordClassIndex(33032);
    }

    private native int nativeGetOrientationMode(long j2, long j3);

    private native Pose nativeGetPose(long j2, long j3);

    private native Pose nativeGetPoseFromDistanceGuess(long j2, long j3);

    private native Pose nativeGetPoseFromRealDepth(long j2, long j3);

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

    protected Point() {
        super(0, null);
    }

    public OrientationMode getOrientationMode() {
        MethodCollector.i(13719);
        OrientationMode fromNumber = OrientationMode.fromNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13719);
        return fromNumber;
    }

    public Pose getPose() {
        MethodCollector.i(13580);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13580);
        return nativeGetPose;
    }

    public Pose getPoseFromDistanceGuess() {
        MethodCollector.i(13654);
        Pose nativeGetPoseFromDistanceGuess = nativeGetPoseFromDistanceGuess(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13654);
        return nativeGetPoseFromDistanceGuess;
    }

    public Pose getPoseFromRealDepth() {
        MethodCollector.i(13655);
        Pose nativeGetPoseFromRealDepth = nativeGetPoseFromRealDepth(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13655);
        return nativeGetPoseFromRealDepth;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.i(13775);
        TrackingMethod fromNumber = TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13775);
        return fromNumber;
    }

    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        static {
            Covode.recordClassIndex(33033);
        }

        static OrientationMode fromNumber(int i2) {
            OrientationMode[] values = values();
            for (OrientationMode orientationMode : values) {
                if (orientationMode.nativeCode == i2) {
                    return orientationMode;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native Point Orientation Mode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private OrientationMode(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum TrackingMethod {
        DISTANCE_GUESS(1),
        REAL_DEPTH(2),
        DISTANCE_GUESS_AND_REAL_DEPTH(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33034);
        }

        static TrackingMethod fromNumber(int i2) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i2) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("Unexpected value for native Point TrackingMethod Mode, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i2) {
            this.nativeCode = i2;
        }
    }

    Point(long j2, Session session) {
        super(j2, session);
    }
}
