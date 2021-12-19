package com.ss.android.ugc.aweme.sticker.panel.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.e.q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class b implements View.OnClickListener, h {
    public static int O;
    public static String P = "";
    public static final a Q = new a((byte) 0);
    SimpleDraweeView A;
    StyleTextView B;
    public boolean C;
    boolean D;
    public boolean E;
    public FrameLayout F;
    public final boolean G;
    public final boolean H = true;
    public final m<String, String, c> I;
    public final o J;
    public final com.ss.android.ugc.aweme.sticker.d.d K;
    public final com.ss.android.ugc.aweme.sticker.m.h L;
    public final androidx.appcompat.app.d M;
    public final e N;
    private final h.f.a.a<Drawable> R;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f135068a;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f135069b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f135070c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f135071d;

    /* renamed from: e  reason: collision with root package name */
    public Context f135072e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, c> f135073f;

    /* renamed from: g  reason: collision with root package name */
    public Effect f135074g;

    /* renamed from: h  reason: collision with root package name */
    public SimpleDraweeView f135075h;

    /* renamed from: i  reason: collision with root package name */
    public StyleTextView f135076i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f135077j;

    /* renamed from: k  reason: collision with root package name */
    StyleTextView f135078k;

    /* renamed from: l  reason: collision with root package name */
    public c f135079l;

    /* renamed from: m  reason: collision with root package name */
    public StyleTextView f135080m;
    public CircleImageView n;
    StyleTextView o;
    public StyleTextView p;
    public StyleTextView q;
    public int r;
    public AVRtlViewPager s;
    public com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e t;
    public LinearLayout u;
    public FrameLayout v;
    AVAutoRTLImageView w;
    AVAutoRTLImageView x;
    LinearLayout y;
    LinearLayout z;

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135083a = new c();

        static {
            Covode.recordClassIndex(88311);
        }

        c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88309);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final i a() {
        return i.DesignerInfoHandlerPriority;
    }

    @v(a = i.a.ON_DESTROY)
    public final void destory() {
        LinearLayout linearLayout = this.u;
        if (linearLayout == null) {
            l.b();
        }
        linearLayout.setVisibility(8);
    }

    static final class g<V> implements Callable<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135089b;

        static {
            Covode.recordClassIndex(88315);
        }

        g(b bVar, Effect effect) {
            this.f135088a = bVar;
            this.f135089b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ c call() {
            return this.f135088a.I.invoke(this.f135089b.getDesignerId(), this.f135089b.getDesignerEncryptedId());
        }
    }

    static {
        Covode.recordClassIndex(88308);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void b() {
        this.f135074g = null;
        LinearLayout linearLayout = this.f135068a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f135077j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void c() {
        a(false);
        if (this.M.getSupportFragmentManager().e() > 0) {
            this.M.getSupportFragmentManager().c();
        }
        this.E = false;
        this.N.c();
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f135087b;

        static {
            Covode.recordClassIndex(88314);
        }

        f(b bVar, Context context) {
            this.f135086a = bVar;
            this.f135087b = context;
        }

        public final void run() {
            int i2;
            int i3;
            ViewGroup.LayoutParams layoutParams;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE);
            TextView textView = this.f135086a.f135071d;
            if (textView != null) {
                textView.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            SimpleDraweeView simpleDraweeView = this.f135086a.f135069b;
            if (simpleDraweeView == null || (layoutParams = simpleDraweeView.getLayoutParams()) == null) {
                i2 = -1;
            } else {
                i2 = layoutParams.width;
            }
            TextView textView2 = this.f135086a.f135071d;
            if (textView2 != null) {
                i3 = textView2.getMeasuredWidth();
            } else {
                i3 = -1;
            }
            if (i2 != -1 && i3 != -1) {
                int b2 = (int) (((float) ((dh.b(this.f135087b) - i2) - i3)) - r.a(this.f135087b, 106.0f));
                TextView textView3 = this.f135086a.f135070c;
                if (textView3 != null) {
                    textView3.setMaxWidth(b2);
                }
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135084a;

        static {
            Covode.recordClassIndex(88312);
        }

        d(b bVar) {
            this.f135084a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f135084a.c();
        }
    }

    private static Context a(androidx.appcompat.app.d dVar) {
        Context applicationContext = dVar.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f135094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f135095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f135096d;

        static {
            Covode.recordClassIndex(88317);
        }

        i(b bVar, String str, String str2, boolean z) {
            this.f135093a = bVar;
            this.f135094b = str;
            this.f135095c = str2;
            this.f135096d = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            int i2 = 1;
            if (this.f135093a.r == 0) {
                this.f135093a.N.a(true);
            } else {
                this.f135093a.N.a(false);
                i2 = 0;
            }
            this.f135093a.N.a(this.f135094b, this.f135095c, i2, new h.f.a.b<Integer, z>(this) {
                /* class com.ss.android.ugc.aweme.sticker.panel.c.b.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(88318);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Integer num) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        if (this.this$0.f135096d) {
                            StyleTextView styleTextView = this.this$0.f135093a.q;
                            if (styleTextView == null) {
                                l.b();
                            }
                            Locale locale = Locale.getDefault();
                            Context context = this.this$0.f135093a.f135072e;
                            if (context == null) {
                                l.b();
                            }
                            String string = context.getString(R.string.byt);
                            l.b(string, "");
                            String a2 = com.a.a(locale, string, Arrays.copyOf(new Object[0], 0));
                            l.b(a2, "");
                            styleTextView.setText(a2);
                        } else {
                            StyleTextView styleTextView2 = this.this$0.f135093a.q;
                            if (styleTextView2 == null) {
                                l.b();
                            }
                            Locale locale2 = Locale.getDefault();
                            Context context2 = this.this$0.f135093a.f135072e;
                            if (context2 == null) {
                                l.b();
                            }
                            String string2 = context2.getString(R.string.byp);
                            l.b(string2, "");
                            String a3 = com.a.a(locale2, string2, Arrays.copyOf(new Object[0], 0));
                            l.b(a3, "");
                            styleTextView2.setText(a3);
                        }
                        this.this$0.f135093a.r = 0;
                        StyleTextView styleTextView3 = this.this$0.f135093a.q;
                        if (styleTextView3 == null) {
                            l.b();
                        }
                        styleTextView3.setBackgroundResource(R.drawable.b5k);
                    } else if (intValue == 1) {
                        StyleTextView styleTextView4 = this.this$0.f135093a.q;
                        if (styleTextView4 == null) {
                            l.b();
                        }
                        Locale locale3 = Locale.getDefault();
                        Context context3 = this.this$0.f135093a.f135072e;
                        if (context3 == null) {
                            l.b();
                        }
                        String string3 = context3.getString(R.string.c0a);
                        l.b(string3, "");
                        String a4 = com.a.a(locale3, string3, Arrays.copyOf(new Object[0], 0));
                        l.b(a4, "");
                        styleTextView4.setText(a4);
                        StyleTextView styleTextView5 = this.this$0.f135093a.q;
                        if (styleTextView5 == null) {
                            l.b();
                        }
                        styleTextView5.setBackgroundResource(R.drawable.b5l);
                        this.this$0.f135093a.r = 1;
                    } else if (intValue == 2) {
                        StyleTextView styleTextView6 = this.this$0.f135093a.q;
                        if (styleTextView6 == null) {
                            l.b();
                        }
                        Locale locale4 = Locale.getDefault();
                        Context context4 = this.this$0.f135093a.f135072e;
                        if (context4 == null) {
                            l.b();
                        }
                        String string4 = context4.getString(R.string.c22);
                        l.b(string4, "");
                        String a5 = com.a.a(locale4, string4, Arrays.copyOf(new Object[0], 0));
                        l.b(a5, "");
                        styleTextView6.setText(a5);
                        StyleTextView styleTextView7 = this.this$0.f135093a.q;
                        if (styleTextView7 == null) {
                            l.b();
                        }
                        styleTextView7.setBackgroundResource(R.drawable.b5l);
                        this.this$0.f135093a.r = 1;
                    } else if (intValue == 4) {
                        StyleTextView styleTextView8 = this.this$0.f135093a.q;
                        if (styleTextView8 == null) {
                            l.b();
                        }
                        Locale locale5 = Locale.getDefault();
                        Context context5 = this.this$0.f135093a.f135072e;
                        if (context5 == null) {
                            l.b();
                        }
                        String string5 = context5.getString(R.string.bzw);
                        l.b(string5, "");
                        String a6 = com.a.a(locale5, string5, Arrays.copyOf(new Object[0], 0));
                        l.b(a6, "");
                        styleTextView8.setText(a6);
                        StyleTextView styleTextView9 = this.this$0.f135093a.q;
                        if (styleTextView9 == null) {
                            l.b();
                        }
                        styleTextView9.setBackgroundResource(R.drawable.b5l);
                        this.this$0.f135093a.r = 1;
                    }
                    StyleTextView styleTextView10 = this.this$0.f135093a.p;
                    if (styleTextView10 == null) {
                        l.b();
                    }
                    styleTextView10.postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.sticker.panel.c.b.i.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f135097a;

                        static {
                            Covode.recordClassIndex(88319);
                        }

                        {
                            this.f135097a = r1;
                        }

                        public final void run() {
                            StyleTextView styleTextView = this.f135097a.this$0.f135093a.p;
                            if (styleTextView == null) {
                                l.b();
                            }
                            Locale locale = Locale.getDefault();
                            Context context = this.f135097a.this$0.f135093a.f135072e;
                            if (context == null) {
                                l.b();
                            }
                            String string = context.getString(R.string.d87);
                            l.b(string, "");
                            String a2 = com.a.a(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f135097a.this$0.f135093a.N.a(this.f135097a.this$0.f135094b, this.f135097a.this$0.f135095c))}, 1));
                            l.b(a2, "");
                            styleTextView.setText(a2);
                        }
                    }, 1000);
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        Effect effect = aVar.f135378a;
        if (com.ss.android.ugc.aweme.sticker.p.g.c(effect)) {
            this.f135074g = effect;
            b.i.a((Callable) new g(this, effect)).a(new h(this, effect, null), b.i.f4826c);
            return true;
        }
        b();
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.b$b  reason: collision with other inner class name */
    public static final class C3520b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f135082b;

        static {
            Covode.recordClassIndex(88310);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(11311);
            super.onAnimationEnd(animator);
            if (this.f135082b) {
                LinearLayout linearLayout = this.f135081a.u;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                FrameLayout frameLayout = this.f135081a.v;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                FrameLayout frameLayout2 = this.f135081a.F;
                if (frameLayout2 != null) {
                    frameLayout2.removeView(this.f135081a.s);
                    MethodCollector.o(11311);
                    return;
                }
                MethodCollector.o(11311);
                return;
            }
            LinearLayout linearLayout2 = this.f135081a.u;
            if (linearLayout2 == null) {
                l.b();
            }
            linearLayout2.setVisibility(8);
            FrameLayout frameLayout3 = this.f135081a.v;
            if (frameLayout3 == null) {
                l.b();
            }
            frameLayout3.setVisibility(0);
            FrameLayout frameLayout4 = this.f135081a.F;
            if (frameLayout4 != null) {
                frameLayout4.addView(this.f135081a.s);
                MethodCollector.o(11311);
                return;
            }
            MethodCollector.o(11311);
        }

        C3520b(b bVar, boolean z) {
            this.f135081a = bVar;
            this.f135082b = z;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135085a;

        static {
            Covode.recordClassIndex(88313);
        }

        e(b bVar) {
            this.f135085a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (l.a((Object) this.f135085a.J.d(), (Object) "sticker_category:search")) {
                this.f135085a.N.e();
            }
            if (!NetworkUtils.isNetworkAvailable(this.f135085a.M)) {
                this.f135085a.C = false;
                this.f135085a.N.d();
            } else if (this.f135085a.N.a() && !this.f135085a.E) {
                this.f135085a.N.b();
                this.f135085a.a(true);
                if (this.f135085a.t != null) {
                    n a2 = this.f135085a.M.getSupportFragmentManager().a();
                    com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e eVar = this.f135085a.t;
                    Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    a2.a(eVar).b();
                }
                this.f135085a.E = true;
                b bVar = this.f135085a;
                l.b bVar2 = new l.b(this.f135085a.J, this.f135085a.K, this.f135085a.L, com.ss.android.ugc.aweme.sticker.m.f.f134964a, com.ss.android.ugc.aweme.sticker.view.internal.main.e.f136288a, new j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071).f135225m);
                l.a aVar = new l.a(com.ss.android.ugc.aweme.sticker.view.a.j.a(new com.ss.android.ugc.aweme.sticker.view.internal.a.b(this.f135085a.J, this.f135085a.L)), null, null, 126);
                RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
                e eVar2 = this.f135085a.N;
                Effect effect = this.f135085a.f135074g;
                if (effect == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.d(bVar2, "");
                h.f.b.l.d(aVar, "");
                h.f.b.l.d(eVar2, "");
                h.f.b.l.d(effect, "");
                com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e eVar3 = new com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e();
                eVar3.a(bVar2, aVar, recycledViewPool, eVar2, effect);
                bVar.t = eVar3;
                n a3 = this.f135085a.M.getSupportFragmentManager().a();
                com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e eVar4 = this.f135085a.t;
                if (eVar4 == null) {
                    h.f.b.l.b();
                }
                a3.a(R.id.d0l, eVar4).b();
                if (h.a.n.b((List) com.ss.android.ugc.aweme.sticker.repository.b.a(this.f135085a.J.c().j()), 0) != null) {
                    Object b2 = h.a.n.b((List) com.ss.android.ugc.aweme.sticker.repository.b.a(this.f135085a.J.c().j()), 0);
                    if (b2 == null) {
                        h.f.b.l.b();
                    }
                    str = ((EffectCategoryModel) b2).getName();
                } else {
                    str = "";
                }
                e eVar5 = this.f135085a.N;
                Effect effect2 = this.f135085a.f135074g;
                if (effect2 == null) {
                    h.f.b.l.b();
                }
                String effectId = effect2.getEffectId();
                c cVar = this.f135085a.f135079l;
                if (cVar == null) {
                    h.f.b.l.b();
                }
                String c2 = cVar.c();
                h.f.b.l.b(c2, "");
                AVRtlViewPager aVRtlViewPager = this.f135085a.s;
                if (aVRtlViewPager == null) {
                    h.f.b.l.b();
                }
                eVar5.a(effectId, str, c2, aVRtlViewPager.getCurrentItem());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void a(View view) {
        h.f.b.l.d(view, "");
        Context context = view.getContext();
        this.f135072e = context;
        if (context != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c8k);
            this.f135077j = linearLayout;
            if (this.H) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                this.A = (SimpleDraweeView) view.findViewById(R.id.eb6);
                this.B = (StyleTextView) view.findViewById(R.id.ebb);
                this.f135075h = (SimpleDraweeView) view.findViewById(R.id.cup);
                this.f135076i = (StyleTextView) view.findViewById(R.id.cuq);
                this.z = (LinearLayout) view.findViewById(R.id.cuo);
                this.f135078k = (StyleTextView) view.findViewById(R.id.d06);
                this.f135080m = (StyleTextView) view.findViewById(R.id.d09);
                this.n = (CircleImageView) view.findViewById(R.id.bn6);
                this.o = (StyleTextView) view.findViewById(R.id.d08);
                this.p = (StyleTextView) view.findViewById(R.id.d04);
                this.u = (LinearLayout) view.findViewById(R.id.d07);
                this.q = (StyleTextView) view.findViewById(R.id.b7f);
                this.s = (AVRtlViewPager) view.findViewById(R.id.fkd);
                this.F = (FrameLayout) view.findViewById(R.id.c9a);
                this.v = (FrameLayout) view.findViewById(R.id.c8w);
                this.x = (AVAutoRTLImageView) view.findViewById(R.id.bn5);
                this.w = (AVAutoRTLImageView) view.findViewById(R.id.bdr);
                this.y = (LinearLayout) view.findViewById(R.id.d0i);
            } else {
                this.f135075h = (SimpleDraweeView) view.findViewById(R.id.eb6);
                this.f135076i = (StyleTextView) view.findViewById(R.id.ebb);
            }
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.c88);
            if (linearLayout2 != null) {
                com.ss.android.ugc.tools.a.c.a(linearLayout2);
                this.f135068a = linearLayout2;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) linearLayout2.findViewById(R.id.c8_);
                h.f.b.l.b(simpleDraweeView, "");
                Drawable invoke = this.R.invoke();
                if (invoke != null) {
                    ((com.facebook.drawee.f.a) simpleDraweeView.getHierarchy()).a(invoke, q.b.f47442h);
                }
                this.f135069b = simpleDraweeView;
                this.f135070c = (TextView) linearLayout2.findViewById(R.id.c8a);
                this.f135071d = (TextView) linearLayout2.findViewById(R.id.c89);
                linearLayout2.setOnClickListener(this);
                linearLayout2.post(new f(this, context));
            }
        }
    }

    static final class h<TTaskResult, TContinuationResult> implements b.g<c, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f135092c = null;

        static {
            Covode.recordClassIndex(88316);
        }

        h(b bVar, Effect effect, f fVar) {
            this.f135090a = bVar;
            this.f135091b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ z then(b.i<c> iVar) {
            c cVar;
            String a2;
            h.f.b.l.d(iVar, "");
            if (iVar.b() || iVar.c()) {
                cVar = this.f135090a.f135073f.get(this.f135091b.getDesignerId());
            } else {
                cVar = iVar.d();
            }
            this.f135090a.f135079l = cVar;
            if (cVar == null) {
                h.f.b.l.b();
            }
            String c2 = cVar.c();
            h.f.b.l.b(c2, "");
            h.f.b.l.d(c2, "");
            b.P = c2;
            b bVar = this.f135090a;
            SimpleDraweeView simpleDraweeView = bVar.A;
            if (simpleDraweeView == null) {
                h.f.b.l.b();
            }
            simpleDraweeView.setVisibility(8);
            StyleTextView styleTextView = bVar.B;
            if (styleTextView == null) {
                h.f.b.l.b();
            }
            styleTextView.setVisibility(8);
            SimpleDraweeView simpleDraweeView2 = bVar.f135075h;
            if (simpleDraweeView2 == null) {
                h.f.b.l.b();
            }
            simpleDraweeView2.setVisibility(0);
            StyleTextView styleTextView2 = bVar.f135076i;
            if (styleTextView2 == null) {
                h.f.b.l.b();
            }
            styleTextView2.setVisibility(0);
            LinearLayout linearLayout = bVar.z;
            if (linearLayout == null) {
                h.f.b.l.b();
            }
            linearLayout.setVisibility(0);
            boolean z = true;
            if (bVar.N.a()) {
                c cVar2 = bVar.f135079l;
                if (cVar2 == null) {
                    h.f.b.l.b();
                }
                if (!cVar2.j()) {
                    c cVar3 = bVar.f135079l;
                    if (cVar3 == null) {
                        h.f.b.l.b();
                    }
                    if (!cVar3.i()) {
                        AVAutoRTLImageView aVAutoRTLImageView = bVar.w;
                        if (aVAutoRTLImageView == null) {
                            h.f.b.l.b();
                        }
                        aVAutoRTLImageView.setVisibility(0);
                        bVar.C = true;
                    }
                }
            }
            c cVar4 = bVar.f135079l;
            if (cVar4 == null) {
                h.f.b.l.b();
            }
            String k2 = cVar4.k();
            c cVar5 = bVar.f135079l;
            if (cVar5 == null) {
                h.f.b.l.b();
            }
            if (h.f.b.l.a((Object) k2, (Object) cVar5.c())) {
                StyleTextView styleTextView3 = bVar.q;
                if (styleTextView3 == null) {
                    h.f.b.l.b();
                }
                styleTextView3.setVisibility(8);
            }
            c cVar6 = bVar.f135079l;
            if (cVar6 == null) {
                h.f.b.l.b();
            }
            if (cVar6.g() == 1) {
                c cVar7 = bVar.f135079l;
                if (cVar7 == null) {
                    h.f.b.l.b();
                }
                if (cVar7.f() == 1) {
                    StyleTextView styleTextView4 = bVar.q;
                    if (styleTextView4 == null) {
                        h.f.b.l.b();
                    }
                    Locale locale = Locale.getDefault();
                    Context context = bVar.f135072e;
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    String string = context.getString(R.string.c22);
                    h.f.b.l.b(string, "");
                    String a3 = com.a.a(locale, string, Arrays.copyOf(new Object[0], 0));
                    h.f.b.l.b(a3, "");
                    styleTextView4.setText(a3);
                    StyleTextView styleTextView5 = bVar.q;
                    if (styleTextView5 == null) {
                        h.f.b.l.b();
                    }
                    styleTextView5.setBackgroundResource(R.drawable.b5l);
                    bVar.r = 1;
                    bVar.D = true;
                } else {
                    c cVar8 = bVar.f135079l;
                    if (cVar8 == null) {
                        h.f.b.l.b();
                    }
                    if (cVar8.f() == 0) {
                        StyleTextView styleTextView6 = bVar.q;
                        if (styleTextView6 == null) {
                            h.f.b.l.b();
                        }
                        Locale locale2 = Locale.getDefault();
                        Context context2 = bVar.f135072e;
                        if (context2 == null) {
                            h.f.b.l.b();
                        }
                        String string2 = context2.getString(R.string.byt);
                        h.f.b.l.b(string2, "");
                        String a4 = com.a.a(locale2, string2, Arrays.copyOf(new Object[0], 0));
                        h.f.b.l.b(a4, "");
                        styleTextView6.setText(a4);
                        StyleTextView styleTextView7 = bVar.q;
                        if (styleTextView7 == null) {
                            h.f.b.l.b();
                        }
                        styleTextView7.setBackgroundResource(R.drawable.b5k);
                        bVar.r = 0;
                        bVar.D = false;
                    }
                }
            } else {
                c cVar9 = bVar.f135079l;
                if (cVar9 == null) {
                    h.f.b.l.b();
                }
                if (cVar9.f() == 1) {
                    StyleTextView styleTextView8 = bVar.q;
                    if (styleTextView8 == null) {
                        h.f.b.l.b();
                    }
                    Locale locale3 = Locale.getDefault();
                    Context context3 = bVar.f135072e;
                    if (context3 == null) {
                        h.f.b.l.b();
                    }
                    String string3 = context3.getString(R.string.c0a);
                    h.f.b.l.b(string3, "");
                    String a5 = com.a.a(locale3, string3, Arrays.copyOf(new Object[0], 0));
                    h.f.b.l.b(a5, "");
                    styleTextView8.setText(a5);
                    StyleTextView styleTextView9 = bVar.q;
                    if (styleTextView9 == null) {
                        h.f.b.l.b();
                    }
                    styleTextView9.setBackgroundResource(R.drawable.b5l);
                    bVar.r = 1;
                    bVar.D = true;
                } else {
                    c cVar10 = bVar.f135079l;
                    if (cVar10 == null) {
                        h.f.b.l.b();
                    }
                    if (cVar10.f() == 0) {
                        StyleTextView styleTextView10 = bVar.q;
                        if (styleTextView10 == null) {
                            h.f.b.l.b();
                        }
                        Locale locale4 = Locale.getDefault();
                        Context context4 = bVar.f135072e;
                        if (context4 == null) {
                            h.f.b.l.b();
                        }
                        String string4 = context4.getString(R.string.byp);
                        h.f.b.l.b(string4, "");
                        String a6 = com.a.a(locale4, string4, Arrays.copyOf(new Object[0], 0));
                        h.f.b.l.b(a6, "");
                        styleTextView10.setText(a6);
                        StyleTextView styleTextView11 = bVar.q;
                        if (styleTextView11 == null) {
                            h.f.b.l.b();
                        }
                        styleTextView11.setBackgroundResource(R.drawable.b5k);
                        bVar.r = 0;
                        bVar.D = false;
                    }
                }
            }
            StyleTextView styleTextView12 = bVar.f135078k;
            if (styleTextView12 == null) {
                h.f.b.l.b();
            }
            Locale locale5 = Locale.getDefault();
            Context context5 = bVar.f135072e;
            if (context5 == null) {
                h.f.b.l.b();
            }
            String string5 = context5.getString(R.string.b1y);
            h.f.b.l.b(string5, "");
            Object[] objArr = new Object[1];
            c cVar11 = bVar.f135079l;
            if (cVar11 == null) {
                h.f.b.l.b();
            }
            objArr[0] = cVar11.e();
            String a7 = com.a.a(locale5, string5, Arrays.copyOf(objArr, 1));
            h.f.b.l.b(a7, "");
            styleTextView12.setText(a7);
            StyleTextView styleTextView13 = bVar.f135078k;
            if (styleTextView13 == null) {
                h.f.b.l.b();
            }
            styleTextView13.setVisibility(0);
            StyleTextView styleTextView14 = bVar.o;
            if (styleTextView14 == null) {
                h.f.b.l.b();
            }
            c cVar12 = bVar.f135079l;
            if (cVar12 == null) {
                h.f.b.l.b();
            }
            styleTextView14.setText(cVar12.e());
            StyleTextView styleTextView15 = bVar.p;
            if (styleTextView15 == null) {
                h.f.b.l.b();
            }
            Locale locale6 = Locale.getDefault();
            Context context6 = bVar.f135072e;
            if (context6 == null) {
                h.f.b.l.b();
            }
            String string6 = context6.getString(R.string.d87);
            h.f.b.l.b(string6, "");
            Object[] objArr2 = new Object[1];
            c cVar13 = bVar.f135079l;
            if (cVar13 == null) {
                h.f.b.l.b();
            }
            objArr2[0] = Integer.valueOf(cVar13.h());
            String a8 = com.a.a(locale6, string6, Arrays.copyOf(objArr2, 1));
            h.f.b.l.b(a8, "");
            styleTextView15.setText(a8);
            b bVar2 = this.f135090a;
            LinearLayout linearLayout2 = bVar2.u;
            if (linearLayout2 == null) {
                h.f.b.l.b();
            }
            linearLayout2.setOnClickListener(c.f135083a);
            AVAutoRTLImageView aVAutoRTLImageView2 = bVar2.x;
            if (aVAutoRTLImageView2 == null) {
                h.f.b.l.b();
            }
            aVAutoRTLImageView2.setOnClickListener(new d(bVar2));
            LinearLayout linearLayout3 = bVar2.y;
            if (linearLayout3 == null) {
                h.f.b.l.b();
            }
            linearLayout3.setOnClickListener(new e(bVar2));
            f fVar = this.f135092c;
            if (fVar == null || fVar.a()) {
                if (h.f.b.l.a(this.f135091b, this.f135090a.f135074g)) {
                    TextView textView = this.f135090a.f135070c;
                    if (textView == null) {
                        h.f.b.l.b();
                    }
                    textView.setText(cVar.e());
                    StyleTextView styleTextView16 = this.f135090a.f135080m;
                    if (styleTextView16 == null) {
                        h.f.b.l.b();
                    }
                    Locale locale7 = Locale.getDefault();
                    Context context7 = this.f135090a.f135072e;
                    if (context7 == null) {
                        h.f.b.l.b();
                    }
                    String string7 = context7.getString(R.string.b21);
                    h.f.b.l.b(string7, "");
                    String a9 = com.a.a(locale7, string7, Arrays.copyOf(new Object[]{cVar.e()}, 1));
                    h.f.b.l.b(a9, "");
                    styleTextView16.setText(a9);
                    com.ss.android.ugc.tools.c.a.a(this.f135090a.n, cVar.d());
                    b bVar3 = this.f135090a;
                    String designerId = this.f135091b.getDesignerId();
                    String designerEncryptedId = this.f135091b.getDesignerEncryptedId();
                    if (cVar.g() != 1) {
                        z = false;
                    }
                    h.f.b.l.d(designerId, "");
                    h.f.b.l.d(designerEncryptedId, "");
                    StyleTextView styleTextView17 = bVar3.q;
                    if (styleTextView17 == null) {
                        h.f.b.l.b();
                    }
                    styleTextView17.setOnClickListener(new i(bVar3, designerId, designerEncryptedId, z));
                    if (this.f135090a.H) {
                        LinearLayout linearLayout4 = this.f135090a.f135077j;
                        if (linearLayout4 == null) {
                            h.f.b.l.b();
                        }
                        linearLayout4.setVisibility(0);
                    }
                    SimpleDraweeView simpleDraweeView3 = this.f135090a.f135075h;
                    if (simpleDraweeView3 != null) {
                        com.ss.android.ugc.tools.c.a.a(simpleDraweeView3, (String) h.a.n.h((List) this.f135091b.getIconUrl().getUrlList()));
                    }
                    if (this.f135090a.f135076i != null) {
                        StyleTextView styleTextView18 = this.f135090a.f135076i;
                        if (styleTextView18 == null) {
                            h.f.b.l.b();
                        }
                        styleTextView18.setText(this.f135091b.getName());
                    }
                    if (this.f135090a.H) {
                        SimpleDraweeView simpleDraweeView4 = this.f135090a.f135069b;
                        if (simpleDraweeView4 != null) {
                            simpleDraweeView4.setVisibility(8);
                        }
                    } else {
                        SimpleDraweeView simpleDraweeView5 = this.f135090a.f135069b;
                        if (simpleDraweeView5 != null) {
                            simpleDraweeView5.setVisibility(0);
                        }
                        com.ss.android.ugc.tools.c.a.a(this.f135090a.f135069b, cVar.d());
                    }
                    if (this.f135090a.G) {
                        TextView textView2 = this.f135090a.f135070c;
                        if (textView2 == null) {
                            h.f.b.l.b();
                        }
                        if (!TextUtils.isEmpty(cVar.a())) {
                            a2 = cVar.a();
                        } else if (cVar.b() == null) {
                            a2 = "";
                        } else {
                            a2 = cVar.b();
                        }
                        h.f.b.l.b(a2, "");
                        textView2.setText(a2);
                    }
                }
                this.f135090a.f135073f.put(this.f135091b.getDesignerId(), cVar);
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float a2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        FrameLayout frameLayout = this.v;
        Objects.requireNonNull(frameLayout, "null cannot be cast to non-null type android.view.View");
        float[] fArr = new float[2];
        float f12 = 0.0f;
        if (z2) {
            f2 = 0.0f;
        } else {
            Context a3 = a(this.M);
            h.f.b.l.b(a3, "");
            f2 = -com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a3);
        }
        fArr[0] = f2;
        if (z2) {
            Context a4 = a(this.M);
            h.f.b.l.b(a4, "");
            f3 = -com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a4);
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        AVRtlViewPager aVRtlViewPager = this.s;
        Objects.requireNonNull(aVRtlViewPager, "null cannot be cast to non-null type android.view.View");
        float[] fArr2 = new float[2];
        if (z2) {
            f4 = 0.0f;
        } else {
            Context a5 = a(this.M);
            h.f.b.l.b(a5, "");
            f4 = -com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a5);
        }
        fArr2[0] = f4;
        if (z2) {
            Context a6 = a(this.M);
            h.f.b.l.b(a6, "");
            f5 = -com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a6);
        } else {
            f5 = 0.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVRtlViewPager, "translationX", fArr2);
        LinearLayout linearLayout = this.u;
        Objects.requireNonNull(linearLayout, "null cannot be cast to non-null type android.view.View");
        float[] fArr3 = new float[2];
        if (z2) {
            Context a7 = a(this.M);
            h.f.b.l.b(a7, "");
            f6 = com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a7);
        } else {
            f6 = 0.0f;
        }
        fArr3[0] = f6;
        if (z2) {
            a2 = 0.0f;
        } else {
            androidx.appcompat.app.d dVar = this.M;
            if (dVar == null) {
                h.f.b.l.b();
            }
            Context a8 = a(dVar);
            h.f.b.l.b(a8, "");
            a2 = com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f.a(a8);
        }
        fArr3[1] = a2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationX", fArr3);
        AVRtlViewPager aVRtlViewPager2 = this.s;
        Objects.requireNonNull(aVRtlViewPager2, "null cannot be cast to non-null type android.view.View");
        float[] fArr4 = new float[2];
        if (z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr4[0] = f7;
        if (z2) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        fArr4[1] = f8;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aVRtlViewPager2, "alpha", fArr4);
        FrameLayout frameLayout2 = this.v;
        Objects.requireNonNull(frameLayout2, "null cannot be cast to non-null type android.view.View");
        float[] fArr5 = new float[2];
        if (z2) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        fArr5[0] = f9;
        if (z2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        fArr5[1] = f10;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(frameLayout2, "alpha", fArr5);
        LinearLayout linearLayout2 = this.u;
        Objects.requireNonNull(linearLayout2, "null cannot be cast to non-null type android.view.View");
        float[] fArr6 = new float[2];
        if (z2) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        fArr6[0] = f11;
        if (z2) {
            f12 = 1.0f;
        }
        fArr6[1] = f12;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(linearLayout2, "alpha", fArr6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        animatorSet.addListener(new C3520b(this, z2));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, ? extends com.ss.android.ugc.aweme.sticker.panel.c.c> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(boolean z2, m<? super String, ? super String, ? extends c> mVar, h.f.a.a<? extends Drawable> aVar, o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar, com.ss.android.ugc.aweme.sticker.m.h hVar, androidx.appcompat.app.d dVar2, e eVar) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(dVar2, "");
        h.f.b.l.d(eVar, "");
        this.G = z2;
        this.I = mVar;
        this.R = aVar;
        this.J = oVar;
        this.K = dVar;
        this.L = hVar;
        this.M = dVar2;
        this.N = eVar;
        this.f135073f = new HashMap<>();
    }
}
