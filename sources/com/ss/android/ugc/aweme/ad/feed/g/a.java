package com.ss.android.ugc.aweme.ad.feed.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m;
import h.m.p;
import java.util.Objects;

public final class a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, b {

    /* renamed from: l  reason: collision with root package name */
    public static final C1473a f65857l = new C1473a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f65858a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f65859b;

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f65860c;

    /* renamed from: d  reason: collision with root package name */
    public com.facebook.fresco.animation.c.a f65861d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f65862e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f65863f;

    /* renamed from: g  reason: collision with root package name */
    public AwemeRawAd f65864g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.ad.feed.b f65865h;

    /* renamed from: i  reason: collision with root package name */
    long f65866i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ad.feed.c f65867j;

    /* renamed from: k  reason: collision with root package name */
    public final View f65868k;

    /* renamed from: m  reason: collision with root package name */
    private View f65869m;
    private View n;
    private View o;
    private LottieAnimationView p;
    private int q = -100;
    private int r = -100;
    private int s = -100;
    private int t = -100;
    private int u;
    private int v;
    private final h.h w = h.i.a(m.NONE, new b(this));
    private DataCenter x;
    private final View y;
    private final h.h z;

    static final class e implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f65872a = new e();

        static {
            Covode.recordClassIndex(40528);
        }

        e() {
        }
    }

    static {
        Covode.recordClassIndex(40523);
    }

    private final int f() {
        return ((Number) this.w.getValue()).intValue();
    }

    private final Runnable g() {
        return (Runnable) this.z.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$a  reason: collision with other inner class name */
    public static final class C1473a {
        static {
            Covode.recordClassIndex(40524);
        }

        private C1473a() {
        }

        public /* synthetic */ C1473a(byte b2) {
            this();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<Runnable> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ad.feed.g.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f65873a;

                static {
                    Covode.recordClassIndex(40530);
                }

                {
                    this.f65873a = r1;
                }

                public final void run() {
                    RemoteImageView remoteImageView;
                    com.facebook.drawee.h.a controller;
                    AwemeRawAd awemeRawAd = this.f65873a.this$0.f65864g;
                    if (awemeRawAd != null && awemeRawAd.getButtonIconAnimationRepeatTimes() != 0 && (remoteImageView = this.f65873a.this$0.f65860c) != null && (controller = remoteImageView.getController()) != null) {
                        l.b(controller, "");
                        Animatable i2 = controller.i();
                        if (i2 != null) {
                            a aVar = this.f65873a.this$0;
                            Objects.requireNonNull(i2, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
                            aVar.f65861d = (com.facebook.fresco.animation.c.a) i2;
                            this.f65873a.this$0.f65862e = com.facebook.fresco.animation.c.a.a.a(this.f65873a.this$0.f65861d);
                            ValueAnimator valueAnimator = this.f65873a.this$0.f65862e;
                            if (valueAnimator != null) {
                                valueAnimator.setRepeatCount(awemeRawAd.getButtonIconAnimationRepeatTimes() - 1);
                            }
                            ValueAnimator valueAnimator2 = this.f65873a.this$0.f65862e;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        }
                    }
                }
            };
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.this$0.f65868k.getContext(), R.color.bz));
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65876a;

        static {
            Covode.recordClassIndex(40533);
        }

        i(a aVar) {
            this.f65876a = aVar;
        }

        public final void run() {
            this.f65876a.d();
            if (!this.f65876a.f65867j.e(this.f65876a.f65863f)) {
                this.f65876a.a(1300);
            }
        }
    }

    private final int h() {
        Drawable drawable;
        int f2 = f();
        View view = this.n;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return f2;
    }

    private final void i() {
        if (this.r != -100 || this.q != -100) {
            r.a("ad_ui_adjust", new com.ss.android.ugc.aweme.app.f.d().a("original_time", this.q).a("real_time", this.r).a("tag", 1).a("is_adjusted", this.u).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void b() {
        com.ss.android.ugc.aweme.ad.feed.c cVar = this.f65867j;
        if (cVar != null && cVar.a(this.f65864g) && !this.f65867j.d(this.f65863f)) {
            View view = this.f65869m;
            if (view != null) {
                com.ss.android.ugc.aweme.ad.utils.d.a(view, new i(this));
            }
            com.ss.android.ugc.aweme.ad.utils.b.a(this.f65869m, 0, 300, true);
        }
    }

    public final void d() {
        Aweme aweme = this.f65863f;
        if (aweme != null) {
            Long l2 = null;
            a.C0791a b2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", aweme.getAwemeRawAd()).b("refer", "button");
            com.ss.android.ugc.aweme.ad.feed.b bVar = this.f65865h;
            if (bVar != null) {
                l2 = Long.valueOf(bVar.f());
            }
            b2.b("duration", l2).b();
            i();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void e() {
        RemoteImageView remoteImageView = this.f65860c;
        if (remoteImageView != null) {
            remoteImageView.removeCallbacks(g());
        }
        ValueAnimator valueAnimator = this.f65862e;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        com.facebook.fresco.animation.c.a aVar = this.f65861d;
        if (aVar != null) {
            aVar.a(0);
            aVar.stop();
        }
        this.f65861d = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void a() {
        com.ss.android.ugc.aweme.ad.feed.c cVar = this.f65867j;
        if (cVar != null && cVar.a(this.f65864g)) {
            if (this.f65867j.d(this.f65863f)) {
                com.ss.android.ugc.aweme.ad.utils.b.a(this.f65869m, 0, 0, true);
                d();
                if (!this.f65867j.e(this.f65863f)) {
                    a(1000);
                }
            } else {
                com.ss.android.ugc.aweme.ad.utils.b.a(this.f65869m, -((int) n.b(this.f65868k.getContext(), 34.0f)), 0, false);
            }
            int f2 = f();
            if (!this.f65867j.e(this.f65863f)) {
                f2 = Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.c(this.f65864g));
            }
            a(f2, 0);
            LottieAnimationView lottieAnimationView = this.p;
            if (lottieAnimationView != null) {
                lottieAnimationView.setFrame((int) lottieAnimationView.getMinFrame());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void c() {
        com.ss.android.ugc.aweme.ad.feed.c cVar = this.f65867j;
        if (cVar != null && cVar.e(this.f65863f)) {
            a(Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.c(this.f65864g)), 300);
            if (this.t != -100 || this.s != -100) {
                r.a("ad_ui_adjust", new com.ss.android.ugc.aweme.app.f.d().a("original_time", this.s).a("real_time", this.t).a("tag", 2).a("is_adjusted", this.v).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void a(com.ss.android.ugc.aweme.ad.feed.b bVar) {
        this.f65865h = bVar;
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65874a;

        static {
            Covode.recordClassIndex(40531);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f65874a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f65874a.a(0);
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            TextView textView = this.f65874a.f65858a;
            if (textView != null) {
                textView.setTextColor(androidx.core.content.b.c(this.f65874a.f65868k.getContext(), R.color.a9));
            }
            ImageView imageView = this.f65874a.f65859b;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.a95);
            }
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65875a;

        static {
            Covode.recordClassIndex(40532);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f65875a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f65875a.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void a(DataCenter dataCenter) {
        this.x = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_card_show_state", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65870a;

        static {
            Covode.recordClassIndex(40526);
        }

        c(a aVar) {
            this.f65870a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f65870a;
            com.ss.android.ugc.aweme.ad.feed.c cVar = aVar.f65867j;
            if (cVar != null) {
                cVar.a(aVar.f65868k.getContext(), aVar.f65863f, 2, e.f65872a);
            }
        }
    }

    public final void a(long j2) {
        RemoteImageView remoteImageView;
        AwemeRawAd awemeRawAd = this.f65864g;
        if (awemeRawAd != null && a(awemeRawAd) && (remoteImageView = this.f65860c) != null) {
            remoteImageView.postDelayed(g(), j2);
        }
    }

    private static boolean a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && !TextUtils.isEmpty(awemeRawAd.getButtonIcon())) {
            String buttonIcon = awemeRawAd.getButtonIcon();
            l.b(buttonIcon, "");
            if (p.c(buttonIcon, ".webp", false)) {
                return true;
            }
        }
        return false;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65871a;

        static {
            Covode.recordClassIndex(40527);
        }

        d(a aVar) {
            this.f65871a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f65871a;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.f65866i > 250) {
                aVar.f65866i = currentTimeMillis;
                com.ss.android.ugc.aweme.ad.feed.b bVar = aVar.f65865h;
                if (bVar != null) {
                    AwemeRawAd awemeRawAd = null;
                    if (bVar.e()) {
                        bVar.d();
                        Aweme aweme = aVar.f65863f;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "close", awemeRawAd).b("refer", "button_icon").b();
                        return;
                    }
                    String a2 = bVar.a();
                    if (a2 == null || a2.length() == 0) {
                        bVar.b();
                    } else {
                        bVar.c();
                    }
                    Aweme aweme2 = aVar.f65863f;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", awemeRawAd).b("refer", "button_icon").b();
                }
            }
        }
    }

    public a(View view) {
        l.d(view, "");
        this.f65868k = view;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        this.f65867j = (com.ss.android.ugc.aweme.ad.feed.c) (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c) ? null : a2);
        this.y = view.findViewById(R.id.bqv);
        this.z = h.i.a((h.f.a.a) new f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        com.ss.android.ugc.aweme.ad.feed.c cVar = this.f65867j;
        if (cVar != null && cVar.a(this.f65864g) && bVar2 != null && (str = bVar2.f67014a) != null && str.hashCode() == -1709001895 && str.equals("ad_feed_card_show_state")) {
            Boolean bool = (Boolean) bVar2.a();
            l.b(bool, "");
            if (bool.booleanValue()) {
                LottieAnimationView lottieAnimationView = this.p;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setSpeed(1.0f);
                }
                LottieAnimationView lottieAnimationView2 = this.p;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.a();
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView3 = this.p;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setSpeed(-1.0f);
            }
            LottieAnimationView lottieAnimationView4 = this.p;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.a();
            }
        }
    }

    public final void a(boolean z2) {
        RemoteImageView remoteImageView;
        float f2;
        LottieAnimationView lottieAnimationView = this.p;
        float f3 = 1.0f;
        if (lottieAnimationView != null) {
            if (z2) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            lottieAnimationView.setAlpha(f2);
        }
        if (a(this.f65864g) && (remoteImageView = this.f65860c) != null) {
            if (!z2) {
                f3 = 0.5f;
            }
            remoteImageView.setAlpha(f3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void a(Aweme aweme) {
        com.ss.android.ugc.aweme.ad.feed.c cVar;
        String str;
        MethodCollector.i(3847);
        int i2 = 8;
        String str2 = null;
        if (aweme == null || (cVar = this.f65867j) == null || !cVar.a(aweme.getAwemeRawAd())) {
            this.f65863f = null;
            this.f65864g = null;
            View view = this.f65869m;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.y;
            if (view2 != null) {
                view2.setVisibility(8);
                MethodCollector.o(3847);
                return;
            }
            MethodCollector.o(3847);
            return;
        }
        this.f65863f = aweme;
        this.f65864g = aweme.getAwemeRawAd();
        if (this.f65869m == null) {
            View findViewById = this.f65868k.findViewById(R.id.b4_);
            l.b(findViewById, "");
            View inflate = View.inflate(this.f65868k.getContext(), R.layout.afg, (FrameLayout) findViewById);
            this.n = inflate.findViewById(R.id.eq3);
            this.o = inflate.findViewById(R.id.a2m);
            this.f65858a = (TextView) inflate.findViewById(R.id.eq6);
            this.f65859b = (ImageView) inflate.findViewById(R.id.eq4);
            this.p = (LottieAnimationView) inflate.findViewById(R.id.a2n);
            this.f65869m = inflate.findViewById(R.id.eq5);
            RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.dns);
            this.f65860c = remoteImageView;
            if (remoteImageView != null) {
                if (a(this.f65864g)) {
                    RemoteImageView remoteImageView2 = this.f65860c;
                    AwemeRawAd awemeRawAd = this.f65864g;
                    if (awemeRawAd != null) {
                        str2 = awemeRawAd.getButtonIcon();
                    }
                    com.ss.android.ugc.aweme.base.e.a(remoteImageView2, str2);
                    i2 = 0;
                }
                remoteImageView.setVisibility(i2);
            }
            View view3 = this.n;
            if (view3 != null) {
                view3.setOnClickListener(new c(this));
            }
            View view4 = this.o;
            if (view4 != null) {
                view4.setOnClickListener(new d(this));
            }
        }
        View view5 = this.f65869m;
        if (view5 != null) {
            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
            Context context = this.f65868k.getContext();
            l.b(context, "");
            layoutParams.width = com.ss.android.ugc.aweme.ad.feed.a.a(context);
            view5.setLayoutParams(layoutParams);
        }
        TextView textView = this.f65858a;
        if (textView != null) {
            com.ss.android.ugc.aweme.ad.feed.c cVar2 = this.f65867j;
            if (cVar2 == null || (str = cVar2.a(this.f65868k.getContext(), this.f65863f)) == null) {
                str = this.f65868k.getContext().getString(R.string.ou);
                l.b(str, "");
            }
            Aweme aweme2 = this.f65863f;
            if (aweme2 == null || !aweme2.isAppAd()) {
                com.ss.android.ugc.aweme.ad.feed.c cVar3 = this.f65867j;
                if (cVar3 != null && cVar3.e(this.f65863f)) {
                    str = this.f65868k.getContext().getString(R.string.a74, str);
                }
                l.b(str, "");
            }
            textView.setText(str);
        }
        View view6 = this.f65869m;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        View view7 = this.y;
        if (view7 != null) {
            ViewGroup.LayoutParams layoutParams2 = view7.getLayoutParams();
            layoutParams2.height = (int) n.b(this.f65868k.getContext(), 10.0f);
            layoutParams2.width = (int) n.b(this.f65868k.getContext(), 1.0f);
            view7.setLayoutParams(layoutParams2);
            view7.setVisibility(0);
            MethodCollector.o(3847);
            return;
        }
        MethodCollector.o(3847);
    }

    private final void a(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable.setCornerRadius(n.b(this.f65868k.getContext(), 2.0f));
        gradientDrawable2.setCornerRadius(n.b(this.f65868k.getContext(), 2.0f));
        if (i3 == 0) {
            gradientDrawable.setColor(i2);
            gradientDrawable2.setColor(i2);
            View view = this.n;
            if (view != null) {
                view.setBackground(gradientDrawable);
            }
            View view2 = this.o;
            if (view2 != null) {
                view2.setBackground(gradientDrawable2);
            }
            com.ss.android.ugc.aweme.ad.feed.c cVar = this.f65867j;
            if (cVar == null || !cVar.e(this.f65863f)) {
                TextView textView = this.f65858a;
                if (textView != null) {
                    textView.setTextColor(androidx.core.content.b.c(this.f65868k.getContext(), R.color.a9));
                }
                ImageView imageView = this.f65859b;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.a95);
                }
                a(true);
                return;
            }
            TextView textView2 = this.f65858a;
            if (textView2 != null) {
                textView2.setTextColor(androidx.core.content.b.c(this.f65868k.getContext(), R.color.ac));
            }
            ImageView imageView2 = this.f65859b;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.a94);
            }
            a(false);
            return;
        }
        gradientDrawable.setColor(h());
        gradientDrawable2.setColor(h());
        long j2 = (long) i3;
        com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.n, gradientDrawable, h(), i2, j2, new g(this));
        com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.o, gradientDrawable2, h(), i2, j2, new h(this));
        com.ss.android.ugc.aweme.ad.feed.c cVar2 = this.f65867j;
        if (cVar2 == null || !cVar2.e(this.f65863f)) {
            TextView textView3 = this.f65858a;
            if (textView3 != null) {
                textView3.setTextColor(androidx.core.content.b.c(this.f65868k.getContext(), R.color.a9));
            }
            ImageView imageView3 = this.f65859b;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.a95);
            }
            a(true);
            return;
        }
        TextView textView4 = this.f65858a;
        if (textView4 != null) {
            textView4.setTextColor(androidx.core.content.b.c(this.f65868k.getContext(), R.color.ac));
        }
        ImageView imageView4 = this.f65859b;
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.a94);
        }
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void a(int i2, int i3, int i4) {
        this.q = i2;
        this.r = i3;
        this.u = i4;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.g.b
    public final void b(int i2, int i3, int i4) {
        this.s = i2;
        this.t = i3;
        this.v = i4;
    }
}
