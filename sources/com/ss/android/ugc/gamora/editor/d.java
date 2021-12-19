package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.property.en;
import com.ss.android.ugc.aweme.property.w;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.gamora.editor.c;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.List;

public final class d extends c {

    /* renamed from: d  reason: collision with root package name */
    public final String f145792d = "HardcodeAdaptive";

    /* renamed from: e  reason: collision with root package name */
    public CompileProbeConfigV2 f145793e;

    static {
        Covode.recordClassIndex(95781);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Long l2;
            Long l3;
            Integer num;
            Integer num2;
            this.this$0.f145793e = w.a();
            StringBuilder append = new StringBuilder().append(this.this$0.f145792d).append(" -> compileProbeConfigV2.endPointMs = ");
            CompileProbeConfigV2 compileProbeConfigV2 = this.this$0.f145793e;
            String str = null;
            if (compileProbeConfigV2 != null) {
                l2 = Long.valueOf(compileProbeConfigV2.getEndPointMs());
            } else {
                l2 = null;
            }
            StringBuilder append2 = append.append(l2).append("; compileProbeConfigV2.startPointMs = ");
            CompileProbeConfigV2 compileProbeConfigV22 = this.this$0.f145793e;
            if (compileProbeConfigV22 != null) {
                l3 = Long.valueOf(compileProbeConfigV22.getStartPointMs());
            } else {
                l3 = null;
            }
            StringBuilder append3 = append2.append(l3).append(';').append("compileProbeConfigV2.bitrateStrategy = ");
            CompileProbeConfigV2 compileProbeConfigV23 = this.this$0.f145793e;
            if (compileProbeConfigV23 != null) {
                num = Integer.valueOf(compileProbeConfigV23.getBitrateStrategy());
            } else {
                num = null;
            }
            StringBuilder append4 = append3.append(num).append("; compileProbeConfigV2.probeType = ");
            CompileProbeConfigV2 compileProbeConfigV24 = this.this$0.f145793e;
            if (compileProbeConfigV24 != null) {
                num2 = Integer.valueOf(compileProbeConfigV24.getProbeType());
            } else {
                num2 = null;
            }
            StringBuilder append5 = append4.append(num2).append(';').append("compileProbeConfigV2.bitrateRange = ");
            CompileProbeConfigV2 compileProbeConfigV25 = this.this$0.f145793e;
            if (compileProbeConfigV25 != null) {
                str = compileProbeConfigV25.getBitrateRange();
            }
            q.a(append5.append(str).toString());
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ b $createStartProbeSingle$1;
        final /* synthetic */ z.e $startTask;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, z.e eVar, b bVar) {
            super(0);
            this.this$0 = dVar;
            this.$startTask = eVar;
            this.$createStartProbeSingle$1 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            c.a.a("Start", true);
            this.$startTask.element = (T) this.$createStartProbeSingle$1.invoke().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.gamora.editor.d.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f145800a;

                static {
                    Covode.recordClassIndex(95788);
                }

                {
                    this.f145800a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                    c.d dVar = this.f145800a.this$0.f145701b;
                    if (dVar != null) {
                        l.b(compileProbeResult, "");
                        dVar.a(compileProbeResult);
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.gamora.editor.d.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f145801a;

                static {
                    Covode.recordClassIndex(95789);
                }

                {
                    this.f145801a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th instanceof c.b) {
                        c.d dVar = this.f145801a.this$0.f145701b;
                        if (dVar != null) {
                            dVar.a(((c.b) th).getFailed());
                            return;
                        }
                        return;
                    }
                    c.d dVar2 = this.f145801a.this$0.f145701b;
                    if (dVar2 != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "FailedNoMessage";
                        }
                        dVar2.a(new c.AbstractC3872c.b.AbstractC3875b.C3877c(message));
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$d  reason: collision with other inner class name */
    static final class C3884d extends m implements h.f.a.a<h.z> {
        final /* synthetic */ z.e $startTask;

        static {
            Covode.recordClassIndex(95790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3884d(z.e eVar) {
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
            MethodCollector.i(5468);
            c.a.a("ManualCancel", true);
            T t = this.$startTask.element;
            if (t != null) {
                t.dispose();
            }
            TEVideoUtils.nativeCancelCompileProbe();
            MethodCollector.o(5468);
        }
    }

    static final class f extends m implements h.f.a.a<h.z> {
        final /* synthetic */ C3884d $manualCancel$3;
        final /* synthetic */ e $onResult$4;
        final /* synthetic */ c $realStart$2;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, c cVar, C3884d dVar2, e eVar) {
            super(0);
            this.this$0 = dVar;
            this.$realStart$2 = cVar;
            this.$manualCancel$3 = dVar2;
            this.$onResult$4 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            if (this.this$0.f145701b == null) {
                this.this$0.f145701b = new c.d(new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.d.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(95793);
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
                    /* class com.ss.android.ugc.gamora.editor.d.f.AnonymousClass2 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(95794);
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
                    /* class com.ss.android.ugc.gamora.editor.d.f.AnonymousClass3 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(95795);
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

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<ab<CompileProbeResult>> {
        final /* synthetic */ VideoPublishEditModel $videoModel;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, VideoPublishEditModel videoPublishEditModel) {
            super(0);
            this.this$0 = dVar;
            this.$videoModel = videoPublishEditModel;
        }

        /* renamed from: a */
        public final ab<CompileProbeResult> invoke() {
            final z.d dVar = new z.d();
            dVar.element = 0;
            final AnonymousClass1 r1 = new h.f.a.a<Integer>() {
                /* class com.ss.android.ugc.gamora.editor.d.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95784);
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
                /* class com.ss.android.ugc.gamora.editor.d.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f145795a;

                static {
                    Covode.recordClassIndex(95785);
                }

                {
                    this.f145795a = r1;
                }

                @Override // f.a.af
                public final void subscribe(ad<CompileProbeResult> adVar) {
                    List<EditVideoSegment> videoList;
                    EditVideoSegment editVideoSegment;
                    String videoPath;
                    MethodCollector.i(5657);
                    String str = "";
                    l.d(adVar, str);
                    TEVideoUtils.nativeCancelCompileProbe();
                    dVar.element = System.currentTimeMillis();
                    EditPreviewInfo previewInfo = this.f145795a.$videoModel.getPreviewInfo();
                    if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = videoList.get(0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null)) {
                        str = videoPath;
                    }
                    String b2 = v.a.b();
                    CompileProbeConfigV2 compileProbeConfigV2 = this.f145795a.this$0.f145793e;
                    if (compileProbeConfigV2 == null) {
                        l.b();
                    }
                    long startPointMs = compileProbeConfigV2.getStartPointMs();
                    CompileProbeConfigV2 compileProbeConfigV22 = this.f145795a.this$0.f145793e;
                    if (compileProbeConfigV22 == null) {
                        l.b();
                    }
                    long endPointMs = compileProbeConfigV22.getEndPointMs();
                    String a2 = en.a();
                    CompileProbeConfigV2 compileProbeConfigV23 = this.f145795a.this$0.f145793e;
                    if (compileProbeConfigV23 == null) {
                        l.b();
                    }
                    int probeType = compileProbeConfigV23.getProbeType();
                    CompileProbeConfigV2 compileProbeConfigV24 = this.f145795a.this$0.f145793e;
                    if (compileProbeConfigV24 == null) {
                        l.b();
                    }
                    compileProbeConfigV24.getBitrateStrategy();
                    int a3 = x.a(str, b2, startPointMs, endPointMs, a2, probeType, new a(this, adVar));
                    q.a(this.f145795a.this$0.f145792d + " -> CompileProbeV2: compileProbe() method is called, checkResult = " + a3);
                    if (a3 != 0) {
                        adVar.b(new c.b(new c.AbstractC3872c.b.AbstractC3875b.a(a3)));
                    }
                    MethodCollector.o(5657);
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.d$b$2$a */
                static final class a implements VEListener.n {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f145798a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ad f145799b;

                    static {
                        Covode.recordClassIndex(95786);
                    }

                    a(AnonymousClass2 r1, ad adVar) {
                        this.f145798a = r1;
                        this.f145799b = adVar;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0227, code lost:
                        if (com.ss.android.ugc.aweme.property.ap.a() != false) goto L_0x0143;
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:20:0x0164  */
                    @Override // com.ss.android.vesdk.VEListener.n
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(int r33, int r34, float r35, float r36, int r37, int r38, int r39, int r40, int r41, float r42, int r43, int r44, double r45) {
                        /*
                        // Method dump skipped, instructions count: 604
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.d.b.AnonymousClass2.a.a(int, int, float, float, int, int, int, int, int, float, int, int, double):void");
                    }
                }
            });
            l.b(a2, "");
            return a2;
        }
    }

    static final class e extends m implements h.f.a.b<CompileProbeResult, h.z> {
        final /* synthetic */ VideoPublishEditModel $videoModel;

        static {
            Covode.recordClassIndex(95791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoPublishEditModel videoPublishEditModel) {
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
            c.a.a("onResult: ".concat(String.valueOf(compileProbeResult)), true);
            this.$videoModel.compileProbeResult = compileProbeResult;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.c
    public final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        new a(this).a();
        if (this.f145793e == null) {
            return false;
        }
        return c.a.a(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.gamora.editor.c
    public final void b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        z.e eVar = new z.e();
        eVar.element = null;
        new f(this, new c(this, eVar, new b(this, videoPublishEditModel)), new C3884d(eVar), new e(videoPublishEditModel)).a();
    }
}
