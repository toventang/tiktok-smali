package com.ss.android.ugc.aweme.ftc.h;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.ftc.h.d;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.u;
import java.util.List;

public final class b extends com.bytedance.als.j<a> implements com.bytedance.o.a, a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f98528b = {new y(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(b.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
    private final com.bytedance.o.f A;
    private final int B = R.id.dj5;

    /* renamed from: c  reason: collision with root package name */
    public final a f98529c = this;

    /* renamed from: d  reason: collision with root package name */
    final com.bytedance.als.l<Long> f98530d;

    /* renamed from: e  reason: collision with root package name */
    final com.bytedance.als.l<Boolean> f98531e;

    /* renamed from: f  reason: collision with root package name */
    final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> f98532f;

    /* renamed from: g  reason: collision with root package name */
    final com.bytedance.als.l<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f98533g;

    /* renamed from: h  reason: collision with root package name */
    final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> f98534h;

    /* renamed from: i  reason: collision with root package name */
    final com.bytedance.als.l<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f98535i;

    /* renamed from: j  reason: collision with root package name */
    final h.h.d f98536j;

    /* renamed from: k  reason: collision with root package name */
    public final int f98537k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f98538l;

    /* renamed from: m  reason: collision with root package name */
    public final d f98539m;
    public final com.bytedance.scene.group.b n;
    private final com.bytedance.als.l<Boolean> o;
    private final com.bytedance.als.l<Boolean> p;
    private final com.bytedance.als.l<Integer> q;
    private final com.bytedance.als.l<RetakeVideoContext> r;
    private final androidx.fragment.app.e s;
    private final h.h.d t;
    private final com.bytedance.creativex.recorder.gesture.api.b u;
    private final h.h.d v;
    private final h.h.d w;
    private final h.h.d x;
    private final h.h.d y;
    private final h.h z;

    static {
        Covode.recordClassIndex(62650);
    }

    private final com.bytedance.creativex.recorder.b.a.d j() {
        return (com.bytedance.creativex.recorder.b.a.d) this.w.a(this, f98528b[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a f() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.t.a(this, f98528b[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b g() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.v.a(this, f98528b[1]);
    }

    public final com.bytedance.creativex.recorder.b.a.m h() {
        return (com.bytedance.creativex.recorder.b.a.m) this.x.a(this, f98528b[3]);
    }

    public final ShortVideoContext i() {
        return (ShortVideoContext) this.y.a(this, f98528b[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f98529c;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.A;
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void b() {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(1);
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void c() {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.c();
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void d() {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.b();
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void e() {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.y = true;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<ShortVideoContextViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_viewModel;

        static {
            Covode.recordClassIndex(62651);
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
                androidx.lifecycle.ad r1 = com_ss_android_ugc_aweme_ftc_progress_FTCRecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.h.b.a.invoke():androidx.lifecycle.ac");
        }

        public static ad com_ss_android_ugc_aweme_ftc_progress_FTCRecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
            return ae.a(eVar, (ad.b) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void a() {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.a(3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0190, code lost:
        if (r0 == null) goto L_0x0192;
     */
    @Override // com.bytedance.als.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 540
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.h.b.onCreate():void");
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98541a;

        static {
            Covode.recordClassIndex(62653);
        }

        c(b bVar) {
            this.f98541a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98541a.c(8);
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98543a;

        static {
            Covode.recordClassIndex(62655);
        }

        e(b bVar) {
            this.f98543a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98543a.f98530d.b(Long.valueOf(((com.bytedance.creativex.recorder.b.a.j) obj).f28193a));
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98544a;

        static {
            Covode.recordClassIndex(62656);
        }

        f(b bVar) {
            this.f98544a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98544a.c(4);
            this.f98544a.b(4);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98548a;

        static {
            Covode.recordClassIndex(62660);
        }

        j(b bVar) {
            this.f98548a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            if (!lVar.f28196a) {
                this.f98548a.b(lVar.f28197b);
            }
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98557a;

        static {
            Covode.recordClassIndex(62669);
        }

        s(b bVar) {
            this.f98557a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f98557a.f98538l) {
                this.f98557a.f98539m.d(8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void a(int i2) {
        this.q.b(Integer.valueOf(i2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$b  reason: collision with other inner class name */
    static final class C2388b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98540a;

        static {
            Covode.recordClassIndex(62652);
        }

        C2388b(b bVar) {
            this.f98540a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            b bVar = this.f98540a;
            h.f.b.l.b(bool, "");
            bVar.f98531e.b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98545a;

        static {
            Covode.recordClassIndex(62657);
        }

        g(b bVar) {
            this.f98545a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f98545a.h().b(true);
                }
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98549a;

        static {
            Covode.recordClassIndex(62661);
        }

        k(b bVar) {
            this.f98549a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f98549a.i().f124757b.f124714i) {
                this.f98549a.a(2);
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98550a;

        static {
            Covode.recordClassIndex(62662);
        }

        l(b bVar) {
            this.f98550a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f98550a.i().f124757b.f124714i) {
                this.f98550a.a(0);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98555a;

        static {
            Covode.recordClassIndex(62667);
        }

        q(b bVar) {
            this.f98555a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98555a.b(true);
            this.f98555a.b();
            this.f98555a.e();
            this.f98555a.d();
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98558a;

        static {
            Covode.recordClassIndex(62670);
        }

        t(b bVar) {
            this.f98558a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f98558a.i().f124757b.k() <= ((long) this.f98558a.f98537k)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.END);
            }
        }
    }

    public final void b(int i2) {
        ImageView imageView = this.f98539m.f98577f;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setVisibility(i2);
    }

    public final void c(int i2) {
        View view = this.f98539m.f98576e;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setVisibility(i2);
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98542a;

        static {
            Covode.recordClassIndex(62654);
        }

        d(b bVar) {
            this.f98542a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f98542a.i().f124757b.f124714i) {
                this.f98542a.a(1);
            }
            if (this.f98542a.i().f124757b.k() <= ((long) this.f98542a.f98537k)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.BEGIN);
            }
            if (this.f98542a.f98538l) {
                this.f98542a.f98539m.d(0);
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98553a;

        static {
            Covode.recordClassIndex(62665);
        }

        o(b bVar) {
            this.f98553a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.shortvideo.h.a f2 = this.f98553a.f();
            if (f2 == null || !f2.g()) {
                b bVar = this.f98553a;
                h.f.b.l.b(bool, "");
                bVar.a(bool.booleanValue());
            } else {
                this.f98553a.a(false);
            }
            b bVar2 = this.f98553a;
            h.f.b.l.b(bool, "");
            bVar2.b(bool.booleanValue());
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98556a;

        static {
            Covode.recordClassIndex(62668);
        }

        r(b bVar) {
            this.f98556a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f98556a.c();
            this.f98556a.b(true);
            if (this.f98556a.i().f124757b.h() > 0) {
                this.f98556a.b(0);
                this.f98556a.c(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void a(RetakeVideoContext retakeVideoContext) {
        h.f.b.l.d(retakeVideoContext, "");
        this.r.b(retakeVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void b(boolean z2) {
        this.p.b(Boolean.valueOf(z2));
    }

    public final void c(boolean z2) {
        RecordLayout recordLayout = this.f98539m.f98575d;
        if (recordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        recordLayout.setEnabled(z2);
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98546a;

        static {
            Covode.recordClassIndex(62658);
        }

        h(b bVar) {
            this.f98546a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (this.f98546a.g() != null) {
                    com.ss.android.ugc.gamora.recorder.b.b g2 = this.f98546a.g();
                    if (g2 == null) {
                        h.f.b.l.b();
                    }
                    String currentBottomTag = g2.getCurrentBottomTag();
                    b bVar = this.f98546a;
                    if (!(!h.f.b.l.a((Object) currentBottomTag, (Object) ((androidx.fragment.app.e) bVar.f98536j.a(bVar, b.f98528b[5])).getString(R.string.f_b)))) {
                        return;
                    }
                }
                this.f98546a.c(true);
                return;
            }
            this.f98546a.c(false);
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98547a;

        static {
            Covode.recordClassIndex(62659);
        }

        i(b bVar) {
            this.f98547a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.k kVar = (com.bytedance.creativex.recorder.b.a.k) obj;
            if (kVar.f28195b) {
                d dVar = this.f98547a.f98539m;
                if (dVar.f98580i != null) {
                    FrameLayout frameLayout = dVar.f98580i;
                    if (frameLayout == null) {
                        h.f.b.l.a("colorSchemeLayout");
                    }
                    frameLayout.post(new d.r(dVar));
                }
            }
            d dVar2 = this.f98547a.f98539m;
            Animation animation = kVar.f28194a;
            h.f.b.l.d(animation, "");
            RecordLayout recordLayout = dVar2.f98575d;
            if (recordLayout == null) {
                h.f.b.l.a("recordLayout");
            }
            com.bytedance.common.utility.n.a(recordLayout);
            RecordLayout recordLayout2 = dVar2.f98575d;
            if (recordLayout2 == null) {
                h.f.b.l.a("recordLayout");
            }
            recordLayout2.startAnimation(animation);
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98551a;

        static {
            Covode.recordClassIndex(62663);
        }

        m(b bVar) {
            this.f98551a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f98551a.n.g(this.f98551a.f98539m)) {
                    this.f98551a.n.e(this.f98551a.f98539m);
                }
            } else if (this.f98551a.n.g(this.f98551a.f98539m)) {
                this.f98551a.n.d(this.f98551a.f98539m);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98552a;

        static {
            Covode.recordClassIndex(62664);
        }

        n(b bVar) {
            this.f98552a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (!bool.booleanValue()) {
                this.f98552a.c(8);
                this.f98552a.b(8);
            } else if (this.f98552a.i().f124757b.h() > 0) {
                this.f98552a.c(0);
                this.f98552a.b(0);
            } else {
                this.f98552a.c(8);
                this.f98552a.b(8);
            }
            if ((this.f98552a.i().f124757b.b() || this.f98552a.i().f124757b.c()) && !bool.booleanValue()) {
                this.f98552a.c(4);
                this.f98552a.b(4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.h.a
    public final void a(boolean z2) {
        this.o.b(Boolean.valueOf(z2));
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f98554a;

        static {
            Covode.recordClassIndex(62666);
        }

        p(b bVar) {
            this.f98554a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long a2;
            boolean z;
            com.bytedance.creativex.recorder.b.a.t tVar = (com.bytedance.creativex.recorder.b.a.t) obj;
            if (tVar != null) {
                b bVar = this.f98554a;
                if (tVar.f28207c != null) {
                    if (bVar.i().f124757b.f124714i) {
                        u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar, "");
                        bVar.f98535i.b(uVar);
                    } else {
                        u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar2, "");
                        bVar.f98533g.b(uVar2);
                    }
                } else if (bVar.i().f124757b.f124714i) {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar, "");
                    bVar.f98534h.b(pVar);
                } else {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar2 = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar2, "");
                    bVar.f98532f.b(pVar2);
                }
                long j2 = tVar.f28206b;
                b bVar2 = this.f98554a;
                if (bVar2.i().c()) {
                    a2 = 3000;
                } else if (bVar2.i().f124757b.c()) {
                    a2 = bVar2.i().f124757b.f124707b;
                } else if (bVar2.i().f124757b.f124714i) {
                    a2 = bVar2.i().f124757b.f124716k;
                } else {
                    a2 = di.a();
                }
                if (j2 >= a2) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f98554a.f98539m.f98577f;
                if (imageView == null) {
                    h.f.b.l.a("goNextButton");
                }
                imageView.setSelected(z);
                int i2 = 4;
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    b bVar3 = this.f98554a;
                    if (z) {
                        i2 = 0;
                    }
                    bVar3.b(i2);
                    T value = this.f98554a.h().c().f6468a.getValue();
                    h.f.b.l.b(value, "");
                    if (value.booleanValue()) {
                        this.f98554a.c(0);
                        this.f98554a.b(0);
                        return;
                    }
                    return;
                }
                this.f98554a.c(4);
                this.f98554a.b(4);
            }
        }
    }

    public b(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        com.bytedance.als.h<Boolean> hVar;
        com.bytedance.als.h<Boolean> hVar2;
        com.bytedance.als.h<ScaleGestureDetector> hVar3;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.A = fVar;
        this.n = bVar;
        boolean z2 = true;
        this.o = new com.bytedance.als.l<>(true);
        this.p = new com.bytedance.als.l<>(true);
        com.bytedance.als.l<Long> lVar = new com.bytedance.als.l<>(0L);
        this.f98530d = lVar;
        com.bytedance.als.l<Boolean> lVar2 = new com.bytedance.als.l<>(true);
        this.f98531e = lVar2;
        com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = null;
        com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar3 = new com.bytedance.als.l<>(null);
        this.f98532f = lVar3;
        com.bytedance.als.l<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar4 = new com.bytedance.als.l<>(null);
        this.f98533g = lVar4;
        com.bytedance.als.l<Integer> lVar5 = new com.bytedance.als.l<>(-1);
        this.q = lVar5;
        com.bytedance.als.l<RetakeVideoContext> lVar6 = new com.bytedance.als.l<>(null);
        this.r = lVar6;
        com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar7 = new com.bytedance.als.l<>(null);
        this.f98534h = lVar7;
        com.bytedance.als.l<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar8 = new com.bytedance.als.l<>(null);
        this.f98535i = lVar8;
        this.s = (androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null);
        this.t = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        com.bytedance.creativex.recorder.gesture.api.b bVar2 = (com.bytedance.creativex.recorder.gesture.api.b) getDiContainer().b(com.bytedance.creativex.recorder.gesture.api.b.class, null);
        this.u = bVar2;
        this.v = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
        this.w = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.x = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.y = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.f98536j = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
        this.z = h.i.a(h.m.NONE, new a(this));
        this.f98537k = 15000;
        this.f98538l = com.ss.android.ugc.aweme.setting.i.p.a() == 0 ? false : z2;
        c cVar = new c();
        com.bytedance.creativex.recorder.b.a.d j2 = j();
        h.f.b.l.d(j2, "");
        cVar.f98559a = j2;
        com.bytedance.creativex.recorder.b.a.m h2 = h();
        h.f.b.l.d(h2, "");
        cVar.f98560b = h2;
        ShortVideoContext i2 = i();
        h.f.b.l.d(i2, "");
        cVar.f98561c = i2;
        h.f.b.l.d(lVar, "");
        cVar.f98562d = lVar;
        h.f.b.l.d(lVar4, "");
        cVar.f98564f = lVar4;
        h.f.b.l.d(lVar3, "");
        cVar.f98563e = lVar3;
        h.f.b.l.d(lVar5, "");
        cVar.f98565g = lVar5;
        h.f.b.l.d(lVar6, "");
        cVar.f98566h = lVar6;
        h.f.b.l.d(lVar7, "");
        cVar.f98567i = lVar7;
        h.f.b.l.d(lVar8, "");
        cVar.f98568j = lVar8;
        h.f.b.l.d(lVar2, "");
        cVar.f98569k = lVar2;
        com.ss.android.ugc.aweme.shortvideo.h.a f2 = f();
        if (f2 != null) {
            hVar = f2.d();
        } else {
            hVar = null;
        }
        cVar.f98570l = hVar;
        com.ss.android.ugc.aweme.shortvideo.h.a f3 = f();
        if (f3 != null) {
            hVar2 = f3.c();
        } else {
            hVar2 = null;
        }
        cVar.f98571m = hVar2;
        if (bVar2 != null) {
            hVar3 = bVar2.d();
        } else {
            hVar3 = null;
        }
        cVar.n = hVar3;
        cVar.o = bVar2 != null ? bVar2.c() : hVar4;
        this.f98539m = new d(cVar);
    }
}
