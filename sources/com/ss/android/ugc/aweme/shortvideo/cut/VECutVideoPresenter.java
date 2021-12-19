package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Intent;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.experiment.eq;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.cut.g;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.ak;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.hf;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import f.a.w;
import h.a.ag;
import h.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class VECutVideoPresenter implements au {

    /* renamed from: a  reason: collision with root package name */
    public int f125346a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f125347b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f125348c;

    /* renamed from: d  reason: collision with root package name */
    public float f125349d;

    /* renamed from: e  reason: collision with root package name */
    public int f125350e;

    /* renamed from: f  reason: collision with root package name */
    public j f125351f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.a f125352g;

    /* renamed from: h  reason: collision with root package name */
    public r f125353h;

    /* renamed from: i  reason: collision with root package name */
    public VEVideoCutterViewModel f125354i;

    /* renamed from: j  reason: collision with root package name */
    public VideoEditViewModel f125355j;

    /* renamed from: k  reason: collision with root package name */
    public n f125356k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g f125357l;

    /* renamed from: m  reason: collision with root package name */
    public VEListener.v f125358m;
    public boolean n;
    public final s o;
    public boolean p;
    private final h.h q;
    private long r;
    private boolean s;
    private boolean t;
    private CutMultiVideoViewModel u;
    private final String v;

    static {
        Covode.recordClassIndex(82283);
    }

    public final boolean c() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            performInit();
        } else if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    public final void a(List<? extends VideoSegment> list, int i2) {
        androidx.core.g.e<Long, Long> d2 = this.o.d();
        F f2 = d2.f2397a;
        if (f2 == null) {
            f2 = 0L;
        }
        h.f.b.l.b(f2, "");
        long longValue = f2.longValue();
        S s2 = d2.f2398b;
        if (s2 == null) {
            s2 = Long.valueOf(this.o.c());
        }
        h.f.b.l.b(s2, "");
        this.f125356k.a(list, i2, longValue, s2.longValue());
    }

    public final void a(List<? extends VideoSegment> list, boolean z) {
        n nVar = this.f125356k;
        if (nVar.f126022c) {
            i iVar = nVar.f126021b;
            if (iVar != null) {
                iVar.a(list, z);
            }
        } else {
            i iVar2 = nVar.f126020a;
            if (iVar2 != null) {
                iVar2.a(list, z);
            }
        }
        this.f125357l.a(list);
    }

    public final void a(Workspace workspace, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, boolean z, com.ss.android.ugc.aweme.shortvideo.cut.scene.c cVar, boolean z2) {
        long j2;
        VideoSegment videoSegment;
        MethodCollector.i(4995);
        h.f.b.l.d(workspace, "");
        h.f.b.l.d(cVar, "");
        if (!this.t) {
            bj.a("VECutVideo,return compile because of editor not init");
            MethodCollector.o(4995);
            return;
        }
        boolean z3 = backgroundVideoCompileConfigure != null;
        long currentTimeMillis = System.currentTimeMillis();
        VideoEditViewModel videoEditViewModel = this.f125355j;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        List<VideoSegment> k2 = videoEditViewModel.k();
        long j3 = (k2 == null || (videoSegment = (VideoSegment) h.a.n.b(k2, 0)) == null) ? -1 : videoSegment.f125478b;
        CutMultiVideoViewModel cutMultiVideoViewModel = this.u;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        if (j3 > cutMultiVideoViewModel.f125338m) {
            com.ss.android.ugc.asve.editor.a aVar = this.f125352g;
            VideoEditViewModel videoEditViewModel2 = this.f125355j;
            if (videoEditViewModel2 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            List<VideoSegment> k3 = videoEditViewModel2.k();
            h.f.b.l.b(k3, "");
            r.a(aVar, k3);
        }
        j jVar = this.f125351f;
        this.s = jVar != null ? jVar.d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f125354i;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, true));
        j jVar2 = this.f125351f;
        if (jVar2 != null) {
            j2 = jVar2.a();
        } else {
            j2 = 0;
        }
        this.r = j2;
        l lVar = new l(this);
        if (z) {
            this.f125346a = -11008;
        } else if (!z3) {
            this.o.g();
            if (lVar.a() && !z2) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(true, d(), String.valueOf(this.f125346a));
                cVar.a(true);
                bj.a("VECutVideo,using fastImport strategy");
                cVar.onCompileDone();
                if (c()) {
                    com.ss.android.ugc.asve.editor.a aVar2 = this.f125352g;
                    if (aVar2 != null) {
                        aVar2.E().h();
                    }
                    com.ss.android.ugc.asve.editor.a aVar3 = this.f125352g;
                    if (aVar3 != null) {
                        x E = aVar3.E();
                        synchronized (E) {
                            try {
                                E.T = false;
                                an.c("VEEditor", "onReleaseResource... ");
                                if (E.B.getNativeHandler() != 0) {
                                    if (E.af == 1) {
                                        TEMonitorInvoker.nativeMonitorPerfWithType(3);
                                    }
                                    E.B.releasePreviewSurface();
                                    if (E.E != null) {
                                        E.E.getHolder().removeCallback(E.ak);
                                    } else if (E.F != null && E.F.getSurfaceTextureListener() == E.aj) {
                                        E.F.setSurfaceTextureListener(null);
                                    }
                                    E.E = null;
                                    E.F = null;
                                    if (E.B != null) {
                                        E.B.setOpenGLListeners(null);
                                        E.B.setInfoListener(null);
                                        E.B.setErrorListener(null);
                                    }
                                    E.f151516e = null;
                                    if (E.ae != null && !E.ae.isRecycled()) {
                                        E.ae.recycle();
                                        E.ae = null;
                                    }
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(4995);
                                throw th;
                            }
                        }
                    }
                    this.t = false;
                    MethodCollector.o(4995);
                    return;
                }
                destroy();
                MethodCollector.o(4995);
                return;
            }
        }
        cVar.a(false);
        bj.a("VECutVideo,using normalImport strategy");
        VideoEditViewModel videoEditViewModel3 = this.f125355j;
        if (videoEditViewModel3 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        b.i b2 = b.i.b(new g.a(videoEditViewModel3.k()), b.i.f4824a);
        h.f.b.l.b(b2, "");
        b2.a((b.g) new c(this, currentTimeMillis, backgroundVideoCompileConfigure, workspace, cVar));
        MethodCollector.o(4995);
    }

    public final void a(androidx.fragment.app.e eVar) {
        h.f.b.l.d(eVar, "");
        ac a2 = ae.a(eVar, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.u = (CutMultiVideoViewModel) a2;
        ac a3 = ae.a(eVar, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a3, "");
        this.f125354i = (VEVideoCutterViewModel) a3;
        ac a4 = ae.a(eVar, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a4, "");
        this.f125355j = (VideoEditViewModel) a4;
        this.n = h.f.b.l.a((Object) "from_chat", (Object) a(eVar.getIntent(), "enter_from"));
        this.o.b().getLifecycle().a(this);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f125354i;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.a().observe(this.o.b(), new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f125360a;

        static {
            Covode.recordClassIndex(82285);
        }

        b(h.f.a.a aVar) {
            this.f125360a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f125360a.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements VEListener.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f125378a;

        static {
            Covode.recordClassIndex(82297);
        }

        i(VECutVideoPresenter vECutVideoPresenter) {
            this.f125378a = vECutVideoPresenter;
        }

        @Override // com.ss.android.vesdk.VEListener.v
        public final void a() {
            VECutVideoPresenter.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(82298);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    if (this.this$0.f125378a.f125347b) {
                        this.this$0.f125378a.o.i();
                        this.this$0.f125378a.f125347b = false;
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ VECutVideoPresenter this$0;

        static {
            Covode.recordClassIndex(82300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.this$0 = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private boolean a() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                Boolean enableReuseEditorForFastimport = iESSettingsProxy.getEnableReuseEditorForFastimport();
                h.f.b.l.b(enableReuseEditorForFastimport, "");
                if (!enableReuseEditorForFastimport.booleanValue() || this.this$0.o.g() != 0 || this.this$0.n) {
                    return false;
                }
                return true;
            } catch (com.bytedance.ies.a unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ VECutVideoPresenter this$0;

        static {
            Covode.recordClassIndex(82301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.this$0 = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        public final boolean a() {
            List<VideoSegment> k2 = VECutVideoPresenter.b(this.this$0).k();
            h.f.b.l.b(k2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : k2) {
                if (true ^ t.f125485i) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                VideoSegment videoSegment = (VideoSegment) arrayList2.get(i2);
                if (com.ss.android.ugc.tools.utils.h.a(videoSegment.a(false), true)) {
                    this.this$0.f125346a = -11009;
                    return false;
                }
                int min = Math.min(videoSegment.f125482f, videoSegment.f125483g);
                int max = Math.max(videoSegment.f125482f, videoSegment.f125483g);
                try {
                    h.f.b.l.b(videoSegment, "");
                    p<Integer, Boolean> a2 = ak.a(min, max, (int) (((float) videoSegment.a()) * videoSegment.f()));
                    this.this$0.f125346a = a2.getFirst().intValue();
                    if (this.this$0.f125346a != 0) {
                        return false;
                    }
                } catch (Exception e2) {
                    bj.b(e2.getMessage());
                }
            }
            return true;
        }
    }

    public final boolean b() {
        j jVar = this.f125351f;
        if (jVar != null) {
            return jVar.b();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<VEEditorAutoStartStopArbiter> {
        final /* synthetic */ VECutVideoPresenter this$0;

        static {
            Covode.recordClassIndex(82299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.this$0 = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return new VEEditorAutoStartStopArbiter(this.this$0.o.a(), this.this$0.o.b(), this.this$0.f125352g, this.this$0.o.h(), this.this$0.p);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy() {
        if (this.t) {
            bj.d("VECutVideoPresenter Destroy method stack: \n" + hf.a(10));
            this.t = false;
            com.ss.android.ugc.asve.editor.a aVar = this.f125352g;
            if (aVar != null) {
                aVar.s();
            }
            this.o.f();
            if (this.f125351f != null) {
                this.f125351f = null;
            }
        }
    }

    public final int d() {
        VideoEditViewModel videoEditViewModel = this.f125355j;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        if (videoEditViewModel.k().size() == 1) {
            return 1;
        }
        VideoEditViewModel videoEditViewModel2 = this.f125355j;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        List<VideoSegment> k2 = videoEditViewModel2.k();
        h.f.b.l.b(k2, "");
        ArrayList arrayList = new ArrayList();
        for (T t2 : k2) {
            if (!t2.f125485i) {
                arrayList.add(t2);
            }
        }
        if (arrayList.size() > 1) {
            return 2;
        }
        return 3;
    }

    public final long a() {
        j jVar = this.f125351f;
        if (jVar != null) {
            return jVar.c();
        }
        return 0;
    }

    @v(a = i.a.ON_RESUME)
    public final void performInit() {
        int size;
        com.ss.android.ugc.asve.editor.a aVar;
        boolean z;
        int a2;
        j jVar;
        if (!this.t) {
            VideoEditViewModel videoEditViewModel = this.f125355j;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            t<CutVideoContext> tVar = videoEditViewModel.w;
            h.f.b.l.b(tVar, "");
            if (tVar.getValue() == null) {
                bj.b("VECutVideoPresenter,init error because of null cutVideoContext");
            } else {
                VideoEditViewModel videoEditViewModel2 = this.f125355j;
                if (videoEditViewModel2 == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                List<VideoSegment> k2 = videoEditViewModel2.k();
                if (!(k2 == null || (size = k2.size()) == 0)) {
                    this.t = true;
                    if (eq.a()) {
                        aVar = new com.ss.android.ugc.asve.editor.a(this.v, this.o.h(), com.ss.android.ugc.asve.editor.b.a(null));
                    } else {
                        aVar = new com.ss.android.ugc.asve.editor.a(this.v, this.o.h());
                    }
                    this.f125352g = aVar;
                    if (this.f125353h == null) {
                        this.f125353h = new h(this);
                    }
                    r rVar = this.f125353h;
                    if (rVar == null) {
                        h.f.b.l.a("infoCallback");
                    }
                    aVar.c(rVar);
                    aVar.a(x.e.SCALE_MODE_CENTER_INSIDE);
                    aVar.a(true);
                    if (this.f125358m == null) {
                        this.f125358m = new i(this);
                    }
                    VEListener.v vVar = this.f125358m;
                    if (vVar == null) {
                        h.f.b.l.a("firstFrameListener");
                    }
                    aVar.a(vVar);
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = new int[size];
                    int[] iArr2 = new int[size];
                    float[] fArr = new float[size];
                    int[] iArr3 = new int[size];
                    a(k2, arrayList, iArr, iArr2, fArr, iArr3);
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    bg bgVar = new bg((String[]) array);
                    com.ss.android.ugc.asve.editor.a aVar2 = this.f125352g;
                    if (aVar2 == null) {
                        h.f.b.l.b();
                    }
                    v vVar2 = new v(aVar2, bgVar);
                    com.ss.android.ugc.asve.editor.a aVar3 = this.f125352g;
                    if (aVar3 == null) {
                        h.f.b.l.b();
                    }
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d dVar = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d(aVar3, bgVar);
                    this.f125356k.f126020a = vVar2;
                    this.f125356k.f126021b = dVar;
                    this.f125357l.f129508a = this.f125352g;
                    com.ss.android.ugc.asve.editor.a aVar4 = this.f125352g;
                    if (aVar4 == null) {
                        h.f.b.l.b();
                    }
                    this.f125351f = new x(aVar4, new j(this));
                    com.ss.android.ugc.asve.editor.a aVar5 = this.f125352g;
                    if (aVar5 != null) {
                        aVar5.d(com.ss.android.ugc.aweme.port.in.g.a().i().getVideoWidth(), com.ss.android.ugc.aweme.port.in.g.a().i().getVideoHeight());
                        if (!com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c() || arrayList.size() <= 1) {
                            z = false;
                            Object[] array2 = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                            com.ss.android.ugc.asve.editor.k kVar = new com.ss.android.ugc.asve.editor.k((String[]) array2);
                            kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
                            kVar.f62018a = iArr;
                            kVar.f62019b = iArr2;
                            kVar.f62024g = fArr;
                            a2 = aVar5.a(kVar);
                        } else {
                            z = true;
                            Object[] array3 = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
                            a2 = aVar5.a(new com.ss.android.ugc.asve.editor.l((String[]) array3, x.l.VIDEO_OUT_RATIO_ORIGINAL));
                        }
                        if (a2 == 0) {
                            com.ss.android.ugc.aweme.tools.c.c.a(bgVar, k2, iArr, iArr2, fArr, iArr3);
                            com.ss.android.ugc.asve.editor.a aVar6 = this.f125352g;
                            if (aVar6 != null) {
                                aVar6.a(bgVar);
                            }
                            this.f125357l.a(k2);
                            aVar5.b(this.f125350e);
                            int a3 = at.a();
                            if (a3 <= 0) {
                                a3 = 30;
                            }
                            aVar5.i(a3);
                            aVar5.a(0, 1, 0.5f);
                            if (!z || !this.f125348c) {
                                aVar5.c(1);
                            } else {
                                aVar5.c(0);
                            }
                            aVar5.b(true);
                            aVar5.E().f();
                            androidx.core.g.e<Long, Long> d2 = this.o.d();
                            F f2 = d2.f2397a;
                            if (f2 == null) {
                                f2 = 0L;
                            }
                            h.f.b.l.b(f2, "");
                            long longValue = f2.longValue();
                            S s2 = d2.f2398b;
                            if (s2 == null) {
                                s2 = Long.valueOf(this.o.c());
                            }
                            h.f.b.l.b(s2, "");
                            aVar5.b((int) longValue, (int) s2.longValue());
                            if (k2 != null && (!k2.isEmpty())) {
                                VideoSegment videoSegment = k2.get(0);
                                if (this.o.g() == 0 && videoSegment.f125486j > 0) {
                                    this.f125356k.a((float) videoSegment.f125486j, videoSegment.f125487k, videoSegment.f125488l, 0, 0);
                                }
                            }
                            boolean z2 = this.s;
                            if (z2) {
                                j jVar2 = this.f125351f;
                                if (jVar2 != null) {
                                    jVar2.c(z2);
                                }
                                this.s = false;
                            }
                            if ((!z || !this.f125348c) && (jVar = this.f125351f) != null) {
                                boolean unused = jVar.a(this.r, x.f.EDITOR_SEEK_FLAG_LastSeek, null);
                            }
                            this.o.a(this.f125352g);
                            return;
                        }
                    }
                }
            }
            this.o.e();
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125376a;

        static {
            Covode.recordClassIndex(82293);
        }

        public f(f fVar) {
            this.f125376a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f125376a.a(new IllegalStateException("The job is disposed."));
        }
    }

    public static final /* synthetic */ VEVideoCutterViewModel a(VECutVideoPresenter vECutVideoPresenter) {
        VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.f125354i;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    public static final /* synthetic */ VideoEditViewModel b(VECutVideoPresenter vECutVideoPresenter) {
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f125355j;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125375a;

        static {
            Covode.recordClassIndex(82292);
        }

        public e(f fVar) {
            this.f125375a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            f fVar = this.f125375a;
            h.f.b.l.b(num, "");
            fVar.a(num.intValue());
        }
    }

    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125371c = 0;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125372d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f125373e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f125374f;

        static {
            Covode.recordClassIndex(82291);
        }

        public d(f fVar, String str, String str2) {
            this.f125369a = fVar;
            this.f125370b = str;
            this.f125372d = str2;
            this.f125373e = 0;
            this.f125374f = -1;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<Integer> vVar) {
            h.f.b.l.d(vVar, "");
            if (vVar.isDisposed()) {
                vVar.a(new IllegalStateException("The job is disposed."));
            }
            vVar.a(Integer.valueOf(VEUtils.findAudioSegmentStartTimeInOrigin(this.f125370b, this.f125371c, this.f125372d, this.f125373e, this.f125374f)));
            vVar.a();
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f125359a;

        static {
            Covode.recordClassIndex(82284);
        }

        a(VECutVideoPresenter vECutVideoPresenter) {
            this.f125359a = vECutVideoPresenter;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            j jVar;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f126290d)) != null) {
                if (valueOf.intValue() == 1) {
                    j jVar2 = this.f125359a.f125351f;
                    if (jVar2 != null) {
                        jVar2.a(aVar.f126291e);
                    }
                } else if (valueOf.intValue() == 2) {
                    j jVar3 = this.f125359a.f125351f;
                    if (jVar3 != null) {
                        jVar3.b(aVar.f126291e);
                    }
                } else if (valueOf.intValue() == 3 && (jVar = this.f125359a.f125351f) != null) {
                    boolean unused = jVar.a(aVar.f126288b, aVar.f126287a, null);
                }
            }
        }
    }

    public static void a(h.f.a.a<z> aVar) {
        b.i.b(new b(aVar), b.i.f4826c);
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f125361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f125362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BackgroundVideoCompileConfigure f125363c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Workspace f125364d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.scene.c f125365e;

        static {
            Covode.recordClassIndex(82286);
        }

        c(VECutVideoPresenter vECutVideoPresenter, long j2, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, Workspace workspace, com.ss.android.ugc.aweme.shortvideo.cut.scene.c cVar) {
            this.f125361a = vECutVideoPresenter;
            this.f125362b = j2;
            this.f125363c = backgroundVideoCompileConfigure;
            this.f125364d = workspace;
            this.f125365e = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            ROTATE_DEGREE rotate_degree;
            final e eVar;
            boolean z;
            Integer num;
            final long currentTimeMillis = System.currentTimeMillis() - this.f125362b;
            if (iVar == null || (num = (Integer) iVar.d()) == null) {
                i2 = 30;
            } else {
                i2 = num.intValue();
            }
            String a2 = SettingsManager.a().a("import_compile_external_settings", "");
            h.f.b.l.b(a2, "");
            if (this.f125363c == null) {
                List<VideoSegment> k2 = VECutVideoPresenter.b(this.f125361a).k();
                h.f.b.l.b(k2, "");
                Workspace workspace = this.f125364d;
                h.f.b.l.d(k2, "");
                h.f.b.l.d(workspace, "");
                h.f.b.l.d(a2, "");
                File a3 = workspace.a();
                h.f.b.l.b(a3, "");
                String path = a3.getPath();
                h.f.b.l.b(path, "");
                File b2 = workspace.b();
                h.f.b.l.b(b2, "");
                String path2 = b2.getPath();
                if (!SettingsManager.a().a("enable_high_quality_video", false) || !com.ss.android.ugc.aweme.property.b.b()) {
                    z = false;
                } else {
                    z = true;
                }
                eVar = new e(k2, path, path2, -1, -1, i2, z, null, null, null, 0, 0, a2, 8064);
            } else {
                List<VideoSegment> k3 = VECutVideoPresenter.b(this.f125361a).k();
                h.f.b.l.b(k3, "");
                BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = this.f125363c;
                float f2 = this.f125361a.f125349d;
                h.f.b.l.d(k3, "");
                h.f.b.l.d(backgroundVideoCompileConfigure, "");
                int i3 = k3.get(0).f125482f;
                int i4 = k3.get(0).f125483g;
                int i5 = (int) f2;
                if (i5 == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (i5 == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (i5 != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                if (!(rotate_degree == ROTATE_DEGREE.ROTATE_90 || rotate_degree == ROTATE_DEGREE.ROTATE_270)) {
                    i3 = i4;
                    i4 = i3;
                }
                eVar = new e(k3, backgroundVideoCompileConfigure.f125324a, backgroundVideoCompileConfigure.f125325b, 480, (i3 * 480) / i4, i2, false, null, null, null, 0, 2, null, 14272);
            }
            bj.a("VECutVideoPresenter -> CutVideoCompileSettings.isHWEncode = " + eVar.f125458g);
            com.ss.android.ugc.asve.editor.a aVar = this.f125361a.f125352g;
            if (aVar != null) {
                x E = aVar.E();
                an.a("VEEditor", "setSurfaceReDraw...");
                E.ad = true;
            }
            com.ss.android.ugc.asve.editor.a aVar2 = this.f125361a.f125352g;
            if (aVar2 != null) {
                aVar2.c(-1);
            }
            n nVar = this.f125361a.f125356k;
            AnonymousClass1 r2 = new VEListener.q(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f125366a;

                static {
                    Covode.recordClassIndex(82287);
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$c  reason: collision with other inner class name */
                static final class C3269c extends h.f.b.m implements h.f.a.a<z> {
                    final /* synthetic */ float $progress;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(82290);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3269c(AnonymousClass1 r2, float f2) {
                        super(0);
                        this.this$0 = r2;
                        this.$progress = f2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f125366a.f125365e.onCompileProgress(this.$progress);
                        return z.f158842a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$a */
                static final class a extends h.f.b.m implements h.f.a.a<z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(82288);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2) {
                        super(0);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f125366a.f125365e.onCompileDone();
                        this.this$0.f125366a.f125361a.destroy();
                        return z.f158842a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$b */
                static final class b extends h.f.b.m implements h.f.a.a<z> {
                    final /* synthetic */ int $error;
                    final /* synthetic */ int $ext;
                    final /* synthetic */ float $f;
                    final /* synthetic */ String $msg;
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(82289);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(AnonymousClass1 r2, int i2, int i3, float f2, String str) {
                        super(0);
                        this.this$0 = r2;
                        this.$error = i2;
                        this.$ext = i3;
                        this.$f = f2;
                        this.$msg = str;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f125366a.f125365e.onCompileError(this.$error, this.$ext, this.$f, this.$msg);
                        com.ss.android.ugc.asve.editor.a aVar = this.this$0.f125366a.f125361a.f125352g;
                        if (aVar != null) {
                            aVar.E().f();
                        }
                        return z.f158842a;
                    }
                }

                @Override // com.ss.android.vesdk.VEListener.q
                public final void onCompileDone() {
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(false, this.f125366a.f125361a.d(), "");
                    VECutVideoPresenter.a(0, currentTimeMillis, System.currentTimeMillis() - this.f125366a.f125362b, eVar, 0, "");
                    VECutVideoPresenter.a(new a(this));
                }

                @Override // com.ss.android.vesdk.VEListener.q
                public final void onCompileProgress(float f2) {
                    VECutVideoPresenter.a(new C3269c(this, f2));
                }

                {
                    this.f125366a = r1;
                }

                @Override // com.ss.android.vesdk.VEListener.q
                public final void onCompileError(int i2, int i3, float f2, String str) {
                    String str2;
                    long currentTimeMillis = System.currentTimeMillis() - this.f125366a.f125362b;
                    long j2 = currentTimeMillis;
                    e eVar = eVar;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    VECutVideoPresenter.a(1, j2, currentTimeMillis, eVar, i2, str2);
                    VECutVideoPresenter.a(new b(this, i2, i3, f2, str));
                }
            };
            h.f.b.l.d(eVar, "");
            h.f.b.l.d(r2, "");
            i iVar2 = nVar.f126020a;
            if (iVar2 != null) {
                iVar2.a(eVar, r2);
            }
            return z.f158842a;
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<long[], List<? extends VideoSegment>> {
        final /* synthetic */ VECutVideoPresenter this$0;

        static {
            Covode.recordClassIndex(82294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(VECutVideoPresenter vECutVideoPresenter) {
            super(1);
            this.this$0 = vECutVideoPresenter;
        }

        /* renamed from: a */
        public final List<VideoSegment> invoke(long[] jArr) {
            h.f.b.l.d(jArr, "");
            if (this.this$0.o.g() == 0 || (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c() && this.this$0.f125348c)) {
                jArr[0] = -1;
                jArr[1] = -1;
                List<VideoSegment> k2 = VECutVideoPresenter.b(this.this$0).k();
                h.f.b.l.b(k2, "");
                ArrayList arrayList = new ArrayList();
                for (T t : k2) {
                    if (!t.f125485i) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            androidx.core.g.e<Long, Long> d2 = this.this$0.o.d();
            F f2 = d2.f2397a;
            long j2 = 0;
            if (f2 == null) {
                f2 = 0L;
            }
            h.f.b.l.b(f2, "");
            long longValue = f2.longValue();
            S s = d2.f2398b;
            if (s == null) {
                s = Long.valueOf(this.this$0.o.c());
            }
            h.f.b.l.b(s, "");
            long longValue2 = s.longValue();
            List<VideoSegment> k3 = VECutVideoPresenter.b(this.this$0).k();
            h.f.b.l.b(k3, "");
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : k3) {
                if (!t2.f125485i) {
                    arrayList3.add(t2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            int size = arrayList4.size();
            long j3 = 0;
            long j4 = 0;
            for (int i2 = 0; i2 < size && j3 <= longValue2; i2++) {
                VideoSegment videoSegment = (VideoSegment) arrayList4.get(i2);
                h.f.b.l.b(videoSegment, "");
                j3 += videoSegment.e() - videoSegment.d();
                if (longValue > j3) {
                    j4 += videoSegment.e() - videoSegment.d();
                } else {
                    arrayList2.add(videoSegment);
                }
            }
            long j5 = longValue - j4;
            if (j5 >= 0) {
                j2 = j5;
            }
            jArr[0] = j2;
            jArr[1] = j3 - longValue2;
            return arrayList2;
        }
    }

    public final void a(androidx.core.g.e<Long, Long> eVar) {
        long j2;
        h.f.b.l.d(eVar, "");
        long c2 = this.o.c();
        if (eVar.f2397a != null) {
            F f2 = eVar.f2397a;
            if (f2 == null) {
                h.f.b.l.b();
            }
            j2 = f2.longValue();
        } else {
            j2 = 0;
        }
        if (eVar.f2398b != null) {
            S s2 = eVar.f2398b;
            if (s2 == null) {
                h.f.b.l.b();
            }
            c2 = s2.longValue();
        }
        n nVar = this.f125356k;
        int i2 = (int) j2;
        int i3 = (int) c2;
        if (nVar.f126022c) {
            i iVar = nVar.f126021b;
            if (iVar != null) {
                iVar.c(i2, i3);
                return;
            }
            return;
        }
        i iVar2 = nVar.f126020a;
        if (iVar2 != null) {
            iVar2.c(i2, i3);
        }
    }

    public /* synthetic */ VECutVideoPresenter(String str, s sVar) {
        this(str, sVar, true);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public VECutVideoPresenter(String str, s sVar, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(sVar, "");
        this.v = str;
        this.o = sVar;
        this.p = z;
        this.q = h.i.a((h.f.a.a) new k(this));
        this.f125346a = -1;
        this.f125347b = true;
        this.f125348c = true;
        this.f125350e = com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false);
        this.f125356k = new n();
        this.f125357l = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g();
    }

    /* access modifiers changed from: package-private */
    public static final class h implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VECutVideoPresenter f125377a;

        static {
            Covode.recordClassIndex(82295);
        }

        h(VECutVideoPresenter vECutVideoPresenter) {
            this.f125377a = vECutVideoPresenter;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            if (i2 == 4101) {
                VECutVideoPresenter.a(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.h.AnonymousClass1 */
                    final /* synthetic */ h this$0;

                    static {
                        Covode.recordClassIndex(82296);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        if (this.this$0.f125377a.p) {
                            VECutVideoPresenter.a(this.this$0.f125377a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
                        } else {
                            VECutVideoPresenter.a(this.this$0.f125377a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    public static void a(int i2, long j2, long j3, e eVar, int i3, String str) {
        q.a("av_ve_import_compile", i2, com.ss.android.ugc.aweme.tools.c.a.a(ag.a(h.v.a("fps_time", String.valueOf(j2)), h.v.a("compile_time", String.valueOf(j3)), h.v.a("is_hard_encode", String.valueOf(eVar.f125458g)), h.v.a("fps", String.valueOf(eVar.f125457f)), h.v.a("errorCode", String.valueOf(i3)), h.v.a("error_message", str))));
    }

    private final void a(List<? extends VideoSegment> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null && (!list.isEmpty())) {
            int i2 = 0;
            for (T t2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t3 = t2;
                String a2 = t3.a(false);
                h.f.b.l.b(a2, "");
                list2.add(a2);
                iArr[i2] = (int) t3.d();
                iArr2[i2] = (int) t3.e();
                fArr[i2] = t3.f();
                iArr3[i2] = t3.f125486j;
                i2 = i3;
            }
            if (this.o.g() == 0) {
                iArr[0] = 0;
                iArr2[0] = (int) ((VideoSegment) list.get(0)).f125478b;
                iArr3[0] = 0;
            }
        }
    }

    public static /* synthetic */ void a(VECutVideoPresenter vECutVideoPresenter, int i2, float f2, boolean z, float f3, float f4, int i3, int i4, int i5) {
        int i6 = i3;
        float f5 = f3;
        if ((i5 & 4) != 0) {
            z = true;
        }
        float f6 = 1.0f;
        if ((i5 & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 16) == 0) {
            f6 = f4;
        }
        int i7 = 0;
        if ((i5 & 32) != 0) {
            i6 = 0;
        }
        if ((i5 & 64) == 0) {
            i7 = i4;
        }
        vECutVideoPresenter.f125349d = f2;
        if (z) {
            vECutVideoPresenter.f125356k.a(f2, f5, f6, i6, i7);
            return;
        }
        n nVar = vECutVideoPresenter.f125356k;
        if (nVar.f126020a != null) {
            i iVar = nVar.f126020a;
            if (iVar == null) {
                h.f.b.l.b();
            }
            iVar.a(i2, f2);
        }
    }
}
