package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.c;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f102314a;

    static {
        Covode.recordClassIndex(65472);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && this.f102314a == ((j) obj).f102314a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f102314a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "StickerShowEventBody(isPreload=" + this.f102314a + ")";
    }

    public /* synthetic */ j() {
        this(c.a());
    }

    private j(boolean z) {
        super(ag.a(v.a("is_preload", Boolean.valueOf(z))), null, null, 6);
        this.f102314a = z;
    }
}
