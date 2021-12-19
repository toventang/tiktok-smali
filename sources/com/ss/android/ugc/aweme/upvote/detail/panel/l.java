package com.ss.android.ugc.aweme.upvote.detail.panel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class l implements j {

    /* renamed from: a */
    public final q f142199a;

    /* renamed from: b */
    public final boolean f142200b;

    /* renamed from: c */
    public final float f142201c;

    /* renamed from: d */
    public final a<Boolean> f142202d;

    static {
        Covode.recordClassIndex(92963);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f142199a, lVar.f142199a) && this.f142200b == lVar.f142200b && Float.compare(this.f142201c, lVar.f142201c) == 0 && h.f.b.l.a(this.f142202d, lVar.f142202d);
    }

    public final String toString() {
        return "UpvoteDetailPanelState(status=" + this.f142199a + ", isSelfUpvoted=" + this.f142200b + ", sheetSlideOffset=" + this.f142201c + ", refreshEvent=" + this.f142202d + ")";
    }

    public final int hashCode() {
        int i2;
        q qVar = this.f142199a;
        int i3 = 0;
        if (qVar != null) {
            i2 = qVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        boolean z = this.f142200b;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int floatToIntBits = (((i4 + i5) * 31) + Float.floatToIntBits(this.f142201c)) * 31;
        a<Boolean> aVar = this.f142202d;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return floatToIntBits + i3;
    }

    public l(q qVar, boolean z, float f2, a<Boolean> aVar) {
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(aVar, "");
        this.f142199a = qVar;
        this.f142200b = z;
        this.f142201c = f2;
        this.f142202d = aVar;
    }

    public static /* synthetic */ l a(l lVar, q qVar, boolean z, float f2, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            qVar = lVar.f142199a;
        }
        if ((i2 & 2) != 0) {
            z = lVar.f142200b;
        }
        if ((i2 & 4) != 0) {
            f2 = lVar.f142201c;
        }
        if ((i2 & 8) != 0) {
            aVar = lVar.f142202d;
        }
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(aVar, "");
        return new l(qVar, z, f2, aVar);
    }
}
