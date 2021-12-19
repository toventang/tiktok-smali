package com.google.ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ah extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InstallActivity f53407a;

    static {
        Covode.recordClassIndex(33058);
    }

    ah(InstallActivity installActivity) {
        this.f53407a = installActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f53407a.showSpinner();
    }
}
