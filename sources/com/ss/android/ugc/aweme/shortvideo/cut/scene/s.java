package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
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
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointSingleVideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.z;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class s extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {
    public static final a W = new a((byte) 0);
    public CutVideoTitleBarViewModel A;
    public CutVideoEditViewModel B;
    public CutVideoListViewModel C;
    public CutVideoStickerPointMusicViewModel D;
    public CutVideoMultiModeViewModel E;
    public long F;
    public final bv G = new bl();
    public boolean H;
    public boolean I;
    float J = 1.0f;
    float K;
    float L;
    public View M;
    public androidx.core.g.e<Integer, Integer> N;
    public AnimatorSet O;
    public boolean P;
    public int Q;
    public boolean R = true;
    public boolean S;
    public boolean T = true;
    public av U;
    public com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c V;
    private CutVideoViewModel X;
    private CutVideoPreviewViewModel Y;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.z f125827a;

    /* renamed from: b  reason: collision with root package name */
    public ba f125828b;

    /* renamed from: c  reason: collision with root package name */
    public VECutVideoPresenter f125829c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f125830d;

    /* renamed from: e  reason: collision with root package name */
    public bs f125831e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f125832f;

    /* renamed from: g  reason: collision with root package name */
    public View f125833g;

    /* renamed from: h  reason: collision with root package name */
    public StickPointVideoSegView f125834h;

    /* renamed from: i  reason: collision with root package name */
    FrameLayout f125835i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f125836j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f125837k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f125838l;
    public FrameLayout t;
    public StickPointSingleVideoEditView u;
    public CutMultiVideoViewModel v;
    public VideoEditViewModel w;
    public VEVideoCutterViewModel x;
    public CutVideoSpeedViewModel y;
    public CutVideoBottomBarViewModel z;

    static {
        Covode.recordClassIndex(82657);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {
        static {
            Covode.recordClassIndex(82663);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
        }

        b() {
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public final bs b() {
        bs bsVar = this.f125831e;
        if (bsVar == null) {
            h.f.b.l.a("previewEditCallback");
        }
        return bsVar;
    }

    public final boolean d() {
        ba baVar = this.f125828b;
        if (baVar == null) {
            return false;
        }
        return baVar.g();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.V != null) {
            com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c cVar = this.V;
            if (cVar == null) {
                h.f.b.l.a("cutVideoListViewHolder");
            }
            cVar.a();
        }
    }

    static final class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125863a;

        static {
            Covode.recordClassIndex(82689);
        }

        x(s sVar) {
            this.f125863a = sVar;
        }

        public final void run() {
            int i2;
            Resources resources = this.f125863a.t().getResources();
            if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d) {
                i2 = R.string.b28;
            } else {
                i2 = R.string.g7u;
            }
            String string = resources.getString(i2);
            h.f.b.l.b(string, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f125863a.f42913m).a(string).a();
        }
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.f125830d;
        if (recyclerView == null) {
            h.f.b.l.a("videoRecyclerView");
        }
        return recyclerView;
    }

    public static final class aa implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f125840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f125841c;

        static {
            Covode.recordClassIndex(82659);
        }

        public final boolean onPreDraw() {
            View view;
            View rootView = s.k(this.f125839a).getRootView();
            h.f.b.l.b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView a2 = this.f125839a.a();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ObjectAnimator.ofFloat(a2, "alpha", 1.0f, 0.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(300L);
            animatorSet2.play(ObjectAnimator.ofFloat(s.k(this.f125839a), "alpha", 0.0f, 1.0f));
            s sVar = this.f125839a;
            RecyclerView.ViewHolder f2 = sVar.a().f(this.f125840b);
            if (f2 != null) {
                view = f2.itemView;
            } else {
                view = null;
            }
            sVar.M = view;
            s sVar2 = this.f125839a;
            sVar2.N = com.ss.android.ugc.aweme.ba.d.a(sVar2.a());
            if (!(this.f125841c == null || this.f125839a.M == null)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorSet);
                arrayList.add(animatorSet2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300L);
                animatorSet3.play(ObjectAnimator.ofFloat(s.l(this.f125839a), "alpha", 1.0f, 0.0f));
                arrayList.add(animatorSet3);
                s sVar3 = this.f125839a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new a(this, arrayList));
                sVar3.O = animatorSet4;
                AnimatorSet animatorSet5 = this.f125839a.O;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
            }
            return false;
        }

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ aa f125842a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f125843b;

            static {
                Covode.recordClassIndex(82660);
            }

            public final void onAnimationEnd(Animator animator) {
                h.f.b.l.d(animator, "");
                super.onAnimationEnd(animator);
                Activity activity = this.f125842a.f125839a.f42913m;
                if (activity == null || !activity.isFinishing()) {
                    s.e(this.f125842a.f125839a).a(true);
                    if (this.f125842a.f125839a.d()) {
                        s.a(this.f125842a.f125839a).b(false);
                    } else {
                        this.f125842a.f125839a.a().setVisibility(8);
                    }
                    s.f(this.f125842a.f125839a).setVisibility(0);
                    s.g(this.f125842a.f125839a).setVisibility(0);
                    s.k(this.f125842a.f125839a).setVisibility(0);
                    s.m(this.f125842a.f125839a).setVisibility(4);
                    s.l(this.f125842a.f125839a).setVisibility(4);
                    com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125842a.f125839a.f125827a;
                    if (zVar == null) {
                        h.f.b.l.b();
                    }
                    zVar.f126302d = false;
                    s.n(this.f125842a.f125839a).a(this.f125842a.f125839a.b().L().getSelectedTime());
                }
            }

            a(aa aaVar, ArrayList arrayList) {
                this.f125842a = aaVar;
                this.f125843b = arrayList;
            }
        }

        aa(s sVar, int i2, Rect rect) {
            this.f125839a = sVar;
            this.f125840b = i2;
            this.f125841c = rect;
        }
    }

    public static final class ab implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f125845b;

        static {
            Covode.recordClassIndex(82661);
        }

        public final boolean onPreDraw() {
            int i2;
            View rootView = this.f125844a.a().getRootView();
            h.f.b.l.b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (!(this.f125844a.M == null || this.f125844a.N == null)) {
                RecyclerView a2 = this.f125844a.a();
                ArrayList arrayList = new ArrayList();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.play(ObjectAnimator.ofFloat(a2, "alpha", 0.0f, 1.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(300L);
                animatorSet2.play(ObjectAnimator.ofFloat(s.k(this.f125844a), "alpha", 0.0f, 1.0f));
                arrayList.add(animatorSet2);
                arrayList.add(animatorSet);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(300L);
                animatorSet3.play(ObjectAnimator.ofFloat(s.l(this.f125844a), "alpha", 0.0f, 1.0f));
                arrayList.add(animatorSet3);
                s sVar = this.f125844a;
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(arrayList);
                animatorSet4.addListener(new a(this, arrayList));
                sVar.O = animatorSet4;
                AnimatorSet animatorSet5 = this.f125844a.O;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125844a.f125827a;
                if (zVar == null) {
                    h.f.b.l.b();
                }
                if (this.f125844a.d()) {
                    i2 = s.a(this.f125844a).f125527a;
                } else {
                    i2 = 0;
                }
                zVar.f126300b = i2;
            }
            return false;
        }

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ab f125846a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f125847b;

            static {
                Covode.recordClassIndex(82662);
            }

            public final void onAnimationEnd(Animator animator) {
                h.f.b.l.d(animator, "");
                super.onAnimationEnd(animator);
                Activity activity = this.f125846a.f125844a.f42913m;
                if (activity == null || !activity.isFinishing()) {
                    s.e(this.f125846a.f125844a).a(true);
                    s.k(this.f125846a.f125844a).setVisibility(8);
                    s.m(this.f125846a.f125844a).setVisibility(0);
                    if (this.f125846a.f125845b) {
                        VideoEditViewModel b2 = s.b(this.f125846a.f125844a);
                        String a2 = s.b(this.f125846a.f125844a).k().get(s.a(this.f125846a.f125844a).f125528b).a(true);
                        Iterator<VideoSegment> it = b2.w.getValue().getVideoSegmentList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            VideoSegment next = it.next();
                            if (next.a(true).equals(a2)) {
                                if (b2.y != null) {
                                    b2.y.b(next);
                                }
                                next.f125485i = true;
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125846a.f125844a.f125827a;
                    if (zVar == null) {
                        h.f.b.l.b();
                    }
                    zVar.f126302d = true;
                    s.n(this.f125846a.f125844a).a(this.f125846a.f125844a.b().L().getSelectedTime());
                    this.f125846a.f125844a.P = false;
                }
            }

            a(ab abVar, ArrayList arrayList) {
                this.f125846a = abVar;
                this.f125847b = arrayList;
            }
        }

        ab(s sVar, boolean z) {
            this.f125844a = sVar;
            this.f125845b = z;
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125851a;

        static {
            Covode.recordClassIndex(82665);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(s sVar) {
            this.f125851a = sVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            super.onAnimationEnd(animator);
            s.j(this.f125851a).setVisibility(8);
            s.j(this.f125851a).setTranslationY(0.0f);
        }
    }

    public static final class g implements VideoEditViewModel.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125854a;

        static {
            Covode.recordClassIndex(82668);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(s sVar) {
            this.f125854a = sVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.a
        public final void a(VideoSegment videoSegment) {
            com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125854a.f125827a;
            if (zVar != null) {
                zVar.a(videoSegment);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.a
        public final void b(VideoSegment videoSegment) {
            this.f125854a.F = System.currentTimeMillis();
            com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125854a.f125827a;
            if (zVar != null) {
                zVar.b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.s$s  reason: collision with other inner class name */
    static final class C3272s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125859a;

        static {
            Covode.recordClassIndex(82684);
        }

        C3272s(s sVar) {
            this.f125859a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f125859a.a(false, false);
        }
    }

    static final class t<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125860a;

        static {
            Covode.recordClassIndex(82685);
        }

        t(s sVar) {
            this.f125860a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f125860a.a(true, false);
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125861a;

        static {
            Covode.recordClassIndex(82686);
        }

        u(s sVar) {
            this.f125861a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f125861a.a(false, true);
        }
    }

    public static final class y implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125864a;

        static {
            Covode.recordClassIndex(82690);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(s sVar) {
            this.f125864a = sVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void b(View view) {
            ba baVar = this.f125864a.f125828b;
            if (baVar == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e eVar = baVar.f125675f;
            ba baVar2 = this.f125864a.f125828b;
            if (baVar2 == null) {
                h.f.b.l.b();
            }
            eVar.a(baVar2.b());
            com.ss.android.ugc.aweme.common.r.a("apply_smart_sync", com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().a("to_status", "on").f149193a);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void a(View view) {
            s.a(this.f125864a).c(false);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f125864a.A;
            if (cutVideoTitleBarViewModel == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.e(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f125864a.E;
            if (cutVideoMultiModeViewModel == null) {
                h.f.b.l.a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.b();
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f125864a.D;
            if (cutVideoStickerPointMusicViewModel == null) {
                h.f.b.l.a("stickPointMusicViewModel");
            }
            cutVideoStickerPointMusicViewModel.c(new CutVideoStickerPointMusicViewModel.d());
            s.a(this.f125864a).b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void a(List<? extends MediaModel> list) {
            if (com.ss.android.ugc.tools.utils.k.a(list)) {
                ba baVar = this.f125864a.f125828b;
                if (baVar == null) {
                    h.f.b.l.b();
                }
                if (baVar.x) {
                    ba baVar2 = this.f125864a.f125828b;
                    if (baVar2 == null) {
                        h.f.b.l.b();
                    }
                    baVar2.f125672c.c();
                    ba baVar3 = this.f125864a.f125828b;
                    if (baVar3 == null) {
                        h.f.b.l.b();
                    }
                    baVar3.x = false;
                    return;
                }
                return;
            }
            s sVar = this.f125864a;
            ArrayList arrayList = new ArrayList();
            ba baVar4 = sVar.f125828b;
            if (baVar4 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar = baVar4.f125674e;
            if (gVar == null) {
                h.f.b.l.b();
            }
            int size = gVar.c().size();
            if (list == null) {
                h.f.b.l.b();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                VideoSegment videoSegment = new VideoSegment((MediaModel) list.get(i2));
                videoSegment.f125477a = size;
                arrayList.add(videoSegment);
                size++;
            }
            sVar.G.a(arrayList);
            sVar.G.c();
            ba baVar5 = sVar.f125828b;
            if (baVar5 == null) {
                h.f.b.l.b();
            }
            baVar5.a().a(arrayList);
            ba baVar6 = sVar.f125828b;
            if (baVar6 == null) {
                h.f.b.l.b();
            }
            if (baVar6.f125674e != null) {
                ba baVar7 = sVar.f125828b;
                if (baVar7 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.g gVar2 = baVar7.f125674e;
                if (gVar2 == null) {
                    h.f.b.l.b();
                }
                gVar2.a(arrayList);
            }
            if (sVar.d()) {
                ba baVar8 = sVar.f125828b;
                if (baVar8 == null) {
                    h.f.b.l.b();
                }
                baVar8.f125672c.a(arrayList, size, new b());
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void c(View view) {
            String str;
            if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125946e.a(this.f125864a.f42913m, this.f125864a.G.a(), this.f125864a.G.b())) {
                ba baVar = this.f125864a.f125828b;
                if (baVar == null) {
                    h.f.b.l.b();
                }
                baVar.y = true;
                ba baVar2 = this.f125864a.f125828b;
                if (baVar2 == null) {
                    h.f.b.l.b();
                }
                if (baVar2.f125672c.a()) {
                    ba baVar3 = this.f125864a.f125828b;
                    if (baVar3 == null) {
                        h.f.b.l.b();
                    }
                    baVar3.x = true;
                }
                ba baVar4 = this.f125864a.f125828b;
                if (baVar4 == null) {
                    h.f.b.l.b();
                }
                baVar4.f125672c.b();
            }
            com.ss.android.ugc.tools.f.b a2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a().a("enter_from", "clip_edit_page");
            String str2 = "";
            if (h.f.b.l.a((Object) com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.f125961a, (Object) "comment_reply")) {
                str = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.f125963c;
            } else {
                str = str2;
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("reply_comment_id", str);
            if (h.f.b.l.a((Object) com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.f125961a, (Object) "comment_reply")) {
                str2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.f125964d;
            }
            com.ss.android.ugc.aweme.common.r.a("click_upload_entrance", a3.a("reply_user_id", str2).a("from_group_id", dv.a()).f149193a);
        }
    }

    public static final /* synthetic */ CutVideoListViewModel a(s sVar) {
        CutVideoListViewModel cutVideoListViewModel = sVar.C;
        if (cutVideoListViewModel == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    public static final /* synthetic */ VideoEditViewModel b(s sVar) {
        VideoEditViewModel videoEditViewModel = sVar.w;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final /* synthetic */ CutMultiVideoViewModel c(s sVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = sVar.v;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    public static final /* synthetic */ CutVideoEditViewModel d(s sVar) {
        CutVideoEditViewModel cutVideoEditViewModel = sVar.B;
        if (cutVideoEditViewModel == null) {
            h.f.b.l.a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    public static final /* synthetic */ CutVideoSpeedViewModel e(s sVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = sVar.y;
        if (cutVideoSpeedViewModel == null) {
            h.f.b.l.a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    public static final /* synthetic */ ImageView f(s sVar) {
        ImageView imageView = sVar.f125836j;
        if (imageView == null) {
            h.f.b.l.a("ivSave");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView g(s sVar) {
        ImageView imageView = sVar.f125837k;
        if (imageView == null) {
            h.f.b.l.a("ivCancel");
        }
        return imageView;
    }

    public static final /* synthetic */ StickPointVideoSegView h(s sVar) {
        StickPointVideoSegView stickPointVideoSegView = sVar.f125834h;
        if (stickPointVideoSegView == null) {
            h.f.b.l.a("stickPointVideoTitleView");
        }
        return stickPointVideoSegView;
    }

    public static final /* synthetic */ StickPointSingleVideoEditView i(s sVar) {
        StickPointSingleVideoEditView stickPointSingleVideoEditView = sVar.u;
        if (stickPointSingleVideoEditView == null) {
            h.f.b.l.a("singleVideoEditView");
        }
        return stickPointSingleVideoEditView;
    }

    public static final /* synthetic */ FrameLayout j(s sVar) {
        FrameLayout frameLayout = sVar.t;
        if (frameLayout == null) {
            h.f.b.l.a("recyclerViewLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TextView k(s sVar) {
        TextView textView = sVar.f125838l;
        if (textView == null) {
            h.f.b.l.a("singleEditTitle");
        }
        return textView;
    }

    public static final /* synthetic */ TextView l(s sVar) {
        TextView textView = sVar.f125832f;
        if (textView == null) {
            h.f.b.l.a("tvVideoSegmentDes");
        }
        return textView;
    }

    public static final /* synthetic */ View m(s sVar) {
        View view = sVar.f125833g;
        if (view == null) {
            h.f.b.l.a("animTabDot");
        }
        return view;
    }

    public static final /* synthetic */ CutVideoBottomBarViewModel n(s sVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = sVar.z;
        if (cutVideoBottomBarViewModel == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125852a;

        static {
            Covode.recordClassIndex(82666);
        }

        e(s sVar) {
            this.f125852a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f125852a.P) {
                this.f125852a.P = true;
                com.ss.android.ugc.aweme.port.in.g.a().I().a("click_edit_segments", (Map<String, String>) null);
                s.c(this.f125852a).d();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125853a;

        static {
            Covode.recordClassIndex(82667);
        }

        f(s sVar) {
            this.f125853a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f125853a.P) {
                this.f125853a.P = true;
                com.ss.android.ugc.aweme.port.in.g.a().I().a("click_edit_segments_return", (Map<String, String>) null);
                s.c(this.f125853a).c();
            }
        }
    }

    static final class q<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125858a;

        static {
            Covode.recordClassIndex(82682);
        }

        q(s sVar) {
            this.f125858a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                s.j(this.f125858a).setAlpha(1.0f);
                FrameLayout j2 = s.j(this.f125858a);
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                j2.setVisibility(i2);
            }
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f125849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f125850c;

        static {
            Covode.recordClassIndex(82664);
        }

        c(s sVar, boolean z, float f2) {
            this.f125848a = sVar;
            this.f125849b = z;
            this.f125850c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f125849b) {
                s.j(this.f125848a).setAlpha(floatValue);
                s.j(this.f125848a).setTranslationY(this.f125850c * (1.0f - floatValue));
                return;
            }
            s.j(this.f125848a).setAlpha(1.0f - floatValue);
            s.j(this.f125848a).setTranslationY(this.f125850c * floatValue);
        }
    }

    public final void a(boolean z2) {
        if (!this.S) {
            CutVideoEditViewModel cutVideoEditViewModel = this.B;
            if (cutVideoEditViewModel == null) {
                h.f.b.l.a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel.a(!z2);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.A;
            if (cutVideoTitleBarViewModel == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.d(!z2);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.A;
            if (cutVideoTitleBarViewModel2 == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.c(!z2);
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.Y;
            if (cutVideoPreviewViewModel == null) {
                h.f.b.l.a("previewViewModel");
            }
            cutVideoPreviewViewModel.a(!z2);
        }
    }

    static final class v<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125862a;

        static {
            Covode.recordClassIndex(82687);
        }

        v(s sVar) {
            this.f125862a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            com.ss.android.ugc.aweme.shortvideo.cut.model.f fVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.f) obj;
            if (fVar != null) {
                num = Integer.valueOf(fVar.f125510d);
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    if (this.f125862a.R) {
                        this.f125862a.Q = fVar.f125511e;
                        this.f125862a.a(true);
                        VEVideoCutterViewModel vEVideoCutterViewModel = this.f125862a.x;
                        if (vEVideoCutterViewModel == null) {
                            h.f.b.l.a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                    }
                    this.f125862a.R = false;
                } else if (num.intValue() != 1 && num.intValue() == 2) {
                    this.f125862a.a(false);
                    s sVar = this.f125862a;
                    int i2 = fVar.f125512f;
                    int i3 = this.f125862a.Q;
                    if (fVar.f125507a) {
                        bs bsVar = sVar.f125831e;
                        if (bsVar == null) {
                            h.f.b.l.a("previewEditCallback");
                        }
                        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h L = bsVar.L();
                        L.c();
                        VECutVideoPresenter vECutVideoPresenter = sVar.f125829c;
                        if (vECutVideoPresenter == null) {
                            h.f.b.l.a("presenter");
                        }
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n nVar = vECutVideoPresenter.f125356k;
                        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f125355j;
                        if (videoEditViewModel == null) {
                            h.f.b.l.a("videoEditViewModel");
                        }
                        List<VideoSegment> k2 = videoEditViewModel.k();
                        if (i3 != i2 && !com.ss.android.ugc.tools.utils.k.a(k2)) {
                            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = nVar.f126021b;
                            if (iVar != null) {
                                if (k2 == null) {
                                    h.f.b.l.b();
                                }
                                iVar.a(i3, i2, k2);
                            }
                            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = nVar.f126020a;
                            if (iVar2 != null) {
                                if (k2 == null) {
                                    h.f.b.l.b();
                                }
                                iVar2.a(i3, i2, k2);
                            }
                            if (nVar.f126022c) {
                                com.ss.android.ugc.aweme.shortvideo.cut.i iVar3 = nVar.f126021b;
                                if (iVar3 != null) {
                                    iVar3.a(i3, i2);
                                }
                            } else {
                                com.ss.android.ugc.aweme.shortvideo.cut.i iVar4 = nVar.f126020a;
                                if (iVar4 != null) {
                                    iVar4.a(i3, i2);
                                }
                            }
                        }
                        long j2 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            VideoEditViewModel videoEditViewModel2 = sVar.w;
                            if (videoEditViewModel2 == null) {
                                h.f.b.l.a("videoEditViewModel");
                            }
                            VideoSegment videoSegment = videoEditViewModel2.k().get(i4);
                            if (!videoSegment.f125485i) {
                                h.f.b.l.b(videoSegment, "");
                                float e2 = (float) (videoSegment.e() - videoSegment.d());
                                VideoEditViewModel videoEditViewModel3 = sVar.w;
                                if (videoEditViewModel3 == null) {
                                    h.f.b.l.a("videoEditViewModel");
                                }
                                j2 += (long) (e2 / (videoEditViewModel3.l() * videoSegment.f()));
                            }
                        }
                        if (j2 >= L.getMaxCutDuration()) {
                            j2 = 0;
                        } else if (j2 != 0) {
                            j2 += 30;
                        }
                        VECutVideoPresenter vECutVideoPresenter2 = sVar.f125829c;
                        if (vECutVideoPresenter2 == null) {
                            h.f.b.l.a("presenter");
                        }
                        androidx.core.g.e<Long, Long> playBoundary = L.getPlayBoundary();
                        h.f.b.l.b(playBoundary, "");
                        vECutVideoPresenter2.a(playBoundary);
                        VEVideoCutterViewModel vEVideoCutterViewModel2 = sVar.x;
                        if (vEVideoCutterViewModel2 == null) {
                            h.f.b.l.a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel2.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(j2, x.f.EDITOR_SEEK_FLAG_LastSeek));
                        L.getPlayBoundary();
                        VECutVideoPresenter vECutVideoPresenter3 = sVar.f125829c;
                        if (vECutVideoPresenter3 == null) {
                            h.f.b.l.a("presenter");
                        }
                        if (!vECutVideoPresenter3.b()) {
                            CutMultiVideoViewModel cutMultiVideoViewModel = sVar.v;
                            if (cutMultiVideoViewModel == null) {
                                h.f.b.l.a("cutMultiVideoViewModel");
                            }
                            VideoEditViewModel videoEditViewModel4 = sVar.w;
                            if (videoEditViewModel4 == null) {
                                h.f.b.l.a("videoEditViewModel");
                            }
                            List<VideoSegment> j3 = videoEditViewModel4.j();
                            VideoEditViewModel videoEditViewModel5 = sVar.w;
                            if (videoEditViewModel5 == null) {
                                h.f.b.l.a("videoEditViewModel");
                            }
                            cutMultiVideoViewModel.a(j2, j3, videoEditViewModel5.l());
                        }
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(sVar.d(), false, false, false, false, true);
                    } else {
                        VEVideoCutterViewModel vEVideoCutterViewModel3 = sVar.x;
                        if (vEVideoCutterViewModel3 == null) {
                            h.f.b.l.a("veVideoCutterViewModel");
                        }
                        vEVideoCutterViewModel3.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
                    }
                    if (this.f125862a.f125828b != null) {
                        CutVideoListViewModel a2 = s.a(this.f125862a);
                        Activity activity = this.f125862a.f42913m;
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                        int i5 = this.f125862a.Q;
                        int i6 = fVar.f125512f;
                        h.f.b.l.d(eVar, "");
                        JediViewModel a3 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoStickerPointMusicViewModel.class);
                        h.f.b.l.b(a3, "");
                        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = (CutVideoStickerPointMusicViewModel) a3;
                        bt btVar = a2.f125529c;
                        if (btVar == null) {
                            h.f.b.l.a("stickerPointController");
                        }
                        btVar.a(i5, i6, new CutVideoListViewModel.k(cutVideoStickerPointMusicViewModel));
                    }
                    this.f125862a.R = true;
                }
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        CutVideoViewModel cutVideoViewModel = this.X;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.i()) {
            y yVar = new y(this);
            StickPointVideoSegView stickPointVideoSegView = this.f125834h;
            if (stickPointVideoSegView == null) {
                h.f.b.l.a("stickPointVideoTitleView");
            }
            stickPointVideoSegView.setStickPointVideoSegListener(yVar);
            this.G.a(yVar);
            bv bvVar = this.G;
            RecyclerView recyclerView = this.f125830d;
            if (recyclerView == null) {
                h.f.b.l.a("videoRecyclerView");
            }
            bvVar.a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e) recyclerView.getAdapter());
            ArrayList<String> a2 = this.G.a();
            if (a2 == null) {
                h.f.b.l.b();
            }
            if (a2.size() < 8) {
                com.bytedance.scene.ktx.c.a(this, new x(this), 200);
            }
        }
        VideoEditViewModel videoEditViewModel = this.w;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel.y = new g(this);
        VideoEditViewModel videoEditViewModel2 = this.w;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel2.o.observe(this, new m(this));
        VideoEditViewModel videoEditViewModel3 = this.w;
        if (videoEditViewModel3 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel3.p.observe(this, new C3272s(this));
        VideoEditViewModel videoEditViewModel4 = this.w;
        if (videoEditViewModel4 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel4.q.observe(this, new t(this));
        VideoEditViewModel videoEditViewModel5 = this.w;
        if (videoEditViewModel5 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel5.r.observe(this, new u(this));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.v;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel.f125335j.observe(this, new v(this));
        CutVideoListViewModel cutVideoListViewModel = this.C;
        if (cutVideoListViewModel == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel, ab.f125550a, new w(this));
        CutVideoListViewModel cutVideoListViewModel2 = this.C;
        if (cutVideoListViewModel2 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel2, ac.f125551a, new h(this));
        CutVideoListViewModel cutVideoListViewModel3 = this.C;
        if (cutVideoListViewModel3 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel3, t.f125866a, new ah(), new i(this));
        CutVideoListViewModel cutVideoListViewModel4 = this.C;
        if (cutVideoListViewModel4 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel4, u.f125867a, new ah(), new j(this));
        CutVideoListViewModel cutVideoListViewModel5 = this.C;
        if (cutVideoListViewModel5 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel5, v.f125868a, new k(this));
        CutVideoListViewModel cutVideoListViewModel6 = this.C;
        if (cutVideoListViewModel6 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel6, w.f125869a, new l(this));
        CutVideoListViewModel cutVideoListViewModel7 = this.C;
        if (cutVideoListViewModel7 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel7, x.f125870a, new n(this));
        CutVideoListViewModel cutVideoListViewModel8 = this.C;
        if (cutVideoListViewModel8 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel8, y.f125871a, new o(this));
        CutVideoListViewModel cutVideoListViewModel9 = this.C;
        if (cutVideoListViewModel9 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        selectNonNullSubscribe(cutVideoListViewModel9, z.f125872a, new ah(), new p(this));
        CutVideoListViewModel cutVideoListViewModel10 = this.C;
        if (cutVideoListViewModel10 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        cutVideoListViewModel10.g().observe(this, new q(this));
        CutVideoListViewModel cutVideoListViewModel11 = this.C;
        if (cutVideoListViewModel11 == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        b.a.b(this, cutVideoListViewModel11, aa.f125549a, new r(this));
        ImageView imageView = this.f125836j;
        if (imageView == null) {
            h.f.b.l.a("ivSave");
        }
        imageView.setOnClickListener(new e(this));
        ImageView imageView2 = this.f125837k;
        if (imageView2 == null) {
            h.f.b.l.a("ivCancel");
        }
        imageView2.setOnClickListener(new f(this));
    }

    static final class m<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125855a;

        static {
            Covode.recordClassIndex(82676);
        }

        m(s sVar) {
            this.f125855a = sVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            float f2;
            int i2;
            s sVar = this.f125855a;
            VideoEditViewModel videoEditViewModel = sVar.w;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            List<VideoSegment> k2 = videoEditViewModel.k();
            CutVideoListViewModel cutVideoListViewModel = sVar.C;
            if (cutVideoListViewModel == null) {
                h.f.b.l.a("cutVideoListViewModel");
            }
            VideoSegment videoSegment = k2.get(cutVideoListViewModel.f125528b);
            h.f.b.l.b(videoSegment, "");
            View view = sVar.f125833g;
            if (view == null) {
                h.f.b.l.a("animTabDot");
            }
            view.setVisibility(4);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = sVar.A;
            if (cutVideoTitleBarViewModel == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.a(false);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = sVar.A;
            if (cutVideoTitleBarViewModel2 == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.b(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = sVar.z;
            if (cutVideoBottomBarViewModel == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.c(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = sVar.z;
            if (cutVideoBottomBarViewModel2 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel2.d(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = sVar.z;
            if (cutVideoBottomBarViewModel3 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            if (!sVar.T || !com.ss.android.ugc.aweme.shortvideo.cut.o.a(videoSegment)) {
                z = false;
            } else {
                z = true;
            }
            cutVideoBottomBarViewModel3.a(z);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = sVar.z;
            if (cutVideoBottomBarViewModel4 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel4.b(sVar.I);
            CutVideoSpeedViewModel cutVideoSpeedViewModel = sVar.y;
            if (cutVideoSpeedViewModel == null) {
                h.f.b.l.a("speedViewModel");
            }
            cutVideoSpeedViewModel.a(false);
            CutVideoSpeedViewModel cutVideoSpeedViewModel2 = sVar.y;
            if (cutVideoSpeedViewModel2 == null) {
                h.f.b.l.a("speedViewModel");
            }
            if (!sVar.I || sVar.d() || !com.ss.android.ugc.aweme.shortvideo.cut.o.a(videoSegment)) {
                z2 = false;
            } else {
                z2 = true;
            }
            cutVideoSpeedViewModel2.b(z2);
            if (sVar.I) {
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = sVar.y;
                if (cutVideoSpeedViewModel3 == null) {
                    h.f.b.l.a("speedViewModel");
                }
                com.ss.android.ugc.aweme.tools.i a2 = com.ss.android.ugc.aweme.shortvideo.cut.m.a(videoSegment.f());
                h.f.b.l.b(a2, "");
                cutVideoSpeedViewModel3.a(a2);
            }
            VECutVideoPresenter vECutVideoPresenter = sVar.f125829c;
            if (vECutVideoPresenter == null) {
                h.f.b.l.a("presenter");
            }
            CutVideoListViewModel cutVideoListViewModel2 = sVar.C;
            if (cutVideoListViewModel2 == null) {
                h.f.b.l.a("cutVideoListViewModel");
            }
            int i3 = cutVideoListViewModel2.f125528b;
            VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.f125355j;
            if (videoEditViewModel2 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            VideoSegment c2 = videoEditViewModel2.c(i3);
            if (c2 != null) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n nVar = vECutVideoPresenter.f125356k;
                if (nVar.f126022c) {
                    com.ss.android.ugc.aweme.shortvideo.cut.i iVar = nVar.f126021b;
                    if (iVar != null) {
                        iVar.a(i3, c2);
                    }
                } else {
                    com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = nVar.f126020a;
                    if (iVar2 != null) {
                        iVar2.a(i3, c2);
                    }
                }
                vECutVideoPresenter.f125357l.a(c2);
            }
            if (sVar.f125828b != null) {
                av avVar = sVar.U;
                if (avVar != null) {
                    avVar.b();
                }
                CutVideoListViewModel cutVideoListViewModel3 = sVar.C;
                if (cutVideoListViewModel3 == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                Activity activity = sVar.f42913m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                CutVideoListViewModel cutVideoListViewModel4 = sVar.C;
                if (cutVideoListViewModel4 == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                int i4 = cutVideoListViewModel4.f125528b;
                h.f.b.l.d(eVar, "");
                JediViewModel a3 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoPreviewViewModel.class);
                h.f.b.l.b(a3, "");
                ((CutVideoPreviewViewModel) a3).a();
                bt btVar = cutVideoListViewModel3.f125529c;
                if (btVar == null) {
                    h.f.b.l.a("stickerPointController");
                }
                btVar.a(i4, videoSegment);
            }
            if (videoSegment.f() == 0.0f) {
                f2 = 1.0f;
            } else {
                f2 = videoSegment.f();
            }
            VEVideoCutterViewModel vEVideoCutterViewModel = sVar.x;
            if (vEVideoCutterViewModel == null) {
                h.f.b.l.a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a((long) (((float) videoSegment.d()) / f2), x.f.EDITOR_SEEK_FLAG_LastSeek));
            if (sVar.d()) {
                VideoEditViewModel videoEditViewModel3 = sVar.w;
                if (videoEditViewModel3 == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                videoEditViewModel3.u.setValue(null);
            }
            sVar.J = 1.0f;
            sVar.K = 0.0f;
            sVar.L = 0.0f;
            if (!sVar.d() || !com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.b()) {
                CutVideoListViewModel cutVideoListViewModel5 = sVar.C;
                if (cutVideoListViewModel5 == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                i2 = cutVideoListViewModel5.f125527a;
            } else {
                CutVideoListViewModel cutVideoListViewModel6 = sVar.C;
                if (cutVideoListViewModel6 == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                i2 = cutVideoListViewModel6.f125527a + 1;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.z zVar = sVar.f125827a;
            if (zVar == null) {
                h.f.b.l.b();
            }
            RecyclerView recyclerView = sVar.f125830d;
            if (recyclerView == null) {
                h.f.b.l.a("videoRecyclerView");
            }
            Rect b2 = zVar.b(recyclerView, i2);
            FrameLayout frameLayout = sVar.f125835i;
            if (frameLayout == null) {
                h.f.b.l.a("singleEditLayout");
            }
            frameLayout.setVisibility(0);
            ImageView imageView = sVar.f125836j;
            if (imageView == null) {
                h.f.b.l.a("ivSave");
            }
            imageView.setVisibility(8);
            ImageView imageView2 = sVar.f125837k;
            if (imageView2 == null) {
                h.f.b.l.a("ivCancel");
            }
            imageView2.setVisibility(8);
            TextView textView = sVar.f125838l;
            if (textView == null) {
                h.f.b.l.a("singleEditTitle");
            }
            textView.setVisibility(4);
            TextView textView2 = sVar.f125838l;
            if (textView2 == null) {
                h.f.b.l.a("singleEditTitle");
            }
            View rootView = textView2.getRootView();
            h.f.b.l.b(rootView, "");
            rootView.getViewTreeObserver().addOnPreDrawListener(new aa(sVar, i2, b2));
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(sVar.d(), true, false, false, false, false);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            s.f(this.this$0).setEnabled(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            s.g(this.this$0).setEnabled(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            StickPointSingleVideoEditView i3 = s.i(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            i3.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asi, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                s.h(this.this$0).setButtonClickable(false);
            }
            d.a(s.h(this.this$0), booleanValue, new h.f.a.b<Boolean, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.s.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(82673);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    s.h(this.this$0.this$0).setButtonClickable(bool.booleanValue());
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                s.h(this.this$0).setButtonClickable(false);
            }
            d.b(s.h(this.this$0), booleanValue, new h.f.a.b<Boolean, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.s.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(82675);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    s.h(this.this$0.this$0).setButtonClickable(bool.booleanValue());
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                d.a(s.i(this.this$0), true, AnonymousClass1.f125856a);
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b(s.i(this.this$0));
            }
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                d.b(s.i(this.this$0), true, AnonymousClass1.f125857a);
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a(s.i(this.this$0));
            }
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            s.c(this.this$0).a(s.b(this.this$0).k().get(s.a(this.this$0).f125528b));
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            ba baVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (s.d(this.this$0).f125524a == 2) {
                this.this$0.I = booleanValue;
            } else {
                this.this$0.H = booleanValue;
            }
            if (!booleanValue || ((baVar = this.this$0.f125828b) != null && baVar.g())) {
                s.e(this.this$0).b(false);
            } else {
                CutVideoSpeedViewModel e2 = s.e(this.this$0);
                com.ss.android.ugc.aweme.tools.i a2 = com.ss.android.ugc.aweme.shortvideo.cut.m.a(this.this$0.b().L().getCurrentSpeed());
                h.f.b.l.b(a2, "");
                e2.a(a2);
                s.e(this.this$0).b(true);
            }
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(82683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(s sVar) {
            super(2);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            s sVar = this.this$0;
            FrameLayout frameLayout = sVar.t;
            if (frameLayout == null) {
                h.f.b.l.a("recyclerViewLayout");
            }
            frameLayout.setVisibility(0);
            float b2 = com.bytedance.common.utility.n.b(sVar.f42913m, 16.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new c(sVar, booleanValue, b2));
            if (!booleanValue) {
                ofFloat.addListener(new d(sVar));
            }
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
            return h.z.f158842a;
        }
    }

    static final class z implements z.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f125865a;

        static {
            Covode.recordClassIndex(82691);
        }

        z(s sVar) {
            this.f125865a = sVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.z.b
        public final void a(int i2, String str) {
            ArrayList<String> arrayList;
            if (s.d(this.f125865a).f125524a != 2 && !this.f125865a.S) {
                if (i2 == 10003) {
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f fVar = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125946e;
                    Activity activity = this.f125865a.f42913m;
                    com.ss.android.ugc.aweme.shortvideo.cut.z zVar = this.f125865a.f125827a;
                    Long l2 = null;
                    if (zVar != null) {
                        arrayList = zVar.a();
                    } else {
                        arrayList = null;
                    }
                    com.ss.android.ugc.aweme.shortvideo.cut.z zVar2 = this.f125865a.f125827a;
                    if (zVar2 == null || (l2 = Long.valueOf(zVar2.b())) == null) {
                        h.f.b.l.b();
                    }
                    fVar.a(activity, arrayList, l2.longValue());
                    return;
                }
                s.a(this.f125865a).f125527a = i2;
                s.a(this.f125865a).f125528b = s.b(this.f125865a).a(str);
                if (s.a(this.f125865a).f125528b < 0) {
                    bj.c("edit index:" + s.a(this.f125865a).f125527a + ", origin_index:" + s.a(this.f125865a).f125528b + ", path:" + str);
                } else {
                    s.c(this.f125865a).a(s.a(this.f125865a).f125527a, s.a(this.f125865a).f125528b);
                }
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.ev4);
        h.f.b.l.b(c2, "");
        this.f125832f = (TextView) c2;
        View c3 = c(R.id.ffc);
        h.f.b.l.b(c3, "");
        this.f125830d = (RecyclerView) c3;
        View c4 = c(R.id.kl);
        h.f.b.l.b(c4, "");
        this.f125833g = c4;
        View c5 = c(R.id.fh9);
        h.f.b.l.b(c5, "");
        this.f125834h = (StickPointVideoSegView) c5;
        View c6 = c(R.id.e4e);
        h.f.b.l.b(c6, "");
        this.f125835i = (FrameLayout) c6;
        View c7 = c(R.id.bth);
        h.f.b.l.b(c7, "");
        this.f125836j = (ImageView) c7;
        View c8 = c(R.id.bt5);
        h.f.b.l.b(c8, "");
        this.f125837k = (ImageView) c8;
        View c9 = c(R.id.e4h);
        h.f.b.l.b(c9, "");
        this.f125838l = (TextView) c9;
        View c10 = c(R.id.vw);
        h.f.b.l.b(c10, "");
        this.t = (FrameLayout) c10;
        TextView textView = this.f125832f;
        if (textView == null) {
            h.f.b.l.a("tvVideoSegmentDes");
        }
        textView.setShadowLayer(2.0f, 0.0f, 0.0f, androidx.core.content.b.c(view.getContext(), R.color.bo));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        view.setLayoutParams(layoutParams2);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.ss.android.ugc.aweme.shortvideo.cut.z zVar = null;
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a2, "");
        this.v = (CutMultiVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a3, "");
        this.w = (VideoEditViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoViewModel.class);
        h.f.b.l.b(a4, "");
        this.X = (CutVideoViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a5 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity4, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a5, "");
        this.x = (VEVideoCutterViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity5).a(CutVideoSpeedViewModel.class);
        h.f.b.l.b(a6, "");
        this.y = (CutVideoSpeedViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity6).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a7, "");
        this.z = (CutVideoBottomBarViewModel) a7;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity7).a(CutVideoTitleBarViewModel.class);
        h.f.b.l.b(a8, "");
        this.A = (CutVideoTitleBarViewModel) a8;
        Activity activity8 = this.f42913m;
        Objects.requireNonNull(activity8, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a9 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity8).a(CutVideoEditViewModel.class);
        h.f.b.l.b(a9, "");
        this.B = (CutVideoEditViewModel) a9;
        Activity activity9 = this.f42913m;
        Objects.requireNonNull(activity9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a10 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity9).a(CutVideoPreviewViewModel.class);
        h.f.b.l.b(a10, "");
        this.Y = (CutVideoPreviewViewModel) a10;
        Activity activity10 = this.f42913m;
        Objects.requireNonNull(activity10, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a11 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity10).a(CutVideoListViewModel.class);
        h.f.b.l.b(a11, "");
        this.C = (CutVideoListViewModel) a11;
        Activity activity11 = this.f42913m;
        Objects.requireNonNull(activity11, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a12 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity11).a(CutVideoStickerPointMusicViewModel.class);
        h.f.b.l.b(a12, "");
        this.D = (CutVideoStickerPointMusicViewModel) a12;
        Activity activity12 = this.f42913m;
        Objects.requireNonNull(activity12, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a13 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity12).a(CutVideoMultiModeViewModel.class);
        h.f.b.l.b(a13, "");
        this.E = (CutVideoMultiModeViewModel) a13;
        CutVideoViewModel cutVideoViewModel = this.X;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.i()) {
            com.bytedance.scene.j jVar = this.o;
            if (jVar == null) {
                h.f.b.l.b();
            }
            View c11 = jVar.c(R.id.e4g);
            h.f.b.l.b(c11, "");
            this.u = (StickPointSingleVideoEditView) c11;
            ba baVar = this.f125828b;
            if (baVar != null) {
                bv bvVar = this.G;
                h.f.b.l.d(bvVar, "");
                baVar.f125671b = bvVar;
            }
        } else {
            FrameLayout frameLayout = this.t;
            if (frameLayout == null) {
                h.f.b.l.a("recyclerViewLayout");
            }
            frameLayout.setVisibility(0);
        }
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        VideoEditViewModel videoEditViewModel = this.w;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.v;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c cVar = new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.c(t2, this, videoEditViewModel, cutMultiVideoViewModel);
        this.V = cVar;
        RecyclerView recyclerView = this.f125830d;
        if (recyclerView == null) {
            h.f.b.l.a("videoRecyclerView");
        }
        View view2 = this.f125833g;
        if (view2 == null) {
            h.f.b.l.a("animTabDot");
        }
        CutVideoViewModel cutVideoViewModel2 = this.X;
        if (cutVideoViewModel2 == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        cVar.a(recyclerView, view2, new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.b(cutVideoViewModel2.i(), true, true), new z(this));
        RecyclerView recyclerView2 = this.f125830d;
        if (recyclerView2 == null) {
            h.f.b.l.a("videoRecyclerView");
        }
        RecyclerView.a adapter = recyclerView2.getAdapter();
        if (adapter instanceof com.ss.android.ugc.aweme.shortvideo.cut.z) {
            zVar = adapter;
        }
        this.f125827a = zVar;
    }

    public final void a(boolean z2, boolean z3) {
        com.ss.android.ugc.aweme.shortvideo.cut.z zVar;
        if (!z3 || (zVar = this.f125827a) == null || zVar.a().size() != 0) {
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.A;
            if (cutVideoTitleBarViewModel == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.a(true);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.A;
            if (cutVideoTitleBarViewModel2 == null) {
                h.f.b.l.a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel2.b(true);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.z;
            if (cutVideoBottomBarViewModel == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.c(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.z;
            if (cutVideoBottomBarViewModel2 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel2.d(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.z;
            if (cutVideoBottomBarViewModel3 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel3.a(false);
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.z;
            if (cutVideoBottomBarViewModel4 == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel4.b(this.H);
            CutVideoSpeedViewModel cutVideoSpeedViewModel = this.y;
            if (cutVideoSpeedViewModel == null) {
                h.f.b.l.a("speedViewModel");
            }
            cutVideoSpeedViewModel.a(false);
            CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.y;
            if (cutVideoSpeedViewModel2 == null) {
                h.f.b.l.a("speedViewModel");
            }
            cutVideoSpeedViewModel2.b(this.H);
            if (this.H) {
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.y;
                if (cutVideoSpeedViewModel3 == null) {
                    h.f.b.l.a("speedViewModel");
                }
                VideoEditViewModel videoEditViewModel = this.w;
                if (videoEditViewModel == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                com.ss.android.ugc.aweme.tools.i a2 = com.ss.android.ugc.aweme.shortvideo.cut.m.a(videoEditViewModel.l());
                h.f.b.l.b(a2, "");
                cutVideoSpeedViewModel3.a(a2);
            }
            if (this.f125828b != null) {
                CutVideoPreviewViewModel cutVideoPreviewViewModel = this.Y;
                if (cutVideoPreviewViewModel == null) {
                    h.f.b.l.a("previewViewModel");
                }
                cutVideoPreviewViewModel.a();
                av avVar = this.U;
                if (avVar != null) {
                    avVar.a();
                }
                CutVideoListViewModel cutVideoListViewModel = this.C;
                if (cutVideoListViewModel == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                Activity activity = this.f42913m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                h.f.b.l.d(eVar, "");
                JediViewModel a3 = com.bytedance.jedi.arch.t.a(eVar).a(CutVideoPreviewViewModel.class);
                h.f.b.l.b(a3, "");
                ((CutVideoPreviewViewModel) a3).a();
                bt btVar = cutVideoListViewModel.f125529c;
                if (btVar == null) {
                    h.f.b.l.a("stickerPointController");
                }
                btVar.a(z2, z3);
            }
            VECutVideoPresenter vECutVideoPresenter = this.f125829c;
            if (vECutVideoPresenter == null) {
                h.f.b.l.a("presenter");
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n nVar = vECutVideoPresenter.f125356k;
            VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.f125355j;
            if (videoEditViewModel2 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            List<VideoSegment> k2 = videoEditViewModel2.k();
            if (nVar.f126022c) {
                com.ss.android.ugc.aweme.shortvideo.cut.i iVar = nVar.f126021b;
                if (iVar != null) {
                    iVar.a(z2, z3, k2);
                }
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = nVar.f126020a;
                if (iVar2 != null) {
                    iVar2.a(z2, z3, k2);
                }
            }
            if (!d()) {
                CutVideoEditViewModel cutVideoEditViewModel = this.B;
                if (cutVideoEditViewModel == null) {
                    h.f.b.l.a("cutVideoEditViewModel");
                }
                cutVideoEditViewModel.c(CutVideoEditViewModel.e.f125526a);
            }
            if (z3) {
                CutMultiVideoViewModel cutMultiVideoViewModel = this.v;
                if (cutMultiVideoViewModel == null) {
                    h.f.b.l.a("cutMultiVideoViewModel");
                }
                cutMultiVideoViewModel.a();
            }
            if (d()) {
                VideoEditViewModel videoEditViewModel3 = this.w;
                if (videoEditViewModel3 == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                videoEditViewModel3.v.setValue(null);
            }
            ImageView imageView = this.f125836j;
            if (imageView == null) {
                h.f.b.l.a("ivSave");
            }
            imageView.setVisibility(8);
            ImageView imageView2 = this.f125837k;
            if (imageView2 == null) {
                h.f.b.l.a("ivCancel");
            }
            imageView2.setVisibility(8);
            FrameLayout frameLayout = this.f125835i;
            if (frameLayout == null) {
                h.f.b.l.a("singleEditLayout");
            }
            frameLayout.setVisibility(8);
            TextView textView = this.f125832f;
            if (textView == null) {
                h.f.b.l.a("tvVideoSegmentDes");
            }
            textView.setVisibility(0);
            if (d()) {
                CutVideoListViewModel cutVideoListViewModel2 = this.C;
                if (cutVideoListViewModel2 == null) {
                    h.f.b.l.a("cutVideoListViewModel");
                }
                cutVideoListViewModel2.b(true);
            } else {
                RecyclerView recyclerView = this.f125830d;
                if (recyclerView == null) {
                    h.f.b.l.a("videoRecyclerView");
                }
                recyclerView.setVisibility(0);
            }
            TextView textView2 = this.f125838l;
            if (textView2 == null) {
                h.f.b.l.a("singleEditTitle");
            }
            textView2.setVisibility(4);
            if (!(this.M == null || this.N == null)) {
                RecyclerView recyclerView2 = this.f125830d;
                if (recyclerView2 == null) {
                    h.f.b.l.a("videoRecyclerView");
                }
                View rootView = recyclerView2.getRootView();
                h.f.b.l.b(rootView, "");
                rootView.getViewTreeObserver().addOnPreDrawListener(new ab(this, z3));
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.Y;
            if (cutVideoPreviewViewModel2 == null) {
                h.f.b.l.a("previewViewModel");
            }
            cutVideoPreviewViewModel2.c(CutVideoPreviewViewModel.b.f125538a);
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(d(), false, z2, !z2, z3, false);
            return;
        }
        CutVideoViewModel cutVideoViewModel = this.X;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        cutVideoViewModel.a();
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
