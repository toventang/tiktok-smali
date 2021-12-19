package com.ss.android.ugc.aweme.profile.assem.VM;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import java.util.List;

public final class a implements i<a, com.ss.android.ugc.aweme.profile.assem.powercell.a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f116022a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f116023b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.profile.assem.powercell.a> f116024c;

    static {
        Covode.recordClassIndex(74825);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.profile.assem.powercell.a> a() {
        return this.f116024c;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<com.ss.android.ugc.aweme.profile.assem.powercell.a> c() {
        return i.a.b(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> d() {
        return i.a.c(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> e() {
        return i.a.d(this);
    }

    public /* synthetic */ a() {
        this(new com.bytedance.ext_power_list.a(null, null, null, null, 15), 0, false);
    }

    public final int hashCode() {
        int i2;
        com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.profile.assem.powercell.a> aVar = this.f116024c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i3 = ((i2 * 31) + this.f116022a) * 31;
        boolean z = this.f116023b;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "MyVideoListState(listState=" + this.f116024c + ", position=" + this.f116022a + ", loadingTimeOver=" + this.f116023b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (h.f.b.l.a(this.f116024c, aVar.f116024c) && this.f116022a == aVar.f116022a && this.f116023b == aVar.f116023b) {
            return true;
        }
        return false;
    }

    private a(com.bytedance.ext_power_list.a<com.ss.android.ugc.aweme.profile.assem.powercell.a> aVar, int i2, boolean z) {
        h.f.b.l.d(aVar, "");
        this.f116024c = aVar;
        this.f116022a = i2;
        this.f116023b = z;
    }

    public static /* synthetic */ a a(a aVar, com.bytedance.ext_power_list.a aVar2, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            aVar2 = aVar.f116024c;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f116022a;
        }
        if ((i3 & 4) != 0) {
            z = aVar.f116023b;
        }
        h.f.b.l.d(aVar2, "");
        return new a(aVar2, i2, z);
    }
}
