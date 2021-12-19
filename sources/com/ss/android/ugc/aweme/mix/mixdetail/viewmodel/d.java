package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.z;
import java.util.List;

public final class d implements j {

    /* renamed from: a */
    public final List<Aweme> f110141a;

    /* renamed from: b */
    public final a<Aweme> f110142b;

    /* renamed from: c */
    public final a<Boolean> f110143c;

    /* renamed from: d */
    public final int f110144d;

    /* renamed from: e */
    public final boolean f110145e;

    /* renamed from: f */
    public final int f110146f;

    /* renamed from: g */
    public final com.ss.android.ugc.aweme.mix.model.d f110147g;

    /* renamed from: h */
    public final f<e> f110148h;

    /* renamed from: i */
    public final a<z> f110149i;

    static {
        Covode.recordClassIndex(70697);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f110141a, dVar.f110141a) && l.a(this.f110142b, dVar.f110142b) && l.a(this.f110143c, dVar.f110143c) && this.f110144d == dVar.f110144d && this.f110145e == dVar.f110145e && this.f110146f == dVar.f110146f && l.a(this.f110147g, dVar.f110147g) && l.a(this.f110148h, dVar.f110148h) && l.a(this.f110149i, dVar.f110149i);
    }

    public final int hashCode() {
        List<Aweme> list = this.f110141a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        a<Aweme> aVar = this.f110142b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<Boolean> aVar2 = this.f110143c;
        int hashCode3 = (((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f110144d) * 31;
        boolean z = this.f110145e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((hashCode3 + i3) * 31) + this.f110146f) * 31;
        com.ss.android.ugc.aweme.mix.model.d dVar = this.f110147g;
        int hashCode4 = (i6 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        f<e> fVar = this.f110148h;
        int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        a<z> aVar3 = this.f110149i;
        if (aVar3 != null) {
            i2 = aVar3.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "MixVideosState(mixVideos=" + this.f110141a + ", selectVideoChange=" + this.f110142b + ", mixDeleteAction=" + this.f110143c + ", pullType=" + this.f110144d + ", openBottomDialog=" + this.f110145e + ", requestStatus=" + this.f110146f + ", mixDetail=" + this.f110147g + ", panelState=" + this.f110148h + ", clickMixVideosDialog=" + this.f110149i + ")";
    }

    public /* synthetic */ d() {
        this(null, null, null, 1, false, 0, null, t.f25669a, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private d(List<? extends Aweme> list, a<? extends Aweme> aVar, a<Boolean> aVar2, int i2, boolean z, int i3, com.ss.android.ugc.aweme.mix.model.d dVar, f<e> fVar, a<z> aVar3) {
        l.d(fVar, "");
        this.f110141a = list;
        this.f110142b = aVar;
        this.f110143c = aVar2;
        this.f110144d = i2;
        this.f110145e = z;
        this.f110146f = i3;
        this.f110147g = dVar;
        this.f110148h = fVar;
        this.f110149i = aVar3;
    }

    public static /* synthetic */ d a(d dVar, List list, a aVar, a aVar2, int i2, boolean z, int i3, com.ss.android.ugc.aweme.mix.model.d dVar2, f fVar, a aVar3, int i4) {
        a aVar4 = aVar3;
        f fVar2 = fVar;
        com.ss.android.ugc.aweme.mix.model.d dVar3 = dVar2;
        int i5 = i3;
        boolean z2 = z;
        List list2 = list;
        a aVar5 = aVar;
        a aVar6 = aVar2;
        int i6 = i2;
        if ((i4 & 1) != 0) {
            list2 = dVar.f110141a;
        }
        if ((i4 & 2) != 0) {
            aVar5 = dVar.f110142b;
        }
        if ((i4 & 4) != 0) {
            aVar6 = dVar.f110143c;
        }
        if ((i4 & 8) != 0) {
            i6 = dVar.f110144d;
        }
        if ((i4 & 16) != 0) {
            z2 = dVar.f110145e;
        }
        if ((i4 & 32) != 0) {
            i5 = dVar.f110146f;
        }
        if ((i4 & 64) != 0) {
            dVar3 = dVar.f110147g;
        }
        if ((i4 & 128) != 0) {
            fVar2 = dVar.f110148h;
        }
        if ((i4 & 256) != 0) {
            aVar4 = dVar.f110149i;
        }
        l.d(fVar2, "");
        return new d(list2, aVar5, aVar6, i6, z2, i5, dVar3, fVar2, aVar4);
    }
}
