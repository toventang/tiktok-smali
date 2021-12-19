package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "items")

    /* renamed from: a  reason: collision with root package name */
    public final List<Aweme> f90446a;
    @com.google.gson.a.c(a = "max_cursor")

    /* renamed from: b  reason: collision with root package name */
    public final Long f90447b;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f90448c;

    static {
        Covode.recordClassIndex(56779);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f90446a, cVar.f90446a) && l.a(this.f90447b, cVar.f90447b) && l.a(this.f90448c, cVar.f90448c);
    }

    public final int hashCode() {
        List<Aweme> list = this.f90446a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l2 = this.f90447b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.f90448c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionContentResponse(items=" + this.f90446a + ", maxCursor=" + this.f90447b + ", hasMore=" + this.f90448c + ")";
    }

    private /* synthetic */ c() {
        this(null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends Aweme> list, Long l2, Boolean bool) {
        this.f90446a = list;
        this.f90447b = l2;
        this.f90448c = bool;
    }
}
