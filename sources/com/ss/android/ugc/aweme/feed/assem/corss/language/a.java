package com.ss.android.ugc.aweme.feed.assem.corss.language;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    public static final int D = (((int) com.ss.android.ugc.tools.utils.r.a(com.bytedance.ies.ugc.appcontext.d.a(), 58.0f)) + com.ss.android.ugc.aweme.base.utils.i.b());
    public static final int E;
    public static final int F = ((int) com.ss.android.ugc.tools.utils.r.a(com.bytedance.ies.ugc.appcontext.d.a(), 32.0f));
    public static final i G = new i((byte) 0);
    private static final int K;
    private static final int L;
    static final /* synthetic */ h.k.i[] u = {new h.f.b.y(a.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/feed/assem/corss/language/VideoCLACaptionViewModel;", 0)};
    public ImageView A;
    public ImageView B;
    public ValueAnimator C;
    private final h.h.d H;
    private final h.h I = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    private final h.h J = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    private SparseArray M;
    public com.bytedance.tux.tooltip.a v;
    public FrameLayout w;
    public LinearLayout x;
    public LinearLayout y;
    public TuxTextView z;

    public static final class b extends h.f.b.m implements h.f.a.b<l, l> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58094);
        }

        public b() {
            super(1);
        }

        public final l invoke(l lVar) {
            h.f.b.l.c(lVar, "");
            return lVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58095);
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
            Covode.recordClassIndex(58098);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    private final VideoViewModel I() {
        return (VideoViewModel) this.I.getValue();
    }

    private final VideoPlayViewModel J() {
        return (VideoPlayViewModel) this.J.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.tk;
    }

    public final VideoCLACaptionViewModel F() {
        return (VideoCLACaptionViewModel) this.H.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.M == null) {
            this.M = new SparseArray();
        }
        View view = (View) this.M.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.M.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class i {
        static {
            Covode.recordClassIndex(58101);
        }

        private i() {
        }

        public /* synthetic */ i(byte b2) {
            this();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58096);
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
            Covode.recordClassIndex(58097);
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
            Covode.recordClassIndex(58099);
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
            Covode.recordClassIndex(58100);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$a  reason: collision with other inner class name */
    public static final class C2233a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2233a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.a(true);
            com.bytedance.tux.tooltip.a aVar = this.this$0.v;
            if (aVar != null) {
                aVar.dismiss();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), b.f92128a, (com.bytedance.assem.arch.viewModel.k) null, n.f92116a, 6);
        f.a.a(this, F(), c.f92129a, (com.bytedance.assem.arch.viewModel.k) null, o.f92117a, 6);
    }

    static final class z extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            LinearLayout linearLayout;
            TuxTextView tuxTextView = this.this$0.z;
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
            TuxTextView tuxTextView2 = this.this$0.z;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            ImageView imageView = this.this$0.A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (!this.this$0.F().D && (linearLayout = this.this$0.y) != null) {
                linearLayout.setVisibility(0);
            }
            com.bytedance.tux.tooltip.a aVar = this.this$0.v;
            if (aVar != null) {
                aVar.dismiss();
            }
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(58091);
        int a2 = (int) com.ss.android.ugc.tools.utils.r.a(com.bytedance.ies.ugc.appcontext.d.a(), 16.0f);
        K = a2;
        int a3 = (int) com.ss.android.ugc.tools.utils.r.a(com.bytedance.ies.ugc.appcontext.d.a(), 56.0f);
        L = a3;
        E = Math.min((int) com.ss.android.ugc.tools.utils.r.a(com.bytedance.ies.ugc.appcontext.d.a(), 320.0f), (com.ss.android.ugc.aweme.base.utils.i.b(com.bytedance.ies.ugc.appcontext.d.a()) - a2) - a3);
    }

    public a() {
        h.k.c a2 = ab.a(VideoCLACaptionViewModel.class);
        this.H = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new C2233a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    public final void H() {
        boolean z2;
        CharSequence text;
        String str;
        Aweme aweme;
        TuxTextView tuxTextView = this.z;
        if (tuxTextView != null) {
            tuxTextView.setText(F().y);
        }
        VideoCLACaptionViewModel F2 = F();
        LinearLayout linearLayout = this.y;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        Aweme aweme2 = null;
        if (F2.A != -1 && z2) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - F2.A;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) F2.g();
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) F2.g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", ac.e(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) F2.g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            }
            com.ss.android.ugc.aweme.common.r.a("cla_caption_switch_language_time", a3.a("author_id", ac.a(aweme2)).a("duration", elapsedRealtime).a("enable_experiment", com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1)).f66730a);
        }
        if (F().f92095m) {
            ImageView imageView = this.B;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            TuxTextView tuxTextView2 = this.z;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            ImageView imageView2 = this.A;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView3 = this.B;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.y;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.x;
        if (linearLayout3 != null) {
            linearLayout3.setAlpha(1.0f);
        }
        LinearLayout linearLayout4 = this.x;
        if (linearLayout4 != null) {
            linearLayout4.setScaleX(1.0f);
        }
        LinearLayout linearLayout5 = this.x;
        if (linearLayout5 != null) {
            linearLayout5.setScaleY(1.0f);
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        LinearLayout linearLayout6 = this.y;
        if (linearLayout6 != null) {
            linearLayout6.setVisibility(8);
        }
        TuxTextView tuxTextView3 = this.z;
        if (tuxTextView3 == null || (text = tuxTextView3.getText()) == null || text.length() == 0) {
            TuxTextView tuxTextView4 = this.z;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            ImageView imageView5 = this.A;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.z;
        if (tuxTextView5 != null) {
            tuxTextView5.setVisibility(0);
        }
        ImageView imageView6 = this.A;
        if (imageView6 != null) {
            imageView6.setVisibility(F().k());
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92111a;

        static {
            Covode.recordClassIndex(58103);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(a aVar) {
            this.f92111a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f92111a.H();
        }
    }

    public static final class m extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92115a;

        static {
            Covode.recordClassIndex(58105);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(a aVar) {
            this.f92115a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f92115a.H();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92124a;

        static {
            Covode.recordClassIndex(58114);
        }

        v(a aVar) {
            this.f92124a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92124a.a(false);
            VideoCLACaptionViewModel F = this.f92124a.F();
            F.b(new VideoCLACaptionViewModel.g(F));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f92108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f92109c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f92110d;

        static {
            Covode.recordClassIndex(58102);
        }

        j(a aVar, boolean z, z.c cVar, z.c cVar2) {
            this.f92107a = aVar;
            this.f92108b = z;
            this.f92109c = cVar;
            this.f92110d = cVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f92107a.B;
            if (imageView != null) {
                h.f.b.l.b(valueAnimator, "");
                imageView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f92108b) {
                LinearLayout linearLayout = this.f92107a.x;
                if (linearLayout != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout.setAlpha(valueAnimator.getAnimatedFraction());
                }
                LinearLayout linearLayout2 = this.f92107a.x;
                if (linearLayout2 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout2.setScaleX(((((float) a.F) * 1.0f) / ((float) this.f92109c.element)) + ((((float) (this.f92109c.element - a.F)) * valueAnimator.getAnimatedFraction()) / ((float) this.f92109c.element)));
                }
                LinearLayout linearLayout3 = this.f92107a.x;
                if (linearLayout3 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    linearLayout3.setScaleY(((((float) a.F) * 1.0f) / ((float) this.f92110d.element)) + ((((float) (this.f92110d.element - a.F)) * valueAnimator.getAnimatedFraction()) / ((float) this.f92110d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f92114c;

        static {
            Covode.recordClassIndex(58104);
        }

        l(a aVar, int i2, int i3) {
            this.f92112a = aVar;
            this.f92113b = i2;
            this.f92114c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f92112a.B;
            if (imageView != null) {
                h.f.b.l.b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout = this.f92112a.x;
            if (linearLayout != null) {
                h.f.b.l.b(valueAnimator, "");
                linearLayout.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout2 = this.f92112a.x;
            if (linearLayout2 != null) {
                int i2 = this.f92113b;
                h.f.b.l.b(valueAnimator, "");
                linearLayout2.setScaleX(((((float) i2) - (((float) (i2 - a.F)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f92113b));
            }
            LinearLayout linearLayout3 = this.f92112a.x;
            if (linearLayout3 != null) {
                int i3 = this.f92114c;
                h.f.b.l.b(valueAnimator, "");
                linearLayout3.setScaleY(((((float) i3) - (((float) (i3 - a.F)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f92114c));
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        this.w = (FrameLayout) B().findViewById(R.id.a2g);
        this.x = (LinearLayout) B().findViewById(R.id.a2k);
        this.y = (LinearLayout) B().findViewById(R.id.a2i);
        this.z = (TuxTextView) B().findViewById(R.id.a2j);
        this.A = (ImageView) B().findViewById(R.id.eqn);
        this.B = (ImageView) B().findViewById(R.id.bg3);
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new p(this));
        }
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(new v(this));
        }
        f.a.a(this, I(), h.f92134a, (com.bytedance.assem.arch.viewModel.k) null, w.f92125a, 6);
        f.a.a(this, I(), i.f92135a, (com.bytedance.assem.arch.viewModel.k) null, x.f92126a, 6);
        f.a.a(this, I(), j.f92136a, (com.bytedance.assem.arch.viewModel.k) null, y.f92127a, 6);
        f.a.a(this, I(), k.f92137a, (com.bytedance.assem.arch.viewModel.k) null, q.f92119a, 6);
        f.a.a(this, J(), d.f92130a, (com.bytedance.assem.arch.viewModel.k) null, r.f92120a, 6);
        f.a.a(this, J(), e.f92131a, (com.bytedance.assem.arch.viewModel.k) null, s.f92121a, 6);
        f.a.a(this, J(), f.f92132a, (com.bytedance.assem.arch.viewModel.k) null, t.f92122a, 6);
        f.a.a(this, J(), g.f92133a, (com.bytedance.assem.arch.viewModel.k) null, u.f92123a, 6);
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92118a;

        static {
            Covode.recordClassIndex(58108);
        }

        p(a aVar) {
            this.f92118a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str;
            String str2;
            String str3;
            LinearLayout linearLayout;
            com.bytedance.tux.tooltip.h hVar;
            VideoItemParams videoItemParams;
            Aweme aweme5;
            String str4;
            Aweme aweme6;
            Aweme aweme7;
            Aweme aweme8;
            ClickAgent.onClick(view);
            VideoCLACaptionViewModel F = this.f92118a.F();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
            Context context = null;
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("have_transl", ah.b(aweme) ? 1 : 0).a("use_transl", !F.f92094l ? 1 : 0);
            VideoItemParams videoItemParams3 = (VideoItemParams) F.g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_type", ah.c(aweme2));
            VideoItemParams videoItemParams4 = (VideoItemParams) F.g();
            if (videoItemParams4 != null) {
                aweme3 = videoItemParams4.mAweme;
            } else {
                aweme3 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("subtitle_lang", ah.e(aweme3)).a("have_tts", F.C ? 1 : 0).a("use_tts", F.j() ? 1 : 0);
            boolean z = F.f92094l;
            VideoItemParams videoItemParams5 = (VideoItemParams) F.g();
            if (videoItemParams5 != null) {
                aweme4 = videoItemParams5.mAweme;
            } else {
                aweme4 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("cla_subtitle_type", ah.a(z, aweme4));
            VideoItemParams videoItemParams6 = (VideoItemParams) F.g();
            if (videoItemParams6 == null || (aweme8 = videoItemParams6.mAweme) == null) {
                str = null;
            } else {
                str = aweme8.getAid();
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("group_id", str);
            VideoItemParams videoItemParams7 = (VideoItemParams) F.g();
            if (videoItemParams7 == null || (aweme7 = videoItemParams7.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme7.getAuthorUid();
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("author_id", str2);
            VideoItemParams videoItemParams8 = (VideoItemParams) F.g();
            if (videoItemParams8 != null) {
                str3 = videoItemParams8.mEventType;
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.common.r.a("click_subtitle", a7.a("enter_from", str3).f66730a);
            if (!(com.ss.android.ugc.aweme.feed.caption.a.a() || (videoItemParams = (VideoItemParams) F.g()) == null || (aweme5 = videoItemParams.mAweme) == null || aweme5.getAuthorUid() == null)) {
                VideoItemParams videoItemParams9 = (VideoItemParams) F.g();
                if (videoItemParams9 == null || (aweme6 = videoItemParams9.mAweme) == null) {
                    str4 = null;
                } else {
                    str4 = aweme6.getAuthorUid();
                }
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (!h.f.b.l.a((Object) str4, (Object) g2.getCurUserId())) {
                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                    if (j2 instanceof androidx.fragment.app.e) {
                        context = j2;
                    }
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                    if (eVar != null) {
                        F.a(eVar);
                        return;
                    }
                }
            }
            a aVar = this.f92118a;
            if (aVar.ar_() != null && aVar.x != null && (linearLayout = aVar.x) != null && linearLayout.getVisibility() == 0) {
                Context ar_ = aVar.ar_();
                if (ar_ == null) {
                    h.f.b.l.b();
                }
                int i2 = -((int) com.ss.android.ugc.tools.utils.r.a(ar_, 8.0f));
                VideoCLACaptionViewModel F2 = aVar.F();
                LinearLayout linearLayout2 = aVar.x;
                if (linearLayout2 == null) {
                    h.f.b.l.b();
                }
                z zVar = new z(aVar);
                aa aaVar = new aa(aVar);
                h.f.b.l.d(linearLayout2, "");
                h.f.b.l.d(zVar, "");
                h.f.b.l.d(aaVar, "");
                Context context2 = linearLayout2.getContext();
                h.f.b.l.b(context2, "");
                com.bytedance.tux.tooltip.b b2 = new com.bytedance.tux.tooltip.a.a.b(context2).b(linearLayout2);
                Context context3 = linearLayout2.getContext();
                h.f.b.l.b(context3, "");
                com.bytedance.tux.tooltip.b d2 = ((com.bytedance.tux.tooltip.a.a.b) b2.a(context3.getResources().getColor(R.color.c7)).a(-1001L)).a(new VideoCLACaptionViewModel.a(F2, zVar, aaVar)).b(new VideoCLACaptionViewModel.b(F2)).a(new VideoCLACaptionViewModel.c(F2)).b(i2).c().b(true).d(com.ss.android.ugc.aweme.feed.caption.c.C);
                if (F2.v) {
                    hVar = com.bytedance.tux.tooltip.h.BOTTOM;
                } else {
                    hVar = com.bytedance.tux.tooltip.h.TOP;
                }
                d2.a(hVar);
                aVar.v = d2.d();
                com.bytedance.tux.tooltip.a aVar2 = aVar.v;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }
    }

    public final void a(boolean z2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        VideoCLACaptionViewModel F2 = F();
        F2.f92095m = z2;
        TranslatedCaptionCacheServiceImpl.j().a(F2.f92095m);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.f.a(!F2.f92095m));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        h.f.b.l.b(ofInt, "");
        ofInt.setDuration(200L);
        this.C = ofInt;
        if (!gb.a() && (linearLayout4 = this.x) != null) {
            linearLayout4.setPivotX(0.0f);
        }
        if (F().v) {
            LinearLayout linearLayout5 = this.x;
            if (linearLayout5 != null) {
                linearLayout5.setPivotY(0.0f);
            }
        } else {
            LinearLayout linearLayout6 = this.x;
            if (linearLayout6 != null) {
                linearLayout6.setPivotY((float) linearLayout6.getHeight());
            }
        }
        if (!z2) {
            LinearLayout linearLayout7 = this.x;
            if (linearLayout7 != null) {
                linearLayout7.setAlpha(1.0f);
            }
            LinearLayout linearLayout8 = this.x;
            if (linearLayout8 != null) {
                linearLayout8.setScaleX(1.0f);
            }
            LinearLayout linearLayout9 = this.x;
            if (linearLayout9 != null) {
                linearLayout9.setScaleY(1.0f);
            }
            String str = F().y;
            boolean isEmpty = TextUtils.isEmpty(str);
            z.c cVar = new z.c();
            int i2 = E;
            cVar.element = i2;
            z.c cVar2 = new z.c();
            cVar2.element = F;
            if (isEmpty) {
                TuxTextView tuxTextView = this.z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = this.A;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView2 = this.z;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                ImageView imageView2 = this.A;
                if (imageView2 != null) {
                    imageView2.setVisibility(F().k());
                }
                TuxTextView tuxTextView3 = this.z;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(str);
                }
                LinearLayout linearLayout10 = this.x;
                if (linearLayout10 != null) {
                    linearLayout10.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                LinearLayout linearLayout11 = this.x;
                if (linearLayout11 == null) {
                    h.f.b.l.b();
                }
                cVar.element = linearLayout11.getMeasuredWidth();
                LinearLayout linearLayout12 = this.x;
                if (linearLayout12 == null) {
                    h.f.b.l.b();
                }
                cVar2.element = linearLayout12.getMeasuredHeight();
                if (gb.a() && (linearLayout3 = this.x) != null) {
                    linearLayout3.setPivotX((float) cVar.element);
                }
                if (!F().v && (linearLayout2 = this.x) != null) {
                    linearLayout2.setPivotY((float) cVar2.element);
                }
            }
            if (cVar.element > 0 && cVar2.element > 0) {
                ofInt.addUpdateListener(new j(this, isEmpty, cVar, cVar2));
            }
            ofInt.addListener(new k(this));
        } else {
            LinearLayout linearLayout13 = this.x;
            if (linearLayout13 == null) {
                h.f.b.l.b();
            }
            int width = linearLayout13.getWidth();
            LinearLayout linearLayout14 = this.x;
            if (linearLayout14 == null) {
                h.f.b.l.b();
            }
            int height = linearLayout14.getHeight();
            if (gb.a() && (linearLayout = this.x) != null) {
                linearLayout.setPivotX((float) width);
            }
            ImageView imageView3 = this.B;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.B;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
            }
            if (width > 0 && height > 0) {
                ofInt.addUpdateListener(new l(this, width, height));
            }
            ofInt.addListener(new m(this));
        }
        ofInt.start();
    }

    static final class o extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.g, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92117a = new o();

        static {
            Covode.recordClassIndex(58107);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.g gVar) {
            a aVar2 = aVar;
            com.bytedance.assem.arch.extensions.g gVar2 = gVar;
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(gVar2, "");
            if (gVar2.f25641a) {
                aVar2.H();
            }
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92120a = new r();

        static {
            Covode.recordClassIndex(58110);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                aVar3.F().i();
            }
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92121a = new s();

        static {
            Covode.recordClassIndex(58111);
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
                aVar3.F().i();
            }
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92119a = new q();

        static {
            Covode.recordClassIndex(58109);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                TuxTextView tuxTextView = aVar3.z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = aVar3.B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ImageView imageView2 = aVar3.A;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                LinearLayout linearLayout = aVar3.y;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                ValueAnimator valueAnimator = aVar3.C;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                com.bytedance.tux.tooltip.a aVar4 = aVar3.v;
                if (aVar4 != null) {
                    aVar4.dismiss();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f92127a = new y();

        static {
            Covode.recordClassIndex(58117);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                VideoCLACaptionViewModel F = aVar3.F();
                F.f92093k = -1;
                F.f92094l = false;
                F.n = false;
                F.v = false;
                F.w = false;
                F.x = false;
                F.z = false;
                F.y = "";
                F.A = -1;
                LinearLayout linearLayout = aVar3.x;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                TuxTextView tuxTextView = aVar3.z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = aVar3.B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ImageView imageView2 = aVar3.A;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                LinearLayout linearLayout2 = aVar3.y;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                ValueAnimator valueAnimator = aVar3.C;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                com.bytedance.tux.tooltip.a aVar4 = aVar3.v;
                if (aVar4 != null) {
                    aVar4.dismiss();
                }
            }
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92116a = new n();

        static {
            Covode.recordClassIndex(58106);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Boolean bool) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup.LayoutParams layoutParams4;
            ViewGroup.LayoutParams layoutParams5;
            ViewGroup.LayoutParams layoutParams6;
            a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(aVar2, "");
            if (booleanValue) {
                FrameLayout.LayoutParams layoutParams7 = null;
                if (aVar2.F().v) {
                    FrameLayout frameLayout = aVar2.w;
                    if (frameLayout != null) {
                        layoutParams4 = frameLayout.getLayoutParams();
                    } else {
                        layoutParams4 = null;
                    }
                    if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
                        layoutParams4 = null;
                    }
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams4;
                    if (layoutParams8 != null) {
                        layoutParams8.gravity = 8388659;
                        layoutParams8.topMargin = a.D;
                        LinearLayout linearLayout = aVar2.x;
                        if (linearLayout != null) {
                            layoutParams5 = linearLayout.getLayoutParams();
                        } else {
                            layoutParams5 = null;
                        }
                        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
                            layoutParams5 = null;
                        }
                        LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams5;
                        if (layoutParams9 != null) {
                            layoutParams9.gravity = 8388659;
                        }
                        ImageView imageView = aVar2.B;
                        if (imageView != null) {
                            layoutParams6 = imageView.getLayoutParams();
                        } else {
                            layoutParams6 = null;
                        }
                        if (layoutParams6 instanceof FrameLayout.LayoutParams) {
                            layoutParams7 = layoutParams6;
                        }
                        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams7;
                        if (layoutParams10 != null) {
                            layoutParams10.gravity = 8388659;
                        }
                        FrameLayout frameLayout2 = aVar2.w;
                        if (frameLayout2 != null) {
                            frameLayout2.setLayoutParams(layoutParams8);
                        }
                    }
                } else {
                    FrameLayout frameLayout3 = aVar2.w;
                    if (frameLayout3 != null) {
                        layoutParams = frameLayout3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                        layoutParams = null;
                    }
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams11 != null) {
                        layoutParams11.gravity = 8388691;
                        LinearLayout linearLayout2 = aVar2.x;
                        if (linearLayout2 != null) {
                            layoutParams2 = linearLayout2.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
                            layoutParams2 = null;
                        }
                        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams2;
                        if (layoutParams12 != null) {
                            layoutParams12.gravity = 8388691;
                        }
                        ImageView imageView2 = aVar2.B;
                        if (imageView2 != null) {
                            layoutParams3 = imageView2.getLayoutParams();
                        } else {
                            layoutParams3 = null;
                        }
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            layoutParams7 = layoutParams3;
                        }
                        FrameLayout.LayoutParams layoutParams13 = layoutParams7;
                        if (layoutParams13 != null) {
                            layoutParams13.gravity = 8388691;
                        }
                        FrameLayout frameLayout4 = aVar2.w;
                        if (frameLayout4 != null) {
                            frameLayout4.setLayoutParams(layoutParams11);
                        }
                    }
                }
                LinearLayout linearLayout3 = aVar2.x;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout4 = aVar2.x;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                ImageView imageView3 = aVar2.B;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f92126a = new x();

        static {
            Covode.recordClassIndex(58116);
        }

        x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            Aweme aweme;
            boolean z;
            Aweme aweme2;
            Video video;
            CaptionModel captionModel;
            List<CaptionItemModel> captionList;
            Aweme aweme3;
            Video video2;
            CaptionModel captionModel2;
            VideoItemParams videoItemParams;
            Aweme aweme4;
            Video video3;
            CaptionModel captionModel3;
            List<CaptionItemModel> captionList2;
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                VideoCLACaptionViewModel F = aVar3.F();
                F.n = F.h();
                VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                Aweme aweme5 = null;
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                } else {
                    aweme = null;
                }
                F.D = ah.k(aweme);
                F.B = TranslatedCaptionCacheServiceImpl.j().e();
                if (!TranslatedCaptionCacheServiceImpl.j().d() || !F.D) {
                    z = false;
                } else {
                    z = true;
                }
                F.C = z;
                VideoItemParams videoItemParams3 = (VideoItemParams) F.g();
                if (!(videoItemParams3 == null || (aweme3 = videoItemParams3.mAweme) == null || (video2 = aweme3.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || captionModel2.getCaptionList() == null || ((videoItemParams = (VideoItemParams) F.g()) != null && (aweme4 = videoItemParams.mAweme) != null && (video3 = aweme4.getVideo()) != null && (captionModel3 = video3.getCaptionModel()) != null && (captionList2 = captionModel3.getCaptionList()) != null && captionList2.isEmpty()))) {
                    F.b(new VideoCLACaptionViewModel.i(F));
                }
                if (!F.n) {
                    F.a(VideoCLACaptionViewModel.d.f92099a);
                } else {
                    F.f92093k = SystemClock.elapsedRealtime();
                    VideoItemParams videoItemParams4 = (VideoItemParams) F.g();
                    if (videoItemParams4 != null) {
                        aweme5 = videoItemParams4.mAweme;
                    }
                    F.v = ah.g(aweme5);
                    TranslatedCaptionCacheServiceImpl.j().a("");
                    F.f92095m = TranslatedCaptionCacheServiceImpl.j().b();
                    VideoItemParams videoItemParams5 = (VideoItemParams) F.g();
                    if (!(videoItemParams5 == null || (aweme2 = videoItemParams5.mAweme) == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || !(!captionList.isEmpty()))) {
                        com.ss.android.ugc.aweme.video.i O = com.ss.android.ugc.aweme.video.v.O();
                        h.f.b.l.b(O, "");
                        O.L().l();
                        F.a(VideoCLACaptionViewModel.e.f92100a);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f92122a = new t();

        static {
            Covode.recordClassIndex(58112);
        }

        t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            a aVar3 = aVar;
            String str4 = "";
            h.f.b.l.d(aVar3, str4);
            if (aVar2 != null) {
                VideoCLACaptionViewModel F = aVar3.F();
                if (F.n && F.j()) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    VideoItemParams videoItemParams = (VideoItemParams) F.g();
                    Aweme aweme7 = null;
                    if (videoItemParams != null) {
                        str = videoItemParams.mEventType;
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
                    VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                    if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                        str2 = null;
                    } else {
                        str2 = aweme6.getAid();
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2);
                    VideoItemParams videoItemParams3 = (VideoItemParams) F.g();
                    if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                        str3 = null;
                    } else {
                        str3 = aweme5.getAuthorUid();
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str3).a("use_transl", !F.f92094l ? 1 : 0);
                    VideoItemParams videoItemParams4 = (VideoItemParams) F.g();
                    if (videoItemParams4 != null) {
                        aweme = videoItemParams4.mAweme;
                    } else {
                        aweme = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_type", ah.c(aweme));
                    VideoItemParams videoItemParams5 = (VideoItemParams) F.g();
                    if (videoItemParams5 != null) {
                        aweme2 = videoItemParams5.mAweme;
                    } else {
                        aweme2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("have_transl", ah.b(aweme2) ? 1 : 0);
                    if (F.f92094l) {
                        VideoItemParams videoItemParams6 = (VideoItemParams) F.g();
                        if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                            str4 = languageName;
                        }
                    } else {
                        VideoItemParams videoItemParams7 = (VideoItemParams) F.g();
                        if (videoItemParams7 != null) {
                            aweme3 = videoItemParams7.mAweme;
                        } else {
                            aweme3 = null;
                        }
                        str4 = ah.e(aweme3);
                    }
                    com.ss.android.ugc.aweme.app.f.d a7 = a6.a("subtitle_lang", str4).a("have_tts", F.C ? 1 : 0).a("use_tts", F.j() ? 1 : 0);
                    boolean z = F.f92094l;
                    VideoItemParams videoItemParams8 = (VideoItemParams) F.g();
                    if (videoItemParams8 != null) {
                        aweme7 = videoItemParams8.mAweme;
                    }
                    com.ss.android.ugc.aweme.common.r.a("subtitle_tts_play", a7.a("cla_subtitle_type", ah.a(z, aweme7)).f66730a);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f92123a = new u();

        static {
            Covode.recordClassIndex(58113);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            a aVar3 = aVar;
            String str4 = "";
            h.f.b.l.d(aVar3, str4);
            if (aVar2 != null) {
                VideoCLACaptionViewModel F = aVar3.F();
                if (F.n && F.j()) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    VideoItemParams videoItemParams = (VideoItemParams) F.g();
                    Aweme aweme7 = null;
                    if (videoItemParams != null) {
                        str = videoItemParams.mEventType;
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
                    VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                    if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                        str2 = null;
                    } else {
                        str2 = aweme6.getAid();
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2);
                    VideoItemParams videoItemParams3 = (VideoItemParams) F.g();
                    if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                        str3 = null;
                    } else {
                        str3 = aweme5.getAuthorUid();
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str3).a("use_transl", !F.f92094l ? 1 : 0);
                    VideoItemParams videoItemParams4 = (VideoItemParams) F.g();
                    if (videoItemParams4 != null) {
                        aweme = videoItemParams4.mAweme;
                    } else {
                        aweme = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("subtitle_type", ah.c(aweme));
                    VideoItemParams videoItemParams5 = (VideoItemParams) F.g();
                    if (videoItemParams5 != null) {
                        aweme2 = videoItemParams5.mAweme;
                    } else {
                        aweme2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("have_transl", ah.b(aweme2) ? 1 : 0);
                    if (F.f92094l) {
                        VideoItemParams videoItemParams6 = (VideoItemParams) F.g();
                        if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                            str4 = languageName;
                        }
                    } else {
                        VideoItemParams videoItemParams7 = (VideoItemParams) F.g();
                        if (videoItemParams7 != null) {
                            aweme3 = videoItemParams7.mAweme;
                        } else {
                            aweme3 = null;
                        }
                        str4 = ah.e(aweme3);
                    }
                    com.ss.android.ugc.aweme.app.f.d a7 = a6.a("subtitle_lang", str4).a("have_tts", F.C ? 1 : 0).a("use_tts", F.j() ? 1 : 0);
                    boolean z = F.f92094l;
                    VideoItemParams videoItemParams8 = (VideoItemParams) F.g();
                    if (videoItemParams8 != null) {
                        aweme7 = videoItemParams8.mAweme;
                    }
                    com.ss.android.ugc.aweme.common.r.a("subtitle_tts_play_end", a7.a("cla_subtitle_type", ah.a(z, aweme7)).f66730a);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends VideoCaptionUpdateParams>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f92125a = new w();

        static {
            Covode.recordClassIndex(58115);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends VideoCaptionUpdateParams> aVar2) {
            Aweme aweme;
            Video video;
            CaptionModel captionModel;
            List<CaptionItemModel> captionList;
            String str;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            String str2;
            Aweme aweme3;
            String str3;
            String str4;
            Aweme aweme4;
            String str5;
            Aweme aweme5;
            Aweme aweme6;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends VideoCaptionUpdateParams> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoCLACaptionViewModel F = aVar3.F();
                T t = aVar4.f25631b;
                h.f.b.l.d(t, "");
                if (F.n) {
                    Context context = null;
                    if (F.f92093k != -1 && !F.z) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - F.f92093k;
                        F.f92093k = -1;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                        if (videoItemParams2 != null) {
                            str5 = videoItemParams2.mEventType;
                        } else {
                            str5 = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str5);
                        VideoItemParams videoItemParams3 = (VideoItemParams) F.g();
                        if (videoItemParams3 != null) {
                            aweme5 = videoItemParams3.mAweme;
                        } else {
                            aweme5 = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", ac.e(aweme5));
                        VideoItemParams videoItemParams4 = (VideoItemParams) F.g();
                        if (videoItemParams4 != null) {
                            aweme6 = videoItemParams4.mAweme;
                        } else {
                            aweme6 = null;
                        }
                        com.ss.android.ugc.aweme.common.r.a("cla_caption_first_visible_time", a3.a("author_id", ac.a(aweme6)).a("duration", elapsedRealtime).a("enable_experiment", com.bytedance.ies.abmock.b.a().a(true, "player_enable_opt_subload_time", 1)).f66730a);
                    }
                    VideoItemParams videoItemParams5 = (VideoItemParams) F.g();
                    if (!(videoItemParams5 == null || (aweme = videoItemParams5.mAweme) == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || !(!captionList.isEmpty()))) {
                        String str6 = t.awemeId;
                        VideoItemParams videoItemParams6 = (VideoItemParams) F.g();
                        if (videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null) {
                            str = null;
                        } else {
                            str = aweme4.getAid();
                        }
                        if (h.f.b.l.a((Object) str, (Object) str6) && (!F.z || !(((str3 = t.captionText) == null || str3.length() == 0) && ((str4 = F.y) == null || str4.length() == 0)))) {
                            F.z = true;
                            if (!(com.ss.android.ugc.aweme.feed.caption.a.a() || (videoItemParams = (VideoItemParams) F.g()) == null || (aweme2 = videoItemParams.mAweme) == null || aweme2.getAuthorUid() == null)) {
                                VideoItemParams videoItemParams7 = (VideoItemParams) F.g();
                                if (videoItemParams7 == null || (aweme3 = videoItemParams7.mAweme) == null) {
                                    str2 = null;
                                } else {
                                    str2 = aweme3.getAuthorUid();
                                }
                                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                                h.f.b.l.b(g2, "");
                                if ((!h.f.b.l.a((Object) str2, (Object) g2.getCurUserId())) && F.j()) {
                                    Context j2 = com.bytedance.ies.ugc.appcontext.f.j();
                                    if (j2 instanceof androidx.fragment.app.e) {
                                        context = j2;
                                    }
                                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                                    if (eVar != null) {
                                        F.a(eVar);
                                    }
                                }
                            }
                            F.y = t.captionText;
                            if (!F.w) {
                                F.a(VideoCLACaptionViewModel.o.f92106a);
                            }
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }
}
