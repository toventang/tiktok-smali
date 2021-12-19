package com.ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f92246a;

    /* renamed from: b  reason: collision with root package name */
    public final l f92247b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Boolean> f92248c;

    static {
        Covode.recordClassIndex(58238);
    }

    public k() {
        this(false, (l) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f92246a == kVar.f92246a && l.a(this.f92247b, kVar.f92247b) && l.a(this.f92248c, kVar.f92248c);
    }

    public final int hashCode() {
        boolean z = this.f92246a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        l lVar = this.f92247b;
        int i6 = 0;
        int hashCode = (i5 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        a<Boolean> aVar = this.f92248c;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "VideoDiggState(showFestival=" + this.f92246a + ", displayState=" + this.f92247b + ", showClickAnim=" + this.f92248c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(boolean z, l lVar, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : lVar, (a<Boolean>) null);
    }

    private k(boolean z, l lVar, a<Boolean> aVar) {
        this.f92246a = z;
        this.f92247b = lVar;
        this.f92248c = aVar;
    }

    public static /* synthetic */ k a(k kVar, boolean z, l lVar, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            z = kVar.f92246a;
        }
        if ((i2 & 2) != 0) {
            lVar = kVar.f92247b;
        }
        if ((i2 & 4) != 0) {
            aVar = kVar.f92248c;
        }
        return new k(z, lVar, aVar);
    }
}
