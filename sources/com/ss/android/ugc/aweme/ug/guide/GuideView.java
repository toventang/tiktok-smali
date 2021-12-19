package com.ss.android.ugc.aweme.ug.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class GuideView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f141847a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f141848b;

    /* renamed from: c  reason: collision with root package name */
    public PlayView f141849c;

    /* renamed from: d  reason: collision with root package name */
    float f141850d;

    static {
        Covode.recordClassIndex(92707);
    }

    public GuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static int a(Context context, float f2) {
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    private GuideView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9045);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sx, (ViewGroup) null);
        this.f141849c = (PlayView) inflate.findViewById(R.id.bzv);
        View findViewById = inflate.findViewById(R.id.bx2);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f141850d = (float) a(context, 1.0f);
        this.f141847a = new AnimatorSet();
        this.f141848b = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "rotation", 0.0f, 60.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "translationY", 0.0f, this.f141850d * -60.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, "rotation", 60.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById, "translationY", this.f141850d * -60.0f, 0.0f);
        this.f141847a.play(ofFloat).with(ofFloat2);
        this.f141848b.play(ofFloat3).with(ofFloat4);
        findViewById.setPivotX((float) a(context, 114.0f));
        findViewById.setPivotY((float) a(context, 60.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat3.setDuration(1000L);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat4.setDuration(1000L);
        ofFloat4.setInterpolator(new DecelerateInterpolator(2.0f));
        this.f141847a.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.ug.guide.GuideView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(92708);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GuideView.this.f141848b.start();
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                GuideView.this.f141849c.f141875m.start();
            }
        });
        this.f141848b.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.ug.guide.GuideView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(92709);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GuideView.this.f141847a.start();
            }
        });
        MethodCollector.o(9045);
    }
}
