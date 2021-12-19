package com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    private final ae f74568a;

    static {
        Covode.recordClassIndex(45979);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.a.a$a  reason: collision with other inner class name */
    public static final class C1687a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45980);
        }

        C1687a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f74568a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new C1687a();
    }

    public a(ae aeVar) {
        l.d(aeVar, "");
        this.f74568a = aeVar;
    }
}
