package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class SharedCamera {
    private boolean cameraSharedWithAr = false;
    private final Session session;
    private Handler sharedCameraHandler;
    public final p sharedCameraInfo = new p((byte) 0);

    static {
        Covode.recordClassIndex(33045);
    }

    static final /* synthetic */ void lambda$setDummyOnImageAvailableListener$0$SharedCamera(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j2, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j2, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j2, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j2, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j2, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j2, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j2, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j2, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j2, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j2, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j2, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j2, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j2, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j2, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.f53481c;
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        if (this.sharedCameraInfo.f53479a != null) {
            setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public void setDummyListenerToAvoidImageBufferStarvation() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private ImageReader getCpuImageReader() {
        MethodCollector.i(14292);
        ImageReader nativeSharedCameraGetImageReader = nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.f53479a);
        MethodCollector.o(14292);
        return nativeSharedCameraGetImageReader;
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        MethodCollector.i(14293);
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.f53479a);
        MethodCollector.o(14293);
        return nativeSharedCameraGetImageReaderMotionTracking;
    }

    public void close() {
        this.sharedCameraHandler.removeCallbacksAndMessages(null);
        this.sharedCameraHandler.getLooper().quit();
        this.sharedCameraHandler = null;
    }

    public Surface getGpuSurface() {
        MethodCollector.i(14295);
        Surface nativeSharedCameraGetSurface = nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.f53479a);
        MethodCollector.o(14295);
        return nativeSharedCameraGetSurface;
    }

    public SurfaceTexture getGpuSurfaceTexture() {
        MethodCollector.i(14294);
        SurfaceTexture nativeSharedCameraGetSurfaceTexture = nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.f53479a);
        MethodCollector.o(14294);
        return nativeSharedCameraGetSurfaceTexture;
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f53482d);
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(j.f53463a, this.sharedCameraHandler);
        }
    }

    public void onCaptureSessionActive(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.i(14253);
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.o(14253);
    }

    public void onCaptureSessionClosed(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.i(14255);
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.o(14255);
    }

    public void onCaptureSessionConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.i(14289);
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.o(14289);
    }

    public void onCaptureSessionConfigured(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.i(14290);
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.o(14290);
    }

    public void onCaptureSessionReady(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.i(14291);
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.o(14291);
    }

    public void onDeviceClosed(CameraDevice cameraDevice) {
        MethodCollector.i(14224);
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        MethodCollector.o(14224);
    }

    public void onDeviceDisconnected(CameraDevice cameraDevice) {
        MethodCollector.i(14252);
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.f53479a = null;
        MethodCollector.o(14252);
    }

    public void onDeviceOpened(CameraDevice cameraDevice) {
        MethodCollector.i(14223);
        this.sharedCameraInfo.f53479a = cameraDevice;
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
        MethodCollector.o(14223);
    }

    SharedCamera(Session session2) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session2;
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new m(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new o(this, handler, stateCallback);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        MethodCollector.i(14325);
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
        MethodCollector.o(14325);
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        MethodCollector.i(14085);
        this.sharedCameraInfo.f53480b.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
        MethodCollector.o(14085);
    }
}
