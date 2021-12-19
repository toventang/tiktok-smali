package com.ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final s f71436a;

    static {
        Covode.recordClassIndex(43962);
    }

    w(s sVar) {
        this.f71436a = sVar;
    }

    public final void run() {
        s sVar = this.f71436a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(sVar.A, "backgroundColor", sVar.A.getResources().getColor(R.color.f159922f), sVar.A.getResources().getColor(R.color.c9));
        ofInt.setDuration(3000L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        sVar.f71415a.setNeedHint(false);
    }
}
