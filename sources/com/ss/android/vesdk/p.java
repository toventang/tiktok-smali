package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.g;
import com.ss.android.ttve.monitor.h;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.a;
import com.ss.android.ttvecamera.a.a;
import com.ss.android.ttvecamera.h;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.j.b;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.o;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.b.a;
import com.ss.android.vesdk.d.b;
import com.ss.android.vesdk.d.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class p implements TECameraCapture.a, l.n, l.p, a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f151366a = p.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    protected VECameraSettings f151367b;

    /* renamed from: c  reason: collision with root package name */
    protected l f151368c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f151369d;

    /* renamed from: e  reason: collision with root package name */
    protected VESize f151370e = new VESize(1280, 720);

    /* renamed from: f  reason: collision with root package name */
    protected VESize f151371f = null;

    /* renamed from: g  reason: collision with root package name */
    protected ax.k f151372g;

    /* renamed from: h  reason: collision with root package name */
    protected ax.r f151373h;

    /* renamed from: i  reason: collision with root package name */
    protected VEListener.k f151374i;

    /* renamed from: j  reason: collision with root package name */
    protected VEListener.ad f151375j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicBoolean f151376k = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    public b f151377l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f151378m;
    public boolean n = false;
    public long o = 0;
    public l.g p = new l.g() {
        /* class com.ss.android.vesdk.p.AnonymousClass7 */

        static {
            Covode.recordClassIndex(99556);
        }
    };
    public l.h q = new l.h() {
        /* class com.ss.android.vesdk.p.AnonymousClass8 */

        static {
            Covode.recordClassIndex(99557);
        }

        @Override // com.ss.android.ttvecamera.l.h
        public final void a(int[] iArr) {
        }
    };
    public TECameraCapture.c r = new TECameraCapture.c() {
        /* class com.ss.android.vesdk.p.AnonymousClass3 */

        static {
            Covode.recordClassIndex(99552);
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.c
        public final TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (p.this.f151375j == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei : list) {
                arrayList.add(new VESize(tEFrameSizei.f61374a, tEFrameSizei.f61375b));
            }
            for (TEFrameSizei tEFrameSizei2 : list2) {
                arrayList2.add(new VESize(tEFrameSizei2.f61374a, tEFrameSizei2.f61375b));
            }
            VESize a2 = p.this.f151375j.a();
            if (a2 == null) {
                return null;
            }
            TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
            tEFrameSizei3.f61374a = a2.width;
            tEFrameSizei3.f61375b = a2.height;
            return tEFrameSizei3;
        }
    };
    public l.m s = new l.m() {
        /* class com.ss.android.vesdk.p.AnonymousClass4 */

        static {
            Covode.recordClassIndex(99553);
        }
    };
    private a<b> t;
    private TECameraCapture u = new TECameraCapture(this, this.r);
    private int v = -1;
    private int w = -1;
    private boolean x = true;
    private final Object y = new Object();
    private b.a z = new b.AbstractC1342b() {
        /* class com.ss.android.vesdk.p.AnonymousClass2 */

        static {
            Covode.recordClassIndex(99551);
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            com.ss.android.vesdk.d.b bVar = p.this.f151377l;
            if (bVar != null && bVar.f151254e != null) {
                bVar.f151254e.onNewSurfaceTexture(surfaceTexture);
            }
        }

        @Override // com.ss.android.ttvecamera.j.b.AbstractC1342b
        public final void a(SurfaceTexture surfaceTexture) {
            com.ss.android.vesdk.d.b bVar = p.this.f151377l;
            if (bVar != null && bVar.f151254e != null && (bVar.f151254e instanceof b.AbstractC4059b)) {
                ((b.AbstractC4059b) bVar.f151254e).a(surfaceTexture, true);
            }
        }

        @Override // com.ss.android.ttvecamera.j.b.AbstractC1342b
        public final void a(Object obj) {
            com.ss.android.vesdk.d.b bVar = p.this.f151377l;
            if (bVar != null && bVar.f151254e != null && (bVar.f151254e instanceof b.AbstractC4059b)) {
                ((b.AbstractC4059b) bVar.f151254e).a(obj);
            }
        }

        @Override // com.ss.android.ttvecamera.j.b.a
        public final void onFrameCaptured(i iVar) {
            com.ss.android.vesdk.d.b bVar = p.this.f151377l;
            if (p.this.f151367b.x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && (p.this.f151367b.f150740l.ordinal() != iVar.f61568c.f61594h || p.this.n || !p.this.f151376k.get())) {
                an.a(p.f151366a, "getCameraFacing:" + p.this.f151367b.f150740l.ordinal() + "  frameFacing:" + iVar.f61568c.f61594h + " mSwitchCamera:" + p.this.n + " mIsConnected:" + p.this.f151376k.get());
                if (p.this.n) {
                    p.this.n = false;
                }
            } else if (!(bVar == null || bVar.f151254e == null)) {
                bVar.f151258i = !p.this.f151378m;
                bVar.f151254e.onFrameCaptured(iVar);
            }
            if (!p.this.f151378m) {
                long currentTimeMillis = System.currentTimeMillis() - p.this.o;
                VEListener.k kVar = p.this.f151374i;
                if (kVar != null) {
                    kVar.a(3, 0, "Camera first frame captured");
                }
                p.this.f151378m = true;
                an.a(p.f151366a, "Camera first frame captured，consume: ".concat(String.valueOf(currentTimeMillis)));
                h.a(0, "te_record_camera_preview_first_frame_cost", currentTimeMillis);
                Long.valueOf(currentTimeMillis);
            }
        }
    };

    @Override // com.ss.android.vesdk.b.b
    public final VESize f() {
        return this.f151370e;
    }

    public final void a(l.a aVar, PrivacyCert privacyCert) {
        if (!this.f151376k.get()) {
            an.d(f151366a, "Camera server is not connected now!!");
            return;
        }
        l a2 = a(this.f151367b);
        if (a2.f61800c == 1) {
            an.d(f151366a, "click to switch ar camera failed, not support camera type");
            return;
        }
        int cameraState = this.u.getCameraState();
        if (cameraState != 3) {
            an.d(f151366a, "click to switch ar camera, camera state = ".concat(String.valueOf(cameraState)));
        }
        this.w = 1;
        if (a2.f61800c != 2) {
            a2.f61800c = 2;
        }
        a2.z = 2;
        a2.at = aVar;
        a2.f61809l = true;
        a2.J = true;
        a.C1337a.f61390a.a(this.f151369d, a2);
        a(a2);
        this.u.switchCamera(a2, privacyCert);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_camera_arcore", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.vesdk.b.b
    public final int a(a<com.ss.android.vesdk.d.b> aVar) {
        this.t = aVar;
        if (aVar == null || aVar.b()) {
            an.d(f151366a, "start with empty TECapturePipeline list");
            return -100;
        }
        an.b(f151366a, "start with TECapturePipeline list");
        bi.a("start");
        int b2 = b();
        bi.b();
        return b2;
    }

    @Override // com.ss.android.vesdk.b.a
    public final int a(boolean z2) {
        return a(z2, (PrivacyCert) null);
    }

    public final int a(boolean z2, PrivacyCert privacyCert) {
        bi.a("close");
        this.f151376k.set(false);
        q();
        int disConnect = this.u.disConnect(!z2, privacyCert);
        bi.b();
        return disConnect;
    }

    public final int a(VECameraSettings vECameraSettings, PrivacyCert privacyCert) {
        com.ss.android.medialib.log.a.f59740b = System.currentTimeMillis();
        this.f151367b = vECameraSettings;
        this.f151368c = a(vECameraSettings);
        this.n = true;
        if (this.f151367b.M || this.f151367b.a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB) {
            h();
        }
        int switchCamera = this.u.switchCamera(this.f151368c, privacyCert);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", vECameraSettings.f150740l.name());
            jSONObject.put("resultCode", switchCamera);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_change_camera", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return switchCamera;
    }

    public final int a(final ac acVar) {
        n nVar;
        if (acVar == null) {
            nVar = null;
        } else {
            nVar = new n(acVar.f150901a, acVar.f150902b, acVar.f150903c, acVar.f150904d, acVar.f150905e);
            nVar.f61848g = acVar.f150906f;
            nVar.f61849h = acVar.f150907g;
            nVar.f61850i = acVar.f150908h;
            nVar.f61851j = acVar.f150909i;
            if (acVar.f150910j != null) {
                nVar.f61852k = new a.AbstractC1336a() {
                    /* class com.ss.android.vesdk.p.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(99558);
                    }

                    @Override // com.ss.android.ttvecamera.a.AbstractC1336a
                    public final List<Camera.Area> a() {
                        return acVar.f150910j.a();
                    }
                };
            }
            if (acVar.f150911k != null) {
                nVar.f61853l = new a.b() {
                    /* class com.ss.android.vesdk.p.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(99549);
                    }

                    @Override // com.ss.android.ttvecamera.a.b
                    public final List<Camera.Area> a() {
                        return acVar.f150911k.a();
                    }
                };
            }
            if (acVar.f150912l != null) {
                nVar.f61854m = new n.a() {
                    /* class com.ss.android.vesdk.p.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(99550);
                    }

                    @Override // com.ss.android.ttvecamera.n.a
                    public final void a(int i2, int i3, String str) {
                        acVar.f150912l.a(i2, i3);
                    }
                };
            }
        }
        return this.u.focusAtPoint(nVar);
    }

    public final void a(ax.k kVar) {
        this.f151372g = kVar;
    }

    public final void a(ax.r rVar) {
        this.f151373h = rVar;
        TECameraCapture tECameraCapture = this.u;
        if (tECameraCapture != null) {
            tECameraCapture.setSATZoomCallback(this.s);
        }
    }

    public final float[] a(l.e eVar) {
        return this.u.getFOV(eVar);
    }

    public final void a(Bundle bundle) {
        this.u.setFeatureParameters(bundle);
    }

    public final Bundle a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("device_support_wide_angle_mode", m());
        bundle.putInt("device_support_antishake_mode", n());
        bundle.putInt("device_support_ai_night_video", o());
        bundle.putBoolean("device_support_multicamera_zoom", p());
        this.u.getCameraAllFeatures(context, bundle);
        return bundle;
    }

    public final void a(int i2) {
        this.u.setExposureCompensation(i2);
    }

    public final int[] a(l.h hVar) {
        return this.u.getISORange(hVar);
    }

    @Override // com.ss.android.vesdk.b.a
    public final int a() {
        return a((PrivacyCert) null);
    }

    public final float e() {
        return this.u.queryShaderZoomAbility(this);
    }

    public final int g() {
        return this.u.getCameraState();
    }

    public final l.d i() {
        return this.u.getCameraECInfo();
    }

    public final boolean j() {
        return this.u.isSupportedExposureCompensation();
    }

    static {
        Covode.recordClassIndex(99547);
    }

    @Override // com.ss.android.vesdk.b.a
    public final int c() {
        bi.a("stopPreview");
        int stop = this.u.stop();
        bi.b();
        return stop;
    }

    @Override // com.ss.android.ttvecamera.l.p
    public boolean enableSmooth() {
        ax.k kVar = this.f151372g;
        if (kVar == null || !kVar.a()) {
            return false;
        }
        return true;
    }

    public final void h() {
        an.b(f151366a, "newSurfaceTexture...");
        this.w = 1;
    }

    public final void k() {
        an.a(f151366a, "onBackGround");
        this.u.changeAppLifeCycle(true);
    }

    public final void l() {
        an.a(f151366a, "onForeGround");
        this.u.changeAppLifeCycle(false);
    }

    private static int m() {
        return ((Integer) u.a().a("ve_camera_wide_angle", (Object) -1)).intValue();
    }

    private static int n() {
        return ((Integer) u.a().a("ve_camera_stablization", (Object) -1)).intValue();
    }

    private static int o() {
        return ((Integer) u.a().a("ve_camera_ai_augmentation", (Object) 0)).intValue();
    }

    private static boolean p() {
        return ((Boolean) u.a().a("ve_support_camera_multicam_zoom", (Object) false)).booleanValue();
    }

    private static void q() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_RELEASE);
    }

    private static void r() {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_USING);
    }

    @Override // com.ss.android.vesdk.b.a
    public final void d() {
        bi.a("destroy");
        this.f151372g = null;
        this.s = null;
        this.f151373h = null;
        this.f151374i = null;
        this.f151369d = null;
        this.r = null;
        l lVar = this.f151368c;
        if (lVar != null) {
            lVar.a();
            this.f151368c = null;
        }
        TECameraCapture.registerLogOutput(an.f150933a, null);
        TECameraCapture.registerException(null);
        bi.b();
    }

    @Override // com.ss.android.vesdk.b.a
    public final int b() {
        int i2;
        b.a aVar;
        c.a aVar2;
        a<com.ss.android.vesdk.d.b> aVar3 = this.t;
        if (aVar3 == null || aVar3.b()) {
            an.d(f151366a, "startPreview with empty TECapturePipeline list");
            return -100;
        } else if (!this.f151376k.get()) {
            an.c(f151366a, "startPreview when camera is closed!");
            return -105;
        } else {
            bi.a("startPreview");
            boolean equals = "landscape".equals(this.f151367b.n);
            boolean z2 = false;
            for (com.ss.android.vesdk.d.b bVar : this.t.c()) {
                if (bVar == null || !bVar.b()) {
                    an.c(f151366a, "pipeline is not valid");
                } else {
                    if (bVar.f151255f) {
                        aVar = this.z;
                        this.f151377l = bVar;
                    } else {
                        aVar = bVar.f151254e;
                    }
                    if (bVar.f151252c == i.b.PIXEL_FORMAT_Recorder) {
                        com.ss.android.vesdk.d.c cVar = (com.ss.android.vesdk.d.c) bVar;
                        if (this.w == 1 && !this.x) {
                            cVar.a().release();
                            cVar.a(new com.ss.android.vesdk.e.a(cVar.f151260b));
                            if (this.w == 1) {
                                this.w = 0;
                            }
                        }
                        aVar2 = new c.a(cVar.f151253d, aVar, cVar.f151255f, cVar.a(), cVar.f151260b, cVar.f151259a);
                    } else if (bVar.f151252c == i.b.PIXEL_FORMAT_OpenGL_OES) {
                        d dVar = (d) bVar;
                        if (this.w == 1 && !this.x) {
                            dVar.f151262b.release();
                            com.ss.android.vesdk.e.a aVar4 = new com.ss.android.vesdk.e.a(dVar.f151261a);
                            dVar.f151262b = aVar4;
                            if (aVar != null) {
                                aVar.onNewSurfaceTexture(aVar4);
                            }
                            if (this.w == 1) {
                                this.w = 0;
                            }
                            o.a(f151366a, "NewSurfaceTexture...");
                        }
                        aVar2 = new c.a(dVar.f151253d, aVar, dVar.f151255f, dVar.f151262b, dVar.f151261a);
                    } else {
                        com.ss.android.vesdk.d.a aVar5 = (com.ss.android.vesdk.d.a) bVar;
                        aVar2 = new c.a(aVar5.f151253d, aVar, aVar5.f151255f, aVar5.f151250a, aVar5.f151252c, aVar5.f151251b);
                    }
                    this.u.addCameraProvider(aVar2);
                    bVar.f151256g = equals;
                    z2 = true;
                }
            }
            if (z2) {
                i2 = this.u.start();
            } else {
                i2 = -1;
            }
            bi.b();
            return i2;
        }
    }

    public final void a(VEListener.k kVar) {
        this.f151374i = kVar;
    }

    public final int b(float f2) {
        return this.u.zoomV2(f2, this);
    }

    public final int a(float f2) {
        return this.u.startZoom(f2, this);
    }

    public final int b(boolean z2) {
        return this.u.queryZoomAbility(this, z2);
    }

    @Override // com.ss.android.ttvecamera.TECameraCapture.a
    public void onCaptureStopped(int i2) {
        VEListener.k kVar = this.f151374i;
        if (kVar != null) {
            kVar.a(5, i2, "Camera is closed!");
        }
    }

    private static void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a(str, jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void b(PrivacyCert privacyCert) {
        if (!this.f151376k.get()) {
            an.d(f151366a, "Camera server is not connected now!!");
            return;
        }
        int cameraState = this.u.getCameraState();
        if (cameraState != 3) {
            an.d(f151366a, "click to switch normal camera, camera state = ".concat(String.valueOf(cameraState)));
        }
        this.f151368c.J = true;
        a(this.f151368c);
        this.w = 1;
        this.u.switchCamera(this.f151368c, privacyCert);
    }

    private void a(l lVar) {
        MethodCollector.i(3752);
        int cameraState = this.u.getCameraState();
        boolean z2 = false;
        if (cameraState != 3) {
            boolean z3 = lVar.J;
            lVar.J = false;
            z2 = z3;
        }
        o.d(f151366a, "tryWaitSwitchTask, state: ".concat(String.valueOf(cameraState)));
        if (z2) {
            synchronized (this.y) {
                int i2 = 10;
                while (true) {
                    try {
                        TECameraCapture tECameraCapture = this.u;
                        if (tECameraCapture != null && tECameraCapture.getCameraState() != 3 && i2 > 0) {
                            i2--;
                            try {
                                this.y.wait(100);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            o.c(f151366a, "wait switch task, to mode: " + lVar.z + ", try block...count:" + i2);
                        }
                    } finally {
                        MethodCollector.o(3752);
                    }
                }
            }
            return;
        }
        MethodCollector.o(3752);
    }

    private l a(VECameraSettings vECameraSettings) {
        boolean z2;
        if (vECameraSettings == null) {
            return null;
        }
        l lVar = new l(this.f151369d);
        vECameraSettings.m();
        lVar.f61800c = vECameraSettings.a().ordinal();
        lVar.f61802e = vECameraSettings.f150740l.ordinal();
        lVar.G = vECameraSettings.f150741m;
        lVar.B = vECameraSettings.f150736h.ordinal();
        lVar.p.f61374a = vECameraSettings.f150734f.height;
        lVar.p.f61375b = vECameraSettings.f150734f.width;
        lVar.K = vECameraSettings.f150733e;
        lVar.R = vECameraSettings.o;
        lVar.x = vECameraSettings.s;
        lVar.t = vECameraSettings.t;
        lVar.z = vECameraSettings.z.ordinal();
        this.f151370e.width = lVar.p.f61374a;
        this.f151370e.height = lVar.p.f61375b;
        lVar.I = vECameraSettings.y;
        lVar.f61807j = vECameraSettings.C;
        lVar.u = vECameraSettings.i();
        lVar.v = vECameraSettings.j();
        lVar.w = vECameraSettings.J;
        lVar.L = vECameraSettings.o().ordinal();
        lVar.C = vECameraSettings.K;
        lVar.ad = vECameraSettings.L.ordinal();
        lVar.D = vECameraSettings.v;
        m.f61830a = lVar.D;
        lVar.M = vECameraSettings.p();
        lVar.N = vECameraSettings.q();
        lVar.O = vECameraSettings.r();
        lVar.P = vECameraSettings.s();
        lVar.Q = vECameraSettings.t();
        lVar.U = vECameraSettings.u();
        lVar.V = vECameraSettings.v();
        lVar.W = vECameraSettings.g();
        lVar.X = vECameraSettings.h();
        lVar.f61808k = vECameraSettings.D;
        lVar.f61809l = vECameraSettings.A;
        lVar.n = vECameraSettings.k();
        lVar.o = vECameraSettings.B;
        lVar.f61810m = vECameraSettings.n();
        if (vECameraSettings.a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB) {
            Bundle bundle = lVar.C;
            if (vECameraSettings.f150740l == VECameraSettings.CAMERA_FACING_ID.FACING_BACK) {
                z2 = true;
            } else {
                z2 = false;
            }
            bundle.putBoolean("enable_video_stabilization", z2);
        }
        if (vECameraSettings.a() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
            if (vECameraSettings.f150740l == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                lVar.C.putBoolean("enable_video_stabilization", false);
                if (!VECameraSettings.b()) {
                    an.a(f151366a, "ENABLE_VIDEO_HDR");
                    lVar.C.putBoolean("enable_video_hdr", true);
                }
            } else {
                boolean d2 = VECameraSettings.d();
                lVar.C.putBoolean("enable_video_stabilization", d2);
                if (d2 && VECameraSettings.c()) {
                    lVar.C.putString("noise_reduce", "fast");
                }
            }
        } else if (vECameraSettings.a() == VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2 && !VECameraSettings.b()) {
            an.a(f151366a, "ENABLE_VIDEO_HDR");
            lVar.C.putBoolean("enable_video_hdr", true);
        }
        if (vECameraSettings.N) {
            lVar.ae = true;
        } else {
            lVar.ae = ((Boolean) u.a().a("ve_camera_enable_previewing_fallback", Boolean.valueOf(lVar.ae))).booleanValue();
        }
        String str = f151366a;
        an.b(str, "camera previewing fallback enabled: " + lVar.ae);
        if (vECameraSettings.O) {
            lVar.af = true;
        } else {
            lVar.af = ((Boolean) u.a().a("ve_enable_background_strategy", Boolean.valueOf(lVar.af))).booleanValue();
        }
        an.b(str, "KEY_ENABLE_BACKGROUND_STRATEGY : " + lVar.af);
        if (vECameraSettings.P) {
            lVar.ag = true;
        } else {
            lVar.ag = ((Boolean) u.a().a("ve_enable_open_camera1_optimize", (Object) false)).booleanValue();
        }
        an.b(str, "enable open camera1 opt : " + lVar.ag);
        if (vECameraSettings.Q) {
            lVar.ah = true;
        } else {
            lVar.ah = ((Boolean) u.a().a("ve_enable_open_camera1_crs", (Object) false)).booleanValue();
        }
        an.b(str, "enable open camera1 crs : " + lVar.ah);
        lVar.T = ((Boolean) u.a().a("ve_enable_new_create_capture_session", (Object) false)).booleanValue();
        an.b(str, "createInternalSettings, enable new create capture session = " + lVar.T);
        lVar.Y = vECameraSettings.G;
        lVar.Z = vECameraSettings.H;
        lVar.aa = vECameraSettings.I;
        int[] f2 = vECameraSettings.f();
        lVar.f61801d = new TEFrameRateRange(f2[0], f2[1]);
        lVar.aj = vECameraSettings.S;
        lVar.al = vECameraSettings.T;
        lVar.C.putBoolean("ve_enable_camera_devices_cache", ((Boolean) u.a().a("ve_enable_camera_devices_cache", (Object) false)).booleanValue());
        lVar.am = vECameraSettings.l();
        lVar.f61806i = ((Boolean) u.a().a("ve_enable_camera2_zsl_capture", (Object) false)).booleanValue();
        lVar.an = vECameraSettings.M;
        lVar.ao = ((Boolean) u.a().a("ve_enable_camera_api2_detect", (Object) false)).booleanValue();
        lVar.ap = ((Float) u.a().a("ve_camera_zoom_ratio_max", Float.valueOf(-1.0f))).floatValue();
        lVar.aq = ((Float) u.a().a("ve_camera_zoom_ratio_min", Float.valueOf(-1.0f))).floatValue();
        lVar.ak = VECameraSettings.e();
        return lVar;
    }

    public final int a(PrivacyCert privacyCert) {
        l lVar = this.f151368c;
        if (lVar == null || this.f151367b == null) {
            o.d(f151366a, "mCameraParams == null, please init VECameraCapture!");
            return -105;
        } else if (lVar.p.f61374a <= 0 || this.f151368c.p.f61375b <= 0) {
            return -100;
        } else {
            if (!this.f151376k.get()) {
                com.ss.android.medialib.log.a.f59739a = System.currentTimeMillis();
            }
            this.f151376k.set(true);
            if (this.f151368c.f61800c != this.f151367b.a().ordinal()) {
                this.f151368c = a(this.f151367b);
            }
            bi.a("open");
            r();
            int connect = this.u.connect(this.f151368c, privacyCert);
            bi.b();
            return connect;
        }
    }

    public final int a(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        int i2;
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i2 = 0;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i2 = 1;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i2 = 3;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i2 = 2;
        } else if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            return -100;
        } else {
            i2 = 4;
        }
        return this.u.switchFlashMode(i2);
    }

    @Override // com.ss.android.ttvecamera.TECameraCapture.a
    public void onError(int i2, String str) {
        VEListener.k kVar = this.f151374i;
        if (kVar != null) {
            kVar.a(i2, str);
        }
    }

    public final boolean b(Context context, VECameraSettings vECameraSettings) {
        if (vECameraSettings.a() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            boolean isARCoreSupported = this.u.isARCoreSupported(context);
            o.a(f151366a, "isARCoreSupported : ".concat(String.valueOf(isARCoreSupported)));
            return isARCoreSupported;
        }
        o.a(f151366a, "isARCoreSupported : false ");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[Catch:{ all -> 0x00d4 }] */
    @Override // com.ss.android.ttvecamera.TECameraCapture.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureStarted(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.onCaptureStarted(int, int):void");
    }

    public final int a(Context context, VECameraSettings vECameraSettings) {
        bi.a("VECameraCapture-init");
        this.f151369d = context;
        this.f151367b = vECameraSettings;
        this.f151368c = a(vECameraSettings);
        TECameraCapture.registerLogOutput(an.f150933a, new o.b() {
            /* class com.ss.android.vesdk.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99548);
            }

            @Override // com.ss.android.ttvecamera.o.b
            public final void Log(byte b2, String str, String str2) {
                TELogcat.Log(b2, str, str2);
            }
        });
        TECameraCapture.registerMonitor(new j.a() {
            /* class com.ss.android.vesdk.p.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99554);
            }

            @Override // com.ss.android.ttvecamera.j.a
            public final void a(String str, double d2) {
                h.a(0, str, d2);
            }

            @Override // com.ss.android.ttvecamera.j.a
            public final void a(String str, long j2) {
                h.a(0, str, j2);
            }

            @Override // com.ss.android.ttvecamera.j.a
            public final void a(String str, String str2) {
                h.a(0, str, str2);
            }
        });
        TECameraCapture.registerException(new h.a() {
            /* class com.ss.android.vesdk.p.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99555);
            }

            @Override // com.ss.android.ttvecamera.h.a
            public final void a(Throwable th) {
                g.a(th);
            }
        });
        bi.b();
        return 0;
    }

    @Override // com.ss.android.ttvecamera.l.p
    public void onChange(int i2, float f2, boolean z2) {
        ax.k kVar = this.f151372g;
        if (kVar != null) {
            kVar.a(i2, f2, z2);
        }
    }

    private static JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.ss.android.ttvecamera.TECameraCapture.a
    public void onInfo(int i2, int i3, String str) {
        String[] split;
        int i4;
        VEListener.k kVar = this.f151374i;
        an.b(f151366a, "onInfo, infoType = " + i2 + ", ext = " + i3 + ", msg = " + str + ", listener = " + kVar);
        if (1 == i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("device_support_wide_angle_mode", m());
            bundle.putInt("device_support_antishake_mode", n());
            bundle.putInt("device_support_ai_night_video", o());
            bundle.putBoolean("device_support_multicamera_zoom", p());
            this.u.updateAllCameraFeatures(bundle);
        }
        if (kVar != null) {
            if (i2 != 3) {
                i4 = i2;
            } else {
                i4 = 6;
            }
            kVar.a(i4, i3, str);
        }
        if (i2 == 0) {
            this.f151378m = false;
        } else if (i2 == 50) {
            if (!(str == null || (split = str.split("x")) == null || split.length != 2)) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
                com.ss.android.vesdk.d.b bVar = this.f151377l;
                if (!(bVar == null || bVar.f151254e == null)) {
                    bVar.f151254e.a(tEFrameSizei);
                }
                this.f151371f = new VESize(tEFrameSizei.f61375b, tEFrameSizei.f61374a);
            }
        } else if (i2 == 3) {
            if (i3 == 2) {
                this.o = System.currentTimeMillis();
            }
        } else if (i2 == 51) {
            this.w = 1;
        } else if (i2 == 111) {
            VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_USING);
        } else if (i2 == 110) {
            VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_RELEASE);
        }
        if (i2 == 104) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_will_change_flash_mode", a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i2 == 105) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_did_change_flash_mode", a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i2 == 106) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_will_start_camera", a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i2 == 107) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_did_start_camera", a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i2 == 108) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_will_stop_camera", a(str, String.valueOf(System.currentTimeMillis()), ""), "behavior");
        } else if (i2 == 109) {
            com.ss.android.ttve.monitor.b.a("vesdk_event_did_stop_camera", a(str, "", String.valueOf(System.currentTimeMillis())), "behavior");
        } else if (i2 == 113) {
            a("vesdk_event_camera_stablization");
        } else if (i2 == 112) {
            a("vesdk_event_camera_wide_angle");
        } else if (i2 == 114) {
            a("vesdk_event_camera_zoom");
        } else if (i2 == 115) {
            a("vesdk_event_camera_exposure_compensation");
        } else if (i2 == 116) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("flashMode", i3);
                jSONObject.put("resultCode", 0);
                com.ss.android.ttve.monitor.b.a("vesdk_event_camera_flash_mode", jSONObject, "behavior");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ttvecamera.l.p
    public void onZoomSupport(int i2, boolean z2, boolean z3, float f2, List<Integer> list) {
        ax.k kVar = this.f151372g;
        if (kVar != null) {
            kVar.a(i2, z2, z3, f2, list);
        }
    }

    public final int a(int i2, int i3, float f2, int i4, int i5) {
        return this.u.focusAtPoint(i2, i3, f2, i4, i5);
    }
}
