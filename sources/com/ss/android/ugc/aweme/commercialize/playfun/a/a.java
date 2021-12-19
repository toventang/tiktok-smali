package com.ss.android.ugc.aweme.commercialize.playfun.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.playfun.d;
import com.ss.android.ugc.aweme.commercialize.playfun.e;
import h.f.b.l;

public class a extends d {

    /* renamed from: c  reason: collision with root package name */
    public Animator f74955c;

    static {
        Covode.recordClassIndex(46212);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public void a() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public void b() {
        int i2 = Build.VERSION.SDK_INT;
        Animator animator = this.f74955c;
        if (animator != null) {
            animator.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public void c() {
        int i2 = Build.VERSION.SDK_INT;
        Animator animator = this.f74955c;
        if (animator != null) {
            animator.resume();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public void e() {
        Animator animator = this.f74955c;
        if (animator != null) {
            animator.cancel();
        }
        a((Animator) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a$a  reason: collision with other inner class name */
    public static final class C1703a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f74956a;

        static {
            Covode.recordClassIndex(46213);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1703a(a aVar) {
            this.f74956a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f74956a.g();
        }

        public final void onAnimationCancel(Animator animator) {
            this.f74956a.f74994b.a(1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }

    /* access modifiers changed from: protected */
    public final void a(Animator animator) {
        this.f74955c = animator;
        if (animator != null) {
            animator.addListener(new C1703a(this));
        }
    }
}
