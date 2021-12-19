package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final n f129174a;

    static {
        Covode.recordClassIndex(84792);
    }

    o(n nVar) {
        this.f129174a = nVar;
    }

    public final void run() {
        n nVar = this.f129174a;
        nVar.f129163k = true;
        nVar.f129158f = nVar.f129157e.animate().translationX(n.b(c.f115622a, nVar.o)).alpha(0.0f).setDuration(300).setStartDelay((long) (nVar.r ? 150 : 0)).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.AnonymousClass5 */

            static {
                Covode.recordClassIndex(84785);
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                n.this.c();
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                n.this.c();
            }
        });
        if (nVar.r) {
            nVar.f129156d.animate().translationX(n.b(c.f115622a, nVar.n)).alpha(0.0f).setDuration(150);
        }
    }
}
