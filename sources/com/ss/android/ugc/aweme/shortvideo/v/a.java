package com.ss.android.ugc.aweme.shortvideo.v;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import com.kakao.usermgmt.StringSet;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.scheduler.g;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.bo;
import com.ss.android.ugc.aweme.shortvideo.cp;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cw;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eo;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.v.c.a;
import com.ss.android.ugc.aweme.shortvideo.x;
import com.ss.android.ugc.aweme.turbo.api.b;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.aweme.utils.hn;
import java.util.Locale;

public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public o f132389a;

    /* renamed from: b  reason: collision with root package name */
    final cp f132390b = new cp();

    /* renamed from: c  reason: collision with root package name */
    protected SynthetiseResult f132391c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> f132392d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f132393e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.v.c.a f132394f;

    /* renamed from: g  reason: collision with root package name */
    protected BaseShortVideoContext f132395g;

    /* renamed from: h  reason: collision with root package name */
    private final int f132396h;

    /* renamed from: i  reason: collision with root package name */
    private final int f132397i;

    /* renamed from: j  reason: collision with root package name */
    private final j f132398j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.core.d.a f132399k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.publish.b.a.a<h> f132400l;

    /* renamed from: m  reason: collision with root package name */
    private q<h> f132401m;
    private com.ss.android.ugc.aweme.publish.b.a.a<h> n;
    private q<? extends ai> o;
    private final cw p;
    private final String q;

    static {
        Covode.recordClassIndex(86689);
    }

    public abstract void d();

    public abstract void d(h hVar);

    public abstract void e();

    public abstract void e(h hVar);

    public abstract void f();

    public abstract void f(h hVar);

    /* access modifiers changed from: protected */
    public void g() {
    }

    public String toString() {
        return "AbstractPublisher";
    }

    /* access modifiers changed from: protected */
    public ar h() {
        return new ar();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public void i() {
        if (this.f132392d != null) {
            g.a("PublishParallel AbstractPublisher pause");
            this.f132398j.a(this.f132389a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public void j() {
        if (this.f132392d != null) {
            g.a("PublishParallel AbstractPublisher resume");
            this.f132398j.b(this.f132389a);
        }
    }

    public final void c() {
        if (!this.f132393e) {
            this.f132393e = this.f132398j.e(this.f132395g);
            com.ss.android.ugc.tools.utils.q.d(this + " saveToCameraIfNeed " + this.f132393e);
        }
    }

    public final void b() {
        if (!a("createVideo")) {
            if (this.f132401m == null) {
                q<h> c2 = this.f132398j.c(this.f132395g);
                this.f132401m = c2;
                if (c2 != null) {
                    com.ss.android.ugc.aweme.shortvideo.v.c.a aVar = this.f132394f;
                    BaseShortVideoContext baseShortVideoContext = this.f132395g;
                    com.ss.android.ugc.tools.utils.q.d("Publisher createVideo() synthetiseResult = " + aVar.f132476i);
                    aVar.p = new a.b();
                    aVar.p.f132483a = com.google.c.a.o.b(hn.f143067b);
                    r.a("publish_start", bl.a(baseShortVideoContext).a("shoot_entrance", aVar.f132477j).a("is_photo", "0").f149193a);
                    l.a(this.f132401m, new k<h>() {
                        /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(86692);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.c.h.a.k
                        public final /* synthetic */ void onSuccess(h hVar) {
                            a.this.f132394f.a(true, hVar, null);
                        }

                        @Override // com.google.c.h.a.k
                        public final void onFailure(Throwable th) {
                            a.this.f132394f.a(false, null, th);
                            if (a.this.f132389a != null) {
                                a.this.f132389a.onError(new et(th));
                            }
                        }
                    }, m.f68150a);
                } else {
                    return;
                }
            }
            l.a(this.f132401m, new k<h>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(86693);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(h hVar) {
                    com.ss.android.ugc.tools.utils.q.d(this + " onCreateVideoSuccess");
                    a.this.d(hVar);
                }
            }, m.f68150a);
            o oVar = this.f132389a;
            if (oVar != null) {
                oVar.onProgressUpdate(this.f132390b.a(2, 0), false);
            }
        }
    }

    public final void a() {
        String e2;
        Object obj;
        String str;
        if (this.f132392d == null) {
            com.ss.android.ugc.aweme.publish.b.a.a<SynthetiseResult> b2 = this.f132398j.b(this.f132395g);
            com.ss.android.ugc.aweme.shortvideo.v.c.a aVar = this.f132394f;
            BaseShortVideoContext baseShortVideoContext = this.f132395g;
            b.a().videoComposeStart();
            int i2 = -1;
            VideoPublishEditModel videoPublishEditModel = null;
            boolean z = true;
            if (aVar.f132474g == 0) {
                videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                aVar.f132478k = (double) videoPublishEditModel.videoFps();
                aVar.f132480m = videoPublishEditModel.creationId;
                i2 = videoPublishEditModel.videoEditorType;
            }
            aVar.f132473f = com.ss.android.ugc.aweme.photo.a.b.a(aVar.f132474g, baseShortVideoContext);
            gr.b(aVar.n, com.a.a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{aVar.n, Integer.valueOf(aVar.f132474g), Integer.valueOf(aVar.f132475h), Integer.valueOf(i2)}));
            cr.a().a(2);
            com.ss.android.ugc.aweme.shortvideo.upload.r.a(aVar.f132480m, com.ss.android.ugc.aweme.photo.a.b.b(aVar.f132474g));
            r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "start_synthetise").a("shoot_way", aVar.f132477j).a("dalvikPss", com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.f132218c).a("nativePss", com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.f132219d).a("otherPss", com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.f132221f).a("totalPss", com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.f132220e).f149193a);
            aVar.f132468a = SystemClock.uptimeMillis();
            int b3 = g.b(com.ss.android.ugc.aweme.df.b.a());
            com.ss.android.ugc.tools.f.b a2 = bl.a(videoPublishEditModel);
            if (aVar.f132474g == 0) {
                e2 = ((VideoPublishEditModel) baseShortVideoContext).getVideoResolution();
            } else if ("upload".equals(aVar.f132473f)) {
                e2 = com.ss.android.ugc.aweme.property.b.f();
            } else {
                e2 = com.ss.android.ugc.aweme.property.b.e();
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("resolution", e2);
            if (aVar.f132474g != 0) {
                z = false;
            }
            String str2 = "0";
            if (z) {
                obj = Integer.valueOf(((VideoPublishEditModel) baseShortVideoContext).getPreviewInfo().getPreviewVideoLength());
            } else {
                obj = str2;
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("source_duration", obj).a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", "1").a("publish_id", aVar.n).a("pre_publish_type", aVar.w).a("publish_type", aVar.w);
            if (e.a()) {
                str = "1";
            } else {
                str = str2;
            }
            com.ss.android.ugc.tools.f.b a5 = a4.a("user_enable_pre_publish", str);
            if (com.ss.android.ugc.aweme.port.in.g.a().e().getEnablePreUploadByUser(false)) {
                str2 = "1";
            }
            r.a("video_compose_start", a5.a("feature_enable_pre_publish", str2).a("total_available_memory_mb", b3 - g.d()).a("total_available_memory_percentage", Float.valueOf(g.a(b3))).a("total_memory_mb", b3).a("jvm_allow_memory_mb", g.a()).a("jvm_available_memory_mb", g.a() - g.b()).a("jvm_available_memory_percentage", Float.valueOf(g.c())).a("fps", new StringBuilder().append(aVar.f132478k).toString()).f149193a);
            aVar.f132479l = hn.f143067b.a();
            com.ss.android.ugc.tools.utils.q.d("Publisher uploadSynthetiseStartEvent");
            this.f132392d = b2;
            l.a(b2, new k<SynthetiseResult>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(86690);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    a.this.f132394f.a(false, (SynthetiseResult) null, th, (Object) a.this.f132395g);
                    if (a.this.f132389a != null) {
                        a.this.f132389a.onError(new et(th));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                    SynthetiseResult synthetiseResult2 = synthetiseResult;
                    try {
                        a.this.f132394f.a(true, synthetiseResult2, (Throwable) null, (Object) a.this.f132395g);
                        a.this.f132391c = synthetiseResult2;
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.base.o.a("aweme_synthetise_error_log", a.this.h().a("exception", com.facebook.common.d.m.c(e2)).a());
                    }
                }
            }, u.a.INSTANCE);
            this.f132392d.b(new b(this), u.a.INSTANCE);
        }
        l.a(this.f132392d, new k<SynthetiseResult>() {
            /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(86691);
            }

            @Override // com.google.c.h.a.k
            public final void onFailure(Throwable th) {
                com.ss.android.ugc.aweme.port.in.g.a().o().k().a("synthesis", "synthesis failed. Reason: " + Log.getStackTraceString(th));
                a.this.g();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.h.a.k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                com.ss.android.ugc.tools.utils.q.d(this + " onSynthesisSuccess");
                if (a.this.f132391c == null) {
                    a.this.f132391c = synthetiseResult2;
                }
                a.this.f();
                if (!(a.this.f132389a == null || synthetiseResult2 == null || synthetiseResult2.outputFile == null)) {
                    a.this.f132389a.onSynthetiseSuccess(synthetiseResult2.outputFile);
                }
                com.ss.android.ugc.aweme.port.in.g.a().o().k().a("synthesis", "synthesis success.");
            }
        }, m.f68150a);
    }

    private boolean a(String str) {
        if (!com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            return false;
        }
        if (this.f132389a == null) {
            return true;
        }
        this.f132389a.onError(new et(new d(toString() + "#" + str)));
        return true;
    }

    public final void b(h hVar) {
        if (!a("uploadCoverTextImage")) {
            if (this.n == null) {
                com.ss.android.ugc.aweme.publish.b.a.a<h> b2 = this.f132398j.b(this.f132395g, hVar);
                this.n = b2;
                l.a(b2, new k<h>() {
                    /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(86696);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.c.h.a.k
                    public final /* bridge */ /* synthetic */ void onSuccess(h hVar) {
                    }

                    @Override // com.google.c.h.a.k
                    public final void onFailure(Throwable th) {
                        if (a.this.f132389a != null) {
                            a.this.f132389a.onError(new et(th, com.ss.android.ugc.aweme.publish.g.c.a.a(com.ss.android.ugc.aweme.publish.g.c.a.d(th))));
                        }
                    }
                }, m.f68150a);
                a(this.n, 4);
            }
            l.a(this.n, new k<h>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(86697);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(h hVar) {
                    com.ss.android.ugc.tools.utils.q.d(this + " onUploadCoverTextImageSuccess");
                    a.this.f(hVar);
                }
            }, m.f68150a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(BaseShortVideoContext baseShortVideoContext) {
        this.f132395g = baseShortVideoContext;
        this.f132398j.f128567c = 0;
        this.p.a("startPublish()");
        gr.f(this.q);
        this.f132398j.a();
        com.ss.android.ugc.aweme.shortvideo.v.c.a aVar = this.f132394f;
        aVar.u = true;
        a.c cVar = aVar.s;
        boolean z = aVar.v;
        com.ss.android.ugc.tools.utils.q.a("PublishDurationMonitor LOG_START");
        cVar.f132489f = com.google.c.a.o.b(hn.f143067b);
        cVar.f132488e = SystemClock.uptimeMillis();
        r.a("click_publish_button", new com.ss.android.ugc.tools.f.b().a("compose_finish", z ? 1 : 0).f149193a);
        com.ss.android.ugc.tools.utils.q.d(this + " onPublishStart");
        e();
    }

    public final void c(final h hVar) {
        if (!a("createAweme") && this.o == null) {
            o oVar = this.f132389a;
            if (oVar != null) {
                oVar.onProgressUpdate(this.f132390b.a(3, 0), false);
            }
            com.ss.android.ugc.aweme.shortvideo.v.c.a aVar = this.f132394f;
            BaseShortVideoContext baseShortVideoContext = this.f132395g;
            com.ss.android.ugc.tools.utils.q.d("Publisher createAweme() synthetiseResult = " + aVar.f132476i + " \nargs " + baseShortVideoContext);
            aVar.r = new a.C3434a(baseShortVideoContext);
            aVar.r.f132481a = com.google.c.a.o.b(hn.f143067b);
            q<? extends ai> a2 = this.f132398j.a(this.f132395g, hVar, this.f132391c);
            this.o = a2;
            l.a(a2, new k<ai>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(86698);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                    a.this.f132394f.a(false, hVar, null, th, a.this.f132395g, a.this.f132393e);
                    if (a.this.f132389a != null) {
                        a.this.f132389a.onError(new et(th));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(ai aiVar) {
                    ai aiVar2 = aiVar;
                    a.this.f132394f.a(true, hVar, aiVar2, null, a.this.f132395g, a.this.f132393e);
                    if (a.this.f132389a != null) {
                        a.this.f132389a.onSuccess(aiVar2, false);
                    }
                }
            }, m.f68150a);
        }
    }

    public final void a(final h hVar) {
        if (!a("uploadVideo")) {
            if (this.f132400l == null) {
                com.ss.android.ugc.aweme.shortvideo.v.c.a aVar = this.f132394f;
                BaseShortVideoContext baseShortVideoContext = this.f132395g;
                com.ss.android.ugc.tools.utils.q.d("Publisher uploadVideo() synthetiseResult = " + aVar.f132476i);
                aVar.f132470c = SystemClock.uptimeMillis();
                if (!com.ss.android.ugc.aweme.shortvideo.v.c.a.a(aVar.f132475h)) {
                    aVar.q = new eo(baseShortVideoContext, aVar.t, aVar.f132474g, null, aVar.n, aVar.w);
                    aVar.q.a(true, null);
                    try {
                        String stackTraceString = Log.getStackTraceString(new Exception());
                        com.ss.android.ugc.aweme.au.a.f67096a.a("upload_video_start");
                        com.ss.android.ugc.aweme.df.q.a("aweme_upload_video_funnel", aVar.a(bl.b(baseShortVideoContext)).a(StringSet.type, "upload_video_start").a("extra", com.ss.android.ugc.aweme.au.a.f67096a.a()).a("stack_trace", stackTraceString).a());
                        aVar.a("upload_video_start", stackTraceString);
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.shortvideo.v.c.a.a(e2);
                    }
                }
                com.ss.android.ugc.aweme.publish.b.a.a<h> a2 = this.f132398j.a(this.f132395g, hVar);
                this.f132400l = a2;
                l.a(a2, new k<h>() {
                    /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(86695);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.c.h.a.k
                    public final /* synthetic */ void onSuccess(h hVar) {
                        a.this.f132394f.a(true, (Throwable) null, hVar, (Object) a.this.f132395g);
                    }

                    @Override // com.google.c.h.a.k
                    public final void onFailure(Throwable th) {
                        a.this.f132394f.a(false, th, hVar, (Object) a.this.f132395g);
                        if (a.this.f132389a != null) {
                            a.this.f132389a.onError(new et(th, com.ss.android.ugc.aweme.publish.g.c.a.a(com.ss.android.ugc.aweme.publish.g.c.a.d(th))));
                        }
                    }
                }, m.f68150a);
                a(this.f132400l, 1);
            }
            l.a(this.f132400l, new k<h>() {
                /* class com.ss.android.ugc.aweme.shortvideo.v.a.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(86694);
                }

                @Override // com.google.c.h.a.k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.h.a.k
                public final /* synthetic */ void onSuccess(h hVar) {
                    com.ss.android.ugc.tools.utils.q.d(this + " onUploadSuccess");
                    a.this.e(hVar);
                }
            }, m.f68150a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(com.ss.android.ugc.aweme.shortvideo.publish.a.a aVar) {
        g.a("PublishParallel AbstractPublisher cancel");
        com.ss.android.ugc.tools.utils.q.d("Publisher cancelPrePublishReal");
        cr.a();
        if (cr.h()) {
            cr.a().a(aVar);
            this.f132399k.b();
            com.ss.android.ugc.aweme.shortvideo.v.c.a aVar2 = this.f132394f;
            r.a("user_cancel_publish", new com.ss.android.ugc.tools.f.b().a("publish_id", aVar2.n).a("video_type", aVar2.f132474g).a("video_upload_type", aVar2.f132475h).a("cancel_step", "user").f149193a);
            cr.a().a(10);
        }
    }

    private void a(com.ss.android.ugc.aweme.publish.b.a.a<h> aVar, int i2) {
        aVar.b(new c(this, i2, aVar), m.f68150a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f
    public final void a(BaseShortVideoContext baseShortVideoContext, int i2) {
        this.f132395g = baseShortVideoContext;
        this.f132398j.f128567c = i2;
        this.p.a("prePublish() publishType:".concat(String.valueOf(i2)));
        com.ss.android.ugc.tools.utils.q.d(this + " onPrePublishStart");
        d();
    }

    public a(j jVar, int i2, int i3, int i4, String str, boolean z, x<ai> xVar) {
        this.f132398j = jVar;
        this.f132396h = i3;
        this.f132397i = i4;
        String str2 = DeviceRegisterManager.getDeviceId() + "-" + SystemClock.uptimeMillis();
        this.q = str2;
        jVar.f128568d = str2;
        jVar.f128569e = z;
        if (xVar != null) {
            o oVar = new o();
            this.f132389a = oVar;
            oVar.add(new bo(xVar));
        }
        androidx.core.d.a aVar = new androidx.core.d.a();
        this.f132399k = aVar;
        jVar.a(aVar);
        cw cwVar = new cw(this);
        this.p = cwVar;
        cwVar.a("new Publisher() type = ".concat(String.valueOf(i3)));
        this.f132394f = new com.ss.android.ugc.aweme.shortvideo.v.c.a(jVar, i2, i3, i4, str2, str, z);
    }
}
