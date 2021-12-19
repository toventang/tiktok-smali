package com.google.ar.core;

import android.media.Image;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Frame {
    static final ArrayList<Anchor> ANCHORS_EMPTY_LIST = new ArrayList<>();
    static final ArrayList<Plane> PLANES_EMPTY_LIST = new ArrayList<>();
    private LightEstimate lightEstimate;
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    protected Frame() {
    }

    private native long nativeAcquireCameraImage(long j2, long j3);

    private native long nativeAcquireDepthImage(long j2, long j3);

    private native long nativeAcquireDepthImagePrivate(long j2, long j3);

    private native long nativeAcquireImageMetadata(long j2, long j3);

    private native long nativeAcquireRawDepthConfidenceImage(long j2, long j3);

    private native long nativeAcquireRawDepthImage(long j2, long j3);

    private native long nativeAcquireSegmentation(long j2, long j3);

    private native long[] nativeAcquireUpdatedAnchors(long j2, long j3);

    private static native long nativeCreateFrame(long j2);

    private static native void nativeDestroyFrame(long j2, long j3);

    private native long nativeGetAndroidCameraTimestamp(long j2, long j3);

    private native Pose nativeGetAndroidSensorPose(long j2, long j3);

    private native int nativeGetBackgroundSegmentationTextureName(long j2, long j3);

    private native int nativeGetCameraTextureName(long j2, long j3);

    private native void nativeGetLightEstimate(long j2, long j3, long j4);

    private native long nativeGetTimestamp(long j2, long j3);

    private native boolean nativeHasDisplayGeometryChanged(long j2, long j3);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j2, long j3, int i2, Object obj, int i3, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j2, long j3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    /* access modifiers changed from: package-private */
    public native long nativeAcquirePointCloud(long j2, long j3);

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireUpdatedTrackables(long j2, long j3, int i2);

    /* access modifiers changed from: package-private */
    public native float nativeFrameGetDepthRegionConfidence(long j2, long j3, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTest(long j2, long j3, float f2, float f3);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestInstantPlacement(long j2, long j3, float f2, float f3, float f4);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestRay(long j2, long j3, float[] fArr, int i2, float[] fArr2, int i3);

    /* access modifiers changed from: package-private */
    public native long[] nativeInstantHitTest(long j2, long j3, float f2, float f3, float f4);

    public Camera getCamera() {
        return new Camera(this.session, this);
    }

    static {
        Covode.recordClassIndex(33018);
    }

    public Image acquireCameraImage() {
        MethodCollector.i(13355);
        ArImage arImage = new ArImage(this.session, nativeAcquireCameraImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13355);
        return arImage;
    }

    public Image acquireDepthImage() {
        MethodCollector.i(13435);
        ArImage arImage = new ArImage(this.session, nativeAcquireDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13435);
        return arImage;
    }

    public Image acquireDepthImagePrivate() {
        MethodCollector.i(13521);
        ArImage arImage = new ArImage(this.session, nativeAcquireDepthImagePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13521);
        return arImage;
    }

    public PointCloud acquirePointCloud() {
        MethodCollector.i(12024);
        PointCloud pointCloud = new PointCloud(this.session, nativeAcquirePointCloud(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(12024);
        return pointCloud;
    }

    public Image acquireRawDepthConfidenceImage() {
        MethodCollector.i(13662);
        ArImage arImage = new ArImage(this.session, nativeAcquireRawDepthConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13662);
        return arImage;
    }

    public Image acquireRawDepthImage() {
        MethodCollector.i(13586);
        ArImage arImage = new ArImage(this.session, nativeAcquireRawDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13586);
        return arImage;
    }

    public Segmentation acquireSegmentation() {
        MethodCollector.i(13585);
        Segmentation segmentation = new Segmentation(this.session, nativeAcquireSegmentation(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13585);
        return segmentation;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(10254);
        long j2 = this.nativeHandle;
        if (j2 != 0) {
            nativeDestroyFrame(this.nativeSymbolTableHandle, j2);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.o(10254);
    }

    public long getAndroidCameraTimestamp() {
        MethodCollector.i(11709);
        long nativeGetAndroidCameraTimestamp = nativeGetAndroidCameraTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(11709);
        return nativeGetAndroidCameraTimestamp;
    }

    public Pose getAndroidSensorPose() {
        MethodCollector.i(11710);
        Pose nativeGetAndroidSensorPose = nativeGetAndroidSensorPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(11710);
        return nativeGetAndroidSensorPose;
    }

    public int getBackgroundSegmentationTextureName() {
        MethodCollector.i(13781);
        int nativeGetBackgroundSegmentationTextureName = nativeGetBackgroundSegmentationTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13781);
        return nativeGetBackgroundSegmentationTextureName;
    }

    public int getCameraTextureName() {
        MethodCollector.i(13728);
        int nativeGetCameraTextureName = nativeGetCameraTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(13728);
        return nativeGetCameraTextureName;
    }

    public ImageMetadata getImageMetadata() {
        MethodCollector.i(12023);
        ImageMetadata imageMetadata = new ImageMetadata(nativeAcquireImageMetadata(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
        MethodCollector.o(12023);
        return imageMetadata;
    }

    public long getTimestamp() {
        MethodCollector.i(11708);
        long nativeGetTimestamp = nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(11708);
        return nativeGetTimestamp;
    }

    public Collection<Anchor> getUpdatedAnchors() {
        MethodCollector.i(13200);
        Session session2 = this.session;
        Collection<Anchor> convertNativeAnchorsToCollection = session2.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(session2.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.o(13200);
        return convertNativeAnchorsToCollection;
    }

    public boolean hasDisplayGeometryChanged() {
        MethodCollector.i(10570);
        boolean nativeHasDisplayGeometryChanged = nativeHasDisplayGeometryChanged(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.o(10570);
        return nativeHasDisplayGeometryChanged;
    }

    public LightEstimate getLightEstimate() {
        MethodCollector.i(11711);
        if (this.lightEstimate == null) {
            this.lightEstimate = new LightEstimate(this.session);
        }
        nativeGetLightEstimate(this.session.nativeWrapperHandle, this.nativeHandle, this.lightEstimate.nativeHandle);
        LightEstimate lightEstimate2 = this.lightEstimate;
        MethodCollector.o(11711);
        return lightEstimate2;
    }

    public List<HitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    Frame(Session session2) {
        this(session2, nativeCreateFrame(session2.nativeWrapperHandle));
        MethodCollector.i(10252);
        MethodCollector.o(10252);
    }

    private List<HitResult> convertNativeHitResultsToList(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j2 : jArr) {
            HitResult hitResult = new HitResult(j2, this.session);
            if (hitResult.getTrackable() != null) {
                arrayList.add(hitResult);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        MethodCollector.i(13275);
        h a2 = h.a(cls);
        if (a2 == h.UNKNOWN_TO_JAVA) {
            List emptyList = Collections.emptyList();
            MethodCollector.o(13275);
            return emptyList;
        }
        Collection<T> convertNativeTrackablesToCollection = this.session.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.session.nativeWrapperHandle, this.nativeHandle, a2.f53461i));
        MethodCollector.o(13275);
        return convertNativeTrackablesToCollection;
    }

    Frame(Session session2, long j2) {
        this.session = session2;
        this.nativeHandle = j2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public List<HitResult> hitTest(float f2, float f3) {
        MethodCollector.i(12180);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f2, f3));
        MethodCollector.o(12180);
        return convertNativeHitResultsToList;
    }

    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        MethodCollector.i(10727);
        if (!floatBuffer.isDirect() || !floatBuffer2.isDirect()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("transformDisplayUvCoords currently requires direct buffers.");
            MethodCollector.o(10727);
            throw illegalArgumentException;
        }
        nativeTransformDisplayUvCoords(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer, floatBuffer2);
        MethodCollector.o(10727);
    }

    public List<HitResult> hitTestInstantPlacement(float f2, float f3, float f4) {
        MethodCollector.i(12934);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTestInstantPlacement(this.session.nativeWrapperHandle, this.nativeHandle, f2, f3, f4));
        MethodCollector.o(12934);
        return convertNativeHitResultsToList;
    }

    public List<HitResult> hitTest(float f2, float f3, float f4) {
        MethodCollector.i(12458);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeInstantHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f2, f3, f4));
        MethodCollector.o(12458);
        return convertNativeHitResultsToList;
    }

    public float getDepthRegionConfidence(int i2, int i3, int i4, int i5) {
        MethodCollector.i(13727);
        float nativeFrameGetDepthRegionConfidence = nativeFrameGetDepthRegionConfidence(this.session.nativeWrapperHandle, this.nativeHandle, i2, i3, i4, i5);
        MethodCollector.o(13727);
        return nativeFrameGetDepthRegionConfidence;
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates2d coordinates2d2, FloatBuffer floatBuffer2) {
        MethodCollector.i(13724);
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates2d2.nativeCode, floatBuffer2);
        MethodCollector.o(13724);
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, float[] fArr, Coordinates2d coordinates2d2, float[] fArr2) {
        MethodCollector.i(13726);
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates2d2.nativeCode, fArr2);
        MethodCollector.o(13726);
    }

    public List<HitResult> hitTest(float[] fArr, int i2, float[] fArr2, int i3) {
        MethodCollector.i(12317);
        List<HitResult> convertNativeHitResultsToList = convertNativeHitResultsToList(nativeHitTestRay(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i2, fArr2, i3));
        MethodCollector.o(12317);
        return convertNativeHitResultsToList;
    }
}
