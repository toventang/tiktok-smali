package com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    public static final C2662a f104533a = new C2662a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ae f104534b;

    static {
        Covode.recordClassIndex(66968);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.a$a  reason: collision with other inner class name */
    public static final class C2662a {
        static {
            Covode.recordClassIndex(66969);
        }

        private C2662a() {
        }

        public /* synthetic */ C2662a(byte b2) {
            this();
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(66970);
        }

        b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f104534b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new b();
    }

    public a(ae aeVar) {
        l.d(aeVar, "");
        this.f104534b = aeVar;
    }
}
