package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.d.b;
import h.f.b.l;

public abstract class bq extends b {
    static {
        Covode.recordClassIndex(44727);
    }

    public abstract void a(View view);

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final Animator b(View view) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.75f);
        l.b(ofFloat, "");
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final Animator c(View view) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.75f, 1.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.ss.android.ugc.aweme.common.d.b
    public final void a(View view, MotionEvent motionEvent) {
        l.d(view, "");
        l.d(motionEvent, "");
        a(view);
    }
}
