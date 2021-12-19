package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f7926a;

    /* renamed from: b  reason: collision with root package name */
    public final l f7927b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f7928c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7929d;

    static {
        Covode.recordClassIndex(3925);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7926a == kVar.f7926a && l.a(this.f7927b, kVar.f7927b) && l.a(this.f7928c, kVar.f7928c) && this.f7929d == kVar.f7929d;
    }

    public final int hashCode() {
        int i2 = this.f7926a * 31;
        l lVar = this.f7927b;
        int i3 = 0;
        int hashCode = (i2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        CharSequence charSequence = this.f7928c;
        if (charSequence != null) {
            i3 = charSequence.hashCode();
        }
        return ((hashCode + i3) * 31) + this.f7929d;
    }

    public final String toString() {
        return "NotifyInfo(viewVisibility=" + this.f7926a + ", notifyType=" + this.f7927b + ", text=" + this.f7928c + ", arrowVisibility=" + this.f7929d + ")";
    }

    public /* synthetic */ k(l lVar) {
        this(8, lVar, "");
    }

    public k(int i2, l lVar, CharSequence charSequence) {
        l.d(lVar, "");
        l.d(charSequence, "");
        this.f7926a = i2;
        this.f7927b = lVar;
        this.f7928c = charSequence;
        this.f7929d = 8;
    }
}
