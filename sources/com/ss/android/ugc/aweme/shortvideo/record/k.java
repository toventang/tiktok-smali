package com.ss.android.ugc.aweme.shortvideo.record;

import android.os.Build;
import android.view.SurfaceHolder;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.am;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.cn.a.a;
import com.ss.android.ugc.aweme.cn.a.b;
import com.ss.android.ugc.aweme.cn.a.e;
import com.ss.android.ugc.aweme.cn.a.f;
import com.ss.android.ugc.aweme.cn.g;
import com.ss.android.ugc.aweme.cn.h;
import com.ss.android.ugc.aweme.cn.i;
import com.ss.android.ugc.aweme.cn.j;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.tools.c;
import h.z;
import java.util.HashMap;
import java.util.List;

public class k<T extends d> extends u<T> implements d {
    private boolean aa = true;
    private boolean ab;
    private j ac;
    private b ad;
    private com.ss.android.ugc.aweme.cn.a.d ae;
    private f af;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f130121b = true;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f130122c;

    /* renamed from: d  reason: collision with root package name */
    public a f130123d;

    /* renamed from: e  reason: collision with root package name */
    public e f130124e;

    static {
        Covode.recordClassIndex(85368);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final void a() {
        this.aa = true;
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final f c() {
        return this.af;
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final com.ss.android.ugc.aweme.cn.a.d d() {
        return this.ae;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(boolean z, l.a aVar, PrivacyCert privacyCert) {
        String obj;
        StringBuilder append = new StringBuilder("enable: ").append(z).append(", arConfig: ");
        if (aVar == null) {
            obj = "null";
        } else {
            obj = aVar.toString();
        }
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_SWITCH_AR_MODE", append.append(obj).append(", policyPlaceHolder: ").append(privacyCert).toString());
        super.a(z, aVar, privacyCert);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final boolean b() {
        return this.H.c();
    }

    @Override // com.bytedance.als.j
    public void onPause() {
        super.onPause();
        aD();
        if (!this.O.D) {
            return;
        }
        if (b()) {
            this.f130123d.b();
        } else {
            b(true, (PrivacyCert) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onResume() {
        super.onResume();
        if (!this.O.D) {
            return;
        }
        if (b()) {
            this.f130123d.a();
        } else {
            a(true, (PrivacyCert) null, false);
        }
    }

    @Override // com.bytedance.als.j
    public void onStart() {
        super.onStart();
        if (this.O.D) {
            return;
        }
        if (b()) {
            this.f130123d.a();
        } else {
            a(true, (PrivacyCert) null, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void as() {
        MethodCollector.i(6502);
        TEMonitorInvoker.nativeReset();
        ay();
        aC();
        getLifecycle().a(this.z);
        this.w.a(new l(this));
        if (this.O.f130133c) {
            this.w.getCameraController().a(new m(this));
        }
        aO();
        MethodCollector.o(6502);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public void at() {
        PrivacyCert b2 = this.H.d().b();
        if (b()) {
            this.f130124e.a(this.M, b2);
        } else {
            this.z.a(this.M, b2);
        }
        this.p.a(z.f158842a);
        c.f149151f.a("CameraLogicComponent => surfaceDestroyed, stopPreviewAsync called()");
        this.w.a(this.M, o.f130128a);
        av();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void av() {
        PrivacyCert c2 = this.H.d().c();
        if (b()) {
            this.f130124e.b(this.M, c2);
        } else {
            this.w.b(c2);
        }
        this.w.j();
        this.w.b();
        this.w.b(this.Z);
        this.G = false;
        this.f130162g.b(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void au() {
        PrivacyCert b2 = this.H.d().b();
        if (b()) {
            this.f130124e.a(this.M, b2);
        } else {
            this.z.a(this.M, b2);
        }
        this.p.a(z.f158842a);
        c.f149151f.d("CameraLogicComponent => surfaceDestroyed");
        c.f149151f.b("stopPreviewAsync called()");
        this.w.a(this.M, p.f130129a);
        av();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public void aw() {
        c.f149151f.a("CameraLogicComponent => surfaceCreated");
        this.w.a(this.Z);
        aH();
        aJ();
        this.w.a(this.v, Build.DEVICE, q.f130130a);
        if (this.f130121b) {
            this.f130121b = false;
            if (this.f130122c) {
                aB();
            }
        } else if (b()) {
            this.f130124e.a(this.H.d().a());
        } else {
            this.z.a(this.H.d().a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void ar() {
        if (b()) {
            HashMap hashMap = new HashMap();
            hashMap.put("type_activity_lifecycle", new g(com.ss.android.ugc.aweme.cn.f.DISALLOW_OPEN_CAMERA, com.ss.android.ugc.aweme.cn.k.DISALLOW_OPEN_MIC));
            hashMap.put("type_surface_view", new g(com.ss.android.ugc.aweme.cn.f.ALLOW_OPEN_CAMERA, com.ss.android.ugc.aweme.cn.k.ALLOW_OPEN_MIC));
            hashMap.put("type_scene_cover", new g(com.ss.android.ugc.aweme.cn.f.ALLOW_OPEN_CAMERA, com.ss.android.ugc.aweme.cn.k.ALLOW_OPEN_MIC));
            hashMap.put("type_first_open_camera", new g(com.ss.android.ugc.aweme.cn.f.ALLOW_OPEN_CAMERA, com.ss.android.ugc.aweme.cn.k.ALLOW_OPEN_MIC));
            hashMap.put("type_ui_operation", new g(com.ss.android.ugc.aweme.cn.f.ALLOW_OPEN_CAMERA, com.ss.android.ugc.aweme.cn.k.ALLOW_OPEN_MIC));
            this.f130123d = new a();
            this.f130124e = new e();
            this.ad = new b();
            this.ae = new com.ss.android.ugc.aweme.cn.a.d();
            this.af = new f();
            j jVar = new j(hashMap, new com.ss.android.ugc.aweme.cn.c(this));
            this.ac = jVar;
            jVar.a(this.f130123d);
            this.ac.a(this.f130124e);
            this.ac.a(this.ad);
            this.ac.a(this.ae);
            this.ac.a(this.af);
        }
    }

    @Override // com.bytedance.als.j
    public void onStop() {
        super.onStop();
        if (!this.O.D) {
            if (b()) {
                this.f130123d.b();
            } else {
                b(true, (PrivacyCert) null);
            }
        }
        if (this.N) {
            c.f149151f.a("CameraLogicComponent => release camera in onStop");
            PrivacyCert e2 = this.H.d().e();
            if (b()) {
                a aVar = this.f130123d;
                boolean z = this.M;
                aVar.a(new i(aVar.f71198a, new h(2, 2), new com.ss.android.ugc.aweme.cn.d("action_name_release_camera", e2, new com.ss.android.ugc.aweme.cn.e(false, z, false, null, null, false, null, false, 253))));
            } else {
                this.z.a(this.M, e2);
            }
        }
        if (this.f130121b) {
            PrivacyCert d2 = this.H.d().d();
            if (b()) {
                a aVar2 = this.f130123d;
                boolean z2 = this.M;
                aVar2.a(new i(aVar2.f71198a, new h(2, 2), new com.ss.android.ugc.aweme.cn.d("action_name_close_camera", d2, new com.ss.android.ugc.aweme.cn.e(false, z2, false, null, null, false, null, false, 253))));
            } else {
                this.w.b(d2);
            }
            this.f130121b = false;
        }
        if (G() != null && this.O.N) {
            G().setVisibility(8);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public void a(PrivacyCert privacyCert) {
        a(false, privacyCert, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public void c(int i2) {
        MethodCollector.i(6619);
        if (G().getVisibility() == 8) {
            MethodCollector.o(6619);
            return;
        }
        aG();
        this.f130122c = true;
        if (!(this.D == null && this.v == null)) {
            aB();
        }
        ASCameraView aSCameraView = this.w;
        com.ss.android.ugc.asve.recorder.g gVar = this.S;
        h.f.b.l.d(gVar, "");
        com.ss.android.ugc.asve.recorder.f onFrameAvailableListenerDispatcher = aSCameraView.getOnFrameAvailableListenerDispatcher();
        h.f.b.l.d(gVar, "");
        synchronized (onFrameAvailableListenerDispatcher) {
            try {
                if (onFrameAvailableListenerDispatcher.f62298a.isEmpty()) {
                    if (onFrameAvailableListenerDispatcher.f62300c) {
                        onFrameAvailableListenerDispatcher.f62299b.c().a(onFrameAvailableListenerDispatcher);
                    } else {
                        onFrameAvailableListenerDispatcher.f62299b.a(onFrameAvailableListenerDispatcher);
                    }
                }
                if (!onFrameAvailableListenerDispatcher.f62298a.contains(gVar)) {
                    onFrameAvailableListenerDispatcher.f62298a.add(gVar);
                }
            } finally {
                MethodCollector.o(6619);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void e(boolean z) {
        int i2;
        if (b()) {
            this.z.f129991e.b(z);
            this.af.a(z ? 1 : 0);
        } else {
            this.z.f129991e.a(z);
        }
        if (Y()) {
            this.f130168m.a(Integer.valueOf(!z ? 1 : 0));
        }
        if (Q() != 0) {
            a(0);
        }
        com.bytedance.als.k kVar = this.f130167l;
        if (z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        kVar.a(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public void a(SurfaceHolder surfaceHolder) {
        c.f149151f.a("CameraLogicComponent => surfaceCreated");
        if (!this.f130121b || !this.O.f130143m) {
            this.w.a(this.Z);
        }
        aH();
        aJ();
        this.D = surfaceHolder;
        if (!this.f130121b || !this.O.f130143m) {
            this.w.a(aU(), Build.DEVICE, n.f130127a);
        } else {
            this.w.a(aU());
        }
        if (this.f130121b) {
            this.f130121b = false;
            if (this.f130122c) {
                aB();
            }
        } else if (this.O.D) {
        } else {
            if (b()) {
                this.f130124e.a(this.H.d().a());
            } else {
                this.z.a(this.H.d().a());
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final void a(List<String> list) {
        j jVar = this.ac;
        h.f.b.l.d(list, "");
        c.f149151f.d("qilan: SensitiveApiManagement: reset SensitiveApiContext: contextTypes: ".concat(String.valueOf(list.toString())));
        for (T t : list) {
            if (jVar.a((String) t)) {
                g gVar = jVar.f71236b.get(t);
                if (gVar != null) {
                    jVar.f71235a.put(t, gVar);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public void c(boolean z, PrivacyCert privacyCert) {
        b(false, privacyCert);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final void a(boolean z, PrivacyCert privacyCert) {
        a(z, privacyCert, false);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final void b(boolean z, PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_STOP_PREVIEW", "fromLifecycle: " + z + ", isStoppedFromLifecycle: " + this.aa + ", policyPlaceholder: " + privacyCert);
        c.f149151f.d(com.a.a("%s stopPreview fromLifecycle: %b isStoppedFromLifecycle: %b", new Object[]{"CameraLogicComponent", Boolean.valueOf(z), Boolean.valueOf(this.aa)}));
        if (this.aa) {
            if (!z || this.O.D || this.O.N) {
                this.z.a(this.M, privacyCert);
            }
            if (G() != null && !this.O.N) {
                G().setVisibility(8);
            }
            this.aa = z;
            this.r.b((Object) false);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(PrivacyCert privacyCert, String str) {
        int g2 = this.z.g();
        if (g2 == 0) {
            com.ss.android.ugc.aweme.tools.g a2 = com.ss.android.ugc.aweme.tools.g.a();
            a2.f140199b = false;
            if (b()) {
                this.af.a(a2, privacyCert, str);
            } else {
                a(a2, privacyCert, str);
            }
        } else if (g2 == 1) {
            com.ss.android.ugc.aweme.tools.g b2 = com.ss.android.ugc.aweme.tools.g.b();
            b2.f140199b = false;
            if (b()) {
                this.af.a(b2, privacyCert, str);
            } else {
                a(b2, privacyCert, str);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.d
    public final void a(PrivacyCert privacyCert, boolean z) {
        b bVar = this.ad;
        bVar.a(new i(bVar.f71199a, new h(0, 0), new com.ss.android.ugc.aweme.cn.d("action_name_start_preview", privacyCert, new com.ss.android.ugc.aweme.cn.e(false, false, z, null, null, false, null, false, 250))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Integer num, Integer num2, String str) {
        if (num.intValue() == 1050) {
            aT();
        }
        this.q.b(new am(num, num2, str));
        return z.f158842a;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public int a(com.ss.android.ugc.aweme.tools.g gVar, PrivacyCert privacyCert, String str) {
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_SWITCH_CAMERA", "ev: " + gVar + ", policyPlaceholder: " + privacyCert + ", enterMethod: " + str);
        return super.a(gVar, privacyCert, str);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final int a(boolean z, PrivacyCert privacyCert, String str) {
        com.ss.android.ugc.aweme.tools.g a2;
        if (N() == 1) {
            a2 = com.ss.android.ugc.aweme.tools.g.b();
        } else {
            a2 = com.ss.android.ugc.aweme.tools.g.a();
        }
        a2.f140199b = z;
        if (b()) {
            this.af.a(a2, privacyCert, str);
            return 0;
        }
        a(a2, privacyCert, str);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (r7.O.D != false) goto L_0x00a9;
     */
    @Override // com.bytedance.creativex.recorder.b.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r8, com.bytedance.bpea.basics.PrivacyCert r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.record.k.a(boolean, com.bytedance.bpea.basics.PrivacyCert, boolean):void");
    }

    public k(com.bytedance.o.f fVar, CameraComponentModel cameraComponentModel, ar arVar, com.ss.android.ugc.aweme.shortvideo.ui.a.a.b bVar, com.ss.android.ugc.aweme.shortvideo.ui.a.a.a aVar, androidx.core.g.a<r> aVar2, g gVar) {
        super(fVar, cameraComponentModel, arVar, bVar, aVar, aVar2, gVar);
    }
}
