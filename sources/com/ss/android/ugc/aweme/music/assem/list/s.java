package com.ss.android.ugc.aweme.music.assem.list;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.ss.android.ugc.aweme.music.assem.list.cell.d;
import com.ss.android.ugc.aweme.music.p;
import java.util.List;

public final class s implements i<s, d> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f111258a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Integer> f111259b;

    /* renamed from: c  reason: collision with root package name */
    public final a<p> f111260c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Boolean> f111261d;

    /* renamed from: e  reason: collision with root package name */
    public final a<Object> f111262e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<d> f111263f;

    static {
        Covode.recordClassIndex(71484);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<d> a() {
        return this.f111263f;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<d> c() {
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

    public /* synthetic */ s() {
        this(true, new a(0), new a(null), new a(false), new a(null), new com.bytedance.ext_power_list.a(null, null, null, null, 15));
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = this.f111258a;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = i6 * 31;
        a<Integer> aVar = this.f111259b;
        int i10 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i9 + i2) * 31;
        a<p> aVar2 = this.f111260c;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        a<Boolean> aVar3 = this.f111261d;
        if (aVar3 != null) {
            i4 = aVar3.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        a<Object> aVar4 = this.f111262e;
        if (aVar4 != null) {
            i5 = aVar4.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        com.bytedance.ext_power_list.a<d> aVar5 = this.f111263f;
        if (aVar5 != null) {
            i10 = aVar5.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "OriginMusicListState(needRefresh=" + this.f111258a + ", refreshEvent=" + this.f111259b + ", pinEvent=" + this.f111260c + ", scrollTop=" + this.f111261d + ", errorEvent=" + this.f111262e + ", listState=" + this.f111263f + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f111258a != sVar.f111258a || !h.f.b.l.a(this.f111259b, sVar.f111259b) || !h.f.b.l.a(this.f111260c, sVar.f111260c) || !h.f.b.l.a(this.f111261d, sVar.f111261d) || !h.f.b.l.a(this.f111262e, sVar.f111262e) || !h.f.b.l.a(this.f111263f, sVar.f111263f)) {
            return false;
        }
        return true;
    }

    private s(boolean z, a<Integer> aVar, a<p> aVar2, a<Boolean> aVar3, a<? extends Object> aVar4, com.bytedance.ext_power_list.a<d> aVar5) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(aVar3, "");
        h.f.b.l.d(aVar4, "");
        h.f.b.l.d(aVar5, "");
        this.f111258a = z;
        this.f111259b = aVar;
        this.f111260c = aVar2;
        this.f111261d = aVar3;
        this.f111262e = aVar4;
        this.f111263f = aVar5;
    }

    public static /* synthetic */ s a(s sVar, boolean z, a aVar, a aVar2, a aVar3, a aVar4, com.bytedance.ext_power_list.a aVar5, int i2) {
        com.bytedance.ext_power_list.a aVar6 = aVar5;
        a aVar7 = aVar4;
        boolean z2 = z;
        a aVar8 = aVar;
        a aVar9 = aVar2;
        a aVar10 = aVar3;
        if ((i2 & 1) != 0) {
            z2 = sVar.f111258a;
        }
        if ((i2 & 2) != 0) {
            aVar8 = sVar.f111259b;
        }
        if ((i2 & 4) != 0) {
            aVar9 = sVar.f111260c;
        }
        if ((i2 & 8) != 0) {
            aVar10 = sVar.f111261d;
        }
        if ((i2 & 16) != 0) {
            aVar7 = sVar.f111262e;
        }
        if ((i2 & 32) != 0) {
            aVar6 = sVar.f111263f;
        }
        h.f.b.l.d(aVar8, "");
        h.f.b.l.d(aVar9, "");
        h.f.b.l.d(aVar10, "");
        h.f.b.l.d(aVar7, "");
        h.f.b.l.d(aVar6, "");
        return new s(z2, aVar8, aVar9, aVar10, aVar7, aVar6);
    }
}
