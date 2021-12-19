package com.ss.android.ugc.aweme.feed.guide;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f93297a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.ViewHolder f93298b;

    /* renamed from: c  reason: collision with root package name */
    private final float f93299c;

    static {
        Covode.recordClassIndex(59148);
    }

    k(j jVar, RecyclerView.ViewHolder viewHolder, float f2) {
        this.f93297a = jVar;
        this.f93298b = viewHolder;
        this.f93299c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecyclerView.ViewHolder viewHolder = this.f93298b;
        float f2 = this.f93299c;
        View view = viewHolder.itemView;
        Float f3 = (Float) valueAnimator.getAnimatedValue();
        view.setTranslationX((1.0f - f3.floatValue()) * f2);
        view.setAlpha((f3.floatValue() * 0.65999997f) + 0.34f);
        view.setScaleX((f3.floatValue() * 0.100000024f) + 0.9f);
        view.setScaleY((f3.floatValue() * 0.100000024f) + 0.9f);
        view.setTranslationY(j.a(viewHolder, (1.0f - f3.floatValue()) * 12.0f));
    }
}
