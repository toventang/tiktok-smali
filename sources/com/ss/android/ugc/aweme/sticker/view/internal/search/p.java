package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.tools.view.style.StyleView;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

public final class p implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f136596d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f136597a;

    /* renamed from: b  reason: collision with root package name */
    public final View f136598b;

    /* renamed from: c  reason: collision with root package name */
    public final View f136599c;

    /* renamed from: e  reason: collision with root package name */
    private final float f136600e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.widget.a.a f136601f = new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.3f, 0.0f, 0.9f, 0.6f);

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.widget.a.a f136602g = new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.0f, 0.4f, 0.2f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.widget.a.a f136603h = new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: i  reason: collision with root package name */
    private boolean f136604i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f136605j;

    /* renamed from: k  reason: collision with root package name */
    private final View f136606k;

    /* renamed from: l  reason: collision with root package name */
    private final int f136607l;

    static {
        Covode.recordClassIndex(89215);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89216);
        }

        public static boolean a(int i2) {
            return i2 == 1 || i2 == 2;
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.b
    public final boolean a() {
        return this.f136605j;
    }

    private final float b() {
        if (this.f136598b.getHeight() > 0) {
            return (float) this.f136598b.getHeight();
        }
        return this.f136606k.getResources().getDimension(R.dimen.t0);
    }

    private final AnimatorSet c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f136598b, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(210L);
        ofFloat.setInterpolator(this.f136602g);
        ofFloat.setStartDelay(90);
        ofFloat.addListener(new e(this));
        View view = this.f136597a;
        if (view == null) {
            h.f.b.l.a("searchStickerView");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(90L);
        ofFloat2.setInterpolator(this.f136601f);
        ofFloat2.addListener(new f(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f136599c.getHeight(), (int) b());
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.f136603h);
        ofInt.addUpdateListener(new g(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
        return animatorSet;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136609a;

        static {
            Covode.recordClassIndex(89218);
        }

        c(p pVar) {
            this.f136609a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f136609a.f136598b.setVisibility(0);
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136610a;

        static {
            Covode.recordClassIndex(89219);
        }

        d(p pVar) {
            this.f136610a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            p.a(this.f136610a).setVisibility(8);
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136611a;

        static {
            Covode.recordClassIndex(89220);
        }

        e(p pVar) {
            this.f136611a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f136611a.f136598b.setVisibility(0);
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136612a;

        static {
            Covode.recordClassIndex(89221);
        }

        f(p pVar) {
            this.f136612a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            p.a(this.f136612a).setVisibility(8);
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136614a;

        static {
            Covode.recordClassIndex(89223);
        }

        h(p pVar) {
            this.f136614a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            p.a(this.f136614a).setVisibility(8);
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136617a;

        static {
            Covode.recordClassIndex(89226);
        }

        k(p pVar) {
            this.f136617a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f136617a.f136598b.setVisibility(8);
        }
    }

    public static final class l extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136618a;

        static {
            Covode.recordClassIndex(89227);
        }

        l(p pVar) {
            this.f136618a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            p.a(this.f136618a).setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.b
    public final void a(View view) {
        h.f.b.l.d(view, "");
        this.f136597a = view;
    }

    public static final /* synthetic */ View a(p pVar) {
        View view = pVar.f136597a;
        if (view == null) {
            h.f.b.l.a("searchStickerView");
        }
        return view;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchStickerViewContainer f136608a;

        static {
            Covode.recordClassIndex(89217);
        }

        b(SearchStickerViewContainer searchStickerViewContainer) {
            this.f136608a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136608a.b();
            this.f136608a.a(new f.b("click_icon"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136613a;

        static {
            Covode.recordClassIndex(89222);
        }

        g(p pVar) {
            this.f136613a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f136613a.f136599c.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f136613a.f136599c.setLayoutParams(layoutParams);
        }
    }

    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136615a;

        static {
            Covode.recordClassIndex(89224);
        }

        i(p pVar) {
            this.f136615a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f136615a.f136599c.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f136615a.f136599c.setLayoutParams(layoutParams);
        }
    }

    static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136616a;

        static {
            Covode.recordClassIndex(89225);
        }

        j(p pVar) {
            this.f136616a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f136616a.f136599c.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f136616a.f136599c.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136619a;

        static {
            Covode.recordClassIndex(89228);
        }

        m(p pVar) {
            this.f136619a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f136619a.f136599c.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f136619a.f136599c.setLayoutParams(layoutParams);
        }
    }

    static final class n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136620a;

        static {
            Covode.recordClassIndex(89229);
        }

        n(p pVar) {
            this.f136620a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f136620a.f136599c.getLayoutParams();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f136620a.f136599c.setLayoutParams(layoutParams);
        }
    }

    private final void b(boolean z) {
        if (!z) {
            this.f136606k.setVisibility(8);
        } else if (this.f136607l == 2) {
            this.f136606k.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.b
    public final void a(int i2) {
        this.f136604i = true;
        int i3 = this.f136607l;
        if (i3 == 1) {
            b(i2).start();
            this.f136605j = true;
        } else if (i3 != 2) {
        } else {
            if (this.f136605j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f136599c.getHeight(), i2);
                ofInt.setDuration(300L);
                ofInt.setInterpolator(this.f136603h);
                ofInt.addUpdateListener(new n(this));
                h.f.b.l.b(ofInt, "");
                ofInt.start();
                return;
            }
            b(false);
            b(i2).start();
            this.f136605j = true;
        }
    }

    private final AnimatorSet b(int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f136598b, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(90L);
        ofFloat.setInterpolator(this.f136601f);
        ofFloat.addListener(new k(this));
        View view = this.f136597a;
        if (view == null) {
            h.f.b.l.a("searchStickerView");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(210L);
        ofFloat2.setStartDelay(90);
        ofFloat2.setInterpolator(this.f136602g);
        ofFloat2.addListener(new l(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f136599c.getHeight(), i2);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.f136603h);
        ofInt.addUpdateListener(new m(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
        return animatorSet;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.b
    public final void a(boolean z) {
        boolean z2 = this.f136604i;
        if (z2 || this.f136605j) {
            int i2 = this.f136607l;
            if (i2 == 1) {
                if (z) {
                    this.f136598b.setVisibility(0);
                    this.f136598b.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f136598b, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(210L);
                    ofFloat.setInterpolator(this.f136602g);
                    ofFloat.setStartDelay(90);
                    View view = this.f136597a;
                    if (view == null) {
                        h.f.b.l.a("searchStickerView");
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                    ofFloat2.setDuration(90L);
                    ofFloat2.setInterpolator(this.f136601f);
                    ofFloat2.addListener(new h(this));
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.f136599c.getHeight(), (int) b());
                    ofInt.setDuration(300L);
                    ofInt.setInterpolator(this.f136603h);
                    ofInt.addUpdateListener(new i(this));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
                    animatorSet.start();
                } else {
                    c().start();
                }
                this.f136605j = false;
            } else if (i2 == 2) {
                if (!z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f136599c.getHeight(), (int) b());
                    ofInt2.setDuration(300L);
                    ofInt2.setInterpolator(this.f136603h);
                    ofInt2.addUpdateListener(new j(this));
                    h.f.b.l.b(ofInt2, "");
                    ofInt2.start();
                    this.f136605j = true;
                } else if (z2) {
                    b(true);
                    c().start();
                    this.f136605j = false;
                } else {
                    b(true);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f136598b, "alpha", 0.0f, 1.0f);
                    ofFloat3.setDuration(210L);
                    ofFloat3.setInterpolator(this.f136602g);
                    ofFloat3.setStartDelay(90);
                    ofFloat3.addListener(new c(this));
                    View view2 = this.f136597a;
                    if (view2 == null) {
                        h.f.b.l.a("searchStickerView");
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
                    ofFloat4.setDuration(90L);
                    ofFloat4.setInterpolator(this.f136601f);
                    ofFloat4.addListener(new d(this));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat3, ofFloat4);
                    animatorSet2.start();
                    this.f136605j = false;
                }
            }
            this.f136604i = false;
        }
    }

    public p(View view, View view2, View view3, int i2) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(view2, "");
        h.f.b.l.d(view3, "");
        this.f136606k = view;
        this.f136598b = view2;
        this.f136599c = view3;
        this.f136607l = i2;
        float dimension = view.getResources().getDimension(R.dimen.rt);
        this.f136600e = dimension;
        StyleView styleView = (StyleView) view.findViewById(R.id.c8n);
        TextView textView = (TextView) view.findViewById(R.id.eck);
        textView.setText(com.ss.android.ugc.aweme.shortvideo.m.b.f128755i);
        h.f.b.l.b(styleView, "");
        ViewGroup.LayoutParams layoutParams = styleView.getLayoutParams();
        if (i2 == 1) {
            b(false);
        } else if (i2 == 2) {
            h.f.b.l.b(textView, "");
            textView.setVisibility(0);
            layoutParams.width = (int) dimension;
            styleView.setLayoutParams(layoutParams);
            b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.b
    public final c a(androidx.fragment.app.e eVar, ViewGroup viewGroup, l.b bVar, l.a aVar, a aVar2, com.ss.android.ugc.aweme.sticker.panel.j jVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(jVar, "");
        SearchStickerViewContainer searchStickerViewContainer = new SearchStickerViewContainer(eVar, viewGroup, bVar, aVar2, this.f136607l, jVar);
        this.f136606k.setOnClickListener(new b(searchStickerViewContainer));
        return searchStickerViewContainer;
    }
}
