package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.FatalException;
import java.nio.FloatBuffer;
import java.util.Collection;

public class Plane extends TrackableBase {
    static {
        Covode.recordClassIndex(33029);
    }

    private native long nativeAcquireSubsumedBy(long j2, long j3);

    private native Pose nativeGetCenterPose(long j2, long j3);

    private native float nativeGetExtentX(long j2, long j3);

    private native float nativeGetExtentZ(long j2, long j3);

    private native float[] nativeGetPolygon(long j2, long j3);

    private native int nativeGetType(long j2, long j3);

    private native boolean nativeIsPoseInExtents(long j2, long j3, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j2, long j3, Pose pose);

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

    protected Plane() {
        super(0, null);
    }

    public Pose getCenterPose() {
        MethodCollector.i(13927);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13927);
        return nativeGetCenterPose;
    }

    public float getExtentX() {
        MethodCollector.i(13928);
        float nativeGetExtentX = nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13928);
        return nativeGetExtentX;
    }

    public float getExtentZ() {
        MethodCollector.i(13978);
        float nativeGetExtentZ = nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13978);
        return nativeGetExtentZ;
    }

    public FloatBuffer getPolygon() {
        MethodCollector.i(13979);
        FloatBuffer wrap = FloatBuffer.wrap(nativeGetPolygon(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13979);
        return wrap;
    }

    public Type getType() {
        MethodCollector.i(13826);
        Type forNumber = Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13826);
        return forNumber;
    }

    public enum Type {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33030);
        }

        static Type forNumber(int i2) {
            Type[] values = values();
            for (Type type : values) {
                if (type.nativeCode == i2) {
                    return type;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native Plane.Type, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private Type(int i2) {
            this.nativeCode = i2;
        }
    }

    public Plane getSubsumedBy() {
        MethodCollector.i(13880);
        long nativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireSubsumedBy == 0) {
            MethodCollector.o(13880);
            return null;
        }
        Plane plane = new Plane(nativeAcquireSubsumedBy, this.session);
        MethodCollector.o(13880);
        return plane;
    }

    public boolean isPoseInExtents(Pose pose) {
        MethodCollector.i(13980);
        boolean nativeIsPoseInExtents = nativeIsPoseInExtents(this.session.nativeWrapperHandle, this.nativeHandle, pose);
        MethodCollector.o(13980);
        return nativeIsPoseInExtents;
    }

    public boolean isPoseInPolygon(Pose pose) {
        MethodCollector.i(13981);
        boolean nativeIsPoseInPolygon = nativeIsPoseInPolygon(this.session.nativeWrapperHandle, this.nativeHandle, pose);
        MethodCollector.o(13981);
        return nativeIsPoseInPolygon;
    }

    Plane(long j2, Session session) {
        super(j2, session);
    }
}
