package com.ss.android.ttve.utils;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CameraInstance {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static CameraInstance mThisInstance;
    private Comparator<Camera.Size> comparatorBigger = new Comparator<Camera.Size>() {
        /* class com.ss.android.ttve.utils.CameraInstance.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37773);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            int i2 = size4.width - size3.width;
            if (i2 == 0) {
                return size4.height - size3.height;
            }
            return i2;
        }
    };
    private Comparator<Camera.Size> comparatorSmaller = new Comparator<Camera.Size>() {
        /* class com.ss.android.ttve.utils.CameraInstance.AnonymousClass2 */

        static {
            Covode.recordClassIndex(37774);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            int i2 = size3.width - size4.width;
            if (i2 == 0) {
                return size3.height - size4.height;
            }
            return i2;
        }
    };
    private Camera mCameraDevice;
    private int mDefaultCameraID = -1;
    private int mFacing;
    private boolean mIsPreviewing;
    private Camera.Parameters mParams;
    private int mPictureHeight = 720;
    private int mPictureWidth = 1280;
    private int mPreferPreviewHeight = 720;
    private int mPreferPreviewWidth = 1280;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mRotation;

    public interface a {
        static {
            Covode.recordClassIndex(37776);
        }
    }

    static {
        Covode.recordClassIndex(37772);
    }

    private static int clamp(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private static Camera com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open() {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(Camera.class, new Object[0], 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open();
        com.bytedance.helios.sdk.a.a(open, Camera.class, new Object[0], 100100, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open()Landroid/hardware/Camera;");
        return open;
    }

    private static Camera com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open(int i2) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open(i2);
        com.bytedance.helios.sdk.a.a(open, Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    private static void com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(Camera camera) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100106, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100101, "com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    public Camera getCameraDevice() {
        return this.mCameraDevice;
    }

    public int getCameraFacing() {
        return this.mFacing;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public boolean isPreviewing() {
        return this.mIsPreviewing;
    }

    public int pictureHeight() {
        return this.mPictureHeight;
    }

    public int pictureWidth() {
        return this.mPictureWidth;
    }

    public int previewHeight() {
        return this.mPreviewHeight;
    }

    public int previewWidth() {
        return this.mPreviewWidth;
    }

    public boolean isCameraOpened() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public boolean isUsingFrontCamera() {
        if (this.mFacing == 1) {
            return true;
        }
        return false;
    }

    public static synchronized CameraInstance getInstance() {
        CameraInstance cameraInstance;
        synchronized (CameraInstance.class) {
            MethodCollector.i(2421);
            if (mThisInstance == null) {
                mThisInstance = new CameraInstance();
            }
            cameraInstance = mThisInstance;
            MethodCollector.o(2421);
        }
        return cameraInstance;
    }

    public synchronized Camera.Parameters getParams() {
        MethodCollector.i(3194);
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            MethodCollector.o(3194);
            return parameters;
        }
        MethodCollector.o(3194);
        return null;
    }

    public synchronized void stopCamera() {
        MethodCollector.i(3162);
        an.a("CameraInstance", "stopCamera...");
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            try {
                this.mCameraDevice.setPreviewTexture(null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(this.mCameraDevice);
            this.mCameraDevice = null;
        }
        MethodCollector.o(3162);
    }

    public synchronized void stopPreview() {
        Camera camera;
        MethodCollector.i(3189);
        an.b("CameraInstance", "Camera stopPreview...");
        if (this.mIsPreviewing && (camera = this.mCameraDevice) != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            an.a("CameraInstance", "Camera stopped!");
        }
        MethodCollector.o(3189);
    }

    public boolean tryOpenCamera(a aVar) {
        return tryOpenCamera(aVar, 0);
    }

    private static int clamp(int i2) {
        return clamp(i2, -1000, 1000);
    }

    public synchronized void setParams(Camera.Parameters parameters) {
        MethodCollector.i(3212);
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mParams = parameters;
            camera.setParameters(parameters);
        }
        MethodCollector.o(3212);
    }

    private void setCameraDisplayOrientation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        this.mRotation = setOrientationDegrees(i2);
    }

    public synchronized void setFocusMode(String str) {
        MethodCollector.i(797);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            MethodCollector.o(797);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        if (parameters.getSupportedFocusModes().contains(str)) {
            this.mParams.setFocusMode(str);
        }
        MethodCollector.o(797);
    }

    public int setOrientationDegrees(int i2) {
        int i3;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mDefaultCameraID, cameraInfo);
        if (cameraInfo.facing == 1) {
            i3 = ((360 - ((cameraInfo.orientation + i2) % 360)) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
        } else {
            i3 = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        try {
            this.mCameraDevice.setDisplayOrientation(i3);
        } catch (Exception unused) {
        }
        return i3;
    }

    public synchronized void startPreview(SurfaceTexture surfaceTexture) {
        MethodCollector.i(3180);
        an.a("CameraInstance", "Camera startPreview...");
        if (this.mIsPreviewing) {
            an.c("CameraInstance", "Camera is previewing...");
            MethodCollector.o(3180);
            return;
        }
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
                this.mCameraDevice.startPreview();
                this.mIsPreviewing = true;
                MethodCollector.o(3180);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                an.d("CameraInstance", "startPreview: Error " + e2.getMessage());
                this.mIsPreviewing = false;
                try {
                    com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(this.mCameraDevice);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                this.mCameraDevice = null;
            }
        }
        MethodCollector.o(3180);
    }

    public void initCamera(int i2) {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            an.d("CameraInstance", "initCamera: Camera is not opened!");
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        Iterator<Integer> it = parameters.getSupportedPictureFormats().iterator();
        while (it.hasNext()) {
            an.a("CameraInstance", com.a.a("Picture Format: %x", new Object[]{Integer.valueOf(it.next().intValue())}));
        }
        this.mParams.setPictureFormat(256);
        List<Camera.Size> supportedPictureSizes = this.mParams.getSupportedPictureSizes();
        Collections.sort(supportedPictureSizes, this.comparatorBigger);
        Camera.Size size = null;
        Camera.Size size2 = null;
        for (Camera.Size size3 : supportedPictureSizes) {
            if (size2 == null || (size3.width >= this.mPictureWidth && size3.height >= this.mPictureHeight)) {
                size2 = size3;
            }
        }
        List<Camera.Size> supportedPreviewSizes = this.mParams.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, this.comparatorBigger);
        for (Camera.Size size4 : supportedPreviewSizes) {
            an.b("CameraInstance", com.a.a("Supported preview size: %d x %d", new Object[]{Integer.valueOf(size4.width), Integer.valueOf(size4.height)}));
            if (size == null || (size4.width >= this.mPreferPreviewWidth && size4.height >= this.mPreferPreviewHeight)) {
                size = size4;
            }
        }
        List<Integer> supportedPreviewFrameRates = this.mParams.getSupportedPreviewFrameRates();
        this.mParams.setPreviewSize(size.width, size.height);
        this.mParams.setPictureSize(size2.width, size2.height);
        if (this.mParams.getSupportedFocusModes().contains("continuous-video")) {
            this.mParams.setFocusMode("continuous-video");
        }
        int i3 = 30;
        int i4 = (i2 * 2) / 3;
        int i5 = (i2 * 4) / 3;
        int i6 = 0;
        for (Integer num : supportedPreviewFrameRates) {
            an.e("CameraInstance", "Supported frame rate: ".concat(String.valueOf(num)));
            if (i6 < num.intValue()) {
                i6 = num.intValue();
            }
            if (i3 > num.intValue()) {
                i3 = num.intValue();
            }
        }
        int max = Math.max(i3, i4);
        int min = Math.min(i5, i6);
        an.a("CameraInstance", "FpsRange = [" + max + ", " + min + "]");
        this.mParams.setPreviewFpsRange(max * 1000, min * 1000);
        int[] iArr = new int[2];
        this.mParams.getPreviewFpsRange(iArr);
        an.a("CameraInstance", "FpsRange = [" + (iArr[0] / 1000) + ", " + (iArr[1] / 1000) + "]");
        try {
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Camera.Parameters parameters2 = this.mCameraDevice.getParameters();
        this.mParams = parameters2;
        Camera.Size pictureSize = parameters2.getPictureSize();
        Camera.Size previewSize = this.mParams.getPreviewSize();
        this.mPreviewWidth = previewSize.width;
        this.mPreviewHeight = previewSize.height;
        this.mPictureWidth = pictureSize.width;
        this.mPictureHeight = pictureSize.height;
        an.a("CameraInstance", com.a.a("Camera Picture Size: %d x %d", new Object[]{Integer.valueOf(pictureSize.width), Integer.valueOf(pictureSize.height)}));
        an.a("CameraInstance", com.a.a("Camera Preview Size: %d x %d", new Object[]{Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height)}));
    }

    public void focusAtPoint(float f2, float f3) {
        focusAtPoint(f2, f3, 0.08f);
    }

    public void setPreferPreviewSize(int i2, int i3) {
        this.mPreferPreviewHeight = i2;
        this.mPreferPreviewWidth = i3;
    }

    public synchronized boolean tryOpenCamera(a aVar, int i2) {
        MethodCollector.i(3139);
        an.a("CameraInstance", "try open camera...");
        try {
            int i3 = Build.VERSION.SDK_INT;
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i4 = 0; i4 < numberOfCameras; i4++) {
                Camera.getCameraInfo(i4, cameraInfo);
                if (cameraInfo.facing == i2) {
                    this.mDefaultCameraID = i4;
                    this.mFacing = i2;
                }
            }
            stopPreview();
            Camera camera = this.mCameraDevice;
            if (camera != null) {
                com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(camera);
            }
            int i5 = this.mDefaultCameraID;
            if (i5 >= 0) {
                this.mCameraDevice = com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open(i5);
            } else {
                this.mCameraDevice = com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_open();
                this.mFacing = 0;
            }
            this.mRotation = setOrientationDegrees(0);
            an.b("CameraInstance", "Camera rotation = " + this.mRotation);
            if (this.mCameraDevice != null) {
                an.a("CameraInstance", "Camera opened!");
                try {
                    initCamera(30);
                    MethodCollector.o(3139);
                    return true;
                } catch (Exception unused) {
                    com_ss_android_ttve_utils_CameraInstance_android_hardware_Camera_release(this.mCameraDevice);
                    this.mCameraDevice = null;
                    MethodCollector.o(3139);
                    return false;
                }
            } else {
                MethodCollector.o(3139);
                return false;
            }
        } catch (Exception e2) {
            an.d("CameraInstance", "Open Camera Failed!");
            e2.printStackTrace();
            this.mCameraDevice = null;
            MethodCollector.o(3139);
            return false;
        }
    }

    private void rotateRectForOrientation(int i2, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i2));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public synchronized void focusAtPoint(float f2, float f3, float f4) {
        MethodCollector.i(1156);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            an.d("CameraInstance", "Error: focus after release.");
            MethodCollector.o(1156);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Rect calculateTapArea = calculateTapArea(f2, f3, f4, this.mRotation);
            an.b("CameraInstance", com.a.a("FocusAreas: [%d, %d, %d, %d]", new Object[]{Integer.valueOf(calculateTapArea.left), Integer.valueOf(calculateTapArea.top), Integer.valueOf(calculateTapArea.right), Integer.valueOf(calculateTapArea.bottom)}));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(calculateTapArea, 1000));
            try {
                this.mCameraDevice.cancelAutoFocus();
                if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                    this.mParams.setFocusAreas(arrayList);
                }
                this.mParams.setMeteringAreas(arrayList);
                this.mParams.setFocusMode("continuous-video");
                this.mCameraDevice.setParameters(this.mParams);
                this.mCameraDevice.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.ss.android.ttve.utils.CameraInstance.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(37775);
                    }

                    public final void onAutoFocus(boolean z, Camera camera) {
                        if (z) {
                            an.a("CameraInstance", "Camera Focus Succeed!");
                            return;
                        }
                        an.a("CameraInstance", "Camera Focus Failed!");
                        try {
                            Camera.Parameters parameters = camera.getParameters();
                            parameters.setFocusMode("auto");
                            camera.setParameters(parameters);
                        } catch (Exception unused) {
                        }
                    }
                });
                MethodCollector.o(1156);
            } catch (Exception e2) {
                an.d("CameraInstance", "Error: focusAtPoint failed: " + e2.toString());
                MethodCollector.o(1156);
            }
        } else {
            an.a("CameraInstance", "The device does not support metering areas...");
            MethodCollector.o(1156);
        }
    }

    public synchronized void setPictureSize(int i2, int i3, boolean z) {
        MethodCollector.i(1037);
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            this.mPictureWidth = i2;
            this.mPictureHeight = i3;
            MethodCollector.o(1037);
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Camera.Size size = null;
        if (z) {
            Collections.sort(supportedPictureSizes, this.comparatorBigger);
            for (Camera.Size size2 : supportedPictureSizes) {
                if (size == null || (size2.width >= i2 && size2.height >= i3)) {
                    size = size2;
                }
            }
        } else {
            Collections.sort(supportedPictureSizes, this.comparatorSmaller);
            for (Camera.Size size3 : supportedPictureSizes) {
                if (size == null || (size3.width <= i2 && size3.height <= i3)) {
                    size = size3;
                }
            }
        }
        if (size != null) {
            this.mPictureWidth = size.width;
            this.mPictureHeight = size.height;
        }
        try {
            this.mParams.setPictureSize(this.mPictureWidth, this.mPictureHeight);
            this.mCameraDevice.setParameters(this.mParams);
            MethodCollector.o(1037);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(1037);
        }
    }

    public Rect calculateTapArea(float f2, float f3, float f4, int i2) {
        int intValue = Float.valueOf(f4 * 1000.0f).intValue();
        int i3 = intValue / 2;
        int clamp = clamp((((int) (f2 * 2000.0f)) - 1000) - i3, -1000, 1000);
        int clamp2 = clamp((((int) (f3 * 2000.0f)) - 1000) - i3, -1000, 1000);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        rotateRectForOrientation(i2, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
