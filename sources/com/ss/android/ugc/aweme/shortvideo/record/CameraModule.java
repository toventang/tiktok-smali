package com.ss.android.ugc.aweme.shortvideo.record;

import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.o;
import com.ss.android.medialib.camera.b;
import com.ss.android.ugc.asve.recorder.camera.a.b;
import com.ss.android.ugc.asve.recorder.camera.e;
import com.ss.android.ugc.asve.recorder.camera.f;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.i.g;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CameraModule implements f, au {

    /* renamed from: i  reason: collision with root package name */
    public static SparseIntArray f129986i;

    /* renamed from: a  reason: collision with root package name */
    final d f129987a;

    /* renamed from: b  reason: collision with root package name */
    public final a f129988b;

    /* renamed from: c  reason: collision with root package name */
    public g f129989c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f129990d;

    /* renamed from: e  reason: collision with root package name */
    public b f129991e;

    /* renamed from: f  reason: collision with root package name */
    public ASCameraView f129992f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f129993g;

    /* renamed from: h  reason: collision with root package name */
    public int f129994h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f129995j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.f f129996k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f129997l;

    /* renamed from: m  reason: collision with root package name */
    private h f129998m;
    private Handler n;
    private boolean o;
    private boolean p;
    private boolean q;
    private com.ss.android.medialib.presenter.b r = new com.ss.android.medialib.presenter.b() {
        /* class com.ss.android.ugc.aweme.shortvideo.record.CameraModule.AnonymousClass4 */

        static {
            Covode.recordClassIndex(85311);
        }

        @Override // com.ss.android.medialib.presenter.b
        public final void a(int i2, int i3) {
            CameraModule.this.f129988b.a(i2, i3);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(85312);
        }

        void a();

        void a(int i2);

        void a(int i2, float f2, boolean z);

        void a(int i2, int i3);

        void a(int i2, int i3, String str);

        void a(int i2, boolean z, boolean z2, float f2, List<Integer> list);

        void a(long j2, String str, String str2, String str3);

        void b();

        void b(int i2);

        void b(int i2, int i3, String str);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
        a(0);
    }

    public final com.ss.android.ugc.asve.recorder.camera.c.b a() {
        return this.f129992f.getCameraController().e();
    }

    public final boolean b() {
        if (g() == 1) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.f129992f.e();
        c();
    }

    public final void c() {
        this.f129995j = false;
        this.f129990d = false;
        com.ss.android.ugc.asve.recorder.a aVar = this.f129992f.f62345d;
        if (aVar == null) {
            l.a("recorder");
        }
        aVar.c().m();
    }

    public final int g() {
        Integer num = this.f129997l;
        if (num == null) {
            return this.f129989c.a();
        }
        int a2 = this.f129989c.a(num.intValue());
        this.f129997l = null;
        this.f129989c.b(a2);
        return a2;
    }

    public final void h() {
        com.bytedance.als.g<Boolean> n2 = this.f129996k.n();
        if (n2.a() != null && !n2.a().booleanValue()) {
            this.f129996k.a(true);
        }
    }

    static {
        Covode.recordClassIndex(85307);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f129986i = sparseIntArray;
        sparseIntArray.put(0, 2131232561);
        f129986i.put(1, 2131232563);
        f129986i.put(2, 2131232563);
        f129986i.put(3, 2131232559);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        int i2 = this.f129994h;
        if (i2 != 0) {
            if (i2 == 1 && !this.f129992f.d() && !this.p) {
                this.p = true;
                j.a.a(this.f129987a, (int) R.string.a96, 1).a();
            }
        } else if (!this.f129992f.d() && !this.q) {
            this.q = true;
            j.a.a(this.f129987a, (int) R.string.a96, 1).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        com.ss.android.ugc.asve.recorder.a aVar = this.f129992f.f62345d;
        if (aVar == null) {
            l.a("recorder");
        }
        if (aVar.c().o()) {
            return false;
        }
        if (!this.f129995j) {
            j.a.a(this.f129987a, (int) R.string.hf5, 1).a();
            this.f129995j = true;
        }
        return true;
    }

    public final synchronized void i() {
        MethodCollector.i(6097);
        com.ss.android.ugc.asve.recorder.a aVar = this.f129992f.f62345d;
        if (aVar == null) {
            l.a("recorder");
        }
        aVar.c().a(false);
        MethodCollector.o(6097);
    }

    public final void a(int i2) {
        this.f129992f.a(i2);
    }

    public final void b(int i2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f129992f.f62345d;
        if (aVar == null) {
            l.a("recorder");
        }
        aVar.c().c(i2);
    }

    private void b(PrivacyCert privacyCert) {
        boolean z;
        boolean z2;
        int frontCameraPos;
        this.f129992f.c();
        this.f129992f.setCameraPreviewSizeInterface(this.r);
        this.f129992f.a(this);
        boolean z3 = true;
        if (this.f129992f.getCameraController().j() == 3) {
            z = true;
        } else {
            z = false;
        }
        c.f149151f.a("CameraModule initCamera cameraAlreadyOpened:".concat(String.valueOf(z)));
        if (g() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ASCameraView aSCameraView = this.f129992f;
        if (z2) {
            frontCameraPos = aSCameraView.getBackCameraPos();
        } else {
            frontCameraPos = aSCameraView.getFrontCameraPos();
        }
        b bVar = this.f129991e;
        if (!z2 && !this.f129998m.f130112d) {
            z3 = false;
        }
        bVar.d(z3);
        c.f149151f.a("CameraModule => open camera");
        a(frontCameraPos, new com.ss.android.medialib.camera.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.CameraModule.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85308);
            }

            @Override // com.ss.android.medialib.camera.a
            public final void a(int i2) {
                c.f149151f.a("CameraModule => onOpenSuccess");
                CameraModule.this.f129994h = i2;
                int g2 = CameraModule.this.g();
                CameraModule.this.f129989c.b(g2);
                CameraModule.this.f129988b.a(g2);
                ASCameraView aSCameraView = CameraModule.this.f129992f;
                boolean booleanValue = CameraModule.this.f129993g.booleanValue();
                com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
                if (aVar == null) {
                    l.a("recorder");
                }
                aVar.f().b(booleanValue);
                CameraModule.this.h();
            }

            @Override // com.ss.android.medialib.camera.a
            public final void a(int i2, int i3, String str) {
                CameraModule.this.f129988b.a(i2, i3, str);
                CameraModule.this.h();
            }
        }, privacyCert);
    }

    public final void a(PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_INIT_CAMERA", "policyPlaceholder: ".concat(String.valueOf(privacyCert)));
        b(privacyCert);
    }

    private void b(boolean z, PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.recorder.a aVar = this.f129992f.f62345d;
        if (aVar == null) {
            l.a("recorder");
        }
        aVar.c().a(z, privacyCert);
    }

    public final int a(PrivacyCert privacyCert, final String str) {
        boolean z;
        int frontCameraPos;
        g gVar = this.f129989c;
        gVar.b(gVar.a() ^ 1);
        if (g() == 0) {
            z = true;
        } else {
            z = false;
        }
        ASCameraView aSCameraView = this.f129992f;
        if (z) {
            frontCameraPos = aSCameraView.getBackCameraPos();
        } else {
            frontCameraPos = aSCameraView.getFrontCameraPos();
        }
        b bVar = this.f129991e;
        boolean z2 = !z;
        if (!bVar.f62205g.a() || !bVar.a() || Build.VERSION.SDK_INT < 23) {
            if (bVar.a() && Build.VERSION.SDK_INT >= 23) {
                if (z2) {
                    bVar.f62204f.b(false);
                } else {
                    bVar.f62204f.b(b.a(bVar.f62202d));
                }
            }
        } else if (z2) {
            bVar.f62204f.b(false);
            c.f149151f.a("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(false)");
        } else {
            bVar.f62204f.b(true);
            c.f149151f.a("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(true)");
        }
        try {
            final o a2 = o.a();
            ASCameraView aSCameraView2 = this.f129992f;
            AnonymousClass2 r1 = new com.ss.android.medialib.camera.a() {
                /* class com.ss.android.ugc.aweme.shortvideo.record.CameraModule.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(85309);
                }

                @Override // com.ss.android.medialib.camera.a
                public final void a(int i2) {
                    String str;
                    String str2;
                    if (a2.f53699a) {
                        a2.c();
                    }
                    int g2 = CameraModule.this.g();
                    CameraModule.this.f129994h = i2;
                    CameraModule.this.f129989c.b(g2);
                    CameraModule.this.f129992f.setPreviewSizeRatio((((float) CameraModule.this.f129992f.getCameraPreviewWidth()) * 1.0f) / ((float) CameraModule.this.f129992f.getCameraPreviewHeight()));
                    CameraModule.this.f129988b.b(g2);
                    a aVar = CameraModule.this.f129988b;
                    long a2 = a2.a(TimeUnit.MILLISECONDS);
                    if (i2 == 1) {
                        str = "camera1";
                    } else if (i2 == 2) {
                        str = "camera2";
                    } else if (i2 == 3) {
                        str = "xiaomicamera";
                    } else if (i2 != 4) {
                        str = "";
                    } else {
                        str = "oppocamera";
                    }
                    if (g2 == 0) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    aVar.a(a2, str, str2, str);
                    CameraModule.this.h();
                }

                @Override // com.ss.android.medialib.camera.a
                public final void a(int i2, int i3, String str) {
                    a2.d();
                    CameraModule.this.h();
                    CameraModule.this.f129988b.b(i2, i3, str);
                }
            };
            com.ss.android.ugc.asve.recorder.a aVar = aSCameraView2.f62345d;
            if (aVar == null) {
                l.a("recorder");
            }
            aVar.c().b(frontCameraPos, r1, privacyCert);
        } catch (Exception unused) {
        }
        ASCameraView aSCameraView3 = this.f129992f;
        AnonymousClass3 r12 = new b.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.CameraModule.AnonymousClass3 */

            static {
                Covode.recordClassIndex(85310);
            }

            @Override // com.ss.android.medialib.camera.b.a
            public final void a() {
                CameraModule.this.f129988b.b();
                com.ss.android.ugc.asve.recorder.a aVar = CameraModule.this.f129992f.f62345d;
                if (aVar == null) {
                    l.a("recorder");
                }
                aVar.c().b(this);
            }
        };
        com.ss.android.ugc.asve.recorder.a aVar2 = aSCameraView3.f62345d;
        if (aVar2 == null) {
            l.a("recorder");
        }
        aVar2.c().a(r12);
        return frontCameraPos;
    }

    public final void a(boolean z, PrivacyCert privacyCert) {
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_RELEASE_CAMERA", "async: " + z + ", policyPlaceholder: " + privacyCert);
        c.f149151f.d("camera release");
        a(0);
        b(z, privacyCert);
        this.f129992f.setCameraPreviewSizeInterface(null);
        this.f129992f.b(this);
        if (!this.o) {
            return;
        }
        if (this.f129998m.f130111c) {
            this.f129992f.d((PrivacyCert) null);
        } else {
            this.f129992f.a(false, (PrivacyCert) null);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.f
    public final void a(int i2, float f2, boolean z) {
        this.f129988b.a(i2, f2, z);
    }

    private void a(int i2, com.ss.android.medialib.camera.a aVar, PrivacyCert privacyCert) {
        this.f129988b.a();
        if (this.f129998m.f130110b.invoke().booleanValue()) {
            c.f149151f.d("CameraModule => forbid open camera in background");
        } else {
            this.f129992f.a(i2, aVar, privacyCert);
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.f
    public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
        this.f129988b.a(i2, z, z2, f2, list);
    }

    public CameraModule(d dVar, g gVar, a aVar, ASCameraView aSCameraView, com.bytedance.creativex.recorder.b.a.f fVar, Integer num, int i2, boolean z, h hVar, boolean z2, e eVar) {
        this.f129987a = dVar;
        this.f129989c = gVar;
        this.f129992f = aSCameraView;
        this.f129988b = aVar;
        this.f129996k = fVar;
        this.f129997l = num;
        this.f129993g = Boolean.valueOf(z);
        this.f129998m = hVar;
        this.n = new SafeHandler(dVar);
        this.o = z2;
        this.f129991e = new com.ss.android.ugc.asve.recorder.camera.a.b(dVar, aSCameraView.getCameraController(), i2, hVar.f130112d, eVar);
    }
}
