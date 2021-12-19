package com.ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.a;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.ss.android.ugc.aweme.relation.recommend.j;
import java.util.List;

public final class b implements i<b, j> {

    /* renamed from: a  reason: collision with root package name */
    private final a<j> f120570a;

    static {
        Covode.recordClassIndex(78506);
    }

    @Override // com.bytedance.ext_power_list.h
    public final a<j> a() {
        return this.f120570a;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<j> c() {
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

    public /* synthetic */ b() {
        this(new a(null, null, null, null, 15));
    }

    public final int hashCode() {
        a<j> aVar = this.f120570a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecFriendsListState(listState=" + this.f120570a + ")";
    }

    public b(a<j> aVar) {
        h.f.b.l.d(aVar, "");
        this.f120570a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !h.f.b.l.a(this.f120570a, ((b) obj).f120570a)) {
            return false;
        }
        return true;
    }
}
