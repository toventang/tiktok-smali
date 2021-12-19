package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.c.a;
import com.ss.android.ttvecamera.d.c;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.l;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b extends g {
    private boolean F = false;

    /* renamed from: a  reason: collision with root package name */
    Camera f61398a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.Parameters f61399b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61400c = false;

    /* renamed from: d  reason: collision with root package name */
    private c f61401d;

    /* renamed from: e  reason: collision with root package name */
    private String f61402e = "";

    /* renamed from: f  reason: collision with root package name */
    private int f61403f;

    /* renamed from: g  reason: collision with root package name */
    private List<TEFrameSizei> f61404g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private List<TEFrameSizei> f61405h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<TEFrameSizei> f61406i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private List<Integer> f61407j = null;

    /* renamed from: k  reason: collision with root package name */
    private float f61408k = 100.0f;

    /* renamed from: l  reason: collision with root package name */
    private AtomicBoolean f61409l = new AtomicBoolean(false);

    /* renamed from: m  reason: collision with root package name */
    private long f61410m = 0;

    static {
        Covode.recordClassIndex(37813);
    }

    @Override // com.ss.android.ttvecamera.g
    public final int e() {
        return 1;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(PrivacyCert privacyCert) {
        super.a(privacyCert);
        o.a("TECamera1", "force close camera: " + this.f61398a);
        try {
            Camera camera = this.f61398a;
            if (camera != null) {
                d.a(privacyCert, camera);
                this.f61398a = null;
            }
        } catch (Exception unused) {
            o.d("TECamera1", "force close camera failed");
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(final l.AbstractC1345l lVar) {
        if (this.f61398a == null) {
            o.d("TECamera1", "takePicture: camera is null.");
            this.q.a(-439, "takePicture: camera is null.");
            return;
        }
        try {
            this.p = false;
            o.a("TECamera1", "takePicture size: " + this.o.q.toString());
            final long currentTimeMillis = System.currentTimeMillis();
            this.f61398a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.ss.android.ttvecamera.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(37816);
                }

                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    int i2;
                    o.a("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - currentTimeMillis));
                    if (b.this.f61398a != null) {
                        b.this.f61398a.stopPreview();
                    }
                    if (lVar != null) {
                        int pictureFormat = b.this.f61399b.getPictureFormat();
                        Camera.Size pictureSize = b.this.f61399b.getPictureSize();
                        int i3 = pictureSize.width;
                        int i4 = pictureSize.height;
                        o.a("TECamera1", "take picture format: " + pictureFormat + ", w: " + i3 + ", h: " + i4);
                        i.b bVar = i.b.PIXEL_FORMAT_JPEG;
                        if (b.this.v == 1) {
                            i2 = 270;
                        } else {
                            i2 = 90;
                        }
                        if (pictureFormat == 17) {
                            bVar = i.b.PIXEL_FORMAT_NV21;
                        }
                        new i(bArr, bVar, i3, i4, i2);
                    }
                }
            });
        } catch (Exception e2) {
            h.a(e2);
            if (lVar != null) {
                a(e2, -1000);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(final n nVar) {
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "focusAtPoint: camera is null.");
            nVar.f61854m.a(-439, this.o.f61802e, "focusAtPoint: camera is null.");
            this.q.a(-439, "focusAtPoint: camera is null.");
            return;
        }
        boolean z = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f61399b = parameters;
            String str = this.f61402e;
            if (parameters == null || c.f61478f.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0 || !parameters.getSupportedFocusModes().contains(str)) {
                o.d("TECamera1", "Error: not support focus.");
                this.q.a(-412, -412, "Error: not support focus.");
                if (!c.a(this.f61399b) || !nVar.f61849h) {
                    nVar.f61854m.a(-412, this.o.f61802e, "Error: not support focus.");
                    return;
                }
                if (nVar.f61853l != null) {
                    this.f61399b.setMeteringAreas(nVar.f61853l.a());
                } else {
                    this.f61399b.setMeteringAreas(this.f61401d.a(nVar.f61842a, nVar.f61843b, nVar.f61846e, nVar.f61844c, nVar.f61845d, this.o.f61803f));
                }
                this.f61398a.setParameters(this.f61399b);
                return;
            }
            if (nVar.f61849h && c.a(this.f61399b)) {
                if (nVar.f61853l != null) {
                    this.f61399b.setMeteringAreas(nVar.f61853l.a());
                } else {
                    this.f61399b.setMeteringAreas(this.f61401d.a(nVar.f61842a, nVar.f61843b, nVar.f61846e, nVar.f61844c, nVar.f61845d, this.o.f61803f));
                }
            }
            if (nVar.f61848g) {
                if (nVar.f61852k != null) {
                    this.f61399b.setFocusAreas(nVar.f61852k.a());
                } else {
                    Camera.Parameters parameters2 = this.f61399b;
                    c cVar = this.f61401d;
                    Rect a2 = cVar.a(nVar.f61842a, nVar.f61843b, nVar.f61846e, 90.0f, nVar.f61844c, nVar.f61845d, this.o.f61803f);
                    if (cVar.f61483e.size() > 0) {
                        cVar.f61483e.clear();
                    }
                    cVar.f61483e.add(new Camera.Area(a2, 1000));
                    parameters2.setFocusAreas(cVar.f61483e);
                }
                this.f61398a.cancelAutoFocus();
                this.f61399b.setFocusMode("auto");
                if (this.F && !nVar.f61851j) {
                    this.f61399b.setFlashMode("off");
                    z = true;
                }
                this.f61398a.setParameters(this.f61399b);
                this.f61398a.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.ss.android.ttvecamera.b.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(37817);
                    }

                    public final void onAutoFocus(boolean z, Camera camera) {
                        String str;
                        if (z) {
                            str = "Camera Focus Succeed!";
                            nVar.f61854m.a(nVar.a(), b.this.o.f61802e, str);
                        } else {
                            str = "Camera Focus Failed!";
                            nVar.f61854m.a(-1, b.this.o.f61802e, str);
                        }
                        o.a("TECamera1", str);
                        if (!nVar.f61850i || !z) {
                            try {
                                Camera.Parameters parameters = camera.getParameters();
                                parameters.setFocusMode("continuous-video");
                                camera.setParameters(parameters);
                                if (b.this.f61400c) {
                                    b.this.c();
                                }
                            } catch (Exception e2) {
                                String str2 = "Error: focusAtPoint failed: " + e2.toString();
                                o.d("TECamera1", str2);
                                b.this.q.a(-411, str2);
                            }
                        }
                    }
                });
                if (z) {
                    try {
                        this.f61399b.setFlashMode("on");
                        this.f61398a.setParameters(this.f61399b);
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.f61398a.setParameters(this.f61399b);
                o.a("TECamera1", "focus is not enable!");
            }
        } catch (Exception e2) {
            String str2 = "Error: focusAtPoint failed: " + e2.toString();
            o.d("TECamera1", str2);
            nVar.f61854m.a(-411, this.o.f61802e, str2);
            this.q.a(-411, str2);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(boolean z) {
        o.a("TECamera1", "setAutoExposureLock...");
        if (this.f61398a == null || this.f61399b == null || !this.p) {
            this.q.a(-439, "setAutoExposureLock failed. ： Camera is null.");
        } else if (!this.f61399b.isAutoExposureLockSupported()) {
            o.c("TECamera1", "Current camera doesn't support ae lock.");
            this.q.a(-426, -426, "Current camera doesn't support ae lock.");
        } else {
            try {
                this.f61399b.setAutoExposureLock(z);
                this.f61398a.setParameters(this.f61399b);
            } catch (Exception e2) {
                String str = "Error: setAutoExposureLock failed: " + e2.toString();
                o.d("TECamera1", str);
                this.q.a(-427, -427, str);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(String str) {
        if (this.f61398a == null || !this.p) {
            o.d("TECamera1", "setWhileBalance : Camera is null!");
            this.q.a(-439, "setWhileBalance : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = this.f61398a.getParameters();
            this.f61399b = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                String concat = "SupportWBList has no value: ".concat(String.valueOf(str));
                o.d("TECamera1", concat);
                this.q.a(-424, concat);
                return;
            }
            this.f61399b.setWhiteBalance(str);
            this.f61398a.setParameters(this.f61399b);
        } catch (Exception e2) {
            String str2 = "Set WhileBalance failed: " + e2.toString();
            o.d("TECamera1", str2);
            this.q.a(-424, str2);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.p pVar, boolean z) {
        if (pVar == null) {
            o.d("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "queryZoomAbility : Camera is null!");
            this.q.a(-439, "queryZoomAbility : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.x = (float) parameters.getMaxZoom();
            if (z) {
                pVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), ((float) this.f61407j.get((int) this.x).intValue()) / 100.0f, parameters.getZoomRatios());
                return;
            }
            pVar.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
        } catch (Exception e2) {
            String str = "Query zoom ability failed : " + e2.toString();
            o.d("TECamera1", str);
            this.q.a(-420, str);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.n nVar) {
        if (nVar == null) {
            o.d("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.q.a(-439, "queryShaderZoomStep : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null && parameters.isZoomSupported()) {
                int maxZoom = parameters.getMaxZoom();
                if (maxZoom > 99) {
                    maxZoom = 99;
                }
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (maxZoom > 0) {
                    Math.pow((double) ((((float) (zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue())) / 100.0f) + 1.0f), 0.5d);
                }
            }
        } catch (Exception e2) {
            String str = "Query shader zoom step failed : " + e2.toString();
            o.d("TECamera1", str);
            this.q.a(-420, str);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.p pVar) {
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            o.d("TECamera1", "stopZoom : Camera is null!");
            this.q.a(-439, "stopZoom : Camera is null!");
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && pVar != null && pVar.enableSmooth()) {
                this.f61398a.stopSmoothZoom();
            }
        } catch (Exception e2) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e2)));
            String str = "Stop zoom failed : " + e2.toString();
            o.d("TECamera1", str);
            this.q.a(-420, str);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.B.get(this.o.F);
            for (String str : bundle.keySet()) {
                if (l.k.a(str, a(bundle, str)) && TextUtils.equals(str, "support_light_soft")) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void m() {
        o.b("TECamera1", "cancelFocus...");
        Camera camera = this.f61398a;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    private List<TEFrameSizei> E() {
        Camera.Parameters parameters = this.f61399b;
        if (parameters == null) {
            this.f61404g.clear();
            return this.f61404g;
        }
        List<TEFrameSizei> a2 = a(parameters.getSupportedPreviewSizes());
        this.f61404g = a2;
        return a2;
    }

    private List<TEFrameSizei> F() {
        Camera.Parameters parameters = this.f61399b;
        if (parameters == null) {
            this.f61405h.clear();
            return this.f61405h;
        }
        List<TEFrameSizei> a2 = a(parameters.getSupportedPictureSizes());
        this.f61405h = a2;
        return a2;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void d() {
        Camera camera;
        if (this.p && (camera = this.f61398a) != null) {
            try {
                camera.stopFaceDetection();
            } catch (Exception unused) {
                o.d("TECamera1", "camera stop face detect failed");
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] h() {
        Camera camera = this.f61398a;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean o() {
        o.a("TECamera1", "isSupportedExposureCompensation...");
        if (this.f61398a == null || this.f61399b == null || !this.p) {
            return false;
        }
        return this.o.H.a();
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean p() {
        o.a("TECamera1", "isAutoExposureLockSupported...");
        if (this.f61398a == null || this.f61399b == null || !this.p) {
            return false;
        }
        return this.f61399b.isAutoExposureLockSupported();
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean s() {
        Bundle bundle = this.B.get(this.o.F);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.ss.android.ttvecamera.g
    public final void c() {
        o.b("TECamera1", "Camera start face detect");
        if (this.p && this.f61398a != null && this.f61399b.getMaxNumDetectedFaces() > 0) {
            try {
                this.f61398a.startFaceDetection();
            } catch (Exception unused) {
                o.d("TECamera1", "camera start face detect failed");
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] f() {
        Camera camera = this.f61398a;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void g() {
        Camera.Parameters parameters = this.f61399b;
        if (parameters != null) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            int[] a2 = m.a(this.o.L, this.o.f61802e, this.o.f61801d.a(TEFrameRateRange.a(supportedPreviewFpsRange)), supportedPreviewFpsRange);
            this.f61399b.setPreviewFpsRange(a2[0], a2[1]);
            this.f61398a.setParameters(this.f61399b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.ss.android.ttvecamera.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] k() {
        /*
            r4 = this;
            android.hardware.Camera r0 = r4.f61398a
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Exception -> 0x000e }
            android.hardware.Camera$Size r3 = r0.getPictureSize()     // Catch:{ Exception -> 0x000e }
            goto L_0x0013
        L_0x000e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r3 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 2
            int[] r2 = new int[r0]
            r1 = 0
            int r0 = r3.width
            r2[r1] = r0
            r1 = 1
            int r0 = r3.height
            r2[r1] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.b.k():int[]");
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean q() {
        o.a("TECamera1", "isAutoFocusLockSupported...");
        if (this.f61398a == null || this.f61399b == null || !this.p) {
            this.q.a(-439, "setAutoFocusLock failed. ： Camera is null.");
            return false;
        }
        try {
            if (this.f61399b.getSupportedFocusModes().contains("fixed")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            this.q.a(-433, -433, "isAutoFocusLockSupported failed");
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean r() {
        try {
            Camera camera = this.f61398a;
            if (camera == null || camera.getParameters() == null || this.f61398a.getParameters().getSupportedWhiteBalance() == null || !this.f61398a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            o.d("TECamera1", "Unsupported whileBalance!: " + e2.toString());
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b() {
        o.b("TECamera1", "Camera stopPreview...");
        if (this.p && this.f61398a != null) {
            this.p = false;
            this.f61409l.set(false);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f61398a.stopPreview();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                j.a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                Long.valueOf(currentTimeMillis2);
            } catch (Exception e2) {
                o.d("TECamera1", "camera stopcapture failed: " + e2.getMessage());
            }
            this.f61410m = 0;
            o.a("TECamera1", "Camera preview stopped!");
            this.q.b("TECamera1 preview stoped");
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int i() {
        int a2 = m.a(this.s);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.u = this.v;
        try {
            Camera.getCameraInfo(this.o.f61804g, cameraInfo);
            if (this.u == 1) {
                this.w = (cameraInfo.orientation + a2) % 360;
                this.w = ((360 - this.w) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
            } else {
                this.w = ((cameraInfo.orientation - a2) + 360) % 360;
            }
            return this.w;
        } catch (Exception e2) {
            this.q.a(-405, "getFrameOrientation :" + e2.getMessage());
            return 0;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int j() {
        Camera camera = this.f61398a;
        if (camera != null) {
            String str = null;
            try {
                str = camera.getParameters().getFlashMode();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if ("on".equals(str)) {
                return 1;
            }
            if ("auto".equals(str)) {
                return 3;
            }
            if ("off".equals(str)) {
                return 0;
            }
            if ("torch".equals(str)) {
                return 2;
            }
            if ("red-eye".equals(str)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ttvecamera.g
    public final float[] l() {
        float[] fArr = new float[2];
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "getFOV: camera device is null.");
            this.q.a(-439, "getFOV: camera device is null.");
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f61399b = parameters;
            fArr[0] = parameters.getVerticalViewAngle();
            fArr[1] = this.f61399b.getHorizontalViewAngle();
            o.b("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void n() {
        if (this.f61398a != null && this.f61399b != null) {
            o.b("TECamera1", "enableCaf...");
            try {
                if (this.f61399b.getSupportedFocusModes().contains("continuous-video")) {
                    this.f61398a.cancelAutoFocus();
                    this.f61399b.setFocusMode("continuous-video");
                    this.f61398a.setParameters(this.f61399b);
                }
            } catch (Throwable th) {
                String str = "Error: focusAtPoint failed: " + th.toString();
                o.d("TECamera1", str);
                this.q.a(-411, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.g
    public final Bundle t() {
        List<TEFrameSizei> a2;
        List<TEFrameRateRange> b2;
        boolean z;
        this.o.F = new StringBuilder().append(this.o.f61802e).toString();
        Bundle t = super.t();
        t.putParcelableArrayList("support_preview_sizes", (ArrayList) E());
        t.putParcelableArrayList("support_picture_sizes", (ArrayList) F());
        Camera.Parameters parameters = this.f61399b;
        if (parameters == null) {
            this.f61406i.clear();
            a2 = this.f61406i;
        } else {
            a2 = a(parameters.getSupportedVideoSizes());
            this.f61406i = a2;
        }
        t.putParcelableArrayList("support_video_sizes", (ArrayList) a2);
        Camera.Parameters parameters2 = this.f61399b;
        if (parameters2 == null) {
            b2 = null;
        } else {
            b2 = b(parameters2.getSupportedPreviewFpsRange());
        }
        t.putParcelableArrayList("camera_support_fps_range", (ArrayList) b2);
        t.putParcelable("camera_preview_size", this.o.p);
        try {
            Camera camera = this.f61398a;
            if (camera == null || camera.getParameters() == null || this.f61398a.getParameters().getSupportedFlashModes() == null) {
                z = false;
            } else {
                z = true;
            }
            t.putBoolean("camera_torch_supported", z);
        } catch (Exception e2) {
            o.d("TECamera1", "Get camera torch information failed: " + e2.toString());
            t.putBoolean("camera_torch_supported", false);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.g
    public final void u() {
        if (H()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f61399b != null) {
                List<TEFrameSizei> E = E();
                if (E != null) {
                    this.E.a(new a.b(a.EnumC1339a.PREVIEW_SIZE, a.c.STRING, this.o.F + "=" + E.toString()));
                }
                List<int[]> supportedPreviewFpsRange = this.f61399b.getSupportedPreviewFpsRange();
                StringBuilder sb = new StringBuilder(this.o.F + "=");
                if (supportedPreviewFpsRange != null) {
                    for (int[] iArr : supportedPreviewFpsRange) {
                        sb.append("[").append(iArr[0] / 1000).append(",").append(iArr[1] / 1000).append("]");
                        if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                            sb.append(", ");
                        }
                    }
                    this.E.a(new a.b(a.EnumC1339a.FPS_RANGE, a.c.STRING, sb.toString()));
                }
            }
            this.E.a();
            o.a("TECamera1", "collectCameraCapabilities consume: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0303, code lost:
        if (r10.contains(r5) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0314, code lost:
        if (r10.contains(r5) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x() {
        /*
        // Method dump skipped, instructions count: 981
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.b.x():int");
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a() {
        o.a("TECamera1", "Camera startPreview...");
        if (this.p) {
            o.c("TECamera1", "Camera is previewing...");
        } else if (this.f61398a != null) {
            try {
                if (this.t != null) {
                    Camera.Parameters parameters = this.f61398a.getParameters();
                    this.f61399b = parameters;
                    int a2 = this.t.a(a(parameters.getSupportedPreviewSizes()), this.o.p);
                    if (a2 != 0) {
                        o.d("TECamera1", "Init provider failed, ret = ".concat(String.valueOf(a2)));
                        return;
                    }
                    if (this.t.a() == 1) {
                        if (this.t.d() != null) {
                            this.f61398a.setPreviewTexture(this.t.d());
                        } else {
                            o.d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.t.a() == 4) {
                        com.ss.android.ttvecamera.j.a aVar = (com.ss.android.ttvecamera.j.a) this.t.f61616b;
                        if (aVar == null) {
                            throw new AndroidRuntimeException("Provider is null");
                        } else if (this.t.d() != null) {
                            if (this.f61409l.compareAndSet(false, true)) {
                                int i2 = ((aVar.f61608h.f61374a * aVar.f61608h.f61375b) * 3) / 2;
                                o.b(com.ss.android.ttvecamera.j.a.f61597a, "getBuffers current bufferSize: " + i2 + " mCallbackBytebufferSize:" + aVar.f61601e);
                                if (i2 > aVar.f61601e || aVar.f61601e == 0) {
                                    int[] iArr = new int[2];
                                    iArr[1] = i2;
                                    iArr[0] = 3;
                                    aVar.f61600d = (byte[][]) Array.newInstance(byte.class, iArr);
                                    o.b(com.ss.android.ttvecamera.j.a.f61597a, "new mCallbackBytebuffer size :".concat(String.valueOf(i2)));
                                    aVar.f61601e = i2;
                                }
                                for (byte[] bArr : aVar.f61600d) {
                                    this.f61398a.addCallbackBuffer(bArr);
                                }
                            }
                            this.f61398a.setPreviewCallbackWithBuffer(aVar.f61598b);
                            this.f61398a.setPreviewTexture(this.t.d());
                        } else {
                            o.d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else {
                        o.d("TECamera1", "Unsupported camera provider type : " + this.t.a());
                        return;
                    }
                    TEFrameSizei e2 = this.t.e();
                    if (e2 != null) {
                        if (!(this.f61399b.getPreviewSize().width == e2.f61374a && this.f61399b.getPreviewSize().height == e2.f61375b)) {
                            this.f61399b.setPreviewSize(e2.f61374a, e2.f61375b);
                            if (this.o.x) {
                                if (!this.o.y) {
                                    this.o.q = m.a(a(this.f61399b.getSupportedPictureSizes()), e2, this.o.t);
                                } else {
                                    this.o.y = false;
                                }
                                this.f61399b.setPictureSize(this.o.q.f61374a, this.o.q.f61375b);
                            }
                            this.f61398a.setParameters(this.f61399b);
                        }
                        this.q.a(50, 0, e2.toString());
                    }
                    if (this.o.y) {
                        this.o.y = false;
                        this.f61399b.setPictureSize(this.o.q.f61374a, this.o.q.f61375b);
                        this.f61398a.setParameters(this.f61399b);
                        o.a("TECamera1", "force set picture size: " + this.o.q.f61374a + "x" + this.o.q.f61375b);
                    }
                    this.f61398a.setErrorCallback(new Camera.ErrorCallback() {
                        /* class com.ss.android.ttvecamera.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(37814);
                        }

                        public final void onError(int i2, Camera camera) {
                            String concat;
                            int i3;
                            j.a("te_record_camera_err_ret", (long) i2);
                            if (i2 == 100) {
                                i3 = -407;
                                concat = "Camera server died!";
                            } else if (Build.VERSION.SDK_INT >= 23 && i2 == 2) {
                                concat = "Camera disconnected: ".concat(String.valueOf(i2));
                                i3 = -409;
                            } else if (i2 == 1) {
                                concat = "Camera unknown error: ".concat(String.valueOf(i2));
                                i3 = -410;
                            } else {
                                o.c("TECamera1", "Ignore camera error here: ".concat(String.valueOf(i2)));
                                return;
                            }
                            o.d("TECamera1", concat);
                            b bVar = b.this;
                            bVar.b(bVar.D);
                            b.this.y = 0;
                            if (i2 == 2) {
                                b.this.q.a(b.this);
                            } else {
                                b.this.q.b(i3, concat);
                            }
                        }
                    });
                    this.o.f61803f = i();
                    o.b("TECamera1", "Camera rotation = " + this.o.f61803f);
                    long currentTimeMillis = System.currentTimeMillis();
                    o.a("TECamera1", "Camera startPreview start");
                    this.f61398a.startPreview();
                    o.a("TECamera1", "Camera startPreview end");
                    boolean z = this.o.C.getBoolean("useCameraFaceDetect");
                    this.f61400c = z;
                    if (z) {
                        c();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.f61410m = currentTimeMillis2;
                    long j2 = currentTimeMillis2 - currentTimeMillis;
                    j.a("te_record_camera1_start_preview_cost", j2);
                    Long.valueOf(j2);
                    this.p = true;
                    this.q.a("TECamera1 preview");
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e3) {
                o.d("TECamera1", "startPreview: Error " + e3.getMessage());
                int i3 = -425;
                if (e3.getMessage() != null) {
                    if (e3.getMessage().equals("setParameters failed")) {
                        i3 = -402;
                    } else if (e3.getMessage().equals("startPreview failed")) {
                        i3 = -410;
                    }
                }
                h.a(e3);
                this.p = false;
                try {
                    if (this.y == 0) {
                        this.q.a(108, 0, "preview error will close camera1");
                        d.a(this.D, this.f61398a);
                        this.q.a(110, 0, "closePrivacy");
                        this.q.a(109, 0, "preview error did close camera1");
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.y == 0) {
                    this.f61398a = null;
                }
                this.q.b(i3, e3.getMessage());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(int i2) {
        o.c("TECamera1", "Does not support switch mode for camera1");
        this.q.a(-200, -200, "Does not support switch mode for camera1");
    }

    private static List<TEFrameSizei> a(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    private static List<TEFrameRateRange> b(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(PrivacyCert privacyCert) {
        this.F = false;
        o.a("TECamera1", "Camera close start...");
        if (this.f61398a != null) {
            if (this.p) {
                try {
                    Camera.Parameters parameters = this.f61398a.getParameters();
                    this.f61399b = parameters;
                    parameters.setFlashMode("off");
                    this.f61398a.setParameters(this.f61399b);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f61398a.stopPreview();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    j.a("te_record_camera1_stop_preview_cost", currentTimeMillis2);
                    Long.valueOf(currentTimeMillis2);
                    if (this.t.a() == 1) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.t.d().setOnFrameAvailableListener(null, null);
                        } else {
                            this.t.d().setOnFrameAvailableListener(null);
                        }
                    } else if (this.t.a() == 4) {
                        this.f61398a.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e2) {
                    o.d("TECamera1", "Close camera failed: " + e2.getMessage());
                }
                this.p = false;
            }
            try {
                this.f61398a.setErrorCallback(null);
                this.q.a(108, 0, "will close camera1");
                d.a(privacyCert, this.f61398a);
                this.q.a(110, 0, "closePrivacy");
                this.q.a(109, 0, "did close camera1");
            } catch (Exception e3) {
                o.d("TECamera1", "Camera release failed: " + e3.getMessage());
            }
            this.f61409l.set(false);
            this.f61398a = null;
            o.a("TECamera1", "Camera closed end!");
            this.q.a(this);
        }
        this.D = null;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void c(int i2) {
        String str;
        o.a("TECamera1", "setExposureCompensation... value: ".concat(String.valueOf(i2)));
        int i3 = -413;
        if (this.f61398a == null || this.f61399b == null || !this.p || !this.o.H.a()) {
            if (this.f61398a == null || this.f61399b == null || !this.p) {
                str = "setExposureCompensation ： Camera is null.";
                this.q.a(-439, str);
            } else {
                i3 = -414;
                str = "Unsupported exposure compensation!";
            }
            o.d("TECamera1", str);
            this.q.a(i3, str);
        } else if (i2 > this.o.H.f61823a || i2 < this.o.H.f61825c) {
            this.q.a(-415, "Invalid exposure: ".concat(String.valueOf(i2)));
        } else {
            try {
                this.f61399b.setExposureCompensation(i2);
                this.f61398a.setParameters(this.f61399b);
                this.o.H.f61824b = this.f61399b.getExposureCompensation();
                o.a("TECamera1", "EC = " + this.o.H.f61824b + ", EV = " + (((float) this.o.H.f61824b) * this.o.H.f61826d));
            } catch (Exception e2) {
                String str2 = "Error: setExposureCompensation failed: " + e2.toString();
                o.d("TECamera1", str2);
                this.q.a(-413, str2);
            }
        }
    }

    private int c(PrivacyCert privacyCert) {
        int i2;
        Exception e2;
        this.D = privacyCert;
        int i3 = -401;
        try {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            int numberOfCameras = Camera.getNumberOfCameras();
            this.f61403f = numberOfCameras;
            j.a("te_record_camera_size", (long) numberOfCameras);
            o.a("TECamera1", "innerOpen mNumberOfCameras: " + this.f61403f + ", current mDefaultCameraID:" + this.o.f61804g);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i6 = 0;
            while (true) {
                if (i6 >= this.f61403f) {
                    break;
                }
                Camera.getCameraInfo(i6, cameraInfo);
                o.a("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.o.f61802e);
                if (cameraInfo.facing == this.o.f61802e) {
                    this.o.f61804g = i6;
                    break;
                }
                i6++;
            }
            if (this.o.f61804g != -1 || this.f61403f <= 0 || !this.o.ah) {
                if (this.o.f61804g == -1 && this.f61403f > 0 && this.o.ag) {
                    o.c("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                    this.o.f61804g = 0;
                }
                o.a("TECamera1", "innerOpen: " + this.o.f61804g);
                this.q.a(106, 0, "will start camera1");
                if (this.o.f61804g < 0) {
                    this.f61398a = d.a(privacyCert, this.o.f61804g);
                    this.q.a(111, 0, "openPrivacy");
                    this.o.f61802e = 0;
                    this.v = this.o.f61802e;
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= this.f61403f) {
                            break;
                        }
                        Camera.getCameraInfo(i7, cameraInfo2);
                        if (cameraInfo2.facing == this.v) {
                            this.o.f61804g = i7;
                            break;
                        }
                        i7++;
                    }
                } else {
                    this.f61398a = d.a(privacyCert, this.o.f61804g);
                    this.q.a(111, 0, "openPrivacy");
                }
                o.a("TECamera1", "innerOpen mNewFacing: " + this.v);
                o.a("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.o.f61804g);
                this.q.a(107, 0, "did start camera1");
                if (this.f61398a == null) {
                    o.d("TECamera1", "Open Camera Failed with ID:" + this.o.f61804g);
                    if (this.o.f61804g == -1) {
                        i3 = -405;
                    }
                    this.q.a(1, i3);
                    return i3;
                }
                try {
                    i2 = x();
                    try {
                        t();
                        u();
                        this.q.a(1, 0, "TECamera1 features is ready");
                    } catch (Exception e3) {
                        e2 = e3;
                        i5 = i2;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    o.d("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e2));
                    h.a(e2);
                    i2 = i5;
                    this.q.a(1, i2);
                    return i2;
                }
                this.q.a(1, i2);
                return i2;
            }
            o.c("TECamera1", "innerOpen: camera info check error");
            throw new RuntimeException("CameraIDError");
        } catch (RuntimeException e5) {
            o.d("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e5));
            if (e5.getMessage() != null) {
                if (e5.getMessage().equals("Fail to connect to camera service")) {
                    i3 = -410;
                } else if (e5.getMessage().equals("Camera initialization failed")) {
                    i3 = -407;
                }
            }
            h.a(e5);
            this.q.a(1, i3);
            this.f61398a = null;
            return i3;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(int i2) {
        super.a(i2);
        if (i2 == 0) {
            if (this.o.X) {
                try {
                    this.f61399b.setRecordingHint(false);
                    this.f61398a.setParameters(this.f61399b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else if (i2 != 1) {
            throw new IllegalArgumentException("un support scene");
        } else if (this.o.X) {
            try {
                this.f61399b.setRecordingHint(true);
                this.f61398a.setParameters(this.f61399b);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void d(final int i2) {
        String str;
        int i3;
        String str2;
        int i4;
        MethodCollector.i(469);
        int i5 = 1;
        if (this.f61398a == null) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            o.d("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.q.a(-439, "switchFlashMode failed: Camera is not ready!");
            g.a aVar = this.q;
            if (i2 == 0) {
                i5 = 0;
            }
            aVar.d(i5, "switchFlashMode failed: Camera is not ready!");
            MethodCollector.o(469);
        } else if (this.f61410m == 0 || System.currentTimeMillis() - this.f61410m >= 200 || this.r == null) {
            this.F = false;
            try {
                Camera.Parameters parameters = this.f61398a.getParameters();
                this.f61399b = parameters;
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (i2 == 0) {
                        str2 = "off";
                    } else if (i2 == 1) {
                        str2 = "on";
                        this.F = true;
                    } else if (i2 == 2) {
                        str2 = "torch";
                    } else if (i2 == 3) {
                        str2 = "auto";
                    } else if (i2 == 4) {
                        str2 = "red-eye";
                    }
                    if (supportedFlashModes.contains(str2)) {
                        this.q.a(104, 0, "camera1 will change flash mode ".concat(String.valueOf(str2)));
                        this.f61399b.setFlashMode(str2);
                        this.f61398a.setParameters(this.f61399b);
                        if ("off".equalsIgnoreCase(str2) && this.o.C.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        this.q.a(105, 0, "camera1 did change flash mode ".concat(String.valueOf(str2)));
                        g.a aVar2 = this.q;
                        if (i2 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        aVar2.c(i4, "torch success");
                        MethodCollector.o(469);
                        return;
                    }
                }
                if (supportedFlashModes != null) {
                    str = "Camera does not support flash mode: " + i2 + "support list: " + supportedFlashModes.toString();
                } else {
                    str = "Camera does not support flash mode: ".concat(String.valueOf(i2));
                }
                o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode ".concat(String.valueOf(i2)));
                o.d("TECamera1", str);
                this.q.a(-419, str);
                g.a aVar3 = this.q;
                if (i2 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                aVar3.d(i3, str);
                MethodCollector.o(469);
            } catch (Exception e3) {
                o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: ".concat(String.valueOf(e3)));
                String str3 = "Switch flash mode failed: " + e3.toString();
                o.d("TECamera1", str3);
                this.q.a(-418, str3);
                g.a aVar4 = this.q;
                if (i2 == 0) {
                    i5 = 0;
                }
                aVar4.d(i5, str3);
                MethodCollector.o(469);
            }
        } else {
            this.r.postDelayed(new Runnable() {
                /* class com.ss.android.ttvecamera.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(37818);
                }

                public final void run() {
                    b.this.d(i2);
                }
            }, 200);
            MethodCollector.o(469);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(boolean z) {
        o.a("TECamera1", "setAutoFocusLock...");
        if (this.f61398a == null || this.f61399b == null || !this.p) {
            this.q.a(-439, "setAutoFocusLock failed. ： Camera is null.");
        } else if (!q()) {
            o.c("TECamera1", "Current camera doesn't support af lock.");
            this.q.a(-433, -433, "Current camera doesn't support af lock.");
        } else {
            if (z) {
                try {
                    this.f61399b.setFocusMode("fixed");
                } catch (Exception e2) {
                    String str = "Error: setAutoFocusLock failed: " + e2.toString();
                    o.d("TECamera1", str);
                    this.q.a(-427, -427, str);
                    return;
                }
            } else {
                this.f61399b.setFocusMode("continuous-video");
            }
            this.f61398a.setParameters(this.f61399b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ttvecamera.g
    public final void c(boolean z) {
        String str;
        int i2 = 0;
        this.F = false;
        if (this.f61398a == null) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            o.d("TECamera1", "toggleTorch : Camera is not ready!");
            this.q.a(-439, "toggleTorch : Camera is not ready!");
            this.q.d(z, "toggleTorch : Camera is not ready!");
        } else if (this.o.f61802e == 1) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            o.c("TECamera1", "Front camera does not support torch!");
            this.q.a(-416, -416, "Front camera does not support torch!");
            this.q.d(z, "Front camera does not support torch!");
        } else {
            try {
                this.q.a(104, 0, "camera1 will change flash mode ".concat(String.valueOf(z)));
                Camera.Parameters parameters = this.f61398a.getParameters();
                this.f61399b = parameters;
                if (z != 0) {
                    str = "torch";
                } else {
                    str = "off";
                }
                parameters.setFlashMode(str);
                this.f61398a.setParameters(this.f61399b);
                this.q.a(105, 0, "camera1 did change flash mode ".concat(String.valueOf(z)));
                g.a aVar = this.q;
                if (z != 0) {
                    i2 = 1;
                }
                aVar.c(i2, "toggleTorch ".concat(String.valueOf(z)));
            } catch (Exception e2) {
                o.d("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: ".concat(String.valueOf(e2)));
                String str2 = "Toggle torch failed: " + e2.toString();
                o.d("TECamera1", str2);
                this.q.a(-417, str2);
                this.q.d(z ? 1 : 0, str2);
            }
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int a(l lVar, PrivacyCert privacyCert) {
        super.a(lVar, privacyCert);
        this.o = lVar;
        this.v = lVar.f61802e;
        return c(privacyCert);
    }

    @Override // com.ss.android.ttvecamera.g
    public final TEFrameSizei a(float f2, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f61399b == null) {
            this.f61399b = camera.getParameters();
        }
        if (tEFrameSizei != null) {
            return m.a(E(), tEFrameSizei);
        }
        return m.a(E(), f2);
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(float f2, final l.p pVar) {
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            o.d("TECamera1", "startZoom : Camera is null!");
            this.q.a(-439, "startZoom : Camera is null!");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f61399b = parameters;
            if (parameters.isZoomSupported() || this.f61399b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f61399b.getMaxZoom(), f2);
                if (!this.f61399b.isSmoothZoomSupported() || pVar == null || !pVar.enableSmooth()) {
                    this.f61399b.setZoom(min);
                    this.f61398a.setParameters(this.f61399b);
                    if (pVar != null) {
                        pVar.onChange(1, (float) min, true);
                        return;
                    }
                    return;
                }
                this.f61398a.startSmoothZoom(min);
                this.f61398a.setZoomChangeListener(new Camera.OnZoomChangeListener() {
                    /* class com.ss.android.ttvecamera.b.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(37819);
                    }

                    public final void onZoomChange(int i2, boolean z, Camera camera) {
                        l.p pVar = pVar;
                        if (pVar != null) {
                            pVar.onChange(1, (float) i2, z);
                        }
                    }
                });
                return;
            }
            o.d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
            o.d("TECamera1", "Camera is not support zoom!");
            this.q.a(-421, "Camera is not support zoom!");
        } catch (Exception e2) {
            o.d("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e2)));
            String str = "Start zoom failed : " + e2.toString();
            o.d("TECamera1", str);
            this.q.a(-420, str);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(float f2, l.p pVar) {
        List<Integer> list = this.f61407j;
        if (list != null && this.f61398a != null) {
            float f3 = this.f61408k * f2;
            this.f61408k = f3;
            int i2 = 0;
            try {
                if (f3 < ((float) list.get(0).intValue())) {
                    this.f61408k = (float) this.f61407j.get(0).intValue();
                }
                float f4 = this.f61408k;
                List<Integer> list2 = this.f61407j;
                if (f4 > ((float) list2.get(list2.size() - 1).intValue())) {
                    List<Integer> list3 = this.f61407j;
                    this.f61408k = (float) list3.get(list3.size() - 1).intValue();
                }
                Camera.Parameters parameters = this.f61398a.getParameters();
                if (parameters != null) {
                    int i3 = (int) this.f61408k;
                    int size = this.f61407j.size() - 1;
                    while (size - i2 > 1) {
                        int i4 = (i2 + size) / 2;
                        if (i3 > this.f61407j.get(i4).intValue()) {
                            i2 = i4;
                        } else {
                            size = i4;
                        }
                    }
                    if (Math.abs(i3 - this.f61407j.get(i2).intValue()) > Math.abs(i3 - this.f61407j.get(size).intValue())) {
                        i2 = size;
                    }
                    if (parameters.getZoom() != i2) {
                        parameters.setZoom(i2);
                        this.f61398a.setParameters(parameters);
                        if (pVar != null) {
                            pVar.onChange(1, ((float) this.f61407j.get(i2).intValue()) / 100.0f, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o.d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                o.d("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e2) {
                o.d("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: ".concat(String.valueOf(e2)));
                o.d("TECamera1", "setZoom failed, " + e2.getMessage());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(int i2, int i3) {
        this.o.y = true;
        this.o.q.f61374a = i2;
        this.o.q.f61375b = i3;
        b();
        a();
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(int i2, int i3, final l.AbstractC1345l lVar) {
        Camera camera = this.f61398a;
        if (camera == null) {
            o.d("TECamera1", "takePicture : camera is null");
            this.q.a(-439, "takePicture : camera is null");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f61399b = parameters;
            if (!(parameters.getPictureSize().width == i2 && this.f61399b.getPictureSize().height == i3)) {
                TEFrameSizei a2 = m.a(a(this.f61399b.getSupportedPictureSizes()), this.o.p, new TEFrameSizei(i2, i3));
                this.f61399b.setPictureSize(a2.f61374a, a2.f61375b);
                List<Integer> supportedPictureFormats = this.f61399b.getSupportedPictureFormats();
                if (!this.o.am || supportedPictureFormats == null || !supportedPictureFormats.contains(17)) {
                    this.f61399b.setPictureFormat(256);
                    this.f61399b.setJpegQuality(100);
                } else {
                    this.f61399b.setPictureFormat(17);
                }
                this.f61398a.setParameters(this.f61399b);
            }
            this.p = false;
            this.f61398a.takePicture(null, null, new Camera.PictureCallback() {
                /* class com.ss.android.ttvecamera.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37815);
                }

                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    int i2;
                    if (lVar != null) {
                        int pictureFormat = b.this.f61399b.getPictureFormat();
                        Camera.Size pictureSize = b.this.f61399b.getPictureSize();
                        int i3 = pictureSize.width;
                        int i4 = pictureSize.height;
                        o.a("TECamera1", "take picture format: " + pictureFormat + ", w: " + i3 + ", h: " + i4);
                        i.b bVar = i.b.PIXEL_FORMAT_JPEG;
                        if (b.this.v == 1) {
                            i2 = 270;
                        } else {
                            i2 = 90;
                        }
                        if (pictureFormat == 17) {
                            bVar = i.b.PIXEL_FORMAT_NV21;
                        }
                        new i(bArr, bVar, i3, i4, i2);
                    }
                }
            });
        } catch (Exception e2) {
            h.a(e2);
            if (lVar != null) {
                a(e2, -1000);
            }
        }
    }

    public static b a(Context context, g.a aVar, Handler handler, g.c cVar) {
        return new b(context, aVar, handler, cVar);
    }

    private b(Context context, g.a aVar, Handler handler, g.c cVar) {
        super(context, aVar, handler, cVar);
        this.o = new l(context, 1);
        this.f61401d = new c();
        this.D = null;
    }
}
