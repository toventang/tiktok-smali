package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final int f102310a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f102311b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f102312c;

    static {
        Covode.recordClassIndex(65470);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f102310a == hVar.f102310a && this.f102311b == hVar.f102311b && this.f102312c == hVar.f102312c;
    }

    public final int hashCode() {
        int i2 = this.f102310a * 31;
        boolean z = this.f102311b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f102312c) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "LoadConversationsEventBody(conversationCount=" + this.f102310a + ", hasSorted=" + this.f102311b + ", isFaulted=" + this.f102312c + ")";
    }

    public h(int i2, boolean z, boolean z2) {
        super(ag.a(v.a("has_sorted", Boolean.valueOf(z)), v.a("is_faulted", Boolean.valueOf(z2))), ag.a(v.a("conversation_count", Integer.valueOf(i2)), v.a("is_faulted", Boolean.valueOf(z2))), null, 4);
        this.f102310a = i2;
        this.f102311b = z;
        this.f102312c = z2;
    }
}
