package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public final int f102303a;

    static {
        Covode.recordClassIndex(65467);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && this.f102303a == ((e) obj).f102303a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f102303a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "FirstInitEventKey(inbox=" + this.f102303a + ")";
    }

    public e(int i2) {
        super("aweme_im_init_end", String.valueOf(i2));
        this.f102303a = i2;
    }
}
