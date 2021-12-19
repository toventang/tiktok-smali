package com.ss.android.ugc.aweme.dsp.playpage.queue;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.bytedance.ies.powerlist.b.a;
import java.util.List;

public final class e implements i<e, a> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<a> f83917a;

    static {
        Covode.recordClassIndex(52337);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<a> a() {
        return this.f83917a;
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

    public /* synthetic */ e() {
        this(new com.bytedance.ext_power_list.a(null, null, null, null, 15));
    }

    public final int hashCode() {
        com.bytedance.ext_power_list.a<a> aVar = this.f83917a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MDQueueVMState(listState=" + this.f83917a + ")";
    }

    public e(com.bytedance.ext_power_list.a<a> aVar) {
        h.f.b.l.d(aVar, "");
        this.f83917a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || !h.f.b.l.a(this.f83917a, ((e) obj).f83917a)) {
            return false;
        }
        return true;
    }
}
