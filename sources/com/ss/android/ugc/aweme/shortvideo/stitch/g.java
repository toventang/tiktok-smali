package com.ss.android.ugc.aweme.shortvideo.stitch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.s;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.aj;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bm;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bs;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bt;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.z;
import h.z;
import java.io.File;
import java.util.Objects;

public final class g extends com.ss.android.ugc.gamora.b.a implements com.bytedance.jedi.arch.b, s, bs {
    private final h.h A = h.i.a((h.f.a.a) new m(this));
    private final h.h B = h.i.a((h.f.a.a) new n(this));

    /* renamed from: f  reason: collision with root package name */
    CutVideoViewModel f130828f;

    /* renamed from: g  reason: collision with root package name */
    CutVideoPreviewViewModel f130829g;

    /* renamed from: h  reason: collision with root package name */
    VideoEditViewModel f130830h;

    /* renamed from: i  reason: collision with root package name */
    public StitchIntroduceViewModel f130831i;

    /* renamed from: j  reason: collision with root package name */
    public VEVideoCutterViewModel f130832j;

    /* renamed from: k  reason: collision with root package name */
    public String f130833k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.tools.view.e.b f130834l;
    public boolean t;
    private CutMultiVideoViewModel u;
    private CutVideoTitleBarViewModel v;
    private CutVideoBottomBarViewModel w;
    private final h.h x = h.i.a((h.f.a.a) new o(this));
    private final h.h y = h.i.a((h.f.a.a) new q(this));
    private final h.h z = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(85736);
    }

    private final aj M() {
        return (aj) this.x.getValue();
    }

    public final f E() {
        return (f) this.z.getValue();
    }

    public final b F() {
        return (b) this.A.getValue();
    }

    public final VECutVideoPresenter G() {
        return (VECutVideoPresenter) this.B.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void a(com.ss.android.ugc.asve.editor.g gVar) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final int g() {
        return 0;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final androidx.lifecycle.m b() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void e() {
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
    public final void i() {
        E().F();
    }

    static final class m extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            b bVar = new b();
            this.this$0.a(R.id.dst, bVar, "StitchIntroducingScene");
            return bVar;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<VECutVideoPresenter> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VECutVideoPresenter invoke() {
            return new VECutVideoPresenter(com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.b(), this.this$0, c.a());
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<bm> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bm invoke() {
            bm bmVar = new bm();
            this.this$0.a(R.id.dst, bmVar, "CutVideoTitleBarScene");
            return bmVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final int J() {
        return M().d();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final int K() {
        return M().C();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h L() {
        return E().G();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final long c() {
        return E().G().getMaxCutDuration();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final SurfaceView h() {
        return M().b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final void j() {
        E().G().b();
    }

    static final class o extends h.f.b.m implements h.f.a.a<aj> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            aj ajVar = new aj();
            ajVar.a(this.this$0.G());
            this.this$0.a(R.id.dst, ajVar, "CutVideoPreviewScene");
            return ajVar;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            StitchIntroduceViewModel b2 = g.b(this.this$0);
            c.f130814a.edit().putBoolean("stitch_trimming_next_guide", true).apply();
            b2.c(StitchIntroduceViewModel.c.f130799a);
            return z.f158842a;
        }
    }

    public final void H() {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.v;
        if (cutVideoTitleBarViewModel == null) {
            h.f.b.l.a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.d(true);
        com.ss.android.ugc.tools.view.widget.k.b(this.f130834l);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final Context a() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (androidx.fragment.app.e) activity;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.s
    public final androidx.core.g.e<Long, Long> d() {
        androidx.core.g.e<Long, Long> playBoundary = E().G().getPlayBoundary();
        h.f.b.l.b(playBoundary, "");
        return playBoundary;
    }

    @Override // com.bytedance.scene.j
    public final void n() {
        super.n();
        VECutVideoPresenter G = G();
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G.a((androidx.fragment.app.e) t2);
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        com.ss.android.ugc.aweme.shortvideo.cut.j jVar;
        super.y();
        if (Build.VERSION.SDK_INT < 21 && (jVar = G().f125351f) != null) {
            jVar.b(true);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            f fVar = new f();
            VECutVideoPresenter G = this.this$0.G();
            h.f.b.l.d(G, "");
            fVar.f130821f = G;
            g gVar = this.this$0;
            h.f.b.l.d(gVar, "");
            fVar.f130822g = gVar;
            this.this$0.a(R.id.dst, fVar, "CutVideoSingleBottomScene");
            return fVar;
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        if (c.a()) {
            StitchIntroduceViewModel stitchIntroduceViewModel = this.f130831i;
            if (stitchIntroduceViewModel == null) {
                h.f.b.l.a("stitchViewModel");
            }
            stitchIntroduceViewModel.a();
            return;
        }
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f130831i;
        if (stitchIntroduceViewModel2 == null) {
            h.f.b.l.a("stitchViewModel");
        }
        stitchIntroduceViewModel2.c(StitchIntroduceViewModel.b.f130798a);
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.cut.scene.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130835a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f130836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StitchParams f130837c;

        static {
            Covode.recordClassIndex(85738);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            String musicPath;
            EditVideoSegment videoSegment;
            String audioPath;
            File a2 = this.f130836b.element.a();
            h.f.b.l.b(a2, "");
            String path = a2.getPath();
            h.f.b.l.b(path, "");
            File b2 = this.f130836b.element.b();
            h.f.b.l.b(b2, "");
            String path2 = b2.getPath();
            File a3 = this.f130836b.element.a();
            h.f.b.l.b(a3, "");
            this.f130837c.setVideoSegment(new EditVideoSegment(path, path2, com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(a3.getPath())));
            StitchParams stitchParams = this.f130837c;
            File a4 = this.f130836b.element.a();
            h.f.b.l.b(a4, "");
            stitchParams.setDuration(com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(a4.getPath()).getDuration());
            if (!this.f130837c.isPGCMusic() || (musicPath = this.f130837c.getMusicPath()) == null || musicPath.length() == 0) {
                this.f130837c.setMusic(null);
                this.f130835a.I();
                return;
            }
            g gVar = this.f130835a;
            StitchParams stitchParams2 = this.f130837c;
            String musicPath2 = stitchParams2.getMusicPath();
            if (musicPath2 != null && (videoSegment = stitchParams2.getVideoSegment()) != null && (audioPath = videoSegment.getAudioPath()) != null) {
                gVar.G();
                c cVar = new c(gVar, stitchParams2);
                h.f.b.l.d(musicPath2, "");
                h.f.b.l.d(audioPath, "");
                h.f.b.l.d(cVar, "");
                t.a(new VECutVideoPresenter.d(cVar, musicPath2, audioPath)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new VECutVideoPresenter.e(cVar), new VECutVideoPresenter.f(cVar));
            }
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            com.ss.android.ugc.tools.view.e.b bVar = this.f130835a.f130834l;
            if (bVar != null && bVar.isShowing()) {
                bVar.setProgress((int) (f2 * 100.0f));
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.c
        public final void a(boolean z) {
            this.f130835a.t = z;
            if (!z) {
                g gVar = this.f130835a;
                gVar.f130834l = com.ss.android.ugc.tools.view.e.b.b(gVar.f42913m, this.f130835a.t().getResources().getString(R.string.fyd));
                com.ss.android.ugc.tools.view.e.b bVar = this.f130835a.f130834l;
                if (bVar != null) {
                    bVar.setIndeterminate(false);
                }
            }
        }

        b(g gVar, z.e eVar, StitchParams stitchParams) {
            this.f130835a = gVar;
            this.f130836b = eVar;
            this.f130837c = stitchParams;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            String a2 = this.f130835a.a(R.string.ase, Integer.valueOf(i2));
            h.f.b.l.b(a2, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f130835a.f42913m).a(a2).a();
            this.f130835a.H();
        }
    }

    public final void I() {
        long j2;
        boolean z2;
        String str;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.v;
        if (cutVideoTitleBarViewModel == null) {
            h.f.b.l.a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.d(true);
        com.ss.android.ugc.tools.view.widget.k.b(this.f130834l);
        if (c.C1870c.f80046a.a()) {
            bj.b("stitch trim end, go to shoot fail, App in background");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("shoot_mode", 12);
        CutVideoViewModel cutVideoViewModel = this.f130828f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        StitchParams stitchParams = cutVideoViewModel.b().x;
        if (stitchParams == null) {
            stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
        }
        F f2 = E().G().getPlayBoundary().f2397a;
        long j3 = 0;
        if (f2 != null) {
            j2 = f2.longValue();
        } else {
            j2 = 0;
        }
        stitchParams.setStartTime(j2);
        S s = E().G().getPlayBoundary().f2398b;
        if (s != null) {
            j3 = s.longValue();
        }
        stitchParams.setEndTime(j3);
        if (stitchParams.isPGCMusic()) {
            String str2 = this.f130833k;
            if (str2 == null) {
                str2 = "";
            }
            long duration = stitchParams.getDuration();
            long leftSeekingValue = E().G().getLeftSeekingValue();
            if (stitchParams.getMusicStart() >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            h.f.b.l.d(str2, "");
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", "stitch").a("enter_from", "video_stitch_page").a("creation_id", str2).a("content_source", "shoot").a("content_type", "video");
            if (z2) {
                str = "1";
            } else {
                str = "0";
            }
            r.a("stitch_next", a2.a("pgc_stitched", str).a("duration", duration).a("duration_begin_at", leftSeekingValue).f149193a);
        } else {
            String str3 = this.f130833k;
            if (str3 == null) {
                str3 = "";
            }
            long duration2 = stitchParams.getDuration();
            long leftSeekingValue2 = E().G().getLeftSeekingValue();
            h.f.b.l.d(str3, "");
            r.a("stitch_next", new com.ss.android.ugc.tools.f.b().a("shoot_way", "stitch").a("enter_from", "video_stitch_page").a("creation_id", str3).a("content_source", "shoot").a("content_type", "video").a("duration", duration2).a("duration_begin_at", leftSeekingValue2).f149193a);
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        }
        intent.putExtra("enter_from", "video_stitch_page");
        intent.putExtra("music_origin", "stitch");
        intent.putExtra("creation_id", this.f130833k);
        intent.putExtra("shoot_way", "stitch");
        intent.putExtra("content_type", "video");
        intent.putExtra("content_source", "shoot");
        Objects.requireNonNull(stitchParams, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("stitch_params", (Parcelable) stitchParams);
        Activity activity = this.f42913m;
        if (activity != null) {
            com.ss.android.ugc.aweme.shortvideo.r.b a3 = com.ss.android.ugc.aweme.shortvideo.r.a.a();
            h.f.b.l.b(activity, "");
            a3.d(activity, intent);
        }
    }

    public static final /* synthetic */ VEVideoCutterViewModel a(g gVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = gVar.f130832j;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    public static final /* synthetic */ StitchIntroduceViewModel b(g gVar) {
        StitchIntroduceViewModel stitchIntroduceViewModel = gVar.f130831i;
        if (stitchIntroduceViewModel == null) {
            h.f.b.l.a("stitchViewModel");
        }
        return stitchIntroduceViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.cut.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StitchParams f130839b;

        static {
            Covode.recordClassIndex(85739);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.f
        public final void a(int i2) {
            boolean z;
            this.f130839b.setMusicStart(i2);
            StitchParams stitchParams = this.f130839b;
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            stitchParams.setMuted(z);
            if (i2 < 0) {
                this.f130839b.setMusic(null);
            }
            this.f130838a.I();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.f
        public final void a(Exception exc) {
            h.f.b.l.d(exc, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f130838a.f42913m).a(R.string.ase).a();
            this.f130838a.H();
        }

        c(g gVar, StitchParams stitchParams) {
            this.f130838a = gVar;
            this.f130839b = stitchParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$g  reason: collision with other inner class name */
    static final class C3412g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130843a;

        static {
            Covode.recordClassIndex(85746);
        }

        C3412g(g gVar) {
            this.f130843a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = this.f130843a.f130833k;
            if (str == null) {
                str = "";
            }
            a.a(str, this.f130843a.E().G().getRightSeekingValue() - this.f130843a.E().G().getLeftSeekingValue(), this.f130843a.E().G().getLeftSeekingValue());
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f130844a;

        static {
            Covode.recordClassIndex(85747);
        }

        h(g gVar) {
            this.f130844a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = this.f130844a.f130833k;
            if (str == null) {
                str = "";
            }
            a.a(str, this.f130844a.E().G().getRightSeekingValue() - this.f130844a.E().G().getLeftSeekingValue(), this.f130844a.E().G().getLeftSeekingValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bs
    public final void a(bt btVar) {
        h.f.b.l.d(btVar, "");
        M().f125593a = btVar;
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.u = (CutMultiVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity2).a(CutVideoPreviewViewModel.class);
        h.f.b.l.b(a3, "");
        this.f130829g = (CutVideoPreviewViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoTitleBarViewModel.class);
        h.f.b.l.b(a4, "");
        this.v = (CutVideoTitleBarViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity4).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a5, "");
        this.w = (CutVideoBottomBarViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a6 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity5, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a6, "");
        VideoEditViewModel videoEditViewModel = (VideoEditViewModel) a6;
        this.f130830h = videoEditViewModel;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel.f126128a = true;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity6).a(StitchIntroduceViewModel.class);
        h.f.b.l.b(a7, "");
        this.f130831i = (StitchIntroduceViewModel) a7;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a8 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity7, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a8, "");
        this.f130832j = (VEVideoCutterViewModel) a8;
        CutVideoViewModel cutVideoViewModel = this.f130828f;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        b.a.b(this, cutVideoViewModel, h.f130845a, new i(this));
        CutVideoViewModel cutVideoViewModel2 = this.f130828f;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        b.a.b(this, cutVideoViewModel2, k.f130848a, new j(this));
        StitchIntroduceViewModel stitchIntroduceViewModel = this.f130831i;
        if (stitchIntroduceViewModel == null) {
            h.f.b.l.a("stitchViewModel");
        }
        b.a.b(this, stitchIntroduceViewModel, l.f130849a, new k(this));
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f130831i;
        if (stitchIntroduceViewModel2 == null) {
            h.f.b.l.a("stitchViewModel");
        }
        b.a.b(this, stitchIntroduceViewModel2, m.f130850a, new l(this));
        StitchIntroduceViewModel stitchIntroduceViewModel3 = this.f130831i;
        if (stitchIntroduceViewModel3 == null) {
            h.f.b.l.a("stitchViewModel");
        }
        b.a.b(this, stitchIntroduceViewModel3, n.f130851a, new d(this));
        StitchIntroduceViewModel stitchIntroduceViewModel4 = this.f130831i;
        if (stitchIntroduceViewModel4 == null) {
            h.f.b.l.a("stitchViewModel");
        }
        b.a.b(this, stitchIntroduceViewModel4, i.f130846a, new e(this));
        StitchIntroduceViewModel stitchIntroduceViewModel5 = this.f130831i;
        if (stitchIntroduceViewModel5 == null) {
            h.f.b.l.a("stitchViewModel");
        }
        b.a.b(this, stitchIntroduceViewModel5, j.f130847a, new f(this));
        VideoEditViewModel videoEditViewModel2 = this.f130830h;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel2.f126135h.observe(this, new C3412g(this));
        VideoEditViewModel videoEditViewModel3 = this.f130830h;
        if (videoEditViewModel3 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel3.f126138k.observe(this, new h(this));
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

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.n.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.stitch.g.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f130840a;

                static {
                    Covode.recordClassIndex(85741);
                }

                {
                    this.f130840a = r1;
                }

                public final void run() {
                    g gVar = this.f130840a.this$0;
                    if (gVar.f42913m != null) {
                        Activity activity = gVar.f42913m;
                        if ((activity == null || !activity.isFinishing()) && gVar.n != null) {
                            View c2 = gVar.c(R.id.ffa);
                            h.f.b.l.b(c2, "");
                            Activity activity2 = gVar.f42913m;
                            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            new com.bytedance.tux.tooltip.a.b.a((androidx.fragment.app.e) activity2).e(R.string.b16).a(5000L).a(true).a(new p(gVar)).a(com.bytedance.tux.tooltip.h.TOP).b((com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a) c2).d().a();
                        }
                    }
                }
            });
            return h.z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.n.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.stitch.g.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f130841a;

                static {
                    Covode.recordClassIndex(85743);
                }

                {
                    this.f130841a = r1;
                }

                public final void run() {
                    g gVar = this.f130841a.this$0;
                    View c2 = gVar.c(R.id.eux);
                    h.f.b.l.b(c2, "");
                    new Rect();
                    Paint paint = new Paint();
                    h.f.b.l.b(gVar.t().getResources().getString(R.string.b15), "");
                    paint.setTextSize(com.bytedance.common.utility.n.b(gVar.f42913m, 13.0f));
                    Activity activity = gVar.f42913m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    new com.bytedance.tux.tooltip.a.b.a((androidx.fragment.app.e) activity).e(R.string.b15).a(5000L).a(true).a(com.bytedance.tux.tooltip.h.BOTTOM).b((TextView) c2).d().a();
                }
            });
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.n.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.stitch.g.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f130842a;

                static {
                    Covode.recordClassIndex(85745);
                }

                {
                    this.f130842a = r1;
                }

                public final void run() {
                    Activity activity = this.f130842a.this$0.f42913m;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            Activity activity = this.this$0.f42913m;
            if (activity != null) {
                activity.finish();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.aue, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a2;
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            if (!this.this$0.F().z()) {
                g.a(this.this$0).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                g gVar = this.this$0;
                gVar.e(gVar.F());
            }
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.G().p = true;
            g.a(this.this$0).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
            g gVar = this.this$0;
            gVar.d(gVar.F());
            g.b(this.this$0).a();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.f130828f = (CutVideoViewModel) a2;
        e(M());
        e((bm) this.y.getValue());
        e(E());
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(85749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            g gVar = this.this$0;
            Activity activity = gVar.f42913m;
            if (activity == null || !activity.isFinishing()) {
                CutVideoViewModel cutVideoViewModel = gVar.f130828f;
                if (cutVideoViewModel == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                StitchParams stitchParams = cutVideoViewModel.b().x;
                if (stitchParams == null) {
                    stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
                }
                z.e eVar = new z.e();
                CutVideoViewModel cutVideoViewModel2 = gVar.f130828f;
                if (cutVideoViewModel2 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                eVar.element = (T) cutVideoViewModel2.b().f125560i;
                if (eVar.element == null) {
                    eVar.element = (T) com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a();
                    CutVideoViewModel cutVideoViewModel3 = gVar.f130828f;
                    if (cutVideoViewModel3 == null) {
                        h.f.b.l.a("cutVideoViewModel");
                    }
                    cutVideoViewModel3.b().f125560i = eVar.element;
                }
                String musicPath = stitchParams.getMusicPath();
                if (musicPath != null && com.ss.android.ugc.aweme.video.e.b(musicPath)) {
                    eVar.element.a(musicPath);
                }
                gVar.G().a((Workspace) eVar.element, (BackgroundVideoCompileConfigure) null, false, (com.ss.android.ugc.aweme.shortvideo.cut.scene.c) new b(gVar, eVar, stitchParams), true);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
