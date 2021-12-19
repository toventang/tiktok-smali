package com.ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.business.story.a;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f136825a;

    /* renamed from: b  reason: collision with root package name */
    public final a f136826b;

    /* renamed from: c  reason: collision with root package name */
    public final float f136827c;

    static {
        Covode.recordClassIndex(89403);
    }

    public k() {
        this(false, (a) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f136825a == kVar.f136825a && l.a(this.f136826b, kVar.f136826b) && Float.compare(this.f136827c, kVar.f136827c) == 0;
    }

    public final String toString() {
        return "StoryRingState(isShow=" + this.f136825a + ", mode=" + this.f136826b + ", progress=" + this.f136827c + ")";
    }

    public final int hashCode() {
        int i2;
        boolean z = this.f136825a;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        a aVar = this.f136826b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        return ((i6 + i2) * 31) + Float.floatToIntBits(this.f136827c);
    }

    public k(boolean z, a aVar, float f2) {
        l.d(aVar, "");
        this.f136825a = z;
        this.f136826b = aVar;
        this.f136827c = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(boolean z, a aVar, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? a.BRAND_RING : aVar, 0.0f);
    }
}
