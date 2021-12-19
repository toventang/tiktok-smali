package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class da implements a {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131675a;

    static {
        Covode.recordClassIndex(86230);
    }

    da(cj cjVar) {
        this.f131675a = cjVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        MethodCollector.i(9077);
        cj cjVar = this.f131675a;
        cjVar.f131595b.setVisibility(0);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(cjVar.getContext(), R.anim.bn);
        animatorSet.setTarget(cjVar.f131595b);
        animatorSet.start();
        MethodCollector.o(9077);
        return null;
    }
}
