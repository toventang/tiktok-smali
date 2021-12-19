package com.ss.android.ugc.aweme.find.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Objects;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C2318a f96018f = new C2318a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f96019a;

    /* renamed from: b  reason: collision with root package name */
    public final View f96020b;

    /* renamed from: c  reason: collision with root package name */
    public final View f96021c;

    /* renamed from: d  reason: collision with root package name */
    public final View f96022d;

    /* renamed from: e  reason: collision with root package name */
    public final b f96023e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f96024g = i.a((h.f.a.a) new g(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f96025h = i.a((h.f.a.a) new h(this));

    public interface b {
        static {
            Covode.recordClassIndex(60810);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(60808);
    }

    public final ValueAnimator a() {
        return (ValueAnimator) this.f96024g.getValue();
    }

    public final ValueAnimator b() {
        return (ValueAnimator) this.f96025h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.find.b.a$a  reason: collision with other inner class name */
    public static final class C2318a {
        static {
            Covode.recordClassIndex(60809);
        }

        private C2318a() {
        }

        public /* synthetic */ C2318a(byte b2) {
            this();
        }
    }

    public final void c() {
        ValueAnimator b2 = b();
        if (b2.isRunning()) {
            b2.end();
        }
        ValueAnimator a2 = a();
        if (a2.isRunning()) {
            a2.end();
        }
    }

    static final class g extends m implements h.f.a.a<ValueAnimator> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ValueAnimator invoke() {
            a aVar = this.this$0;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(1.0f, 0.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.addUpdateListener(new c(aVar));
            valueAnimator.addListener(new d(aVar));
            return valueAnimator;
        }
    }

    static final class h extends m implements h.f.a.a<ValueAnimator> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ValueAnimator invoke() {
            a aVar = this.this$0;
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.addUpdateListener(new e(aVar));
            valueAnimator.addListener(new f(aVar));
            return valueAnimator;
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96027a;

        static {
            Covode.recordClassIndex(60812);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f96027a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            super.onAnimationStart(animator);
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            super.onAnimationEnd(animator);
            this.f96027a.f96023e.a();
            this.f96027a.f96019a = 0;
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96029a;

        static {
            Covode.recordClassIndex(60814);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f96029a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            super.onAnimationEnd(animator);
            this.f96029a.f96019a = 1;
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            super.onAnimationStart(animator);
            this.f96029a.f96023e.b();
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96026a;

        static {
            Covode.recordClassIndex(60811);
        }

        c(a aVar) {
            this.f96026a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(this.f96026a.f96020b, 0, 0, Integer.valueOf((int) (((float) h.g.a.a(TypedValue.applyDimension(1, 62.0f, system.getDisplayMetrics()))) * floatValue)), 0, false, 16);
            View view = this.f96026a.f96021c;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue2).floatValue());
            View view2 = this.f96026a.f96022d;
            Object animatedValue3 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(((Float) animatedValue3).floatValue());
        }
    }

    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96028a;

        static {
            Covode.recordClassIndex(60813);
        }

        e(a aVar) {
            this.f96028a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(this.f96028a.f96020b, 0, 0, Integer.valueOf((int) (((float) h.g.a.a(TypedValue.applyDimension(1, 62.0f, system.getDisplayMetrics()))) * floatValue)), 0, false, 16);
            View view = this.f96028a.f96021c;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue2).floatValue());
            View view2 = this.f96028a.f96022d;
            Object animatedValue3 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(((Float) animatedValue3).floatValue());
        }
    }

    public a(View view, View view2, View view3, b bVar) {
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        l.d(bVar, "");
        this.f96020b = view;
        this.f96021c = view2;
        this.f96022d = view3;
        this.f96023e = bVar;
    }
}
