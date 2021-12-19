package com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    private final ae f74584a;

    static {
        Covode.recordClassIndex(45988);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.a.a$a  reason: collision with other inner class name */
    public static final class C1689a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45989);
        }

        C1689a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f74584a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new C1689a();
    }

    public a(ae aeVar) {
        l.d(aeVar, "");
        this.f74584a = aeVar;
    }
}
