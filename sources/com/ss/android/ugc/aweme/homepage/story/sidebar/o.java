package com.ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.a;
import com.bytedance.ext_power_list.i;
import h.f.b.l;
import java.util.List;

public final class o implements i<o, n> {

    /* renamed from: a */
    final a<n> f99487a;

    /* renamed from: b */
    public final com.bytedance.assem.arch.extensions.a<Integer> f99488b;

    /* renamed from: c */
    public final int f99489c;

    static {
        Covode.recordClassIndex(63457);
    }

    private static o a(a<n> aVar, com.bytedance.assem.arch.extensions.a<Integer> aVar2, int i2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new o(aVar, aVar2, i2);
    }

    @Override // com.bytedance.ext_power_list.h
    public final a<n> a() {
        return this.f99487a;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<com.bytedance.ext_power_list.l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<n> c() {
        return i.a.b(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<com.bytedance.ext_power_list.l> d() {
        return i.a.c(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<com.bytedance.ext_power_list.l> e() {
        return i.a.d(this);
    }

    public /* synthetic */ o() {
        this(new a(null, null, null, null, 15), new com.bytedance.assem.arch.extensions.a(0), 0);
    }

    public final int hashCode() {
        int i2;
        a<n> aVar = this.f99487a;
        int i3 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        com.bytedance.assem.arch.extensions.a<Integer> aVar2 = this.f99488b;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        return ((i4 + i3) * 31) + this.f99489c;
    }

    public final String toString() {
        return "StorySidebarState(listState=" + this.f99487a + ", incrementalListSize=" + this.f99488b + ", onCellSelectedPosition=" + this.f99489c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!l.a(this.f99487a, oVar.f99487a) || !l.a(this.f99488b, oVar.f99488b) || this.f99489c != oVar.f99489c) {
            return false;
        }
        return true;
    }

    private o(a<n> aVar, com.bytedance.assem.arch.extensions.a<Integer> aVar2, int i2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f99487a = aVar;
        this.f99488b = aVar2;
        this.f99489c = i2;
    }

    public static /* synthetic */ o a(o oVar, a aVar, com.bytedance.assem.arch.extensions.a aVar2, int i2, int i3) {
        if ((i3 & 1) != 0) {
            aVar = oVar.f99487a;
        }
        if ((i3 & 2) != 0) {
            aVar2 = oVar.f99488b;
        }
        if ((i3 & 4) != 0) {
            i2 = oVar.f99489c;
        }
        return a(aVar, aVar2, i2);
    }
}
