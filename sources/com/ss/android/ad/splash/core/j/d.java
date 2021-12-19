package com.ss.android.ad.splash.core.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.f.o;
import com.zhiliaoapp.musically.R;

public final class d extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f58647a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f58648b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f58649c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f58650d;

    /* renamed from: e  reason: collision with root package name */
    private Animator f58651e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f58652f;

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f58653g;

    static {
        Covode.recordClassIndex(36360);
    }

    public final void a() {
        Animator animator = this.f58650d;
        if (animator != null) {
            animator.cancel();
            this.f58650d = null;
        }
        Animator animator2 = this.f58651e;
        if (animator2 != null) {
            animator2.cancel();
            this.f58651e = null;
        }
        AnimatorSet animatorSet = this.f58652f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f58652f = null;
        }
        AnimatorSet animatorSet2 = this.f58653g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f58653g = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58652f = new AnimatorSet();
        this.f58653g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f);
        this.f58650d = ofFloat;
        ofFloat.setDuration(120L);
        this.f58650d.setInterpolator(new LinearInterpolator());
        this.f58650d.setStartDelay(1000);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, 0.0f);
        this.f58651e = ofFloat2;
        ofFloat2.setDuration(120L);
        this.f58651e.setStartDelay(3500);
        this.f58651e.setInterpolator(new LinearInterpolator());
        Interpolator a2 = b.a(0.4f, 0.8f, 0.74f, 1.0f);
        float translationY = this.f58649c.getTranslationY();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f58649c, View.TRANSLATION_Y, translationY, ((float) ((int) o.a(getContext(), 80.0f))) + translationY);
        ofFloat3.setInterpolator(a2);
        ofFloat3.setDuration(1000L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f58649c, View.ROTATION, 30.0f, 0.0f);
        ofFloat4.setInterpolator(a2);
        ofFloat4.setDuration(1000L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f58649c, View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setStartDelay(880);
        ofFloat5.setDuration(120L);
        ofFloat5.setInterpolator(new LinearInterpolator());
        this.f58652f.playTogether(ofFloat3, ofFloat4, ofFloat5);
        this.f58652f.setStartDelay(1000);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f58649c, View.TRANSLATION_Y, translationY, translationY + ((float) ((int) o.a(getContext(), 80.0f))));
        ofFloat6.setInterpolator(a2);
        ofFloat6.setDuration(1000L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f58649c, View.ROTATION, 30.0f, 0.0f);
        ofFloat7.setInterpolator(a2);
        ofFloat7.setDuration(1000L);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f58649c, View.ALPHA, 0.0f, 1.0f);
        ofFloat8.setDuration(120L);
        ofFloat8.setInterpolator(new LinearInterpolator());
        this.f58653g.playTogether(ofFloat6, ofFloat7, ofFloat8);
        this.f58653g.setStartDelay(2400);
        this.f58650d.start();
        this.f58651e.start();
        this.f58652f.start();
        this.f58653g.start();
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            a();
        }
    }

    public d(Context context) {
        super(context);
        MethodCollector.i(2883);
        int a2 = (int) o.a(context, 3.0f);
        TextView textView = new TextView(context);
        this.f58648b = textView;
        textView.setText(R.string.g39);
        this.f58648b.setShadowLayer(3.0f, 0.0f, 1.0f, Color.parseColor("#80000000"));
        this.f58648b.setTextColor(-1);
        this.f58648b.setGravity(14);
        this.f58648b.setTextSize(1, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) o.a(context, 24.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.f58648b.setLayoutParams(layoutParams);
        this.f58648b.setId(R.id.e8e);
        ImageView imageView = new ImageView(context);
        this.f58647a = imageView;
        imageView.setImageResource(R.drawable.bjz);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) o.a(context, 23.0f), (int) o.a(context, 132.0f));
        layoutParams2.addRule(2, R.id.e8e);
        layoutParams2.bottomMargin = (int) o.a(context, 27.0f);
        layoutParams2.leftMargin = (int) o.a(context, 34.0f);
        layoutParams2.addRule(9);
        this.f58647a.setLayoutParams(layoutParams2);
        this.f58647a.setPadding(a2, a2, a2, a2);
        ImageView imageView2 = new ImageView(context);
        this.f58649c = imageView2;
        imageView2.setImageResource(R.drawable.bk0);
        int a3 = (int) o.a(context, 59.0f);
        int a4 = (int) o.a(context, 48.0f);
        this.f58649c.setPivotX((float) (((int) o.a(context, 7.0f)) + a3));
        this.f58649c.setPivotY((float) a4);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a3, a4);
        layoutParams3.addRule(2, R.id.e8e);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = (int) o.a(context, 26.0f);
        layoutParams3.bottomMargin = (int) o.a(context, 96.0f);
        this.f58649c.setLayoutParams(layoutParams3);
        this.f58649c.setPadding(a2, a2, a2, a2);
        addView(this.f58648b);
        addView(this.f58647a);
        addView(this.f58649c);
        setAlpha(0.0f);
        MethodCollector.o(2883);
    }
}
