package com.ss.android.ugc.aweme.shortvideo.preview;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.preview.a;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.b.f;
import dmt.av.video.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

public class b<T extends a> extends com.bytedance.als.j<T> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {
    private final androidx.lifecycle.t<Boolean> A;
    private final androidx.lifecycle.t<h.z> B;
    private final androidx.lifecycle.t<h.z> C;
    private final androidx.lifecycle.t<h.z> D;
    private final androidx.lifecycle.t<h.z> E;
    private final androidx.lifecycle.t<h.z> F;
    private final androidx.lifecycle.t<h.z> G;
    private final androidx.lifecycle.t<Integer> H;
    private final androidx.lifecycle.t<Integer> I;
    private final androidx.lifecycle.t<Boolean> J;
    private final h.h K;
    private final h.h L;
    private final LiveData<SurfaceView> M;
    private final dmt.av.video.g<dmt.av.video.p> N;
    private final dmt.av.video.k<dmt.av.video.w> O;
    private final ArrayList<EffectPointModel> P;
    private final androidx.lifecycle.t<Boolean> Q;
    private final androidx.lifecycle.t<dmt.av.video.w> R;
    private final androidx.lifecycle.t<Integer> S;
    private final androidx.lifecycle.t<IAudioEffectParam> T;
    private final androidx.lifecycle.t<dmt.av.video.t> U;
    private final androidx.lifecycle.t<VEPreviewMusicParams> V;
    private int W;
    private androidx.lifecycle.t<Integer> X;
    private final h.h Y;
    private final h.h Z;

    /* renamed from: a  reason: collision with root package name */
    public final d f129607a;
    private final androidx.lifecycle.t<dmt.av.video.u> aa;
    private final h.h ab;
    private boolean ac;
    private FrameLayout ad;
    private boolean ae;
    private dmt.av.video.n af;
    private final com.bytedance.o.f ag;
    private com.bytedance.creativex.editor.preview.a ah;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.c.a> f129608b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.t<Void> f129609c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.t<Void> f129610d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.t<Void> f129611e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.t<Boolean> f129612f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f129613g;

    /* renamed from: h  reason: collision with root package name */
    protected SurfaceView f129614h;

    /* renamed from: i  reason: collision with root package name */
    protected ImageView f129615i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f129616j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.o.a f129617k;

    /* renamed from: l  reason: collision with root package name */
    private c f129618l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f129619m;
    private final h.h n;
    private boolean o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private final h.h w;
    private final androidx.lifecycle.t<Boolean> x;
    private final androidx.lifecycle.t<h.z> y;
    private final androidx.lifecycle.t<h.z> z;

    static {
        Covode.recordClassIndex(85074);
    }

    private final androidx.lifecycle.t<VEVolumeChangeOp> ac() {
        return (androidx.lifecycle.t) this.q.getValue();
    }

    private final androidx.lifecycle.t<dmt.av.video.s> ad() {
        return (androidx.lifecycle.t) this.r.getValue();
    }

    private final androidx.lifecycle.t<Boolean> ae() {
        return (androidx.lifecycle.t) this.s.getValue();
    }

    private final androidx.lifecycle.t<Boolean> af() {
        return (androidx.lifecycle.t) this.u.getValue();
    }

    private final androidx.lifecycle.t<com.ss.android.ugc.asve.editor.g> ag() {
        return (androidx.lifecycle.t) this.v.getValue();
    }

    private final androidx.lifecycle.t<VEEditorAutoStartStopArbiter> ah() {
        return (androidx.lifecycle.t) this.w.getValue();
    }

    private final androidx.lifecycle.t<h.u<Boolean, Boolean, Boolean>> ai() {
        return (androidx.lifecycle.t) this.ab.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> A() {
        return (androidx.lifecycle.t) this.Y.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Boolean> B() {
        return (androidx.lifecycle.t) this.Z.getValue();
    }

    public final androidx.fragment.app.e T() {
        return (androidx.fragment.app.e) this.f129616j.getValue();
    }

    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.n> U() {
        return (androidx.lifecycle.t) this.n.getValue();
    }

    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.k> V() {
        return (androidx.lifecycle.t) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.b.j d() {
        return (dmt.av.video.b.j) this.f129619m.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Boolean> h() {
        return (androidx.lifecycle.t) this.K.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Bitmap> i() {
        return (androidx.lifecycle.t) this.L.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<dmt.av.video.u> E() {
        return this.aa;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final com.bytedance.creativex.editor.preview.a G() {
        return this.ah;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> I() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> K() {
        return this.y;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> M() {
        return this.z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> O() {
        return this.B;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Integer> Q() {
        return this.H;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Integer> R() {
        return this.I;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> S() {
        return this.J;
    }

    /* access modifiers changed from: protected */
    public boolean W() {
        return this.ac;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final /* bridge */ /* synthetic */ LiveData e() {
        return this.f129609c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final /* bridge */ /* synthetic */ LiveData f() {
        return this.f129611e;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<SurfaceView> g() {
        return this.M;
    }

    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.ag;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.c.a> j() {
        return this.f129608b;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int m() {
        return this.W;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Integer> n() {
        return this.X;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.g<dmt.av.video.p> p() {
        return this.N;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.k<dmt.av.video.w> q() {
        return this.O;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final ArrayList<EffectPointModel> r() {
        return this.P;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> s() {
        return this.Q;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<dmt.av.video.w> t() {
        return this.R;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<IAudioEffectParam> u() {
        return this.T;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<dmt.av.video.t> v() {
        return this.U;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<VEPreviewMusicParams> w() {
        return this.V;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.s sVar) {
        h.f.b.l.d(sVar, "");
        ad().setValue(sVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        com.ss.android.ugc.asve.editor.g b2;
        h.f.b.l.d(vEPreviewMusicParams, "");
        this.V.setValue(vEPreviewMusicParams);
        com.ss.android.ugc.aweme.shortvideo.o.a aVar = this.f129617k;
        if (!(aVar == null || !(!h.f.b.l.a((Object) aVar.f129528b, (Object) vEPreviewMusicParams.f156741f)) || (b2 = d().b()) == null)) {
            b2.g(aVar.f129527a);
        }
        return d().a(vEPreviewMusicParams);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(boolean z2, boolean z3, boolean z4) {
        ai().setValue(new h.u<>(Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(boolean z2) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = d().f156778e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.a(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.u uVar) {
        h.f.b.l.d(uVar, "");
        this.aa.setValue(uVar);
    }

    static final class a extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<VEEditorAutoStartStopArbiter>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129620a = new a();

        static {
            Covode.recordClassIndex(85075);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<VEEditorAutoStartStopArbiter> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<dmt.av.video.b.j> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dmt.av.video.b.j invoke() {
            return this.this$0.aa();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.b$b  reason: collision with other inner class name */
    static final class C3378b extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.k>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3378b f129622a = new C3378b();

        static {
            Covode.recordClassIndex(85078);
        }

        C3378b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.k> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.n>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f129623a = new c();

        static {
            Covode.recordClassIndex(85079);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.n> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f129624a = new d();

        static {
            Covode.recordClassIndex(85080);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.s>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f129625a = new e();

        static {
            Covode.recordClassIndex(85081);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.s> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f129626a = new f();

        static {
            Covode.recordClassIndex(85082);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.u<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f129627a = new g();

        static {
            Covode.recordClassIndex(85083);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.u<? extends Boolean, ? extends Boolean, ? extends Boolean>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.v>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f129628a = new h();

        static {
            Covode.recordClassIndex(85084);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.v> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.asve.editor.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f129629a = new i();

        static {
            Covode.recordClassIndex(85085);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.asve.editor.g> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<VEVolumeChangeOp>> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f129630a = new j();

        static {
            Covode.recordClassIndex(85086);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<VEVolumeChangeOp> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f129631a = new l();

        static {
            Covode.recordClassIndex(85088);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f129634a = new o();

        static {
            Covode.recordClassIndex(85093);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.asve.editor.g> C() {
        return ag();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<VEEditorAutoStartStopArbiter> D() {
        return ah();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.u<Boolean, Boolean, Boolean>> F() {
        return ai();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void L() {
        this.y.setValue(h.z.f158842a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void N() {
        this.z.setValue(h.z.f158842a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void P() {
        this.B.setValue(h.z.f158842a);
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.repository.a.n> k() {
        return U();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.repository.a.k> l() {
        return V();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void o() {
        d().g();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<dmt.av.video.s> x() {
        return ad();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> y() {
        return ae();
    }

    static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Bitmap>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Bitmap> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            tVar.observe(this.this$0, new a(this));
            return tVar;
        }

        static final class a<T> implements com.bytedance.als.m<Bitmap> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f129632a;

            static {
                Covode.recordClassIndex(85090);
            }

            a(m mVar) {
                this.f129632a = mVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Bitmap bitmap) {
                this.f129632a.this$0.cB_().setImageBitmap(bitmap);
            }
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            tVar.observe(this.this$0, new a(this));
            return tVar;
        }

        static final class a<T> implements com.bytedance.als.m<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f129633a;

            static {
                Covode.recordClassIndex(85092);
            }

            a(n nVar) {
                this.f129633a = nVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Boolean bool) {
                int i2;
                Boolean bool2 = bool;
                ImageView cB_ = this.f129633a.this$0.cB_();
                h.f.b.l.b(bool2, "");
                if (bool2.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                cB_.setVisibility(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final FrameLayout H() {
        FrameLayout frameLayout = this.ad;
        if (frameLayout == null) {
            h.f.b.l.a("frameLayout");
        }
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void J() {
        this.x.setValue(false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int b() {
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        return surfaceView.getWidth();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int c() {
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        return surfaceView.getHeight();
    }

    public final SurfaceView cA_() {
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        return surfaceView;
    }

    /* access modifiers changed from: protected */
    public final ImageView cB_() {
        ImageView imageView = this.f129615i;
        if (imageView == null) {
            h.f.b.l.a("firstFrameView");
        }
        return imageView;
    }

    public final com.ss.android.ugc.asve.editor.g cC_() {
        return d().b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void z() {
        ae().setValue(true);
    }

    static final class k extends h.f.b.m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            Object a2 = this.this$0.getDiContainer().a(androidx.fragment.app.e.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final ViewGroup.MarginLayoutParams a() {
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    @Override // com.bytedance.als.j
    public void onDestroy() {
        ag().setValue(null);
        com.ss.android.ugc.asve.editor.g b2 = d().b();
        if (b2 != null) {
            b2.s();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public static final class y implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129644a;

        static {
            Covode.recordClassIndex(85103);
        }

        y(b bVar) {
            this.f129644a = bVar;
        }

        @Override // dmt.av.video.b.f.a
        public final void a() {
            if (!this.f129644a.f129613g) {
                this.f129644a.f129613g = true;
                com.ss.android.ugc.tools.c.f149151f.a("receive prepare done event");
                this.f129644a.f129609c.postValue(null);
            }
            if (this.f129644a.f129607a.f129648b.invoke().booleanValue()) {
                com.ss.android.ugc.tools.c.f149151f.a("receive prepare done event persist");
                this.f129644a.f129610d.postValue(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public dmt.av.video.b.j aa() {
        dmt.av.video.b.s sVar = this.f129607a.f129652f;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) com.ss.android.ugc.aweme.cw.g.a(com.ss.android.ugc.aweme.cw.l.a(com.ss.android.ugc.aweme.cw.o.SCHEDULED).a(1).a());
        h.f.b.l.b(scheduledExecutorService, "");
        return new dmt.av.video.b.l(sVar, scheduledExecutorService);
    }

    public void ab() {
        d().y = new y(this);
        dmt.av.video.b.j d2 = d();
        androidx.fragment.app.e T2 = T();
        com.bytedance.creativex.editor.preview.a aVar = this.ah;
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        d2.a(T2, aVar, surfaceView, this);
    }

    @Override // com.bytedance.als.j
    public void onStart() {
        super.onStart();
        if (this.ae) {
            com.ss.android.ugc.asve.editor.g b2 = d().b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            b2.p();
            this.ae = false;
            com.ss.android.ugc.tools.c.f149151f.d("VEVideoPublishEditFragment prepare");
        }
    }

    @Override // com.bytedance.als.j
    public void onStop() {
        if (this.f129607a.f129649c.invoke().booleanValue() && d().b() != null) {
            com.ss.android.ugc.asve.editor.g b2 = d().b();
            if (b2 == null) {
                h.f.b.l.b();
            }
            b2.r();
            this.ae = true;
            com.ss.android.ugc.tools.c.f149151f.d("VEVideoPublishEditFragment releaseEngine");
        }
        super.onStop();
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        ab();
        if (this.ah.getMultiSegmentPropInfo() != null) {
            d().a(this.ah.getMultiSegmentPropInfo());
        }
        d().i();
        d().a(W());
        IAudioEffectParam veAudioEffectParam = this.ah.getVeAudioEffectParam();
        if (veAudioEffectParam != null) {
            a(n.a.a(veAudioEffectParam));
        }
        List<IAudioEffectParam> veAudioEffectParamList = this.ah.getVeAudioEffectParamList();
        if (!(veAudioEffectParamList == null || !(!veAudioEffectParamList.isEmpty()) || veAudioEffectParamList == null)) {
            a(new dmt.av.video.n("add_effect", false, null, veAudioEffectParamList, 0, 54));
        }
        ag().setValue(d().b());
        ah().setValue(d().f156778e);
        dmt.av.video.b.j d2 = d();
        androidx.lifecycle.t<dmt.av.video.t> tVar = this.U;
        h.f.b.l.d(tVar, "");
        d2.D = tVar;
        U().setValue(a(this.f129607a.f129650d.invoke()));
        d().p = U().getValue();
        V().setValue(new r(this));
        this.f129608b.observe(this, new dmt.av.video.e());
        this.f129608b.observe(this, new s(this));
        if (this.f129607a.f129653g) {
            b(new com.ss.android.ugc.aweme.filter.c.a(true, this.f129618l.f129646a));
        }
        d().f156776c = this.T;
        this.N.observe(this, new p(this));
        this.N.observe(this, new dmt.av.video.e());
        d().f156777d = this.P;
        this.O.a(this, new q(this));
        this.O.observe(this, new dmt.av.video.e());
        d().f156774a = this.Q;
        d().f156775b = this.R;
        this.U.observe(this, new v(this));
        ac().observe(this, new z(this));
        ac().observe(this, new dmt.av.video.e());
        ad().observe(this, new u(this));
        ad().observe(this, new dmt.av.video.e());
        ((LiveData) this.t.getValue()).observe(this, new x(this));
        B().observe(this, new t(this));
        af().observe(this, new w(this));
        LiveData<SurfaceView> liveData = this.M;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<android.view.SurfaceView>");
        androidx.lifecycle.t tVar2 = (androidx.lifecycle.t) liveData;
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        tVar2.setValue(surfaceView);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void b(int i2) {
        this.W = i2;
    }

    public static final class aa implements com.ss.android.ugc.aweme.filter.repository.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f129621a;

        static {
            Covode.recordClassIndex(85076);
        }

        aa(com.ss.android.ugc.asve.editor.g gVar) {
            this.f129621a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            h.f.b.l.d(filterBean, "");
            float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
            if (c2 != 0.0f) {
                return c2;
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f129621a;
            String filterFolder = filterBean.getFilterFolder();
            h.f.b.l.b(filterFolder, "");
            return gVar.c(filterFolder);
        }
    }

    public static final class r implements com.ss.android.ugc.aweme.filter.repository.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129637a;

        static {
            Covode.recordClassIndex(85096);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(b bVar) {
            this.f129637a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            h.f.b.l.d(filterBean, "");
            float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
            if (c2 != 0.0f) {
                return c2;
            }
            dmt.av.video.b.j d2 = this.f129637a.d();
            String filterFolder = filterBean.getFilterFolder();
            h.f.b.l.b(filterFolder, "");
            return d2.a(filterFolder);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements com.bytedance.als.m<com.ss.android.ugc.aweme.filter.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129638a;

        static {
            Covode.recordClassIndex(85097);
        }

        s(b bVar) {
            this.f129638a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.filter.c.a aVar) {
            this.f129638a.c(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(int i2) {
        d().f156782i = i2;
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.aweme.filter.repository.a.n a(String str) {
        h.f.b.l.d(str, "");
        return l.a.a(str);
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements com.bytedance.als.m<dmt.av.video.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129635a;

        static {
            Covode.recordClassIndex(85094);
        }

        p(b bVar) {
            this.f129635a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(dmt.av.video.p pVar) {
            dmt.av.video.p pVar2 = pVar;
            dmt.av.video.b.j d2 = this.f129635a.d();
            h.f.b.l.b(pVar2, "");
            d2.a(pVar2);
            if (this.f129635a.d().b() == null) {
                h.f.b.l.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129639a;

        static {
            Covode.recordClassIndex(85098);
        }

        t(b bVar) {
            this.f129639a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f129639a.d().f156778e;
            if (vEEditorAutoStartStopArbiter != null) {
                h.f.b.l.b(bool2, "");
                vEEditorAutoStartStopArbiter.f156724d = bool2.booleanValue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements com.bytedance.als.m<dmt.av.video.s> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129640a;

        static {
            Covode.recordClassIndex(85099);
        }

        u(b bVar) {
            this.f129640a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(dmt.av.video.s sVar) {
            dmt.av.video.s sVar2 = sVar;
            dmt.av.video.b.j d2 = this.f129640a.d();
            h.f.b.l.b(sVar2, "");
            d2.a(sVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T> implements com.bytedance.als.m<dmt.av.video.t> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129641a;

        static {
            Covode.recordClassIndex(85100);
        }

        v(b bVar) {
            this.f129641a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(dmt.av.video.t tVar) {
            dmt.av.video.t tVar2 = tVar;
            dmt.av.video.b.j d2 = this.f129641a.d();
            h.f.b.l.b(tVar2, "");
            d2.a(tVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129642a;

        static {
            Covode.recordClassIndex(85101);
        }

        w(b bVar) {
            this.f129642a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f129642a.d().f156778e;
            if (vEEditorAutoStartStopArbiter != null) {
                h.f.b.l.b(bool2, "");
                vEEditorAutoStartStopArbiter.f156725e = bool2.booleanValue();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<T> implements com.bytedance.als.m<dmt.av.video.v> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129643a;

        static {
            Covode.recordClassIndex(85102);
        }

        x(b bVar) {
            this.f129643a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(dmt.av.video.v vVar) {
            dmt.av.video.v vVar2 = vVar;
            dmt.av.video.b.j d2 = this.f129643a.d();
            h.f.b.l.b(vVar2, "");
            d2.a(vVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements com.bytedance.als.m<VEVolumeChangeOp> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129645a;

        static {
            Covode.recordClassIndex(85104);
        }

        z(b bVar) {
            this.f129645a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(VEVolumeChangeOp vEVolumeChangeOp) {
            VEVolumeChangeOp vEVolumeChangeOp2 = vEVolumeChangeOp;
            dmt.av.video.b.j d2 = this.f129645a.d();
            h.f.b.l.b(vEVolumeChangeOp2, "");
            d2.a(vEVolumeChangeOp2);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(com.ss.android.ugc.aweme.filter.c.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f129608b.postValue(aVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void c(int i2) {
        this.H.setValue(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void d(int i2) {
        this.I.setValue(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void b(boolean z2) {
        FilterBean filterBean;
        dmt.av.video.b.j d2 = d();
        com.ss.android.ugc.aweme.filter.c.a value = this.f129608b.getValue();
        if (value != null) {
            filterBean = value.f95494b;
        } else {
            filterBean = null;
        }
        d2.b(filterBean, false);
        this.f129618l.a(com.ss.android.ugc.aweme.filter.repository.a.a.a.a());
    }

    /* access modifiers changed from: protected */
    public void c(com.ss.android.ugc.aweme.filter.c.a aVar) {
        if (aVar == null) {
            return;
        }
        if (!aVar.f95495c) {
            d().a(aVar.f95494b, this.f129607a.f129647a.invoke().booleanValue());
        } else if (aVar.f95494b != null) {
            a(aVar.f95494b, aVar.f95496d);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void d(boolean z2) {
        this.J.setValue(Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void c(boolean z2) {
        af().setValue(Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(com.ss.android.ugc.aweme.filter.c.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f129608b.setValue(aVar);
        FilterBean filterBean = aVar.f95494b;
        if (filterBean != null) {
            this.f129618l.a(filterBean);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(VEVolumeChangeOp vEVolumeChangeOp) {
        h.f.b.l.d(vEVolumeChangeOp, "");
        ac().setValue(vEVolumeChangeOp);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.n nVar) {
        h.f.b.l.d(nVar, "");
        d().a(this.af, nVar, this.f129607a.f129651e.invoke());
        this.af = nVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> implements dmt.av.video.d<dmt.av.video.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129636a;

        static {
            Covode.recordClassIndex(85095);
        }

        q(b bVar) {
            this.f129636a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // dmt.av.video.d
        public final /* synthetic */ void a(dmt.av.video.w wVar, dmt.av.video.w wVar2) {
            dmt.av.video.w wVar3 = wVar2;
            dmt.av.video.b.j d2 = this.f129636a.d();
            h.f.b.l.b(wVar3, "");
            d2.a(wVar, wVar3);
            if (this.f129636a.d().b() == null) {
                h.f.b.l.b();
            }
        }
    }

    public final String a(FilterBean filterBean, String str) {
        return d().a(filterBean, str);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        h.f.b.l.d(vEBaseFilterParam, "");
        d().b().b(i2, i3, vEBaseFilterParam);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public void a(FilterBean filterBean, FilterBean filterBean2, float f2) {
        float f3;
        if (filterBean != null && filterBean2 != null) {
            if (f2 < 0.0f) {
                f3 = Math.abs(f2);
            } else {
                f3 = 1.0f - f2;
            }
            com.ss.android.ugc.asve.editor.g value = ag().getValue();
            if (value == null) {
                return;
            }
            if (this.f129607a.f129647a.invoke().booleanValue()) {
                aa aaVar = new aa(value);
                String filterFolder = filterBean.getFilterFolder();
                String filterFolder2 = filterBean2.getFilterFolder();
                com.ss.android.ugc.aweme.filter.repository.a.n value2 = U().getValue();
                if (value2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value2, "");
                float a2 = com.ss.android.ugc.aweme.filter.c.a(filterBean, value2, aaVar);
                com.ss.android.ugc.aweme.filter.repository.a.n value3 = U().getValue();
                if (value3 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value3, "");
                value.a(filterFolder, filterFolder2, f3, a2, com.ss.android.ugc.aweme.filter.c.a(filterBean2, value3, aaVar));
                return;
            }
            value.a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f3);
        }
    }

    private b(com.bytedance.o.f fVar, com.bytedance.creativex.editor.preview.a aVar, h.f.a.b<? super d, h.z> bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        MethodCollector.i(5469);
        this.ag = fVar;
        this.ah = aVar;
        this.f129616j = h.i.a((h.f.a.a) new k(this));
        d dVar = new d();
        this.f129607a = dVar;
        if (bVar != null) {
            bVar.invoke(dVar);
        }
        this.ad = new FrameLayout(T());
        this.f129614h = new com.ss.android.ugc.aweme.shortvideo.preview.a.a(T());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SurfaceView surfaceView = this.f129614h;
        if (surfaceView == null) {
            h.f.b.l.a("surfaceView");
        }
        surfaceView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.ad;
        if (frameLayout == null) {
            h.f.b.l.a("frameLayout");
        }
        SurfaceView surfaceView2 = this.f129614h;
        if (surfaceView2 == null) {
            h.f.b.l.a("surfaceView");
        }
        frameLayout.addView(surfaceView2);
        this.f129615i = new ImageView(T());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = this.f129615i;
        if (imageView == null) {
            h.f.b.l.a("firstFrameView");
        }
        imageView.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.ad;
        if (frameLayout2 == null) {
            h.f.b.l.a("frameLayout");
        }
        ImageView imageView2 = this.f129615i;
        if (imageView2 == null) {
            h.f.b.l.a("firstFrameView");
        }
        frameLayout2.addView(imageView2);
        ImageView imageView3 = this.f129615i;
        if (imageView3 == null) {
            h.f.b.l.a("firstFrameView");
        }
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f129618l = new c();
        this.f129619m = h.i.a((h.f.a.a) new ab(this));
        this.n = h.i.a((h.f.a.a) c.f129623a);
        this.o = true;
        this.f129608b = new androidx.lifecycle.t<>();
        this.p = h.i.a((h.f.a.a) C3378b.f129622a);
        this.q = h.i.a((h.f.a.a) j.f129630a);
        this.r = h.i.a((h.f.a.a) e.f129625a);
        this.s = h.i.a((h.f.a.a) d.f129624a);
        this.t = h.i.a((h.f.a.a) h.f129628a);
        this.u = h.i.a((h.f.a.a) f.f129626a);
        this.v = h.i.a((h.f.a.a) i.f129629a);
        this.w = h.i.a((h.f.a.a) a.f129620a);
        this.x = new androidx.lifecycle.t<>();
        this.y = new androidx.lifecycle.t<>();
        this.z = new androidx.lifecycle.t<>();
        this.A = new androidx.lifecycle.t<>();
        this.B = new androidx.lifecycle.t<>();
        this.C = new androidx.lifecycle.t<>();
        this.D = new androidx.lifecycle.t<>();
        this.E = new androidx.lifecycle.t<>();
        this.F = new androidx.lifecycle.t<>();
        this.G = new androidx.lifecycle.t<>();
        this.H = new androidx.lifecycle.t<>();
        this.I = new androidx.lifecycle.t<>();
        this.J = new androidx.lifecycle.t<>();
        this.f129609c = new androidx.lifecycle.t<>();
        this.f129610d = new androidx.lifecycle.t<>();
        this.f129611e = new androidx.lifecycle.t<>();
        this.f129612f = new androidx.lifecycle.t<>();
        this.K = h.i.a((h.f.a.a) new n(this));
        this.L = h.i.a((h.f.a.a) new m(this));
        this.M = new androidx.lifecycle.t();
        this.N = new dmt.av.video.g<>();
        this.O = new dmt.av.video.k<>();
        this.P = new ArrayList<>();
        this.Q = new androidx.lifecycle.t<>();
        this.R = new androidx.lifecycle.t<>();
        this.S = new androidx.lifecycle.t<>();
        this.T = new androidx.lifecycle.t<>();
        this.U = new androidx.lifecycle.t<>();
        this.V = new androidx.lifecycle.t<>();
        this.X = new androidx.lifecycle.t<>();
        this.Y = h.i.a((h.f.a.a) l.f129631a);
        this.Z = h.i.a((h.f.a.a) o.f129634a);
        this.aa = new androidx.lifecycle.t<>();
        this.ab = h.i.a((h.f.a.a) g.f129627a);
        this.ac = true;
        MethodCollector.o(5469);
    }

    public /* synthetic */ b(com.bytedance.o.f fVar, com.bytedance.creativex.editor.preview.a aVar, h.f.a.b bVar, byte b2) {
        this(fVar, aVar, bVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
