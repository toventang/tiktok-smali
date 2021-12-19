package com.ss.android.ugc.gamora.recorder.k;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.property.bh;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.ss.android.ugc.aweme.utils.fw;
import com.ss.android.ugc.gamora.recorder.k.f;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class e extends com.bytedance.als.j<d> implements com.bytedance.o.a, d {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147849b = {new h.f.b.y(e.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new h.f.b.y(e.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new h.f.b.y(e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new h.f.b.y(e.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new h.f.b.y(e.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new h.f.b.y(e.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
    private final h.h.d A = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.w.m.class);
    private final h.h.d B = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
    private final h.h C = h.i.a(h.m.NONE, new a(this));
    private final int D = -21;
    private final h.h E = h.i.a((h.f.a.a) new ad(this));
    private final com.bytedance.o.f F;
    private final int G = R.id.dj5;

    /* renamed from: c  reason: collision with root package name */
    public final d f147850c = this;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.als.l<Long> f147851d = new com.bytedance.als.l<>(0L);

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.als.l<Boolean> f147852e = new com.bytedance.als.l<>(true);

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.als.l<Boolean> f147853f = new com.bytedance.als.l<>(true);

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> f147854g = new com.bytedance.als.l<>(null);

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f147855h = new com.bytedance.als.l<>(null);

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.als.l<Long> f147856i = new com.bytedance.als.l<>(0L);

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.als.k<Boolean> f147857j = new com.bytedance.als.k<>();

    /* renamed from: k  reason: collision with root package name */
    public final com.bytedance.als.d<Integer> f147858k = new com.bytedance.als.d<>(0);

    /* renamed from: l  reason: collision with root package name */
    public final com.bytedance.als.l<Integer> f147859l = new com.bytedance.als.l<>(-1);

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.als.l<RetakeVideoContext> f147860m = new com.bytedance.als.l<>(null);
    public final com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> n = new com.bytedance.als.l<>(null);
    public final com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> o = new com.bytedance.als.l<>(null);
    public final com.bytedance.creativex.recorder.gesture.api.b p = ((com.bytedance.creativex.recorder.gesture.api.b) getDiContainer().b(com.bytedance.creativex.recorder.gesture.api.b.class, null));
    final h.h.d q = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
    public final int r = 15000;
    public boolean s;
    public final com.bytedance.scene.group.b t;
    private final com.bytedance.als.l<Boolean> u = new com.bytedance.als.l<>(true);
    private final com.bytedance.als.l<Boolean> v = new com.bytedance.als.l<>(true);
    private final androidx.fragment.app.e w = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));
    private final h.h.d x = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
    private final h.h.d y = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
    private final h.h.d z = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    static {
        Covode.recordClassIndex(97466);
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a e() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.x.a(this, f147849b[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b f() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.y.a(this, f147849b[1]);
    }

    public final com.bytedance.creativex.recorder.b.a.d g() {
        return (com.bytedance.creativex.recorder.b.a.d) this.z.a(this, f147849b[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.w.m h() {
        return (com.ss.android.ugc.aweme.shortvideo.w.m) this.A.a(this, f147849b[3]);
    }

    public final ShortVideoContext i() {
        return (ShortVideoContext) this.B.a(this, f147849b[4]);
    }

    public final f j() {
        return (f) this.E.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ d getApiComponent() {
        return this.f147850c;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.F;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<ShortVideoContextViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_viewModel;

        static {
            Covode.recordClassIndex(97467);
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
                androidx.lifecycle.ad r1 = com_ss_android_ugc_gamora_recorder_progress_LighteningControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.k.e.a.invoke():androidx.lifecycle.ac");
        }

        public static androidx.lifecycle.ad com_ss_android_ugc_gamora_recorder_progress_LighteningControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
            return ae.a(eVar, (ad.b) null);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a() {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.b();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void b() {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.d();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void c() {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.c();
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void d() {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.D = true;
    }

    public final void k() {
        if (i().b()) {
            j().a(0.2f);
        } else {
            j().a(1.0f);
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(97471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            com.bytedance.als.h<Boolean> hVar;
            com.bytedance.als.h<Boolean> hVar2;
            com.bytedance.als.h<ScaleGestureDetector> hVar3;
            com.bytedance.creativex.recorder.b.a.d g2 = this.this$0.g();
            com.ss.android.ugc.aweme.shortvideo.w.m h2 = this.this$0.h();
            ShortVideoContext i2 = this.this$0.i();
            com.bytedance.als.l<Long> lVar = this.this$0.f147851d;
            com.bytedance.als.l<Boolean> lVar2 = this.this$0.f147852e;
            com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar3 = this.this$0.f147854g;
            com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar4 = this.this$0.f147855h;
            com.bytedance.als.l<Integer> lVar5 = this.this$0.f147859l;
            com.bytedance.als.l<RetakeVideoContext> lVar6 = this.this$0.f147860m;
            com.bytedance.als.l<h.p<List<TimeSpeedModelExtension>, Long>> lVar7 = this.this$0.n;
            com.bytedance.als.l<h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar8 = this.this$0.o;
            com.bytedance.als.l<Boolean> lVar9 = this.this$0.f147853f;
            com.ss.android.ugc.aweme.shortvideo.h.a e2 = this.this$0.e();
            com.bytedance.als.h<VideoRecordGestureLayout.a> hVar4 = null;
            if (e2 != null) {
                hVar = e2.d();
            } else {
                hVar = null;
            }
            com.ss.android.ugc.aweme.shortvideo.h.a e3 = this.this$0.e();
            if (e3 != null) {
                hVar2 = e3.c();
            } else {
                hVar2 = null;
            }
            com.bytedance.creativex.recorder.gesture.api.b bVar = this.this$0.p;
            if (bVar != null) {
                hVar3 = bVar.d();
            } else {
                hVar3 = null;
            }
            com.bytedance.creativex.recorder.gesture.api.b bVar2 = this.this$0.p;
            if (bVar2 != null) {
                hVar4 = bVar2.c();
            }
            return new f(g2, h2, i2, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, hVar, hVar2, hVar3, hVar4, this.this$0.f147856i, this.this$0.f147857j, this.this$0.f147858k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0194, code lost:
        if (r2 == null) goto L_0x0196;
     */
    @Override // com.bytedance.als.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 721
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.k.e.onCreate():void");
    }

    static final class ac<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147863a;

        static {
            Covode.recordClassIndex(97470);
        }

        ac(e eVar) {
            this.f147863a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147863a.c(8);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147869a;

        static {
            Covode.recordClassIndex(97477);
        }

        g(e eVar) {
            this.f147869a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147869a.f147852e.b(obj);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        public static final p f147878a = new p();

        static {
            Covode.recordClassIndex(97486);
        }

        p() {
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            fw.a("tool_record_start");
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147868a;

        static {
            Covode.recordClassIndex(97476);
        }

        f(e eVar) {
            this.f147868a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147868a.f147851d.b(Long.valueOf(((com.bytedance.creativex.recorder.b.a.j) obj).f28193a));
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147874a;

        static {
            Covode.recordClassIndex(97482);
        }

        l(e eVar) {
            this.f147874a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            if (!lVar.f28196a) {
                this.f147874a.c(lVar.f28197b);
            }
        }
    }

    static final class v<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147884a;

        static {
            Covode.recordClassIndex(97492);
        }

        v(e eVar) {
            this.f147884a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147884a.j().a(false);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(int i2) {
        this.f147859l.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void b(boolean z2) {
        this.u.b(Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void c(boolean z2) {
        this.v.b(Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.d
    public final void d(boolean z2) {
        this.s = z2;
        j().a(z2);
    }

    static final class ab<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147862a;

        static {
            Covode.recordClassIndex(97469);
        }

        ab(e eVar) {
            this.f147862a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147862a.i().f124757b.k() <= ((long) this.f147862a.r)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.END);
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147866a;

        static {
            Covode.recordClassIndex(97474);
        }

        d(e eVar) {
            this.f147866a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f147866a;
            h.f.b.l.b(bool, "");
            eVar.f147853f.b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147870a;

        static {
            Covode.recordClassIndex(97478);
        }

        h(e eVar) {
            this.f147870a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147870a.c(4);
            this.f147870a.b(4);
            this.f147870a.a(0, (TimeSpeedModelExtension) null);
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147871a;

        static {
            Covode.recordClassIndex(97479);
        }

        i(e eVar) {
            this.f147871a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f147871a.h().b(true);
                }
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147875a;

        static {
            Covode.recordClassIndex(97483);
        }

        m(e eVar) {
            this.f147875a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147875a.i().f124757b.f124714i) {
                this.f147875a.a(2);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147876a;

        static {
            Covode.recordClassIndex(97484);
        }

        n(e eVar) {
            this.f147876a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147876a.i().f124757b.f124714i) {
                this.f147876a.a(0);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147879a;

        static {
            Covode.recordClassIndex(97487);
        }

        q(e eVar) {
            this.f147879a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f147879a;
            h.f.b.l.b(bool, "");
            eVar.e(bool.booleanValue());
        }
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147880a;

        static {
            Covode.recordClassIndex(97488);
        }

        r(e eVar) {
            this.f147880a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147880a.f147857j.a() != null) {
                e eVar = this.f147880a;
                eVar.e(h.f.b.l.a((Object) eVar.f147857j.a(), (Object) true));
            }
        }
    }

    static final class z<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147888a;

        static {
            Covode.recordClassIndex(97496);
        }

        z(e eVar) {
            this.f147888a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147888a.c(true);
            this.f147888a.a();
            this.f147888a.d();
            this.f147888a.c();
        }
    }

    static final class aa<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147861a;

        static {
            Covode.recordClassIndex(97468);
        }

        aa(e eVar) {
            this.f147861a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147861a.i().Z != 15) {
                this.f147861a.b();
                this.f147861a.c(true);
                if (this.f147861a.i().f124757b.h() > 0) {
                    this.f147861a.b(0);
                    this.f147861a.c(0);
                    this.f147861a.k();
                }
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147865a;

        static {
            Covode.recordClassIndex(97473);
        }

        c(e eVar) {
            this.f147865a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.h.b bVar = new com.ss.android.ugc.gamora.recorder.h.b();
            int i2 = this.f147865a.i().Z;
            int i3 = 1;
            if (i2 != 2) {
                if (i2 == 10 || i2 == 11 || i2 == 14) {
                    i3 = 0;
                } else if (i2 != 15) {
                    i3 = -1;
                }
            }
            bVar.f147799a.storeInt("story_lightening_tab_when_leave", i3);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$e  reason: collision with other inner class name */
    static final class C3984e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147867a;

        static {
            Covode.recordClassIndex(97475);
        }

        C3984e(e eVar) {
            this.f147867a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147867a.i().f124757b.f124714i) {
                this.f147867a.a(1);
            }
            if (this.f147867a.i().f124757b.k() <= ((long) this.f147867a.r)) {
                android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_15S_CAPTURE_START, android.ss.com.vboost.f.BEGIN);
            }
            fw.a("tool_record_start", bh.b(), (long) bh.c());
        }
    }

    static final class s<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147881a;

        static {
            Covode.recordClassIndex(97489);
        }

        s(e eVar) {
            this.f147881a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.x xVar = (com.bytedance.creativex.recorder.b.a.x) obj;
            h.f.b.l.b(xVar, "");
            if (xVar.f28216c && this.f147881a.i().Z == 15) {
                this.f147881a.h().a(new com.ss.android.ugc.aweme.tools.h("stop_record"));
            }
        }
    }

    static final class t<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147882a;

        static {
            Covode.recordClassIndex(97490);
        }

        t(e eVar) {
            this.f147882a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f147882a.i().f124757b.f124714i) {
                if (this.f147882a.s) {
                    this.f147882a.j().a(true);
                }
                if (!this.f147882a.i().c()) {
                    this.f147882a.j().a();
                }
            }
        }
    }

    public final void b(int i2) {
        ImageView imageView = j().f147894f;
        if (imageView == null) {
            h.f.b.l.a("goNextButton");
        }
        imageView.setVisibility(i2);
    }

    public final void c(int i2) {
        View view = j().f147893e;
        if (view == null) {
            h.f.b.l.a("deleteLast");
        }
        view.setVisibility(i2);
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147864a;

        static {
            Covode.recordClassIndex(97472);
        }

        b(e eVar) {
            this.f147864a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h.u uVar = (h.u) obj;
            if ((((Number) uVar.getFirst()).intValue() == 12346 || ((Number) uVar.getFirst()).intValue() == 12345) && this.f147864a.i().Z == 15 && -1 == ((Number) uVar.getSecond()).intValue()) {
                bj.d("record remove segment, impl");
                e eVar = this.f147864a;
                eVar.a(3, false);
                eVar.j().u = true;
                eVar.h().c(true);
                com.ss.android.ugc.aweme.shortvideo.w.m h2 = eVar.h();
                com.bytedance.creativex.recorder.b.a.x xVar = new com.bytedance.creativex.recorder.b.a.x("reset progress");
                xVar.f28214a = 3;
                h.f.b.l.b(xVar, "");
                h2.a(xVar);
                RecordContext recordContext = eVar.i().f124757b.G;
                recordContext.f124740a.reset();
                recordContext.f124741b.reset();
                recordContext.f124742c.reset();
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147872a;

        static {
            Covode.recordClassIndex(97480);
        }

        j(e eVar) {
            this.f147872a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (this.f147872a.f() != null) {
                    com.ss.android.ugc.gamora.recorder.b.b f2 = this.f147872a.f();
                    if (f2 == null) {
                        h.f.b.l.b();
                    }
                    String currentBottomTag = f2.getCurrentBottomTag();
                    e eVar = this.f147872a;
                    if (!(!h.f.b.l.a((Object) currentBottomTag, (Object) ((androidx.fragment.app.e) eVar.q.a(eVar, e.f147849b[5])).getString(R.string.f_b)))) {
                        return;
                    }
                }
                this.f147872a.a(true);
                return;
            }
            this.f147872a.a(false);
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147873a;

        static {
            Covode.recordClassIndex(97481);
        }

        k(e eVar) {
            this.f147873a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.k kVar = (com.bytedance.creativex.recorder.b.a.k) obj;
            if (kVar.f28195b) {
                f j2 = this.f147873a.j();
                if (j2.t != null) {
                    FrameLayout frameLayout = j2.t;
                    if (frameLayout == null) {
                        h.f.b.l.a("colorSchemeLayout");
                    }
                    frameLayout.post(new f.z(j2));
                }
            }
            f j3 = this.f147873a.j();
            Animation animation = kVar.f28194a;
            h.f.b.l.d(animation, "");
            LighteningRecordLayout lighteningRecordLayout = j3.f147892d;
            if (lighteningRecordLayout == null) {
                h.f.b.l.a("recordLayout");
            }
            com.bytedance.common.utility.n.a(lighteningRecordLayout);
            LighteningRecordLayout lighteningRecordLayout2 = j3.f147892d;
            if (lighteningRecordLayout2 == null) {
                h.f.b.l.a("recordLayout");
            }
            lighteningRecordLayout2.startAnimation(animation);
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147877a;

        static {
            Covode.recordClassIndex(97485);
        }

        o(e eVar) {
            this.f147877a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f147877a.t.g(this.f147877a.j())) {
                    this.f147877a.t.e(this.f147877a.j());
                }
            } else if (this.f147877a.t.g(this.f147877a.j())) {
                this.f147877a.t.d(this.f147877a.j());
            }
        }
    }

    static final class u<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147883a;

        static {
            Covode.recordClassIndex(97491);
        }

        u(e eVar) {
            this.f147883a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f147883a.i().f124757b.h() == 0 && !this.f147883a.i().f124757b.f124714i) {
                if (this.f147883a.s) {
                    this.f147883a.j().a(true);
                }
                if (!this.f147883a.i().c()) {
                    this.f147883a.j().a();
                }
            }
        }
    }

    static final class x<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147886a;

        static {
            Covode.recordClassIndex(97494);
        }

        x(e eVar) {
            this.f147886a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.shortvideo.h.a e2 = this.f147886a.e();
            if ((e2 == null || !e2.g()) && (!this.f147886a.i().aN || !this.f147886a.i().O)) {
                e eVar = this.f147886a;
                h.f.b.l.b(bool, "");
                eVar.b(bool.booleanValue());
            } else {
                this.f147886a.b(false);
            }
            e eVar2 = this.f147886a;
            h.f.b.l.b(bool, "");
            eVar2.c(bool.booleanValue());
        }
    }

    public final void e(boolean z2) {
        com.ss.android.ugc.gamora.recorder.m.a aVar = (com.ss.android.ugc.gamora.recorder.m.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.m.a.class, null);
        com.ss.android.ugc.gamora.recorder.l.f fVar = (com.ss.android.ugc.gamora.recorder.l.f) getDiContainer().b(com.ss.android.ugc.gamora.recorder.l.f.class, null);
        if (z2) {
            if (aVar != null && aVar.e()) {
                aVar.b(-en.a(42.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
                if (fVar != null) {
                    fVar.a(-en.a(54.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
                }
            } else if (fVar != null) {
                fVar.a(-en.a(28.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
            }
        } else if (aVar != null && aVar.e()) {
            aVar.b(0);
            if (fVar != null) {
                fVar.a(-en.a(20.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
            }
        }
    }

    static final class w<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147885a;

        static {
            Covode.recordClassIndex(97493);
        }

        w(e eVar) {
            this.f147885a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f147885a.i().Z != 15) {
                h.f.b.l.b(bool, "");
                if (!bool.booleanValue()) {
                    this.f147885a.c(8);
                    this.f147885a.b(8);
                } else if (this.f147885a.i().f124757b.h() > 0) {
                    this.f147885a.c(0);
                    this.f147885a.k();
                    this.f147885a.b(0);
                } else {
                    this.f147885a.c(8);
                    this.f147885a.b(8);
                }
                if ((this.f147885a.i().f124757b.b() || this.f147885a.i().f124757b.c()) && !bool.booleanValue()) {
                    this.f147885a.c(4);
                    this.f147885a.b(4);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(RetakeVideoContext retakeVideoContext) {
        h.f.b.l.d(retakeVideoContext, "");
        this.f147860m.b(retakeVideoContext);
    }

    static final class y<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147887a;

        static {
            Covode.recordClassIndex(97495);
        }

        y(e eVar) {
            this.f147887a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long a2;
            boolean z;
            com.bytedance.creativex.recorder.b.a.t tVar = (com.bytedance.creativex.recorder.b.a.t) obj;
            if (tVar != null) {
                e eVar = this.f147887a;
                if (tVar.f28207c != null) {
                    if (eVar.i().f124757b.f124714i) {
                        h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new h.u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar, "");
                        eVar.o.b(uVar);
                    } else {
                        h.u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new h.u<>(tVar.f28205a, Long.valueOf(tVar.f28206b), tVar.f28207c);
                        h.f.b.l.d(uVar2, "");
                        eVar.f147855h.b(uVar2);
                    }
                } else if (eVar.i().f124757b.f124714i) {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar, "");
                    eVar.n.b(pVar);
                } else {
                    h.p<List<TimeSpeedModelExtension>, Long> pVar2 = new h.p<>(tVar.f28205a, Long.valueOf(tVar.f28206b));
                    h.f.b.l.d(pVar2, "");
                    eVar.f147854g.b(pVar2);
                }
                this.f147887a.a(tVar.f28206b, tVar.f28207c);
                if (this.f147887a.i().Z != 15) {
                    long j2 = tVar.f28206b;
                    e eVar2 = this.f147887a;
                    if (eVar2.i().c()) {
                        a2 = 3000;
                    } else if (eVar2.i().f124757b.c()) {
                        a2 = eVar2.i().f124757b.f124707b;
                    } else if (eVar2.i().f124757b.f124714i) {
                        a2 = eVar2.i().f124757b.f124716k;
                    } else {
                        a2 = di.a();
                    }
                    if (j2 >= a2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = this.f147887a.j().f147894f;
                    if (imageView == null) {
                        h.f.b.l.a("goNextButton");
                    }
                    imageView.setSelected(z);
                    int i2 = 4;
                    if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                        e eVar3 = this.f147887a;
                        if (z) {
                            i2 = 0;
                        }
                        eVar3.b(i2);
                        T value = this.f147887a.h().c().f6468a.getValue();
                        h.f.b.l.b(value, "");
                        if (value.booleanValue()) {
                            this.f147887a.c(0);
                            this.f147887a.k();
                            this.f147887a.b(0);
                            return;
                        }
                        return;
                    }
                    this.f147887a.c(4);
                    this.f147887a.b(4);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(boolean z2) {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.setEnabled(z2);
    }

    @Override // com.ss.android.ugc.gamora.recorder.k.a
    public final void a(int i2, boolean z2) {
        LighteningRecordLayout lighteningRecordLayout = j().f147892d;
        if (lighteningRecordLayout == null) {
            h.f.b.l.a("recordLayout");
        }
        lighteningRecordLayout.a(i2, z2);
    }

    public final void a(long j2, TimeSpeedModelExtension timeSpeedModelExtension) {
        int i2;
        if (!i().c() || (timeSpeedModelExtension == null && (timeSpeedModelExtension = i().F.f124774b) == null)) {
            i2 = 0;
        } else {
            i2 = timeSpeedModelExtension.getDuration();
        }
        this.f147856i.b(Long.valueOf(j2 + ((long) i2)));
    }

    public e(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.F = fVar;
        this.t = bVar;
    }
}
