package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ba;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.utils.ao;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class af extends com.ss.android.ugc.gamora.b.a implements com.bytedance.jedi.arch.b {
    public static final a z = new a((byte) 0);
    private CutVideoMultiModeViewModel A;
    private CutVideoListViewModel B;
    private CutVideoMultiBottomViewModel C;
    private CutVideoEditViewModel D;
    private View E;
    private final h.h F = h.i.a((h.f.a.a) new e(this));
    private final h.h G = h.i.a((h.f.a.a) new n(this));
    private final h.h H = h.i.a((h.f.a.a) new o(this));
    private final h.h I = h.i.a((h.f.a.a) new l(this));
    private final h.h J = h.i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public ba f125565f;

    /* renamed from: g  reason: collision with root package name */
    public VECutVideoPresenter f125566g;

    /* renamed from: h  reason: collision with root package name */
    public bs f125567h;

    /* renamed from: i  reason: collision with root package name */
    public CutVideoViewModel f125568i;

    /* renamed from: j  reason: collision with root package name */
    public VideoEditViewModel f125569j;

    /* renamed from: k  reason: collision with root package name */
    public VEVideoCutterViewModel f125570k;

    /* renamed from: l  reason: collision with root package name */
    CutVideoPreviewViewModel f125571l;
    public CutVideoStickerPointMusicViewModel t;
    public View u;
    public View v;
    public View w;
    public boolean x;
    public boolean y;

    static {
        Covode.recordClassIndex(82451);
    }

    public final ag G() {
        return (ag) this.F.getValue();
    }

    public final n H() {
        return (n) this.G.getValue();
    }

    public final s I() {
        return (s) this.H.getValue();
    }

    public final bf J() {
        return (bf) this.I.getValue();
    }

    public final e K() {
        return (e) this.J.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82452);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public static final class d implements av {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125573a;

        static {
            Covode.recordClassIndex(82455);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.av
        public final void a() {
            this.f125573a.b(false);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.av
        public final void b() {
            ba baVar = this.f125573a.f125565f;
            if (baVar == null) {
                h.f.b.l.b();
            }
            baVar.g();
            this.f125573a.b(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(af afVar) {
            this.f125573a = afVar;
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

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125572a;

        static {
            Covode.recordClassIndex(82454);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g
        public final void a() {
            af.b(this.f125572a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g
        public final List<VideoSegment> c() {
            List<VideoSegment> k2 = af.a(this.f125572a).k();
            h.f.b.l.b(k2, "");
            return k2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g
        public final void b() {
            this.f125572a.E().a((List<? extends VideoSegment>) af.a(this.f125572a).k(), false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(af afVar) {
            this.f125572a = afVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g
        public final void a(List<? extends VideoSegment> list) {
            this.f125572a.E().a(list, af.a(this.f125572a).k().size());
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g
        public final void a(boolean z, boolean z2) {
            int i2;
            VECutVideoPresenter E = this.f125572a.E();
            E.f125348c = z;
            E.f125356k.f126022c = z;
            com.ss.android.ugc.aweme.shortvideo.cut.j jVar = E.f125351f;
            if (jVar != null) {
                jVar.d(z);
            }
            E.f125357l.f129509b = z;
            if (z2) {
                this.f125572a.E().a(af.a(this.f125572a).k(), !z);
            }
            s I = this.f125572a.I();
            FrameLayout frameLayout = I.t;
            if (frameLayout == null) {
                h.f.b.l.a("recyclerViewLayout");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                i2 = (int) com.bytedance.common.utility.n.b(I.f42913m, 37.0f);
            } else {
                i2 = 0;
            }
            layoutParams2.bottomMargin = i2;
            if (z) {
                this.f125572a.I().T = false;
                z zVar = this.f125572a.I().f125827a;
                if (zVar == null) {
                    h.f.b.l.b();
                }
                zVar.f126300b = 0;
                StickPointVideoSegView stickPointVideoSegView = this.f125572a.I().f125834h;
                if (stickPointVideoSegView == null) {
                    h.f.b.l.a("stickPointVideoTitleView");
                }
                stickPointVideoSegView.setVisibility(0);
                af afVar = this.f125572a;
                afVar.e(afVar.J());
                af afVar2 = this.f125572a;
                afVar2.d(afVar2.K());
                af afVar3 = this.f125572a;
                afVar3.d(afVar3.H());
                af afVar4 = this.f125572a;
                afVar4.d(afVar4.I());
                this.f125572a.H().a(true);
                return;
            }
            if (z2) {
                VECutVideoPresenter E2 = this.f125572a.E();
                androidx.core.g.e<Long, Long> playBoundary = this.f125572a.H().b().getPlayBoundary();
                h.f.b.l.b(playBoundary, "");
                E2.a(playBoundary);
                VEVideoCutterViewModel b2 = af.b(this.f125572a);
                F f2 = this.f125572a.H().b().getPlayBoundary().f2397a;
                if (f2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(f2, "");
                b2.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(f2.longValue(), x.f.EDITOR_SEEK_FLAG_LastSeek));
            } else {
                af.b(this.f125572a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
            }
            s I2 = this.f125572a.I();
            CutVideoViewModel cutVideoViewModel = this.f125572a.f125568i;
            if (cutVideoViewModel == null) {
                h.f.b.l.a("cutVideoViewModel");
            }
            I2.T = cutVideoViewModel.h();
            StickPointVideoSegView stickPointVideoSegView2 = this.f125572a.I().f125834h;
            if (stickPointVideoSegView2 == null) {
                h.f.b.l.a("stickPointVideoTitleView");
            }
            stickPointVideoSegView2.setVisibility(8);
            af afVar5 = this.f125572a;
            afVar5.e(afVar5.K());
            this.f125572a.H().a(false);
            af afVar6 = this.f125572a;
            afVar6.e(afVar6.H());
            af afVar7 = this.f125572a;
            afVar7.e(afVar7.I());
            af afVar8 = this.f125572a;
            afVar8.d(afVar8.J());
        }
    }

    public final VECutVideoPresenter E() {
        VECutVideoPresenter vECutVideoPresenter = this.f125566g;
        if (vECutVideoPresenter == null) {
            h.f.b.l.a("presenter");
        }
        return vECutVideoPresenter;
    }

    public final bs F() {
        bs bsVar = this.f125567h;
        if (bsVar == null) {
            h.f.b.l.a("previewEditCallback");
        }
        return bsVar;
    }

    public final boolean N() {
        ba baVar = this.f125565f;
        if (baVar == null) {
            return false;
        }
        return baVar.g();
    }

    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h P() {
        return H().b();
    }

    static final class e extends h.f.b.m implements h.f.a.a<ag> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ag invoke() {
            ag agVar = new ag();
            ba baVar = this.this$0.f125565f;
            if (baVar == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(baVar, "");
            agVar.f125586a = baVar;
            this.this$0.a(R.id.cn8, agVar, "CutVideoMultiModeScene");
            return agVar;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<bf> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bf invoke() {
            bf bfVar = new bf();
            ba baVar = this.this$0.f125565f;
            if (baVar == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(baVar, "");
            bfVar.f125709a = baVar;
            this.this$0.a(R.id.asx, bfVar, "CutVideoStickerPointScene");
            return bfVar;
        }
    }

    public final void M() {
        Activity activity = this.f42913m;
        if (activity != null) {
            activity.finish();
        }
        ba baVar = this.f125565f;
        if (baVar != null) {
            cr.a().a(baVar.f125677h);
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        ba baVar = this.f125565f;
        if (baVar != null) {
            if (baVar.x && !baVar.y) {
                baVar.f125672c.c();
            }
            baVar.x = false;
            baVar.y = false;
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        ba baVar = this.f125565f;
        if (baVar != null) {
            if (baVar.f125672c.a()) {
                baVar.x = true;
            }
            baVar.f125672c.b();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            e eVar = new e();
            eVar.a(this.this$0.E());
            eVar.f125751a = this.this$0.f125565f;
            eVar.a(this.this$0.F());
            this.this$0.a(R.id.epi, eVar, "CutVideoBottomBarScene");
            return eVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125584a;

        static {
            Covode.recordClassIndex(82465);
        }

        m(af afVar) {
            this.f125584a = afVar;
        }

        public final void run() {
            Activity t = this.f125584a.t();
            h.f.b.l.b(t, "");
            View startSlide = this.f125584a.H().b().getStartSlide();
            h.f.b.l.b(startSlide, "");
            ao.a(t, startSlide, true);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            n nVar = new n(false, true, 1);
            nVar.a(this.this$0.E());
            nVar.f125791a = this.this$0.f125565f;
            this.this$0.a(R.id.epi, nVar, "CutVideoEditScene");
            return nVar;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<s> {
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(af afVar) {
            super(0);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            s sVar = new s();
            VECutVideoPresenter E = this.this$0.E();
            h.f.b.l.d(E, "");
            sVar.f125829c = E;
            bs F = this.this$0.F();
            h.f.b.l.d(F, "");
            sVar.f125831e = F;
            sVar.f125828b = this.this$0.f125565f;
            this.this$0.a(R.id.asx, sVar, "CutVideoListScene");
            return sVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.b $onEnd;
        final /* synthetic */ boolean $toNormal;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(82459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(af afVar, boolean z, h.f.a.b bVar) {
            super(0);
            this.this$0 = afVar;
            this.$toNormal = z;
            this.$onEnd = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (this.$toNormal) {
                af.c(this.this$0).b(false);
            } else {
                View view = this.this$0.u;
                if (view == null) {
                    h.f.b.l.a("normalModeView");
                }
                view.setVisibility(8);
                af.d(this.this$0).setVisibility(8);
            }
            if (!this.$toNormal) {
                af.c(this.this$0).a(true);
                ba baVar = this.this$0.f125565f;
                if (baVar != null) {
                    baVar.f();
                }
            }
            h.f.a.b bVar = this.$onEnd;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.$toNormal));
            }
            return h.z.f158842a;
        }
    }

    public final void L() {
        List<VideoSegment> videoSegmentList;
        if (ao.a(true)) {
            if (com.ss.android.ugc.aweme.shortvideo.edit.c.b.a() || P().getMaxCutDuration() < 60000) {
                VideoEditViewModel videoEditViewModel = this.f125569j;
                if (videoEditViewModel == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                t<CutVideoContext> tVar = videoEditViewModel.w;
                h.f.b.l.b(tVar, "");
                CutVideoContext value = tVar.getValue();
                if (value != null && (videoSegmentList = value.getVideoSegmentList()) != null) {
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) videoSegmentList, 10));
                    Iterator<T> it = videoSegmentList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().f125478b));
                    }
                    if (h.a.n.v(arrayList) > 60000) {
                        H().b().post(new m(this));
                    }
                }
            }
        }
    }

    public final com.ss.android.ugc.aweme.shortvideo.ac.a O() {
        ba baVar = this.f125565f;
        if (baVar == null) {
            return null;
        }
        if (baVar.q == null) {
            baVar.q = new com.ss.android.ugc.aweme.shortvideo.ac.a();
        }
        com.ss.android.ugc.aweme.shortvideo.ac.a aVar = baVar.q;
        List<VideoSegment> c2 = baVar.c();
        if (aVar != null && !com.ss.android.ugc.tools.utils.k.a(c2)) {
            if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125942a)) {
                aVar.setAiCutId(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125942a);
            }
            if (c2 == null) {
                h.f.b.l.b();
            }
            aVar.setVideoCount(Integer.valueOf(c2.size()));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            for (T t2 : c2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t3 = t2;
                sb.append(t3.f125478b);
                sb2.append(t3.d());
                t3.e();
                t3.d();
                if (i2 < c2.size() - 1) {
                    sb.append(",");
                    sb2.append(",");
                }
                i2 = i3;
            }
            aVar.setVideoCutLenListStr(sb.toString());
            aVar.setVideoSrcLenListStr(sb.toString());
            aVar.setVideoCutStartTimeListStr(sb2.toString());
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125942a = null;
        return baVar.q;
    }

    public static final class f implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125574a;

        static {
            Covode.recordClassIndex(82457);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(af afVar) {
            this.f125574a = afVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(82458);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    this.this$0.f125574a.L();
                }
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a
        public final void a(int i2) {
            if (i2 == 1) {
                if (!this.f125574a.x) {
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(af.a(this.f125574a).k());
                    this.f125574a.x = true;
                }
                this.f125574a.a(false, (h.f.a.b<? super Boolean, h.z>) null);
                return;
            }
            if (!this.f125574a.y) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.b(af.a(this.f125574a).k());
                this.f125574a.y = true;
            }
            this.f125574a.a(true, (h.f.a.b<? super Boolean, h.z>) new a(this));
        }
    }

    public static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125575a;

        static {
            Covode.recordClassIndex(82460);
        }

        h(af afVar) {
            this.f125575a = afVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(af.a(this.f125575a).k(), "exit_clip_popup_cancel", this.f125575a.N());
        }
    }

    public static final /* synthetic */ VideoEditViewModel a(af afVar) {
        VideoEditViewModel videoEditViewModel = afVar.f125569j;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final /* synthetic */ VEVideoCutterViewModel b(af afVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = afVar.f125570k;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    public static final /* synthetic */ CutVideoStickerPointMusicViewModel c(af afVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = afVar.t;
        if (cutVideoStickerPointMusicViewModel == null) {
            h.f.b.l.a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    public static final /* synthetic */ View d(af afVar) {
        View view = afVar.v;
        if (view == null) {
            h.f.b.l.a("topVideoEditView");
        }
        return view;
    }

    public static final /* synthetic */ View e(af afVar) {
        View view = afVar.w;
        if (view == null) {
            h.f.b.l.a("editPanelView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f125583b;

        static {
            Covode.recordClassIndex(82463);
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            super.onAnimationEnd(animator);
            af.d(this.f125582a).setVisibility(8);
            this.f125583b.height = -2;
            af.e(this.f125582a).setLayoutParams(this.f125583b);
        }

        k(af afVar, LinearLayout.LayoutParams layoutParams) {
            this.f125582a = afVar;
            this.f125583b = layoutParams;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f125578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f125579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinearLayout.LayoutParams f125580d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f125581e;

        static {
            Covode.recordClassIndex(82462);
        }

        j(af afVar, int i2, float f2, LinearLayout.LayoutParams layoutParams, boolean z) {
            this.f125577a = afVar;
            this.f125578b = i2;
            this.f125579c = f2;
            this.f125580d = layoutParams;
            this.f125581e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f125578b;
            float f2 = (floatValue - ((float) i2)) / (this.f125579c - ((float) i2));
            this.f125580d.height = (int) floatValue;
            af.e(this.f125577a).setLayoutParams(this.f125580d);
            if (this.f125581e) {
                af.d(this.f125577a).setAlpha(f2);
            } else {
                af.d(this.f125577a).setAlpha(1.0f - f2);
            }
        }
    }

    public final void b(boolean z2) {
        int i2;
        float dimension;
        ba baVar = this.f125565f;
        if (baVar == null) {
            h.f.b.l.b();
        }
        boolean g2 = baVar.g();
        if (g2) {
            View view = this.w;
            if (view == null) {
                h.f.b.l.a("editPanelView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View view2 = this.w;
            if (view2 == null) {
                h.f.b.l.a("editPanelView");
            }
            int height = view2.getHeight();
            if (z2) {
                View view3 = this.v;
                if (view3 == null) {
                    h.f.b.l.a("topVideoEditView");
                }
                view3.setAlpha(0.0f);
                View view4 = this.v;
                if (view4 == null) {
                    h.f.b.l.a("topVideoEditView");
                }
                view4.setVisibility(0);
                dimension = t().getResources().getDimension(R.dimen.qt);
            } else {
                dimension = t().getResources().getDimension(R.dimen.sy);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) height, dimension);
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new j(this, height, dimension, layoutParams2, z2));
            if (!z2) {
                ofFloat.addListener(new k(this, layoutParams2));
            }
            ofFloat.start();
        } else {
            View view5 = this.u;
            if (view5 == null) {
                h.f.b.l.a("normalModeView");
            }
            if (z2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            view5.setVisibility(i2);
        }
        if (g2) {
            if (z2) {
                CutVideoListViewModel cutVideoListViewModel = this.B;
                if (cutVideoListViewModel == null) {
                    h.f.b.l.a("videoListViewModel");
                }
                cutVideoListViewModel.b();
                CutVideoListViewModel cutVideoListViewModel2 = this.B;
                if (cutVideoListViewModel2 == null) {
                    h.f.b.l.a("videoListViewModel");
                }
                cutVideoListViewModel2.c(new CutVideoListViewModel.j(g2));
                return;
            }
            CutVideoListViewModel cutVideoListViewModel3 = this.B;
            if (cutVideoListViewModel3 == null) {
                h.f.b.l.a("videoListViewModel");
            }
            cutVideoListViewModel3.a();
            CutVideoListViewModel cutVideoListViewModel4 = this.B;
            if (cutVideoListViewModel4 == null) {
                h.f.b.l.a("videoListViewModel");
            }
            cutVideoListViewModel4.c(new CutVideoListViewModel.d(g2));
        } else if (z2) {
            CutVideoListViewModel cutVideoListViewModel5 = this.B;
            if (cutVideoListViewModel5 == null) {
                h.f.b.l.a("videoListViewModel");
            }
            cutVideoListViewModel5.a(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.A;
            if (cutVideoMultiModeViewModel == null) {
                h.f.b.l.a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.g();
        } else {
            CutVideoListViewModel cutVideoListViewModel6 = this.B;
            if (cutVideoListViewModel6 == null) {
                h.f.b.l.a("videoListViewModel");
            }
            cutVideoListViewModel6.a(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.A;
            if (cutVideoMultiModeViewModel2 == null) {
                h.f.b.l.a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel2.b();
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        Serializable serializable;
        Intent intent;
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        List<com.ss.android.ugc.aweme.shortvideo.c> list = null;
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a2, "");
        this.f125569j = (VideoEditViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a3, "");
        this.f125570k = (VEVideoCutterViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoPreviewViewModel.class);
        h.f.b.l.b(a4, "");
        this.f125571l = (CutVideoPreviewViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity4).a(CutVideoStickerPointMusicViewModel.class);
        h.f.b.l.b(a5, "");
        this.t = (CutVideoStickerPointMusicViewModel) a5;
        CutVideoViewModel cutVideoViewModel = this.f125568i;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.i()) {
            e(G());
            G().f125587b = new f(this);
            e(J());
            if (G().a().getCurrentMode() == 2) {
                L();
            }
        } else {
            e(K());
            e(H());
            e(I());
            L();
        }
        CutVideoViewModel cutVideoViewModel2 = this.f125568i;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.i()) {
            this.x = true;
            View c2 = c(R.id.vr);
            h.f.b.l.b(c2, "");
            this.E = c2;
            View c3 = c(R.id.cwd);
            h.f.b.l.b(c3, "");
            this.u = c3;
            View c4 = c(R.id.epi);
            h.f.b.l.b(c4, "");
            this.v = c4;
            View c5 = c(R.id.asx);
            h.f.b.l.b(c5, "");
            this.w = c5;
            ba baVar = this.f125565f;
            if (baVar != null) {
                Activity t2 = t();
                Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) t2;
                h.f.b.l.d(eVar, "");
                JediViewModel a6 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoStickerPointMusicViewModel.class);
                h.f.b.l.b(a6, "");
                baVar.t = (CutVideoStickerPointMusicViewModel) a6;
                JediViewModel a7 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoMultiModeViewModel.class);
                h.f.b.l.b(a7, "");
                baVar.u = (CutVideoMultiModeViewModel) a7;
                JediViewModel a8 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoBottomBarViewModel.class);
                h.f.b.l.b(a8, "");
                baVar.v = (CutVideoBottomBarViewModel) a8;
                JediViewModel a9 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoEditViewModel.class);
                h.f.b.l.b(a9, "");
                baVar.w = (CutVideoEditViewModel) a9;
                baVar.f125675f.a(eVar);
                baVar.f125675f.a(new ba.b(baVar, eVar));
                baVar.f125672c.a(new ba.c(baVar));
                baVar.f125681l = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.m();
                baVar.n = new ba.d(baVar);
                baVar.f125677h = cr.a().f125295a;
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel = baVar.v;
                if (cutVideoBottomBarViewModel == null) {
                    h.f.b.l.a("bottomBarViewModel");
                }
                f.a.b.b unused = cutVideoBottomBarViewModel.a(eVar, bb.f125689a, new ah(), new ba.e(baVar));
                CutVideoEditViewModel cutVideoEditViewModel = baVar.w;
                if (cutVideoEditViewModel == null) {
                    h.f.b.l.a("cutVideoEditViewModel");
                }
                f.a.b.b unused2 = cutVideoEditViewModel.a(eVar, bc.f125690a, new ah(), new ba.f(baVar));
            }
            ba baVar2 = this.f125565f;
            if (baVar2 != null) {
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a b2 = H().b();
                h.f.b.l.d(b2, "");
                baVar2.o = b2;
            }
            Activity activity5 = this.f42913m;
            if (activity5 == null || (intent = activity5.getIntent()) == null) {
                serializable = null;
            } else {
                serializable = intent.getSerializableExtra("extra_stickpoint_music_list");
            }
            ba baVar3 = this.f125565f;
            if (baVar3 != null) {
                if (serializable != null) {
                    list = h.a.n.g((Collection) ((List) serializable));
                }
                baVar3.f125682m = list;
                bw bwVar = baVar3.f125670a;
                if (bwVar == null) {
                    h.f.b.l.a("musicViewController");
                }
                bwVar.a(list);
            }
            ba baVar4 = this.f125565f;
            if (baVar4 != null) {
                baVar4.f125674e = new c(this);
            }
            bs bsVar = this.f125567h;
            if (bsVar == null) {
                h.f.b.l.a("previewEditCallback");
            }
            ba baVar5 = this.f125565f;
            if (baVar5 == null) {
                h.f.b.l.b();
            }
            bsVar.a(baVar5);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.A;
            if (cutVideoMultiModeViewModel == null) {
                h.f.b.l.a("videoMultiModeViewModel");
            }
            Activity activity6 = this.f42913m;
            Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            cutVideoMultiModeViewModel.a((androidx.fragment.app.e) activity6, true);
            View view = this.u;
            if (view == null) {
                h.f.b.l.a("normalModeView");
            }
            view.setVisibility(8);
            View view2 = this.v;
            if (view2 == null) {
                h.f.b.l.a("topVideoEditView");
            }
            view2.setVisibility(8);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.t;
            if (cutVideoStickerPointMusicViewModel == null) {
                h.f.b.l.a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.b(true);
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.t;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                h.f.b.l.a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.a(true);
            ba baVar6 = this.f125565f;
            if (baVar6 != null) {
                baVar6.f();
            }
            G().a().measure(dh.b(this.f42913m), dh.a(this.f42913m));
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f125571l;
            if (cutVideoPreviewViewModel == null) {
                h.f.b.l.a("previewViewModel");
            }
            cutVideoPreviewViewModel.c(new CutVideoPreviewViewModel.d(G().a().getMeasuredHeight()));
            I().U = new d(this);
            return;
        }
        this.y = true;
        VideoEditViewModel videoEditViewModel = this.f125569j;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.b(videoEditViewModel.k());
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f125576a;

        static {
            Covode.recordClassIndex(82461);
        }

        i(af afVar) {
            this.f125576a = afVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f125576a.M();
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(af.a(this.f125576a).k(), "exit_clip_popup_confirm", this.f125576a.N());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, h.f.a.b<? super Boolean, h.z> bVar) {
        View view = this.u;
        if (view == null) {
            h.f.b.l.a("normalModeView");
        }
        view.setVisibility(0);
        View view2 = this.v;
        if (view2 == null) {
            h.f.b.l.a("topVideoEditView");
        }
        view2.setVisibility(0);
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.t;
        if (cutVideoStickerPointMusicViewModel == null) {
            h.f.b.l.a("musicViewModel");
        }
        cutVideoStickerPointMusicViewModel.b(true);
        hx.a(200, new g(this, z2, bVar));
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        CutVideoViewModel cutVideoViewModel = this.f125568i;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.i()) {
            this.f125565f = new ba();
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.A;
            if (cutVideoMultiModeViewModel == null) {
                h.f.b.l.a("videoMultiModeViewModel");
            }
            ba baVar = this.f125565f;
            if (baVar == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(baVar, "");
            cutVideoMultiModeViewModel.f125537b = baVar;
            CutVideoListViewModel cutVideoListViewModel = this.B;
            if (cutVideoListViewModel == null) {
                h.f.b.l.a("videoListViewModel");
            }
            ba baVar2 = this.f125565f;
            if (baVar2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(baVar2, "");
            cutVideoListViewModel.f125529c = baVar2;
        }
        CutVideoViewModel cutVideoViewModel2 = this.f125568i;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.i()) {
            d(G());
            d(J());
            d(K());
            d(H());
            d(I());
            return;
        }
        e(K());
        e(H());
        e(I());
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.f125568i = (CutVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity2).a(CutVideoMultiModeViewModel.class);
        h.f.b.l.b(a3, "");
        this.A = (CutVideoMultiModeViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoListViewModel.class);
        h.f.b.l.b(a4, "");
        this.B = (CutVideoListViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity4).a(CutVideoMultiBottomViewModel.class);
        h.f.b.l.b(a5, "");
        this.C = (CutVideoMultiBottomViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity5).a(CutVideoEditViewModel.class);
        h.f.b.l.b(a6, "");
        this.D = (CutVideoEditViewModel) a6;
        CutVideoViewModel cutVideoViewModel = this.f125568i;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.i()) {
            View a7 = com.a.a(layoutInflater, R.layout.ask, viewGroup, false);
            Objects.requireNonNull(a7, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) a7;
        }
        View a8 = com.a.a(layoutInflater, R.layout.asj, viewGroup, false);
        Objects.requireNonNull(a8, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a8;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
