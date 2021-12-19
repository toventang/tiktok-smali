package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.l;
import com.bytedance.ies.powerlist.b.a;
import java.util.List;

public final class f implements i<f, a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f120164a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f120165b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.ext_power_list.a<a> f120166c;

    static {
        Covode.recordClassIndex(78153);
    }

    @Override // com.bytedance.ext_power_list.h
    public final com.bytedance.ext_power_list.a<a> a() {
        return this.f120166c;
    }

    @Override // com.bytedance.ext_power_list.i
    public final com.bytedance.assem.arch.extensions.f<l> b() {
        return i.a.a(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final List<a> c() {
        return i.a.b(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final com.bytedance.assem.arch.extensions.f<l> d() {
        return i.a.c(this);
    }

    @Override // com.bytedance.ext_power_list.i
    public final com.bytedance.assem.arch.extensions.f<l> e() {
        return i.a.d(this);
    }

    public /* synthetic */ f() {
        this(new com.bytedance.ext_power_list.a(null, null, null, null, 15), 0, false);
    }

    public final int hashCode() {
        int i2;
        com.bytedance.ext_power_list.a<a> aVar = this.f120166c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i3 = ((i2 * 31) + this.f120164a) * 31;
        boolean z = this.f120165b;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "UserProfilePublishListRecommendUserState(listState=" + this.f120166c + ", position=" + this.f120164a + ", loadingTimeOver=" + this.f120165b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (h.f.b.l.a(this.f120166c, fVar.f120166c) && this.f120164a == fVar.f120164a && this.f120165b == fVar.f120165b) {
            return true;
        }
        return false;
    }

    private f(com.bytedance.ext_power_list.a<a> aVar, int i2, boolean z) {
        h.f.b.l.d(aVar, "");
        this.f120166c = aVar;
        this.f120164a = i2;
        this.f120165b = z;
    }

    public static /* synthetic */ f a(f fVar, com.bytedance.ext_power_list.a aVar, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            aVar = fVar.f120166c;
        }
        if ((i3 & 2) != 0) {
            i2 = fVar.f120164a;
        }
        if ((i3 & 4) != 0) {
            z = fVar.f120165b;
        }
        h.f.b.l.d(aVar, "");
        return new f(aVar, i2, z);
    }
}
