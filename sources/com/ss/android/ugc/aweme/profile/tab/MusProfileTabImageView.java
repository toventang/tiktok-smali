package com.ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

public class MusProfileTabImageView extends e {

    /* renamed from: a  reason: collision with root package name */
    TuxIconView f116687a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f116688b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f116689c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f116690d = true;

    static {
        Covode.recordClassIndex(75379);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.bi7);
        this.f116687a = tuxIconView;
        tuxIconView.setAlpha(0.5f);
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.e
    public void setAnimationEnabled(boolean z) {
        this.f116690d = z;
    }

    public void setImageResource(int i2) {
        this.f116687a.setIconRes(i2);
    }

    public final void a(ValueAnimator valueAnimator) {
        this.f116687a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f116688b.cancel();
        this.f116689c.cancel();
        if (z) {
            if (this.f116690d) {
                this.f116688b.start();
            }
        } else if (this.f116690d) {
            this.f116689c.start();
        }
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f116688b = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75380);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.a(valueAnimator);
            }
        });
        this.f116688b.setDuration(150L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        this.f116689c = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(75381);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.a(valueAnimator);
            }
        });
        this.f116689c.setDuration(150L);
    }
}
