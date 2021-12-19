package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class ScaleFadeCircleView extends View {
    static {
        Covode.recordClassIndex(46804);
    }

    public final void a() {
        a(this);
        b(this);
    }

    private static void a(View view) {
        view.setAlpha(0.7f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.7f, 0.0f);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    private static void b(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.5f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.5f);
        ofFloat.setRepeatCount(-1);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(1500L);
        animatorSet.start();
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ScaleFadeCircleView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12550);
        setBackground(b.a(context, (int) R.drawable.a90));
        MethodCollector.o(12550);
    }
}
