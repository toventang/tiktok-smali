package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.property.en;
import com.ss.android.ugc.aweme.property.v;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.br;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.n;
import h.z;
import java.util.List;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f145699c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CompileProbeConfig f145700a;

    /* renamed from: b  reason: collision with root package name */
    public d f145701b;

    /* renamed from: com.ss.android.ugc.gamora.editor.c$c  reason: collision with other inner class name */
    public static abstract class AbstractC3872c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f145719a = new a((byte) 0);

        static {
            Covode.recordClassIndex(95691);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$a */
        public static final class a {
            static {
                Covode.recordClassIndex(95692);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        private AbstractC3872c() {
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b */
        public static abstract class b extends AbstractC3872c {

            /* renamed from: b  reason: collision with root package name */
            public final int f145721b;

            static {
                Covode.recordClassIndex(95693);
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a */
            public static abstract class a extends b {
                static {
                    Covode.recordClassIndex(95694);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a$b  reason: collision with other inner class name */
                public static final class C3874b extends a {

                    /* renamed from: c  reason: collision with root package name */
                    public static final C3874b f145722c = new C3874b();

                    private C3874b() {
                        super(-234, (byte) 0);
                    }

                    static {
                        Covode.recordClassIndex(95696);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$a$a  reason: collision with other inner class name */
                public static final class C3873a extends a {
                    static {
                        Covode.recordClassIndex(95695);
                    }

                    public C3873a(int i2) {
                        super(i2, (byte) 0);
                    }
                }

                private a(int i2) {
                    super(i2, (byte) 0);
                }

                public /* synthetic */ a(int i2, byte b2) {
                    this(i2);
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b  reason: collision with other inner class name */
            public static abstract class AbstractC3875b extends b {
                static {
                    Covode.recordClassIndex(95697);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$a */
                public static final class a extends AbstractC3875b {
                    static {
                        Covode.recordClassIndex(95698);
                    }

                    public a(int i2) {
                        super(i2, (byte) 0);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$b  reason: collision with other inner class name */
                public static final class C3876b extends AbstractC3875b {
                    static {
                        Covode.recordClassIndex(95699);
                    }

                    public C3876b(int i2) {
                        super(i2, (byte) 0);
                    }
                }

                private AbstractC3875b(int i2) {
                    super(i2, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$c$b$b$c  reason: collision with other inner class name */
                public static final class C3877c extends AbstractC3875b {

                    /* renamed from: c  reason: collision with root package name */
                    public final String f145723c;

                    static {
                        Covode.recordClassIndex(95700);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3877c(String str) {
                        super(-233, (byte) 0);
                        l.d(str, "");
                        this.f145723c = str;
                    }
                }

                public /* synthetic */ AbstractC3875b(int i2, byte b2) {
                    this(i2);
                }
            }

            private b(int i2) {
                super((byte) 0);
                this.f145721b = i2;
            }

            public /* synthetic */ b(int i2, byte b2) {
                this(i2);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$c  reason: collision with other inner class name */
        public static final class C3878c extends AbstractC3872c {

            /* renamed from: b  reason: collision with root package name */
            public static final C3878c f145724b = new C3878c();

            private C3878c() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95701);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$d */
        public static final class d extends AbstractC3872c {

            /* renamed from: b  reason: collision with root package name */
            public static final d f145726b = new d();

            private d() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95702);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.c$c$e */
        public static final class e extends AbstractC3872c {

            /* renamed from: b  reason: collision with root package name */
            public static final e f145727b = new e();

            private e() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(95703);
            }
        }

        public /* synthetic */ AbstractC3872c(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(95688);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(95689);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            q.a("CompileProbe + ".concat(String.valueOf(str)));
        }

        public static boolean a(VideoPublishEditModel videoPublishEditModel) {
            l.d(videoPublishEditModel, "");
            a("isSingleSegmentVideo: " + videoPublishEditModel.mIsMultiVideo + ' ' + videoPublishEditModel.mFromCut + ' ' + videoPublishEditModel.mVideoSegmentsDesc, false);
            if (videoPublishEditModel.mIsMultiVideo) {
                return false;
            }
            if (videoPublishEditModel.mFromCut) {
                return true;
            }
            String str = videoPublishEditModel.mVideoSegmentsDesc;
            if (str == null || str.length() == 0 || CameraComponentModel.a(videoPublishEditModel.mVideoSegmentsDesc).size() != 1) {
                return false;
            }
            return true;
        }

        public static void a(String str, boolean z) {
            l.d(str, "");
            if (z) {
                q.a("CompileProbe + ".concat(String.valueOf(str)));
            }
        }
    }

    public static final class b extends RuntimeException {
        private final AbstractC3872c.b failed;

        static {
            Covode.recordClassIndex(95690);
        }

        public final AbstractC3872c.b getFailed() {
            return this.failed;
        }

        public b(AbstractC3872c.b bVar) {
            l.d(bVar, "");
            this.failed = bVar;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            String a2 = v.a();
            if (a2 != null && a2.length() != 0) {
                try {
                    this.this$0.f145700a = (CompileProbeConfig) com.ss.android.ugc.aweme.port.in.g.a().G().a(a2, CompileProbeConfig.class);
                } catch (Exception unused) {
                    a.a("solveCompileProbeConfig failed: ".concat(String.valueOf(a2)));
                }
                a.a("solveCompileProbeConfig config: " + this.this$0.f145700a, true);
            }
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ g $createStartProbeSingle$1;
        final /* synthetic */ z.e $startTask;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, z.e eVar, g gVar) {
            super(0);
            this.this$0 = cVar;
            this.$startTask = eVar;
            this.$createStartProbeSingle$1 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            a.a("Start", true);
            this.$startTask.element = (T) this.$createStartProbeSingle$1.invoke().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.gamora.editor.c.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f145737a;

                static {
                    Covode.recordClassIndex(95712);
                }

                {
                    this.f145737a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                    d dVar = this.f145737a.this$0.f145701b;
                    if (dVar != null) {
                        l.b(compileProbeResult, "");
                        dVar.a(compileProbeResult);
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.gamora.editor.c.h.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f145738a;

                static {
                    Covode.recordClassIndex(95713);
                }

                {
                    this.f145738a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th instanceof b) {
                        d dVar = this.f145738a.this$0.f145701b;
                        if (dVar != null) {
                            dVar.a(((b) th).getFailed());
                            return;
                        }
                        return;
                    }
                    d dVar2 = this.f145738a.this$0.f145701b;
                    if (dVar2 != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "FailedNoMessage";
                        }
                        dVar2.a(new AbstractC3872c.b.AbstractC3875b.C3877c(message));
                    }
                }
            });
        }
    }

    static final class i extends m implements h.f.a.a<h.z> {
        final /* synthetic */ z.e $startTask;

        static {
            Covode.recordClassIndex(95714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(z.e eVar) {
            super(0);
            this.$startTask = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            MethodCollector.i(5671);
            a.a("ManualCancel", true);
            T t = this.$startTask.element;
            if (t != null) {
                t.dispose();
            }
            TEVideoUtils.nativeCancelCompileProbe();
            MethodCollector.o(5671);
        }
    }

    static final class k extends m implements h.f.a.a<h.z> {
        final /* synthetic */ i $manualCancel$3;
        final /* synthetic */ j $onResult$4;
        final /* synthetic */ h $realStart$2;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, h hVar, i iVar, j jVar) {
            super(0);
            this.this$0 = cVar;
            this.$realStart$2 = hVar;
            this.$manualCancel$3 = iVar;
            this.$onResult$4 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            if (this.this$0.f145701b == null) {
                this.this$0.f145701b = new d(new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.c.k.AnonymousClass1 */
                    final /* synthetic */ k this$0;

                    static {
                        Covode.recordClassIndex(95717);
                    }

                    {
                        this.this$0 = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        this.this$0.$realStart$2.a();
                        return h.z.f158842a;
                    }
                }, new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.c.k.AnonymousClass2 */
                    final /* synthetic */ k this$0;

                    static {
                        Covode.recordClassIndex(95718);
                    }

                    {
                        this.this$0 = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        this.this$0.$manualCancel$3.a();
                        return h.z.f158842a;
                    }
                }, new h.f.a.b<CompileProbeResult, h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.c.k.AnonymousClass3 */
                    final /* synthetic */ k this$0;

                    static {
                        Covode.recordClassIndex(95719);
                    }

                    {
                        this.this$0 = r7;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(CompileProbeResult compileProbeResult) {
                        CompileProbeResult compileProbeResult2 = compileProbeResult;
                        l.d(compileProbeResult2, "");
                        this.this$0.$onResult$4.a(compileProbeResult2);
                        return h.z.f158842a;
                    }
                });
            }
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ VideoPublishEditModel $videoModel;

        static {
            Covode.recordClassIndex(95706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.$videoModel = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        public final boolean a() {
            bq a2 = br.a(this.$videoModel);
            if (this.$videoModel.videoWidth() + this.$videoModel.videoHeight() == a2.c() + a2.d()) {
                return true;
            }
            return false;
        }
    }

    public final void a() {
        d dVar = this.f145701b;
        if (dVar != null) {
            dVar.a();
        }
        d dVar2 = this.f145701b;
        if (dVar2 != null) {
            dVar2.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<ab<CompileProbeResult>> {
        final /* synthetic */ VideoPublishEditModel $videoModel;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(95707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.this$0 = cVar;
            this.$videoModel = videoPublishEditModel;
        }

        /* renamed from: a */
        public final ab<CompileProbeResult> invoke() {
            final z.d dVar = new z.d();
            dVar.element = 0;
            final AnonymousClass1 r1 = new h.f.a.a<Integer>() {
                /* class com.ss.android.ugc.gamora.editor.c.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95708);
                }

                public final int a() {
                    return (int) (System.currentTimeMillis() - dVar.element);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Integer invoke() {
                    return Integer.valueOf(a());
                }
            };
            ab<CompileProbeResult> a2 = ab.a((af) new af(this) {
                /* class com.ss.android.ugc.gamora.editor.c.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f145732a;

                static {
                    Covode.recordClassIndex(95709);
                }

                {
                    this.f145732a = r1;
                }

                @Override // f.a.af
                public final void subscribe(ad<CompileProbeResult> adVar) {
                    List<EditVideoSegment> videoList;
                    EditVideoSegment editVideoSegment;
                    String videoPath;
                    MethodCollector.i(4949);
                    String str = "";
                    l.d(adVar, str);
                    TEVideoUtils.nativeCancelCompileProbe();
                    bq a2 = br.a(this.f145732a.$videoModel);
                    dVar.element = System.currentTimeMillis();
                    EditPreviewInfo previewInfo = this.f145732a.$videoModel.getPreviewInfo();
                    if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = videoList.get(0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null)) {
                        str = videoPath;
                    }
                    String b2 = v.a.b();
                    int c2 = a2.c();
                    int d2 = a2.d();
                    CompileProbeConfig compileProbeConfig = this.f145732a.this$0.f145700a;
                    if (compileProbeConfig == null) {
                        l.b();
                    }
                    long startPointMs = compileProbeConfig.getStartPointMs();
                    CompileProbeConfig compileProbeConfig2 = this.f145732a.this$0.f145700a;
                    if (compileProbeConfig2 == null) {
                        l.b();
                    }
                    int a3 = x.a(str, b2, c2, d2, startPointMs, compileProbeConfig2.getEndPointMs(), en.a(), new a(this, adVar));
                    if (a3 != 0) {
                        adVar.b(new b(new AbstractC3872c.b.AbstractC3875b.a(a3)));
                    }
                    MethodCollector.o(4949);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.c$g$2$a */
                static final class a implements VEListener.m {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f145735a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ad f145736b;

                    static {
                        Covode.recordClassIndex(95710);
                    }

                    a(AnonymousClass2 r1, ad adVar) {
                        this.f145735a = r1;
                        this.f145736b = adVar;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.vesdk.VEListener.m
                    public final void a(int i2, int i3, float f2, int i4, int i5, int i6, int i7, int i8, float f3, int i9, int i10, double d2) {
                        if (i2 == -10000) {
                            this.f145736b.b(new b(new AbstractC3872c.b.a.C3873a(i2)));
                        } else if (i2 != 0) {
                            this.f145736b.b(new b(new AbstractC3872c.b.AbstractC3875b.C3876b(i2)));
                        } else {
                            this.f145736b.a(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i2, 0, null, 12, null), new CompileProbeResult.ResultData(i3, f2, i4, i5, i6, i7, i8, f3, i9, i10, d2, r1.a(), 0.0f, null, 0, 28672, null)));
                        }
                    }
                }
            });
            l.b(a2, "");
            return a2;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public AbstractC3872c f145728a = AbstractC3872c.C3878c.f145724b;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.a<h.z> f145729b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f.a.a<h.z> f145730c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<CompileProbeResult, h.z> f145731d;

        static {
            Covode.recordClassIndex(95704);
        }

        public final void a() {
            if (l.a(this.f145728a, AbstractC3872c.d.f145726b)) {
                AbstractC3872c.b.a.C3874b bVar = AbstractC3872c.b.a.C3874b.f145722c;
                this.f145728a = bVar;
                this.f145730c.invoke();
                this.f145731d.invoke(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f145721b, bVar.f145721b, "OuterCancel"), null, 2, null));
            }
        }

        public final void b() {
            AbstractC3872c cVar = this.f145728a;
            if (l.a(cVar, AbstractC3872c.C3878c.f145724b) || l.a(cVar, AbstractC3872c.e.f145727b) || (cVar instanceof AbstractC3872c.b)) {
                this.f145728a = AbstractC3872c.C3878c.f145724b;
            } else if (l.a(cVar, AbstractC3872c.d.f145726b)) {
                a.a("clear on running");
            }
        }

        public final void a(CompileProbeResult compileProbeResult) {
            l.d(compileProbeResult, "");
            if (l.a(this.f145728a, AbstractC3872c.d.f145726b)) {
                this.f145728a = AbstractC3872c.e.f145727b;
                this.f145731d.invoke(compileProbeResult);
                return;
            }
            a.a("Success on not running");
        }

        public final void a(AbstractC3872c.b bVar) {
            CompileProbeResult compileProbeResult;
            l.d(bVar, "");
            if (l.a(this.f145728a, AbstractC3872c.d.f145726b)) {
                this.f145728a = bVar;
                h.f.a.b<CompileProbeResult, h.z> bVar2 = this.f145731d;
                if ((bVar instanceof AbstractC3872c.b.AbstractC3875b.a) || (bVar instanceof AbstractC3872c.b.AbstractC3875b.C3876b)) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, bVar.f145721b, 0, null, 12, null), null, 2, null);
                } else if (bVar instanceof AbstractC3872c.b.AbstractC3875b.C3877c) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, bVar.f145721b, bVar.f145721b, ((AbstractC3872c.b.AbstractC3875b.C3877c) bVar).f145723c), null, 2, null);
                } else if (bVar instanceof AbstractC3872c.b.a.C3873a) {
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f145721b, 0, null, 12, null), null, 2, null);
                } else if (l.a(bVar, AbstractC3872c.b.a.C3874b.f145722c)) {
                    a.a("OuterCancel on inner Failed");
                    compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, bVar.f145721b, bVar.f145721b, "OuterCancel"), null, 2, null);
                } else {
                    throw new n();
                }
                bVar2.invoke(compileProbeResult);
                return;
            }
            a.a("Failed on not running");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(h.f.a.a<h.z> aVar, h.f.a.a<h.z> aVar2, h.f.a.b<? super CompileProbeResult, h.z> bVar) {
            l.d(aVar, "");
            l.d(aVar2, "");
            l.d(bVar, "");
            this.f145729b = aVar;
            this.f145730c = aVar2;
            this.f145731d = bVar;
        }
    }

    static final class j extends m implements h.f.a.b<CompileProbeResult, h.z> {
        final /* synthetic */ VideoPublishEditModel $videoModel;

        static {
            Covode.recordClassIndex(95715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.$videoModel = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(CompileProbeResult compileProbeResult) {
            a(compileProbeResult);
            return h.z.f158842a;
        }

        public final void a(CompileProbeResult compileProbeResult) {
            l.d(compileProbeResult, "");
            a.a("onResult: ".concat(String.valueOf(compileProbeResult)), true);
            this.$videoModel.compileProbeResult = compileProbeResult;
        }
    }

    public boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        e eVar = new e(this);
        f fVar = new f(videoPublishEditModel);
        eVar.a();
        if (this.f145700a != null && a.a(videoPublishEditModel) && fVar.a()) {
            return true;
        }
        return false;
    }

    public void b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        z.e eVar = new z.e();
        eVar.element = null;
        new k(this, new h(this, eVar, new g(this, videoPublishEditModel)), new i(eVar), new j(videoPublishEditModel)).a();
    }
}
