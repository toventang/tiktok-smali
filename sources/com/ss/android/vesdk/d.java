package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.b.a;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AudioManagerCallback;
import com.ss.android.medialib.listener.b;
import com.ss.android.medialib.listener.c;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.FaceAttribute;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetect;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.medialib.model.Skeleton;
import com.ss.android.medialib.model.SkeletonInfo;
import com.ss.android.medialib.presenter.e;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.ttve.nativePort.TESystemUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.h.a;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.k.b;
import com.ss.android.ttvecamera.o;
import com.ss.android.ttvecamera.p;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.at;
import com.ss.android.vesdk.audio.g;
import com.ss.android.vesdk.audio.h;
import com.ss.android.vesdk.audio.j;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.d.b;
import com.ss.android.vesdk.faceinfo.VESkeleton;
import com.ss.android.vesdk.faceinfo.c;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.u;
import com.ss.android.vesdk.utils.TEPlanUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

public class d extends g implements RecordInvoker.OnRunningErrorCallback, b, c, e.c, AudioRecorderInterfaceExt {

    /* renamed from: a  reason: collision with root package name */
    public static final String f151130a = d.class.getSimpleName();
    public static final Object o = new Object();
    public boolean A;
    public ConditionVariable B;
    public volatile boolean C;
    public b D;
    public boolean E;
    boolean F;
    public a G;
    a.AbstractC1341a H;
    public PrivacyCert I;
    public int J;
    public int K;
    public volatile int L;
    public aw M;
    public TEAudioDataInterface N;
    com.ss.android.vesdk.c.a O;
    public LandMarkFrame P;
    public bc Q;
    b.AbstractC4059b R;

    /* renamed from: b  reason: collision with root package name */
    final List<com.ss.android.medialib.model.c> f151131b = new ArrayList();
    private r bA;
    private float bB = 1.0f;
    private long bC = -1;
    private boolean bD;
    private Surface bE;
    private boolean bF;
    private boolean bG;
    private VEDebugSettings bH;
    private boolean bI;
    private final ExecutorService bJ;
    private Object bK;
    private RecordInvoker.FaceResultCallback bL;
    private ax.n bM;
    private boolean bN;
    private boolean bO;
    private boolean bP;
    private long bQ;
    private boolean bR;
    private boolean bS;
    private boolean bT;
    private boolean bU;
    private h bV;
    private boolean bW;
    private boolean bX;
    private int bY;
    private m bZ;
    private boolean bw;
    private final VESize bx;
    private final int by = 1;
    private final int bz = 2;

    /* renamed from: c  reason: collision with root package name */
    public e f151132c;
    private a.b ca;

    /* renamed from: d  reason: collision with root package name */
    public String f151133d;

    /* renamed from: e  reason: collision with root package name */
    public long f151134e;

    /* renamed from: f  reason: collision with root package name */
    public long f151135f;

    /* renamed from: g  reason: collision with root package name */
    public int f151136g;

    /* renamed from: h  reason: collision with root package name */
    public String f151137h;

    /* renamed from: i  reason: collision with root package name */
    public long f151138i = 0;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.vesdk.b.a f151139j;

    /* renamed from: k  reason: collision with root package name */
    public VESize f151140k = new VESize(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public VESize f151141l;

    /* renamed from: m  reason: collision with root package name */
    public int f151142m;
    public boolean n;
    public boolean p;
    public VESize q;
    public int r;
    public at s;
    public VEDisplaySettings t;
    public int u;
    public h v;
    public a<com.ss.android.vesdk.d.b> w;
    public com.ss.android.vesdk.d.b x;
    public List<ax.n> y;
    public int z;

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public int initAudioConfig(int i2, int i3, int i4, int i5, int i6) {
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void lackPermission() {
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt, com.ss.android.medialib.a.a.AbstractC1300a
    public int onProcessData(byte[] bArr, int i2, long j2) {
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int q() {
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public void recordStatus(boolean z2) {
    }

    @Override // com.ss.android.vesdk.g
    public final com.ss.android.vesdk.c.a c() {
        return this.O;
    }

    @Override // com.ss.android.vesdk.g
    public final int h() {
        return this.u;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(com.ss.android.vesdk.b.a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, at atVar, String str, String str2, boolean z2) {
        bi.a("TECameraVideoRecorder-init");
        this.f151139j = null;
        this.bT = z2;
        String str3 = f151130a;
        an.b(str3, "mIsARCoreSupported = " + this.bT);
        this.as = null;
        if (!(this.as == null || this.as.x != VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME || this.as.a() == VECameraSettings.CAMERA_TYPE.TYPE1)) {
            this.as.x = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        }
        this.f151137h = str + File.separator;
        this.at = vEVideoEncodeSettings;
        this.au = vEAudioEncodeSettings;
        this.s = atVar;
        this.av = str2;
        boolean booleanValue = ((Boolean) u.a().a("ve_enable_refactor_audio", (Object) false)).booleanValue();
        boolean z3 = true;
        if (this.bu) {
            booleanValue = true;
        }
        an.a(str3, "audio refactor: ".concat(String.valueOf(booleanValue)));
        this.E = booleanValue;
        u.d a2 = u.a().a("ve_enable_optimize_audio_delay");
        int intValue = (a2 == null || !(a2.f151496b instanceof Integer)) ? 0 : ((Integer) a2.f151496b).intValue();
        an.a(str3, "audio length opt: ".concat(String.valueOf(intValue)));
        if (intValue != 1) {
            z3 = false;
        }
        this.bU = z3;
        if (this.bu) {
            g.INSTANCE.setAudioEncodeSettings(this.au);
            g.INSTANCE.setAudioBufferConsumer(this.f151132c);
        }
        this.U = new l();
        int B2 = B();
        bi.b();
        this.aq = -1;
        com.ss.android.ttve.monitor.h.a(0, "te_titan_engine", 0L);
        return B2;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(com.ss.android.vesdk.runtime.e eVar) {
        int i2 = this.u;
        if (i2 == 0 || i2 == 1) {
            super.a(eVar);
            this.f151131b.clear();
            this.f151138i = 0;
            this.f151137h = eVar.a() + File.separator;
            if (this.u != 1) {
                return 0;
            }
            r();
            int B2 = B();
            if (B2 == 0) {
                return 0;
            }
            an.d(f151130a, "nativeInitBeautyPlay error: ".concat(String.valueOf(B2)));
            return -108;
        }
        an.d(f151130a, "Invoking the wrong timing!");
        return -105;
    }

    @Override // com.ss.android.vesdk.g
    public final void b(int i2) {
        this.f151132c.e(i2, -1);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(int i2, int i3, int i4, int i5) {
        this.f151132c.a(i2, i3, i4, i5);
    }

    @Override // com.ss.android.vesdk.g
    public final int[] a(int i2, int i3, int i4, int i5, float f2) {
        int[] a2 = this.f151132c.a(i2, i3, i4, i5, f2);
        an.a(f151130a, "updateReactionRegion " + Arrays.toString(a2));
        return a2;
    }

    @Override // com.ss.android.vesdk.g
    public final boolean b(int i2, int i3) {
        boolean f2 = this.f151132c.f(i2, i3);
        an.a(f151130a, "posInReactionRegion ".concat(String.valueOf(f2)));
        return f2;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final double d2) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass18 */

            static {
                Covode.recordClassIndex(99389);
            }

            public final void run() {
                MethodCollector.i(2333);
                synchronized (d.this) {
                    try {
                        if (d.this.u == 3) {
                            an.d(d.f151130a, "setVideoBgSpeed could not be executed in state: " + d.this.u);
                            return;
                        }
                        d.this.f151132c.a(d2);
                        MethodCollector.o(2333);
                    } finally {
                        MethodCollector.o(2333);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final String str, final String str2, final String str3) {
        an.a(f151130a, "setCustomVideoBg: videoPath = " + str2 + ", audioPath = " + str3 + ", mVERecordMode = " + this.az);
        if (this.az == aw.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(str2)) {
            b(new Runnable() {
                /* class com.ss.android.vesdk.d.AnonymousClass25 */

                static {
                    Covode.recordClassIndex(99398);
                }

                public final void run() {
                    aw awVar;
                    MethodCollector.i(2513);
                    synchronized (d.this) {
                        try {
                            an.a(d.f151130a, "setCustomVideoBg: doing... ");
                            if (d.this.u == 3) {
                                an.d(d.f151130a, "setCustomVideoBg could not be executed in recording mode: " + d.this.u);
                                return;
                            }
                            d dVar = d.this;
                            if (!TextUtils.isEmpty(str2)) {
                                awVar = aw.CUSTOM_VIDEO_BG;
                            } else {
                                awVar = aw.DEFAULT;
                            }
                            dVar.a(awVar);
                            d.this.f151132c.a(d.this.S, str, str2, str3);
                            MethodCollector.o(2513);
                        } finally {
                            MethodCollector.o(2513);
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final String str, final String str2) {
        an.a(f151130a, "setCustomVideoBg, key = " + str + ", Gif path = " + str2);
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass33 */

            static {
                Covode.recordClassIndex(99407);
            }

            public final void run() {
                aw awVar;
                MethodCollector.i(4561);
                synchronized (d.this) {
                    try {
                        an.a(d.f151130a, "setCustomVideoBg-gif: doing...");
                        if (d.this.u == 3) {
                            an.d(d.f151130a, "setCustomVideoBg could not be executed in recording mode: " + d.this.u);
                            return;
                        }
                        d dVar = d.this;
                        if (!TextUtils.isEmpty(str2)) {
                            awVar = aw.CUSTOM_VIDEO_BG_GIF;
                        } else {
                            awVar = aw.DEFAULT;
                        }
                        dVar.a(awVar);
                        d.this.f151132c.a(str, str2);
                        MethodCollector.o(4561);
                    } finally {
                        MethodCollector.o(4561);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final int a(final String str, final long j2, final long j3, final int i2) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass42 */

            static {
                Covode.recordClassIndex(99417);
            }

            public final void run() {
                MethodCollector.i(2308);
                synchronized (d.this) {
                    try {
                        if (d.this.u == 3) {
                            an.d(d.f151130a, "setRecordBGM could not be executed in state: " + d.this.u);
                        } else if (!d.this.C) {
                            an.d(d.f151130a, "setRecordBGM could not be executed, after startPrePlay");
                            MethodCollector.o(2308);
                        } else {
                            d.super.a((d) str, (String) j2, j3, (long) i2);
                            e a2 = d.this.f151132c.a(str);
                            boolean z = true;
                            if (d.this.aD != 1) {
                                z = false;
                            }
                            a2.f59774d = z;
                            a2.a(d.this.aB, d.this.aC, d.this.f151138i);
                            d dVar = d.this;
                            dVar.c(dVar.c(false));
                            d.this.f151132c.b(d.this.S, d.this.c(false), d.this);
                            d.this.f151133d = str;
                            d.this.f151134e = j2;
                            d.this.f151135f = j3;
                            d.this.f151136g = i2;
                            MethodCollector.o(2308);
                        }
                    } finally {
                        MethodCollector.o(2308);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final List<bf> list, String str, int i2, final VEListener.j jVar) {
        this.bP = true;
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99391);
            }

            public final void run() {
                d.this.f151131b.clear();
                d.this.f151131b.addAll(list);
                d dVar = d.this;
                dVar.f151138i = (long) com.ss.android.medialib.model.c.a(dVar.f151131b);
                int a2 = d.this.f151132c.a(list.size(), d.this.f151137h);
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(a2);
                }
            }
        });
        a(str, (long) i2, this.aC, 2);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final Surface surface, final VEListener.j jVar) {
        bi.a("startPreviewAsync");
        this.bP = true;
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99403);
            }

            public final void run() {
                int b2 = d.this.b(surface);
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(b2);
                }
            }
        });
        this.f151132c.k(false);
        if (this.f151139j != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_USING);
            this.f151139j.a();
        }
        bi.b();
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final VEListener.j jVar) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99414);
            }

            public final void run() {
                d.this.f151132c.p();
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(0);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final VEListener.j jVar, boolean z2) {
        final boolean z3;
        String str = f151130a;
        an.a(str, "stopPreviewAsync: listener".concat(String.valueOf(jVar)));
        double currentTimeMillis = (double) System.currentTimeMillis();
        a((String) null, (String) null, (String) null);
        r(z2);
        at atVar = this.s;
        if (atVar == null || !atVar.f150956l) {
            z3 = false;
        } else {
            z3 = true;
            this.B.close();
        }
        final boolean z4 = this.bS;
        an.a(str, "stop preview async opt = ".concat(String.valueOf(z4)));
        if (z4 && z3 && this.f151132c.D() != 0) {
            this.B.open();
        }
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99419);
            }

            public final void run() {
                d.this.s();
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(0);
                }
                if (!z4 && z3) {
                    d.this.B.open();
                }
            }
        });
        if (z3) {
            this.B.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        double currentTimeMillis2 = (double) System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("stopPreviewAsync cost ");
        Double.isNaN(currentTimeMillis2);
        Double.isNaN(currentTimeMillis);
        an.a(str, sb.append(currentTimeMillis2 - currentTimeMillis).append("ms").toString());
        an.a(str, "add log for TC");
    }

    @Override // com.ss.android.vesdk.g
    public final int a(Surface surface) {
        int a2 = this.f151132c.a(surface);
        this.f151132c.o();
        return a2;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final float f2, final VEListener.j jVar) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass7 */

            static {
                Covode.recordClassIndex(99421);
            }

            public final void run() {
                int a2 = d.this.a(f2);
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(a2);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void b(final VEListener.j jVar) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99422);
            }

            public final void run() {
                int k2 = d.this.k();
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(k2);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.vesdk.g
    public final int a(boolean z2, String str) {
        this.aU = z2;
        this.aW = str;
        return this.f151132c.a(z2, str);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(String str, String str2, int i2, String str3, String str4, VEListener.j jVar) {
        b(new Runnable(jVar, str, str2, 0, str3, str4, -1) {
            /* class com.ss.android.vesdk.d.AnonymousClass12 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VEListener.j f151146a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f151147b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f151148c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f151149d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f151150e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f151151f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f151152g = -1;

            static {
                Covode.recordClassIndex(99383);
            }

            public final void run() {
                if (d.this.u == 3 || d.this.u == 0) {
                    VEListener.j jVar = this.f151146a;
                    if (jVar != null) {
                        jVar.a(-105);
                        return;
                    }
                    return;
                }
                int a2 = d.this.f151132c.a(this.f151147b, this.f151148c, this.f151149d, this.f151150e, this.f151151f, d.this.at.isOptRemuxWithCopy(), this.f151152g);
                VEListener.j jVar2 = this.f151146a;
                if (jVar2 != null) {
                    jVar2.a(a2);
                }
            }

            {
                this.f151146a = r3;
                this.f151147b = r4;
                this.f151148c = r5;
                this.f151149d = r6;
                this.f151150e = r7;
                this.f151151f = r8;
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final boolean z2, final PrivacyCert privacyCert) {
        int iDWithName = VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC);
        if (z2) {
            VESensService.getInstance().setSensCheckObjExpectStatus(iDWithName, VESensService.b.PRIVACY_STATUS_USING);
        } else {
            VESensService.getInstance().setSensCheckObjExpectStatus(iDWithName, VESensService.b.PRIVACY_STATUS_RELEASE);
        }
        if (this.E && !this.bu) {
            if (z2) {
                o(H());
                d("enableAudioRecorder");
            } else {
                an.b(f151130a, "mVEAudioCapture release: enableAudioRecorder");
                this.U.release(privacyCert);
                this.L = 0;
            }
        }
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass13 */

            static {
                Covode.recordClassIndex(99384);
            }

            public final void run() {
                if (!d.this.E && d.this.x()) {
                    if (z2) {
                        d.this.o(true);
                        d.this.d("enableAudioRecorder");
                    } else {
                        an.b(d.f151130a, "mVEAudioCapture release: enableAudioRecorder");
                        d.this.U.release(privacyCert);
                        d.this.L = 0;
                    }
                }
                d.this.f151132c.m(z2);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final PrivacyCert privacyCert) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
        String str = f151130a;
        an.b(str, "mVEAudioCapture startAudioRecorder");
        if (!this.E) {
            b(new Runnable() {
                /* class com.ss.android.vesdk.d.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(99385);
                }

                public final void run() {
                    if (d.this.x()) {
                        d.this.d("startAudioRecorder not refactor");
                        an.b(d.f151130a, "mVEAudioCapture start: startAudioRecorder");
                        d.this.I = privacyCert;
                        d.this.U.start(privacyCert);
                    }
                    e eVar = d.this.f151132c;
                    if ((!eVar.f59782l || eVar.f59781k) && !eVar.f59775e) {
                        if (eVar.f59772b == null) {
                            eVar.f59772b = new BufferedAudioRecorder(eVar, eVar.o, eVar.p, eVar.q, eVar.u);
                            eVar.f59772b.init(e.y());
                        }
                        eVar.s = true;
                        eVar.f59772b.startRecording(1.0d, false);
                    }
                }
            });
        } else if (!this.bu) {
            e eVar = this.f151132c;
            if (!eVar.f59782l || eVar.f59781k) {
                d("startAudioRecorder");
                an.b(str, "mVEAudioCapture start: startAudioRecorder");
                this.I = privacyCert;
                this.U.start(privacyCert);
                return;
            }
            an.b(str, "mVEAudioCapture audioNeedStart: false");
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void b(final PrivacyCert privacyCert) {
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_RELEASE);
        String str = f151130a;
        an.b(str, "mVEAudioCapture stopAudioRecorder");
        if (!this.E) {
            b(new Runnable() {
                /* class com.ss.android.vesdk.d.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(99386);
                }

                public final void run() {
                    if (d.this.x()) {
                        an.b(d.f151130a, "mVEAudioCapture stop: stopAudioRecorder not refactor");
                        d.this.U.stop(privacyCert);
                        d.this.I = null;
                        return;
                    }
                    d.this.f151132c.r();
                }
            });
        } else if (!this.bu) {
            an.b(str, "mVEAudioCapture stop: stopAudioRecorder");
            this.U.stop(privacyCert);
            this.I = null;
        }
    }

    public final int a(aw awVar) {
        this.az = awVar;
        return this.f151132c.h(awVar.ordinal());
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final boolean z2) {
        this.bD = z2;
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass16 */

            static {
                Covode.recordClassIndex(99387);
            }

            public final void run() {
                d.this.f151132c.a(z2 ? 1 : 0);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void b(final boolean z2) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass17 */

            static {
                Covode.recordClassIndex(99388);
            }

            public final void run() {
                d.this.f151132c.b(z2 ? 1 : 0);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(ax.i iVar) {
        super.a(iVar);
        if (iVar == null) {
            this.f151132c.w();
            return;
        }
        iVar.a();
        this.f151132c.a(this, iVar.a().f151032b.ordinal());
    }

    @Override // com.ss.android.vesdk.g
    public final void a(r rVar) {
        boolean z2;
        this.bA = rVar;
        if (rVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f151132c.i(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(VEVolumeParam vEVolumeParam) {
        if (vEVolumeParam.f150869b > -1.0f) {
            this.f151132c.a(vEVolumeParam.f150869b, vEVolumeParam.f150868a);
        }
        this.f151132c.f59783m = vEVolumeParam.f150870c;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, VETrackParams vETrackParams) {
        an.c(f151130a, "addTrack trimIn " + vETrackParams.f61152b.get(0) + " trimOut " + vETrackParams.f61153c.get(0));
        if (H()) {
            return this.f151132c.a(i2, vETrackParams.f61151a.get(0), (long) vETrackParams.f61152b.get(0).intValue(), (long) vETrackParams.f61153c.get(0).intValue());
        }
        return a(vETrackParams.f61151a.get(0), (long) vETrackParams.f61152b.get(0).intValue(), (long) vETrackParams.f61153c.get(0).intValue());
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, int i3, boolean z2) {
        b(new e(this, i2, i3, z2));
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(final VEPrePlayParams vEPrePlayParams) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass19 */

            static {
                Covode.recordClassIndex(99390);
            }

            public final void run() {
                if (d.this.u != 2) {
                    an.d(d.f151130a, "startPrePlay in state:" + d.this.u);
                    return;
                }
                d dVar = d.this;
                dVar.c(dVar.c(true));
                d.this.f151132c.b(d.this.S, d.this.c(true), d.this);
                d.this.C = false;
                d.this.f151132c.a(vEPrePlayParams.f151362b, vEPrePlayParams.f151361a, false);
            }
        });
        return 0;
    }

    public final void b(Runnable runnable) {
        if (this.bR) {
            an.d(f151130a, "Recorder is destroyed, ignore subsequent tasks");
        } else if (!this.bP) {
            runnable.run();
        } else if (this.bJ.isShutdown()) {
            an.d(f151130a, "executeSafeSubmit EXECUTOR isShutdown");
            runnable.run();
        } else {
            try {
                this.bJ.submit(runnable);
            } catch (RejectedExecutionException e2) {
                e2.printStackTrace();
                an.d(f151130a, "RejectedExecutionException happened to executeSafeSubmit: " + e2.getMessage());
                runnable.run();
            }
        }
    }

    @Override // com.ss.android.vesdk.g
    public final VEFrame a(ax.c cVar) {
        ImageFrame f2;
        if (cVar.f151029a != 1 || (f2 = this.f151132c.f(cVar.f151030b)) == null) {
            return null;
        }
        return VEFrame.createByteBufferFrame(f2.byteBuffer, f2.width, f2.height, f2.rotate, 0, VEFrame.a.values()[f2.format]);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(long j2) {
        this.f151132c.b(j2);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(com.ss.android.vesdk.b.b bVar) {
        if (bVar != null) {
            VESize f2 = bVar.f();
            com.ss.android.vesdk.d.b bVar2 = null;
            Iterator<com.ss.android.vesdk.d.b> it = this.w.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.ss.android.vesdk.d.b next = it.next();
                if (next.f151255f) {
                    bVar2 = next;
                    break;
                }
            }
            if (!(f2 == null || bVar2 == null || bVar2.f151253d == null)) {
                bVar2.f151253d.f61374a = f2.width;
                bVar2.f151253d.f61375b = f2.height;
            }
            bVar.a(this.w);
        }
    }

    @Override // com.ss.android.medialib.listener.b
    public final void a(int i2) {
        com.ss.android.ttve.monitor.h.a(0, "te_record_preview_init_time", System.currentTimeMillis() - this.bQ);
        if (!(this.az != aw.REACTION || this.ay == null || this.ay.f150992b == null || this.ay.f150991a == null)) {
            int i3 = this.at.getVideoRes().width;
            int i4 = this.at.getVideoRes().height;
            float[] fArr = this.ay.f150993c;
            float f2 = (float) i4;
            float f3 = (float) i3;
            this.f151132c.a((int) (fArr[0] * f2), (int) (fArr[1] * f2), (int) (fArr[2] * f3), (int) (fArr[3] * f3));
            this.f151132c.e(2, 0);
            float[] fArr2 = this.ay.f150994d;
            this.f151132c.d((int) (fArr2[2] * f3), (int) (fArr2[3] * f2));
        }
        if (i2 == 0) {
            at atVar = this.s;
            if (((Boolean) u.a().a("ve_disable_effect_internal_setting", (Object) false)).booleanValue()) {
                atVar.f150954j = true;
            }
            if (!atVar.f150954j) {
                a(this.aH.f61162a, this.aH.f61163b);
                a(this.aH.f61164c, this.aH.f61165d);
                if (this.aJ.f61177g) {
                    if (!TextUtils.isEmpty(this.aJ.f61171a) && !TextUtils.isEmpty(this.aJ.f61172b)) {
                        a(this.aJ.f61171a, this.aJ.f61172b, this.aJ.f61173c, this.aJ.f61174d, this.aJ.f61175e);
                    } else if (!TextUtils.isEmpty(this.aJ.f61171a)) {
                        this.f151132c.a(this.aJ.f61171a, this.aJ.f61174d);
                    }
                } else if (!TextUtils.isEmpty(this.aJ.f61171a) && !TextUtils.isEmpty(this.aJ.f61172b)) {
                    String str = this.aJ.f61171a;
                    String str2 = this.aJ.f61172b;
                    float f4 = this.aJ.f61173c;
                    this.aJ.f61171a = str;
                    this.aJ.f61172b = str2;
                    this.aJ.f61173c = f4;
                    this.aJ.f61176f = true;
                    this.f151132c.a(com.ss.android.vesdk.utils.b.a(str), com.ss.android.vesdk.utils.b.a(str2), f4);
                } else if (!TextUtils.isEmpty(this.aJ.f61171a)) {
                    this.f151132c.b(this.aJ.f61171a);
                    if (!this.aJ.f61176f) {
                        this.f151132c.d(this.aJ.f61174d);
                    }
                }
                a(this.aK.f61178a, this.aK.f61179b, this.aK.f61180c);
                String str3 = this.aK.f61178a;
                Map<Integer, Float> map = this.aK.f61181d;
                this.aK.f61178a = str3;
                com.ss.android.ttve.model.d dVar = this.aK;
                if (dVar.f61181d == null) {
                    dVar.f61181d = map;
                } else {
                    dVar.f61181d.putAll(map);
                }
                this.f151132c.a(str3, map);
                b(this.aL.f61166a, this.aL.f61167b, this.aL.f61168c);
                if (!TextUtils.isEmpty(this.aL.f61166a)) {
                    a(19, this.aL.f61169d);
                    a(20, this.aL.f61170e);
                }
                b(this.aI);
            }
            if (this.ah == null) {
                this.f151132c.w();
            } else {
                this.f151132c.a(this, this.ah.a().f151032b.ordinal());
            }
        } else {
            an.d(f151130a, "Create native GL env failed");
        }
        if (this.W != null) {
            this.W.a(i2);
            if (this.W instanceof VEListener.ah) {
                ((VEListener.ah) this.W).a(1002, i2, "Init onNativeInitCallBack");
            }
        }
        com.ss.android.ttve.monitor.h.a(0, "te_record_preview_init_ret", (long) i2);
    }

    @Override // com.ss.android.medialib.listener.b
    public final void a(int i2, int i3) {
        if (this.W != null) {
            boolean z2 = i2 == 0;
            this.W.a(z2);
            if (this.W instanceof VEListener.ah) {
                ((VEListener.ah) this.W).a(1003, z2 ? 1 : -1, "Init HardEncode");
            }
        }
        if (this.at.isSupportHwEnc()) {
            com.ss.android.ttve.monitor.h.a(0, "te_record_hard_encode_init_ret", i2 == 1 ? -1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, float f2, String str) {
        r rVar = this.bA;
        if (rVar != null) {
            rVar.onCallback(i2, i3, f2, str);
        }
    }

    @Override // com.ss.android.medialib.presenter.e.c
    public final void a(com.ss.android.medialib.model.a aVar) {
        ax.i iVar = this.ah;
        if (iVar != null) {
            VEFrame vEFrame = null;
            if (aVar.f59743c == VEFrame.a.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                vEFrame = VEFrame.createTextureFrame(aVar.f59741a, aVar.f59742b, aVar.f59744d, aVar.f59745e, 0, aVar.f59746f, VEFrame.a.TEPixFmt_OpenGL_RGBA8);
            } else {
                if (aVar.f59743c == VEFrame.a.TEPixFmt_YUV420P.ordinal()) {
                    vEFrame = VEFrame.createByteBufferFrame(aVar.f59748h, aVar.f59744d, aVar.f59745e, 0, aVar.f59746f, VEFrame.a.TEPixFmt_YUV420P);
                }
                int i2 = Build.VERSION.SDK_INT;
                iVar.a(vEFrame);
            }
            if (vEFrame != null) {
                vEFrame.setFromFrontCamera(aVar.f59749i);
            }
            int i22 = Build.VERSION.SDK_INT;
            iVar.a(vEFrame);
        }
    }

    @Override // com.ss.android.medialib.presenter.e.c
    public final boolean b() {
        ax.i iVar = this.ah;
        if (iVar == null) {
            return false;
        }
        iVar.a();
        return iVar.a().f151031a;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String str, float f2) {
        this.aJ.f61171a = str;
        this.aJ.f61172b = str;
        this.aJ.f61174d = f2;
        this.aJ.f61175e = f2;
        this.aJ.f61176f = false;
        this.aJ.f61173c = 1.0f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f151132c.a(str, f2);
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(String str, String str2, float f2, float f3, float f4) {
        this.aJ.f61171a = str;
        this.aJ.f61172b = str2;
        this.aJ.f61173c = f2;
        this.aJ.f61174d = f3;
        this.aJ.f61175e = f4;
        this.aJ.f61176f = true;
        this.aJ.f61177g = true;
        this.f151132c.a(com.ss.android.vesdk.utils.b.a(str), com.ss.android.vesdk.utils.b.a(str2), f2, f3, f4);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, String str) {
        this.aH.f61162a = i2;
        this.aH.f61163b = str;
        this.f151132c.b(i2, str);
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String str, float f2, float f3) {
        this.aK.f61178a = str;
        this.aK.f61179b = f2;
        this.aK.f61180c = f3;
        this.f151132c.a(com.ss.android.vesdk.utils.b.a(str), f2, f3);
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vesdk.g
    public final int a(VEEffectFilterParam vEEffectFilterParam) {
        if (vEEffectFilterParam == null) {
            return -100;
        }
        this.aI = vEEffectFilterParam;
        this.f151132c.a(vEEffectFilterParam.effectFilterType.ordinal(), vEEffectFilterParam.effectPath, vEEffectFilterParam.stickerId, vEEffectFilterParam.reqId, vEEffectFilterParam.stickerTag, vEEffectFilterParam.composerTags, vEEffectFilterParam.composerValues, vEEffectFilterParam.needReload, vEEffectFilterParam.isSyncLoadResource);
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(ax.n nVar) {
        super.a(nVar);
        if (this.y == null) {
            this.y = new CopyOnWriteArrayList();
        }
        this.y.add(nVar);
        if (this.bL == null) {
            this.bL = new RecordInvoker.FaceResultCallback() {
                /* class com.ss.android.vesdk.d.AnonymousClass23 */

                static {
                    Covode.recordClassIndex(99396);
                }

                @Override // com.ss.android.medialib.RecordInvoker.FaceResultCallback
                public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                    com.ss.android.vesdk.faceinfo.b bVar;
                    for (ax.n nVar : d.this.y) {
                        com.ss.android.vesdk.faceinfo.d dVar = null;
                        int i2 = 0;
                        if (faceAttributeInfo == null) {
                            bVar = null;
                        } else {
                            bVar = new com.ss.android.vesdk.faceinfo.b();
                            FaceAttribute[] info = faceAttributeInfo.getInfo();
                            if (info == null) {
                                bVar.f151284a = new com.ss.android.vesdk.faceinfo.a[0];
                            } else {
                                com.ss.android.vesdk.faceinfo.a[] aVarArr = new com.ss.android.vesdk.faceinfo.a[info.length];
                                bVar.f151284a = aVarArr;
                                int length = info.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    FaceAttribute faceAttribute = info[i3];
                                    com.ss.android.vesdk.faceinfo.a aVar = new com.ss.android.vesdk.faceinfo.a();
                                    int i5 = i4 + 1;
                                    aVarArr[i4] = aVar;
                                    if (faceAttribute != null) {
                                        aVar.f151271a = faceAttribute.getAge();
                                        aVar.f151282l = faceAttribute.getAngryScore();
                                        aVar.f151279i = faceAttribute.getArousal();
                                        aVar.f151282l = faceAttribute.getAngryScore();
                                        aVar.f151273c = faceAttribute.getAttractive();
                                        aVar.t = faceAttribute.getBlurScore();
                                        aVar.f151272b = faceAttribute.getBoyProb();
                                        aVar.f151276f = faceAttribute.getExpProbs();
                                        aVar.f151275e = faceAttribute.getExpType();
                                        aVar.f151274d = faceAttribute.getHappyScore();
                                        aVar.u = faceAttribute.getIllumination();
                                        aVar.q = faceAttribute.getLipstickProb();
                                        aVar.n = faceAttribute.getMaskProb();
                                        aVar.p = faceAttribute.getMustacheProb();
                                        aVar.f151278h = faceAttribute.getQuality();
                                        aVar.f151277g = faceAttribute.getRealFaceProb();
                                        aVar.f151281k = faceAttribute.getSadScore();
                                        aVar.f151283m = faceAttribute.getSurpriseScore();
                                        aVar.f151280j = faceAttribute.getValence();
                                        aVar.r = faceAttribute.getWearGlassProb();
                                        aVar.o = faceAttribute.getWearHatProb();
                                        aVar.s = faceAttribute.getWearSunglassProb();
                                    }
                                    i3++;
                                    i4 = i5;
                                }
                            }
                        }
                        if (!(faceDetectInfo == null || faceDetectInfo.getInfo() == null)) {
                            dVar = new com.ss.android.vesdk.faceinfo.d();
                            com.ss.android.vesdk.faceinfo.c[] cVarArr = new com.ss.android.vesdk.faceinfo.c[faceDetectInfo.getInfo().length];
                            FaceDetect[] info2 = faceDetectInfo.getInfo();
                            int length2 = info2.length;
                            int i6 = 0;
                            while (i2 < length2) {
                                FaceDetect faceDetect = info2[i2];
                                com.ss.android.vesdk.faceinfo.c cVar = new com.ss.android.vesdk.faceinfo.c();
                                cVar.f151285a = faceDetect.getRect();
                                cVar.f151287c = faceDetect.getPoints();
                                cVar.f151294j = faceDetect.getAction();
                                cVar.f151292h = faceDetect.getEyeDistance();
                                if (faceDetect.getFaceExtInfo() != null) {
                                    c.a aVar2 = new c.a();
                                    aVar2.f151298b = faceDetect.getFaceExtInfo().eyebrowCount;
                                    aVar2.f151303g = faceDetect.getFaceExtInfo().eyeBrowLeftPoints;
                                    aVar2.f151304h = faceDetect.getFaceExtInfo().eyeBrowRightPoints;
                                    aVar2.f151297a = faceDetect.getFaceExtInfo().eyeCount;
                                    aVar2.f151301e = faceDetect.getFaceExtInfo().eyeLeftPoints;
                                    aVar2.f151302f = faceDetect.getFaceExtInfo().eyeRightPoints;
                                    aVar2.f151299c = faceDetect.getFaceExtInfo().lipCount;
                                    aVar2.f151305i = faceDetect.getFaceExtInfo().irisLeftPoints;
                                    aVar2.f151306j = faceDetect.getFaceExtInfo().irisRightPoints;
                                    aVar2.f151300d = faceDetect.getFaceExtInfo().irisCount;
                                    cVar.f151296l = aVar2;
                                }
                                cVar.f151293i = faceDetect.getFaceID();
                                cVar.f151290f = faceDetect.getPitch();
                                cVar.f151288d = faceDetect.getPointVisibility();
                                cVar.f151291g = faceDetect.getRoll();
                                cVar.f151289e = faceDetect.getYaw();
                                cVar.f151286b = faceDetect.getScore();
                                cVar.f151295k = faceDetect.getTrackCount();
                                cVarArr[i6] = cVar;
                                i2++;
                                i6++;
                            }
                            dVar.f151307a = cVarArr;
                        }
                        nVar.a(bVar, dVar);
                    }
                }
            };
        }
        this.f151132c.a(this.bL);
    }

    @Override // com.ss.android.vesdk.g
    public final void b(ax.n nVar) {
        super.b(nVar);
        List<ax.n> list = this.y;
        if (list != null) {
            for (ax.n nVar2 : list) {
                if (nVar2.equals(nVar)) {
                    this.y.remove(nVar2);
                }
            }
            if (this.y.isEmpty()) {
                this.f151132c.t();
            }
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final ax.p pVar) {
        super.a(pVar);
        this.f151132c.a((RecordInvoker.OnPreviewRadioListener) new RecordInvoker.OnPreviewRadioListener() {
            /* class com.ss.android.vesdk.d.AnonymousClass24 */

            static {
                Covode.recordClassIndex(99397);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnPreviewRadioListener
            public final void onInfo(int i2, int i3) {
                as.values();
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final ax.s sVar) {
        super.a(sVar);
        this.f151132c.a((RecordInvoker.OnSkeletonDetectCallback) new RecordInvoker.OnSkeletonDetectCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass26 */

            static {
                Covode.recordClassIndex(99399);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnSkeletonDetectCallback
            public final void onResult(SkeletonInfo skeletonInfo) {
                com.ss.android.vesdk.faceinfo.e eVar;
                ax.s sVar = sVar;
                if (skeletonInfo == null) {
                    eVar = null;
                } else {
                    eVar = new com.ss.android.vesdk.faceinfo.e();
                    VESkeleton[] vESkeletonArr = new VESkeleton[skeletonInfo.getInfo().length];
                    Skeleton[] info = skeletonInfo.getInfo();
                    int length = info.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        Skeleton skeleton = info[i2];
                        VESkeleton vESkeleton = new VESkeleton();
                        vESkeleton.setID(skeleton.getID());
                        vESkeleton.setRect(skeleton.getRect());
                        vESkeleton.setPoints(skeleton.getPoints());
                        vESkeletonArr[i3] = vESkeleton;
                        i2++;
                        i3++;
                    }
                    eVar.f151308a = vESkeletonArr;
                }
                sVar.a(eVar);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final ax.l lVar) {
        super.a(lVar);
        this.f151132c.a((RecordInvoker.OnCherEffectParmaCallback) new RecordInvoker.OnCherEffectParmaCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass27 */

            static {
                Covode.recordClassIndex(99400);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnCherEffectParmaCallback
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                lVar.a(strArr, dArr, zArr);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(VECherEffectParam vECherEffectParam) {
        this.f151132c.a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    @Override // com.ss.android.vesdk.g
    public final void a(int i2, long j2, long j3, String str) {
        this.f151132c.a(i2, j2, j3, str);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(MessageCenter.Listener listener) {
        this.f151132c.a(listener);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(final ax.b bVar, int i2) {
        super.a(bVar, i2);
        this.f151132c.a((com.ss.android.medialib.listener.a) new com.ss.android.medialib.listener.a() {
            /* class com.ss.android.vesdk.d.AnonymousClass28 */

            static {
                Covode.recordClassIndex(99401);
            }

            @Override // com.ss.android.medialib.listener.a
            public final void a(int i2, int i3) {
                ax.b bVar = bVar;
                if (bVar != null) {
                    bVar.a(i3);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void a(float[] fArr) {
        this.f151132c.a(fArr);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(float[] fArr, double d2) {
        this.f151132c.a(fArr, d2);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(float f2, float f3, float f4) {
        this.f151132c.a(f2, f3, f4);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(boolean z2, boolean z3, boolean z4, boolean z5) {
        return this.f151132c.a(z2, z3, z4, z5);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(double[] dArr, double d2) {
        return this.f151132c.a(dArr, d2);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String str, int i2, int i3, String str2) {
        return this.f151132c.a(str, i2, i3, str2);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(final ax.h hVar) {
        return this.f151132c.a((RecordInvoker.OnARTextCountCallback) new RecordInvoker.OnARTextCountCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass29 */

            static {
                Covode.recordClassIndex(99402);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnARTextCountCallback
            public final void onResult(int i2) {
                ax.h hVar = hVar;
                if (hVar != null) {
                    hVar.a(i2);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final int a(final ax.g gVar) {
        this.f151132c.a((RecordInvoker.OnARTextBitmapCallback) new RecordInvoker.OnARTextBitmapCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass31 */

            static {
                Covode.recordClassIndex(99405);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnARTextBitmapCallback
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                ax.g gVar = gVar;
                if (gVar != null) {
                    return gVar.a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(Bitmap bitmap) {
        return this.f151132c.a(bitmap);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(al alVar) {
        this.f151132c.a(alVar);
    }

    @Override // com.ss.android.vesdk.g
    public final void b(al alVar) {
        this.f151132c.b(alVar);
    }

    @Override // com.ss.android.vesdk.g
    public final void b(String str, String str2) {
        this.f151132c.b(str, str2);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, int i3, ax.d dVar) {
        AnonymousClass34 r4 = new e.d(System.currentTimeMillis(), false, dVar) {
            /* class com.ss.android.vesdk.d.AnonymousClass34 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f151206a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f151207b = false;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ax.d f151208c;

            static {
                Covode.recordClassIndex(99408);
            }

            @Override // com.ss.android.medialib.presenter.e.d
            public final void a(Bitmap bitmap, int i2) {
                com.ss.android.ttve.monitor.h.a(0, "te_record_shot_screen_time", System.currentTimeMillis() - this.f151206a);
                if ((i2 != 0 || this.f151207b) && d.this.f151139j != null) {
                    d.this.f151139j.b();
                }
                d.this.a(bitmap, "TECam_shotScreen_0");
                ax.d dVar = this.f151208c;
                if (dVar != null) {
                    dVar.a(bitmap, i2);
                }
            }

            {
                this.f151206a = r3;
                this.f151208c = r6;
            }
        };
        return this.f151132c.a(new int[]{i2, i3}, true, (e.d) r4, false);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(final be beVar) {
        if (!this.F) {
            an.c(f151130a, "mHasFirstFrameCaptured is false");
            if (beVar.f151080k != null) {
                beVar.f151080k.a(-100002);
            }
            return -100002;
        }
        VESize vESize = beVar.f151070a;
        if (vESize == null) {
            an.c(f151130a, "size is null, can not shotscreen");
            return -100;
        } else if (beVar.f151081l != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass35 r13 = new e.d() {
                /* class com.ss.android.vesdk.d.AnonymousClass35 */

                static {
                    Covode.recordClassIndex(99409);
                }

                @Override // com.ss.android.medialib.presenter.e.d
                public final void a(Bitmap bitmap, int i2) {
                    com.ss.android.ttve.monitor.h.a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                    if ((i2 != 0 || beVar.f151073d) && d.this.f151139j != null) {
                        d.this.f151139j.b();
                    }
                    d.this.a(bitmap, "TECam_shotScreen_2");
                    beVar.f151081l.a(bitmap, i2);
                }
            };
            if (beVar.f151082m != null) {
                AnonymousClass36 r15 = null;
                if (beVar.f151071b && beVar.f151075f) {
                    r15 = new e.AbstractC1303e() {
                        /* class com.ss.android.vesdk.d.AnonymousClass36 */

                        static {
                            Covode.recordClassIndex(99410);
                        }

                        @Override // com.ss.android.medialib.presenter.e.AbstractC1303e
                        public final void a(int[] iArr, int i2, int i3) {
                            VEFrame.createIntArrayFrame(iArr, i2, i3, 0, 0, VEFrame.a.TEPixFmt_ARGB8);
                        }
                    };
                }
                return this.f151132c.a(this.s.w, new int[]{vESize.width, vESize.height}, beVar.f151071b, r13, beVar.f151071b && beVar.f151075f, r15, beVar.f151079j);
            }
            return this.f151132c.a(new int[]{vESize.width, vESize.height}, beVar.f151071b, r13, beVar.f151078i);
        } else if (beVar.f151072c == null) {
            return 0;
        } else {
            return this.f151132c.a(beVar.f151072c, new int[]{vESize.width, vESize.height}, beVar.f151071b, beVar.f151074e, new a.c() {
                /* class com.ss.android.vesdk.d.AnonymousClass37 */

                static {
                    Covode.recordClassIndex(99411);
                }

                @Override // com.ss.android.medialib.b.a.c
                public final void a(int i2) {
                    if (beVar.f151080k != null) {
                        beVar.f151080k.a(i2);
                    }
                }
            }, beVar.f151078i);
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String[] strArr) {
        return this.f151132c.a(strArr, 0);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String str, String str2, float f2) {
        return this.f151132c.b(str, str2, f2);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String[] strArr, String[] strArr2, float[] fArr) {
        return this.f151132c.a(2, strArr, strArr2, fArr);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String[] strArr, int i2) {
        return this.f151132c.b(strArr, i2);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(VEEffectParams vEEffectParams) {
        return this.f151132c.a(vEEffectParams);
    }

    @Override // com.ss.android.medialib.listener.c
    public final void a() {
        Iterator it = this.aj.c().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void a(float f2, float f3, float f4, float f5) {
        this.f151132c.a(f2, f3, f4, f5);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(boolean z2, long j2) {
        this.f151132c.a(z2, j2);
    }

    @Override // com.ss.android.vesdk.g
    public final boolean a(bh bhVar, int i2) {
        return this.f151132c.a(bhVar, i2);
    }

    @Override // com.ss.android.vesdk.g
    public final void a(VEBaseRecorderLensParams vEBaseRecorderLensParams, final ax.q qVar) {
        this.ao = qVar;
        this.f151132c.a(vEBaseRecorderLensParams, new RecordInvoker.OnLensResultCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass40 */

            static {
                Covode.recordClassIndex(99415);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onError(int i2, int i3, String str) {
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onInfo(int i2, int i3, int i4, String str) {
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnLensResultCallback
            public final void onSuccess(int i2, float f2, int i3) {
                qVar.a(i2, f2, i3);
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f151132c.a(i2, vESafeAreaParamsArr);
        return 0;
    }

    public final void a(Bitmap bitmap, String str) {
        VEDebugSettings vEDebugSettings = this.bH;
        if (vEDebugSettings != null && vEDebugSettings.isNeedDumpCapture()) {
            String str2 = this.bH.getCapDumpDir() + File.separator + str + "_" + bitmap.getWidth() + "x" + bitmap.getHeight() + "_" + System.currentTimeMillis() + ".jpg";
            an.a(f151130a, "Start to dump bitmap to ".concat(String.valueOf(str2)));
            com.ss.android.medialib.b.b.a(bitmap, str2, Bitmap.CompressFormat.JPEG);
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int a(String str, int i2, int i3, Bitmap.CompressFormat compressFormat, ax.e eVar) {
        if (!this.F) {
            an.c(f151130a, "mHasFirstFrameCaptured is false");
            eVar.a(-100002);
            return -100002;
        }
        AnonymousClass32 r7 = new a.c(eVar, false) {
            /* class com.ss.android.vesdk.d.AnonymousClass32 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ax.e f151200a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f151201b = false;

            static {
                Covode.recordClassIndex(99406);
            }

            @Override // com.ss.android.medialib.b.a.c
            public final void a(int i2) {
                this.f151200a.a(i2);
            }

            {
                this.f151200a = r3;
            }
        };
        return this.f151132c.a(str, new int[]{i2, i3}, true, compressFormat, (a.c) r7, false);
    }

    @Override // com.ss.android.vesdk.g
    public final long l() {
        return this.f151132c.f();
    }

    @Override // com.ss.android.vesdk.g
    public final long m() {
        return this.f151132c.g();
    }

    @Override // com.ss.android.vesdk.g
    public final int n() {
        return this.f151132c.h();
    }

    @Override // com.ss.android.vesdk.g
    public final long v() {
        return this.f151132c.C();
    }

    @Override // com.ss.android.vesdk.g
    public final VEMapBufferInfo w() {
        return this.f151132c.E();
    }

    @Override // com.ss.android.vesdk.g
    public final EnigmaResult y() {
        return this.f151132c.u();
    }

    @Override // com.ss.android.vesdk.g
    public final com.ss.android.medialib.presenter.d z() {
        return this.f151132c.f59780j;
    }

    private void F() {
        if (this.aq != -1) {
            TEVideoUtils.resetModel(this.aq);
            this.aq = -1;
        }
    }

    private boolean G() {
        if (this.E || x()) {
            return true;
        }
        return false;
    }

    private boolean H() {
        if (this.az == aw.KARAOKE || this.az == aw.KARAOKE_PURE_AUDIO) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vesdk.g
    public final void A() {
        b(new Runnable(null) {
            /* class com.ss.android.vesdk.d.AnonymousClass39 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VEListener.j f151219a = null;

            static {
                Covode.recordClassIndex(99413);
            }

            public final void run() {
                int B = d.this.f151132c.B();
                an.a(d.f151130a, "startRender ret=".concat(String.valueOf(B)));
                VEListener.j jVar = this.f151219a;
                if (jVar != null) {
                    jVar.a(B);
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final void i() {
        r(false);
        s();
    }

    @Override // com.ss.android.vesdk.g
    public final String[] j() {
        return this.f151132c.j();
    }

    public final void r() {
        if (this.u != 0) {
            g(0);
            this.f151132c.e();
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void t() {
        com.ss.android.vesdk.b.a aVar = this.f151139j;
        if (aVar != null) {
            aVar.c();
        } else {
            an.c(f151130a, "No Camera capture to stopCameraPreview");
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void u() {
        super.u();
        this.f151132c.v();
    }

    public final boolean x() {
        if (this.M == aw.KARAOKE || this.M == aw.KARAOKE_PURE_AUDIO) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(99379);
    }

    private void D() {
        this.f151132c.B(((Boolean) u.a().a("video_duration_opt", (Object) false)).booleanValue());
    }

    private void E() {
        this.f151132c.C(((Boolean) u.a().a("enable_duet_gl_finish", (Object) false)).booleanValue());
    }

    @Override // com.ss.android.vesdk.g
    public final int[] f() {
        int[] c2 = this.f151132c.c();
        an.a(f151130a, "getReactRegionInViewPixel " + Arrays.toString(c2));
        return c2;
    }

    @Override // com.ss.android.vesdk.g
    public final float g() {
        float b2 = this.f151132c.b();
        an.a(f151130a, "getReactionWindowRotation ".concat(String.valueOf(b2)));
        return b2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.vesdk.g
    public final float[] p() {
        e eVar = this.f151132c;
        if (eVar == null) {
            return new float[]{0.0f, 0.0f};
        }
        return eVar.z();
    }

    @Override // org.libsdl.app.AudioRecorderInterfaceExt
    public void startMicError() {
        com.ss.android.ttve.monitor.h.a(0, "te_record_audio_mic_start_ret", 1061L);
        VEListener.ai aiVar = this.W;
        if (aiVar != null && (aiVar instanceof VEListener.ah)) {
            ((VEListener.ah) aiVar).a(1061, 0, "start audio record error.");
        }
    }

    private void C() {
        int intValue;
        this.at.getEncodeStandard();
        if (((Boolean) u.a().a("enable_record_mpeg4", (Object) false)).booleanValue()) {
            intValue = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
            an.a(f151130a, "setCodecType MPEG4");
        } else {
            intValue = ((Integer) u.a().a("ve_record_codec_type", (Object) 0)).intValue();
        }
        String str = f151130a;
        o.b(str, "setCodecType: ".concat(String.valueOf(intValue)));
        int g2 = this.f151132c.g(intValue);
        if (g2 != 0) {
            an.d(str, "setCodecType failed ".concat(String.valueOf(g2)));
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void d() {
        this.f151132c.a(true);
    }

    @Override // com.ss.android.vesdk.g
    public final int[] e() {
        int[] d2 = this.f151132c.d();
        an.a(f151130a, "getReactionPosMarginInViewPixel " + Arrays.toString(d2));
        return d2;
    }

    @Override // com.ss.android.vesdk.g
    public final void o() {
        MethodCollector.i(3466);
        if (this.bR) {
            MethodCollector.o(3466);
            return;
        }
        if (this.U != null) {
            this.U.f151347a.a();
        }
        bi.a("onDestroy");
        if (!this.bw) {
            a((VEListener.j) null, false);
        }
        if (this.T != null) {
            this.T.f151333c.b(this);
        }
        com.ss.android.vesdk.b.a aVar = this.f151139j;
        if (aVar != null) {
            aVar.d();
        }
        this.f151132c.f59777g = null;
        this.f151132c.a((com.ss.android.medialib.listener.a) null);
        this.f151132c.F();
        List<ax.n> list = this.y;
        if (list != null) {
            list.clear();
        }
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass10 */

            static {
                Covode.recordClassIndex(99381);
            }

            public final void run() {
                d.this.r();
                if (d.this.N != null) {
                    d.this.N.release();
                }
            }
        });
        if (!this.bJ.isShutdown()) {
            this.bJ.shutdown();
        }
        super.o();
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        this.bR = true;
        this.bu = false;
        this.bL = null;
        this.ak = null;
        this.an = null;
        bi.b();
        MethodCollector.o(3466);
    }

    private int B() {
        VESize vESize;
        VESize vESize2;
        if (this.u != 0) {
            an.c(f151130a, "initInternalRecorder called in a invalid state: " + this.u + "should be : 0");
            return -105;
        }
        if (this.au != null) {
            this.f151132c.a(this.au.f150678c, this.au.f150680e, this.au.f150679d);
        }
        this.f151132c.a(this.S);
        int i2 = this.at.getVideoRes().width;
        int i3 = this.at.getVideoRes().height;
        int i4 = !TextUtils.isEmpty(this.aA) ? 1 : 0;
        if (this.q.width == 0 || this.q.height == 0) {
            VEDisplaySettings vEDisplaySettings = this.s.B;
            if (vEDisplaySettings == null || vEDisplaySettings.f150760i == null || (vESize2 = vEDisplaySettings.f150761j) == null) {
                vESize = new VESize(this.s.f150945a.height, this.s.f150945a.width);
            } else {
                vESize = new VESize(vESize2.height, vESize2.width);
            }
        } else {
            vESize = this.q;
        }
        int a2 = this.f151132c.a(vESize.width, vESize.height, this.f151137h, i3, i2, this.av, i4, this.aw, this.bT, this.aZ);
        if (this.aZ) {
            this.f151132c.a(this.aY);
        }
        int a3 = this.f151132c.a(this.aU, this.aW);
        int a4 = this.f151132c.a(this.bX, this.bY);
        C();
        D();
        E();
        this.q = vESize;
        if (a3 != 0) {
            an.d(f151130a, "setEnableAEC failed ".concat(String.valueOf(a3)));
        }
        if (a4 != 0) {
            an.d(f151130a, "setLoudness failed ".concat(String.valueOf(a4)));
        }
        if (a2 == 0) {
            g(1);
        }
        return a2;
    }

    public final synchronized void s() {
        MethodCollector.i(2518);
        String str = f151130a;
        an.a(str, "stopRecordPreview enter");
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = this.u;
        if ((i2 & 2) == 0) {
            an.d(str, "stopRecordPreview status error: " + this.u);
            MethodCollector.o(2518);
            return;
        }
        if (i2 == 3 && this.s.C) {
            this.f151132c.r();
            this.f151132c.m(false);
            int k2 = k();
            if (this.W != null && (this.W instanceof VEListener.ah)) {
                ((VEListener.ah) this.W).a(1022, k2, "stopRecord in stopPreview!!");
            }
        }
        if (this.W != null && (this.W instanceof VEListener.ah)) {
            ((VEListener.ah) this.W).a(1060, 1, "calling mic release func");
        }
        this.f151132c.q();
        g(1);
        if (G() && !this.bu) {
            an.b(str, "mVEAudioCapture release: stopRecordPreview");
            this.U.release(this.I);
            this.L = 0;
        }
        e eVar = this.f151132c;
        if (!eVar.f59775e && eVar.f59772b != null) {
            eVar.f59772b.unInit();
            eVar.f59772b = null;
        }
        if (this.W != null && (this.W instanceof VEListener.ah)) {
            ((VEListener.ah) this.W).a(1060, 2, "mic released func");
        }
        this.f151132c.a((com.ss.android.medialib.listener.b) null);
        this.f151132c.a((RecordInvoker.OnRunningErrorCallback) null);
        this.f151132c.b(this);
        b(this.bM);
        this.bM = null;
        if (this.bF) {
            r();
        } else {
            g(1);
        }
        com.ss.android.ttve.monitor.h.a(0, "te_record_preview_destroy_time", System.currentTimeMillis() - currentTimeMillis);
        TEMonitorInvoker.nativeMonitorPerfWithType(0);
        this.bW = true;
        F();
        an.a(str, "stopRecordPreview exit");
        MethodCollector.o(2518);
    }

    public final synchronized int k() {
        float f2;
        int i2;
        MethodCollector.i(3458);
        int i3 = this.u;
        if (i3 == 3 || i3 == 4) {
            if (this.bu && this.bU) {
                g.INSTANCE.stopFeedPCM();
            }
            bi.a("stopRecord");
            this.bN = false;
            this.bO = false;
            if (this.bs) {
                b.EnumC1343b bVar = b.EnumC1343b.BOOST_CPU;
                u.d a2 = u.a().a("ve_vboost_timeout");
                if (a2 == null || !(a2.f151496b instanceof Integer)) {
                    i2 = 50;
                } else {
                    i2 = ((Integer) a2.f151496b).intValue();
                }
                new b.a(bVar, i2);
                this.f151132c.l();
                new b.a(b.EnumC1343b.RESTORE_CPU);
            } else {
                this.f151132c.l();
            }
            this.bN = true;
            this.f151132c.n();
            if (this.bO && this.W != null && (this.W instanceof VEListener.ah)) {
                ((VEListener.ah) this.W).a(1021, 0, "Update segmentation time.");
            }
            long f3 = (long) (((float) this.f151132c.f()) / 1000.0f);
            this.f151131b.add(new com.ss.android.medialib.model.c(f3, (double) this.bB));
            synchronized (o) {
                try {
                    this.bC = -1;
                    f2 = (float) f3;
                    this.f151138i = (long) (((float) this.f151138i) + ((1.0f * f2) / this.bB));
                } catch (Throwable th) {
                    MethodCollector.o(3458);
                    throw th;
                }
            }
            if (this.u == 3) {
                g(2);
            } else {
                g(1);
            }
            if (System.currentTimeMillis() - this.D.f151050e > 1000) {
                com.ss.android.ttve.monitor.h.a(0, "te_record_camera_sensor_interval_variance", this.D.a());
                com.ss.android.ttve.monitor.h.a(0, "te_record_camera_sensor_interval_mean", this.D.b());
                com.ss.android.ttve.monitor.h.a(0, "te_record_camera_sensor_interval_range", this.D.c());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("variance", this.D.a());
                    jSONObject.put("mean", this.D.b());
                    jSONObject.put("range", this.D.c());
                    com.ss.android.ttve.monitor.b.a("vesdk_event_camera_sensor_frame_interval", jSONObject, "performance", false, true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            b bVar2 = this.D;
            bVar2.f151046a.clear();
            bVar2.f151048c = -1.0d;
            bVar2.f151049d = -1.0d;
            bVar2.f151047b = -1.0d;
            bi.b();
            this.bW = true;
            com.ss.android.ttve.monitor.h.a(0, "te_record_mode", (long) this.az.ordinal());
            int i4 = (int) (f2 / this.bB);
            MethodCollector.o(3458);
            return i4;
        }
        an.d(f151130a, "nativeStopRecord called in a invalid state: " + this.u);
        MethodCollector.o(3458);
        return -105;
    }

    @Override // com.ss.android.vesdk.g
    public final void a(Runnable runnable) {
        RecordInvoker.setDuetVideoCompleteCallback(runnable);
    }

    @Override // com.ss.android.vesdk.g
    public final void f(int i2) {
        this.f151132c.d(i2);
    }

    @Override // com.ss.android.vesdk.g
    public final void g(boolean z2) {
        this.f151132c.q(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void h(boolean z2) {
        this.f151132c.x = z2;
    }

    @Override // com.ss.android.vesdk.g
    public final int i(boolean z2) {
        return this.f151132c.r(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void j(boolean z2) {
        this.f151132c.s(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void p(boolean z2) {
        this.f151132c.z(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void q(boolean z2) {
        this.f151132c.a(24, z2);
    }

    @Override // com.ss.android.vesdk.g
    public final int e(int i2) {
        return this.f151132c.j(i2, 0);
    }

    @Override // com.ss.android.vesdk.g
    public final void f(boolean z2) {
        this.f151132c.u(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void k(boolean z2) {
        if (z2) {
            this.f151132c.b(this.S);
        } else {
            this.f151132c.x();
        }
    }

    @Override // com.ss.android.vesdk.g
    public final void l(boolean z2) {
        this.f151132c.x(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void m(boolean z2) {
        this.f151132c.w(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final void n(boolean z2) {
        this.f151132c.A(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final float a(String str) {
        return this.f151132c.c(str);
    }

    @Override // com.ss.android.vesdk.g
    public final void c(final VEListener.j jVar) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass9 */

            static {
                Covode.recordClassIndex(99423);
            }

            public final void run() {
                MethodCollector.i(2541);
                synchronized (d.this) {
                    try {
                        if (d.this.u == 3) {
                            an.d(d.f151130a, "deleteLastFrag could not be executed in mode: " + d.this.u);
                            VEListener.j jVar = jVar;
                            if (jVar != null) {
                                jVar.a(-105);
                            }
                            return;
                        }
                        int size = d.this.f151131b.size();
                        if (size > 0) {
                            d.this.f151131b.remove(size - 1);
                            d dVar = d.this;
                            dVar.f151138i = (long) com.ss.android.medialib.model.c.a(dVar.f151131b);
                        }
                        d.this.f151132c.i();
                        VEListener.j jVar2 = jVar;
                        if (jVar2 != null) {
                            jVar2.a(0);
                        }
                        MethodCollector.o(2541);
                    } finally {
                        MethodCollector.o(2541);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.vesdk.g
    public final int d(final VEListener.j jVar) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass20 */

            static {
                Covode.recordClassIndex(99392);
            }

            public final void run() {
                if (d.this.u != 2) {
                    an.d(d.f151130a, "stopPrePlay in state:" + d.this.u);
                    return;
                }
                int m2 = d.this.f151132c.m();
                d.this.C = true;
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(m2);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final void e(final VEListener.j jVar) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass38 */

            static {
                Covode.recordClassIndex(99412);
            }

            public final void run() {
                int A = d.this.f151132c.A();
                an.a(d.f151130a, "pauseRender ret=".concat(String.valueOf(A)));
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(A);
                }
            }
        });
    }

    private void g(int i2) {
        an.a(f151130a, "update cur record status from [" + this.u + "] to [" + i2 + "]");
        this.u = i2;
    }

    private void r(boolean z2) {
        this.f151132c.k(true);
        if (this.f151139j != null) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_CAMERA), VESensService.b.PRIVACY_STATUS_RELEASE);
            this.f151139j.a(z2);
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int b(final ax.h hVar) {
        return this.f151132c.a((RecordInvoker.OnARTextContentCallback) new RecordInvoker.OnARTextContentCallback() {
            /* class com.ss.android.vesdk.d.AnonymousClass30 */

            static {
                Covode.recordClassIndex(99404);
            }

            @Override // com.ss.android.medialib.RecordInvoker.OnARTextContentCallback
            public final void onResult(String[] strArr) {
                ax.h hVar = hVar;
                if (hVar != null) {
                    hVar.a(strArr);
                }
            }
        });
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int closeWavFile(boolean z2) {
        an.b(f151130a, "closeWavFile...");
        this.bO = true;
        if (this.bN && this.W != null && (this.W instanceof VEListener.ah)) {
            ((VEListener.ah) this.W).a(1021, 0, "Update segmentation time.");
        }
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final boolean e(boolean z2) {
        return this.f151132c.n(z2);
    }

    public final void o(boolean z2) {
        boolean z3 = false;
        boolean booleanValue = ((Boolean) u.a().a("ve_enable_sys_karaoke", (Object) false)).booleanValue();
        m.a a2 = new m.a().a(z2 ? 1 : 0).a(z2);
        if (booleanValue && this.br) {
            z3 = true;
        }
        this.bZ = a2.b(z3).f151360a;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onError(int i2) {
        an.d(f151130a, "running error: ".concat(String.valueOf(i2)));
        int i3 = -601;
        if (i2 == -602) {
            i3 = -602;
        } else if (i2 != -601) {
            i3 = 0;
        }
        if (this.W instanceof VEListener.ah) {
            ((VEListener.ah) this.W).a(i3, "");
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int b(String str) {
        return this.f151132c.d(str);
    }

    public final int c(boolean z2) {
        if (!this.s.f150946b && !z2) {
            return 0;
        }
        if (this.az == aw.DUET || this.az == aw.REACTION || this.az == aw.CUSTOM_VIDEO_BG) {
            return 5;
        }
        if (TextUtils.isEmpty(this.aA)) {
            return 1;
        }
        if (z2) {
            return 5;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.d.c(int):void");
    }

    @Override // com.ss.android.vesdk.g
    public final void d(int i2) {
        this.f151132c.f(i2);
    }

    @Override // com.ss.android.vesdk.g
    public final void c(String str) {
        this.f151132c.e(str);
    }

    @Override // com.ss.android.vesdk.g
    public final void d(boolean z2) {
        this.f151132c.t(z2);
    }

    @Override // com.ss.android.vesdk.g
    public final synchronized int a(float f2) {
        int i2;
        boolean z2;
        MethodCollector.i(3449);
        VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
        if (this.at == null) {
            MethodCollector.o(3449);
            return -108;
        }
        if (this.u == 2) {
            g(3);
        } else if ((this.M == aw.KARAOKE_PURE_AUDIO || this.az == aw.AUDIO) && this.u == 1) {
            g(4);
        } else {
            an.d(f151130a, "nativeStartRecord called in a invalid state: " + this.u + "should be : 2");
            int i3 = this.u;
            if (i3 == 3 || i3 == 4) {
                MethodCollector.o(3449);
                return -115;
            }
            MethodCollector.o(3449);
            return -105;
        }
        bi.a("startRecord");
        if (this.bu && this.bU) {
            g.INSTANCE.startFeedPCM();
        }
        c(c(true));
        this.f151132c.b(this.S, c(true), this);
        this.bB = f2;
        this.f151132c.a(this.aB, this.f151138i);
        if (this.at.getBitrateMode() == VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
            int swCRF = this.at.getSwCRF();
            e eVar = this.f151132c;
            int ordinal = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            eVar.c(ordinal, swCRF);
        } else {
            this.f151132c.c(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.at.getSwQP());
        }
        float bps = (((float) this.at.getBps()) * 1.0f) / 4194304.0f;
        if (this.at.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
            i2 = 2;
        } else if (this.at.getEncodeProfile() == VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
            i2 = 8;
        } else {
            i2 = 1;
        }
        this.f151132c.p(this.aS);
        if (this.aT != null) {
            if (this.aT.waterMarkBitmap == null) {
                this.f151132c.a(this.aT.images, this.aT.width, this.aT.height, this.aT.xOffset, this.aT.yOffset, this.aT.position.ordinal(), this.aT.interval, this.aT.rotation);
            } else {
                this.f151132c.a(this.aT.waterMarkBitmap, this.aT.width, this.aT.height, this.aT.xOffset, this.aT.yOffset, this.aT.position.ordinal(), this.aT.interval, this.aT.rotation);
            }
        }
        final VEListener.f fVar = this.al;
        AnonymousClass6 r5 = new e.b() {
            /* class com.ss.android.vesdk.d.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99420);
            }

            @Override // com.ss.android.medialib.presenter.e.b
            public final void a(int i2) {
                com.ss.android.ttve.monitor.h.a(0, "te_record_audio_start_record_ret", (long) i2);
            }
        };
        e eVar2 = this.f151132c;
        if (!eVar2.f59775e && eVar2.f59772b != null) {
            eVar2.f59772b.setAudioRecordStateCallack(r5);
        }
        if (G() && !this.bu && this.f151132c.k()) {
            d("startRecord");
            an.b(f151130a, "mVEAudioCapture start: startRecord");
            this.U.start(this.I);
        }
        e eVar3 = this.f151132c;
        double d2 = (double) f2;
        if (!this.at.isSupportHwEnc()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a2 = eVar3.a(d2, z2, bps, i2, this.at.getDescription(), this.at.getComment());
        if (a2 != 0) {
            an.d(f151130a, "nativeStartRecord error: ".concat(String.valueOf(a2)));
        }
        com.ss.android.ttve.monitor.h.a(0, "te_titan_engine", 0L);
        com.ss.android.ttve.monitor.h.a(0, "te_record_start_record_ret", (long) a2);
        int outputAudioDeviceType = TESystemUtils.getOutputAudioDeviceType();
        long j2 = (long) outputAudioDeviceType;
        com.ss.android.ttve.monitor.h.a(0, "te_record_audio_device", j2);
        an.a(f151130a, "output audio device: ".concat(String.valueOf(outputAudioDeviceType)));
        com.ss.android.ttve.editorInfo.a.a("te_record_audio_device", j2);
        synchronized (o) {
            try {
                this.bC = 0;
            } catch (Throwable th) {
                MethodCollector.o(3449);
                throw th;
            }
        }
        bi.b();
        MethodCollector.o(3449);
        return a2;
    }

    public final boolean d(String str) {
        if (this.L != 0) {
            return false;
        }
        an.b(f151130a, "mVEAudioCapture init ".concat(String.valueOf(str)));
        this.L = 1;
        this.U.b(this.bV);
        this.U.a(this.bV);
        this.U.init(this.bZ);
        return true;
    }

    public final synchronized int b(Surface surface) {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        VEDisplaySettings vEDisplaySettings;
        MethodCollector.i(2511);
        this.bQ = System.currentTimeMillis();
        if (this.W != null && (this.W instanceof VEListener.ah)) {
            ((VEListener.ah) this.W).a(1020, 0, "You can replace the Res Manager here.");
        }
        if (this.u == 0) {
            r();
            int B2 = B();
            if (B2 != 0) {
                an.d(f151130a, "nativeInitBeautyPlay error: ".concat(String.valueOf(B2)));
                MethodCollector.o(2511);
                return -108;
            }
            if (this.ak != null) {
                a(this.ak);
            }
            if (this.an != null) {
                final ax.a aVar = this.an;
                this.an = aVar;
                this.f151132c.a(this.S, new AudioManagerCallback() {
                    /* class com.ss.android.vesdk.d.AnonymousClass41 */

                    static {
                        Covode.recordClassIndex(99416);
                    }
                });
            }
        }
        if (this.u != 1) {
            an.d(f151130a, "startRecordPreview statue error: " + this.u);
            if (this.bE != surface) {
                a(surface);
                this.bE = surface;
            }
            MethodCollector.o(2511);
            return -105;
        }
        this.bE = surface;
        this.f151142m = -1;
        this.r = 0;
        this.f151140k.width = 0;
        this.f151140k.height = 0;
        this.f151132c.a(this.ar);
        boolean z5 = this.bF;
        this.bF = z5;
        this.f151132c.D(z5);
        if (this.bF) {
            this.f151132c.c(this.aE);
        }
        this.f151132c.a(this.aP);
        this.f151132c.b(this.aQ);
        this.f151132c.o(this.aN);
        VESize videoRes = this.at.getVideoRes();
        if (this.aO.isValid() && !videoRes.equals(this.aO)) {
            this.f151132c.a(this.aO.width, this.aO.height);
            videoRes.width = this.aO.width;
            videoRes.height = this.aO.height;
        }
        if (this.az == aw.DUET) {
            this.f151132c.a(this.ax.f151503a, this.ax.f151504b, this.ax.f151505c, this.ax.f151506d, this.ax.f151507e, this.ax.f151508f, this.ax.f151509g, this.ax.f151510h.ordinal());
        } else if (this.az == aw.REACTION) {
            this.f151132c.a(this.S, this.ay.f150991a, this.ay.f150992b);
        } else {
            e a2 = this.f151132c.a(this.aA);
            if (this.aD == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            a2.f59774d = z2;
            a2.a(this.aB, this.aC, 0);
        }
        this.f151132c.a();
        e eVar = this.f151132c;
        at atVar = this.s;
        if (((Boolean) u.a().a("ve_async_detection", (Object) true)).booleanValue()) {
            atVar.f150947c = true;
        }
        eVar.l(atVar.f150947c);
        this.f151132c.a((com.ss.android.medialib.listener.b) this);
        this.f151132c.a((RecordInvoker.OnRunningErrorCallback) this);
        e eVar2 = this.f151132c;
        at atVar2 = this.s;
        if (((Boolean) u.a().a("ve_opt_first_frame", (Object) false)).booleanValue()) {
            atVar2.f150953i = true;
        }
        eVar2.q(atVar2.f150953i);
        this.f151132c.n(this.s.f150955k);
        this.f151132c.b(this.aR);
        this.f151132c.a((com.ss.android.medialib.listener.c) this);
        e eVar3 = this.f151132c;
        at atVar3 = this.s;
        if (((Boolean) u.a().a("ve_enable_three_buffer", (Object) false)).booleanValue()) {
            atVar3.f150957m = true;
        }
        eVar3.c(atVar3.f150957m);
        e eVar4 = this.f151132c;
        at atVar4 = this.s;
        if (((Boolean) u.a().a("ve_enable_preload_effect_res", (Object) false)).booleanValue()) {
            atVar4.n = true;
        }
        eVar4.d(atVar4.n);
        this.f151132c.a(this.s.p);
        this.f151132c.e(this.s.q);
        this.f151132c.f(this.s.r);
        this.f151132c.g(this.bF);
        this.f151132c.b(this.s.u, this.s.v);
        e eVar5 = this.f151132c;
        if (this.s.s.ordinal() == at.b.RecordOriginContent.ordinal()) {
            z3 = true;
        } else {
            z3 = false;
        }
        eVar5.v(z3);
        e eVar6 = this.f151132c;
        at atVar5 = this.s;
        if (((Boolean) u.a().a("ve_enable_titan_auto_test_log", (Object) false)).booleanValue()) {
            atVar5.f150952h = true;
        }
        eVar6.j(atVar5.f150952h);
        if (this.s.F) {
            this.f151132c.s();
        }
        if (!this.bF) {
            VEDisplaySettings vEDisplaySettings2 = this.t;
            if (vEDisplaySettings2 == null) {
                vEDisplaySettings2 = this.s.B;
            }
            this.bF = false;
            if (vEDisplaySettings2 != null) {
                z4 = true;
            } else {
                z4 = false;
                VEDisplaySettings.a aVar2 = new VEDisplaySettings.a();
                aVar2.f150765a.f150761j = this.s.f150945a;
                vEDisplaySettings2 = aVar2.f150765a;
            }
            VESize vESize = vEDisplaySettings2.f150761j;
            VESize vESize2 = vEDisplaySettings2.f150762k;
            VESize vESize3 = vEDisplaySettings2.f150763l;
            as asVar = vEDisplaySettings2.f150760i;
            if (asVar != null) {
                if (this.bG || (vEDisplaySettings = this.t) == null || !vEDisplaySettings.equals(vEDisplaySettings2)) {
                    this.bG = false;
                    this.t = vEDisplaySettings2;
                    this.aE = asVar.ordinal();
                    if (vESize.isValid()) {
                        int i8 = vESize.height;
                        int i9 = vESize.width;
                        this.q.width = i8;
                        this.q.height = i9;
                    }
                } else {
                    an.c(f151130a, "set same display settings...");
                }
            }
            e eVar7 = this.f151132c;
            int ordinal = vEDisplaySettings2.f150754c.ordinal();
            long j2 = vEDisplaySettings2.f150758g;
            float f2 = vEDisplaySettings2.f150759h;
            int i10 = vEDisplaySettings2.f150755d;
            if (vESize == null) {
                i5 = 0;
                i6 = 0;
            } else {
                i5 = vESize.width;
                i6 = vESize.height;
            }
            int ordinal2 = vEDisplaySettings2.n.ordinal();
            float f3 = vEDisplaySettings2.o;
            int i11 = vEDisplaySettings2.f150752a;
            int i12 = vEDisplaySettings2.f150753b;
            int i13 = vESize2.width;
            int i14 = vESize2.height;
            int i15 = vESize3.width;
            int i16 = vESize3.height;
            if (asVar != null) {
                i7 = this.aE;
            } else {
                i7 = -1;
            }
            if (eVar7.a(ordinal, j2, f2, i10, i5, i6, ordinal2, f3, i11, i12, i13, i14, i15, i16, z4, i7) != 0) {
                this.bG = true;
            }
        }
        if (surface != null) {
            i2 = this.f151132c.a(surface, Build.DEVICE);
        } else {
            if (this.T != null) {
                i3 = this.T.f151331a;
            } else {
                i3 = -1;
            }
            if (this.T != null) {
                i4 = this.T.f151332b;
            } else {
                i4 = -1;
            }
            i2 = this.f151132c.h(i3, i4);
        }
        if (i2 != 0) {
            an.d(f151130a, "nativeStartPlay error: ".concat(String.valueOf(i2)));
        }
        com.ss.android.ttve.monitor.h.a(0, "te_record_start_preview_ret", (long) i2);
        g(2);
        if (x()) {
            this.f151132c.h(true);
        } else {
            this.f151132c.h(this.E);
            this.f151132c.a(this.S, c(false), this);
        }
        synchronized (this.bK) {
            try {
                if (!this.f151131b.isEmpty()) {
                    int a3 = this.f151132c.a(this.f151131b.size(), this.f151137h);
                    if (a3 != 0) {
                        an.d(f151130a, "tryRestore ret: ".concat(String.valueOf(a3)));
                    } else {
                        this.f151138i = (long) com.ss.android.medialib.model.c.a(this.f151131b);
                    }
                }
            } finally {
                MethodCollector.o(2511);
            }
        }
        if (this.s.f150948d) {
            VESensService.getInstance().setSensCheckObjExpectStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_USING);
            e eVar8 = this.f151132c;
            float f4 = this.bB;
            if (eVar8.s && eVar8.f59772b != null && !eVar8.f59775e) {
                eVar8.f59772b.startRecording((double) f4, false);
            }
        }
        return i2;
    }

    @Override // com.ss.android.vesdk.g
    public final void b(float f2) {
        this.f151132c.c(f2);
    }

    @Override // com.ss.android.vesdk.g
    public final int c(float f2, float f3) {
        return this.f151132c.c(f2, f3);
    }

    @Override // com.ss.android.vesdk.g
    public final int d(float f2, float f3) {
        return this.f151132c.d(f2, f3);
    }

    @Override // com.ss.android.vesdk.g
    public final int e(float f2, float f3) {
        return this.f151132c.e(f2, f3);
    }

    @Override // com.ss.android.vesdk.g
    public final int d(int i2, int i3) {
        b(new f(this, i2, i3));
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int b(float f2, float f3) {
        return this.f151132c.b(f2, f3);
    }

    @Override // com.ss.android.vesdk.g
    public final int c(int i2, int i3) {
        an.a(f151130a, "removeTrack trackIndex " + i3 + " trackType " + i2);
        if (H()) {
            return this.f151132c.i(i2, i3);
        }
        return a(this.f151133d, this.f151134e, this.f151135f, this.f151136g);
    }

    @Override // com.ss.android.vesdk.g
    public final int d(String str, String str2) {
        return this.f151132c.d(str, str2);
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onAccurateInfo(int i2, double d2) {
        switch (i2) {
            case 1072:
                this.bm = d2;
                break;
            case 1073:
                this.bn = d2;
                break;
            case 1074:
                this.bp = d2;
                break;
            case 1075:
                this.bo = d2;
                break;
        }
        if (i2 == aj.y || i2 == aj.z || i2 == aj.F || i2 == aj.J) {
            a(i2, 0, (float) d2, "");
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int a(float f2, float f3) {
        this.aH.f61164c = f2;
        this.aH.f61165d = f3;
        this.f151132c.a(f2, f3);
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int b(String str, float f2) {
        this.aJ.f61171a = str;
        this.aJ.f61174d = f2;
        this.aJ.f61175e = f2;
        this.aJ.f61176f = true;
        if (TextUtils.isEmpty(str)) {
            this.f151132c.b("");
            return 0;
        }
        this.f151132c.b(str);
        return 0;
    }

    public d(Context context, com.ss.android.vesdk.runtime.e eVar) {
        super(context, eVar, null);
        VESize vESize = new VESize(1280, 720);
        this.bx = vESize;
        this.f151141l = vESize;
        this.f151142m = -1;
        this.q = new VESize(0, 0);
        this.bF = false;
        this.r = 0;
        this.bG = false;
        this.t = null;
        this.bH = null;
        this.u = 0;
        this.bI = false;
        this.v = new h();
        l.a a2 = l.a(com.ss.android.ugc.aweme.cw.o.FIXED);
        a2.f79174c = 1;
        this.bJ = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        this.w = new a<>();
        this.bK = new Object();
        this.bM = null;
        this.z = 3;
        this.A = false;
        this.B = new ConditionVariable();
        this.bN = false;
        this.bO = false;
        this.bP = false;
        this.C = true;
        this.D = new b();
        this.bQ = 0;
        this.bR = false;
        this.bS = false;
        this.E = false;
        this.F = false;
        this.bT = false;
        this.bU = false;
        this.bV = new h() {
            /* class com.ss.android.vesdk.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99380);
            }

            @Override // com.ss.android.vesdk.audio.h
            public final void onError(int i2, int i3, String str) {
            }

            @Override // com.ss.android.vesdk.audio.h
            public final void onReceive(j jVar) {
                if (jVar.f150986a instanceof j.a) {
                    d.this.f151132c.a(((j.a) jVar.f150986a).f150989a, jVar.f150987b, jVar.f150988c);
                } else if (d.this.N != null) {
                    d.this.N.onReceive(jVar);
                }
            }

            @Override // com.ss.android.vesdk.audio.h
            public final void onInfo(int i2, int i3, double d2, Object obj) {
                if (i2 != aj.M) {
                    return;
                }
                if (i3 == 0) {
                    m mVar = (m) obj;
                    d.this.f151132c.initAudioConfig(mVar.f151352b, mVar.f151351a, d.this.au.f150678c, d.this.au.f150680e, d.this.au.f150679d);
                    an.a(d.f151130a, "mVEAudioCapture inited: channelCount:" + mVar.f151351a + " sampleHz:" + mVar.f151352b + " encode sample rate:" + d.this.au.f150678c + " encode channel count:" + d.this.au.f150680e);
                    if (mVar.f151355e == 1 && d.this.N != null) {
                        d.this.N.onInfo(i2, 0, d2, obj);
                    }
                    d.this.L = 2;
                    return;
                }
                an.a(d.f151130a, "initAudio error:".concat(String.valueOf(i3)));
                d.this.L = 0;
            }
        };
        this.bW = false;
        this.bX = false;
        this.bY = -16;
        this.I = null;
        this.J = -1;
        this.K = -1;
        this.bZ = new m.a().f151360a;
        this.L = 0;
        this.M = aw.DEFAULT;
        this.P = new LandMarkFrame();
        this.Q = bc.a();
        this.R = new b.AbstractC4059b() {
            /* class com.ss.android.vesdk.d.AnonymousClass21 */

            /* renamed from: b  reason: collision with root package name */
            private float f151175b = -1.0f;

            static {
                Covode.recordClassIndex(99393);
            }

            @Override // com.ss.android.vesdk.d.b.a, com.ss.android.ttvecamera.j.b.a
            public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
                d.this.f151132c.w = surfaceTexture;
                d.this.v.f151321b = surfaceTexture;
            }

            @Override // com.ss.android.vesdk.d.b.a
            public final void a(TEFrameSizei tEFrameSizei) {
                d.this.f151132c.g(tEFrameSizei.f61374a, tEFrameSizei.f61375b);
            }

            @Override // com.ss.android.vesdk.d.b.AbstractC4059b
            public final void a(Object obj) {
                boolean z;
                h hVar = d.this.v;
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                hVar.f151325f = z;
                d.this.f151132c.a(obj);
            }

            @Override // com.ss.android.vesdk.d.b.a, com.ss.android.ttvecamera.j.b.a
            public final void onFrameCaptured(i iVar) {
                MethodCollector.i(2777);
                long currentTimeMillis = System.currentTimeMillis();
                if (d.this.u == 0) {
                    an.c(d.f151130a, "Frame captured in idle status!");
                    MethodCollector.o(2777);
                    return;
                }
                int i2 = 1;
                if (!d.this.F) {
                    this.f151175b = ((Float) u.a().a("ve_recorder_fps_downgrade", Float.valueOf(-1.0f))).floatValue();
                    an.a(d.f151130a, "camera texture size : [ " + d.this.f151140k.width + "," + d.this.f151140k.height + "]");
                    d.this.F = true;
                }
                if (!(d.this.f151140k.width == iVar.f61568c.f61589c.f61374a && d.this.f151140k.height == iVar.f61568c.f61589c.f61375b)) {
                    d.this.f151140k.width = iVar.f61568c.f61589c.f61374a;
                    d.this.f151140k.height = iVar.f61568c.f61589c.f61375b;
                }
                if (!(d.this.r == iVar.f61568c.f61594h && d.this.f151142m == iVar.f61568c.f61592f)) {
                    synchronized (d.o) {
                        try {
                            d.this.r = iVar.f61568c.f61594h;
                            d.this.f151142m = iVar.f61568c.f61592f;
                            d.this.n = true;
                        } catch (Throwable th) {
                            MethodCollector.o(2777);
                            throw th;
                        }
                    }
                }
                i.b bVar = iVar.f61568c.f61590d;
                float[] fArr = null;
                p pVar = null;
                byte[] bArr = null;
                if (bVar == i.b.PIXEL_FORMAT_OpenGL_OES || bVar == i.b.PIXEL_FORMAT_Recorder) {
                    int i3 = 0;
                    if (d.this.Q.f151067e) {
                        d.this.P.setInfo(d.this.Q.f151064b, d.this.Q.f151065c, d.this.Q.f151066d);
                        d.this.f151132c.y(true);
                        d.this.f151132c.a(d.this.P);
                    } else {
                        d.this.f151132c.y(false);
                    }
                    if (d.this.u == 3) {
                        double b2 = d.this.v.b();
                        b bVar2 = d.this.D;
                        if (bVar2.f151051f) {
                            if (bVar2.f151046a.size() == 0) {
                                bVar2.f151050e = System.currentTimeMillis();
                                bVar2.f151046a.offer(Double.valueOf(0.0d));
                            } else {
                                bVar2.f151046a.add(Double.valueOf(b2 - bVar2.f151047b));
                            }
                            bVar2.f151047b = b2;
                        }
                    }
                    e eVar = d.this.f151132c;
                    if (iVar.f61568c instanceof i.d) {
                        i3 = ((i.d) iVar.f61568c).f61587a;
                    }
                    if (iVar.f61568c instanceof i.d) {
                        fArr = ((i.d) iVar.f61568c).f61588b;
                    }
                    eVar.a(i3, fArr, d.this.x.f151258i);
                } else if (iVar.f61568c.f61591e == 3) {
                    if (iVar.f61568c instanceof i.f) {
                        pVar = ((i.f) iVar.f61568c).f61595a;
                    }
                    ImageFrame imageFrame = new ImageFrame(TEPlanUtils.convert(pVar), -2, iVar.f61568c.f61589c.f61374a, iVar.f61568c.f61589c.f61375b);
                    if (d.this.as == null || d.this.as.x == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        d.this.f151132c.b((double) (iVar.f61566a / 1000));
                        d.this.f151132c.a(imageFrame, d.this.x.f151258i);
                    } else if (d.this.as.x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        d.this.f151132c.a(imageFrame, d.this.v.f151320a, d.this.x.f151258i);
                    }
                } else if (bVar == i.b.PIXEL_FORMAT_NV21 || bVar == i.b.PIXEL_FORMAT_JPEG) {
                    if (bVar == i.b.PIXEL_FORMAT_NV21) {
                        i2 = -3;
                    }
                    if (iVar.f61568c instanceof i.a) {
                        bArr = ((i.a) iVar.f61568c).f61573b;
                    }
                    ImageFrame imageFrame2 = new ImageFrame(bArr, i2, iVar.f61568c.f61589c.f61374a, iVar.f61568c.f61589c.f61375b);
                    if (d.this.as == null || d.this.as.x == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                        d.this.f151132c.b((double) (iVar.f61566a / 1000));
                        d.this.f151132c.a(imageFrame2, d.this.x.f151258i);
                    } else if (d.this.as.x == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        d.this.f151132c.a(imageFrame2, d.this.v.f151320a, d.this.x.f151258i);
                    }
                } else {
                    an.d(d.f151130a, "Not support now!!");
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                float f2 = this.f151175b;
                if (f2 > 0.001f) {
                    double d2 = (double) f2;
                    Double.isNaN(d2);
                    long j2 = (long) (1000.0d / d2);
                    if (j2 > currentTimeMillis2) {
                        long j3 = j2 - currentTimeMillis2;
                        try {
                            Thread.sleep(j3);
                            an.b(d.f151130a, "FrameSleep: " + j3 + "ms");
                            MethodCollector.o(2777);
                            return;
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                MethodCollector.o(2777);
            }

            @Override // com.ss.android.vesdk.d.b.AbstractC4059b
            public final void a(SurfaceTexture surfaceTexture, boolean z) {
                onNewSurfaceTexture(surfaceTexture);
                d.this.v.f151324e = true;
            }
        };
        this.ca = new a.b() {
            /* class com.ss.android.vesdk.d.AnonymousClass22 */

            static {
                Covode.recordClassIndex(99394);
            }

            @Override // com.ss.android.medialib.b.a.b
            public final void c() {
                an.e(d.f151130a, "onOpenGLDestroy");
                d.this.t = null;
                h hVar = d.this.v;
                if (hVar.f151321b != null) {
                    hVar.f151321b.release();
                    hVar.f151321b = null;
                }
                if (hVar.f151320a != 0) {
                    GLES20.glDeleteTextures(1, new int[]{hVar.f151320a}, 0);
                    hVar.f151320a = 0;
                }
                d.this.w.b(d.this.x);
                if (d.this.G != null) {
                    com.ss.android.ttvecamera.h.a aVar = d.this.G;
                    o.b("TEMediaRecorder", "[schedule] releaseMediaRecorder");
                    if (aVar.f61555a != null) {
                        if ((o.f61856b & 16) != 0) {
                            o.f61857c.Log((byte) 16, o.f61855a + "TEMediaRecorder", "Releasing media recorder.");
                        }
                        try {
                            aVar.f61555a.reset();
                        } catch (IllegalStateException e2) {
                            o.d("TEMediaRecorder", "media recorder maybe has been released! msg=" + e2.getMessage());
                            if (aVar.f61562h != null) {
                                aVar.f61562h.a();
                            }
                        }
                        aVar.a();
                        MediaRecorder mediaRecorder = aVar.f61555a;
                        if (!((Boolean) com.bytedance.helios.sdk.a.a(mediaRecorder, new Object[0], 100501, "void", false, null).first).booleanValue()) {
                            mediaRecorder.release();
                            com.bytedance.helios.sdk.a.a(null, mediaRecorder, new Object[0], 100501, "com_ss_android_ttvecamera_mediarecorder_TEMediaRecorder_android_media_MediaRecorder_release(Landroid/media/MediaRecorder;)V");
                        }
                        aVar.f61555a = null;
                        if (aVar.f61557c != null) {
                            aVar.f61557c.quitSafely();
                            try {
                                aVar.f61557c.join();
                                aVar.f61557c = null;
                                aVar.f61558d = null;
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    d.this.G = null;
                }
                VEListener.ai aiVar = d.this.W;
                if (aiVar instanceof VEListener.ah) {
                    ((VEListener.ah) aiVar).a(1001, 0, "Render Env Destroyed.");
                }
            }

            @Override // com.ss.android.medialib.b.a.b
            public final int b() {
                boolean z;
                float f2;
                int i2;
                MethodCollector.i(2818);
                if (d.this.n) {
                    synchronized (d.o) {
                        try {
                            if (d.this.f151140k.width > 0 && d.this.f151140k.height > 0) {
                                if (!d.this.x.f151256g) {
                                    f2 = (float) d.this.f151140k.width;
                                    i2 = d.this.f151140k.height;
                                } else {
                                    f2 = (float) d.this.f151140k.height;
                                    i2 = d.this.f151140k.width;
                                }
                                d.this.f151132c.a(f2 / ((float) i2), d.this.f151140k.width, d.this.f151140k.height);
                            }
                            boolean z2 = true;
                            if (d.this.r == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (d.this.r != 2) {
                                z2 = false;
                            }
                            d.this.f151132c.a(d.this.f151142m, z, z2);
                            d.this.n = false;
                        } catch (Throwable th) {
                            MethodCollector.o(2818);
                            throw th;
                        }
                    }
                }
                if (d.this.as == null || d.this.as.x != VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                    try {
                        d.this.v.a();
                        if (d.this.p) {
                            MethodCollector.o(2818);
                            return -1000;
                        }
                        if (d.this.v.f151321b != null) {
                            d.this.f151132c.b(d.this.v.b());
                        }
                        MethodCollector.o(2818);
                        return 0;
                    } catch (Exception e2) {
                        an.d(d.f151130a, "onOpenGLRunning error msg: " + e2.getMessage() + ", is can retry = " + d.this.v.f151324e);
                        if (d.this.v.f151324e) {
                            try {
                                d.this.v.f151321b.detachFromGLContext();
                                d.this.v.a();
                            } catch (Exception unused) {
                                an.d(d.f151130a, "onOpenGLRunning error msg: " + e2.getMessage() + ", retry failed!!!");
                            }
                        }
                    }
                } else {
                    if (d.this.as.a() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                        try {
                            if (d.this.as.K.getBoolean("forceRunUpdateTexImg", false)) {
                                d.this.v.a();
                            }
                        } catch (Exception e3) {
                            an.d(d.f151130a, "onOpenGLRunning error: " + e3.getMessage());
                        }
                    }
                    if (d.this.p) {
                        MethodCollector.o(2818);
                        return -1000;
                    }
                    MethodCollector.o(2818);
                    return 0;
                }
            }

            @Override // com.ss.android.medialib.b.a.b
            public final void a() {
                int i2;
                int i3;
                an.e(d.f151130a, "onOpenGLCreate");
                d.this.w = new a<>();
                h hVar = d.this.v;
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(36197, iArr[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                hVar.f151320a = iArr[0];
                hVar.f151321b = new com.ss.android.vesdk.e.a(hVar.f151320a);
                hVar.f151321b.setOnFrameAvailableListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: INVOKE  
                      (wrap: android.graphics.SurfaceTexture : 0x0049: IGET  (r1v5 android.graphics.SurfaceTexture) = (r5v0 'hVar' com.ss.android.vesdk.h) com.ss.android.vesdk.h.b android.graphics.SurfaceTexture)
                      (wrap: com.ss.android.vesdk.h$1 : 0x004d: CONSTRUCTOR  (r0v10 com.ss.android.vesdk.h$1) = (r5v0 'hVar' com.ss.android.vesdk.h) call: com.ss.android.vesdk.h.1.<init>(com.ss.android.vesdk.h):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.graphics.SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener):void in method: com.ss.android.vesdk.d.22.a():void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: CONSTRUCTOR  (r0v10 com.ss.android.vesdk.h$1) = (r5v0 'hVar' com.ss.android.vesdk.h) call: com.ss.android.vesdk.h.1.<init>(com.ss.android.vesdk.h):void type: CONSTRUCTOR in method: com.ss.android.vesdk.d.22.a():void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 14 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.vesdk.h, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 20 more
                    */
                /*
                // Method dump skipped, instructions count: 659
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.d.AnonymousClass22.a():void");
            }
        };
        if (this.T != null) {
            this.T.f151333c.a(this);
        }
        e eVar2 = new e();
        this.f151132c = eVar2;
        eVar2.f59777g = new e.a() {
            /* class com.ss.android.vesdk.d.AnonymousClass11 */

            static {
                Covode.recordClassIndex(99382);
            }

            @Override // com.ss.android.medialib.presenter.e.a
            public final void a(int i2, int i3) {
                d.this.J = i2;
                d.this.K = i3;
            }
        };
        this.f151132c.a(this.ca);
        com.ss.android.ttve.monitor.h.a("iesve_use_new_record", 1L);
        this.bS = ((Boolean) u.a().a("ve_enable_stop_preview_optimize", (Object) false)).booleanValue();
        this.O = new com.ss.android.vesdk.c.b(this.f151132c, this);
        this.bt = new com.ss.android.ttvecamera.k.b();
        this.bs = ((Boolean) u.a().a("ve_enable_vboost", (Object) false)).booleanValue();
        if (this.bs) {
            this.bt.a(new com.ss.android.ttvecamera.k.c());
            this.bt.a();
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, float f2) {
        if (i2 == 1) {
            this.aH.f61165d = f2;
        } else if (i2 == 2) {
            this.aH.f61164c = f2;
        } else if (i2 == 4) {
            this.aK.f61179b = f2;
        } else if (i2 != 5) {
            switch (i2) {
                case 17:
                    this.aL.f61167b = f2;
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.aL.f61168c = f2;
                    break;
                case 19:
                    this.aL.f61169d = f2;
                    break;
                case v.U:
                    this.aL.f61170e = f2;
                    break;
            }
        } else {
            this.aK.f61180c = f2;
        }
        this.f151132c.a(i2, f2);
        return 0;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnRunningErrorCallback
    public void onInfo(int i2, int i3) {
        String str;
        if (i2 == 1051) {
            this.bl = (float) i3;
            an.b(f151130a, "onInfo: " + i2 + "; INFO_PREVIEW_DROP_FPS:" + this.bl);
        } else if (i2 == 1052) {
            this.be = (float) i3;
            an.b(f151130a, "onInfo: " + i2 + "; INFO_RECORD_RENDER_DROP_FPS:" + this.be);
        } else if (i2 != 1070) {
            switch (i2) {
                case 1040:
                    this.ba = i3;
                    break;
                case 1041:
                    this.bb = i3;
                    break;
                case 1042:
                    if (i3 != 0) {
                        this.bd = 1000.0f / ((float) i3);
                    }
                    an.b(f151130a, "onInfo: " + i2 + "; TET_RECORD_RENDER_FPS:" + this.bd);
                    break;
                case 1043:
                    this.bc = i3;
                    break;
                case 1044:
                    this.bh = i3;
                    break;
                case 1045:
                    this.bi = i3;
                    break;
                case 1046:
                    this.bj = i3;
                    break;
                case 1047:
                    if (i3 != 0) {
                        this.bk = 1000.0f / ((float) i3);
                        break;
                    }
                    break;
                case 1048:
                    this.bf = i3;
                    break;
                case 1049:
                    this.bg = ((float) i3) / 1000.0f;
                    break;
            }
        } else {
            this.B.open();
            an.a(f151130a, "turn to off-screen render");
        }
        an.b(f151130a, "onInfo: " + i2 + "ext:" + i3);
        if (i2 == 1030) {
            str = "shotScreen...";
        } else if (i2 == 1050) {
            str = String.valueOf(System.currentTimeMillis());
        } else {
            str = "";
        }
        if (this.W instanceof VEListener.ah) {
            ((VEListener.ah) this.W).a(i2, i3, str);
        }
    }

    @Override // com.ss.android.vesdk.g
    public final int b(String[] strArr, int i2) {
        return this.f151132c.c(strArr, i2);
    }

    @Override // com.ss.android.vesdk.g
    public final int[] c(String str, String str2) {
        return this.f151132c.c(str, str2);
    }

    private int a(final String str, final long j2, final long j3) {
        b(new Runnable() {
            /* class com.ss.android.vesdk.d.AnonymousClass43 */

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f151235d = 2;

            static {
                Covode.recordClassIndex(99418);
            }

            public final void run() {
                MethodCollector.i(2327);
                synchronized (d.this) {
                    try {
                        if (d.this.u == 3) {
                            an.d(d.f151130a, "setRecordBGM could not be executed in state: " + d.this.u);
                        } else if (!d.this.C) {
                            an.d(d.f151130a, "setRecordBGM could not be executed, after startPrePlay");
                            MethodCollector.o(2327);
                        } else {
                            d.super.a((d) str, (String) j2, j3, (long) this.f151235d);
                            e a2 = d.this.f151132c.a(str);
                            boolean z = true;
                            if (d.this.aD != 1) {
                                z = false;
                            }
                            a2.f59774d = z;
                            a2.a(d.this.aB, d.this.aC, d.this.f151138i);
                            d dVar = d.this;
                            dVar.c(dVar.c(false));
                            d.this.f151132c.b(d.this.S, d.this.c(false), d.this);
                            MethodCollector.o(2327);
                        }
                    } finally {
                        MethodCollector.o(2327);
                    }
                }
            }
        });
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int initWavFile(int i2, int i3, double d2) {
        an.b(f151130a, "initWavFile...");
        this.J = i2;
        this.K = i3;
        return 0;
    }

    @Override // org.libsdl.app.AudioRecorderInterface
    public int addPCMData(byte[] bArr, int i2, long j2) {
        String str = f151130a;
        an.b(str, "addPCMData...");
        if (this.J != -1) {
            if (!(this.au == null || !this.aX || this.am == null)) {
                TEVideoUtils.getAudioVolume(bArr, this.J, this.K, i2);
            }
            if (!(this.au == null || this.ap == null)) {
                String a2 = this.ap.a();
                if (TextUtils.isEmpty(a2)) {
                    an.d(str, "modePath is empty");
                } else {
                    if (this.aq == -1) {
                        an.a(str, "load model");
                        this.aq = TEVideoUtils.loadModel(this.J, a2);
                    }
                    if (this.aq != -1) {
                        TEVideoUtils.voiceActivityDetection(bArr, this.aq, this.K, i2);
                    }
                    if (this.bW) {
                        this.bW = false;
                        F();
                    }
                }
            }
        }
        if (this.Y != null) {
            Arrays.copyOf(bArr, i2);
        }
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int b(String str, float f2, float f3) {
        this.aL.f61166a = str;
        this.aL.f61167b = f2;
        this.aL.f61168c = f3;
        this.f151132c.b(com.ss.android.vesdk.utils.b.a(str), f2, f3);
        return 0;
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, int i3, long j2) {
        an.a(f151130a, "seekTrack trackIndex " + i2 + " trackType " + i3 + " timeInMS 0");
        return this.f151132c.a(i2, i3, 0L);
    }

    @Override // com.ss.android.vesdk.g
    public final int b(double d2, double d3, double d4, double d5) {
        return this.f151132c.b(d2, d3, d4, d5);
    }

    @Override // com.ss.android.vesdk.g
    public final int c(double d2, double d3, double d4, double d5) {
        return this.f151132c.c(d2, d3, d4, d5);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(double d2, double d3, double d4, double d5) {
        return this.f151132c.a(d2, d3, d4, d5);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(int i2, float f2, float f3, int i3) {
        return this.f151132c.a(i2, f2, f3, i3);
    }

    @Override // com.ss.android.vesdk.g
    public final int a(float f2, float f3, float f4, float f5, float f6) {
        return this.f151132c.a(f2, f3, f4, f5, f6);
    }
}
