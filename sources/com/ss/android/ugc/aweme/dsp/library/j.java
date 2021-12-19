package com.ss.android.ugc.aweme.dsp.library;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.ss.android.ugc.aweme.dsp.library.a.a;
import java.util.List;

public final class j implements i<j, a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f83352a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f83353b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<a> f83354c;

    static {
        Covode.recordClassIndex(52005);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<a> a() {
        return this.f83354c;
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

    public /* synthetic */ j() {
        this(new com.bytedance.ext_power_list.a(null, null, null, null, 15), 0, null);
    }

    public final int hashCode() {
        int i2;
        com.bytedance.ext_power_list.a<a> aVar = this.f83354c;
        int i3 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = ((i2 * 31) + this.f83352a) * 31;
        Boolean bool = this.f83353b;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "MusicLibraryVMState(listState=" + this.f83354c + ", scroll2Top=" + this.f83352a + ", showLoading=" + this.f83353b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!h.f.b.l.a(this.f83354c, jVar.f83354c) || this.f83352a != jVar.f83352a || !h.f.b.l.a(this.f83353b, jVar.f83353b)) {
            return false;
        }
        return true;
    }

    private j(com.bytedance.ext_power_list.a<a> aVar, int i2, Boolean bool) {
        h.f.b.l.d(aVar, "");
        this.f83354c = aVar;
        this.f83352a = i2;
        this.f83353b = bool;
    }

    public static /* synthetic */ j a(j jVar, com.bytedance.ext_power_list.a aVar, int i2, Boolean bool, int i3) {
        if ((i3 & 1) != 0) {
            aVar = jVar.f83354c;
        }
        if ((i3 & 2) != 0) {
            i2 = jVar.f83352a;
        }
        if ((i3 & 4) != 0) {
            bool = jVar.f83353b;
        }
        h.f.b.l.d(aVar, "");
        return new j(aVar, i2, bool);
    }
}
