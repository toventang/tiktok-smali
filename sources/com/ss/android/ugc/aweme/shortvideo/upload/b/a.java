package com.ss.android.ugc.aweme.shortvideo.upload.b;

import android.os.Looper;
import android.text.TextUtils;
import androidx.core.d.a;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.property.bl;
import com.ss.android.ugc.aweme.property.bo;
import com.ss.android.ugc.aweme.settings.p;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.af;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.b.d;
import com.ss.android.ugc.aweme.shortvideo.upload.b.f;
import com.ss.android.ugc.aweme.shortvideo.upload.l;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.r;
import dmt.av.video.aj;
import dmt.av.video.z;
import h.a.n;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a extends com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> {
    public static final C3426a t = new C3426a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public volatile c f131990b = c.BiChannelSynthesis;

    /* renamed from: c  reason: collision with root package name */
    protected r f131991c;

    /* renamed from: i  reason: collision with root package name */
    protected r f131992i;

    /* renamed from: j  reason: collision with root package name */
    public VEVideoEncodeSettings f131993j;

    /* renamed from: k  reason: collision with root package name */
    protected z f131994k;

    /* renamed from: l  reason: collision with root package name */
    public final VideoPublishEditModel f131995l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.upload.b.a.a f131996m;
    public final VEWatermarkParam n;
    public final m o;
    public final List<String> p;
    public final com.ss.android.ugc.aweme.shortvideo.upload.a q;
    public final l r;
    public final String s;
    private final int u;

    static {
        Covode.recordClassIndex(86485);
    }

    /* access modifiers changed from: protected */
    public abstract VEVideoEncodeSettings a(com.ss.android.ugc.asve.editor.g gVar, SynthetiseResult synthetiseResult);

    /* access modifiers changed from: protected */
    public abstract void a(SynthetiseResult synthetiseResult);

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public String i() {
        return "ParallelWithEndWatermark";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$a  reason: collision with other inner class name */
    public static final class C3426a {
        static {
            Covode.recordClassIndex(86486);
        }

        private C3426a() {
        }

        public /* synthetic */ C3426a(byte b2) {
            this();
        }
    }

    public abstract class b implements r {

        /* renamed from: a  reason: collision with root package name */
        public AtomicInteger f132001a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.asve.editor.g f132002b;

        /* renamed from: c  reason: collision with root package name */
        public final SynthetiseResult f132003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f132004d;

        /* renamed from: e  reason: collision with root package name */
        private final int f132005e = 1;

        static {
            Covode.recordClassIndex(86487);
        }

        public abstract void a(com.ss.android.ugc.asve.editor.g gVar, SynthetiseResult synthetiseResult);

        /* access modifiers changed from: protected */
        public abstract boolean b();

        public int a() {
            return this.f132005e;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$b$a  reason: collision with other inner class name */
        static final class CallableC3428a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f132006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f132007b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f132008c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f132009d;

            static {
                Covode.recordClassIndex(86488);
            }

            CallableC3428a(b bVar, int i2, int i3, float f2) {
                this.f132006a = bVar;
                this.f132007b = i2;
                this.f132008c = i3;
                this.f132009d = f2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f132006a.f132004d.p.add("type:" + this.f132007b + " ext:" + this.f132008c + " f:" + this.f132009d);
                return null;
            }
        }

        public b(a aVar, com.ss.android.ugc.asve.editor.g gVar, SynthetiseResult synthetiseResult) {
            h.f.b.l.d(gVar, "");
            h.f.b.l.d(synthetiseResult, "");
            this.f132004d = aVar;
            this.f132002b = gVar;
            this.f132003c = synthetiseResult;
        }

        @Override // com.ss.android.vesdk.r
        public void onCallback(int i2, int i3, float f2, String str) {
            String str2;
            String str3;
            if (this.f132004d.f131990b == c.BiChannelSynthesis) {
                if (i2 == 4103) {
                    q.d("TE_INFO_COMPILE_DONE ext:" + i3 + " videoExt:" + a() + " isDone():" + this.f132004d.isDone());
                } else if (i2 == 4118) {
                    String str4 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i3 + " videoExt:" + a();
                    q.b(str4);
                    o.a("aweme_synthesis_compile_log_vesdk", new ar().a("log", str4).a());
                }
                if (this.f132004d.isDone()) {
                    return;
                }
                if (i2 == 4103) {
                    if (i3 == 0) {
                        this.f132003c.videoLength = f2;
                    }
                    if (b()) {
                        this.f132003c.outputVideoFileInfo = aj.b(this.f132004d.f131995l.mOutputFile);
                        try {
                            if (!p.f123125a) {
                                new dmt.av.a.h().a(this.f132004d.f131995l);
                            }
                            if (this.f132004d.f131995l.isSaveLocalWithoutWaterMark()) {
                                com.ss.android.ugc.aweme.video.e.e(dj.f126468k);
                                com.ss.android.ugc.aweme.video.e.c(this.f132003c.outputFile, this.f132004d.f131995l.getLocalTempPath());
                            }
                        } catch (Throwable unused) {
                        }
                        q.d("ParallelWithEndWatermark onCallback: onCompileDone outputFile " + this.f132003c.outputFile + " watermarkFile " + this.f132004d.n.extFile);
                        this.f132002b.a((VEListener.t) null);
                        this.f132002b.d(this.f132004d.f());
                        this.f132002b.b(this.f132004d.e());
                        this.f132002b.s();
                        a(this.f132002b, this.f132003c);
                    }
                } else if (i2 == 4105) {
                    if (i3 == a()) {
                        this.f132004d.b(h.g.a.a(f2 * 100.0f));
                    }
                } else if (i2 == 4112) {
                    this.f132003c.synthetiseCPUEncode = i3 ^ 1;
                    StringBuilder sb = new StringBuilder("SynthesisMode NotSkip: ");
                    if (i3 == 1) {
                        str3 = "Hw";
                    } else {
                        str3 = "Sw";
                    }
                    q.a(sb.append(str3).toString());
                } else if (i2 == 4113) {
                    this.f132003c.audioLength = f2;
                } else if (i2 == 4114) {
                    b.i.b(new CallableC3428a(this, i2, i3, f2), b.i.f4826c);
                } else if (i2 == 4116) {
                    if (bo.a()) {
                        if (this.f132004d.f131995l.metadataMap == null) {
                            this.f132004d.f131995l.metadataMap = com.ss.android.ttve.editorInfo.a.a();
                        } else {
                            Map<String, Object> map = this.f132004d.f131995l.metadataMap;
                            Map<String, Object> a2 = com.ss.android.ttve.editorInfo.a.a();
                            h.f.b.l.b(a2, "");
                            map.putAll(a2);
                        }
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event in vecomplier");
                } else if (i2 == 4130) {
                    this.f132003c.unableRemuxCode = i3;
                    StringBuilder sb2 = new StringBuilder("SynthesisMode IsSkipReEncode: ");
                    if (i3 == 0) {
                        str2 = "true";
                    } else {
                        str2 = "false";
                    }
                    q.a(sb2.append(str2).toString());
                }
            }
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132019a;

        static {
            Covode.recordClassIndex(86492);
        }

        f(a aVar) {
            this.f132019a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return dmt.av.video.f.a(this.f132019a.f131995l, this.f132019a.o);
        }
    }

    /* access modifiers changed from: protected */
    public final r e() {
        r rVar = this.f131991c;
        if (rVar == null) {
            h.f.b.l.a("mErrorCallback");
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    public final r f() {
        r rVar = this.f131992i;
        if (rVar == null) {
            h.f.b.l.a("mInfoCallback");
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    public final z g() {
        z zVar = this.f131994k;
        if (zVar == null) {
            h.f.b.l.a("mVEVideoPublishEditPresenter");
        }
        return zVar;
    }

    public final z j() {
        z zVar = this.f131994k;
        if (zVar == null) {
            h.f.b.l.a("mVEVideoPublishEditPresenter");
        }
        return zVar;
    }

    static final class g implements a.AbstractC0029a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a.b.b f132020a;

        static {
            Covode.recordClassIndex(86493);
        }

        g(f.a.b.b bVar) {
            this.f132020a = bVar;
        }

        @Override // androidx.core.d.a.AbstractC0029a
        public final void a() {
            f.a.b.b bVar = this.f132020a;
            h.f.b.l.b(bVar, "");
            if (!bVar.isDisposed()) {
                this.f132020a.dispose();
            }
        }
    }

    static final class d implements a.AbstractC0029a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f132015c;

        static {
            Covode.recordClassIndex(86490);
        }

        d(a aVar, SynthetiseResult synthetiseResult, z zVar) {
            this.f132013a = aVar;
            this.f132014b = synthetiseResult;
            this.f132015c = zVar;
        }

        @Override // androidx.core.d.a.AbstractC0029a
        public final void a() {
            String str;
            int i2;
            SynthetiseResult clone = this.f132014b.clone();
            h.f.b.l.b(clone, "");
            clone.ret = -66666;
            if (!(this.f132013a.r instanceof af) || ((af) this.f132013a.r).o != -1) {
                str = "Compiler canceled";
            } else {
                str = "Compiler stuck; " + this.f132013a.f131993j;
                EditPreviewInfo previewInfo = this.f132013a.f131995l.getPreviewInfo();
                if (previewInfo != null) {
                    i2 = previewInfo.getVideoList().size();
                } else {
                    i2 = 0;
                }
                String a2 = com.a.a(Locale.US, "-6666601 videoSize:%d isRecordToEditFrameOptimizeAB:%b", Arrays.copyOf(new Object[]{Integer.valueOf(i2), true}, 2));
                h.f.b.l.b(a2, "");
                q.b(a2);
                com.ss.android.ugc.aweme.df.f.a(a2);
                clone.ret = -6666601;
            }
            a aVar = this.f132013a;
            com.ss.android.ugc.aweme.shortvideo.publish.a.c a3 = c.a.a().a(clone).a(str);
            cr a4 = cr.a();
            h.f.b.l.b(a4, "");
            com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar2 = a4.f125305l;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.exception.CancelCause");
            if (aVar.a((Throwable) a3.a(aVar2).a())) {
                q.a("ParallelWithEndWatermark cancelUpload");
                l lVar = this.f132013a.r;
                if (lVar != null) {
                    lVar.b();
                }
                this.f132015c.w.s();
            }
            if (this.f132014b.outputFile != null) {
                File file = new File(this.f132014b.outputFile);
                if (file.exists()) {
                    a(file);
                    k.a("incompleteFile delete incompleteFile : ".concat(String.valueOf(file)));
                }
                File file2 = new File(this.f132013a.n.extFile);
                if (file2.exists()) {
                    a(file2);
                    k.a("incompleteWatermarkFile delete incompleteWatermarkFile : ".concat(String.valueOf(file2)));
                }
            }
        }

        private static boolean a(File file) {
            MethodCollector.i(12230);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(12230);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(12230);
            return delete;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(r rVar) {
        h.f.b.l.d(rVar, "");
        this.f131992i = rVar;
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132022a;

        static {
            Covode.recordClassIndex(86495);
        }

        i(a aVar) {
            this.f132022a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                this.f132022a.a(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar) {
        h.f.b.l.d(cVar, "");
        this.f131990b = cVar;
    }

    public final void b(int i2) {
        a(a(this.f131990b, i2));
    }

    /* access modifiers changed from: protected */
    public final void a(r rVar) {
        h.f.b.l.d(rVar, "");
        this.f131991c = rVar;
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132021a;

        static {
            Covode.recordClassIndex(86494);
        }

        h(a aVar) {
            this.f132021a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d dVar = (d) obj;
            if (dVar != null) {
                if (dVar instanceof d.a) {
                    this.f132021a.b(((d.a) dVar).f132025a);
                } else if (dVar instanceof d.c) {
                    this.f132021a.b((Object) ((d.c) dVar).f132027a);
                } else if (dVar instanceof d.b) {
                    this.f132021a.a(((d.b) dVar).f132026a);
                }
            }
        }
    }

    public static boolean a(Exception exc) {
        String str;
        String str2;
        long min = Math.min(com.ss.android.ugc.aweme.video.e.f(), 2147483647L);
        if (com.ss.android.ugc.aweme.settings.i.a()) {
            int i2 = (int) min;
            ar arVar = new ar();
            Throwable cause = exc.getCause();
            if (cause == null || (str2 = cause.getMessage()) == null) {
                str2 = "empty message";
            }
            com.bytedance.apm.b.a("parallel_upload_write_data_error_left_space", i2, arVar.a("error_info", str2).a());
        }
        if (!(exc.getCause() instanceof IOException)) {
            return false;
        }
        Throwable cause2 = exc.getCause();
        if (cause2 != null) {
            str = cause2.getMessage();
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) str, (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(SynthetiseResult synthetiseResult) {
        int i2;
        VESize watermarkVideoRes;
        VESize watermarkVideoRes2;
        h.f.b.l.d(synthetiseResult, "");
        this.f131990b = c.EndingWatermarkSynthesis;
        q.a("ParallelWithEndWatermark", "bi-channel(watermark & origin video) synthesis finished.");
        List b2 = n.b(Integer.valueOf(this.f131995l.sourceVideoWidth()), Integer.valueOf(this.f131995l.sourceVideoHeight()));
        Integer[] numArr = new Integer[2];
        VEVideoEncodeSettings vEVideoEncodeSettings = this.f131993j;
        int i3 = -1;
        if (vEVideoEncodeSettings == null || (watermarkVideoRes2 = vEVideoEncodeSettings.getWatermarkVideoRes()) == null) {
            i2 = -1;
        } else {
            i2 = watermarkVideoRes2.width;
        }
        numArr[0] = Integer.valueOf(i2);
        VEVideoEncodeSettings vEVideoEncodeSettings2 = this.f131993j;
        if (!(vEVideoEncodeSettings2 == null || (watermarkVideoRes = vEVideoEncodeSettings2.getWatermarkVideoRes()) == null)) {
            i3 = watermarkVideoRes.height;
        }
        numArr[1] = Integer.valueOf(i3);
        List b3 = n.b(numArr);
        List<Integer> a2 = a(b2, b3);
        String outputFile = this.f131995l.getOutputFile();
        h.f.b.l.b(outputFile, "");
        String draftDir = this.f131995l.draftDir();
        h.f.b.l.b(draftDir, "");
        String localTempPath = this.f131995l.getLocalTempPath();
        h.f.b.l.b(localTempPath, "");
        g gVar = new g(a2, b3, outputFile, draftDir, localTempPath);
        VEVideoEncodeSettings vEVideoEncodeSettings3 = this.f131993j;
        com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar = this.f131996m;
        String str = this.n.extFile;
        h.f.b.l.b(str, "");
        f fVar = new f(gVar, synthetiseResult, vEVideoEncodeSettings3, aVar, str);
        fVar.f132031b = System.currentTimeMillis();
        f.a.l.b a3 = f.a.l.b.a(new d.a(0));
        h.f.b.l.b(a3, "");
        fVar.f132030a = a3;
        SynthetiseResult synthetiseResult2 = fVar.f132033d;
        VEVideoEncodeSettings vEVideoEncodeSettings4 = fVar.f132034e;
        if (vEVideoEncodeSettings4 == null) {
            fVar.a(-100, synthetiseResult2, null);
        } else {
            com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
            if (e2 == null) {
                fVar.a(-101, synthetiseResult2, null);
            } else {
                com.ss.android.ugc.aweme.port.in.g.a().p().a(fVar.f132032c.f132043b, fVar.f132032c.f132044c.toString(), e2, new f.c(fVar, vEVideoEncodeSettings4, synthetiseResult2), new f.d(fVar, synthetiseResult2));
            }
        }
        f.a.l.g<d> gVar2 = fVar.f132030a;
        if (gVar2 == null) {
            h.f.b.l.a("mSubject");
        }
        this.q.a(new g(gVar2.a(f.a.h.a.b(f.a.k.a.f158006c)).a(new h(this), new i(this))));
    }

    protected static List<Integer> a(List<Integer> list, List<Integer> list2) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(list2, "");
        if (list.get(0).intValue() > list.get(1).intValue()) {
            return n.b(list2.get(0), Integer.valueOf((int) ((list2.get(0).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue()))));
        }
        return n.b(list2.get(0), Integer.valueOf(Math.min((int) ((list2.get(0).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue())), list2.get(1).intValue())));
    }

    /* access modifiers changed from: protected */
    public int a(c cVar, int i2) {
        h.f.b.l.d(cVar, "");
        int i3 = b.f132023a[cVar.ordinal()];
        if (i3 == 1) {
            return Math.min(80, h.g.a.a(((float) (i2 * 80)) / 100.0f));
        }
        if (i3 != 2) {
            return Math.min(100, h.g.a.a((((float) (i2 * 5)) / 100.0f) + 95.0f));
        }
        return Math.min(95, h.g.a.a((((float) (i2 * 15)) / 100.0f) + 80.0f));
    }

    static final class e implements VEListener.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f132018c;

        static {
            Covode.recordClassIndex(86491);
        }

        e(a aVar, SynthetiseResult synthetiseResult, z zVar) {
            this.f132016a = aVar;
            this.f132017b = synthetiseResult;
            this.f132018c = zVar;
        }

        @Override // com.ss.android.vesdk.VEListener.t
        public final void a(byte[] bArr, int i2, int i3, boolean z) {
            try {
                l lVar = this.f132016a.r;
                if (lVar != null) {
                    lVar.a(bArr, i2, i3, z);
                }
            } catch (Exception e2) {
                SynthetiseResult clone = this.f132017b.clone();
                h.f.b.l.b(clone, "");
                if (a.a(e2)) {
                    clone.ret = 100101;
                } else {
                    clone.ret = 1001;
                }
                if (this.f132016a.a((Throwable) new ee(e2, clone))) {
                    this.f132018c.w.s();
                }
            }
        }
    }

    static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f132010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f132012c;

        static {
            Covode.recordClassIndex(86489);
        }

        c(a aVar, SynthetiseResult synthetiseResult, z zVar) {
            this.f132010a = aVar;
            this.f132011b = synthetiseResult;
            this.f132012c = zVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            h.f.b.l.d(str, "");
            if (this.f132010a.f131990b == c.BiChannelSynthesis) {
                SynthetiseResult clone = this.f132011b.clone();
                h.f.b.l.b(clone, "");
                clone.ret = h.g.a.a(f2);
                if (this.f132010a.a((Throwable) c.a.a().a(clone).a("Compiler failed. type = " + i2 + " ext = " + i3 + " f = " + f2 + " msg = " + str).a())) {
                    if (i3 == -214) {
                        com.ss.android.ugc.aweme.property.b.f118355a = true;
                    }
                    this.f132012c.w.s();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar, VEWatermarkParam vEWatermarkParam, m mVar, int i2, List<String> list, com.ss.android.ugc.aweme.shortvideo.upload.a aVar2, l lVar, String str) {
        super("ParallelWithEndWatermark");
        z zVar;
        String str2;
        h.f.b.l.d(videoPublishEditModel, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(vEWatermarkParam, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(str, "");
        this.f131995l = videoPublishEditModel;
        this.f131996m = aVar;
        this.n = vEWatermarkParam;
        this.o = mVar;
        this.u = i2;
        this.p = list;
        this.q = aVar2;
        this.r = lVar;
        this.s = str;
        h();
        if (!h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            b.i b2 = b.i.b(new f(this), com.ss.android.ugc.aweme.base.m.f68150a);
            h.f.b.l.b(b2, "");
            try {
                b2.f();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (b2.c()) {
                q.a("ParallelWithEndWatermark", b2.e());
            }
            if (b2.d() == null) {
                com.ss.android.ugc.aweme.publish.i h2 = com.ss.android.ugc.aweme.port.in.g.a().o().h();
                Exception e3 = b2.e();
                h.f.b.l.b(e3, "");
                h2.a("publish create VEEditor failed", e3);
            }
            Object d2 = b2.d();
            h.f.b.l.b(d2, "");
            zVar = (z) d2;
        } else {
            zVar = dmt.av.video.f.a(videoPublishEditModel, mVar);
        }
        this.f131994k = zVar;
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.draftHardEncode = this.f131995l.mHardEncode;
        synthetiseResult.outputFile = this.f131995l.getOutputFile().toString();
        synthetiseResult.needRecode = dmt.av.video.f.d(this.f131995l);
        synthetiseResult.flags |= 1;
        synthetiseResult.isEnableFpsSet = bl.a();
        synthetiseResult.editPreviewInfo = this.f131995l.getPreviewInfo();
        synthetiseResult.isFastImport = this.f131995l.isFastImport;
        synthetiseResult.isFastImportForLog = es.p(this.f131995l);
        synthetiseResult.segmentCount = this.f131995l.segmentCounts();
        if (synthetiseResult.isFastImport) {
            List<EditVideoSegment> videoList = this.f131995l.getPreviewInfo().getVideoList();
            com.ss.android.ugc.asve.editor.g gVar = zVar.w;
            h.f.b.l.b(gVar, "");
            v.a.a(videoList, gVar);
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(zVar.w, this.f131995l.getMainBusinessContext());
        zVar.w.c(this.u);
        this.f131991c = new c(this, synthetiseResult, zVar);
        com.ss.android.ugc.asve.editor.g gVar2 = zVar.w;
        r rVar = this.f131991c;
        if (rVar == null) {
            h.f.b.l.a("mErrorCallback");
        }
        gVar2.a(rVar);
        a(synthetiseResult);
        com.ss.android.ugc.asve.editor.g gVar3 = zVar.w;
        r rVar2 = this.f131992i;
        if (rVar2 == null) {
            h.f.b.l.a("mInfoCallback");
        }
        gVar3.c(rVar2);
        this.q.a(new d(this, synthetiseResult, zVar));
        zVar.w.a(new e(this, synthetiseResult, zVar));
        try {
            com.ss.android.ugc.asve.editor.g gVar4 = zVar.w;
            h.f.b.l.b(gVar4, "");
            this.f131993j = a(gVar4, synthetiseResult);
            q.a("PublishDurationMonitor SynthetiseStart " + String.valueOf(this.f131993j));
            com.ss.android.ugc.asve.editor.g gVar5 = zVar.w;
            if (es.p(this.f131995l)) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            gVar5.a("te_is_fast_import", str2);
            if (this.f131995l.isMultiVideoEdit() && !TextUtils.isEmpty(this.f131995l.multiEditVideoRecordData.videoMetaData)) {
                com.ss.android.ugc.asve.editor.g gVar6 = zVar.w;
                String str3 = this.f131995l.multiEditVideoRecordData.videoMetaData;
                h.f.b.l.b(str3, "");
                gVar6.a("description", str3);
            }
            k.a("mVEEditor.compile mModel.getOutputFile() : " + this.f131995l.getOutputFile());
            com.ss.android.ugc.asve.editor.g gVar7 = zVar.w;
            String str4 = this.f131995l.getOutputFile().toString();
            VEVideoEncodeSettings vEVideoEncodeSettings = this.f131993j;
            if (vEVideoEncodeSettings == null) {
                h.f.b.l.b();
            }
            gVar7.a(str4, vEVideoEncodeSettings);
        } catch (Throwable th) {
            a(th);
            q.b("CompileFailed " + th.getMessage());
        }
    }
}
