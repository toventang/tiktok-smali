package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.c;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final int f102299a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f102300b;

    static {
        Covode.recordClassIndex(65464);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f102299a == bVar.f102299a && this.f102300b == bVar.f102300b;
    }

    public final int hashCode() {
        int i2 = this.f102299a * 31;
        boolean z = this.f102300b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "EnterChatEventBody(messageCount=" + this.f102299a + ", isPreload=" + this.f102300b + ")";
    }

    public /* synthetic */ b(int i2) {
        this(i2, c.a());
    }

    private b(int i2, boolean z) {
        super(ag.a(v.a("is_preload", Boolean.valueOf(z))), ag.a(v.a("init_size", Integer.valueOf(i2))), null, 4);
        this.f102299a = i2;
        this.f102300b = z;
    }
}
