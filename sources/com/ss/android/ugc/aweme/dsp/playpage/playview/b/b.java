package com.ss.android.ugc.aweme.dsp.playpage.playview.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.r;

public final class b implements j, com.ss.android.ugc.aweme.favorites.g.d, i, org.greenrobot.eventbus.j {
    public static final int o = R.color.a6;
    public static final int p = R.color.bh;
    public static final a q = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.base.b f83807a;

    /* renamed from: b  reason: collision with root package name */
    public int f83808b = -1;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.b.c f83809c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f83810d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f83811e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.g.a f83812f;

    /* renamed from: g  reason: collision with root package name */
    public AnimatorSet f83813g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f83814h;

    /* renamed from: i  reason: collision with root package name */
    public Handler f83815i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f83816j = new g(this);

    /* renamed from: k  reason: collision with root package name */
    public Runnable f83817k = new h(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f83818l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f83819m;
    public final View n;

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(65, new org.greenrobot.eventbus.g(b.class, "onCollectAwemeEvent", com.ss.android.ugc.aweme.favorites.d.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(86, new org.greenrobot.eventbus.g(b.class, "onDspMusicCollectEvent", com.ss.android.ugc.aweme.dsp.common.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52271);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.b.b$b  reason: collision with other inner class name */
    public static final class C1997b implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83820a;

        static {
            Covode.recordClassIndex(52272);
        }

        C1997b(b bVar) {
            this.f83820a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f83820a.e();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83826a;

        static {
            Covode.recordClassIndex(52277);
        }

        g(b bVar) {
            this.f83826a = bVar;
        }

        public final void run() {
            AnimatorSet animatorSet = this.f83826a.f83813g;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83827a;

        static {
            Covode.recordClassIndex(52278);
        }

        h(b bVar) {
            this.f83827a = bVar;
        }

        public final void run() {
            AnimatorSet animatorSet = this.f83827a.f83814h;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    static {
        Covode.recordClassIndex(52270);
    }

    public final void e() {
        String str;
        DspStruct c2;
        Aweme aweme;
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83809c;
        if (cVar != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83809c;
                if (cVar2 == null || (c2 = cVar2.c()) == null || (aweme = c2.getAweme()) == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "", "click_favorite_video", new ap().a("group_id", str).a("log_pb", ac.c(str)).f142646a, new C1997b(this));
                return;
            }
            Handler handler = this.f83815i;
            if (handler != null) {
                handler.post(this.f83817k);
            }
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar3 = this.f83809c;
            if (cVar3 != null) {
                com.ss.android.ugc.aweme.dsp.common.b.a.a(cVar3.d());
            }
            com.ss.android.ugc.aweme.favorites.g.a aVar = this.f83812f;
            if (aVar != null) {
                Object[] objArr = new Object[3];
                int i2 = 0;
                objArr[0] = 2;
                objArr[1] = cVar.c().getAweme().getAid();
                if (cVar.n() != 1) {
                    i2 = 1;
                }
                objArr[2] = Integer.valueOf(i2);
                aVar.a(objArr);
            }
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83823a;

        static {
            Covode.recordClassIndex(52274);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d(b bVar) {
            this.f83823a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            AnimatorSet animatorSet;
            this.f83823a.f83818l = true;
            AnimatorSet animatorSet2 = this.f83823a.f83814h;
            if (!(animatorSet2 == null || !animatorSet2.isStarted() || (animatorSet = this.f83823a.f83814h) == null)) {
                animatorSet.cancel();
            }
            Context context = this.f83823a.n.getContext();
            l.b(context, "");
            int color = context.getResources().getColor(b.o);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(n.b(this.f83823a.n.getContext(), 2.0f));
            Drawable mutate = androidx.core.graphics.drawable.a.e(gradientDrawable).mutate();
            l.b(mutate, "");
            TuxTextView tuxTextView = this.f83823a.f83810d;
            if (tuxTextView != null) {
                tuxTextView.setBackground(com.ss.android.ugc.aweme.utils.j.a(mutate, color));
            }
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83824a;

        static {
            Covode.recordClassIndex(52275);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e(b bVar) {
            this.f83824a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            AnimatorSet animatorSet;
            this.f83824a.f83818l = false;
            AnimatorSet animatorSet2 = this.f83824a.f83813g;
            if (animatorSet2 != null && animatorSet2.isStarted() && (animatorSet = this.f83824a.f83813g) != null) {
                animatorSet.cancel();
            }
        }
    }

    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83825a;

        static {
            Covode.recordClassIndex(52276);
        }

        public f(b bVar) {
            this.f83825a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83825a.e();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDspMusicCollectEvent(com.ss.android.ugc.aweme.dsp.common.a.a aVar) {
        l.d(aVar, "");
        a(aVar.f83278a, aVar.f83279b);
    }

    public b(View view) {
        l.d(view, "");
        this.n = view;
    }

    @r(a = ThreadMode.MAIN)
    public final void onCollectAwemeEvent(com.ss.android.ugc.aweme.favorites.d.a aVar) {
        l.d(aVar, "");
        a(h.a.n.a(aVar.f90593a), aVar.f90594b);
    }

    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f83822b;

        static {
            Covode.recordClassIndex(52273);
        }

        public c(b bVar, Drawable drawable) {
            this.f83821a = bVar;
            this.f83822b = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            TuxTextView tuxTextView = this.f83821a.f83810d;
            if (tuxTextView != null) {
                tuxTextView.setBackground(com.ss.android.ugc.aweme.utils.j.a(this.f83822b, intValue));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        int i2;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        if (!this.f83819m) {
            com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83807a;
            if (bVar == null || (a2 = bVar.a()) == null) {
                i2 = 0;
            } else {
                i2 = a2.f83565a.h();
            }
            if (this.f83808b == 1 && i2 > 3000) {
                this.f83819m = true;
                Handler handler = this.f83815i;
                if (handler != null) {
                    handler.post(this.f83816j);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        Context context = this.n.getContext();
        l.b(context, "");
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    new com.bytedance.tux.g.b(activity).a(str).b();
                    return;
                }
                return;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    private final void a(List<String> list, int i2) {
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w;
        CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList;
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83807a;
        if (bVar != null && (a2 = bVar.a()) != null && (w = a2.m()) != null && (copyOnWriteArrayList = w.f83535c) != null) {
            for (T t : copyOnWriteArrayList) {
                if (list.contains(t.a())) {
                    t.a(i2);
                }
            }
            this.f83819m = true;
            Handler handler = this.f83815i;
            if (handler != null) {
                handler.removeCallbacks(this.f83816j);
            }
            Handler handler2 = this.f83815i;
            if (handler2 != null) {
                handler2.removeCallbacks(this.f83817k);
            }
            if (this.f83808b == 1) {
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83809c;
                if (cVar != null && cVar.n() == 0 && !this.f83818l) {
                    TuxTextView tuxTextView = this.f83810d;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.f83810d;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setAlpha(0.0f);
                    }
                    LinearLayout linearLayout = this.f83811e;
                    if (linearLayout != null) {
                        linearLayout.setTranslationY(n.b(this.n.getContext(), 56.0f));
                    }
                    Handler handler3 = this.f83815i;
                    if (handler3 != null) {
                        handler3.post(this.f83816j);
                    }
                } else if (this.f83818l) {
                    TuxTextView tuxTextView3 = this.f83810d;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(0);
                    }
                    TuxTextView tuxTextView4 = this.f83810d;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setAlpha(1.0f);
                    }
                    LinearLayout linearLayout2 = this.f83811e;
                    if (linearLayout2 != null) {
                        linearLayout2.setTranslationY(n.b(this.n.getContext(), 0.0f));
                    }
                    Handler handler4 = this.f83815i;
                    if (handler4 != null) {
                        handler4.post(this.f83817k);
                    }
                }
            } else {
                LinearLayout linearLayout3 = this.f83811e;
                if (linearLayout3 != null) {
                    linearLayout3.setTranslationY(n.b(this.n.getContext(), 56.0f));
                }
                TuxTextView tuxTextView5 = this.f83810d;
                if (tuxTextView5 != null) {
                    tuxTextView5.setVisibility(4);
                }
            }
        }
    }
}
