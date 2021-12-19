package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.p;
import java.util.List;

public final class c implements i<c, a> {

    /* renamed from: a  reason: collision with root package name */
    public final p<List<IMUser>, String> f72319a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<a> f72320b;

    static {
        Covode.recordClassIndex(44601);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<a> a() {
        return this.f72320b;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<a> c() {
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

    public final int hashCode() {
        int i2;
        p<List<IMUser>, String> pVar = this.f72319a;
        int i3 = 0;
        if (pVar != null) {
            i2 = pVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        com.bytedance.ext_power_list.a<a> aVar = this.f72320b;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "SearchState(searchResult=" + this.f72319a + ", listState=" + this.f72320b + ")";
    }

    public /* synthetic */ c(p pVar) {
        this(pVar, new com.bytedance.ext_power_list.a(null, null, null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!h.f.b.l.a(this.f72319a, cVar.f72319a) || !h.f.b.l.a(this.f72320b, cVar.f72320b)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    private c(p<? extends List<? extends IMUser>, String> pVar, com.bytedance.ext_power_list.a<a> aVar) {
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(aVar, "");
        this.f72319a = pVar;
        this.f72320b = aVar;
    }

    public static /* synthetic */ c a(c cVar, p pVar, com.bytedance.ext_power_list.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            pVar = cVar.f72319a;
        }
        if ((i2 & 2) != 0) {
            aVar = cVar.f72320b;
        }
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(aVar, "");
        return new c(pVar, aVar);
    }
}
