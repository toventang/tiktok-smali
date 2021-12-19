package com.ss.android.ugc.aweme.story.edit.b;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.story.base.model.ETParams;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.edit.b;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f extends com.ss.android.ugc.aweme.story.edit.clip.a<e> implements e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137063a = {new h.f.b.y(f.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new h.f.b.y(f.class, "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;", 0), new h.f.b.y(f.class, "surfaceView", "getSurfaceView()Landroid/view/SurfaceView;", 0), new h.f.b.y(f.class, "sharedEditConfigure", "getSharedEditConfigure()Lcom/ss/android/ugc/aweme/story/edit/model/StorySharedEditConfigure;", 0), new h.f.b.y(f.class, "mPublishEditModel", "getMPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
    private final h.h A = h.i.a((h.f.a.a) new j(this));
    private final h.h B = h.i.a((h.f.a.a) l.f137110a);
    private final h.h C = h.i.a((h.f.a.a) i.f137107a);
    private final h.h D = h.i.a((h.f.a.a) h.f137106a);
    private final h.h E = h.i.a((h.f.a.a) ax.f137099a);
    private final h.h F = h.i.a((h.f.a.a) al.f137087a);
    private final h.h G = h.i.a((h.f.a.a) ag.f137082a);
    private final h.h H = h.i.a((h.f.a.a) av.f137097a);
    private final h.h I = h.i.a((h.f.a.a) k.f137109a);
    private final h.h J = h.i.a((h.f.a.a) as.f137094a);
    private final ArrayList<EffectPointModel> K = new ArrayList<>();
    private final h.h L = h.i.a((h.f.a.a) aj.f137085a);
    private final h.h M = h.i.a((h.f.a.a) at.f137095a);
    private final h.h N = h.i.a((h.f.a.a) au.f137096a);
    private final h.h O = h.i.a((h.f.a.a) x.f137124a);
    private final h.h P = h.i.a((h.f.a.a) ae.f137080a);
    private final h.h Q = h.i.a((h.f.a.a) af.f137081a);
    private final h.h R = h.i.a((h.f.a.a) aw.f137098a);
    private final h.h S = h.i.a((h.f.a.a) b.f137100a);
    private final h.h T = h.i.a((h.f.a.a) ac.f137078a);
    private final h.h U = h.i.a((h.f.a.a) ah.f137083a);
    private final h.h V = h.i.a((h.f.a.a) c.f137101a);
    private final h.h W = h.i.a((h.f.a.a) ab.f137077a);
    private final h.h X = h.i.a((h.f.a.a) ad.f137079a);
    private final h.h Y = h.i.a((h.f.a.a) m.f137111a);
    private final h.h Z = h.i.a((h.f.a.a) C3590f.f137104a);
    private final h.h aa = h.i.a((h.f.a.a) am.f137088a);
    private final h.h ab = h.i.a((h.f.a.a) aa.f137076a);
    private final h.h ac = h.i.a((h.f.a.a) z.f137126a);
    private final h.h ad = h.i.a((h.f.a.a) ao.f137090a);
    private final h.h ae = h.i.a((h.f.a.a) a.f137075a);
    private final h.h af = h.i.a((h.f.a.a) p.f137114a);
    private final h.h ag = h.i.a((h.f.a.a) ai.f137084a);
    private final h.h ah = h.i.a((h.f.a.a) ak.f137086a);
    private int ai;
    private androidx.lifecycle.t<Integer> aj = new androidx.lifecycle.t<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f137064b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f137065c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.o.a f137066d;

    /* renamed from: f  reason: collision with root package name */
    public final e f137067f = this;

    /* renamed from: g  reason: collision with root package name */
    private boolean f137068g = true;

    /* renamed from: h  reason: collision with root package name */
    private FilterBean f137069h = com.ss.android.ugc.aweme.filter.repository.a.a.a.a();

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f137070i = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f137071j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.filter.d.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f137072k = com.bytedance.o.b.a.a(getDiContainer(), SurfaceView.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f137073l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.edit.model.c.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f137074m = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private dmt.av.video.n n;
    private final com.ss.android.ugc.aweme.shortvideo.preview.d o = new com.ss.android.ugc.aweme.shortvideo.preview.d();
    private final androidx.lifecycle.t<Boolean> p = new androidx.lifecycle.t<>();
    private final h.h q = h.i.a((h.f.a.a) y.f137125a);
    private final h.h r = h.i.a((h.f.a.a) aq.f137092a);
    private final h.h s = h.i.a((h.f.a.a) ap.f137091a);
    private final h.h t = h.i.a((h.f.a.a) d.f137102a);
    private final h.h u = h.i.a((h.f.a.a) e.f137103a);
    private final h.h v = h.i.a((h.f.a.a) an.f137089a);
    private final h.h w = h.i.a((h.f.a.a) g.f137105a);
    private final h.h x = h.i.a((h.f.a.a) ar.f137093a);
    private final h.h y = h.i.a((h.f.a.a) o.f137113a);
    private final h.h z = h.i.a((h.f.a.a) n.f137112a);

    static {
        Covode.recordClassIndex(89616);
    }

    private SurfaceView aa() {
        return (SurfaceView) this.f137072k.a(this, f137063a[2]);
    }

    private com.ss.android.ugc.aweme.story.edit.model.c ab() {
        return (com.ss.android.ugc.aweme.story.edit.model.c) this.f137073l.a(this, f137063a[3]);
    }

    private final VideoPublishEditModel ac() {
        return (VideoPublishEditModel) this.f137074m.a(this, f137063a[4]);
    }

    private LiveData<VEVolumeChangeOp> ad() {
        return (LiveData) this.E.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> A() {
        return (androidx.lifecycle.t) this.ae.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Boolean> B() {
        return (androidx.lifecycle.t) this.af.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.asve.editor.g> C() {
        return (LiveData) this.R.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<VEEditorAutoStartStopArbiter> D() {
        return (LiveData) this.S.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<dmt.av.video.u> E() {
        return (androidx.lifecycle.t) this.T.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.u<Boolean, Boolean, Boolean>> F() {
        return (LiveData) this.v.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> I() {
        return (LiveData) this.U.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> K() {
        return (LiveData) this.V.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void L() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> M() {
        return (LiveData) this.W.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<h.z> O() {
        return (LiveData) this.Z.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Integer> Q() {
        return (LiveData) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Integer> R() {
        return (LiveData) this.t.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> S() {
        return (LiveData) this.H.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.edit.b.e
    public final LiveData<h.z> T() {
        return (LiveData) this.r.getValue();
    }

    public final StoryEditModel W() {
        return (StoryEditModel) this.f137070i.a(this, f137063a[0]);
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final LiveData<h.z> X() {
        return (LiveData) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Void> e() {
        return (LiveData) this.D.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Void> f() {
        return (LiveData) this.w.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<SurfaceView> g() {
        return (LiveData) this.x.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Boolean> h() {
        return (androidx.lifecycle.t) this.y.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Bitmap> i() {
        return (androidx.lifecycle.t) this.z.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.c.a> j() {
        return (LiveData) this.u.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.repository.a.n> k() {
        return (LiveData) this.B.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<com.ss.android.ugc.aweme.filter.repository.a.k> l() {
        return (LiveData) this.A.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.g<dmt.av.video.p> p() {
        return (dmt.av.video.g) this.I.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.k<dmt.av.video.w> q() {
        return (dmt.av.video.k) this.J.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> s() {
        return (LiveData) this.L.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<dmt.av.video.w> t() {
        return (LiveData) this.M.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<IAudioEffectParam> u() {
        return (LiveData) this.O.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<dmt.av.video.t> v() {
        return (androidx.lifecycle.t) this.P.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<VEPreviewMusicParams> w() {
        return (LiveData) this.Q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<dmt.av.video.s> x() {
        return (LiveData) this.ab.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final LiveData<Boolean> y() {
        return (LiveData) this.ac.getValue();
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.f137067f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int m() {
        return this.ai;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final androidx.lifecycle.t<Integer> n() {
        return this.aj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final ArrayList<EffectPointModel> r() {
        return this.K;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(boolean z2) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        dmt.av.video.b.j a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(this);
        if (a2 != null && (vEEditorAutoStartStopArbiter = a2.f156778e) != null) {
            vEEditorAutoStartStopArbiter.a(z2, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        dmt.av.video.b.j b2;
        VEEditClip c2;
        com.ss.android.ugc.asve.editor.g a2;
        h.f.b.l.d(vEPreviewMusicParams, "");
        com.ss.android.ugc.aweme.story.base.c.a.a(w(), vEPreviewMusicParams);
        com.ss.android.ugc.aweme.shortvideo.o.a aVar = this.f137066d;
        if (!(aVar == null || (c2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this)) == null || (a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(c2)) == null)) {
            a2.g(aVar.f129527a);
        }
        VEEditClip c3 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this);
        if (c3 == null || (b2 = c3.b()) == null) {
            return false;
        }
        return b2.a(vEPreviewMusicParams);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.s sVar) {
        h.f.b.l.d(sVar, "");
        com.ss.android.ugc.aweme.story.base.c.a.a(x(), sVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.u uVar) {
        h.f.b.l.d(uVar, "");
        com.ss.android.ugc.aweme.story.base.c.a.a(E(), uVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(boolean z2, boolean z3, boolean z4) {
        com.ss.android.ugc.aweme.story.base.c.a.a(F(), new h.u(Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)));
    }

    static final class a extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137075a = new a();

        static {
            Covode.recordClassIndex(89617);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.s>> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f137076a = new aa();

        static {
            Covode.recordClassIndex(89618);
        }

        aa() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.s> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f137077a = new ab();

        static {
            Covode.recordClassIndex(89619);
        }

        ab() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f137078a = new ac();

        static {
            Covode.recordClassIndex(89620);
        }

        ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.u> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f137079a = new ad();

        static {
            Covode.recordClassIndex(89621);
        }

        ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.t>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f137080a = new ae();

        static {
            Covode.recordClassIndex(89622);
        }

        ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.t> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class af extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<VEPreviewMusicParams>> {

        /* renamed from: a  reason: collision with root package name */
        public static final af f137081a = new af();

        static {
            Covode.recordClassIndex(89623);
        }

        af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<VEPreviewMusicParams> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ag f137082a = new ag();

        static {
            Covode.recordClassIndex(89624);
        }

        ag() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ah f137083a = new ah();

        static {
            Covode.recordClassIndex(89625);
        }

        ah() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ai f137084a = new ai();

        static {
            Covode.recordClassIndex(89626);
        }

        ai() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final aj f137085a = new aj();

        static {
            Covode.recordClassIndex(89627);
        }

        aj() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f137086a = new ak();

        static {
            Covode.recordClassIndex(89628);
        }

        ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class al extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final al f137087a = new al();

        static {
            Covode.recordClassIndex(89629);
        }

        al() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class am extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final am f137088a = new am();

        static {
            Covode.recordClassIndex(89630);
        }

        am() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class an extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.u<? extends Boolean, ? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final an f137089a = new an();

        static {
            Covode.recordClassIndex(89631);
        }

        an() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.u<? extends Boolean, ? extends Boolean, ? extends Boolean>> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ao extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.v>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ao f137090a = new ao();

        static {
            Covode.recordClassIndex(89632);
        }

        ao() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.v> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ap extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ap f137091a = new ap();

        static {
            Covode.recordClassIndex(89633);
        }

        ap() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Integer> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class aq extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final aq f137092a = new aq();

        static {
            Covode.recordClassIndex(89634);
        }

        aq() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ar extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<SurfaceView>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ar f137093a = new ar();

        static {
            Covode.recordClassIndex(89635);
        }

        ar() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<SurfaceView> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class as extends h.f.b.m implements h.f.a.a<dmt.av.video.k<dmt.av.video.w>> {

        /* renamed from: a  reason: collision with root package name */
        public static final as f137094a = new as();

        static {
            Covode.recordClassIndex(89636);
        }

        as() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dmt.av.video.k<dmt.av.video.w> invoke() {
            return new dmt.av.video.k();
        }
    }

    static final class at extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<dmt.av.video.w>> {

        /* renamed from: a  reason: collision with root package name */
        public static final at f137095a = new at();

        static {
            Covode.recordClassIndex(89637);
        }

        at() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<dmt.av.video.w> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final au f137096a = new au();

        static {
            Covode.recordClassIndex(89638);
        }

        au() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Integer> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class av extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final av f137097a = new av();

        static {
            Covode.recordClassIndex(89639);
        }

        av() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class aw extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.asve.editor.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final aw f137098a = new aw();

        static {
            Covode.recordClassIndex(89640);
        }

        aw() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.asve.editor.g> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class ax extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<VEVolumeChangeOp>> {

        /* renamed from: a  reason: collision with root package name */
        public static final ax f137099a = new ax();

        static {
            Covode.recordClassIndex(89641);
        }

        ax() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<VEVolumeChangeOp> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<VEEditorAutoStartStopArbiter>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137100a = new b();

        static {
            Covode.recordClassIndex(89642);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<VEEditorAutoStartStopArbiter> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137101a = new c();

        static {
            Covode.recordClassIndex(89643);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137102a = new d();

        static {
            Covode.recordClassIndex(89644);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Integer> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.c.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f137103a = new e();

        static {
            Covode.recordClassIndex(89645);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.c.a> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b.f$f  reason: collision with other inner class name */
    static final class C3590f extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3590f f137104a = new C3590f();

        static {
            Covode.recordClassIndex(89646);
        }

        C3590f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f137105a = new g();

        static {
            Covode.recordClassIndex(89647);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Void> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f137106a = new h();

        static {
            Covode.recordClassIndex(89648);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Void> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f137107a = new i();

        static {
            Covode.recordClassIndex(89649);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Void> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<dmt.av.video.g<dmt.av.video.p>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f137109a = new k();

        static {
            Covode.recordClassIndex(89652);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dmt.av.video.g<dmt.av.video.p> invoke() {
            return new dmt.av.video.g();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.n>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f137110a = new l();

        static {
            Covode.recordClassIndex(89653);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.n> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f137111a = new m();

        static {
            Covode.recordClassIndex(89654);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Bitmap>> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f137112a = new n();

        static {
            Covode.recordClassIndex(89655);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Bitmap> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f137113a = new o();

        static {
            Covode.recordClassIndex(89656);
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

    static final class p extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f137114a = new p();

        static {
            Covode.recordClassIndex(89657);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<IAudioEffectParam>> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f137124a = new x();

        static {
            Covode.recordClassIndex(89666);
        }

        x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<IAudioEffectParam> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<h.z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f137125a = new y();

        static {
            Covode.recordClassIndex(89667);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<h.z> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f137126a = new z();

        static {
            Covode.recordClassIndex(89668);
        }

        z() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final VideoPublishEditModel Y() {
        return ac();
    }

    static final class j extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.k>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<com.ss.android.ugc.aweme.filter.repository.a.k> invoke() {
            androidx.lifecycle.t tVar = new androidx.lifecycle.t();
            tVar.setValue(new a(this));
            return tVar;
        }

        public static final class a implements com.ss.android.ugc.aweme.filter.repository.a.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f137108a;

            static {
                Covode.recordClassIndex(89651);
            }

            a(j jVar) {
                this.f137108a = jVar;
            }

            @Override // com.ss.android.ugc.aweme.filter.repository.a.k
            public final float a(FilterBean filterBean) {
                h.f.b.l.d(filterBean, "");
                float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
                if (c2 != 0.0f) {
                    return c2;
                }
                dmt.av.video.b.j d2 = this.f137108a.this$0.d();
                String filterFolder = filterBean.getFilterFolder();
                h.f.b.l.b(filterFolder, "");
                return d2.a(filterFolder);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final com.bytedance.creativex.editor.preview.a G() {
        VEEditClip c2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this);
        if (c2 == null) {
            h.f.b.l.b();
        }
        return c2.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void J() {
        com.ss.android.ugc.aweme.story.base.c.a.a(I(), false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void N() {
        com.ss.android.ugc.aweme.story.base.c.a.a(M(), h.z.f158842a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void P() {
        com.ss.android.ugc.aweme.story.base.c.a.a(O(), h.z.f158842a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final ViewGroup.MarginLayoutParams a() {
        ViewGroup.LayoutParams layoutParams = aa().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int b() {
        return aa().getWidth();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final int c() {
        return aa().getHeight();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final dmt.av.video.b.j d() {
        VEEditClip c2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this);
        if (c2 == null) {
            h.f.b.l.b();
        }
        return c2.b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void o() {
        dmt.av.video.b.j a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(this);
        if (a2 != null) {
            a2.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void z() {
        com.ss.android.ugc.aweme.story.base.c.a.a(y(), true);
    }

    static final class v implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f137121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f137122c;

        static {
            Covode.recordClassIndex(89663);
        }

        v(f fVar, d dVar, b bVar) {
            this.f137120a = fVar;
            this.f137121b = dVar;
            this.f137122c = bVar;
        }

        @Override // dmt.av.video.b.f.a
        public final void a() {
            EditPreviewInfo previewMediaInfo;
            int i2;
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137120a);
            if (!(d2 == null || (previewMediaInfo = d2.getPreviewMediaInfo()) == null)) {
                com.ss.android.ugc.asve.editor.g b2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.b(this.f137120a);
                if (b2 != null) {
                    i2 = b2.j();
                } else {
                    i2 = 0;
                }
                previewMediaInfo.setPreviewVideoLength(i2);
            }
            if (!this.f137120a.f137065c) {
                this.f137120a.f137065c = true;
                com.ss.android.ugc.aweme.story.base.c.a.b(this.f137120a.e(), null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final FrameLayout H() {
        MethodCollector.i(2593);
        ViewParent parent = aa().getParent();
        if (!(parent instanceof FrameLayout)) {
            parent = null;
        }
        FrameLayout frameLayout = (FrameLayout) parent;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(com.bytedance.als.dsl.g.b(this));
        }
        MethodCollector.o(2593);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.gamora.editor.e.c
    public final void Z() {
        VEEditClip vEEditClip = (VEEditClip) com.ss.android.ugc.aweme.story.edit.clip.a.b.a(cy_());
        if (vEEditClip != null) {
            com.ss.android.ugc.aweme.adaptation.a.f66177a.a(aa(), ab().a(vEEditClip.f137559g).a(), ab().a(vEEditClip.f137559g).b());
            com.ss.android.ugc.aweme.story.base.c.a.a(X(), h.z.f158842a);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(getDiContainer(), new w(this));
        b bVar = new b(getDiContainer());
        Iterator<T> it = W().getClips().iterator();
        while (it.hasNext()) {
            VEEditClipCluster cx_ = cy_();
            VEEditClip vEEditClip = new VEEditClip(com.bytedance.als.dsl.g.b(this), this, dVar, bVar, W(), it.next(), aa());
            vEEditClip.f137553a = new v(this, dVar, bVar);
            cx_.add(vEEditClip, -1);
        }
        VEEditClipCluster cx_2 = cy_();
        h.f.b.l.d(cx_2, "");
        List clips = cx_2.a().getClips();
        if ((!clips.isEmpty()) && clips != null) {
            cx_2.a((com.ss.android.ugc.aweme.story.edit.clip.a.g) clips.get(0));
        }
        j().observe(this, new q(this));
        v().observe(this, new r(this));
        ad().observe(this, new s(this));
        x().observe(this, new t(this));
        ((LiveData) this.ad.getValue()).observe(this, new u(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void b(int i2) {
        this.ai = i2;
    }

    static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137116a;

        static {
            Covode.recordClassIndex(89659);
        }

        r(f fVar) {
            this.f137116a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.t tVar = (dmt.av.video.t) obj;
            dmt.av.video.b.j d2 = this.f137116a.d();
            h.f.b.l.b(tVar, "");
            d2.a(tVar);
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137117a;

        static {
            Covode.recordClassIndex(89660);
        }

        s(f fVar) {
            this.f137117a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) obj;
            dmt.av.video.b.j d2 = this.f137117a.d();
            h.f.b.l.b(vEVolumeChangeOp, "");
            d2.a(vEVolumeChangeOp);
        }
    }

    static final class t<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137118a;

        static {
            Covode.recordClassIndex(89661);
        }

        t(f fVar) {
            this.f137118a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.s sVar = (dmt.av.video.s) obj;
            dmt.av.video.b.j d2 = this.f137118a.d();
            h.f.b.l.b(sVar, "");
            d2.a(sVar);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<dmt.av.video.b.j, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(dmt.av.video.b.j jVar) {
            dmt.av.video.b.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            jVar2.x = new VEListener.v(this) {
                /* class com.ss.android.ugc.aweme.story.edit.b.f.w.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ w f137123a;

                static {
                    Covode.recordClassIndex(89665);
                }

                {
                    this.f137123a = r1;
                }

                @Override // com.ss.android.vesdk.VEListener.v
                public final void a() {
                    long j2;
                    long j3;
                    ETParams etParams;
                    ETParams etParams2;
                    if (this.f137123a.this$0.f137064b.compareAndSet(false, true)) {
                        StoryEditModel W = this.f137123a.this$0.W();
                        h.f.b.l.d(W, "");
                        EditContext editContext = W.getEditContext();
                        if (editContext == null || (etParams2 = editContext.getEtParams()) == null) {
                            j2 = 0;
                        } else {
                            j2 = etParams2.getStartTime();
                        }
                        EditContext editContext2 = W.getEditContext();
                        if (editContext2 == null || (etParams = editContext2.getEtParams()) == null) {
                            j3 = 0;
                        } else {
                            j3 = etParams.getCompileTime();
                        }
                        if (j2 > 0) {
                            com.ss.android.ugc.aweme.story.edit.b.a("first_frame_display_on_edit_page", W, new b.c(System.currentTimeMillis() - j2, j3));
                        }
                        com.ss.android.ugc.aweme.port.in.g.a().o().g().a();
                        com.ss.android.ugc.aweme.shortvideo.publish.ac.a();
                        com.ss.android.ugc.aweme.port.in.g.a().o().a();
                        com.ss.android.ugc.aweme.port.in.g.a().o().p().a();
                        com.ss.android.ugc.aweme.story.base.c.a.b(this.f137123a.this$0.f(), null);
                    }
                }
            };
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(int i2) {
        dmt.av.video.b.j a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(this);
        if (a2 != null) {
            a2.f156782i = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void c(int i2) {
        com.ss.android.ugc.aweme.story.base.c.a.a(Q(), Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void d(int i2) {
        com.ss.android.ugc.aweme.story.base.c.a.a(R(), Integer.valueOf(i2));
    }

    static final class q<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137115a;

        static {
            Covode.recordClassIndex(89658);
        }

        q(f fVar) {
            this.f137115a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.b.j a2;
            com.ss.android.ugc.aweme.filter.c.a aVar = (com.ss.android.ugc.aweme.filter.c.a) obj;
            f fVar = this.f137115a;
            if (aVar != null && (a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(fVar)) != null) {
                if (!aVar.f95495c) {
                    a2.a(aVar.f95494b, false);
                } else if (aVar.f95494b != null) {
                    a2.a(aVar.f95494b, aVar.f95496d);
                }
            }
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137119a;

        static {
            Covode.recordClassIndex(89662);
        }

        u(f fVar) {
            this.f137119a = fVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.asve.editor.g b2;
            dmt.av.video.v vVar = (dmt.av.video.v) obj;
            if (!(this.f137119a.f137066d == null || (b2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.b(this.f137119a)) == null)) {
                com.ss.android.ugc.aweme.shortvideo.o.a aVar = this.f137119a.f137066d;
                if (aVar == null) {
                    h.f.b.l.b();
                }
                b2.g(aVar.f129527a);
            }
            dmt.av.video.b.j d2 = this.f137119a.d();
            h.f.b.l.b(vVar, "");
            d2.a(vVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void b(boolean z2) {
        FilterBean filterBean;
        dmt.av.video.b.j a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(this);
        if (a2 != null) {
            com.ss.android.ugc.aweme.filter.c.a value = j().getValue();
            if (value != null) {
                filterBean = value.f95494b;
            } else {
                filterBean = null;
            }
            a2.b(filterBean, false);
        }
        this.f137069h = com.ss.android.ugc.aweme.filter.repository.a.a.a.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void c(boolean z2) {
        com.ss.android.ugc.aweme.story.base.c.a.a((LiveData) this.ag.getValue(), Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void d(boolean z2) {
        com.ss.android.ugc.aweme.story.base.c.a.a(S(), Boolean.valueOf(z2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(com.ss.android.ugc.aweme.filter.c.a aVar) {
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.story.base.c.a.a(j(), aVar);
        FilterBean filterBean = aVar.f95494b;
        if (filterBean != null) {
            this.f137069h = filterBean;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.bytedance.o.f fVar) {
        super(fVar);
        h.f.b.l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(VEVolumeChangeOp vEVolumeChangeOp) {
        h.f.b.l.d(vEVolumeChangeOp, "");
        com.ss.android.ugc.aweme.story.base.c.a.a(ad(), vEVolumeChangeOp);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        h.f.b.l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        com.ss.android.ugc.aweme.story.edit.a.b(vEEditClip2.f137559g, ac());
        if (this.f137068g) {
            com.ss.android.ugc.aweme.story.base.c.a.a(g(), aa());
            com.ss.android.ugc.aweme.story.base.c.a.a(T(), h.z.f158842a);
            this.f137068g = false;
        }
        com.ss.android.ugc.aweme.story.base.c.a.b(j(), new com.ss.android.ugc.aweme.filter.c.a(true, com.ss.android.ugc.aweme.story.edit.model.a.a(vEEditClip2.f137559g, ((com.ss.android.ugc.aweme.filter.d.a) this.f137071j.a(this, f137063a[1])).d())));
        com.ss.android.ugc.aweme.story.base.c.a.a(C(), com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(vEEditClip2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(dmt.av.video.n nVar) {
        h.f.b.l.d(nVar, "");
        dmt.av.video.b.j a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(this);
        if (a2 != null) {
            a2.a(this.n, nVar, this.o.f129651e.invoke());
        }
        this.n = nVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        h.f.b.l.d(vEBaseFilterParam, "");
        com.ss.android.ugc.asve.editor.g b2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.b(this);
        if (b2 != null) {
            b2.b(i2, i3, vEBaseFilterParam);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.preview.a
    public final void a(FilterBean filterBean, FilterBean filterBean2, float f2) {
        float f3;
        if (filterBean != null && filterBean2 != null) {
            if (f2 < 0.0f) {
                f3 = Math.abs(f2);
            } else {
                f3 = 1.0f - f2;
            }
            com.ss.android.ugc.asve.editor.g b2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.b(this);
            if (b2 != null) {
                b2.a(filterBean.getFilterFolder(), filterBean2.getFilterFolder(), f3);
            }
        }
    }
}
