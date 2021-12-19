package com.ss.android.ugc.aweme.feed.assem.corss.language;

import com.bytedance.assem.arch.extensions.g;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f92138a;

    /* renamed from: b  reason: collision with root package name */
    public final g f92139b;

    static {
        Covode.recordClassIndex(58129);
    }

    public static /* synthetic */ l a(l lVar, boolean z, g gVar, int i2) {
        if ((i2 & 1) != 0) {
            z = lVar.f92138a;
        }
        if ((i2 & 2) != 0) {
            gVar = lVar.f92139b;
        }
        return a(z, gVar);
    }

    private static l a(boolean z, g gVar) {
        h.f.b.l.d(gVar, "");
        return new l(z, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f92138a == lVar.f92138a && h.f.b.l.a(this.f92139b, lVar.f92139b);
    }

    public final int hashCode() {
        boolean z = this.f92138a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        g gVar = this.f92139b;
        return i5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoCrossLanguageState(showCaptions=" + this.f92138a + ", updateCaptionUI=" + this.f92139b + ")";
    }

    public /* synthetic */ l() {
        this(false, new g(false));
    }

    private l(boolean z, g gVar) {
        h.f.b.l.d(gVar, "");
        this.f92138a = z;
        this.f92139b = gVar;
    }
}
