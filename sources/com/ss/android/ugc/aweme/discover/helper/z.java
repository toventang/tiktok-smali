package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;

public final class z extends b {

    /* renamed from: d  reason: collision with root package name */
    public int f81197d = n.a(-5.0d);

    /* renamed from: e  reason: collision with root package name */
    private View f81198e;

    static {
        Covode.recordClassIndex(50465);
    }

    private void c() {
        this.f81094b = 160;
        this.f81197d = n.a(0.0d);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void d(Animator animator) {
        c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void a(Animator animator) {
        this.f81198e.setTranslationY(0.0f);
        this.f81198e.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void b(Animator animator) {
        this.f81198e.setVisibility(8);
        c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void a(ValueAnimator valueAnimator) {
        this.f81198e.setTranslationY(((float) this.f81197d) * valueAnimator.getAnimatedFraction());
        this.f81198e.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void b(ValueAnimator valueAnimator) {
        this.f81198e.setTranslationY(((float) this.f81197d) * (1.0f - valueAnimator.getAnimatedFraction()));
        this.f81198e.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void c(Animator animator) {
        this.f81198e.setVisibility(0);
        this.f81198e.setTranslationY((float) this.f81197d);
        this.f81198e.setAlpha(0.0f);
    }

    public z(Context context, View view) {
        super(context);
        this.f81198e = view;
        c();
        this.f81095c = 1;
    }
}
