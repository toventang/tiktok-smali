package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.c.b;
import com.ss.android.ugc.tools.view.c.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128769a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(84491);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a$a  reason: collision with other inner class name */
    public static final class C3359a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f128773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f128774b;

        static {
            Covode.recordClassIndex(84492);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f128773a) {
                this.f128774b.setVisibility(0);
            }
        }

        C3359a(boolean z, View view) {
            this.f128773a = z;
            this.f128774b = view;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            if (!this.f128773a) {
                this.f128774b.setVisibility(4);
            }
        }
    }

    public static void a(View view, boolean z) {
        TimeInterpolator cVar;
        float f2;
        l.d(view, "");
        ViewPropertyAnimator duration = view.animate().setDuration(300);
        if (z) {
            cVar = new b();
        } else {
            cVar = new c();
        }
        ViewPropertyAnimator interpolator = duration.setInterpolator(cVar);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        interpolator.alpha(f2).setListener(new C3359a(z, view)).start();
    }
}
