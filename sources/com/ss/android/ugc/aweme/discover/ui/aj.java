package com.ss.android.ugc.aweme.discover.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.d.b;

public abstract class aj extends b {

    /* renamed from: f  reason: collision with root package name */
    public boolean f82288f = true;

    static {
        Covode.recordClassIndex(51212);
    }

    public abstract void a(View view);

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final Animator b(View view) {
        if (!this.f82288f) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final Animator c(View view) {
        if (!this.f82288f) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final void a(View view, MotionEvent motionEvent) {
        a(view);
    }
}
