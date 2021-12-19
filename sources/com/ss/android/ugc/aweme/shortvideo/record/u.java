package com.ss.android.ugc.aweme.shortvideo.record;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.g.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.ad;
import com.bytedance.creativex.recorder.b.a.f;
import com.bytedance.creativex.recorder.b.a.h;
import com.bytedance.creativex.recorder.b.a.l;
import com.bytedance.creativex.recorder.b.a.y;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.am;
import com.bytedance.keva.Keva;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.asve.recorder.a;
import com.ss.android.ugc.asve.recorder.g;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.er;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.record.d;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.w;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.tools.c;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.runtime.VERuntime;
import com.zhiliaoapp.musically.R;
import h.p;
import h.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.libsdl.app.AudioRecorderInterface;

public class u<T extends f> extends j<T> implements f, com.bytedance.o.a {
    protected final CameraComponentModel A;
    protected o B;
    protected SafeHandler C;
    protected SurfaceHolder D;
    protected int E;
    protected int F;
    protected boolean G;
    protected final b H;
    long I;
    long J;
    public boolean K;
    public boolean L;
    protected boolean M;
    protected boolean N;
    protected r O;
    protected final g P;
    protected boolean Q;
    public Toast R;
    protected g S;
    public boolean T;
    public boolean U;
    public boolean V;
    protected float W;
    protected FrameLayout X;
    protected boolean Y;
    protected com.ss.android.medialib.listener.b Z;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private long aD;
    private ImageView aE;
    private Bitmap aF;
    private int aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private CameraModule.a aK;
    private List<String> aL;
    private String aM;
    private String aN;
    private List<String> aO;
    private final Handler aP;
    private final k<Boolean> aa = new k<>();
    private final k<Boolean> ab = new k<>();
    private final k<z> ac = new k<>();
    private final k<Integer> ad = new k<>();
    private final k<com.ss.android.ugc.aweme.tools.g> ae = new k<>();
    private final k<l> af;
    private final k<z> ag;
    private final k<e<Boolean, PrivacyCert>> ah;
    private i ai;
    private final com.bytedance.als.l<Double> aj;
    private final k<z> ak;
    private final k<p<Integer, Integer>> al;
    private final t<Float> am;
    private final k<z> an;
    private final k<Boolean> ao;
    private TextureView ap;
    private int aq;
    private com.ss.android.ugc.aweme.shortvideo.x.a ar;
    private d as;
    private volatile boolean at;
    private boolean au;
    private final ar av;
    private final com.ss.android.ugc.aweme.shortvideo.ui.a.a.a aw;
    private boolean ax;
    private boolean ay;
    private boolean az;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.o.f f130157b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.als.l<Boolean> f130158c = new com.bytedance.als.l<>(false);

    /* renamed from: d  reason: collision with root package name */
    private final k<z> f130159d = new k<>();

    /* renamed from: e  reason: collision with root package name */
    private final k<Integer> f130160e = new k<>();

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.als.l<Boolean> f130161f = new com.bytedance.als.l<>(false);

    /* renamed from: g  reason: collision with root package name */
    protected final com.bytedance.als.l<Boolean> f130162g = new com.bytedance.als.l<>(false);

    /* renamed from: h  reason: collision with root package name */
    public final k<com.bytedance.creativex.recorder.b.a.e> f130163h = new k<>();

    /* renamed from: i  reason: collision with root package name */
    final k<h> f130164i = new k<>();

    /* renamed from: j  reason: collision with root package name */
    protected final k<p<Integer, Float>> f130165j = new k<>();

    /* renamed from: k  reason: collision with root package name */
    public final com.bytedance.als.l<d> f130166k;

    /* renamed from: l  reason: collision with root package name */
    protected final k<Integer> f130167l;

    /* renamed from: m  reason: collision with root package name */
    protected final k<Integer> f130168m;
    protected final k<com.ss.android.ugc.aweme.tools.j> n;
    public final k<com.bytedance.creativex.recorder.b.a.k> o;
    protected final k<z> p;
    protected final k<am<Integer, Integer, String>> q;
    protected final k<Boolean> r;
    protected final k<z> s;
    protected final androidx.appcompat.app.d t;
    protected SurfaceView u;
    protected Surface v;
    public ASCameraView w;
    public VERecorderImpl x;
    public ax y;
    public CameraModule z;

    static {
        Covode.recordClassIndex(85383);
    }

    public void a(int i2, int i3, double d2) {
    }

    public void a(int i2, boolean z2, boolean z3, float f2, List<Integer> list) {
    }

    public void a(long j2) {
    }

    /* access modifiers changed from: protected */
    public void a(SurfaceHolder surfaceHolder) {
    }

    public void a(String[] strArr, double[] dArr, boolean[] zArr) {
    }

    public void aA() {
    }

    public void aE() {
    }

    public void aF() {
    }

    /* access modifiers changed from: protected */
    public void aG() {
    }

    /* access modifiers changed from: protected */
    public boolean aK() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void aM() {
    }

    public void aP() {
    }

    public void aQ() {
    }

    /* access modifiers changed from: protected */
    public void ar() {
    }

    /* access modifiers changed from: protected */
    public void as() {
    }

    /* access modifiers changed from: protected */
    public void at() {
    }

    /* access modifiers changed from: protected */
    public void aw() {
    }

    public void az() {
    }

    public void b(int i2, int i3, String str) {
    }

    /* access modifiers changed from: protected */
    public void c(int i2) {
    }

    public void e(int i2, int i3) {
    }

    public void f(int i2) {
    }

    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.h<d> A() {
        return this.f130166k;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> B() {
        return this.s;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final ASCameraView D() {
        return this.w;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final VERecorderImpl E() {
        return this.x;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final SurfaceView F() {
        return this.u;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final o H() {
        return this.B;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final i K() {
        return this.ai;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.h<Double> L() {
        return this.aj;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> M() {
        return this.ak;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean T() {
        return this.T;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean V() {
        return this.U;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean W() {
        return this.V;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> ac() {
        return this.p;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> ah() {
        return this.ag;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<l> ai() {
        return this.af;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final /* bridge */ /* synthetic */ com.bytedance.als.g aj() {
        return this.o;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean ak() {
        return this.L;
    }

    public final com.ss.android.ugc.aweme.shortvideo.x.a ax() {
        return this.ar;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final CameraComponentModel e() {
        return this.A;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final CameraModule f() {
        return this.z;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final d g() {
        return this.as;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.f130157b;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.h<Boolean> h() {
        return this.f130161f;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.h<Boolean> i() {
        return this.f130158c;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.h<Boolean> j() {
        return this.f130162g;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> k() {
        return this.f130159d;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Integer> l() {
        return this.f130160e;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<com.bytedance.creativex.recorder.b.a.e> m() {
        return this.f130163h;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Boolean> n() {
        return this.aa;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Boolean> o() {
        return this.ab;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final LiveData<Float> p() {
        return this.am;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<h> q() {
        return this.f130164i;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<z> r() {
        return this.ac;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Integer> s() {
        return this.ad;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Integer> t() {
        return this.f130168m;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Integer> u() {
        return this.f130167l;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<com.ss.android.ugc.aweme.tools.j> v() {
        return this.n;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<Boolean> w() {
        return this.r;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.bytedance.als.g<com.ss.android.ugc.aweme.tools.g> x() {
        return this.ae;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(String str) {
        this.ar.a(str);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(String str, float f2) {
        this.ar.a(str, f2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public void a(com.bytedance.creativex.recorder.filter.b.b bVar, com.bytedance.creativex.recorder.filter.b.b bVar2, float f2) {
        throw new com.ss.android.ugc.aweme.shortvideo.ui.a.b("setFilterScroll not support");
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(p<String, Float> pVar, p<String, Float> pVar2, float f2) {
        if (pVar != null && pVar2 != null) {
            this.ar.f132970a.a(pVar.getFirst(), pVar2.getFirst(), f2 < 0.0f ? Math.abs(f2) : 1.0f - f2, pVar.getSecond().floatValue(), pVar2.getSecond().floatValue());
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(i iVar) {
        this.ai = iVar;
        this.aj.b(Double.valueOf((double) iVar.value()));
        this.ak.a(z.f158842a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(e eVar) {
        if (!this.O.f130141k) {
            this.w.a(eVar.f2397a.booleanValue(), (PrivacyCert) eVar.f2398b);
        } else if (Boolean.TRUE.equals(eVar.f2397a)) {
            com.ss.android.ugc.asve.recorder.a aVar = this.w.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.b().a("record");
            c.f149151f.a("CameraLogicComponent => initAudioCapture, mode = record");
        } else {
            com.ss.android.ugc.asve.recorder.a aVar2 = this.w.f62345d;
            if (aVar2 == null) {
                h.f.b.l.a("recorder");
            }
            aVar2.b().b();
            c.f149151f.a("CameraLogicComponent => releaseAudioCapture");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bitmap bitmap, int i2) {
        this.t.runOnUiThread(new af(this, i2, bitmap));
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2, int i2, String str) {
        this.aw.b(this.t);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.aL == null) {
                this.aL = new ArrayList();
            }
            this.aL.add(str2);
            this.aN = str;
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public void a(PrivacyCert privacyCert, String str) {
        int g2 = this.z.g();
        if (g2 == 0) {
            com.ss.android.ugc.aweme.tools.g a2 = com.ss.android.ugc.aweme.tools.g.a();
            a2.f140199b = false;
            a(a2, privacyCert, str);
        } else if (g2 == 1) {
            com.ss.android.ugc.aweme.tools.g b2 = com.ss.android.ugc.aweme.tools.g.b();
            b2.f140199b = false;
            a(b2, privacyCert, str);
        }
    }

    public void a(File file, int i2) {
        aN();
        if (this.A.f124706a == 1) {
            Context applicationContext = this.t.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            com.ss.android.ugc.tools.view.widget.j.a(applicationContext, (int) R.string.h_l).a();
            this.t.finish();
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(boolean z2) {
        this.aa.a(Boolean.valueOf(z2));
    }

    public final void a(com.ss.android.ugc.aweme.tools.g gVar) {
        this.ae.a(gVar);
        if (!gVar.f140198a) {
            a(0);
            c(false);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(final boolean z2, final k<y> kVar) {
        AnonymousClass9 r2 = new ax.q() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass9 */

            static {
                Covode.recordClassIndex(85392);
            }

            @Override // com.ss.android.vesdk.ax.q
            public final void a(int i2, float f2, int i3) {
                if (i2 == 27) {
                    u.this.C.post(new ao(this, f2, z2, kVar));
                }
            }
        };
        VELumaDetectParams vELumaDetectParams = new VELumaDetectParams();
        vELumaDetectParams.algorithmFlag = 27;
        vELumaDetectParams.detectFrames = 1;
        this.y.a(vELumaDetectParams, r2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public boolean a(boolean z2, boolean z3) {
        com.ss.android.ugc.asve.recorder.camera.a.b bVar = this.z.f129991e;
        return com.ss.android.ugc.asve.recorder.camera.b.f62211b ? !z2 && !z3 && bVar.a() : bVar.f62203e == 1 ? !z2 && !z3 : bVar.f62203e == 2 ? !z2 && bVar.f62205g.a(bVar.f62202d, bVar.f62204f, 0) : bVar.f62203e == 4 && !z2 && !z3;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        CameraModule cameraModule = this.z;
        cameraModule.f129992f.getMaxCameraZoom();
        cameraModule.f129992f.getCameraZoomList();
        if (cameraModule.f129990d) {
            return true;
        }
        cameraModule.d();
        if (cameraModule.e()) {
            return true;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        ASCameraView aSCameraView = cameraModule.f129992f;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().a(currentSpan, scaleFactor);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        if (r4 != false) goto L_0x0021;
     */
    @Override // com.bytedance.creativex.recorder.b.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.tools.j r8) {
        /*
            r7 = this;
            androidx.appcompat.app.d r6 = r7.t
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r5 = r7.A
            com.ss.android.ugc.aweme.shortvideo.record.r r0 = r7.O
            boolean r4 = r0.f130139i
            com.ss.android.ugc.aweme.shortvideo.record.r r0 = r7.O
            boolean r1 = r0.f130140j
            boolean r0 = r5.c()
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
        L_0x0021:
            int r1 = r8.f140202a
            if (r1 == r2) goto L_0x0031
            r0 = 2
            if (r1 == r0) goto L_0x002e
        L_0x0028:
            com.bytedance.als.k<com.ss.android.ugc.aweme.tools.j> r0 = r7.n
            r0.a(r8)
            return
        L_0x002e:
            r5.f124717l = r2
            goto L_0x0028
        L_0x0031:
            r5.f124717l = r3
            r0 = 2131828766(0x7f11201e, float:1.9290482E38)
            com.ss.android.ugc.tools.view.widget.j r0 = com.ss.android.ugc.tools.view.widget.j.a.b(r6, r0, r2)
            r0.a()
            goto L_0x0028
        L_0x003e:
            if (r1 == 0) goto L_0x0028
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.record.u.a(com.ss.android.ugc.aweme.tools.j):void");
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(ac acVar) {
        l lVar;
        com.bytedance.creativex.recorder.b.a.k kVar;
        k<com.bytedance.creativex.recorder.b.a.k> kVar2 = this.o;
        k<l> kVar3 = this.af;
        h.f.b.l.d(acVar, "");
        h.f.b.l.d(kVar3, "");
        boolean z2 = acVar.f28172a;
        boolean z3 = acVar.f28173b;
        boolean z4 = acVar.f28174c;
        if (!z3) {
            if (!z2) {
                lVar = new l(z4, false);
            } else {
                lVar = new l(z4, true);
            }
            kVar3.a(lVar);
        } else if (kVar2 != null) {
            if (!z2) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new ad.a(kVar3, z4));
                kVar = new com.bytedance.creativex.recorder.b.a.k(alphaAnimation, false);
            } else {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(150);
                alphaAnimation2.setAnimationListener(new ad.b(kVar3, z4));
                kVar = new com.bytedance.creativex.recorder.b.a.k(alphaAnimation2, true);
            }
            kVar2.a(kVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(VEListener.j jVar) {
        h.f.a.a<Boolean> aVar = this.O.x;
        boolean z2 = aVar != null && aVar.invoke().booleanValue();
        if (this.O.f130138h || z2) {
            this.aH = true;
            this.w.getMediaController().c(new ab(this, jVar));
            return;
        }
        jVar.a(-105);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(VEListener.j jVar, int i2) {
        this.C.post(new ac(jVar, i2));
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public void a(boolean z2, l.a aVar, PrivacyCert privacyCert) {
        if (z2) {
            this.f130168m.a((Integer) 0);
            this.f130167l.a((Integer) 0);
            this.ad.a((Integer) 5);
            this.w.getCameraController().a(aVar, privacyCert);
            return;
        }
        int i2 = 3;
        this.f130168m.a(Integer.valueOf(this.z.a().a() ? 3 : 2));
        k<Integer> kVar = this.f130167l;
        if (!com.ss.android.ugc.asve.recorder.camera.a.b.a(this.t)) {
            i2 = 2;
        }
        kVar.a(Integer.valueOf(i2));
        this.f130168m.a((Integer) 1);
        this.f130167l.a((Integer) 1);
        this.ad.a((Integer) 6);
        this.w.getCameraController().c(privacyCert);
    }

    public void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2) {
        c.f149151f.a("CameraLogicComponent => OnFrameAvailable");
        this.I = System.currentTimeMillis();
        this.w.a(this.S);
        this.r.b((Boolean) true);
        if (this.at) {
            this.at = false;
            c.f149151f.a("CameraLogicComponent => addFragment Open Camera Frame Optimize");
            this.C.post(new al(this));
            com.ss.android.ugc.aweme.shortvideo.m.a.f128744a = false;
            com.ss.android.ugc.aweme.shortvideo.m.a.f128745b = false;
            if (this.O.z > 0) {
                VETaintSceneDetectParams vETaintSceneDetectParams = new VETaintSceneDetectParams();
                vETaintSceneDetectParams.detectFrequency = 1;
                vETaintSceneDetectParams.algorithmFlag = 21;
                this.y.a(vETaintSceneDetectParams, new ax.q() {
                    /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(85385);
                    }

                    /* access modifiers changed from: package-private */
                    public final /* synthetic */ void a(int i2) {
                        int i3;
                        String str;
                        if (u.this.R != null) {
                            u.this.R.cancel();
                        }
                        u uVar = u.this;
                        Context applicationContext = uVar.t.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                        if (com.ss.android.ugc.aweme.shortvideo.m.a.a(i2)) {
                            i3 = com.ss.android.ugc.aweme.shortvideo.m.b.f128747a;
                        } else {
                            i3 = com.ss.android.ugc.aweme.shortvideo.m.b.f128748b;
                        }
                        uVar.R = Toast.makeText(applicationContext, i3, 1);
                        u.this.R.setGravity(17, 0, 0);
                        Toast toast = u.this.R;
                        if (Build.VERSION.SDK_INT == 25) {
                            ic.a(toast);
                        }
                        toast.show();
                        if (com.ss.android.ugc.aweme.shortvideo.m.a.a(i2)) {
                            com.ss.android.ugc.aweme.shortvideo.m.a.f128745b = true;
                        } else {
                            com.ss.android.ugc.aweme.shortvideo.m.a.f128744a = true;
                        }
                        Keva.getRepo("tools_dirty_lens_detect").storeLong("dirty_lens_detect_last_time_" + com.ss.android.ugc.aweme.shortvideo.m.a.a(i2), System.currentTimeMillis());
                        if (com.ss.android.ugc.aweme.shortvideo.m.a.a(i2)) {
                            str = "front";
                        } else {
                            str = "rear";
                        }
                        h.f.b.l.d(str, "");
                        c.f149149d.a("dirty_camera_toast_show", new com.ss.android.ugc.tools.f.b().a("camera_type", str).f149193a);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
                        if ((java.lang.System.currentTimeMillis() - com.bytedance.keva.Keva.getRepo("tools_dirty_lens_detect").getLong("dirty_lens_detect_last_time_" + com.ss.android.ugc.aweme.shortvideo.m.a.a(r9), 0)) > 86400000) goto L_0x0088;
                     */
                    @Override // com.ss.android.vesdk.ax.q
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(int r7, float r8, int r9) {
                        /*
                        // Method dump skipped, instructions count: 154
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass2.a(int, float, int):void");
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, File file, int i2) {
        c.f149151f.a("Restore the segments" + list.size() + " dir: " + file.getPath() + "  res: " + i2);
        if (i2 != 0) {
            this.t.runOnUiThread(new ad(this, file, i2));
            com.ss.android.ugc.asve.a.a().a().c("tryRestoreAsync -> VECallListener.onDone:".concat(String.valueOf(i2)));
            com.ss.android.ugc.asve.a.a().a().c(Log.getStackTraceString(new Throwable()));
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void C() {
        this.f130159d.a(z.f158842a);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final View G() {
        SurfaceView surfaceView = this.u;
        if (surfaceView == null) {
            return this.ap;
        }
        return surfaceView;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void J() {
        this.az = false;
        this.aA = true;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final int N() {
        return this.z.g();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean O() {
        return this.z.b();
    }

    public final void aI() {
        this.t.finish();
    }

    public final void aS() {
        this.z.f129990d = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Workspace aW() {
        return this.A.f124713h;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void ab() {
        this.z.c();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final int al() {
        return this.z.f129994h;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final com.ss.android.ugc.asve.recorder.effect.a z() {
        return this.ar.f132970a;
    }

    private boolean b() {
        Bitmap bitmap = this.aF;
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void I() {
        this.ax = false;
        this.w.setExposureCompensationEnable(false);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean P() {
        return this.z.a().e();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final int Q() {
        return this.z.f129992f.getFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final int R() {
        return this.z.f129992f.getNextFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final int S() {
        return this.z.f129992f.getLastFlashMode();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean Z() {
        return this.z.a().f();
    }

    public void aH() {
        com.ss.android.ugc.asve.recorder.a aVar = this.w.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f();
    }

    public final Surface aU() {
        SurfaceHolder surfaceHolder = this.D;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurface();
        }
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void aV() {
        this.aE.setVisibility(8);
        a();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean aa() {
        return this.z.a().a();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void ae() {
        List<String> list = this.aL;
        if (list != null) {
            list.clear();
            this.aL = null;
        }
        this.aN = null;
        this.aM = null;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final long am() {
        ax axVar = this.y;
        if (axVar == null) {
            return -1;
        }
        return axVar.m();
    }

    private void a() {
        if (this.O.t) {
            if (b()) {
                this.aE.setImageResource(17170445);
                this.aF.recycle();
            }
            this.aF = null;
        }
    }

    private boolean c() {
        if (this.aG != 0 || this.A.b() || this.A.c()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean X() {
        com.ss.android.ugc.asve.recorder.a aVar = this.z.f129992f.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().e().c();
    }

    /* access modifiers changed from: protected */
    public final void aC() {
        SurfaceView surfaceView = this.u;
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
                /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(85387);
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    u.this.Q = false;
                    u.this.a(surfaceHolder);
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    u.this.Q = true;
                    u.this.at();
                }

                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                    u uVar = u.this;
                    c.f149151f.a("CameraLogicComponent => surfaceChanged format:" + i2 + " width:" + i3 + " height:" + i4);
                    uVar.w.a(surfaceHolder.getSurface());
                }
            });
        }
        TextureView textureView = this.ap;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(85388);
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    u.this.Q = true;
                    u.this.au();
                    u.this.v.release();
                    return true;
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                    u.this.d(i2, i3);
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                    u.this.Q = false;
                    if (u.this.v == null) {
                        u.this.v = new Surface(surfaceTexture);
                    }
                    u.this.aw();
                }
            });
        }
    }

    public final void aR() {
        if (this.z.g() == 1) {
            U();
        } else {
            a(2);
        }
    }

    /* access modifiers changed from: protected */
    public final void aT() {
        if (this.O.t) {
            this.C.post(new ai(this));
        }
        this.C.post(new aa(this, System.currentTimeMillis()));
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final SavePhotoStickerInfo af() {
        if (com.ss.android.ugc.tools.utils.k.a(this.aL)) {
            return null;
        }
        return new SavePhotoStickerInfo(new ArrayList(this.aL), this.aM, this.aN);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void ag() {
        if (this.aH) {
            this.aH = false;
            this.w.getMediaController().u();
        }
    }

    /* access modifiers changed from: protected */
    public final void ay() {
        this.as = new d(this.t, this.aw, new d.b() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass3 */

            static {
                Covode.recordClassIndex(85386);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.d.b
            public final void a() {
                u.this.az();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.d.b
            public final void b() {
                u.this.aA();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.d.b
            public final void a(int i2, int i3, double d2) {
                u.this.a(i2, i3, d2);
            }
        });
        this.ah.a(this, new ae(this));
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        if (this.O.f130134d == at.STAGE_ON_CREATE) {
            as();
        }
        this.f130159d.a(this, new v(this));
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void U() {
        Window window = this.t.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.W = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.X, "alpha", 0.0f, 0.5f);
        ofFloat.setDuration(25L);
        ofFloat.start();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean Y() {
        com.ss.android.ugc.asve.recorder.a aVar = this.z.f129992f.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        if (!aVar.c().e().d() || this.aC) {
            return false;
        }
        return true;
    }

    public void aL() {
        if (this.A.b()) {
            DuetContext duetContext = this.A.o;
            int i2 = this.A.o.f124727h;
            int i3 = this.A.o.f124728i;
            EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
            embaddedWindowInfo.f131103c = 0;
            embaddedWindowInfo.f131104d = 0;
            embaddedWindowInfo.f131101a = i2;
            embaddedWindowInfo.f131102b = i3;
            embaddedWindowInfo.f131105e = 0;
            embaddedWindowInfo.f131106f = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(embaddedWindowInfo);
            duetContext.f124731l = arrayList;
        }
    }

    /* access modifiers changed from: protected */
    public void au() {
        this.z.a(this.M, this.H.d().b());
        this.p.a(z.f158842a);
        c.f149151f.d("CameraLogicComponent => surfaceDestroyed");
        c.f149151f.b("stopPreviewAsync called()");
        this.w.a(this.M, ak.f130046a);
        av();
    }

    /* access modifiers changed from: protected */
    public void av() {
        this.w.b(this.H.d().c());
        this.w.j();
        this.w.b();
        this.w.b(this.Z);
        this.G = false;
        this.f130162g.b(false);
    }

    @Override // com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        this.w.a(this.S);
        this.w.setDataSourceVideoCompleteListener(null);
        this.w.setSATZoomListener(null);
        this.w.b();
        this.w.b(this.Z);
        er.f128449a = null;
        this.az = false;
        this.aA = true;
        a();
    }

    @Override // com.bytedance.als.j
    public void onResume() {
        super.onResume();
        this.J = System.currentTimeMillis();
        this.az = true;
        if (this.O.t && !c() && this.Q && b()) {
            this.aE.setVisibility(0);
        }
        this.y.f150998c = new w(this);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final Point y() {
        Point point = new Point();
        View G2 = G();
        if (G().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) G2.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void aX() {
        String f2;
        if (!this.A.d().isEmpty()) {
            File e2 = this.A.f124713h.e();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.A.d().iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                arrayList.add(new ASMediaSegment((long) timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
            }
            com.ss.android.ugc.asve.recorder.c.a mediaController = this.w.getMediaController();
            String path = e2.getPath();
            if (aK()) {
                f2 = null;
            } else {
                f2 = this.A.f();
            }
            mediaController.a(arrayList, path, f2, this.A.q, new x(this, arrayList, e2));
        }
    }

    /* access modifiers changed from: protected */
    public final void aD() {
        if (this.O.t && !c()) {
            ViewGroup.LayoutParams layoutParams = this.aE.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.u.getLayoutParams();
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.leftMargin = layoutParams4.leftMargin;
                layoutParams3.topMargin = layoutParams4.topMargin;
                layoutParams3.rightMargin = layoutParams4.rightMargin;
                layoutParams3.bottomMargin = layoutParams4.bottomMargin;
            }
            this.aE.setLayoutParams(layoutParams);
            SurfaceView surfaceView = this.u;
            int width = surfaceView.getWidth() / 2;
            int height = surfaceView.getHeight() / 2;
            ASCameraView aSCameraView = this.w;
            aj ajVar = new aj(this);
            com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.e().a(width, height, ajVar);
        }
    }

    public void aN() {
        this.ac.a(z.f158842a);
        this.A.f124713h.d();
        this.A.f124713h.f();
        for (int i2 = 0; i2 < this.A.d().size(); i2++) {
            this.w.a(z.f130188a, (h.f.a.a<z>) null);
            com.ss.android.ugc.asve.a.a().a().c(Log.getStackTraceString(new Throwable()));
        }
        this.A.d().clear();
        this.A.a(0);
    }

    public void aO() {
        com.ss.android.ugc.aweme.tools.extract.i iVar = new com.ss.android.ugc.aweme.tools.extract.i(this.t.getApplication(), this.O.r, this.w.getMediaController(), this.H.a(), this.H.b(), this.O.p, this.O.q, this.O.B, this);
        this.B = iVar;
        CameraComponentModel cameraComponentModel = this.A;
        if (cameraComponentModel != null) {
            iVar.f140076h = cameraComponentModel.D;
        }
        this.B.a(new com.ss.android.ugc.aweme.tools.extract.p() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass8 */

            static {
                Covode.recordClassIndex(85391);
            }

            @Override // com.ss.android.ugc.aweme.tools.extract.p
            public final void a() {
                u.this.aP();
            }

            @Override // com.ss.android.ugc.aweme.tools.extract.p
            public final void b() {
                u.this.aQ();
            }

            @Override // com.ss.android.ugc.aweme.tools.extract.p
            public final void a(long j2) {
                u.this.a(j2);
            }
        });
        CameraComponentModel cameraComponentModel2 = this.A;
        if (cameraComponentModel2 != null) {
            this.B.a(cameraComponentModel2.w);
        }
        this.B.d();
    }

    /* access modifiers changed from: protected */
    public final void aB() {
        c.f149151f.a("CameraLogicComponent => previewCamera");
        if (this.A.a()) {
            this.A.g();
            this.w.setMusicPath(this.A.f124713h.c());
            this.w.a(this.A.f124713h.c(), this.A.g(), this.A.h(), this.A.z);
            if (Boolean.TRUE.equals(this.O.L.invoke())) {
                this.w.g();
                this.A.f124718m = true;
            }
        }
        ASCameraView aSCameraView = this.w;
        androidx.appcompat.app.d dVar = this.t;
        AudioRecorderInterface a2 = this.as.a();
        h.f.b.l.d(dVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.f().a(dVar, a2);
        this.w.setDetectionMode(this.O.f130142l);
        ASCameraView aSCameraView2 = this.w;
        Surface aU = aU();
        String str = Build.DEVICE;
        h.f.a.b<? super Integer, z> bVar = ah.f130043a;
        h.f.b.l.d(aU, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.asve.recorder.a aVar2 = aSCameraView2.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.f().a(aU, str, bVar);
        this.f130158c.b(true);
        this.au = true;
    }

    public void aJ() {
        com.ss.android.ugc.asve.recorder.a aVar = this.w.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.a();
        ASCameraView aSCameraView = this.w;
        y yVar = new y(this);
        h.f.b.l.d(yVar, "");
        com.ss.android.ugc.asve.recorder.a aVar2 = aSCameraView.f62345d;
        if (aVar2 == null) {
            h.f.b.l.a("recorder");
        }
        aVar2.e().a(yVar);
        if (this.A.n != null) {
            ASCameraView aSCameraView2 = this.w;
            String[] matrix = this.A.n.getMatrix();
            double[] duration = this.A.n.getDuration();
            boolean[] segUseCher = this.A.n.getSegUseCher();
            com.ss.android.ugc.asve.recorder.a aVar3 = aSCameraView2.f62345d;
            if (aVar3 == null) {
                h.f.b.l.a("recorder");
            }
            aVar3.e().a(matrix, duration, segUseCher);
        }
        aL();
        aM();
        if (!this.aI) {
            return;
        }
        if ((this.A.f124706a == 2 || this.A.f124706a == 1) && !this.A.d().isEmpty()) {
            this.aI = false;
            aX();
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final String ad() {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!d(this.z.b()) || !com.ss.android.ugc.asve.recorder.camera.c.c.a(this.t)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!a(this.z.b(), false) || !com.ss.android.ugc.asve.recorder.camera.a.b.b(this.t)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f130165j.a() != null && this.f130165j.a().getFirst().intValue() == VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            z4 = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(1);
        }
        if (z3) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(2);
        }
        if (z4) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(3);
        }
        return sb.toString();
    }

    class a implements g {
        static {
            Covode.recordClassIndex(85393);
        }

        a() {
        }

        @Override // com.ss.android.vesdk.ax.j
        public final void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, long j3) {
            u.this.a(eGLContext, i2, i3, i4, i5, j2);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void b(float f2) {
        this.ar.f132970a.a(f2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void g(boolean z2) {
        this.L = z2;
    }

    private void g(int i2) {
        this.z.b(i2);
        this.ad.a(Integer.valueOf(i2));
    }

    public void d(int i2) {
        this.z.c();
        this.f130160e.a(Integer.valueOf(i2));
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final boolean d(boolean z2) {
        com.ss.android.ugc.asve.recorder.a aVar = this.z.f129992f.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        return aVar.c().e().c(z2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void f(boolean z2) {
        this.K = z2;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void b(int i2) {
        this.ad.a(Integer.valueOf(i2));
    }

    public final void c(float f2) {
        CameraModule cameraModule = this.z;
        cameraModule.f129990d = true;
        cameraModule.d();
        if (!cameraModule.e()) {
            com.ss.android.ugc.asve.recorder.a aVar = cameraModule.f129992f.f62345d;
            if (aVar == null) {
                h.f.b.l.a("recorder");
            }
            aVar.c().b(f2);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public void e(boolean z2) {
        int i2;
        this.z.f129991e.a(z2);
        if (Y()) {
            this.f130168m.a(Integer.valueOf(!z2 ? 1 : 0));
        }
        if (Q() != 0) {
            a(0);
        }
        k<Integer> kVar = this.f130167l;
        if (z2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        kVar.a(Integer.valueOf(i2));
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(float f2) {
        if (this.w.getExposureCompensationEnable() && this.w.getIsExposureSeekBarShowing()) {
            this.w.setExposureSeekBarProgress(f2);
            if (this.az && this.aA) {
                this.an.a(z.f158842a);
            }
            this.aA = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void b(PrivacyCert privacyCert) {
        int i2;
        int i3;
        com.ss.android.ugc.asve.f.f.a("ACTION_NAME_SWITCH_WIDE_CAMERA", "policyPlaceholder: ".concat(String.valueOf(privacyCert)));
        int i4 = !aa() ? 1 : 0;
        com.ss.android.ugc.asve.recorder.a aVar = this.z.f129992f.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.c().e().a(privacyCert);
        k<Integer> kVar = this.f130168m;
        if (i4 != 0) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        kVar.a(Integer.valueOf(i2));
        if (Y()) {
            this.f130167l.a(Integer.valueOf(i4 ^ 1));
        }
        if (X()) {
            if (i4 != 0) {
                i3 = 5;
            } else {
                i3 = 6;
            }
            b(i3);
        }
        a(0);
        if (this.V) {
            com.ss.android.ugc.asve.recorder.a aVar2 = this.z.f129992f.f62345d;
            if (aVar2 == null) {
                h.f.b.l.a("recorder");
            }
            aVar2.c().d(0);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void c(boolean z2) {
        if (this.W != -1.0f) {
            Window window = this.t.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.W;
            window.setAttributes(attributes);
        }
        if (!z2 || this.X.getAlpha() != 0.5f) {
            this.X.setAlpha(0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.X, "alpha", 0.5f, 0.0f);
        ofFloat.setDuration(25L);
        ofFloat.start();
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void b(String str) {
        this.aM = str;
    }

    public void e(int i2) {
        this.f130162g.b(true);
        this.ag.a(z.f158842a);
        this.ar.a();
        try {
            this.w.setPreviewSizeRatio((((float) this.z.f129992f.getCameraPreviewWidth()) * 1.0f) / ((float) this.z.f129992f.getCameraPreviewHeight()));
        } catch (Exception e2) {
            c.f149151f.b(e2.getMessage());
        }
        ASCameraView aSCameraView = this.w;
        boolean z2 = this.O.n;
        com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        aVar.e().g(z2);
        this.w.setHandDetectLowpower(true ^ this.O.o);
        CameraComponentModel cameraComponentModel = this.A;
        if (cameraComponentModel != null) {
            this.w.g(cameraComponentModel.a());
        }
        if (this.O.Q) {
            hx.a(new am(this));
        }
        if (this.O.E) {
            ASCameraView aSCameraView2 = this.w;
            VEAdaptiveSharpenParams vEAdaptiveSharpenParams = new VEAdaptiveSharpenParams();
            vEAdaptiveSharpenParams.algorithmFlag = 24;
            com.ss.android.ugc.asve.recorder.a aVar2 = aSCameraView2.f62345d;
            if (aVar2 == null) {
                h.f.b.l.a("recorder");
            }
            aVar2.c().a(vEAdaptiveSharpenParams, new ASCameraView.f());
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(int i2) {
        int Q2 = Q();
        this.z.a(i2);
        this.ad.a(Integer.valueOf(i2));
        if (this.V) {
            g(Q2);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void b(boolean z2) {
        this.ab.a(Boolean.valueOf(z2));
    }

    public void f(int i2, int i3) {
        if (!this.G) {
            this.E = i2;
            this.F = i3;
            this.G = true;
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public void b(float f2, float f3) {
        throw new com.ss.android.ugc.aweme.shortvideo.ui.a.b("scaleRatioChange not support");
    }

    /* access modifiers changed from: protected */
    public final void d(int i2, int i3) {
        c.f149151f.a("CameraLogicComponent => surfaceChanged,width: " + i2 + ", height: " + i3);
        this.w.a(this.v);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public final void a(float f2, float f3) {
        i iVar = new i(new WeakReference(this.C), this.al);
        long nanoTime = System.nanoTime();
        boolean z2 = false;
        if (this.aD <= 0) {
            this.aD = nanoTime;
        } else {
            if (TimeUnit.NANOSECONDS.toMillis(nanoTime - this.aD) > this.O.u) {
                this.aD = nanoTime;
            }
            this.ao.a(Boolean.valueOf(z2));
        }
        CameraModule cameraModule = this.z;
        View G2 = G();
        com.ss.android.vesdk.ac acVar = new com.ss.android.vesdk.ac((int) f2, (int) f3, G2.getWidth(), G2.getHeight(), cameraModule.f129987a.getResources().getDisplayMetrics().density, iVar);
        ASCameraView aSCameraView = cameraModule.f129992f;
        h.f.b.l.d(acVar, "");
        com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
        if (aVar == null) {
            h.f.b.l.a("recorder");
        }
        if (aVar.c().a(acVar)) {
            z2 = true;
            com.ss.android.ugc.asve.recorder.camera.b.b cameraViewHelper$lib_asve_release = this.w.getCameraViewHelper$lib_asve_release();
            if (cameraViewHelper$lib_asve_release.f62221a) {
                if (cameraViewHelper$lib_asve_release.f62225e) {
                    cameraViewHelper$lib_asve_release.a().end();
                } else {
                    cameraViewHelper$lib_asve_release.c().end();
                }
            }
            this.w.getCameraViewHelper$lib_asve_release().a((int) f2, (int) f3);
            if (this.w.getExposureCompensationEnable()) {
                this.w.a(f2, f3);
            }
        }
        this.ao.a(Boolean.valueOf(z2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, Bitmap bitmap) {
        a();
        if (i2 == 0) {
            this.aF = bitmap;
            if (b()) {
                this.aE.setImageBitmap(this.aF);
            }
        }
    }

    public void a(int i2, int i3, String str) {
        a(this.au, i3, str);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public int a(com.ss.android.ugc.aweme.tools.g gVar, PrivacyCert privacyCert, String str) {
        int a2 = this.z.a(privacyCert, str);
        a(gVar);
        return a2;
    }

    @Override // com.bytedance.creativex.recorder.b.a.f
    public int a(boolean z2, PrivacyCert privacyCert, String str) {
        com.ss.android.ugc.aweme.tools.g a2;
        if (this.z.g() == 1) {
            a2 = com.ss.android.ugc.aweme.tools.g.b();
        } else {
            a2 = com.ss.android.ugc.aweme.tools.g.a();
        }
        a2.f140199b = z2;
        return a(a2, privacyCert, str);
    }

    public void a(int i2, float f2, boolean z2) {
        this.am.postValue(Float.valueOf(f2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String[] strArr, double[] dArr, boolean[] zArr) {
        if (strArr == null) {
            this.A.n = null;
        } else {
            this.A.n = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        a(strArr, dArr, zArr);
    }

    public u(com.bytedance.o.f fVar, CameraComponentModel cameraComponentModel, ar arVar, b bVar, com.ss.android.ugc.aweme.shortvideo.ui.a.a.a aVar, androidx.core.g.a<r> aVar2, g gVar) {
        com.ss.android.ugc.asve.recorder.camera.c.a aVar3;
        com.ss.android.ugc.aweme.shortvideo.i.g gVar2;
        ar arVar2 = arVar;
        MethodCollector.i(4694);
        TextureView.SurfaceTextureListener surfaceTextureListener = null;
        this.f130166k = new com.bytedance.als.l<>(null);
        this.f130167l = new k<>();
        this.f130168m = new k<>();
        this.n = new k<>();
        this.af = new k<>();
        this.o = new k<>();
        this.ag = new k<>();
        this.p = new k<>();
        this.ah = new k<>();
        this.ai = i.NORMAL;
        this.aj = new com.bytedance.als.l<>(Double.valueOf((double) this.ai.value()));
        this.ak = new k<>();
        this.q = new k<>();
        this.al = new k<>();
        this.am = new t<>();
        this.r = new k<>();
        this.an = new k<>();
        this.ao = new k<>();
        this.s = new k<>();
        this.C = new SafeHandler(this);
        this.at = true;
        this.au = false;
        this.E = 1280;
        this.F = 720;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.ax = false;
        this.ay = true;
        this.az = false;
        this.aA = true;
        this.aB = false;
        this.O = new r();
        this.aC = false;
        this.Q = false;
        this.aG = 0;
        this.aH = false;
        this.S = new a();
        this.aI = true;
        this.aJ = false;
        this.W = -1.0f;
        this.Y = true;
        this.Z = new w(this.C, new com.ss.android.medialib.listener.b() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass6 */

            static {
                Covode.recordClassIndex(85389);
            }

            @Override // com.ss.android.medialib.listener.b
            public final void a(int i2) {
                if (i2 < 0) {
                    com.ss.android.ugc.tools.view.widget.j.a(u.this.t, u.this.t.getResources().getString(R.string.ddw, Integer.valueOf(i2))).a();
                    u.this.f(i2);
                    u.this.aI();
                    return;
                }
                u.this.e(i2);
            }

            @Override // com.ss.android.medialib.listener.b
            public final void a(int i2, int i3) {
                if (u.this.A.f124706a == 0) {
                    u.this.A.f124710e = i2 ^ 1;
                }
                u.this.e(i2, i3);
            }
        });
        this.aK = new CameraModule.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass7 */

            static {
                Covode.recordClassIndex(85390);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a() {
                u.this.aE();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void b() {
                u.this.aF();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(int i2) {
                u.this.c(i2);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void b(int i2) {
                u.this.d(i2);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(int i2, int i3) {
                u.this.f(i2, i3);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(int i2, float f2, boolean z) {
                u.this.a(i2, f2, z);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void b(int i2, int i3, String str) {
                u.this.b(i2, i3, str);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(int i2, int i3, String str) {
                u.this.a(i2, i3, str);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(long j2, String str, String str2, String str3) {
                u.this.f130163h.a(new com.bytedance.creativex.recorder.b.a.e(j2, str, str2, str3));
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.record.CameraModule.a
            public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
                u.this.a(i2, z, z2, f2, list);
            }
        };
        this.aL = null;
        this.aO = null;
        this.aP = new Handler(Looper.getMainLooper());
        this.f130157b = fVar;
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class);
        this.t = dVar;
        this.A = cameraComponentModel;
        arVar2 = arVar2 == null ? new ap() : arVar2;
        this.av = arVar2;
        this.H = bVar;
        this.aw = aVar;
        if (aVar2 != null) {
            aVar2.a(this.O);
        }
        this.aq = this.O.w;
        this.P = gVar;
        ar();
        this.w = new ASCameraView(dVar);
        int i2 = this.aq;
        if (i2 == 0) {
            SurfaceView surfaceView = new SurfaceView(dVar);
            this.u = surfaceView;
            this.w.addView(surfaceView);
        } else if (i2 == 1) {
            TextureView textureView = new TextureView(dVar);
            this.ap = textureView;
            this.w.addView(textureView);
        }
        FrameLayout frameLayout = new FrameLayout(dVar);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        this.X = frameLayout;
        this.w.addView(frameLayout);
        this.X.bringToFront();
        ImageView imageView = new ImageView(dVar);
        this.aE = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.aE.setVisibility(8);
        this.w.addView(this.aE);
        h.f.a.a<z> aVar4 = this.O.f130131a.f130085a;
        if (aVar4 != null) {
            aVar4.invoke();
        }
        this.w.f62342a = this;
        aw awVar = new aw(dVar, cameraComponentModel, new ag(this));
        awVar.f130074d = this.O.s;
        awVar.f130075e = this.O.v;
        awVar.t = this.O.C;
        awVar.r = this.O.z;
        awVar.u = this.O.E;
        awVar.s = this.O.F;
        awVar.p = this.O.f130143m;
        awVar.n = this.O.f130141k;
        awVar.v = this.O.K;
        awVar.y = this.O.Q;
        h.f.a.b<? super aw, z> bVar2 = this.O.f130131a.f130086b;
        if (bVar2 != null) {
            bVar2.invoke(awVar);
        }
        if (gVar != null) {
            aVar3 = gVar.a();
        } else {
            aVar3 = null;
        }
        ASCameraView aSCameraView = this.w;
        h.f.b.l.d(awVar, "");
        if (aSCameraView.f62342a != null) {
            ASCameraView.o oVar = new ASCameraView.o(aSCameraView, awVar);
            if (oVar.k().invoke().booleanValue()) {
                VERuntime.a.INSTANCE.veRuntime.f151404i = true;
                if (!oVar.h()) {
                    VERuntime.a.INSTANCE.veRuntime.f151405j = true;
                }
            }
            m mVar = aSCameraView.f62342a;
            if (mVar == null) {
                h.f.b.l.a("lifecycleOwner");
            }
            com.ss.android.ugc.asve.recorder.a a2 = a.C1355a.a(mVar, oVar, aVar3);
            aSCameraView.f62345d = a2;
            TextureView textureView2 = aSCameraView.f62343b;
            surfaceTextureListener = textureView2 != null ? textureView2.getSurfaceTextureListener() : surfaceTextureListener;
            TextureView textureView3 = aSCameraView.f62343b;
            if (textureView3 != null) {
                textureView3.setSurfaceTextureListener(new ASCameraView.h(surfaceTextureListener, a2, oVar));
            }
            com.ss.android.ugc.asve.recorder.a aVar5 = aSCameraView.f62345d;
            if (aVar5 == null) {
                h.f.b.l.a("recorder");
            }
            aVar5.a(aSCameraView.f62347f);
            this.x = (VERecorderImpl) this.w.a().f62128c;
            this.y = ((VERecorderImpl) this.w.a().f62128c).j();
            this.M = awVar.f130073c.f();
            this.N = awVar.f130073c.g();
            h.f.a.b<? super ASCameraView, z> bVar3 = this.O.f130132b;
            if (bVar3 != null) {
                bVar3.invoke(this.w);
            }
            if (this.O.f130143m) {
                this.w.a(this.Z);
            }
            androidx.appcompat.app.d dVar2 = (androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class);
            if (this.O.M == null) {
                gVar2 = new s(arVar2);
            } else {
                gVar2 = this.O.M;
            }
            this.z = new CameraModule(dVar2, gVar2, this.aK, this.w, this, this.O.f130135e, this.O.f130136f, this.O.f130137g, this.O.y, this.O.J, this.O.P);
            this.ar = new com.ss.android.ugc.aweme.shortvideo.x.a(this.w.getEffectController());
            j jVar = this.O.O;
            if (!(jVar.f130119a == 7 && jVar.f130120b == 30)) {
                this.w.getCameraController().a(new int[]{jVar.f130119a, jVar.f130120b});
            }
            if (this.O.f130134d == at.STAGE_CONSTRUCT) {
                as();
            }
            MethodCollector.o(4694);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("must set lifecycleOwner before start".toString());
        MethodCollector.o(4694);
        throw illegalStateException;
    }
}
