package com.ss.android.ugc.aweme.profile.tip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.c.c;
import h.f.b.l;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final AnimatorSet f116710a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimatorSet f116711b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f116712c;

    /* renamed from: d  reason: collision with root package name */
    private final View f116713d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f116714e;

    static {
        Covode.recordClassIndex(75390);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public abstract View a();

    public View a(int i2) {
        if (this.f116714e == null) {
            this.f116714e = new SparseArray();
        }
        View view = (View) this.f116714e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f116714e.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet getDismissAnimatorSet() {
        return this.f116711b;
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet getShowAnimatorSet() {
        return this.f116710a;
    }

    public final View getView() {
        return this.f116713d;
    }

    public final void b() {
        if (this.f116712c) {
            this.f116712c = false;
            if (this.f116710a.isRunning()) {
                this.f116710a.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), (float) getHeight());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
            this.f116711b.setDuration(200L);
            this.f116711b.setInterpolator(new c());
            this.f116711b.play(ofFloat).with(ofFloat2);
            this.f116711b.start();
            this.f116711b.addListener(new C2972a(this));
        }
    }

    public final void setShow(boolean z) {
        this.f116712c = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.tip.a$a  reason: collision with other inner class name */
    public static final class C2972a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f116715a;

        static {
            Covode.recordClassIndex(75391);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2972a(a aVar) {
            this.f116715a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f116715a.setVisibility(8);
        }
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f116713d = a();
        this.f116710a = new AnimatorSet();
        this.f116711b = new AnimatorSet();
    }
}
