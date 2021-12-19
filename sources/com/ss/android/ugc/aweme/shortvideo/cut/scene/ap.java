package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.google.c.a.o;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.s;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.af;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ba;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ap extends com.ss.android.ugc.gamora.b.a implements com.bytedance.jedi.arch.b, s, bs, bu {
    public static long A = -1;
    public static final a B = new a((byte) 0);
    private final h.h C = h.i.a((h.f.a.a) new k(this));
    private final h.h D = h.i.a((h.f.a.a) new n(this));
    private final h.h E = h.i.a((h.f.a.a) new l(this));
    private final h.h F = h.i.a((h.f.a.a) new i(this));
    private final h.h G = h.i.a((h.f.a.a) new m(this));
    private final h.h H = h.i.a((h.f.a.a) new j(this));
    private CutMultiVideoViewModel I;

    /* renamed from: f  reason: collision with root package name */
    public CutVideoViewModel f125615f;

    /* renamed from: g  reason: collision with root package name */
    public VideoEditViewModel f125616g;

    /* renamed from: h  reason: collision with root package name */
    public CutVideoTitleBarViewModel f125617h;

    /* renamed from: i  reason: collision with root package name */
    CutVideoBottomBarViewModel f125618i;

    /* renamed from: j  reason: collision with root package name */
    CutVideoListViewModel f125619j;

    /* renamed from: k  reason: collision with root package name */
    CutVideoEditViewModel f125620k;

    /* renamed from: l  reason: collision with root package name */
    public CutVideoPreviewViewModel f125621l;
    public long t;
    long u = di.a();
    final int v = 3600000;
    public final ArrayList<ImportVideoInfo> w = new ArrayList<>();
    public boolean x;
    public long y;
    public boolean z;

    private final aj N() {
        return (aj) this.C.getValue();
    }

    private final aw O() {
        return (aw) this.G.getValue();
    }

    public final au E() {
        return (au) this.E.getValue();
    }

    public final af F() {
        return (af) this.F.getValue();
    }

    public final VECutVideoPresenter H() {
        return (VECutVideoPresenter) this.H.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82493);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final androidx.lifecycle.m b() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void e() {
        I();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void I() {
        Activity activity = this.f42913m;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void j() {
        L().b();
    }

    static final class j extends h.f.b.m implements h.f.a.a<VECutVideoPresenter> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VECutVideoPresenter invoke() {
            return new VECutVideoPresenter(com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.b(), this.this$0);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<bm> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bm invoke() {
            bm bmVar = new bm();
            this.this$0.a(R.id.ai3, bmVar, "CutVideoTitleBarScene");
            return bmVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bu
    public final float G() {
        return L().getSelectedTime();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final int J() {
        return N().d();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final int K() {
        return N().C();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final long c() {
        return L().getMaxCutDuration();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final androidx.core.g.e<Long, Long> d() {
        androidx.core.g.e<Long, Long> playBoundary = L().getPlayBoundary();
        h.f.b.l.b(playBoundary, "");
        return playBoundary;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final int g() {
        CutVideoEditViewModel cutVideoEditViewModel = this.f125620k;
        if (cutVideoEditViewModel == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel.f125524a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final SurfaceView h() {
        return N().b();
    }

    static final class k extends h.f.b.m implements h.f.a.a<aj> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            aj ajVar = new aj();
            ajVar.a(this.this$0.H());
            this.this$0.a(R.id.ai3, ajVar, "CutVideoPreviewScene");
            return ajVar;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<aw> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aw invoke() {
            aw awVar = new aw();
            awVar.f125649a = this.this$0;
            this.this$0.a(R.id.ai3, awVar, "CutVideoSpeedScene");
            return awVar;
        }
    }

    static {
        Covode.recordClassIndex(82492);
    }

    /* access modifiers changed from: package-private */
    public final boolean M() {
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g() || !F().N()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final Context a() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (androidx.fragment.app.e) activity;
    }

    @Override // com.bytedance.scene.j
    public final void n() {
        super.n();
        VECutVideoPresenter H2 = H();
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        H2.a((androidx.fragment.app.e) t2);
    }

    static final class i extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ af invoke() {
            af afVar = new af();
            VECutVideoPresenter H = this.this$0.H();
            h.f.b.l.d(H, "");
            afVar.f125566g = H;
            ap apVar = this.this$0;
            h.f.b.l.d(apVar, "");
            afVar.f125567h = apVar;
            this.this$0.a(R.id.ai3, afVar, "CutVideoMultiBottomScene");
            return afVar;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<au> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ap apVar) {
            super(0);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ au invoke() {
            au auVar = new au();
            VECutVideoPresenter H = this.this$0.H();
            h.f.b.l.d(H, "");
            auVar.f125634f = H;
            ap apVar = this.this$0;
            h.f.b.l.d(apVar, "");
            auVar.f125635g = apVar;
            this.this$0.a(R.id.ai3, auVar, "CutVideoSingleBottomScene");
            return auVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h L() {
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            return F().P();
        }
        return E().H();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void f() {
        ba baVar;
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g() && (baVar = F().f125565f) != null) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l lVar = baVar.f125672c;
            lVar.f125974b = -1;
            lVar.f125977e = -1;
            bv bvVar = baVar.f125671b;
            if (bvVar == null) {
                h.f.b.l.a("stickPointVideoSegController");
            }
            bvVar.b(false);
        }
    }

    static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ap f125628a;

        static {
            Covode.recordClassIndex(82500);
        }

        h(ap apVar) {
            this.f125628a = apVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            h<V> hVar = this;
            List<VideoSegment> k2 = ap.a(hVar.f125628a).k();
            if (k2 == null) {
                return null;
            }
            for (T t : k2) {
                ArrayList<ImportVideoInfo> arrayList = hVar.f125628a.w;
                int i2 = t.f125482f;
                int i3 = t.f125483g;
                h.f.b.l.b(t, "");
                arrayList.add(new ImportVideoInfo(i2, i3, t.c(), t.b(), t.a(true).toString(), t.f125478b, t.e() - t.d(), t.v, t.w, t.a(), t.f(), t.a(false).toString()));
                hVar = this;
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void i() {
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            F().H();
        } else {
            E().G();
        }
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a(StringSet.type, "1");
        CutVideoViewModel cutVideoViewModel2 = this.f125615f;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("count", cutVideoViewModel2.b().f125552a.size());
        long currentTimeMillis = System.currentTimeMillis();
        CutVideoViewModel cutVideoViewModel3 = this.f125615f;
        if (cutVideoViewModel3 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_video_clip_first_frame", a3.a("duration", currentTimeMillis - cutVideoViewModel3.b().y).f149193a);
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.tools.view.e.b f125622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ap f125623b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f125624c = true;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BackgroundVideoCompileConfigure f125625d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f125626e;

        static {
            Covode.recordClassIndex(82494);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x026b  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x027d  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0293  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0297  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x029e  */
        @Override // com.ss.android.vesdk.VEListener.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCompileDone() {
            /*
            // Method dump skipped, instructions count: 686
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.scene.ap.b.onCompileDone():void");
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            com.ss.android.ugc.tools.view.e.b bVar = this.f125622a;
            if (bVar != null && bVar.isShowing()) {
                bVar.setProgress((int) (f2 * 100.0f));
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.c
        public final void a(boolean z) {
            this.f125623b.x = z;
            if (!z) {
                com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(this.f125623b.f42913m, this.f125623b.t().getResources().getString(R.string.fyd));
                this.f125622a = b2;
                if (b2 != null) {
                    b2.setIndeterminate(false);
                }
            }
        }

        b(ap apVar, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, o oVar) {
            this.f125623b = apVar;
            this.f125625d = backgroundVideoCompileConfigure;
            this.f125626e = oVar;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            ap.b(this.f125623b).d(true);
            com.ss.android.ugc.tools.view.widget.k.b(this.f125622a);
            String a2 = this.f125623b.a(R.string.ase, Integer.valueOf(i2));
            h.f.b.l.b(a2, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f125623b.f42913m).a(a2).a();
            r.a("import_transcoding_end", new com.ss.android.ugc.tools.f.b().a("status", 0).f149193a);
        }
    }

    public static final /* synthetic */ VideoEditViewModel a(ap apVar) {
        VideoEditViewModel videoEditViewModel = apVar.f125616g;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final /* synthetic */ CutVideoTitleBarViewModel b(ap apVar) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar.f125617h;
        if (cutVideoTitleBarViewModel == null) {
            h.f.b.l.a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final void a(bt btVar) {
        h.f.b.l.d(btVar, "");
        N().f125593a = btVar;
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ap f125627a;

        static {
            Covode.recordClassIndex(82497);
        }

        e(ap apVar) {
            this.f125627a = apVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ap apVar = this.f125627a;
                CutVideoEditViewModel cutVideoEditViewModel = apVar.f125620k;
                if (cutVideoEditViewModel == null) {
                    h.f.b.l.a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.a(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar.f125617h;
                if (cutVideoTitleBarViewModel == null) {
                    h.f.b.l.a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel.d(!booleanValue);
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = apVar.f125617h;
                if (cutVideoTitleBarViewModel2 == null) {
                    h.f.b.l.a("titleBarViewModel");
                }
                cutVideoTitleBarViewModel2.c(!booleanValue);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = apVar.f125621l;
                if (cutVideoPreviewViewModel == null) {
                    h.f.b.l.a("previewViewModel");
                }
                cutVideoPreviewViewModel.a(!booleanValue);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = apVar.f125618i;
                if (cutVideoBottomBarViewModel == null) {
                    h.f.b.l.a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel.c(new CutVideoBottomBarViewModel.e(!booleanValue));
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = apVar.f125618i;
                if (cutVideoBottomBarViewModel2 == null) {
                    h.f.b.l.a("bottomBarViewModel");
                }
                cutVideoBottomBarViewModel2.c(new CutVideoBottomBarViewModel.h(!booleanValue));
                CutVideoViewModel cutVideoViewModel = apVar.f125615f;
                if (cutVideoViewModel == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                if (cutVideoViewModel.g()) {
                    apVar.F().I().S = booleanValue;
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = apVar.f125618i;
                    if (cutVideoBottomBarViewModel3 == null) {
                        h.f.b.l.a("bottomBarViewModel");
                    }
                    cutVideoBottomBarViewModel3.c(new CutVideoBottomBarViewModel.c(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel = apVar.f125619j;
                    if (cutVideoListViewModel == null) {
                        h.f.b.l.a("videoListViewModel");
                    }
                    cutVideoListViewModel.c(new CutVideoListViewModel.f(!booleanValue));
                    CutVideoListViewModel cutVideoListViewModel2 = apVar.f125619j;
                    if (cutVideoListViewModel2 == null) {
                        h.f.b.l.a("videoListViewModel");
                    }
                    cutVideoListViewModel2.c(new CutVideoListViewModel.g(!booleanValue));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void a(com.ss.android.ugc.asve.editor.g gVar) {
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            af F2 = F();
            ba baVar = F2.f125565f;
            if (baVar != null) {
                baVar.f125672c.f125973a = gVar;
                baVar.f125675f.f125925a = gVar;
                baVar.b();
                bv bvVar = baVar.f125671b;
                if (bvVar == null) {
                    h.f.b.l.a("stickPointVideoSegController");
                }
                bvVar.b(baVar.g());
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar2 = baVar.f125674e;
                if (gVar2 != null) {
                    gVar2.a(baVar.g(), false);
                }
                baVar.f125672c.a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) new ba.g(baVar), false);
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(baVar.c());
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel = F2.f125571l;
            if (cutVideoPreviewViewModel == null) {
                h.f.b.l.a("previewViewModel");
            }
            cutVideoPreviewViewModel.a();
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a2, "");
        this.f125616g = (VideoEditViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a3, "");
        this.I = (CutMultiVideoViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = t.a((androidx.fragment.app.e) activity3).a(CutVideoTitleBarViewModel.class);
        h.f.b.l.b(a4, "");
        this.f125617h = (CutVideoTitleBarViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = t.a((androidx.fragment.app.e) activity4).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a5, "");
        this.f125618i = (CutVideoBottomBarViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = t.a((androidx.fragment.app.e) activity5).a(CutVideoListViewModel.class);
        h.f.b.l.b(a6, "");
        this.f125619j = (CutVideoListViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = t.a((androidx.fragment.app.e) activity6).a(CutVideoEditViewModel.class);
        h.f.b.l.b(a7, "");
        this.f125620k = (CutVideoEditViewModel) a7;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = t.a((androidx.fragment.app.e) activity7).a(CutVideoPreviewViewModel.class);
        h.f.b.l.b(a8, "");
        this.f125621l = (CutVideoPreviewViewModel) a8;
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        b.a.b(this, cutVideoViewModel, aq.f125629a, new c(this));
        CutVideoViewModel cutVideoViewModel2 = this.f125615f;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        b.a.b(this, cutVideoViewModel2, ar.f125630a, new d(this));
        VideoEditViewModel videoEditViewModel = this.f125616g;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel.s.observe(this, new e(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f125618i;
        if (cutVideoBottomBarViewModel == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, as.f125631a, new ah(), new f(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f125620k;
        if (cutVideoEditViewModel == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        selectNonNullSubscribe(cutVideoEditViewModel, at.f125632a, new ah(), new g(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Float, z> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ap apVar) {
            super(2);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Float f2) {
            float floatValue = f2.floatValue();
            h.f.b.l.d(bVar, "");
            this.this$0.y = (long) (floatValue * 1000.0f);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ap apVar) {
            super(2);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.z = booleanValue;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asn, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.f125615f = (CutVideoViewModel) a2;
        e(N());
        e((bm) this.D.getValue());
        CutVideoViewModel cutVideoViewModel = this.f125615f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            e(F());
            e(O());
            H().f125350e = com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false);
            return;
        }
        e(E());
        e(O());
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ap apVar) {
            super(2);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            ap apVar = this.this$0;
            CutVideoViewModel cutVideoViewModel = apVar.f125615f;
            if (cutVideoViewModel == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            com.ss.android.ugc.aweme.common.ad adVar = cutVideoViewModel.b().f125561j;
            if (com.ss.android.ugc.aweme.port.in.l.f115658a.g().a(adVar)) {
                com.ss.android.ugc.aweme.port.in.l.f115658a.g().a(apVar.f42913m, adVar, "Sharing canceled", 20013);
            }
            CutVideoViewModel cutVideoViewModel2 = apVar.f125615f;
            if (cutVideoViewModel2 == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.g()) {
                af F = apVar.F();
                com.ss.android.ugc.aweme.shortvideo.cut.z zVar2 = F.I().f125827a;
                if (zVar2 == null || zVar2.a().size() != 0) {
                    Activity activity = F.f42913m;
                    if (activity != null) {
                        new a.C0731a(activity).b(R.string.f7v).b(R.string.d6n, (DialogInterface.OnClickListener) new af.h(F), false).a(R.string.c52, (DialogInterface.OnClickListener) new af.i(F), false).a().b().show();
                        VideoEditViewModel videoEditViewModel = F.f125569j;
                        if (videoEditViewModel == null) {
                            h.f.b.l.a("videoEditViewModel");
                        }
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(videoEditViewModel.k(), "exit_clip_popup_show", F.N());
                    }
                } else {
                    F.M();
                }
            } else {
                apVar.I();
            }
            if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                com.ss.android.ugc.tools.f.b bVar2 = new com.ss.android.ugc.tools.f.b();
                CutVideoViewModel cutVideoViewModel3 = apVar.f125615f;
                if (cutVideoViewModel3 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                r.a("video_trim_back", bVar2.a("creation_id", cutVideoViewModel3.b().o).a("enter_from", "upload").f149193a);
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ ap this$0;

        static {
            Covode.recordClassIndex(82496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ap apVar) {
            super(2);
            this.this$0 = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            int i2;
            BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
            String str;
            String str2;
            int i3;
            String str3;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            CutVideoViewModel cutVideoViewModel = this.this$0.f125615f;
            if (cutVideoViewModel == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel.g()) {
                af F = this.this$0.F();
                ba baVar = F.f125565f;
                if (baVar != null) {
                    baVar.j();
                }
                ba baVar2 = F.f125565f;
                if (baVar2 != null) {
                    com.ss.android.ugc.aweme.shortvideo.c i4 = baVar2.i();
                    List<VideoSegment> c2 = baVar2.c();
                    boolean z = baVar2.f125679j;
                    boolean g2 = baVar2.g();
                    String str4 = baVar2.f125678i;
                    long j2 = baVar2.r;
                    boolean z2 = baVar2.s;
                    h.f.b.l.d(str4, "");
                    if (i4 != null && !com.ss.android.ugc.tools.utils.k.a(c2)) {
                        if (g2) {
                            j2 = 0;
                        }
                        if (c2 == null) {
                            h.f.b.l.b();
                        }
                        int i5 = 0;
                        long j3 = 0;
                        for (T t : c2) {
                            j3 += t.f125478b;
                            if (t.x) {
                                i5++;
                            }
                            if (g2) {
                                j2 += (long) (((float) (t.e() - t.d())) / t.f());
                            }
                        }
                        com.ss.android.ugc.tools.f.b a2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().a("music_id", i4.getMusicId()).a("music_selected_from", str4);
                        if (g2) {
                            str = "sync_on";
                        } else {
                            str = "sync_off";
                        }
                        com.ss.android.ugc.tools.f.b a3 = a2.a("sync_mode", str).a("content_duration_ms", j3).a("edit_duration", j2).a("is_edit", z2 ? 1 : 0);
                        if (g2) {
                            str2 = "multi_sync";
                        } else {
                            str2 = "multi_normal";
                        }
                        com.ss.android.ugc.tools.f.b a4 = a3.a("edit_type", str2).a("video_cnt", c2.size() - i5).a("pic_cnt", i5);
                        if (c2.size() > 1) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        com.ss.android.ugc.tools.f.b a5 = a4.a("is_multi_content", i3);
                        if (z) {
                            str3 = "on";
                        } else {
                            str3 = "off";
                        }
                        r.a("edit_upload_next", a5.a("smart_sync", str3).f149193a);
                    }
                    baVar2.j();
                }
            } else {
                List<VideoSegment> k2 = ap.a(this.this$0).k();
                long j4 = this.this$0.y;
                boolean z3 = this.this$0.z;
                if (!com.ss.android.ugc.tools.utils.k.a(k2)) {
                    if (k2 == null) {
                        h.f.b.l.b();
                    }
                    int i6 = 0;
                    long j5 = 0;
                    for (T t2 : k2) {
                        j5 += t2.f125478b;
                        if (t2.x) {
                            i6++;
                        }
                    }
                    com.ss.android.ugc.tools.f.b a6 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().a("content_duration_ms", j5).a("edit_duration", j4).a("is_edit", z3 ? 1 : 0).a("edit_type", "single").a("video_cnt", k2.size() - i6).a("pic_cnt", i6);
                    if (k2.size() > 1) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    r.a("edit_upload_next", a6.a("is_multi_content", i2).f149193a);
                }
            }
            ap.b(this.this$0).d(false);
            ap apVar = this.this$0;
            if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                com.ss.android.ugc.tools.f.b a7 = new com.ss.android.ugc.tools.f.b().a("enter_from", "upload");
                CutVideoViewModel cutVideoViewModel2 = apVar.f125615f;
                if (cutVideoViewModel2 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                r.a("video_trim_next", a7.a("creation_id", cutVideoViewModel2.b().o).f149193a);
            }
            this.this$0.t = System.currentTimeMillis();
            if (this.this$0.L() instanceof VEVideoEditViewV2) {
                VECutVideoPresenter H = this.this$0.H();
                androidx.core.g.e<Long, Long> playBoundary = this.this$0.L().getPlayBoundary();
                h.f.b.l.b(playBoundary, "");
                H.a(playBoundary);
            }
            ap apVar2 = this.this$0;
            Activity activity = apVar2.f42913m;
            if (activity == null || !activity.isFinishing()) {
                if (apVar2.H().a() + 5 < apVar2.u) {
                    String a8 = apVar2.a(R.string.h_f, Long.valueOf(apVar2.u / 1000));
                    h.f.b.l.b(a8, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(apVar2.f42913m).a(a8).a();
                    CutVideoTitleBarViewModel cutVideoTitleBarViewModel = apVar2.f125617h;
                    if (cutVideoTitleBarViewModel == null) {
                        h.f.b.l.a("titleBarViewModel");
                    }
                    cutVideoTitleBarViewModel.d(true);
                } else if (apVar2.H().a() > ((long) apVar2.v)) {
                    bj.a("compile failed,duration=" + apVar2.H().a() + ",maxEncodeDuration=" + apVar2.v);
                    new com.ss.android.ugc.aweme.tux.a.i.a(apVar2.f42913m).a(R.string.d6e).a();
                    CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = apVar2.f125617h;
                    if (cutVideoTitleBarViewModel2 == null) {
                        h.f.b.l.a("titleBarViewModel");
                    }
                    cutVideoTitleBarViewModel2.d(true);
                } else {
                    r.a("import_transcoding_start", Collections.emptyMap());
                    o a9 = o.a();
                    CutVideoEditViewModel cutVideoEditViewModel = apVar2.f125620k;
                    if (cutVideoEditViewModel == null) {
                        h.f.b.l.a("cutVideoEditViewModel");
                    }
                    if (cutVideoEditViewModel.f125524a != 1) {
                        CutVideoListViewModel cutVideoListViewModel = apVar2.f125619j;
                        if (cutVideoListViewModel == null) {
                            h.f.b.l.a("videoListViewModel");
                        }
                        int i7 = cutVideoListViewModel.f125528b;
                        VECutVideoPresenter H2 = apVar2.H();
                        VideoEditViewModel videoEditViewModel = apVar2.f125616g;
                        if (videoEditViewModel == null) {
                            h.f.b.l.a("videoEditViewModel");
                        }
                        VECutVideoPresenter.a(H2, i7, (float) videoEditViewModel.j().get(i7).f125486j, false, 0.0f, 0.0f, 0, 0, 120);
                    }
                    CutVideoViewModel cutVideoViewModel3 = apVar2.f125615f;
                    if (cutVideoViewModel3 == null) {
                        h.f.b.l.a("cutVideoViewModel");
                    }
                    if (cutVideoViewModel3.b().f125564m) {
                        CutVideoViewModel cutVideoViewModel4 = apVar2.f125615f;
                        if (cutVideoViewModel4 == null) {
                            h.f.b.l.a("cutVideoViewModel");
                        }
                        backgroundVideoCompileConfigure = cutVideoViewModel4.b().C;
                        if (backgroundVideoCompileConfigure == null) {
                            CutVideoViewModel cutVideoViewModel5 = apVar2.f125615f;
                            if (cutVideoViewModel5 == null) {
                                h.f.b.l.a("cutVideoViewModel");
                            }
                            Workspace workspace = cutVideoViewModel5.b().f125560i;
                            if (workspace == null) {
                                h.f.b.l.b();
                            }
                            backgroundVideoCompileConfigure = com.ss.android.ugc.aweme.shortvideo.cut.a.a(workspace);
                        }
                    } else {
                        backgroundVideoCompileConfigure = null;
                    }
                    VECutVideoPresenter H3 = apVar2.H();
                    CutVideoViewModel cutVideoViewModel6 = apVar2.f125615f;
                    if (cutVideoViewModel6 == null) {
                        h.f.b.l.a("cutVideoViewModel");
                    }
                    Workspace workspace2 = cutVideoViewModel6.b().f125560i;
                    if (workspace2 == null) {
                        h.f.b.l.b();
                    }
                    CutVideoViewModel cutVideoViewModel7 = apVar2.f125615f;
                    if (cutVideoViewModel7 == null) {
                        h.f.b.l.a("cutVideoViewModel");
                    }
                    H3.a((VECutVideoPresenter) workspace2, (Workspace) backgroundVideoCompileConfigure, (BackgroundVideoCompileConfigure) ae.b(cutVideoViewModel7.b()), (boolean) new b(apVar2, backgroundVideoCompileConfigure, a9), (c) false);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
