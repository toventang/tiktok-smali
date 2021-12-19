package com.ss.android.ugc.aweme.commercialize.live.business.links.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    private final ae f74557a;

    static {
        Covode.recordClassIndex(45974);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.a.a$a  reason: collision with other inner class name */
    public static final class C1685a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45975);
        }

        C1685a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f74557a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new C1685a();
    }

    public a(ae aeVar) {
        l.d(aeVar, "");
        this.f74557a = aeVar;
    }
}
