package com.ss.android.ugc.aweme.base.ui.a;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68343a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final b f68344b = new b();

    private a() {
    }

    static {
        Covode.recordClassIndex(42073);
    }

    public static final void a(Animator animator, int i2) {
        l.d(animator, "");
        if (b.a(i2)) {
            animator.start();
        }
    }
}
