package com.ss.android.ugc.aweme.feed.assem.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlinx.coroutines.bz;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new h.f.b.y(a.class, "progressBarVM", "getProgressBarVM()Lcom/ss/android/ugc/aweme/feed/assem/progressbar/VideoProgressBarViewModel;", 0)};
    private final h.h A = h.i.a(h.m.NONE, new l(this));
    private AnimatorSet B;
    private final h.h.d C;
    private final h.h D;
    private final h.h E;
    private final h.h F;
    private final com.ss.android.ugc.aweme.base.a.a G;
    private SparseArray H;
    public AudioControlView v;
    public NewVideoPlayerProgressbar w;
    LineProgressBar x;
    public AnimatorSet y;
    public AnimatorSet z;

    public static final class b extends h.f.b.m implements h.f.a.b<m, m> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58425);
        }

        public b() {
            super(1);
        }

        public final m invoke(m mVar) {
            h.f.b.l.c(mVar, "");
            return mVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58426);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58429);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(58432);
        }

        public i() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(58416);
    }

    private final VideoViewModel O() {
        return (VideoViewModel) this.D.getValue();
    }

    private final VideoPlayViewModel P() {
        return (VideoPlayViewModel) this.E.getValue();
    }

    private final VideoEventDispatchViewModel Q() {
        return (VideoEventDispatchViewModel) this.F.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.tp;
    }

    public final Activity F() {
        return (Activity) this.A.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.H == null) {
            this.H = new SparseArray();
        }
        View view = (View) this.H.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.H.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final VideoProgressBarViewModel H() {
        return (VideoProgressBarViewModel) this.C.a(this, u[0]);
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58427);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58428);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58430);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58431);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(58433);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(58434);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class o implements AudioControlView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92372a;

        static {
            Covode.recordClassIndex(58438);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
        public final void a() {
            this.f92372a.I();
        }

        @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
        public final void b() {
            this.f92372a.J();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(a aVar) {
            this.f92372a = aVar;
        }
    }

    public static final class r implements AudioControlView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92375a;

        static {
            Covode.recordClassIndex(58441);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
        public final void a() {
            this.f92375a.J();
        }

        @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
        public final void b() {
            this.f92375a.I();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(a aVar) {
            this.f92375a = aVar;
        }
    }

    public final void K() {
        LineProgressBar lineProgressBar = this.x;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Activity> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Activity invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type android.app.Activity");
            return ar_;
        }
    }

    @Override // com.bytedance.assem.arch.b.x
    public final void E() {
        super.E();
        com.ss.android.ugc.aweme.base.utils.m.a(new p(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$a  reason: collision with other inner class name */
    public static final class C2243a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2243a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, H(), b.f92383a, com.bytedance.assem.arch.viewModel.l.a(), q.f92374a, 4);
    }

    public final void J() {
        if (this.w != null && this.v != null) {
            AnimatorSet animatorSet = this.B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setAlpha(0.0f);
            }
            AudioControlView audioControlView = this.v;
            if (audioControlView != null) {
                audioControlView.setAlpha(1.0f);
            }
        }
    }

    public final void M() {
        com.bytedance.assem.arch.b.l.b(this);
        hashCode();
        com.bytedance.assem.arch.b.j jVar = this.n;
        if (jVar != null) {
            jVar.hashCode();
        }
        this.G.hashCode();
        if (F() instanceof com.ss.android.ugc.aweme.base.a.g) {
            Activity F2 = F();
            Objects.requireNonNull(F2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((com.ss.android.ugc.aweme.base.a.g) F2).registerActivityOnKeyDownListener(this.G);
        }
    }

    public final void N() {
        com.bytedance.assem.arch.b.l.b(this);
        hashCode();
        com.bytedance.assem.arch.b.j jVar = this.n;
        if (jVar != null) {
            jVar.hashCode();
        }
        this.G.hashCode();
        if (F() instanceof com.ss.android.ugc.aweme.base.a.g) {
            Activity F2 = F();
            Objects.requireNonNull(F2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((com.ss.android.ugc.aweme.base.a.g) F2).unRegisterActivityOnKeyDownListener(this.G);
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92373a;

        static {
            Covode.recordClassIndex(58439);
        }

        p(a aVar) {
            this.f92373a = aVar;
        }

        public final void run() {
            a aVar = this.f92373a;
            aVar.J();
            AnimatorSet animatorSet = aVar.y;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = aVar.y;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = aVar.z;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
            }
            AnimatorSet animatorSet4 = aVar.z;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            AudioControlView audioControlView = aVar.v;
            if (audioControlView != null) {
                audioControlView.f68267c = null;
            }
            LineProgressBar lineProgressBar = aVar.x;
            if (lineProgressBar != null) {
                lineProgressBar.c();
            }
            LineProgressBar lineProgressBar2 = aVar.x;
            if (lineProgressBar2 != null) {
                lineProgressBar2.clearAnimation();
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar.w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.clearAnimation();
            }
            aVar.N();
        }
    }

    public a() {
        h.k.c a2 = h.f.b.ab.a(VideoProgressBarViewModel.class);
        this.C = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new C2243a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.D = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.E = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
        this.F = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoEventDispatchViewModel.class), this, j.INSTANCE, k.INSTANCE, i.INSTANCE);
        this.G = new n(this);
    }

    public final void I() {
        ObjectAnimator objectAnimator;
        if (this.w != null && this.v != null) {
            if (this.z != null || this.y != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.B = animatorSet;
                animatorSet.addListener(new m(this));
                AnimatorSet animatorSet2 = this.B;
                if (animatorSet2 != null) {
                    NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.w;
                    ObjectAnimator objectAnimator2 = null;
                    if (newVideoPlayerProgressbar != null) {
                        objectAnimator = newVideoPlayerProgressbar.getShowAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet2.play(objectAnimator);
                    if (play != null) {
                        AudioControlView audioControlView = this.v;
                        if (audioControlView != null) {
                            objectAnimator2 = audioControlView.getHideVolumeAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet3 = this.B;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
            }
        }
    }

    public final void L() {
        NewVideoPlayerProgressbar newVideoPlayerProgressbar;
        NewVideoPlayerProgressbar newVideoPlayerProgressbar2;
        H().f92366k = SystemClock.elapsedRealtime();
        if (((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme != null) {
            if (com.ss.android.ugc.aweme.story.d.a.g(((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme) && (newVideoPlayerProgressbar2 = this.w) != null) {
                newVideoPlayerProgressbar2.setVisibility(8);
            }
            if (!com.ss.android.ugc.aweme.feed.ui.seekbar.a.c.b(((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme)) {
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
                h.f.b.l.b(aweme, "");
                if (aweme.getVideoControl() != null) {
                    Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
                    h.f.b.l.b(aweme2, "");
                    if (aweme2.getVideoControl().showProgressBar == 1) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar3 = this.w;
                        if (newVideoPlayerProgressbar3 != null) {
                            newVideoPlayerProgressbar3.setProgress(0);
                        }
                        Aweme aweme3 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
                        h.f.b.l.b(aweme3, "");
                        if (!(aweme3.getVideo() == null || (newVideoPlayerProgressbar = this.w) == null)) {
                            Aweme aweme4 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
                            h.f.b.l.b(aweme4, "");
                            Video video = aweme4.getVideo();
                            h.f.b.l.b(video, "");
                            newVideoPlayerProgressbar.setMax(video.getDuration());
                        }
                        com.ss.android.ugc.aweme.base.utils.o.a(this.w, 0);
                        return;
                    }
                }
            }
            com.ss.android.ugc.aweme.base.utils.o.a(this.w, 8);
        }
    }

    public static final class m extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92370a;

        static {
            Covode.recordClassIndex(58436);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(a aVar) {
            this.f92370a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            this.f92370a.H().a(0, null, false);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        AudioControlView audioControlView = this.v;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new o(this));
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<m, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(m mVar) {
            ObjectAnimator objectAnimator;
            m mVar2 = mVar;
            h.f.b.l.d(mVar2, "");
            if (mVar2.f92396c) {
                AudioControlView audioControlView = this.this$0.v;
                if (audioControlView != null) {
                    audioControlView.c();
                }
            } else if (this.this$0.w != null) {
                this.this$0.z = new AnimatorSet();
                AnimatorSet animatorSet = this.this$0.z;
                if (animatorSet != null) {
                    AudioControlView audioControlView2 = this.this$0.v;
                    ObjectAnimator objectAnimator2 = null;
                    if (audioControlView2 != null) {
                        objectAnimator = audioControlView2.getShowVolumeAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet.play(objectAnimator);
                    if (play != null) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.this$0.w;
                        if (newVideoPlayerProgressbar != null) {
                            objectAnimator2 = newVideoPlayerProgressbar.getHideAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet2 = this.this$0.z;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.ss.android.ugc.aweme.feed.assem.progressbar.a.ac.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ ac f92368a;

                        static {
                            Covode.recordClassIndex(58422);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f92368a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            h.f.b.l.d(animator, "");
                            AudioControlView audioControlView = this.f92368a.this$0.v;
                            if (audioControlView != null) {
                                audioControlView.c();
                            }
                        }
                    });
                }
                AnimatorSet animatorSet3 = this.this$0.z;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                AudioControlView audioControlView3 = this.this$0.v;
                if (audioControlView3 != null) {
                    Integer.valueOf(audioControlView3.getVisibility());
                }
                AudioControlView audioControlView4 = this.this$0.v;
                if (audioControlView4 != null) {
                    Float.valueOf(audioControlView4.getAlpha());
                }
                com.bytedance.assem.arch.b.l.b(this.this$0);
                this.this$0.hashCode();
            }
            return h.z.f158842a;
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.b<m, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(m mVar) {
            ObjectAnimator objectAnimator;
            m mVar2 = mVar;
            h.f.b.l.d(mVar2, "");
            if (mVar2.f92396c) {
                AudioControlView audioControlView = this.this$0.v;
                if (audioControlView != null) {
                    audioControlView.b();
                }
            } else if (this.this$0.w != null) {
                this.this$0.y = new AnimatorSet();
                AnimatorSet animatorSet = this.this$0.y;
                if (animatorSet != null) {
                    AudioControlView audioControlView2 = this.this$0.v;
                    ObjectAnimator objectAnimator2 = null;
                    if (audioControlView2 != null) {
                        objectAnimator = audioControlView2.getShowVolumeAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet.play(objectAnimator);
                    if (play != null) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.this$0.w;
                        if (newVideoPlayerProgressbar != null) {
                            objectAnimator2 = newVideoPlayerProgressbar.getHideAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet2 = this.this$0.y;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.ss.android.ugc.aweme.feed.assem.progressbar.a.ad.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ ad f92369a;

                        static {
                            Covode.recordClassIndex(58424);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f92369a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            h.f.b.l.d(animator, "");
                            AudioControlView audioControlView = this.f92369a.this$0.v;
                            if (audioControlView != null) {
                                audioControlView.b();
                            }
                        }
                    });
                }
                AnimatorSet animatorSet3 = this.this$0.y;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                AudioControlView audioControlView3 = this.this$0.v;
                if (audioControlView3 != null) {
                    Integer.valueOf(audioControlView3.getVisibility());
                }
                com.bytedance.assem.arch.b.l.b(this.this$0);
                AudioControlView audioControlView4 = this.this$0.v;
                if (audioControlView4 != null) {
                    Float.valueOf(audioControlView4.getAlpha());
                }
                this.this$0.hashCode();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        this.v = (AudioControlView) view.findViewById(R.id.nj);
        this.w = (NewVideoPlayerProgressbar) view.findViewById(R.id.fgu);
        this.x = (LineProgressBar) view.findViewById(R.id.cag);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, com.ss.android.ugc.aweme.base.utils.n.a(1.0d));
        layoutParams.gravity = 80;
        if (c.b.f66221a.t) {
            int a2 = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
        }
        view.setLayoutParams(layoutParams);
        AudioControlView audioControlView = this.v;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new r(this));
        }
        f.a.a(this, O(), h.f92389a, (com.bytedance.assem.arch.viewModel.k) null, y.f92382a, 6);
        f.a.a(this, O(), j.f92391a, (com.bytedance.assem.arch.viewModel.k) null, new z(this), 6);
        f.a.a(this, O(), k.f92392a, (com.bytedance.assem.arch.viewModel.k) null, new aa(this), 6);
        f.a.a(this, P(), l.f92393a, com.bytedance.assem.arch.viewModel.l.a(), ab.f92367a, 4);
        f.a.a(this, P(), c.f92384a, (com.bytedance.assem.arch.viewModel.k) null, s.f92376a, 6);
        f.a.a(this, P(), d.f92385a, (com.bytedance.assem.arch.viewModel.k) null, t.f92377a, 6);
        f.a.a(this, O(), e.f92386a, (com.bytedance.assem.arch.viewModel.k) null, u.f92378a, 6);
        f.a.a(this, Q(), f.f92387a, (com.bytedance.assem.arch.viewModel.k) null, v.f92379a, 6);
        f.a.a(this, Q(), g.f92388a, (com.bytedance.assem.arch.viewModel.k) null, w.f92380a, 6);
        f.a.a(this, Q(), i.f92390a, (com.bytedance.assem.arch.viewModel.k) null, x.f92381a, 6);
    }

    static final class s extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92376a = new s();

        static {
            Covode.recordClassIndex(58442);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                aVar3.M();
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f92377a = new t();

        static {
            Covode.recordClassIndex(58443);
        }

        t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                aVar3.M();
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f92378a = new u();

        static {
            Covode.recordClassIndex(58444);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                aVar3.N();
            }
            return h.z.f158842a;
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f92367a = new ab();

        static {
            Covode.recordClassIndex(58419);
        }

        ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            final a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(aVar2, "");
            a.a(aVar3.H(), new h.f.a.b<m, h.z>() {
                /* class com.ss.android.ugc.aweme.feed.assem.progressbar.a.ab.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(58420);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(m mVar) {
                    m mVar2 = mVar;
                    h.f.b.l.d(mVar2, "");
                    if (!mVar2.f92395b) {
                        a aVar = aVar3;
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar.w;
                        if (newVideoPlayerProgressbar != null) {
                            newVideoPlayerProgressbar.setProgress(0);
                        }
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar2 = aVar.w;
                        if (newVideoPlayerProgressbar2 != null) {
                            newVideoPlayerProgressbar2.clearAnimation();
                        }
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar3 = aVar.w;
                        if (newVideoPlayerProgressbar3 != null) {
                            newVideoPlayerProgressbar3.setVisibility(4);
                        }
                        LineProgressBar lineProgressBar = aVar.x;
                        if (lineProgressBar != null) {
                            lineProgressBar.clearAnimation();
                        }
                        LineProgressBar lineProgressBar2 = aVar.x;
                        if (lineProgressBar2 != null) {
                            lineProgressBar2.c();
                        }
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<a, ae, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f92380a = new w();

        static {
            Covode.recordClassIndex(58446);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, ae aeVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (aeVar != null) {
                com.ss.android.ugc.aweme.base.utils.o.a(aVar2.s(), 0);
            }
            return h.z.f158842a;
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                this.this$0.hashCode();
                com.bytedance.assem.arch.b.l.b(aVar3);
                aVar3.H().hashCode();
                aVar3.H().a(false);
                aVar3.N();
                aVar3.L();
                aVar3.K();
            }
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<a, Integer, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92374a = new q();

        static {
            Covode.recordClassIndex(58440);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Integer num) {
            a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar2.w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setMax(((m) aVar2.H().e()).f92398e);
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar2 = aVar2.w;
            if (newVideoPlayerProgressbar2 != null) {
                newVideoPlayerProgressbar2.setProgress(intValue);
            }
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<a, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f92379a = new v();

        static {
            Covode.recordClassIndex(58445);
        }

        v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar2) {
            boolean z;
            a aVar3 = aVar;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoProgressBarViewModel H = aVar3.H();
                if (aVar4.f34874a != 4) {
                    z = true;
                } else {
                    z = false;
                }
                H.a(new VideoProgressBarViewModel.d(z));
            }
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f92382a = new y();

        static {
            Covode.recordClassIndex(58448);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            T t;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f25631b) == null)) {
                if (t.booleanValue()) {
                    LineProgressBar lineProgressBar = aVar3.x;
                    if (lineProgressBar != null) {
                        lineProgressBar.a();
                    }
                } else {
                    aVar3.K();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                this.this$0.hashCode();
                com.bytedance.assem.arch.b.l.b(aVar3);
                aVar3.H().hashCode();
                aVar3.H().a(true);
                aVar3.I();
                aVar3.M();
                aVar3.L();
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<a, com.ss.android.ugc.aweme.feed.ui.seekbar.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f92381a = new x();

        static {
            Covode.recordClassIndex(58447);
        }

        x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar) {
            int i2;
            String str;
            Aweme aweme;
            a aVar2 = aVar;
            com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar2 = eVar;
            h.f.b.l.d(aVar2, "");
            if (eVar2 != null) {
                VideoProgressBarViewModel H = aVar2.H();
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar2.w;
                if (newVideoPlayerProgressbar != null) {
                    i2 = newVideoPlayerProgressbar.getProgress();
                } else {
                    i2 = 0;
                }
                h.f.b.l.d(eVar2, "");
                VideoItemParams videoItemParams = (VideoItemParams) H.g();
                String str2 = null;
                if (!(videoItemParams == null || videoItemParams.mAweme == null || eVar2.f95100a == null)) {
                    Aweme aweme2 = eVar2.f95100a;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    VideoItemParams videoItemParams2 = (VideoItemParams) H.g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                        str2 = aweme.getAid();
                    }
                    if (str == str2 && (i2 != 0 || SystemClock.elapsedRealtime() >= H.f92366k + 600)) {
                        H.a(new VideoProgressBarViewModel.c(H, eVar2));
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class n implements com.ss.android.ugc.aweme.base.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92371a;

        static {
            Covode.recordClassIndex(58437);
        }

        n(a aVar) {
            this.f92371a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            boolean z;
            boolean z2;
            boolean z3;
            if (i2 != 25 && i2 != 24) {
                return false;
            }
            VideoProgressBarViewModel H = this.f92371a.H();
            if (i2 == 24) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.m.b.a().b();
            bz unused = kotlinx.coroutines.i.a(H.aH_(), null, null, new VideoProgressBarViewModel.b(H, z, null), 3);
            VideoProgressBarViewModel H2 = this.f92371a.H();
            AudioControlView audioControlView = this.f92371a.v;
            if (audioControlView == null || !audioControlView.e()) {
                z2 = false;
            } else {
                z2 = true;
            }
            H2.a(z2, this.f92371a.F());
            this.f92371a.hashCode();
            com.bytedance.assem.arch.b.j jVar = this.f92371a.n;
            if (jVar != null) {
                jVar.hashCode();
            }
            com.bytedance.assem.arch.b.l.b(this.f92371a);
            VideoProgressBarViewModel H3 = this.f92371a.H();
            AudioControlView audioControlView2 = this.f92371a.v;
            if (audioControlView2 == null || !audioControlView2.e()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!H3.a(z3, this.f92371a.F())) {
                return false;
            }
            this.f92371a.H().a(i2, keyEvent, true);
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f92371a.w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setAlpha(0.0f);
            }
            if (i2 == 25) {
                a aVar = this.f92371a;
                if (aVar.v != null) {
                    a.a(aVar.H(), new ad(aVar));
                }
            } else {
                a aVar2 = this.f92371a;
                if (aVar2.v != null) {
                    a.a(aVar2.H(), new ac(aVar2));
                }
            }
            return true;
        }
    }
}
