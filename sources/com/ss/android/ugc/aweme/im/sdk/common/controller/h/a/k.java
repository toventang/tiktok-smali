package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.b;

public final class k extends b {

    /* renamed from: a  reason: collision with root package name */
    public final long f102315a;

    static {
        Covode.recordClassIndex(65473);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && this.f102315a == ((k) obj).f102315a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f102315a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @Override // com.ss.android.ugc.aweme.im.service.g.b
    public final String toString() {
        return "StickerShowEventKey(stickerId=" + this.f102315a + ")";
    }

    public k(long j2) {
        super("aweme_im_sticker_show", String.valueOf(j2));
        this.f102315a = j2;
    }
}
