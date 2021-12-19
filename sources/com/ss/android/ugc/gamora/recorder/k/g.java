package com.ss.android.ugc.gamora.recorder.k;

import android.view.ScaleGestureDetector;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.property.bh;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.utils.fw;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import java.util.List;

public final class g extends com.bytedance.als.j<a> implements com.bytedance.o.a, a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147926b = {new y(g.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(g.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(g.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(g.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new y(g.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(g.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
    private final h.h.d A;
    private final h.h B;
    private final com.bytedance.o.f C;
    private final int D = R.id.dj5;
    private final c E;

    /* renamed from: c  reason: collision with root package name */
    public final a f147927c;

    /* renamed from: d  reason: collision with root package name */
    final com.bytedance.als.l<Long> f147928d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.als.l<Boolean> f147929e;

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.als.l<Boolean> f147930f;

    /* renamed from: g  reason: collision with root package name */
    final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> f147931g;

    /* renamed from: h  reason: collision with root package name */
    final com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f147932h;

    /* renamed from: i  reason: collision with root package name */
    final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> f147933i;

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f147934j;

    /* renamed from: k  reason: collision with root package name */
    final h.h.d f147935k;

    /* renamed from: l  reason: collision with root package name */
    public final int f147936l;

    /* renamed from: m  reason: collision with root package name */
    final h.h f147937m;
    public final boolean n;
    public final b o;
    public final com.bytedance.scene.group.b p;
    private final com.bytedance.als.l<Boolean> q;
    private final com.bytedance.als.l<Boolean> r;
    private final com.bytedance.als.l<Integer> s;
    private final com.bytedance.als.l<RetakeVideoContext> t;
    private final androidx.fragment.app.e u;
    private final h.h.d v;
    private final com.bytedance.creativex.recorder.gesture.api.b w;
    private final h.h.d x;
    private final h.h.d y;
    private final h.h.d z;

    static {
        Covode.recordClassIndex(97524);
    }

    private final com.bytedance.creativex.recorder.b.a.d j() {
        return (com.bytedance.creativex.recorder.b.a.d) this.y.a(this, f147926b[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a e() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.v.a(this, f147926b[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b f() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.x.a(this, f147926b[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.w.m g() {
        return (com.ss.android.ugc.aweme.shortvideo.w.m) this.z.a(this, f147926b[3]);
    }

    public final ShortVideoContext h() {
        return (ShortVideoContext) this.A.a(this, f147926b[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147927c;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.C;
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a() {
        this.o.C();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void b() {
        this.o.D();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void c() {
        this.o.F();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void d() {
        this.o.G();
    }

    static final class w extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f147959a = new w();

        static {
            Covode.recordClassIndex(97547);
        }

        w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(di.a());
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<ShortVideoContextViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_viewModel;

        static {
            Covode.recordClassIndex(97525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_viewModel = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_viewModel
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
                androidx.lifecycle.ad r1 = com_ss_android_ugc_gamora_recorder_progress_RecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.k.g.a.invoke():androidx.lifecycle.ac");
        }

        public static ad com_ss_android_ugc_gamora_recorder_progress_RecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
            return ae.a(eVar, (ad.b) null);
        }
    }

    public final void i() {
        if (h().b()) {
            this.o.a(0.2f);
        } else {
            this.o.a(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01a8, code lost:
        if (r0 == null) goto L_0x01aa;
     */
    @Override // com.bytedance.als.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.k.g.onCreate():void");
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147939a;

        static {
            Covode.recordClassIndex(97527);
        }

        c(g gVar) {
            this.f147939a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147939a.c(8);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147942a;

        static {
            Covode.recordClassIndex(97530);
        }

        f(g gVar) {
            this.f147942a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147942a.f147929e.b(obj);
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        public static final o f147951a = new o();

        static {
            Covode.recordClassIndex(97539);
        }

        o() {
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            fw.a("tool_record_start");
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147941a;

        static {
            Covode.recordClassIndex(97529);
        }

        e(g gVar) {
            this.f147941a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147941a.f147928d.b(Long.valueOf(((com.bytedance.creativex.recorder.b.a.j) obj).f28193a));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$g  reason: collision with other inner class name */
    static final class C3986g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147943a;

        static {
            Covode.recordClassIndex(97531);
        }

        C3986g(g gVar) {
            this.f147943a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147943a.c(4);
            this.f147943a.b(4);
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147947a;

        static {
            Covode.recordClassIndex(97535);
        }

        k(g gVar) {
            this.f147947a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            if (!lVar.f28196a) {
                this.f147947a.c(lVar.f28197b);
            }
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147957a;

        static {
            Covode.recordClassIndex(97545);
        }

        u(g gVar) {
            this.f147957a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147957a.n) {
                this.f147957a.o.f(8);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(int i2) {
        this.s.b(Integer.valueOf(i2));
    }

    public final void b(int i2) {
        this.o.d(i2);
    }

    public final void c(int i2) {
        this.o.e(i2);
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147938a;

        static {
            Covode.recordClassIndex(97526);
        }

        b(g gVar) {
            this.f147938a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            g gVar = this.f147938a;
            h.f.b.l.b(bool, "");
            gVar.f147930f.b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147944a;

        static {
            Covode.recordClassIndex(97532);
        }

        h(g gVar) {
            this.f147944a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f147944a.g().b(true);
                }
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147946a;

        static {
            Covode.recordClassIndex(97534);
        }

        j(g gVar) {
            this.f147946a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.k kVar = (com.bytedance.creativex.recorder.b.a.k) obj;
            if (kVar.f28195b) {
                this.f147946a.o.E();
            }
            this.f147946a.o.a(kVar.f28194a);
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147948a;

        static {
            Covode.recordClassIndex(97536);
        }

        l(g gVar) {
            this.f147948a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147948a.h().f124757b.f124714i) {
                this.f147948a.a(2);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147950a;

        static {
            Covode.recordClassIndex(97538);
        }

        n(g gVar) {
            this.f147950a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147950a.h().f124757b.f124714i) {
                this.f147950a.a(0);
            }
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147955a;

        static {
            Covode.recordClassIndex(97543);
        }

        s(g gVar) {
            this.f147955a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147955a.c(true);
            this.f147955a.a();
            this.f147955a.d();
            this.f147955a.c();
        }
    }

    static final class v<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147958a;

        static {
            Covode.recordClassIndex(97546);
        }

        v(g gVar) {
            this.f147958a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147958a.h().f124757b.k() <= ((long) this.f147958a.f147936l)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.END);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void b(boolean z2) {
        this.q.b(Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void c(boolean z2) {
        this.r.b(Boolean.valueOf(z2));
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147953a;

        static {
            Covode.recordClassIndex(97541);
        }

        q(g gVar) {
            this.f147953a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.shortvideo.h.a e2 = this.f147953a.e();
            if (e2 == null || !e2.g()) {
                g gVar = this.f147953a;
                h.f.b.l.b(bool, "");
                gVar.b(bool.booleanValue());
            } else {
                this.f147953a.b(false);
            }
            g gVar2 = this.f147953a;
            h.f.b.l.b(bool, "");
            gVar2.c(bool.booleanValue());
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147956a;

        static {
            Covode.recordClassIndex(97544);
        }

        t(g gVar) {
            this.f147956a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147956a.b();
            this.f147956a.c(true);
            if (this.f147956a.h().f124757b.h() > 0) {
                this.f147956a.b(0);
                this.f147956a.c(0);
                this.f147956a.i();
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(RetakeVideoContext retakeVideoContext) {
        h.f.b.l.d(retakeVideoContext, "");
        this.t.b(retakeVideoContext);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147940a;

        static {
            Covode.recordClassIndex(97528);
        }

        d(g gVar) {
            this.f147940a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147940a.h().f124757b.f124714i) {
                this.f147940a.a(1);
            }
            if (this.f147940a.h().f124757b.k() <= ((long) this.f147940a.f147936l)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.BEGIN);
            }
            if (this.f147940a.n) {
                this.f147940a.o.f(0);
            }
            fw.a("tool_record_start", bh.b(), (long) bh.c());
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147945a;

        static {
            Covode.recordClassIndex(97533);
        }

        i(g gVar) {
            this.f147945a = gVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (this.f147945a.f() != null) {
                    com.ss.android.ugc.gamora.recorder.b.b f2 = this.f147945a.f();
                    if (f2 == null) {
                        h.f.b.l.b();
                    }
                    String currentBottomTag = f2.getCurrentBottomTag();
                    g gVar = this.f147945a;
                    if (!(!h.f.b.l.a((Object) currentBottomTag, (Object) ((androidx.fragment.app.e) gVar.f147935k.a(gVar, g.f147926b[5])).getString(R.string.f_b)))) {
                        return;
                    }
                }
                this.f147945a.a(true);
                return;
            }
            this.f147945a.a(false);
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147949a;

        static {
            Covode.recordClassIndex(97537);
        }

        m(g gVar) {
            this.f147949a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f147949a.p.g(this.f147949a.o.b())) {
                    this.f147949a.p.e(this.f147949a.o.b());
                }
            } else if (this.f147949a.p.g(this.f147949a.o.b())) {
                this.f147949a.p.d(this.f147949a.o.b());
            }
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147952a;

        static {
            Covode.recordClassIndex(97540);
        }

        p(g gVar) {
            this.f147952a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (!bool.booleanValue()) {
                this.f147952a.c(8);
                this.f147952a.b(8);
            } else if (this.f147952a.h().f124757b.h() > 0) {
                this.f147952a.c(0);
                this.f147952a.b(0);
                this.f147952a.i();
            } else {
                this.f147952a.c(8);
                this.f147952a.b(8);
            }
            if ((this.f147952a.h().f124757b.b() || this.f147952a.h().f124757b.c()) && !bool.booleanValue()) {
                this.f147952a.c(4);
                this.f147952a.b(4);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(boolean z2) {
        this.o.a(z2);
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147954a;

        static {
            Covode.recordClassIndex(97542);
        }

        r(g gVar) {
            this.f147954a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long a2;
            boolean z;
            com.bytedance.creativex.recorder.b.a.t tVar = (com.bytedance.creativex.recorder.b.a.t) obj;
            if (tVar != null) {
                g gVar = this.f147954a;
                if (tVar.f28207c != null) {
                    if (gVar.h().f124757b.f124714i) {
                        h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new h.u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar, "");
                        gVar.f147934j.b(uVar);
                    } else {
                        h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new h.u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar2, "");
                        gVar.f147932h.b(uVar2);
                    }
                } else if (gVar.h().f124757b.f124714i) {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar, "");
                    gVar.f147933i.b(pVar);
                } else {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar2 = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar2, "");
                    gVar.f147931g.b(pVar2);
                }
                long j2 = tVar.f28206b;
                g gVar2 = this.f147954a;
                if (gVar2.h().c()) {
                    a2 = 3000;
                } else if (gVar2.h().f124757b.c()) {
                    a2 = gVar2.h().f124757b.f124707b;
                } else if (gVar2.h().f124757b.f124714i) {
                    a2 = gVar2.h().f124757b.f124716k;
                } else {
                    gVar2.h();
                    if (com.ss.android.ugc.aweme.setting.i.p.a() == 2) {
                        a2 = ((Number) gVar2.f147937m.getValue()).longValue();
                    } else {
                        a2 = di.a();
                    }
                }
                if (j2 >= a2) {
                    z = true;
                } else {
                    z = false;
                }
                this.f147954a.o.b(z);
                int i2 = 4;
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    g gVar3 = this.f147954a;
                    if (z) {
                        i2 = 0;
                    }
                    gVar3.b(i2);
                    T value = this.f147954a.g().c().f6468a.getValue();
                    h.f.b.l.b(value, "");
                    if (value.booleanValue()) {
                        this.f147954a.c(0);
                        this.f147954a.i();
                        this.f147954a.b(0);
                        return;
                    }
                    return;
                }
                this.f147954a.c(4);
                this.f147954a.b(4);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(int i2, boolean z2) {
        this.o.a(i2, z2);
    }

    public g(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar, c cVar) {
        com.bytedance.als.h<Boolean> hVar;
        com.bytedance.als.h<Boolean> hVar2;
        com.bytedance.als.h<ScaleGestureDetector> hVar3;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(cVar, "");
        this.C = fVar;
        this.p = bVar;
        this.E = cVar;
        this.f147927c = this;
        boolean z2 = true;
        this.q = new com.bytedance.als.l<>(true);
        this.r = new com.bytedance.als.l<>(true);
        com.bytedance.als.l<Long> lVar = new com.bytedance.als.l<>(0L);
        this.f147928d = lVar;
        com.bytedance.als.l<Boolean> lVar2 = new com.bytedance.als.l<>(true);
        this.f147929e = lVar2;
        com.bytedance.als.l<Boolean> lVar3 = new com.bytedance.als.l<>(true);
        this.f147930f = lVar3;
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = null;
        com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar4 = new com.bytedance.als.l<>(null);
        this.f147931g = lVar4;
        com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar5 = new com.bytedance.als.l<>(null);
        this.f147932h = lVar5;
        com.bytedance.als.l<Integer> lVar6 = new com.bytedance.als.l<>(-1);
        this.s = lVar6;
        com.bytedance.als.l<RetakeVideoContext> lVar7 = new com.bytedance.als.l<>(null);
        this.t = lVar7;
        com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar8 = new com.bytedance.als.l<>(null);
        this.f147933i = lVar8;
        com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar9 = new com.bytedance.als.l<>(null);
        this.f147934j = lVar9;
        this.u = (androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null);
        this.v = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        com.bytedance.creativex.recorder.gesture.api.b bVar2 = (com.bytedance.creativex.recorder.gesture.api.b) getDiContainer().b(com.bytedance.creativex.recorder.gesture.api.b.class, null);
        this.w = bVar2;
        this.x = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
        this.y = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.z = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.w.m.class);
        this.A = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.f147935k = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
        this.B = h.i.a(h.m.NONE, new a(this));
        this.f147936l = 15000;
        this.f147937m = h.i.a((h.f.a.a) w.f147959a);
        this.n = com.ss.android.ugc.aweme.setting.i.p.a() == 0 ? false : z2;
        com.bytedance.creativex.recorder.b.a.d j2 = j();
        com.bytedance.o.f diContainer = getDiContainer();
        com.ss.android.ugc.aweme.shortvideo.w.m g2 = g();
        ShortVideoContext h2 = h();
        com.ss.android.ugc.aweme.shortvideo.h.a e2 = e();
        if (e2 != null) {
            hVar = e2.d();
        } else {
            hVar = null;
        }
        com.ss.android.ugc.aweme.shortvideo.h.a e3 = e();
        if (e3 != null) {
            hVar2 = e3.c();
        } else {
            hVar2 = null;
        }
        if (bVar2 != null) {
            hVar3 = bVar2.d();
            hVar4 = bVar2.c();
        } else {
            hVar3 = null;
        }
        this.o = cVar.a(new j(j2, diContainer, g2, h2, lVar, lVar2, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar3, hVar, hVar2, hVar3, hVar4));
    }
}
