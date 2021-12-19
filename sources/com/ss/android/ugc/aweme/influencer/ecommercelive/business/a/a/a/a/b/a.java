package com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    public static final C2660a f104523a = new C2660a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ae f104524b;

    static {
        Covode.recordClassIndex(66959);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.a$a  reason: collision with other inner class name */
    public static final class C2660a {
        static {
            Covode.recordClassIndex(66960);
        }

        private C2660a() {
        }

        public /* synthetic */ C2660a(byte b2) {
            this();
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(66961);
        }

        b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f104524b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new b();
    }

    public a(ae aeVar) {
        l.d(aeVar, "");
        this.f104524b = aeVar;
    }
}
