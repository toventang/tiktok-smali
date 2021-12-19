package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;
import java.util.List;

public final class a<ITEM extends com.bytedance.ies.powerlist.b.a> implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<l> f28667a;

    /* renamed from: b  reason: collision with root package name */
    public final f<l> f28668b;

    /* renamed from: c  reason: collision with root package name */
    public final f<l> f28669c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ITEM> f28670d;

    static {
        Covode.recordClassIndex(16869);
    }

    public a() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f28667a, aVar.f28667a) && l.a(this.f28668b, aVar.f28668b) && l.a(this.f28669c, aVar.f28669c) && l.a(this.f28670d, aVar.f28670d);
    }

    public final int hashCode() {
        f<l> fVar = this.f28667a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        f<l> fVar2 = this.f28668b;
        int hashCode2 = (hashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        f<l> fVar3 = this.f28669c;
        int hashCode3 = (hashCode2 + (fVar3 != null ? fVar3.hashCode() : 0)) * 31;
        List<ITEM> list = this.f28670d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "AssemListState(refreshState=" + this.f28667a + ", loadMoreState=" + this.f28668b + ", loadLatestState=" + this.f28669c + ", listItemState=" + this.f28670d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends ITEM extends com.bytedance.ies.powerlist.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(f<l> fVar, f<l> fVar2, f<l> fVar3, List<? extends ITEM> list) {
        l.c(fVar, "");
        l.c(fVar2, "");
        l.c(fVar3, "");
        this.f28667a = fVar;
        this.f28668b = fVar2;
        this.f28669c = fVar3;
        this.f28670d = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, f fVar2, f fVar3, List list, int i2) {
        this((i2 & 1) != 0 ? t.f25669a : fVar, (i2 & 2) != 0 ? t.f25669a : fVar2, (i2 & 4) != 0 ? t.f25669a : fVar3, (i2 & 8) != 0 ? null : list);
    }

    public static /* synthetic */ a a(a aVar, f fVar, f fVar2, f fVar3, List list, int i2) {
        if ((i2 & 1) != 0) {
            fVar = aVar.f28667a;
        }
        if ((i2 & 2) != 0) {
            fVar2 = aVar.f28668b;
        }
        if ((i2 & 4) != 0) {
            fVar3 = aVar.f28669c;
        }
        if ((i2 & 8) != 0) {
            list = aVar.f28670d;
        }
        l.c(fVar, "");
        l.c(fVar2, "");
        l.c(fVar3, "");
        return new a(fVar, fVar2, fVar3, list);
    }
}
