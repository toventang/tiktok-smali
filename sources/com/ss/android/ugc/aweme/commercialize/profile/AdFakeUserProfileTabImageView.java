package com.ss.android.ugc.aweme.commercialize.profile;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class AdFakeUserProfileTabImageView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private TuxIconView f75082a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f75083b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f75084c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f75085d;

    static {
        Covode.recordClassIndex(46296);
    }

    public AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.azt);
        l.b(findViewById, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.f75082a = tuxIconView;
        if (tuxIconView == null) {
            l.a("iconImage");
        }
        tuxIconView.setAlpha(0.5f);
    }

    public final void setAnimationEnabled(boolean z) {
        this.f75085d = z;
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileTabImageView f75086a;

        static {
            Covode.recordClassIndex(46297);
        }

        a(AdFakeUserProfileTabImageView adFakeUserProfileTabImageView) {
            this.f75086a = adFakeUserProfileTabImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = this.f75086a;
            l.b(valueAnimator, "");
            adFakeUserProfileTabImageView.a(valueAnimator);
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileTabImageView f75087a;

        static {
            Covode.recordClassIndex(46298);
        }

        b(AdFakeUserProfileTabImageView adFakeUserProfileTabImageView) {
            this.f75087a = adFakeUserProfileTabImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = this.f75087a;
            l.b(valueAnimator, "");
            adFakeUserProfileTabImageView.a(valueAnimator);
        }
    }

    public final void setImageResource(int i2) {
        TuxIconView tuxIconView = this.f75082a;
        if (tuxIconView == null) {
            l.a("iconImage");
        }
        tuxIconView.setIconRes(i2);
    }

    public final void a(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        TuxIconView tuxIconView = this.f75082a;
        if (tuxIconView == null) {
            l.a("iconImage");
        }
        tuxIconView.setAlpha(floatValue);
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        ValueAnimator valueAnimator = this.f75083b;
        if (valueAnimator == null) {
            l.a("mSelectAnimator");
        }
        valueAnimator.cancel();
        ValueAnimator valueAnimator2 = this.f75084c;
        if (valueAnimator2 == null) {
            l.a("mUnSelectAnimator");
        }
        valueAnimator2.cancel();
        if (z) {
            if (this.f75085d) {
                ValueAnimator valueAnimator3 = this.f75083b;
                if (valueAnimator3 == null) {
                    l.a("mSelectAnimator");
                }
                valueAnimator3.start();
            }
        } else if (this.f75085d) {
            ValueAnimator valueAnimator4 = this.f75084c;
            if (valueAnimator4 == null) {
                l.a("mUnSelectAnimator");
            }
            valueAnimator4.start();
        }
    }

    private /* synthetic */ AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10583);
        this.f75085d = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        l.b(ofFloat, "");
        this.f75083b = ofFloat;
        if (ofFloat == null) {
            l.a("mSelectAnimator");
        }
        ofFloat.addUpdateListener(new a(this));
        ValueAnimator valueAnimator = this.f75083b;
        if (valueAnimator == null) {
            l.a("mSelectAnimator");
        }
        valueAnimator.setDuration(150L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        l.b(ofFloat2, "");
        this.f75084c = ofFloat2;
        if (ofFloat2 == null) {
            l.a("mUnSelectAnimator");
        }
        ofFloat2.addUpdateListener(new b(this));
        ValueAnimator valueAnimator2 = this.f75084c;
        if (valueAnimator2 == null) {
            l.a("mUnSelectAnimator");
        }
        valueAnimator2.setDuration(150L);
        MethodCollector.o(10583);
    }
}
