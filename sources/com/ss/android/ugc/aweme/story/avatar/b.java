package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.a;
import com.bytedance.ext_power_list.i;
import h.f.b.l;
import java.util.List;

public final class b implements i<b, r> {

    /* renamed from: a  reason: collision with root package name */
    private final a<r> f136772a;

    static {
        Covode.recordClassIndex(89359);
    }

    public static b a(a<r> aVar) {
        l.d(aVar, "");
        return new b(aVar);
    }

    @Override // com.bytedance.ext_power_list.h
    public final a<r> a() {
        return this.f136772a;
    }

    @Override // com.bytedance.ext_power_list.i
    public final f<com.bytedance.ext_power_list.l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<r> c() {
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

    public /* synthetic */ b() {
        this(new a(null, null, null, null, 15));
    }

    public final int hashCode() {
        a<r> aVar = this.f136772a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AvatarEntryState(listState=" + this.f136772a + ")";
    }

    private b(a<r> aVar) {
        l.d(aVar, "");
        this.f136772a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !l.a(this.f136772a, ((b) obj).f136772a)) {
            return false;
        }
        return true;
    }
}
