package com.ss.android.ugc.aweme.commercialize.live.promote.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements IIconSlot {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74678a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ae f74679b;

    static {
        Covode.recordClassIndex(46042);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46043);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.b$b  reason: collision with other inner class name */
    public static final class C1695b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(46044);
        }

        C1695b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final ae a() {
        return this.f74679b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    public final Animator.AnimatorListener b() {
        return new C1695b();
    }

    public b(ae aeVar) {
        l.d(aeVar, "");
        this.f74679b = aeVar;
    }
}
