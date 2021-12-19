package com.ss.android.ugc.aweme.story.archive;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import h.f.b.l;
import java.util.List;

public final class h implements i<h, g> {

    /* renamed from: a */
    public final a<String> f136757a;

    /* renamed from: b */
    private final com.bytedance.ext_power_list.a<g> f136758b;

    static {
        Covode.recordClassIndex(89346);
    }

    private static h a(com.bytedance.ext_power_list.a<g> aVar, a<String> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return new h(aVar, aVar2);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<g> a() {
        return this.f136758b;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<com.bytedance.ext_power_list.l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<g> c() {
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

    public /* synthetic */ h() {
        this(new com.bytedance.ext_power_list.a(null, null, null, null, 15), new a(""));
    }

    public final int hashCode() {
        int i2;
        com.bytedance.ext_power_list.a<g> aVar = this.f136758b;
        int i3 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        a<String> aVar2 = this.f136757a;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "StoryArchState(listState=" + this.f136758b + ", onCellClickEvent=" + this.f136757a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!l.a(this.f136758b, hVar.f136758b) || !l.a(this.f136757a, hVar.f136757a)) {
            return false;
        }
        return true;
    }

    private h(com.bytedance.ext_power_list.a<g> aVar, a<String> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f136758b = aVar;
        this.f136757a = aVar2;
    }

    public static /* synthetic */ h a(h hVar, com.bytedance.ext_power_list.a aVar, a aVar2, int i2) {
        if ((i2 & 1) != 0) {
            aVar = hVar.f136758b;
        }
        if ((i2 & 2) != 0) {
            aVar2 = hVar.f136757a;
        }
        return a(aVar, aVar2);
    }
}
