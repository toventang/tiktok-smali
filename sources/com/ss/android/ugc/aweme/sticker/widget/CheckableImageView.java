package com.ss.android.ugc.aweme.sticker.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class CheckableImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public a f136669a;

    public interface a {
        static {
            Covode.recordClassIndex(89258);
        }

        void a();

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(89255);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.08f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.08f);
        ofFloat.setDuration(100L);
        ofFloat2.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 0.0f);
        ofFloat3.setDuration(100L);
        ofFloat4.setDuration(100L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat6.setDuration(100L);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 0.0f, 1.08f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 0.0f, 1.08f);
        ofFloat7.setDuration(100L);
        ofFloat8.setDuration(100L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 1.0f);
        ofFloat9.setDuration(100L);
        ofFloat9.setDuration(100L);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.sticker.widget.CheckableImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(89256);
            }

            public final void onAnimationStart(Animator animator) {
                if (CheckableImageView.this.f136669a != null) {
                    CheckableImageView.this.f136669a.a(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animatorSet2.start();
                if (CheckableImageView.this.f136669a != null) {
                    CheckableImageView.this.f136669a.a(1);
                }
            }
        });
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.sticker.widget.CheckableImageView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(89257);
            }

            public final void onAnimationEnd(Animator animator) {
                if (CheckableImageView.this.f136669a != null) {
                    CheckableImageView.this.f136669a.a();
                }
            }
        });
        animatorSet.start();
    }

    public void setOnStateChangeListener(a aVar) {
        this.f136669a = aVar;
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CheckableImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
    }
}
