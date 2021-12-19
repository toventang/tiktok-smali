package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Collection;

public class AugmentedFace extends TrackableBase {
    private FloatBuffer normalsBuffer;
    private FloatBuffer textureCoordinatesBuffer;
    private ShortBuffer triangleIndicesBuffer;
    private FloatBuffer verticesBuffer;

    static {
        Covode.recordClassIndex(32991);
    }

    private native Pose nativeGetCenterPose(long j2, long j3);

    private native ByteBuffer nativeGetMeshNormalsByteBuffer(long j2, long j3);

    private native ByteBuffer nativeGetMeshTextureCoordinatesByteBuffer(long j2, long j3);

    private native ByteBuffer nativeGetMeshTriangleIndicesByteBuffer(long j2, long j3);

    private native ByteBuffer nativeGetMeshVerticesByteBuffer(long j2, long j3);

    private native Pose nativeGetRegionPose(long j2, long j3, int i2);

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

    public FloatBuffer getMeshNormals() {
        return this.normalsBuffer;
    }

    public FloatBuffer getMeshTextureCoordinates() {
        return this.textureCoordinatesBuffer;
    }

    public ShortBuffer getMeshTriangleIndices() {
        return this.triangleIndicesBuffer;
    }

    public FloatBuffer getMeshVertices() {
        return this.verticesBuffer;
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    protected AugmentedFace() {
        super(0, null);
    }

    public Pose getCenterPose() {
        MethodCollector.i(9227);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(9227);
        return nativeGetCenterPose;
    }

    public enum RegionType {
        NOSE_TIP(0),
        FOREHEAD_LEFT(1),
        FOREHEAD_RIGHT(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32992);
        }

        private RegionType(int i2) {
            this.nativeCode = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void populateMeshData() {
        MethodCollector.i(9220);
        this.verticesBuffer = Session.directByteBufferOrDefault(nativeGetMeshVerticesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.normalsBuffer = Session.directByteBufferOrDefault(nativeGetMeshNormalsByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.textureCoordinatesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTextureCoordinatesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.triangleIndicesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTriangleIndicesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asShortBuffer();
        MethodCollector.o(9220);
    }

    public Pose getRegionPose(RegionType regionType) {
        MethodCollector.i(9225);
        Pose nativeGetRegionPose = nativeGetRegionPose(this.session.nativeWrapperHandle, this.nativeHandle, regionType.nativeCode);
        MethodCollector.o(9225);
        return nativeGetRegionPose;
    }

    AugmentedFace(long j2, Session session) {
        super(j2, session);
        populateMeshData();
    }
}
