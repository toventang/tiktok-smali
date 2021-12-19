package com.ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<List<a>> f91007a;

    /* renamed from: b  reason: collision with root package name */
    public final long f91008b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f91009c;

    static {
        Covode.recordClassIndex(57229);
    }

    public static d a(f<? extends List<a>> fVar, long j2, boolean z) {
        l.d(fVar, "");
        return new d(fVar, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f91007a, dVar.f91007a) && this.f91008b == dVar.f91008b && this.f91009c == dVar.f91009c;
    }

    public final String toString() {
        return "VideoCollectionContentState(data=" + this.f91007a + ", cursor=" + this.f91008b + ", hasMore=" + this.f91009c + ")";
    }

    public /* synthetic */ d() {
        this(t.f25669a, 0, true);
    }

    public final int hashCode() {
        int i2;
        f<List<a>> fVar = this.f91007a;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f91008b;
        int i3 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f91009c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(f<? extends List<a>> fVar, long j2, boolean z) {
        l.d(fVar, "");
        this.f91007a = fVar;
        this.f91008b = j2;
        this.f91009c = z;
    }
}
