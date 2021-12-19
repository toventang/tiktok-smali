package com.ss.android.ugc.aweme.shortvideo.publish.b;

import android.os.Looper;
import android.ss.com.vboost.d;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.c.h.a.d;
import com.google.c.h.a.q;
import com.google.c.h.a.s;
import com.google.c.h.a.u;
import com.ss.android.ttve.editorInfo.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.property.bl;
import com.ss.android.ugc.aweme.property.bo;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.settings.p;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.ab;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dq;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.eo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.af;
import com.ss.android.ugc.aweme.shortvideo.upload.c;
import com.ss.android.ugc.aweme.shortvideo.upload.k;
import com.ss.android.ugc.aweme.shortvideo.upload.l;
import com.ss.android.ugc.aweme.shortvideo.upload.n;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.upload.w;
import com.ss.android.ugc.aweme.shortvideo.upload.x;
import com.ss.android.ugc.aweme.shortvideo.util.ac;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.uploader.b;
import com.ss.android.ugc.aweme.utils.hn;
import com.ss.android.ugc.aweme.watermark.g;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.r;
import dmt.av.video.aj;
import dmt.av.video.f;
import dmt.av.video.z;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class a extends j {
    private com.ss.android.ugc.aweme.publish.g.a A;
    private final int B;
    private k C;
    private boolean D;
    private c E;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f129740f;

    /* renamed from: g  reason: collision with root package name */
    public l f129741g;

    /* renamed from: h  reason: collision with root package name */
    public eo f129742h;

    /* renamed from: i  reason: collision with root package name */
    public final String f129743i;

    /* renamed from: j  reason: collision with root package name */
    public b f129744j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f129745k;

    /* renamed from: l  reason: collision with root package name */
    public final int f129746l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.upload.c.b f129747m;
    public af n;
    public final boolean o;
    public final C3382a p;
    boolean q;
    final Object r;
    private com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> s;
    private q<h> t;
    private com.ss.android.ugc.aweme.publish.b.a.a<h> u;
    private androidx.core.d.a v;
    private final TTUploaderService w;
    private final dq x = new dq();
    private n y;
    private final com.ss.android.ugc.aweme.shortvideo.upload.a z = new com.ss.android.ugc.aweme.shortvideo.upload.a();

    static {
        Covode.recordClassIndex(85174);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.b.a$a  reason: collision with other inner class name */
    static class C3382a {

        /* renamed from: a  reason: collision with root package name */
        boolean f129763a;

        /* renamed from: b  reason: collision with root package name */
        Object f129764b;

        /* renamed from: c  reason: collision with root package name */
        h f129765c;

        static {
            Covode.recordClassIndex(85181);
        }

        private C3382a() {
        }

        /* synthetic */ C3382a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final void a(o oVar) {
        c cVar = this.E;
        if (cVar != null && cVar.f132082l != null && !cVar.f132082l.isDone() && !cVar.f132083m) {
            cVar.f132083m = true;
            com.ss.android.ugc.tools.utils.q.a("ConcurrentUploadCompiler pause");
            cVar.f132081k.w.v();
            oVar.onParallelPublishPause();
        }
    }

    public final void a(boolean z2, boolean z3) {
        x.f132161a.a("shutDown ".concat(String.valueOf(z2)));
        if (z2) {
            this.f129741g.a(true);
            this.A.a(true);
        } else if (!this.f129740f) {
            this.f129740f = true;
            if (!this.s.isDone()) {
                this.v.b();
            }
            if (!z3) {
                this.f129741g.a(false);
            }
            this.A.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final long b() {
        eo eoVar = this.f129742h;
        if (eoVar == null) {
            return -1;
        }
        return eoVar.f128437a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final long c() {
        com.ss.android.ugc.aweme.shortvideo.upload.c.b bVar = this.f129747m;
        if (bVar == null) {
            return -1;
        }
        return bVar.d();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final long d() {
        com.ss.android.ugc.aweme.shortvideo.upload.c.b bVar = this.f129747m;
        if (bVar == null) {
            return -1;
        }
        return bVar.b().c();
    }

    public final synchronized boolean e() {
        MethodCollector.i(12148);
        k kVar = this.C;
        if (kVar == null) {
            this.D = true;
            MethodCollector.o(12148);
            return true;
        }
        boolean a2 = kVar.a();
        MethodCollector.o(12148);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final void a() {
        b bVar;
        MethodCollector.i(12300);
        this.f129745k = true;
        af afVar = this.n;
        if (afVar != null) {
            afVar.f131982d = true;
        }
        com.ss.android.ugc.tools.utils.q.a("ConcurrentUploadFutureFactoryV2 merge Mode:" + this.f129746l + " isAllowMerge:" + this.f129745k);
        if (this.f129746l > 0 && (bVar = this.f129744j) != null) {
            bVar.e();
        }
        com.ss.android.ugc.aweme.shortvideo.upload.c.b bVar2 = this.f129747m;
        com.google.c.a.o oVar = bVar2.f132096a;
        h.f.b.l.b(oVar, "");
        synchronized (oVar) {
            try {
                bVar2.f132102g = true;
                com.google.c.a.o oVar2 = bVar2.f132096a;
                h.f.b.l.b(oVar2, "");
                if (oVar2.f53699a) {
                    bVar2.f132096a.c();
                }
            } finally {
                MethodCollector.o(12300);
            }
        }
        if (!this.f129740f && this.p.f129763a) {
            a(this.p.f129764b, this.p.f129765c);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> a(Object obj) {
        return b(obj);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> b(Object obj) {
        return a((VideoPublishEditModel) obj);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final boolean e(Object obj) {
        return dq.a(obj);
    }

    static q<? extends ai> a(LinkedHashMap<String, String> linkedHashMap) {
        return com.ss.android.ugc.aweme.port.in.l.f115658a.l().a().a(linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final void b(o oVar) {
        c cVar = this.E;
        if (cVar != null && cVar.f132083m) {
            com.ss.android.ugc.tools.utils.q.a("ConcurrentUploadCompiler resume");
            cVar.f132081k.w.t();
            oVar.onParallelPublishResume();
            cVar.f132083m = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final long d(Object obj) {
        return new File(((VideoPublishEditModel) obj).mParallelUploadOutputFile).length();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final synchronized q<h> c(final Object obj) {
        q<h> qVar;
        MethodCollector.i(12147);
        if (this.t == null) {
            com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor AuthKey Start");
            q<h> a2 = this.w.a();
            this.t = a2;
            com.google.c.h.a.l.a(a2, new com.google.c.h.a.k<h>() {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.b.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(85177);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor AuthKey End failed");
                    a.this.a(false, false);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(h hVar) {
                    h hVar2 = hVar;
                    com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor AuthKey End success");
                    if (a.this.f129740f) {
                        return;
                    }
                    if (a.this.f129745k) {
                        a.this.a(obj, hVar2);
                        return;
                    }
                    C3382a aVar = a.this.p;
                    Object obj = obj;
                    aVar.f129763a = true;
                    aVar.f129764b = obj;
                    aVar.f129765c = hVar2;
                }
            }, m.f68150a);
            k kVar = new k(this.f128568d, this.D, this.f128569e, this.q, (VideoPublishEditModel) obj, this.f129747m);
            this.C = kVar;
            com.google.c.h.a.l.a(this.t, kVar, m.f68150a);
            this.z.a(new c(this));
        }
        qVar = this.t;
        MethodCollector.o(12147);
        return qVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|24|22|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(12142);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:22:0x000a, LOOP_START, SYNTHETIC, Splitter:B:2:0x000a] */
    @Override // com.ss.android.ugc.aweme.shortvideo.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.core.d.a r4) {
        /*
            r3 = this;
            r2 = 12142(0x2f6e, float:1.7015E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            r3.v = r4
            com.ss.android.ugc.aweme.shortvideo.upload.a r1 = r3.z
            monitor-enter(r4)
        L_0x000a:
            boolean r0 = r4.f2293c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0012
            r4.wait()     // Catch:{ InterruptedException -> 0x000a }
            goto L_0x000a
        L_0x0012:
            androidx.core.d.a$a r0 = r4.f2292b
            if (r0 != r1) goto L_0x0018
            monitor-exit(r4)
            goto L_0x0026
        L_0x0018:
            r4.f2292b = r1
            boolean r0 = r4.f2291a
            if (r0 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r4)
            goto L_0x0026
        L_0x0022:
            monitor-exit(r4)
            r1.a()
        L_0x0026:
            com.ss.android.ugc.aweme.shortvideo.upload.a r1 = r3.z
            com.ss.android.ugc.aweme.shortvideo.publish.b.b r0 = new com.ss.android.ugc.aweme.shortvideo.publish.b.b
            r0.<init>(r3)
            r1.a(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.publish.b.a.a(androidx.core.d.a):void");
    }

    private com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> a(VideoPublishEditModel videoPublishEditModel) {
        boolean z2;
        g gVar;
        boolean z3;
        c cVar;
        com.ss.android.ugc.aweme.shortvideo.upload.b.a eVar;
        int i2;
        this.y = new n();
        this.q = dmt.av.video.m.b(videoPublishEditModel);
        this.y.f132132a = com.google.c.a.o.a();
        String str = this.f129743i;
        boolean z4 = true;
        if (this.B != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.ss.android.ugc.aweme.publish.g.a aVar = new com.ss.android.ugc.aweme.publish.g.a(videoPublishEditModel, str, z2);
        this.A = aVar;
        if (aVar.f118769b) {
            aVar.f118768a = com.google.c.a.o.b(hn.f143067b);
        }
        VEWatermarkParam vEWatermarkParam = null;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            int[] c2 = f.c(videoPublishEditModel);
            dmt.av.video.m.a(videoPublishEditModel, new Integer[]{Integer.valueOf(c2[0]), Integer.valueOf(c2[1])});
            int[] iArr = {videoPublishEditModel.mWatermarkVideoWidth, videoPublishEditModel.mWatermarkVideoHeight};
            int saveType = ((AVUploadSaveModel) Objects.requireNonNull(videoPublishEditModel.getSaveModel())).getSaveType();
            boolean a2 = com.ss.android.ugc.aweme.publish.a.a.b.a(saveType);
            gVar = com.ss.android.ugc.aweme.port.in.g.a().p().a().a(saveType, videoPublishEditModel.getLocalTempPath(), com.ss.android.ugc.aweme.shoutouts.f.a(videoPublishEditModel), com.ss.android.ugc.aweme.port.in.c.u.e(), iArr, videoPublishEditModel.getLocalTempPath(), a2);
            if (a2 && gVar != null && (i2 = iArr[1] - iArr[0]) > 0) {
                gVar.a(gVar.a() + (i2 / 2));
            }
        } else {
            gVar = null;
        }
        try {
            this.f129741g = new com.ss.android.ugc.aweme.shortvideo.af(videoPublishEditModel.mParallelUploadOutputFile, this.f128568d);
            com.ss.android.ugc.aweme.port.in.c.e();
            c cVar2 = new c(this.f129741g, this.z, this.f128568d, this.f128569e, this.f129747m);
            this.E = cVar2;
            if (gVar != null) {
                vEWatermarkParam = gVar.b();
            }
            com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar2 = new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a();
            if (videoPublishEditModel.getSaveModel() == null || !videoPublishEditModel.getSaveModel().isSaveWithCaption()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!aVar2.c() || vEWatermarkParam == null || com.ss.android.ugc.aweme.shoutouts.f.a(videoPublishEditModel)) {
                cVar = cVar2;
                StringBuilder append = new StringBuilder("ConcurrentUploadCompiler not hit ending watermark ab,isSaveWithCapiton enable: ").append(z3).append(" has caption ").append(videoPublishEditModel.hasSubtitle()).append(" watermarkParam is null ");
                if (vEWatermarkParam != null) {
                    z4 = false;
                }
                com.ss.android.ugc.tools.utils.q.d(append.append(z4).toString());
                if (!z3 || vEWatermarkParam == null || !videoPublishEditModel.hasSubtitle()) {
                    cVar.f132082l = new com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult>("ConcurrentUploadCompiler", videoPublishEditModel, vEWatermarkParam) {
                        /* class com.ss.android.ugc.aweme.shortvideo.upload.c.AnonymousClass1 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ VideoPublishEditModel f132084b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ VEWatermarkParam f132085c;

                        static {
                            Covode.recordClassIndex(86524);
                        }

                        public static boolean a(File file) {
                            MethodCollector.i(8679);
                            try {
                                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                                if (e.a(file.getAbsolutePath(), cVar)) {
                                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                                }
                                if (e.c(file.getAbsolutePath(), cVar)) {
                                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                                    MethodCollector.o(8679);
                                    return false;
                                }
                            } catch (Throwable unused) {
                            }
                            boolean delete = file.delete();
                            MethodCollector.o(8679);
                            return delete;
                        }

                        {
                            final z zVar;
                            this.f132084b = r15;
                            this.f132085c = r16;
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                i b2 = i.b(new d(this, r15), m.f68150a);
                                try {
                                    b2.f();
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                                if (b2.c()) {
                                    com.ss.android.ugc.tools.utils.q.a("ConcurrentUploadCompiler", b2.e());
                                }
                                zVar = (z) b2.d();
                                if (zVar == null) {
                                    com.ss.android.ugc.aweme.port.in.g.a().o().h().a("publish create VEEditor failed", b2.e());
                                }
                            } else {
                                zVar = f.a(r15, c.this);
                            }
                            c.this.f132081k = zVar;
                            final SynthetiseResult synthetiseResult = new SynthetiseResult();
                            synthetiseResult.draftHardEncode = this.f132084b.mHardEncode;
                            synthetiseResult.outputFile = this.f132084b.getOutputFile();
                            synthetiseResult.needRecode = f.d(this.f132084b);
                            int i2 = 1;
                            synthetiseResult.flags |= 1;
                            synthetiseResult.isEnableFpsSet = bl.a();
                            synthetiseResult.editPreviewInfo = this.f132084b.getPreviewInfo();
                            synthetiseResult.isFastImport = this.f132084b.isFastImport;
                            synthetiseResult.isFastImportForLog = es.p(this.f132084b);
                            synthetiseResult.isTTStory = this.f132084b.isStoryEditMode;
                            synthetiseResult.segmentCount = this.f132084b.segmentCounts();
                            synthetiseResult.hasSubtitle = this.f132084b.hasSubtitle();
                            if (synthetiseResult.isFastImport) {
                                v.a.a(this.f132084b.getPreviewInfo().getVideoList(), zVar.w);
                            }
                            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(zVar.w, this.f132084b.getMainBusinessContext());
                            zVar.w.c(c.this.f132074d);
                            if (c.this.f132075e == null) {
                                c.this.f132075e = new e(this, synthetiseResult, zVar);
                            }
                            zVar.w.a(c.this.f132075e);
                            if (c.this.f132076f == null) {
                                c.this.f132076f = new r() {
                                    /* class com.ss.android.ugc.aweme.shortvideo.upload.c.AnonymousClass1.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final AtomicInteger f132087a = new AtomicInteger(0);

                                    static {
                                        Covode.recordClassIndex(86525);
                                    }

                                    @Override // com.ss.android.vesdk.r
                                    public final void onCallback(int i2, int i3, float f2, String str) {
                                        int i4;
                                        String str2;
                                        String str3;
                                        if (AnonymousClass1.this.f132085c == null) {
                                            i4 = 0;
                                        } else {
                                            i4 = 1;
                                        }
                                        if (i2 == 4103) {
                                            com.ss.android.ugc.tools.utils.q.d("TE_INFO_COMPILE_DONE ext:" + i3 + " videoExt:" + i4 + " isDone():" + AnonymousClass1.this.isDone());
                                        } else if (i2 == 4118) {
                                            String str4 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i3 + " videoExt:" + i4;
                                            com.ss.android.ugc.tools.utils.q.b(str4);
                                            com.ss.android.ugc.aweme.base.o.a("aweme_synthesis_compile_log_vesdk", new ar().a("log", str4).a());
                                        }
                                        if (AnonymousClass1.this.isDone()) {
                                            return;
                                        }
                                        if (i2 == 4103) {
                                            if (i3 == 0) {
                                                synthetiseResult.videoLength = f2;
                                            }
                                            if (AnonymousClass1.this.f132085c == null || this.f132087a.incrementAndGet() == 2) {
                                                synthetiseResult.outputVideoFileInfo = aj.b(AnonymousClass1.this.f132084b.mOutputFile);
                                                try {
                                                    if (!p.f123125a) {
                                                        new dmt.av.a.h().a(AnonymousClass1.this.f132084b);
                                                    }
                                                    if (AnonymousClass1.this.f132084b.isSaveLocalWithoutWaterMark()) {
                                                        com.ss.android.ugc.aweme.video.e.e(dj.f126468k);
                                                        com.ss.android.ugc.aweme.video.e.c(synthetiseResult.outputFile, AnonymousClass1.this.f132084b.getLocalTempPath());
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                                if (AnonymousClass1.this.b(synthetiseResult)) {
                                                    i.b(new g(zVar), i.f4824a);
                                                }
                                            }
                                        } else if (i2 == 4105) {
                                            if (i3 == i4) {
                                                AnonymousClass1.this.a((int) (f2 * 100.0f));
                                            }
                                        } else if (i2 == 4112) {
                                            synthetiseResult.synthetiseCPUEncode = i3 ^ 1;
                                            StringBuilder sb = new StringBuilder("SynthesisMode NotSkip: ");
                                            if (i3 == 1) {
                                                str3 = "Hw";
                                            } else {
                                                str3 = "Sw";
                                            }
                                            com.ss.android.ugc.tools.utils.q.a(sb.append(str3).toString());
                                        } else if (i2 == 4113) {
                                            synthetiseResult.audioLength = f2;
                                        } else if (i2 == 4114) {
                                            i.b(new h(this, i2, i3, f2), i.f4826c);
                                        } else if (i2 == 4116) {
                                            if (bo.a()) {
                                                if (AnonymousClass1.this.f132084b.metadataMap == null) {
                                                    AnonymousClass1.this.f132084b.metadataMap = a.a();
                                                } else {
                                                    AnonymousClass1.this.f132084b.metadataMap.putAll(a.a());
                                                }
                                            }
                                            com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event in vecomplier");
                                        } else if (i2 == 4130) {
                                            synthetiseResult.unableRemuxCode = i3;
                                            StringBuilder sb2 = new StringBuilder("SynthesisMode IsSkipReEncode: ");
                                            if (i3 == 0) {
                                                str2 = "true";
                                            } else {
                                                str2 = "false";
                                            }
                                            com.ss.android.ugc.tools.utils.q.a(sb2.append(str2).toString());
                                        }
                                    }
                                };
                            }
                            zVar.w.c(c.this.f132076f);
                            c.this.f132073c.a(new f(this, synthetiseResult, this.f132084b, zVar, this.f132085c));
                            zVar.w.a(new VEListener.t() {
                                /* class com.ss.android.ugc.aweme.shortvideo.upload.c.AnonymousClass1.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(86526);
                                }

                                @Override // com.ss.android.vesdk.VEListener.t
                                public final void a(byte[] bArr, int i2, int i3, boolean z) {
                                    if (c.this.f132071a != null) {
                                        try {
                                            c.this.f132071a.a(bArr, i2, i3, z);
                                        } catch (Exception e2) {
                                            SynthetiseResult clone = synthetiseResult.clone();
                                            long min = Math.min(com.ss.android.ugc.aweme.video.e.f(), 2147483647L);
                                            if (com.ss.android.ugc.aweme.settings.i.a()) {
                                                com.bytedance.apm.b.a("parallel_upload_write_data_error_left_space", (int) min, new ar().a("error_info", e2.getCause().getMessage()).a());
                                            }
                                            if (com.ss.android.ugc.aweme.publish.g.c.a.a(e2)) {
                                                clone.ret = 100101;
                                            } else {
                                                clone.ret = 1001;
                                            }
                                            if (AnonymousClass1.this.a((Throwable) new ee(e2, clone))) {
                                                zVar.w.s();
                                            }
                                        }
                                    }
                                }
                            });
                            try {
                                android.ss.com.vboost.a.a(d.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                                c.this.f132077g = dmt.av.video.m.a(this.f132084b, synthetiseResult, this.f132085c, zVar.w, c.this.f132078h);
                                com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor SynthetiseStart " + c.this.f132077g.toString());
                                zVar.w.a("te_is_fast_import", String.valueOf(!es.p(this.f132084b) ? 0 : i2));
                                if (this.f132084b.isMultiVideoEdit() && !TextUtils.isEmpty(this.f132084b.multiEditVideoRecordData.videoMetaData)) {
                                    zVar.w.a("description", this.f132084b.multiEditVideoRecordData.videoMetaData);
                                }
                                com.ss.android.ugc.aweme.draft.k.a("mVEEditor.compile source.getOutputFile() : " + this.f132084b.getOutputFile());
                                zVar.w.a(this.f132084b.getOutputFile(), c.this.f132077g);
                            } catch (Throwable th) {
                                a(th);
                                com.ss.android.ugc.tools.utils.q.b("CompileFailed " + th.getMessage());
                            }
                        }
                    };
                } else {
                    com.ss.android.ugc.aweme.shortvideo.upload.b.j jVar = new com.ss.android.ugc.aweme.shortvideo.upload.b.j(videoPublishEditModel, vEWatermarkParam, cVar, cVar.f132074d, cVar.f132072b, cVar.f132073c, cVar.f132071a, cVar.f132078h);
                    cVar.f132081k = jVar.j();
                    cVar.f132082l = jVar;
                }
            } else {
                com.ss.android.ugc.tools.utils.q.d("ConcurrentUploadCompiler hit ending watermark ab,isSaveWithCapiton enable: " + z3 + " has caption " + videoPublishEditModel.hasSubtitle());
                if (!z3 || !videoPublishEditModel.hasSubtitle()) {
                    cVar = cVar2;
                    eVar = new com.ss.android.ugc.aweme.shortvideo.upload.b.e(videoPublishEditModel, aVar2, vEWatermarkParam, cVar, cVar.f132074d, cVar.f132072b, cVar.f132073c, cVar.f132071a, cVar.f132078h);
                } else {
                    cVar = cVar2;
                    eVar = new com.ss.android.ugc.aweme.shortvideo.upload.b.h(videoPublishEditModel, aVar2, vEWatermarkParam, cVar2, cVar2.f132074d, cVar2.f132072b, cVar2.f132073c, cVar2.f132071a, cVar2.f132078h);
                }
                cVar.f132081k = eVar.j();
                cVar.f132082l = eVar;
            }
            boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
            w wVar = new w(cVar.f132078h, cVar.f132079i, videoPublishEditModel, cVar.f132080j, cVar.f132072b);
            if (isMvThemeVideoType && videoPublishEditModel.uploadMiscInfoStruct != null) {
                wVar.f132154a = videoPublishEditModel.uploadMiscInfoStruct.mvThemeId;
            }
            com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> aVar3 = cVar.f132082l;
            h.f.b.l.d(aVar3, "");
            com.ss.android.ugc.aweme.port.in.g.a();
            cVar.f132082l = aVar3;
            com.google.c.h.a.l.a(cVar.f132082l, wVar, i.f4826c);
            com.google.c.h.a.l.a(cVar.f132082l, new com.ss.android.ugc.aweme.publish.g.a.b(cVar.f132072b), i.f4826c);
            this.s = cVar.f132082l;
            com.ss.android.ugc.aweme.shortvideo.upload.c.b bVar = this.f129747m;
            if (bVar.a().f53699a) {
                com.ss.android.ugc.aweme.shortvideo.upload.c.b.a("repeat startSynthetic");
            } else {
                bVar.a().b();
                bVar.f132097b = System.currentTimeMillis();
            }
            com.google.c.h.a.l.a(this.s, new com.google.c.h.a.k<SynthetiseResult>() {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(85176);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    com.ss.android.ugc.tools.utils.q.a("ConcurrentUploadCompiler onFailure");
                    a.this.a(false, com.ss.android.ugc.aweme.publish.g.c.a.c(th));
                    a.this.f129747m.a(com.ss.android.ugc.aweme.publish.g.c.a.b(th));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                    a.this.f129747m.a(0);
                    a.this.f129747m.f132100e = a.this.f129741g.d();
                    a.this.f129747m.f132101f = a.this.f129741g.e() - a.this.f129741g.d();
                }
            }, m.f68150a);
            c(videoPublishEditModel);
            return this.s;
        } catch (Exception unused) {
            return new com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult>(videoPublishEditModel) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.b.a.AnonymousClass1 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ VideoPublishEditModel f129748b;

                static {
                    Covode.recordClassIndex(85175);
                }

                {
                    this.f129748b = r5;
                    a((Throwable) c.a.a().a(new SynthetiseResult()).a("unable to mkdir " + r5.mParallelUploadOutputFile).a());
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public final q<? extends ai> a(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor CreateAweme start");
        q<ai> a2 = bb.a(com.google.c.h.a.l.a(a(linkedHashMap), IOException.class, new h(this, linkedHashMap), u.a.INSTANCE));
        com.google.c.h.a.l.a(a2, new com.ss.android.ugc.aweme.publish.g.a.a(this.y, this.f128568d, this.f128569e, this.q, videoPublishEditModel), u.a.INSTANCE);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0341  */
    @Override // com.ss.android.ugc.aweme.shortvideo.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.ugc.aweme.publish.b.a.a<com.ss.android.ugc.aweme.publish.f.h> a(java.lang.Object r41, com.ss.android.ugc.aweme.publish.f.h r42) {
        /*
        // Method dump skipped, instructions count: 846
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.publish.b.a.a(java.lang.Object, com.ss.android.ugc.aweme.publish.f.h):com.ss.android.ugc.aweme.publish.b.a.a");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.j
    public final q<? extends ai> a(Object obj, h hVar, SynthetiseResult synthetiseResult) {
        d.a aVar;
        s bVar;
        s sVar;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (com.bytedance.ies.abmock.b.a().a(true, "studio_build_create_aweme_fields_async", false)) {
            ExecutorService executorService = i.f4824a;
            if (executorService instanceof s) {
                sVar = (s) executorService;
            } else {
                if (executorService instanceof ScheduledExecutorService) {
                    bVar = new u.c((ScheduledExecutorService) executorService);
                } else {
                    bVar = new u.b(executorService);
                }
                sVar = bVar;
            }
            q a2 = sVar.a(new f(videoPublishEditModel, hVar, synthetiseResult));
            g gVar = new g(this, videoPublishEditModel);
            ExecutorService executorService2 = i.f4824a;
            com.google.c.a.k.a(executorService2);
            d.a aVar2 = new d.a(a2, gVar);
            a2.a(aVar2, u.a(executorService2, aVar2));
            aVar = aVar2;
        } else {
            aVar = a(videoPublishEditModel, new ac(videoPublishEditModel, hVar, synthetiseResult).a());
        }
        return com.google.c.h.a.l.a(aVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, new ab(new e(this, obj, hVar, synthetiseResult)), m.f68150a);
    }

    public a(TTUploaderService tTUploaderService, String str, int i2, int i3, int i4, Object obj) {
        super(i3, i4);
        this.r = obj;
        this.w = tTUploaderService;
        this.f129743i = str;
        this.B = i2;
        this.f129746l = com.ss.android.ugc.aweme.port.in.g.a().e().getPreUploadEncryptionMode(0);
        this.f128565a = i3;
        this.f128566b = i4;
        this.f129747m = new com.ss.android.ugc.aweme.shortvideo.upload.c.b();
        this.p = new C3382a((byte) 0);
        this.o = com.bytedance.ies.abmock.b.a().a(true, "enable_only_report_key_upload_log", false);
    }
}
