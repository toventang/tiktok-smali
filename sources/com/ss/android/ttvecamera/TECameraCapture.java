package com.ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.g.e;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.o;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TECameraCapture {
    protected Map<String, Bundle> mAllDevicesFeatures = new HashMap();
    protected a mCameraObserver = b.a();
    protected l mCameraSettings;
    protected c mPictureSizeCallback;

    public interface a {
        static {
            Covode.recordClassIndex(37793);
        }

        void onCaptureStarted(int i2, int i3);

        void onCaptureStopped(int i2);

        void onError(int i2, String str);

        void onInfo(int i2, int i3, String str);
    }

    public interface c {
        static {
            Covode.recordClassIndex(37795);
        }

        TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    static {
        Covode.recordClassIndex(37792);
    }

    private static int convertFacing(int i2) {
        return i2 == 0 ? 1 : 0;
    }

    private static boolean isCameraSupport(Context context, int i2) {
        return true;
    }

    public void changeCaptureFormat() {
    }

    /* access modifiers changed from: protected */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private static volatile b f61366a;

        static {
            Covode.recordClassIndex(37794);
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onCaptureStarted(int i2, int i3) {
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onCaptureStopped(int i2) {
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onError(int i2, String str) {
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onInfo(int i2, int i3, String str) {
        }

        protected b() {
        }

        public static b a() {
            b bVar;
            MethodCollector.i(2687);
            synchronized (b.class) {
                try {
                    if (f61366a == null) {
                        synchronized (b.class) {
                            try {
                                f61366a = new b();
                            } catch (Throwable th) {
                                MethodCollector.o(2687);
                                throw th;
                            }
                        }
                    }
                    bVar = f61366a;
                } finally {
                    MethodCollector.o(2687);
                }
            }
            return bVar;
        }
    }

    public int abortSession() {
        return k.INSTANCE.abortSession(this);
    }

    public int cancelFocus() {
        return k.INSTANCE.cancelFocus(this);
    }

    public int disConnect() {
        return disConnect((PrivacyCert) null);
    }

    public void downExposureCompensation() {
        k.INSTANCE.downExposureCompensation(this);
    }

    public int enableCaf() {
        return k.INSTANCE.enableCaf(this);
    }

    public int[] getCameraCaptureSize() {
        return k.INSTANCE.getCameraCaptureSize();
    }

    public l.d getCameraECInfo() {
        return k.INSTANCE.getCameraECInfo(this);
    }

    public int getCameraState() {
        return k.INSTANCE.getCameraState();
    }

    public int getExposureCompensation() {
        return k.INSTANCE.getExposureCompensation(this);
    }

    public int getFlashMode() {
        return k.INSTANCE.getFlashMode(this);
    }

    public int[] getPictureSize() {
        return k.INSTANCE.getPictureSize(this);
    }

    public int[] getPreviewFps() {
        return k.INSTANCE.getPreviewFps();
    }

    public boolean isAutoExposureLockSupported() {
        return k.INSTANCE.isAutoExposureLockSupported(this);
    }

    public boolean isAutoFocuseLockSupported() {
        return k.INSTANCE.isAutoFocusLockSupported(this);
    }

    public boolean isSupportWhileBalance() {
        return k.INSTANCE.isSupportWhileBalance(this);
    }

    public boolean isSupportedExposureCompensation() {
        return k.INSTANCE.isSupportedExposureCompensation(this);
    }

    public boolean isTorchSupported() {
        return k.INSTANCE.isTorchSupported(this);
    }

    public int removeCameraProvider() {
        return k.INSTANCE.removeCameraProvider(this);
    }

    public int start() {
        return k.INSTANCE.start(this);
    }

    public int startCameraFaceDetect() {
        return k.INSTANCE.startCameraFaceDetect(this);
    }

    public int startRecording() {
        return k.INSTANCE.startRecording();
    }

    public int stop() {
        return k.INSTANCE.stop(this);
    }

    public int stopCameraFaceDetect() {
        return k.INSTANCE.stopCameraFaceDetect(this);
    }

    public int stopRecording() {
        return k.INSTANCE.stopRecording();
    }

    public void upExposureCompensation() {
        k.INSTANCE.upExposureCompensation(this);
    }

    public static void registerMonitor(j.a aVar) {
        j.f61596a = aVar;
    }

    public int addCameraProvider(c.a aVar) {
        return k.INSTANCE.addCameraProvider(this, aVar);
    }

    public void changeAppLifeCycle(boolean z) {
        k.INSTANCE.appLifeCycleChanged(z);
    }

    public int connect(l lVar) {
        return connect(lVar, null);
    }

    public void enableMulticamZoom(boolean z) {
        k.INSTANCE.enableMulticamZoom(this, z);
    }

    public float[] getApertureRange(l.b bVar) {
        return k.INSTANCE.getApertureRange(this, bVar);
    }

    public float[] getFOV(l.e eVar) {
        return k.INSTANCE.getFOV(this, eVar);
    }

    public int getISO(l.g gVar) {
        return k.INSTANCE.getISO(this, gVar);
    }

    public int[] getISORange(l.h hVar) {
        return k.INSTANCE.getISORange(this, hVar);
    }

    public float getManualFocusAbility(l.i iVar) {
        return k.INSTANCE.getManualFocusAbility(this, iVar);
    }

    public long[] getShutterTimeRange(l.o oVar) {
        return k.INSTANCE.getShutterTimeRange(this, oVar);
    }

    public void notifyHostForegroundVisible(boolean z) {
        k.INSTANCE.notifyHostForegroundVisible(this, z);
    }

    public void process(l.j jVar) {
        k.INSTANCE.process(this, jVar);
    }

    public void queryFeatures(Bundle bundle) {
        queryFeatures(this.mCameraSettings.F, bundle);
    }

    public float queryShaderZoomAbility(l.n nVar) {
        return k.INSTANCE.queryShaderZoomStep(this, nVar);
    }

    public void setAperture(float f2) {
        k.INSTANCE.setAperture(this, f2);
    }

    public void setAutoExposureLock(boolean z) {
        k.INSTANCE.setAutoExposureLock(this, z);
    }

    public void setAutoFocusLock(boolean z) {
        k.INSTANCE.setAutoFocusLock(this, z);
    }

    public void setExposureCompensation(int i2) {
        k.INSTANCE.setExposureCompensation(this, i2);
    }

    public void setFeatureParameters(Bundle bundle) {
        k.INSTANCE.setFeatureParameters(this, bundle);
    }

    public void setISO(int i2) {
        k.INSTANCE.setISO(this, i2);
    }

    public void setManualFocusDistance(float f2) {
        k.INSTANCE.setManualFocusDistance(this, f2);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        k.INSTANCE.setPreviewFpsRange(tEFrameRateRange);
    }

    public void setSATZoomCallback(l.m mVar) {
        k.INSTANCE.setSATZoomCallback(mVar);
    }

    public void setSceneMode(int i2) {
        k.INSTANCE.setSceneMode(this, i2);
    }

    public void setShutterTime(long j2) {
        k.INSTANCE.setShutterTime(this, j2);
    }

    public int stopZoom(l.p pVar) {
        return k.INSTANCE.stopZoom(this, pVar);
    }

    public int switchCamera(int i2) {
        return switchCamera(i2, (PrivacyCert) null);
    }

    public int switchFlashMode(int i2) {
        return k.INSTANCE.switchFlashMode(this, i2);
    }

    public int toggleTorch(boolean z) {
        return k.INSTANCE.toggleTorch(this, z);
    }

    public static void registerException(h.a aVar) {
        WeakReference<h.a> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        h.f61553a = weakReference;
    }

    public int disConnect(PrivacyCert privacyCert) {
        return k.INSTANCE.disConnect(this, privacyCert);
    }

    public int getCameraState(boolean z) {
        return k.INSTANCE.getCameraState(z);
    }

    public boolean isARCoreSupported(Context context) {
        return e.a(context, 2).d();
    }

    public int takePicture(l.AbstractC1345l lVar) {
        return k.INSTANCE.takePicture(this, lVar);
    }

    public TECameraCapture(a aVar) {
        this.mCameraObserver = aVar;
    }

    public int disConnect(boolean z) {
        return disConnect(z, null);
    }

    public int focusAtPoint(n nVar) {
        nVar.f61847f = System.currentTimeMillis();
        return k.INSTANCE.focusAtPoint(this, nVar);
    }

    public int switchCamera(l lVar) {
        return switchCamera(lVar, (PrivacyCert) null);
    }

    public void updateAllCameraFeatures(Bundle bundle) {
        l lVar = this.mCameraSettings;
        if (lVar != null) {
            updateAllCameraFeatures(lVar.f61800c, bundle);
            if (this.mAllDevicesFeatures.containsKey(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e)) {
                Bundle bundle2 = this.mAllDevicesFeatures.get(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e);
                if (bundle2 != null) {
                    bundle2.putAll(bundle);
                    return;
                }
                return;
            }
            this.mAllDevicesFeatures.put(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e, bundle);
        }
    }

    public int captureBurst(l.c cVar, com.ss.android.ttvecamera.i.a aVar) {
        return k.INSTANCE.captureBurst(this, cVar, aVar);
    }

    public void changeRecorderState(int i2, g.b bVar) {
        k.INSTANCE.changeRecorderState(this, i2, bVar);
    }

    public TEFrameSizei getBestPreviewSize(float f2, TEFrameSizei tEFrameSizei) {
        return k.INSTANCE.getBestPreviewSize(this, f2, tEFrameSizei);
    }

    public int queryZoomAbility(l.p pVar, boolean z) {
        return k.INSTANCE.queryZoomAbility(this, pVar, z);
    }

    public void setPictureSize(int i2, int i3) {
        k.INSTANCE.setPictureSize(this, i2, i3);
    }

    public void setWhileBalance(boolean z, String str) {
        k.INSTANCE.setWhileBalance(this, z, str);
    }

    public int startZoom(float f2, l.p pVar) {
        return k.INSTANCE.startZoom(this, f2, pVar);
    }

    public int zoomV2(float f2, l.p pVar) {
        return k.INSTANCE.zoomV2(this, f2, pVar);
    }

    public void queryFeatures(String str, Bundle bundle) {
        k.INSTANCE.queryFeatures(str, bundle);
    }

    public int start(SurfaceTexture surfaceTexture, int i2) {
        o.d("TECameraCapture", "Do not use this interface!!");
        return start();
    }

    public int switchCamera(int i2, PrivacyCert privacyCert) {
        return k.INSTANCE.switchCamera(this, i2, privacyCert);
    }

    public int switchCameraMode(int i2, l lVar) {
        if (lVar != null) {
            this.mCameraSettings = lVar;
        }
        return k.INSTANCE.switchCameraMode(this, i2);
    }

    public int connect(l lVar, PrivacyCert privacyCert) {
        this.mCameraSettings = lVar;
        return k.INSTANCE.connect(this, this.mCameraObserver, this.mCameraSettings, this.mPictureSizeCallback, privacyCert);
    }

    public TECameraCapture(a aVar, c cVar) {
        this.mCameraObserver = aVar;
        this.mPictureSizeCallback = cVar;
    }

    public static void registerLogOutput(byte b2, o.b bVar) {
        if (bVar != null) {
            o.f61857c = bVar;
        } else {
            o.f61857c = new o.a();
        }
        o.f61855a = "VESDK" + "-";
        o.f61856b = b2;
    }

    public int disConnect(boolean z, PrivacyCert privacyCert) {
        return k.INSTANCE.disConnect(this, z, privacyCert);
    }

    public int switchCamera(l lVar, PrivacyCert privacyCert) {
        this.mCameraSettings = lVar;
        return k.INSTANCE.switchCamera(this, lVar, privacyCert);
    }

    public static Object com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(214);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(214);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private void updateAllCameraFeatures(int i2, Bundle bundle) {
        int i3;
        int i4;
        int i5;
        o.a("TECameraCapture", "updateAllCameraFeatures with camera type: ".concat(String.valueOf(i2)));
        boolean z = true;
        if (11 == i2) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("device_support_ai_night_video", 0);
            bundle2.putInt("device_support_wide_angle_mode", 0);
            bundle2.putInt("device_support_antishake_mode", 0);
            queryFeatures(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e, bundle2);
            int i6 = bundle2.getInt("device_support_ai_night_video");
            int i7 = bundle.getInt("device_support_ai_night_video");
            if (i6 <= 0 || i7 <= 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            bundle.putInt("device_support_ai_night_video", i3);
            int i8 = bundle2.getInt("device_support_wide_angle_mode");
            int i9 = bundle.getInt("device_support_wide_angle_mode");
            if (i8 <= 0 || i9 <= 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            bundle.putInt("device_support_wide_angle_mode", i4);
            int i10 = bundle2.getInt("device_support_antishake_mode");
            int i11 = bundle.getInt("device_support_antishake_mode");
            if (i10 <= 0 || i11 <= 0) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            bundle.putInt("device_support_antishake_mode", i5);
            o.a("TECameraCapture", "updateAllCameraFeatures, vendor camera unit type, feature bundle = ".concat(String.valueOf(bundle)));
        } else if (10 == i2) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("device_should_use_shader_zoom", false);
            queryFeatures(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e, bundle3);
            bundle.putBoolean("device_should_use_shader_zoom", bundle3.getBoolean("device_should_use_shader_zoom"));
            o.a("TECameraCapture", "updateAllCameraFeatures, vendor rdhw type, feature bundle = ".concat(String.valueOf(bundle)));
        } else if (2 == i2) {
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("device_support_multicamera_zoom", false);
            queryFeatures(this.mCameraSettings.F, bundle4);
            boolean z2 = bundle4.getBoolean("device_support_multicamera_zoom");
            boolean z3 = bundle.getBoolean("device_support_multicamera_zoom");
            if (!z2 || !z3) {
                z = false;
            }
            bundle.putBoolean("device_support_multicamera_zoom", z);
            o.a("TECameraCapture", "updateAllCameraFeatures, camera2 type, feature bundle = ".concat(String.valueOf(bundle)));
        }
    }

    public synchronized void getCameraAllFeatures(Context context, Bundle bundle) {
        MethodCollector.i(166);
        if (this.mCameraSettings != null) {
            if (this.mAllDevicesFeatures.containsKey(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e)) {
                Bundle bundle2 = this.mAllDevicesFeatures.get(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e);
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                MethodCollector.o(166);
                return;
            }
            getCameraAllFeatures(context, this.mCameraSettings.f61800c, bundle);
            this.mAllDevicesFeatures.put(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e, bundle);
        }
        MethodCollector.o(166);
    }

    public int takePicture(int i2, int i3, l.AbstractC1345l lVar) {
        return k.INSTANCE.takePicture(this, i2, i3, lVar);
    }

    public static void queryDeviceFeatures(Context context, int i2, Bundle bundle) {
        if (isCameraSupport(context, i2) && fillDeviceFeatures(context, i2, bundle)) {
            fillCameraFeatures(context, i2, bundle);
        }
    }

    private static void fillCameraFeatures(Context context, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21 && i2 == 4) {
            try {
                CameraManager cameraManager = (CameraManager) com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "camera");
                String[] cameraIdList = cameraManager.getCameraIdList();
                HashMap hashMap = null;
                for (String str : cameraIdList) {
                    Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                        for (String str2 : bundle.keySet()) {
                            if ("support_anti_shake".equals(str2)) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                Integer valueOf = Integer.valueOf(convertFacing(num.intValue()));
                                Integer.parseInt(str);
                                hashMap.put(valueOf, false);
                                bundle.putSerializable("support_anti_shake", hashMap);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void fillDeviceAntiShakeFeature(Context context, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21 && i2 == 4) {
            try {
                CameraManager cameraManager = (CameraManager) com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "camera");
                String[] cameraIdList = cameraManager.getCameraIdList();
                HashMap hashMap = null;
                for (String str : cameraIdList) {
                    Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                        for (String str2 : bundle.keySet()) {
                            if ("device_support_anti_shake".equals(str2)) {
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                Integer valueOf = Integer.valueOf(convertFacing(num.intValue()));
                                Integer.parseInt(str);
                                hashMap.put(valueOf, false);
                                bundle.putSerializable("device_support_anti_shake", hashMap);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean fillDeviceFeatures(Context context, int i2, Bundle bundle) {
        boolean z = false;
        for (String str : bundle.keySet()) {
            if ("device_support_camera".equals(str)) {
                bundle.putBoolean("device_support_camera", isCameraSupport(context, i2));
            } else if (!"device_support_wide_angle".equals(str) || i2 == 1) {
                z = true;
            } else {
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                bundle.putBoolean("device_support_wide_angle", e.a(context, i2).a());
                o.b("TECameraCapture", "Get wide angle info cost " + (System.currentTimeMillis() - valueOf.longValue()) + "ms");
            }
        }
        return z;
    }

    private void getCameraAllFeatures(Context context, int i2, Bundle bundle) {
        o.a("TECameraCapture", "getCameraAllFeatures with camera type: ".concat(String.valueOf(i2)));
        if (i2 == 1) {
            bundle.putBoolean("device_support_wide_angle", false);
        } else if (11 != i2) {
            e.a(context, i2);
            String c2 = e.c();
            o.a("TECameraCapture", "getCameraAllFeatures, filledWideCameraId: ".concat(String.valueOf(c2)));
            if ("-1".equals(c2)) {
                boolean a2 = e.a(context, i2).a();
                bundle.putBoolean("device_support_wide_angle", a2);
                if (a2) {
                    bundle.putString("device_wide_angle_camera_id", e.a(context, i2).b());
                }
            } else if (c2.equals("0")) {
                bundle.putBoolean("device_support_wide_angle", false);
            } else {
                bundle.putBoolean("device_support_wide_angle", true);
                bundle.putString("device_wide_angle_camera_id", c2);
            }
            if (10 == i2) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("device_should_use_shader_zoom", false);
                queryFeatures(this.mCameraSettings.f61800c + "_" + this.mCameraSettings.f61802e, bundle2);
                bundle.putBoolean("device_should_use_shader_zoom", bundle2.getBoolean("device_should_use_shader_zoom"));
                o.a("TECameraCapture", "getCameraAllFeatures, vendor rdhw type, feature bundle = ".concat(String.valueOf(bundle)));
            }
        }
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("device_support_anti_shake", null);
        fillDeviceAntiShakeFeature(context, i2, bundle3);
        if (bundle3.size() > 0) {
            bundle.putAll(bundle3);
        }
        o.a("TECameraCapture", "getCameraAllFeatures, features = ".concat(String.valueOf(bundle)));
    }

    public int focusAtPoint(int i2, int i3, float f2, int i4, int i5) {
        return focusAtPoint(new n(i2, i3, i4, i5, f2));
    }
}
