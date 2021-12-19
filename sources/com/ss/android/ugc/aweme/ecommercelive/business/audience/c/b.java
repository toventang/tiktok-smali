package com.ss.android.ugc.aweme.ecommercelive.business.audience.c;

import android.animation.Animator;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    private final ae f87788a;

    /* renamed from: b  reason: collision with root package name */
    private final Animator.AnimatorListener f87789b;

    static {
        Covode.recordClassIndex(55210);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f87788a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return this.f87789b;
    }

    public b(ae aeVar, Animator.AnimatorListener animatorListener) {
        l.d(aeVar, "");
        l.d(animatorListener, "");
        this.f87788a = aeVar;
        this.f87789b = animatorListener;
    }
}
