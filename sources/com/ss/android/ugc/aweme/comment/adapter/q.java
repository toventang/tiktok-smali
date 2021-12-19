package com.ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f71401a;

    static {
        Covode.recordClassIndex(43951);
    }

    q(h hVar) {
        this.f71401a = hVar;
    }

    public final void run() {
        h hVar = this.f71401a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(hVar.f71374a, "backgroundColor", hVar.f71374a.getResources().getColor(R.color.f159922f), hVar.f71374a.getResources().getColor(R.color.c9));
        ofInt.setDuration(3000L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        hVar.y.setNeedHint(false);
    }
}
