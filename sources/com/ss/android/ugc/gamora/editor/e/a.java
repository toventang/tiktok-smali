package com.ss.android.ugc.gamora.editor.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.util.ap;
import h.f.a.q;
import h.f.a.r;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    int f145805a;

    /* renamed from: b  reason: collision with root package name */
    public float f145806b;

    /* renamed from: c  reason: collision with root package name */
    final Activity f145807c;

    /* renamed from: d  reason: collision with root package name */
    int f145808d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    final View f145809e;

    /* renamed from: f  reason: collision with root package name */
    public final g f145810f;

    /* renamed from: g  reason: collision with root package name */
    final q<Float, Float, Float, z> f145811g;

    /* renamed from: h  reason: collision with root package name */
    final h.f.a.b<Float, z> f145812h;

    /* renamed from: i  reason: collision with root package name */
    public final r<Integer, Integer, Integer, Integer, z> f145813i;

    static {
        Covode.recordClassIndex(95799);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f145821a;

        static {
            Covode.recordClassIndex(95801);
        }

        b(b bVar) {
            this.f145821a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f145821a.f145824b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145822a;

        static {
            Covode.recordClassIndex(95802);
        }

        c(a aVar) {
            this.f145822a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            a aVar = this.f145822a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            aVar.f145806b = ((Float) animatedValue).floatValue();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e.a$a  reason: collision with other inner class name */
    static final class C3885a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f145815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f145816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f145817d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f145818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f145819f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f145820g;

        static {
            Covode.recordClassIndex(95800);
        }

        C3885a(a aVar, boolean z, int i2, int i3, float f2, int i4, int i5) {
            this.f145814a = aVar;
            this.f145815b = z;
            this.f145816c = i2;
            this.f145817d = i3;
            this.f145818e = f2;
            this.f145819f = i4;
            this.f145820g = i5;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr;
            l.d(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (this.f145815b) {
                animatedFraction = 1.0f - animatedFraction;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (dg.a(this.f145817d, this.f145816c)) {
                float f2 = this.f145818e;
                float f3 = f2 * floatValue;
                fArr = new float[]{f3, (((float) this.f145819f) - f3) / 2.0f, ((float) (this.f145820g - com.ss.android.ugc.aweme.adaptation.a.f66177a.d())) * animatedFraction};
            } else {
                float f4 = this.f145818e * floatValue;
                fArr = new float[]{f4, (((float) this.f145819f) - f4) / 2.0f, 0.0f};
            }
            float f5 = fArr[0];
            float f6 = fArr[1];
            int i2 = (int) f6;
            int i3 = (int) fArr[2];
            int i4 = (int) f5;
            int i5 = (int) floatValue;
            this.f145814a.f145810f.a(i2, i3, i4, i5);
            this.f145814a.f145813i.a(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            a aVar = this.f145814a;
            float f7 = (floatValue * 1.0f) / ((float) this.f145816c);
            if (aVar.f145808d == Integer.MAX_VALUE && ap.a(f7, 1.0f, 1.0E-5f)) {
                aVar.f145808d = i3;
            }
            aVar.f145811g.invoke(Float.valueOf(f7), Float.valueOf((float) i2), Float.valueOf(((float) (i3 - aVar.f145808d)) + aVar.f145806b));
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127972a = i2;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127973b = i3;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127974c = i4;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127975d = i5;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        float f2 = (float) i2;
        float f3 = (float) i3;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f3);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        this.f145809e.startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new c(this));
        ofFloat.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.q<? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Float, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Float, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.r<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(View view, g gVar, q<? super Float, ? super Float, ? super Float, z> qVar, h.f.a.b<? super Float, z> bVar, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, z> rVar) {
        l.d(view, "");
        l.d(gVar, "");
        l.d(qVar, "");
        l.d(bVar, "");
        l.d(rVar, "");
        this.f145809e = view;
        this.f145810f = gVar;
        this.f145811g = qVar;
        this.f145812h = bVar;
        this.f145813i = rVar;
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f145807c = (Activity) context;
    }
}
