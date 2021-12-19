package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;

public final class af extends Visibility {
    static {
        Covode.recordClassIndex(50389);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(transitionValues, "");
        l.d(transitionValues2, "");
        return null;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(transitionValues, "");
        l.d(transitionValues2, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) n.a(20.0d), 0.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
