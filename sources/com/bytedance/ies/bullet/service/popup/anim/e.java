package com.bytedance.ies.bullet.service.popup.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final View f32902a;

    /* renamed from: b  reason: collision with root package name */
    private final View f32903b;

    static {
        Covode.recordClassIndex(19647);
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.d
    public final void a() {
        this.f32902a.setAlpha(0.0f);
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.d
    public final Animator c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32903b, "alpha", 1.0f, 0.0f);
        l.a((Object) ofFloat, "");
        return ofFloat;
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.d
    public final void b() {
        View view = this.f32903b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
        l.a((Object) ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public e(View view) {
        l.c(view, "");
        this.f32902a = view;
        this.f32903b = view;
    }
}
