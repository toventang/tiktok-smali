package com.ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Range;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.c.a;
import com.ss.android.ttvecamera.e.b;
import com.ss.android.ttvecamera.g;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class e extends g {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ttvecamera.g.e f61509a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f61510b;

    /* renamed from: c  reason: collision with root package name */
    protected CameraCharacteristics f61511c;

    /* renamed from: d  reason: collision with root package name */
    protected CaptureRequest f61512d;

    /* renamed from: e  reason: collision with root package name */
    protected CameraManager f61513e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile CameraDevice f61514f;

    /* renamed from: g  reason: collision with root package name */
    protected int f61515g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f61516h = true;

    /* renamed from: i  reason: collision with root package name */
    protected b f61517i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f61518j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f61519k;

    /* renamed from: l  reason: collision with root package name */
    protected ConditionVariable f61520l = new ConditionVariable();

    /* renamed from: m  reason: collision with root package name */
    protected CameraDevice.StateCallback f61521m = new CameraDevice.StateCallback() {
        /* class com.ss.android.ttvecamera.e.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        a<CameraDevice> f61522a;

        static {
            Covode.recordClassIndex(37856);
        }

        private static void a(CameraDevice cameraDevice) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(cameraDevice, new Object[0], 100201, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100205, "com_ss_android_ttvecamera_TECamera2$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
                cameraDevice.close();
                com.bytedance.helios.sdk.a.a(null, cameraDevice, new Object[0], 100201, "com_ss_android_ttvecamera_TECamera2$1_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            }
        }

        {
            this.f61522a = new a<>(e.this);
        }

        public final void onClosed(CameraDevice cameraDevice) {
            if (e.this.f61517i instanceof com.ss.android.ttvecamera.a.b) {
                ((com.ss.android.ttvecamera.a.b) e.this.f61517i).a(cameraDevice, 4, -1);
            }
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            o.a("TECamera2", "onDisconnected: OpenCameraCallBack");
            if (e.this.f61517i instanceof com.ss.android.ttvecamera.a.b) {
                ((com.ss.android.ttvecamera.a.b) e.this.f61517i).a(cameraDevice, 1, -1);
            }
            e.this.F();
            a<CameraDevice> aVar = this.f61522a;
            if (aVar != null) {
                o.d("TECamera2", "StateCallback::onDisconnected...");
                e eVar = aVar.f61524a.get();
                if (eVar == null) {
                    return;
                }
                if (eVar.o.aj) {
                    o.d("TECamera2", "StateCallback::onDisconnected...ignore reset...");
                    eVar.o.aj = false;
                    return;
                }
                a.AnonymousClass2 r1 = new Runnable(eVar) {
                    /* class com.ss.android.ttvecamera.e.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f61527a;

                    static {
                        Covode.recordClassIndex(37859);
                    }

                    public final void run() {
                        e eVar = this.f61527a;
                        eVar.c(eVar.D);
                    }

                    {
                        this.f61527a = r2;
                    }
                };
                if (eVar.o.f61809l) {
                    eVar.r.post(r1);
                } else {
                    r1.run();
                }
            }
        }

        public final void onOpened(CameraDevice cameraDevice) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                o.a("TECamera2", "onOpened: OpenCameraCallBack");
                e.this.q.a(107, 0, "did start camera2");
                if (e.this.f61517i instanceof com.ss.android.ttvecamera.a.b) {
                    ((com.ss.android.ttvecamera.a.b) e.this.f61517i).a(cameraDevice, 0, -1);
                }
                e.this.f61514f = cameraDevice;
                e.this.f61517i.a(cameraDevice);
                e.this.F();
                a<CameraDevice> aVar = this.f61522a;
                if (aVar == null || !aVar.a()) {
                    a(cameraDevice);
                    g.a aVar2 = e.this.q;
                    CameraDevice cameraDevice2 = e.this.f61514f;
                    aVar2.a(110, 0, "onOpened error closePrivacy");
                    o.c("TECamera2", "onOpened: OpenCameraCallBack, some bad case occur, close camera!");
                } else if (e.this.f61519k && e.this.f61518j) {
                    a(cameraDevice);
                    g.a aVar3 = e.this.q;
                    CameraDevice cameraDevice3 = e.this.f61514f;
                    aVar3.a(110, 0, "close intent... closePrivacy");
                    o.c("TECamera2", "onOpened: OpenCameraCallBack, but had camera close intent...");
                    e.this.f61518j = false;
                }
            }
        }

        public final void onError(CameraDevice cameraDevice, int i2) {
            o.a("TECamera2", "onError: ".concat(String.valueOf(i2)));
            if (e.this.f61517i instanceof com.ss.android.ttvecamera.a.b) {
                ((com.ss.android.ttvecamera.a.b) e.this.f61517i).a(cameraDevice, 3, i2);
            }
            e.this.F();
            a<CameraDevice> aVar = this.f61522a;
            if (aVar == null) {
                o.d("TECamera2", "had called onError");
                return;
            }
            o.a("TECamera2", "StateCallback::onError...");
            e eVar = aVar.f61524a.get();
            if (eVar != null) {
                a.AnonymousClass3 r1 = new Runnable(eVar, i2) {
                    /* class com.ss.android.ttvecamera.e.a.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f61529a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f61530b;

                    static {
                        Covode.recordClassIndex(37860);
                    }

                    public final void run() {
                        e eVar = this.f61529a;
                        eVar.c(eVar.D);
                        if (this.f61529a.q != null) {
                            g.a aVar = this.f61529a.q;
                            int i2 = this.f61529a.o.f61800c;
                            int i3 = this.f61530b;
                            CameraDevice cameraDevice = this.f61529a.f61514f;
                            aVar.a(i2, i3);
                        }
                    }

                    {
                        this.f61529a = r2;
                        this.f61530b = r3;
                    }
                };
                if (eVar.o.f61809l) {
                    eVar.r.post(r1);
                } else {
                    r1.run();
                }
                eVar.f(4);
            }
            this.f61522a = null;
        }
    };

    static {
        Covode.recordClassIndex(37855);
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.p pVar) {
    }

    @Override // com.ss.android.ttvecamera.g
    public final int e() {
        return 2;
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean q() {
        return true;
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean r() {
        return true;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.B.get(this.o.F);
            for (String str : bundle.keySet()) {
                if (l.k.a(str, a(bundle, str)) && "support_light_soft".equalsIgnoreCase(str)) {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(PrivacyCert privacyCert) {
        super.a(privacyCert);
        o.a("TECamera2", "force close camera: " + this.f61514f);
        if (this.f61514f != null) {
            f.a(privacyCert, this.f61514f);
            this.f61514f = null;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(com.ss.android.ttvecamera.i.a aVar, l.c cVar) {
        this.f61517i.a(aVar, this.v, cVar);
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(int i2, int i3, l.AbstractC1345l lVar) {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f61510b == 2) {
            o.b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "takePicture : camera is null.");
            this.q.a(-439, "takePicture : camera is null.");
        } else {
            bVar.a(lVar);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.AbstractC1345l lVar) {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f61510b == 2) {
            o.b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "takePicture : camera is null.");
            this.q.a(-439, "takePicture : camera is null.");
        } else {
            bVar.a(lVar, this.v);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(n nVar) {
        b bVar;
        o.b("TECamera2", "setFocusAreas...");
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
            nVar.f61854m.a(0, this.o.f61802e, "Camera is opening, ignore setFocusAreas operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "focusAtPoint : camera is null.");
            nVar.f61854m.a(-439, this.o.f61802e, "focusAtPoint : camera is null.");
            this.q.a(-439, "focusAtPoint : camera is null.");
        } else {
            int a2 = bVar.a(nVar);
            if (a2 != 0) {
                this.q.a(-411, a2, "focusAtPoint : something wrong.");
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(boolean z) {
        b bVar;
        o.a("TECamera2", "setAutoExposureLock...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setAutoExposureLock operation.");
        } else if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "setAutoExposureLock : camera is null.");
            this.q.a(-439, "setAutoExposureLock : camera is null.");
        } else if (Build.VERSION.SDK_INT < 23) {
            o.c("TECamera2", "Current camera doesn't support auto exposure lock.");
            this.q.a(-426, -426, "Current camera doesn't support auto exposure lock.");
        } else {
            Boolean bool = (Boolean) this.f61517i.t.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE);
            if (bool == null || !bool.booleanValue()) {
                o.c("TECamera2", "Current camera doesn't support auto exposure lock.");
                this.q.a(-426, -426, "Current camera doesn't support auto exposure lock.");
                return;
            }
            b bVar2 = this.f61517i;
            if (bVar2.v == null || bVar2.w == null) {
                bVar2.y.a(-100, "setExposureCompensation : Capture Session is null");
                return;
            }
            try {
                bVar2.v.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
                bVar2.d(bVar2.v);
            } catch (Exception e2) {
                e2.printStackTrace();
                bVar2.y.a(-427, -427, e2.toString());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(String str) {
        b bVar;
        o.b("TECamera2", "setWhileBalance: ".concat(String.valueOf(str)));
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.c("TECamera2", "setWhileBalance : camera is null.");
            this.q.a(-439, "setWhileBalance : camera is null.");
        } else {
            bVar.a(str);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(long j2) {
        b bVar;
        o.b("TECamera2", "setShutterTime : ".concat(String.valueOf(j2)));
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setShutterTime operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.c("TECamera2", "setISO : camera is null.");
            this.q.a(-439, "setISO : camera is null.");
        } else {
            if (bVar.v == null || bVar.w == null) {
                bVar.y.a(-431, -431, "Capture Session is null");
            }
            if (j2 > bVar.s()[1] || j2 < bVar.s()[0]) {
                bVar.y.a(-431, -431, "invalid shutter time");
                return;
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.v.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j2));
            b.a d2 = bVar.d(bVar.v);
            if (!d2.f61543a) {
                o.d("TECameraModeBase", "setShutterTime exception: " + d2.f61544b);
                bVar.y.a(-431, -431, d2.f61544b);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.p pVar, boolean z) {
        b bVar;
        if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "queryZoomAbility: camera is null.");
            this.q.a(-439, "queryZoomAbility: camera is null.");
        } else if (this.f61509a == null) {
            o.d("TECamera2", "DeviceProxy is null!");
            this.q.a(-420, "");
        } else {
            float a2 = com.ss.android.ttvecamera.g.e.a(this.f61517i.t, this.o.f61800c, this.o.o);
            this.x = a2;
            o.b("TECamera2", "zoom: " + a2 + ", factor = " + this.o.o);
            if (pVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * a2)));
                pVar.onZoomSupport(this.o.f61800c, a2 > 0.0f, false, a2, arrayList);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(l.n nVar) {
        b bVar;
        if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "queryShaderZoomStep: camera is null.");
            this.q.a(-439, "queryShaderZoomStep: camera is null.");
        } else if (this.f61509a == null) {
            o.d("TECamera2", "DeviceProxy is null!");
            this.q.a(-420, "");
        } else {
            com.ss.android.ttvecamera.g.e.a(this.f61517i.t);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(float f2, l.p pVar) {
        b bVar;
        if (this.f61510b != 3) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.q.a(-420, -420, "Invalid state, state = " + this.f61510b);
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.q.a(-439, "startZoom : Camera is null.");
        } else {
            bVar.a(f2, pVar);
        }
    }

    private boolean K() {
        if (this.f61514f != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ttvecamera.g
    public final int v() {
        return this.f61517i.Q_();
    }

    @Override // com.ss.android.ttvecamera.g
    public final int w() {
        return this.f61517i.R_();
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] h() {
        b bVar = this.f61517i;
        if (bVar == null) {
            return null;
        }
        return bVar.P_();
    }

    @Override // com.ss.android.ttvecamera.g
    public final int j() {
        b bVar = this.f61517i;
        if (bVar == null) {
            return -1;
        }
        return bVar.n();
    }

    public final void F() {
        if (this.o.f61809l) {
            this.f61520l.open();
            o.a("TECamera2", "open camera-operation lock");
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] k() {
        b bVar = this.f61517i;
        if (bVar != null) {
            return bVar.i();
        }
        o.d("TECamera2", "get picture size failed, no mode...");
        return null;
    }

    /* access modifiers changed from: protected */
    public void x() {
        o.b("TECamera2", "create TEVideo2Mode");
        this.f61517i = new com.ss.android.ttvecamera.b.b(this, this.s, this.f61513e, this.r);
    }

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<e> f61524a;

        static {
            Covode.recordClassIndex(37857);
        }

        public final boolean a() {
            o.a("TECamera2", "StateCallback::onOpened...");
            final e eVar = this.f61524a.get();
            if (eVar == null) {
                return false;
            }
            eVar.o.aj = false;
            eVar.f(2);
            AnonymousClass1 r1 = new Runnable() {
                /* class com.ss.android.ttvecamera.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37858);
                }

                public final void run() {
                    if (eVar.q != null) {
                        g.a aVar = eVar.q;
                        int i2 = eVar.o.f61800c;
                        CameraDevice cameraDevice = eVar.f61514f;
                        aVar.a(i2, 0);
                        return;
                    }
                    o.d("TECamera2", "mCameraEvents is null!");
                }
            };
            if (eVar.o.f61809l) {
                eVar.r.post(r1);
            } else {
                r1.run();
            }
            eVar.f61516h = false;
            return true;
        }

        public a(e eVar) {
            this.f61524a = new WeakReference<>(eVar);
        }
    }

    private int J() {
        b bVar = this.f61517i;
        if (bVar == null) {
            this.q.a(-439, "_stopCapture : mode is null");
            return -1;
        }
        try {
            bVar.b();
            this.q.b("TECamera2 preview stoped");
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.q.a(-425, "Error:_stopCapture : mode is null");
            return -1;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int B() {
        b bVar;
        o.b("TECamera2", "getISO...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setISO operation.");
            return -1;
        } else if (K() && (bVar = this.f61517i) != null) {
            return bVar.r();
        } else {
            o.c("TECamera2", "getISO : camera is null.");
            this.q.a(-439, "getISO : camera is null.");
            return -1;
        }
    }

    public final void E() {
        if (this.o.f61809l) {
            this.f61520l.close();
            o.a("TECamera2", "block camera-operation start...");
            o.a("TECamera2", "block camera-operation end...result = ".concat(String.valueOf(this.f61520l.block(1000))));
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b() {
        o.b("TECamera2", "stopCapture...");
        if (!K()) {
            o.d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f61510b != 3) {
            o.d("TECamera2", "Invalid state: " + this.f61510b);
        }
        J();
    }

    @Override // com.ss.android.ttvecamera.g
    public final int i() {
        int i2;
        int a2 = m.a(this.s);
        this.u = this.v;
        CameraCharacteristics cameraCharacteristics = this.f61511c;
        if (cameraCharacteristics != null) {
            i2 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i2 = this.o.f61803f;
        }
        if (this.u == 1) {
            this.w = (i2 + a2) % 360;
            this.w = ((360 - this.w) + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
        } else {
            this.w = ((i2 - a2) + 360) % 360;
        }
        return this.w;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void m() {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "cancelFocus : camera is null.");
            this.q.a(-439, "cancelFocus : camera is null.");
        } else {
            bVar.e();
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void n() {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "enableCaf : camera is null.");
            this.q.a(-439, "enableCaf : camera is null.");
        } else {
            bVar.p();
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean o() {
        b bVar;
        o.a("TECamera2", "isSupportedExposureCompensation...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
            return false;
        } else if (K() && (bVar = this.f61517i) != null && bVar.t != null) {
            return this.o.H.a();
        } else {
            o.d("TECamera2", "isSupportedExposureCompensation : camera is null.");
            this.q.a(-439, "isSupportedExposureCompensation : camera is null.");
            return false;
        }
    }

    private int I() {
        b bVar = this.f61517i;
        if (bVar == null) {
            this.y = 0;
            this.q.b(-439, "_startCapture : mode is null");
            return -1;
        }
        try {
            int d2 = bVar.d();
            if (d2 != 0) {
                F();
                this.q.b(d2, "_startCapture : something wrong");
            }
            return d2;
        } catch (Exception e2) {
            int i2 = -425;
            if (e2 instanceof CameraAccessException) {
                i2 = -410;
            } else if (e2 instanceof IllegalArgumentException) {
                i2 = -402;
            } else if (e2 instanceof IllegalStateException) {
                i2 = -409;
            }
            F();
            e2.printStackTrace();
            h.a(e2);
            this.q.b(i2, "_startCapture : mode is null, err msg: " + e2.getMessage());
            return i2;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] A() {
        b bVar;
        o.b("TECamera2", "getISORange...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
            return new int[]{-1, -1};
        } else if (K() && (bVar = this.f61517i) != null) {
            return bVar.q();
        } else {
            o.c("TECamera2", "setWhileBalance : camera is null.");
            this.q.a(-439, "setWhileBalance : camera is null.");
            return new int[]{-1, -1};
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final long[] C() {
        b bVar;
        o.b("TECamera2", "getShutterTimeRange...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore getShutterTimeRange operation.");
            return new long[]{-1, -1};
        } else if (K() && (bVar = this.f61517i) != null) {
            return bVar.s();
        } else {
            o.c("TECamera2", "getShutterTimeRange : camera is null.");
            this.q.a(-439, "getShutterTimeRange : camera is null.");
            return new long[]{-1, -1};
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final float[] D() {
        b bVar;
        o.b("TECamera2", "getApertureRange...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore getApertureRange operation.");
            return new float[]{-1.0f, -1.0f};
        } else if (K() && (bVar = this.f61517i) != null) {
            return bVar.t();
        } else {
            o.c("TECamera2", "getApertureRange : camera is null.");
            this.q.a(-439, "getApertureRange : camera is null.");
            return new float[]{-1.0f, -1.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final int[] f() {
        Range range;
        b bVar = this.f61517i;
        if (bVar == null || bVar.v == null || (range = (Range) bVar.v.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) == null) {
            return null;
        }
        return new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()};
    }

    @Override // com.ss.android.ttvecamera.g
    public final float[] l() {
        b bVar;
        o.b("TECamera2", "getVFOV...");
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        } else if (K() && (bVar = this.f61517i) != null) {
            return bVar.u();
        } else {
            o.d("TECamera2", "getFOV : camera is null.");
            this.q.a(-439, "getFOV : camera is null.");
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean p() {
        b bVar;
        Boolean bool;
        o.a("TECamera2", "isAutoExposureLockSupported...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore isAutoExposureLockSupported operation.");
            return false;
        } else if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "isAutoExposureLockSupported : camera is null.");
            this.q.a(-439, "isAutoExposureLockSupported : camera is null.");
            return false;
        } else if (Build.VERSION.SDK_INT >= 23 && (bool = (Boolean) this.f61517i.t.get(CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE)) != null) {
            return bool.booleanValue();
        } else {
            return false;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final boolean s() {
        b bVar;
        if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.c("TECamera2", "Query torch info failed, you must open camera first.");
            this.q.a(-439, "Query torch info failed, you must open camera first.");
            return false;
        } else if (this.f61509a == null) {
            o.d("TECamera2", "DeviceProxy is null!");
            this.q.a(-417, "");
            return false;
        } else {
            Bundle bundle = this.B.get(this.o.F);
            if (bundle == null) {
                return false;
            }
            return bundle.getBoolean("camera_torch_supported", false);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void y() {
        if (!K()) {
            o.d("TECamera2", "Device is not ready.");
            return;
        }
        b bVar = this.f61517i;
        if (bVar != null && bVar.w != null && Build.VERSION.SDK_INT >= 28) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                bVar.w.abortCaptures();
            } catch (Exception e2) {
                o.d("TECameraModeBase", "abort session failed, e: " + e2.getMessage());
            }
            o.a("TECameraModeBase", "abort session...consume = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final float z() {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore getManualFocusAbility operation.");
            return -1.0f;
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "getManualFocusAbility : camera is null.");
            this.q.a(-439, "getManualFocusAbility : camera is null.");
            return -1.0f;
        } else {
            if (bVar.v == null || bVar.w == null) {
                bVar.y.a(-435, -435, "Capture Session is null");
            }
            float floatValue = ((Float) bVar.t.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)).floatValue();
            if (floatValue >= 0.0f) {
                return floatValue;
            }
            bVar.y.a(-435, -435, "can not get manual focus ability");
            return -1.0f;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.g
    public final Bundle t() {
        ArrayList<? extends Parcelable> arrayList;
        Bundle t = super.t();
        t.putParcelableArrayList("support_preview_sizes", (ArrayList) m.a(((StreamConfigurationMap) this.f61517i.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)));
        t.putParcelableArrayList("support_picture_sizes", (ArrayList) m.a(((StreamConfigurationMap) this.f61517i.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256)));
        Range[] rangeArr = (Range[]) this.f61517i.t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        boolean z = false;
        if (rangeArr == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(rangeArr.length);
            for (Range range : rangeArr) {
                arrayList.add(new TEFrameRateRange(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()));
            }
        }
        t.putParcelableArrayList("camera_support_fps_range", arrayList);
        if (com.ss.android.ttvecamera.g.e.d(this.f61517i.t) && Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        t.putBoolean("device_support_multicamera_zoom", z);
        return t;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.g
    public final void u() {
        if (H()) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            CameraManager cameraManager = this.f61513e;
            if (cameraManager != null) {
                try {
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    for (String str : cameraIdList) {
                        CameraCharacteristics cameraCharacteristics = this.f61513e.getCameraCharacteristics(str);
                        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 : iArr) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                            for (Integer num : com.ss.android.ttvecamera.c.a.f61456d.keySet()) {
                                a.EnumC1339a aVar = com.ss.android.ttvecamera.c.a.f61456d.get(num);
                                if (aVar != null) {
                                    if (hashMap.get(aVar) == null) {
                                        hashMap.put(aVar, new HashMap());
                                    }
                                    ((Map) hashMap.get(aVar)).put(str, Boolean.valueOf(arrayList.contains(num)));
                                }
                            }
                        }
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            Range<Integer>[] highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                            if (highSpeedVideoFpsRanges.length != 0) {
                                if (hashMap.get(a.EnumC1339a.HIGH_SPEED_VIDEO_FPS_RANGE) == null) {
                                    hashMap.put(a.EnumC1339a.HIGH_SPEED_VIDEO_FPS_RANGE, new HashMap());
                                }
                                ((Map) hashMap.get(a.EnumC1339a.HIGH_SPEED_VIDEO_FPS_RANGE)).put(str, Arrays.toString(highSpeedVideoFpsRanges));
                            }
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                            if (hashMap.get(a.EnumC1339a.PREVIEW_SIZE) == null) {
                                hashMap.put(a.EnumC1339a.PREVIEW_SIZE, new HashMap());
                            }
                            ((Map) hashMap.get(a.EnumC1339a.PREVIEW_SIZE)).put(str, Arrays.toString(outputSizes));
                        }
                        Object[] objArr = (Object[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        if (hashMap.get(a.EnumC1339a.FPS_RANGE) == null) {
                            hashMap.put(a.EnumC1339a.FPS_RANGE, new HashMap());
                        }
                        ((Map) hashMap.get(a.EnumC1339a.FPS_RANGE)).put(str, Arrays.toString(objArr));
                        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                        if (hashMap.get(a.EnumC1339a.SUPPORT_APERTURES) == null) {
                            hashMap.put(a.EnumC1339a.SUPPORT_APERTURES, new HashMap());
                        }
                        ((Map) hashMap.get(a.EnumC1339a.SUPPORT_APERTURES)).put(str, Arrays.toString(fArr));
                    }
                } catch (CameraAccessException e2) {
                    o.d("TECamera2", "Could not initialize Camera Cache");
                    e2.printStackTrace();
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                a.EnumC1339a aVar2 = (a.EnumC1339a) entry.getKey();
                this.E.a(new a.b(aVar2, this.E.a(aVar2), entry.getValue().toString()));
            }
            this.E.a();
            o.a("TECamera2", "collectCameraCapabilities consume: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a() {
        if (!K() || this.t == null) {
            o.d("TECamera2", "startCapture, Device is not ready.");
        } else if (this.f61510b == 2 || this.f61510b == 3) {
            try {
                this.o.f61803f = i();
                o.a("TECamera2", "Camera rotation = " + this.o.f61803f);
            } catch (Exception e2) {
                h.a(e2);
                c(this.D);
                if (this.q != null) {
                    this.q.a(this.o.f61800c, -425);
                }
            }
            I();
        } else {
            o.d("TECamera2", "startCapture, Invalid state: " + this.f61510b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ttvecamera.g
    public final void d(boolean z) {
        b bVar = this.f61517i;
        if (bVar == null) {
            o.d("TECamera2", "enableMulticamZoom failed, mode is null...");
        } else {
            bVar.b(z);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(int i2) {
        super.a(i2);
        b bVar = this.f61517i;
        if (bVar == null) {
            o.d("TECamera2", "set scene failed, no mode...");
        } else {
            bVar.c(i2);
        }
    }

    private static int a(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return -408;
        }
        if (reason == 2) {
            return -409;
        }
        if (reason == 3) {
            return -410;
        }
        if (reason == 4 || reason == 5) {
            return -406;
        }
        return -401;
    }

    public final void f(int i2) {
        if (this.f61510b == i2) {
            o.c("TECamera2", "No need update state: ".concat(String.valueOf(i2)));
            return;
        }
        o.a("TECamera2", "[updateSessionState]: " + this.f61510b + " -> " + i2);
        this.f61510b = i2;
    }

    /* access modifiers changed from: protected */
    public final void c(PrivacyCert privacyCert) {
        try {
            this.f61517i.o();
            this.f61517i.b();
            if (this.f61514f != null) {
                this.q.a(108, 0, "will close camera2");
                f.a(privacyCert, this.f61514f);
                this.q.a(109, 0, "did close camera2");
                this.q.a(110, 0, "reset closePrivacy");
                this.f61514f = null;
                this.q.a(this);
            }
        } catch (Throwable th) {
            o.d("TECamera2", th.getMessage());
        }
        f(0);
        this.f61511c = null;
        this.f61512d = null;
        this.D = null;
        if (this.f61517i != null && this.o.z == 2) {
            ((com.ss.android.ttvecamera.a.b) this.f61517i).c();
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void d(int i2) {
        b bVar;
        o.b("TECamera2", "switchFlashMode: ".concat(String.valueOf(i2)));
        int i3 = 0;
        if (this.f61510b == 1) {
            b bVar2 = this.f61517i;
            if (bVar2 == null || !(bVar2 instanceof com.ss.android.ttvecamera.b.a)) {
                o.d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
                o.c("TECamera2", "Camera is opening, ignore toggleTorch operation.");
                g.a aVar = this.q;
                if (i2 != 0) {
                    i3 = 1;
                }
                aVar.d(i3, "Camera is opening, ignore toggleTorch operation.");
                return;
            }
            ((com.ss.android.ttvecamera.b.a) bVar2).d(i2);
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            o.d("TECamera2", "switch flash mode  failed, you must open camera first.");
            g.a aVar2 = this.q;
            if (i2 != 0) {
                i3 = 1;
            }
            aVar2.d(i3, "switch flash mode  failed, you must open camera first.");
            this.q.a(-439, "switch flash mode  failed, you must open camera first.");
        } else {
            bVar.b(i2);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(float f2) {
        b bVar;
        o.b("TECamera2", "setAperture : ".concat(String.valueOf(f2)));
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setAperture operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.c("TECamera2", "setAperture : camera is null.");
            this.q.a(-439, "setAperture : camera is null.");
        } else {
            if (bVar.v == null || bVar.w == null) {
                bVar.y.a(-432, -432, "Capture Session is null");
            }
            if (bVar.t().length == 1) {
                if (!Arrays.asList(bVar.t()).contains(Float.valueOf(f2))) {
                    bVar.y.a(-432, -432, "invalid aperture");
                    return;
                }
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.v.set(CaptureRequest.LENS_APERTURE, Float.valueOf(f2));
            b.a d2 = bVar.d(bVar.v);
            if (!d2.f61543a) {
                o.d("TECameraModeBase", "setAperture exception: " + d2.f61544b);
                bVar.y.a(-432, -432, d2.f61544b);
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void c(int i2) {
        b bVar;
        o.a("TECamera2", "setExposureCompensation... value: ".concat(String.valueOf(i2)));
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setExposureCompensation operation.");
        } else if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "setExposureCompensation : camera is null.");
            this.q.a(-439, "setExposureCompensation : camera is null.");
        } else if (!this.o.H.a()) {
            o.c("TECamera2", "Current camera doesn't support setting exposure compensation.");
            this.q.a(-414, -414, "Current camera doesn't support setting exposure compensation.");
        } else if (i2 > this.o.H.f61823a || i2 < this.o.H.f61825c) {
            String str = "Invalid exposure compensation value: " + i2 + ", it must between [" + this.o.H.f61825c + ", " + this.o.H.f61823a + "].";
            o.c("TECamera2", str);
            this.q.a(-415, -415, str);
        } else {
            b bVar2 = this.f61517i;
            if (bVar2.v == null || bVar2.w == null) {
                bVar2.y.a(-100, "setExposureCompensation : Capture Session is null");
                return;
            }
            try {
                Integer num = (Integer) bVar2.v.get(CaptureRequest.CONTROL_AE_MODE);
                if (num != null && num.intValue() == 0) {
                    o.c("TECameraModeBase", "Can't set exposure compensation when ae mode is off.");
                } else if (bVar2.A.H.f61824b == i2) {
                    o.a("TECameraModeBase", "setExposureCompensation return, no need to set");
                } else {
                    bVar2.v.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i2));
                    bVar2.A.H.f61824b = i2;
                    bVar2.d(bVar2.v);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                bVar2.y.a(-413, -413, e2.toString());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void e(int i2) {
        b bVar;
        o.b("TECamera2", "setISO : ".concat(String.valueOf(i2)));
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setISO operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.c("TECamera2", "setISO : camera is null.");
            this.q.a(-439, "setISO : camera is null.");
        } else {
            if (bVar.v == null || bVar.w == null) {
                bVar.y.a(-430, -430, "Capture Session is null");
            }
            if (i2 > bVar.q()[1] || i2 < bVar.q()[0]) {
                bVar.y.a(-430, -430, "invalid iso");
                return;
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_AE_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_AE_MODE, 0);
            }
            if (!((Integer) bVar.v.get(CaptureRequest.CONTROL_MODE)).equals(0)) {
                bVar.v.set(CaptureRequest.CONTROL_MODE, 0);
            }
            bVar.v.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i2));
            b.a d2 = bVar.d(bVar.v);
            if (!d2.f61543a) {
                o.d("TECameraModeBase", "setISO exception: " + d2.f61544b);
                bVar.y.a(-430, -430, d2.f61544b);
            }
        }
    }

    private int d(PrivacyCert privacyCert) {
        Handler handler;
        int i2;
        if (this.f61513e == null) {
            CameraManager cameraManager = (CameraManager) a(this.s, "camera");
            this.f61513e = cameraManager;
            if (cameraManager == null) {
                return -407;
            }
        }
        if (this.o.z == 0) {
            x();
        } else if (this.o.z == 1) {
            com.ss.android.ttvecamera.b.a aVar = new com.ss.android.ttvecamera.b.a(this, this.s, this.f61513e, this.r);
            this.f61517i = aVar;
            aVar.a(this.z);
        } else {
            this.f61517i = new com.ss.android.ttvecamera.a.b(this, this.s, this.f61513e, this.r);
            this.q.a(117, 0, "enable arcore");
        }
        if (this.o.f61809l) {
            handler = this.f61517i.x();
        } else {
            handler = this.r;
        }
        b bVar = this.f61517i;
        if (bVar instanceof com.ss.android.ttvecamera.a.b) {
            ((com.ss.android.ttvecamera.a.b) bVar).a(this.s, handler);
        }
        this.o.F = this.f61517i.a(this.o.f61802e);
        if (this.o.F == null) {
            o.d("TECamera2", "Invalid CameraID");
            return -405;
        }
        b bVar2 = this.f61517i;
        String str = this.o.F;
        if (this.f61516h) {
            i2 = this.o.B;
        } else {
            i2 = 0;
        }
        int a2 = bVar2.a(str, i2);
        if (a2 != 0) {
            return a2;
        }
        t();
        com.ss.android.ttvecamera.g.e eVar = this.f61509a;
        if (eVar != null) {
            eVar.a(this.o.f61800c, this.f61513e);
        }
        u();
        this.q.a(1, 0, "TECamera2 features is ready");
        if (this.o.f61809l) {
            try {
                this.f61514f = null;
                f.a(privacyCert, this.f61513e, this.o.F, this.f61521m, handler);
                this.q.a(111, 0, "use sync mode openPrivacy");
                if (this.f61514f == null) {
                    E();
                }
            } catch (CameraAccessException e2) {
                int a3 = a(e2);
                e2.printStackTrace();
                F();
                return a3;
            }
        } else {
            try {
                this.q.a(106, 0, "will start camera2");
                f.a(privacyCert, this.f61513e, this.o.F, this.f61521m, handler);
                this.q.a(111, 0, "normal openPrivacy");
            } catch (CameraAccessException e3) {
                int a4 = a(e3);
                e3.printStackTrace();
                return a4;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(int i2) {
        Handler handler;
        if (this.f61510b != 3) {
            o.c("TECamera2", "Invalid state: " + this.f61510b);
        } else if (this.f61517i != null) {
            J();
            if (i2 == 0) {
                x();
            } else if (i2 == 1) {
                com.ss.android.ttvecamera.b.a aVar = new com.ss.android.ttvecamera.b.a(this, this.s, this.f61513e, this.r);
                this.f61517i = aVar;
                aVar.a(this.z);
            } else {
                this.f61517i = new com.ss.android.ttvecamera.a.b(this, this.s, this.f61513e, this.r);
            }
            if (this.o.f61809l) {
                handler = this.f61517i.x();
            } else {
                handler = this.r;
            }
            b bVar = this.f61517i;
            if (bVar instanceof com.ss.android.ttvecamera.a.b) {
                ((com.ss.android.ttvecamera.a.b) bVar).a(this.s, handler);
            }
            try {
                this.o.F = this.f61517i.a(this.o.f61802e);
                if (this.o.F == null || this.f61517i.a(this.o.F, this.o.B) != 0) {
                    return;
                }
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            }
            this.f61517i.a(this.f61514f);
            I();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ttvecamera.g
    public final void c(boolean z) {
        b bVar;
        o.b("TECamera2", "toggleTorch: ".concat(String.valueOf(z)));
        if (this.f61510b == 1) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is opening, ignore toggleTorch operation");
            o.b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
            this.q.d(z, "Camera is opening, ignore toggleTorch operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: camera is null");
            o.c("TECamera2", "Toggle torch failed, you must open camera first.");
            this.q.a(-439, "Toggle torch failed, you must open camera first.");
            this.q.d(z ? 1 : 0, "Toggle torch failed, you must open camera first.");
        } else {
            bVar.a(z);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(PrivacyCert privacyCert) {
        o.b("TECamera2", "close...");
        if (this.f61510b != 1) {
            c(privacyCert);
            b bVar = this.f61517i;
            if (bVar != null && bVar.S != null) {
                int i2 = Build.VERSION.SDK_INT;
                bVar.S.quitSafely();
                bVar.S = null;
                bVar.T = null;
                o.a("TECameraModeBase", "releaseCameraThread");
            }
        } else if (this.f61519k) {
            this.f61518j = true;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(boolean z) {
        b bVar;
        o.a("TECamera2", "setAutoFocusLock...");
        if (this.f61510b == 1) {
            o.c("TECamera2", "Camera is opening, ignore setAutoFocusLock operation.");
        } else if (!K() || (bVar = this.f61517i) == null || bVar.t == null) {
            o.d("TECamera2", "setAutoFocusLock : camera is null.");
            this.q.a(-439, "setAutoFocusLock : camera is null.");
        } else if (Build.VERSION.SDK_INT < 21) {
            o.c("TECamera2", "Current camera doesn't support auto focus lock.");
            this.q.a(-433, -433, "Current camera doesn't support auto focus lock.");
        } else {
            b bVar2 = this.f61517i;
            if (bVar2.v == null || bVar2.w == null) {
                bVar2.y.a(-100, "setAutoFocusLock : Capture Session is null");
                return;
            }
            try {
                bVar2.v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                bVar2.d(bVar2.v);
            } catch (Exception e2) {
                e2.printStackTrace();
                bVar2.y.a(-434, -434, e2.toString());
            }
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void a(float f2) {
        b bVar;
        if (this.f61510b == 1) {
            o.b("TECamera2", "Camera is opening, ignore setManualFocusDistance operation.");
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "setManualFocusDistance : camera is null.");
            this.q.a(-439, "setManualFocusDistance : camera is null.");
        } else {
            if (bVar.v == null || bVar.w == null) {
                bVar.y.a(-436, -436, "Capture Session is null");
            }
            if (f2 < 0.0f) {
                bVar.y.a(-436, -436, "invalid distance");
                return;
            }
            bVar.v.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(f2));
            b.a d2 = bVar.d(bVar.v);
            if (!d2.f61543a) {
                o.d("TECameraModeBase", "setManualFocusDistance exception: " + d2.f61544b);
                bVar.y.a(-430, -430, d2.f61544b);
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
    public final void a(int i2, int i3) {
        b bVar = this.f61517i;
        if (bVar == null) {
            o.d("TECamera2", "set picture size failed, no mode...");
        } else {
            bVar.a(i2, i3);
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final void b(float f2, l.p pVar) {
        b bVar;
        if (this.f61510b != 3) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: session is not running");
            this.q.a(-420, "Invalid state, state = " + this.f61510b);
        } else if (!K() || (bVar = this.f61517i) == null) {
            o.d("TECamera2", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: camera is null");
            this.q.a(-439, "zoomV2 : Camera is null.");
        } else {
            bVar.b(f2, pVar);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1966);
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
                    MethodCollector.o(1966);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ttvecamera.g
    public final int a(l lVar, PrivacyCert privacyCert) {
        super.a(lVar, privacyCert);
        this.D = privacyCert;
        this.o = lVar;
        if (this.f61510b == 4) {
            c(privacyCert);
        }
        try {
            f(1);
            int d2 = d(privacyCert);
            this.v = lVar.f61802e;
            o.a("TECamera2", "open: camera face = " + this.v);
            if (d2 != 0) {
                f(0);
                c(privacyCert);
                if (this.q == null) {
                    return -1;
                }
                this.q.a(lVar.f61800c, d2);
                return -1;
            }
            this.f61519k = lVar.N;
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            int i2 = -401;
            if (e2 instanceof CameraAccessException) {
                i2 = a((CameraAccessException) e2);
            } else if (e2 instanceof IllegalArgumentException) {
                i2 = -405;
            }
            this.f61510b = 4;
            c(privacyCert);
            if (this.q != null) {
                this.q.a(lVar.f61800c, i2);
            }
            return i2;
        }
    }

    @Override // com.ss.android.ttvecamera.g
    public final TEFrameSizei a(float f2, TEFrameSizei tEFrameSizei) {
        if (this.f61510b == 0 || this.f61510b == 1) {
            o.d("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.f61517i.t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (tEFrameSizei != null) {
            return m.a(arrayList, tEFrameSizei);
        }
        return m.a(arrayList, f2);
    }

    public e(int i2, Context context, g.a aVar, Handler handler, g.c cVar) {
        super(context, aVar, handler, cVar);
        this.o = new l(context, i2);
        this.f61509a = com.ss.android.ttvecamera.g.e.a(context, i2);
    }

    public static e a(int i2, Context context, g.a aVar, Handler handler, g.c cVar) {
        if (i2 == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new e(3, context, aVar, handler, cVar);
            }
        } else if (i2 == 4) {
            return new e(4, context, aVar, handler, cVar);
        } else {
            if (i2 == 6) {
                return new e(6, context, aVar, handler, cVar);
            }
            if (i2 == 8) {
                if (Build.VERSION.SDK_INT >= 21) {
                    return new e(8, context, aVar, handler, cVar);
                }
            } else if (i2 == 9) {
                return new com.ss.android.ttvecamera.f.a(9, context, aVar, handler, cVar);
            }
        }
        return new e(i2, context, aVar, handler, cVar);
    }
}
