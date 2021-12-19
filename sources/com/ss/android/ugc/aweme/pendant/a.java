package com.ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.m.p;
import h.z;
import java.util.List;
import java.util.Objects;

public abstract class a implements n {
    public static final d t = new d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final float f114580a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f114581b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114582c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114583d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f114584e;

    /* renamed from: f  reason: collision with root package name */
    public final float f114585f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f114586g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f114587h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f114588i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f114589j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f114590k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f114591l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f114592m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;
    public final View r;
    public final i s;
    private final float u;
    private final float v;
    private AnimatorSet w;

    static {
        Covode.recordClassIndex(73762);
    }

    public abstract void c();

    public static final class d {
        static {
            Covode.recordClassIndex(73766);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public final void b() {
        this.n.setVisibility(8);
        if (this.f114588i) {
            c();
        }
    }

    public void a() {
        if (!this.f114586g && this.f114589j) {
            this.n.setVisibility(0);
            if (this.f114587h) {
                this.o.setVisibility(8);
                this.p.setVisibility(0);
                return;
            }
            this.o.setVisibility(0);
            this.p.setVisibility(8);
        }
    }

    public final void d() {
        if (this.f114589j && !this.f114587h) {
            if (this.f114581b) {
                this.q.setVisibility(0);
            } else {
                this.q.setVisibility(4);
            }
            this.f114587h = true;
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.playSequentially(c(false), d(false), b(false));
            animatorSet.addListener(new e(this));
            animatorSet.start();
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114597a;

        static {
            Covode.recordClassIndex(73767);
        }

        e(a aVar) {
            this.f114597a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f114597a.a(false);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f114597a.a(true);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f114595a;

        static {
            Covode.recordClassIndex(73764);
        }

        b(h.f.a.a aVar) {
            this.f114595a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f114595a.invoke();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f114596a;

        static {
            Covode.recordClassIndex(73765);
        }

        c(h.f.a.a aVar) {
            this.f114596a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f114596a.invoke();
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f114599b;

        static {
            Covode.recordClassIndex(73768);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f114598a.f114591l = false;
            h.f.a.a aVar = this.f114599b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f114598a.f114591l = true;
        }

        f(a aVar, h.f.a.a aVar2) {
            this.f114598a = aVar;
            this.f114599b = aVar2;
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f114604b;

        static {
            Covode.recordClassIndex(73770);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f114604b) {
                this.f114603a.c();
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f114604b) {
                this.f114603a.o.setVisibility(8);
                this.f114603a.r.setVisibility(8);
                this.f114603a.p.setVisibility(0);
                if (this.f114603a.p instanceof LottieAnimationView) {
                    ((LottieAnimationView) this.f114603a.p).a();
                }
                this.f114603a.c();
            }
        }

        h(a aVar, boolean z) {
            this.f114603a = aVar;
            this.f114604b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2934a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f114593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f114594b;

        static {
            Covode.recordClassIndex(73763);
        }

        View$OnClickListenerC2934a(h.f.a.a aVar, a aVar2) {
            this.f114593a = aVar;
            this.f114594b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f114593a.invoke();
            this.f114594b.b();
            this.f114594b.f114586g = true;
        }
    }

    public static final class l extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f114613b;

        static {
            Covode.recordClassIndex(73774);
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            if (!this.f114613b && !this.f114612a.f114581b) {
                this.f114612a.q.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
            if (this.f114613b) {
                this.f114612a.q.setVisibility(0);
            }
        }

        l(a aVar, boolean z) {
            this.f114612a = aVar;
            this.f114613b = z;
        }
    }

    public final void a(boolean z) {
        h.f.a.a<z> aVar;
        if (this.f114590k && !z && (aVar = this.s.f114677h) != null) {
            aVar.invoke();
        }
        this.f114590k = z;
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.b f114601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f114602c;

        static {
            Covode.recordClassIndex(73769);
        }

        g(a aVar, z.b bVar, z.b bVar2) {
            this.f114600a = aVar;
            this.f114601b = bVar;
            this.f114602c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f114600a.n;
            float f2 = this.f114601b.element;
            float f3 = this.f114602c.element;
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f2 + (f3 * ((Float) animatedValue).floatValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.b f114606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f114607c;

        static {
            Covode.recordClassIndex(73771);
        }

        i(a aVar, z.b bVar, z.b bVar2) {
            this.f114605a = aVar;
            this.f114606b = bVar;
            this.f114607c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f114605a.n;
            float f2 = this.f114606b.element;
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f2 - (((Float) animatedValue).floatValue() * this.f114607c.element));
        }
    }

    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f114609b;

        static {
            Covode.recordClassIndex(73772);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f114609b) {
                this.f114608a.o.setVisibility(0);
                if (this.f114608a.f114584e) {
                    a aVar = this.f114608a;
                    List<String> list = aVar.s.f114679j;
                    if (list != null && list.size() == 3) {
                        aVar.r.setVisibility(0);
                    }
                }
                this.f114608a.p.setVisibility(8);
            }
        }

        j(a aVar, boolean z) {
            this.f114608a = aVar;
            this.f114609b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f114611b;

        static {
            Covode.recordClassIndex(73773);
        }

        k(a aVar, float f2) {
            this.f114610a = aVar;
            this.f114611b = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f114610a.n;
            float f2 = this.f114611b;
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f2 + (((Float) animatedValue).floatValue() * this.f114610a.f114580a));
        }
    }

    private static Integer a(String str) {
        int parseColor;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (p.b(str, "0x", false)) {
            parseColor = Color.parseColor(p.a(str, "0x", "#", true));
        } else if (!p.b(str, "#", false)) {
            parseColor = Color.parseColor("#".concat(String.valueOf(str)));
        } else {
            parseColor = Color.parseColor(str);
        }
        return Integer.valueOf(parseColor);
    }

    private final ValueAnimator d(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        z.b bVar = new z.b();
        if (z) {
            translationX = -this.u;
        } else {
            translationX = this.n.getTranslationX();
        }
        bVar.element = translationX;
        z.b bVar2 = new z.b();
        bVar2.element = this.f114580a + this.u;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new i(this, bVar, bVar2));
        ofFloat.addListener(new j(this, z));
        h.f.b.l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private final Animator b(boolean z) {
        ValueAnimator ofFloat;
        float f2;
        ObjectAnimator ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        z.b bVar = new z.b();
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = -this.v;
        }
        bVar.element = f2;
        z.b bVar2 = new z.b();
        bVar2.element = this.v;
        ofFloat.addListener(new h(this, z));
        ofFloat.addUpdateListener(new g(this, bVar, bVar2));
        h.f.b.l.b(ofFloat, "");
        ofFloat.setDuration(200L);
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.q, "alpha", 1.0f, 0.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.q, "alpha", 0.0f, 1.0f);
        }
        h.f.b.l.b(ofFloat2, "");
        ofFloat2.setDuration(150L);
        if (z) {
            animatorSet.playSequentially(ofFloat2, ofFloat);
        } else {
            animatorSet.playSequentially(ofFloat, ofFloat2);
        }
        return animatorSet;
    }

    private final Animator c(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (z) {
            translationX = this.f114580a;
        } else {
            translationX = this.n.getTranslationX();
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new k(this, translationX));
        h.f.b.l.b(ofFloat, "");
        ofFloat.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.q, "alpha", 0.0f, 1.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.q, "alpha", 1.0f, 0.0f);
        }
        h.f.b.l.b(ofFloat2, "");
        ofFloat2.setDuration(150L);
        ofFloat2.addListener(new l(this, z));
        animatorSet.playTogether(ofFloat2, ofFloat);
        return animatorSet;
    }

    @Override // com.ss.android.ugc.aweme.pendant.n
    public final void a(h.f.a.a<h.z> aVar) {
        if (!this.f114586g && this.f114589j && this.f114587h) {
            this.f114587h = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.addListener(new f(this, aVar));
            animatorSet.playSequentially(b(true), d(true), c(true));
            animatorSet.start();
        }
    }

    public a(Context context, View view, View view2, View view3, View view4, View view5, i iVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(view2, "");
        h.f.b.l.d(view3, "");
        h.f.b.l.d(view4, "");
        h.f.b.l.d(view5, "");
        h.f.b.l.d(iVar, "");
        this.f114592m = context;
        this.n = view;
        this.o = view2;
        this.p = view3;
        this.q = view4;
        this.r = view5;
        this.s = iVar;
        this.u = n.b(context, 90.0f);
        this.v = n.b(context, 36.0f);
        this.f114580a = n.b(context, 10.0f);
        this.f114581b = iVar.f114670a;
        TextView textView = (TextView) view5.findViewById(R.id.a2b);
        this.f114582c = textView;
        TextView textView2 = (TextView) view5.findViewById(R.id.a2a);
        this.f114583d = textView2;
        this.f114585f = n.b(context, 22.0f);
        h.f.a.a<h.z> aVar = iVar.f114672c;
        if (aVar != null) {
            view2.setOnClickListener(new b(aVar));
            view3.setOnClickListener(new c(aVar));
        }
        h.f.a.a<h.z> aVar2 = iVar.f114673d;
        if (aVar2 != null) {
            view4.setOnClickListener(new View$OnClickListenerC2934a(aVar2, this));
        }
        List<String> list = iVar.f114679j;
        if (list == null || list.size() != 3) {
            view5.setVisibility(8);
            return;
        }
        Drawable background = view5.getBackground();
        if (background instanceof GradientDrawable) {
            iVar.f114679j.get(0);
            iVar.f114679j.get(1);
            Integer a2 = a(iVar.f114679j.get(0));
            if (a2 != null) {
                ((GradientDrawable) background).setColor(a2.intValue());
            }
            Integer a3 = a(iVar.f114679j.get(1));
            if (a3 != null) {
                ((GradientDrawable) background).setStroke((int) n.b(view5.getContext(), 1.0f), a3.intValue());
            }
        }
        Integer a4 = a(iVar.f114679j.get(2));
        if (a4 != null) {
            int intValue = a4.intValue();
            textView.setTextColor(intValue);
            textView2.setTextColor(intValue);
        }
    }
}
