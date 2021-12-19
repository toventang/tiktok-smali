package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera1Enumerator implements CameraEnumerator {
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;
    private final boolean isDesktopMode;

    static {
        Covode.recordClassIndex(106506);
    }

    private static Camera org_webrtc_Camera1Enumerator_android_hardware_Camera_open(int i2) {
        Pair<Boolean, Object> a2 = a.a(Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open(i2);
        a.a(open, Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "org_webrtc_Camera1Enumerator_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    private static void org_webrtc_Camera1Enumerator_android_hardware_Camera_release(Camera camera) {
        if (!((Boolean) a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            a.a(null, camera, new Object[0], 100106, "org_webrtc_Camera1Enumerator_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            a.a(null, camera, new Object[0], 100101, "org_webrtc_Camera1Enumerator_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    public Camera1Enumerator() {
        this(true, false);
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            String deviceName = getDeviceName(i2);
            if (deviceName != null) {
                arrayList.add(deviceName);
                RXLogging.w("Camera1Enumerator", "Index: " + i2 + ". " + deviceName);
            } else {
                RXLogging.e("Camera1Enumerator", "Index: " + i2 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    private static Camera.CameraInfo getCameraInfo(int i2) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i2, cameraInfo);
            return cameraInfo;
        } catch (Exception e2) {
            RXLogging.e("Camera1Enumerator", "getCameraInfo failed on index ".concat(String.valueOf(i2)), e2);
            return null;
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 0) {
            return false;
        }
        return true;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 1) {
            return false;
        }
        return true;
    }

    static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    static int getCameraIndex(String str) {
        RXLogging.w("Camera1Enumerator", "getCameraIndex: ".concat(String.valueOf(str)));
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            if (str.equals(getDeviceName(i2))) {
                return i2;
            }
        }
        throw new IllegalArgumentException("No such camera: ".concat(String.valueOf(str)));
    }

    static String getDeviceName(int i2) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i2);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        return "Camera " + i2 + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
    }

    static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i2) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            MethodCollector.i(12235);
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
                    cachedSupportedFormats.add(enumerateFormats(i3));
                }
            }
            list = cachedSupportedFormats.get(i2);
            MethodCollector.o(12235);
        }
        return list;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i2) {
        int i3;
        RXLogging.w("Camera1Enumerator", "Get supported formats for camera index " + i2 + ".");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            RXLogging.w("Camera1Enumerator", "Opening camera with index ".concat(String.valueOf(i2)));
            camera = org_webrtc_Camera1Enumerator_android_hardware_Camera_open(i2);
            Camera.Parameters parameters = camera.getParameters();
            org_webrtc_Camera1Enumerator_android_hardware_Camera_release(camera);
            ArrayList arrayList = new ArrayList();
            if (parameters != null) {
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i4 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i4 = iArr[0];
                        i3 = iArr[1];
                    } else {
                        i3 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i4, i3));
                    }
                } catch (Exception e2) {
                    RXLogging.e("Camera1Enumerator", "getSupportedFormats() failed on camera index ".concat(String.valueOf(i2)), e2);
                }
            }
            RXLogging.w("Camera1Enumerator", "Get supported formats for camera index " + i2 + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
            return arrayList;
        } catch (RuntimeException e3) {
            RXLogging.e("Camera1Enumerator", "Open camera failed on camera index ".concat(String.valueOf(i2)), e3);
            ArrayList arrayList2 = new ArrayList();
            if (camera != null) {
                org_webrtc_Camera1Enumerator_android_hardware_Camera_release(camera);
            }
            return arrayList2;
        } catch (Throwable th) {
            if (camera != null) {
                org_webrtc_Camera1Enumerator_android_hardware_Camera_release(camera);
            }
            throw th;
        }
    }

    public Camera1Enumerator(boolean z, boolean z2) {
        this.captureToTexture = z;
        this.isDesktopMode = z2;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture, this.isDesktopMode);
    }
}
