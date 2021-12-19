package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f111236a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f111237b;

    static {
        Covode.recordClassIndex(71455);
    }

    public static /* synthetic */ k a(k kVar, boolean z, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            z = kVar.f111236a;
        }
        if ((i2 & 2) != 0) {
            aVar = kVar.f111237b;
        }
        return a(z, aVar);
    }

    private static k a(boolean z, a<String> aVar) {
        return new k(z, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f111236a == kVar.f111236a && l.a(this.f111237b, kVar.f111237b);
    }

    public final int hashCode() {
        boolean z = this.f111236a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        a<String> aVar = this.f111237b;
        return i5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MusicCellState(isCollect=" + this.f111236a + ", toastEvent=" + this.f111237b + ")";
    }

    public /* synthetic */ k() {
        this(false, null);
    }

    private k(boolean z, a<String> aVar) {
        this.f111236a = z;
        this.f111237b = aVar;
    }
}
