package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c;

public abstract class d extends com.ss.android.ugc.aweme.im.service.k.a {

    /* renamed from: f  reason: collision with root package name */
    public a f101876f = a.SUCCESS;

    static {
        Covode.recordClassIndex(65174);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public String bF_() {
        return this.f103869k;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final long e() {
        long j2 = this.o;
        try {
            h a2 = a.C0745a.a().a(bF_());
            if (a2 != null) {
                return Math.max(c.b(a2), j2);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
        return j2;
    }

    public enum a {
        SENDING,
        FAILED,
        SUCCESS;

        static {
            Covode.recordClassIndex(65175);
        }
    }

    public static a a(int i2) {
        if (i2 == 0 || i2 == 1) {
            return a.SENDING;
        }
        if (i2 != 3) {
            return a.SUCCESS;
        }
        return a.FAILED;
    }
}
