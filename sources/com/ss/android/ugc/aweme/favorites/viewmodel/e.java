package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<List<b>> f91010a;

    /* renamed from: b  reason: collision with root package name */
    public final long f91011b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f91012c;

    static {
        Covode.recordClassIndex(57230);
    }

    public static e a(f<? extends List<b>> fVar, long j2, boolean z) {
        l.d(fVar, "");
        return new e(fVar, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f91010a, eVar.f91010a) && this.f91011b == eVar.f91011b && this.f91012c == eVar.f91012c;
    }

    public final String toString() {
        return "VideoCollectionListState(data=" + this.f91010a + ", cursor=" + this.f91011b + ", hasMore=" + this.f91012c + ")";
    }

    public /* synthetic */ e() {
        this(t.f25669a, 0, true);
    }

    public final int hashCode() {
        int i2;
        f<List<b>> fVar = this.f91010a;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f91011b;
        int i3 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f91012c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.b>> */
    /* JADX WARN: Multi-variable type inference failed */
    private e(f<? extends List<b>> fVar, long j2, boolean z) {
        l.d(fVar, "");
        this.f91010a = fVar;
        this.f91011b = j2;
        this.f91012c = z;
    }
}
