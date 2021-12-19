package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class e extends BaseResponse {
    @c(a = "item_archive_detail_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f90457a = null;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public final Long f90458b = null;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f90459c = null;
    @c(a = "total")

    /* renamed from: d  reason: collision with root package name */
    public final Long f90460d = null;

    static {
        Covode.recordClassIndex(56783);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f90457a, eVar.f90457a) && l.a(this.f90458b, eVar.f90458b) && l.a(this.f90459c, eVar.f90459c) && l.a(this.f90460d, eVar.f90460d);
    }

    public final int hashCode() {
        List<d> list = this.f90457a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l2 = this.f90458b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.f90459c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l3 = this.f90460d;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionListResponse(items=" + this.f90457a + ", cursor=" + this.f90458b + ", hasMore=" + this.f90459c + ", total=" + this.f90460d + ")";
    }

    private e() {
    }
}
