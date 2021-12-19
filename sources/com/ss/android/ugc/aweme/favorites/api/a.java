package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class a extends BaseResponse {
    @c(a = "aweme_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<Aweme> f90442a = null;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public final Long f90443b = null;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f90444c = null;

    static {
        Covode.recordClassIndex(56777);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f90442a, aVar.f90442a) && l.a(this.f90443b, aVar.f90443b) && l.a(this.f90444c, aVar.f90444c);
    }

    public final int hashCode() {
        List<Aweme> list = this.f90442a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l2 = this.f90443b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num = this.f90444c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AllFavoriteContentResponse(items=" + this.f90442a + ", maxCursor=" + this.f90443b + ", hasMore=" + this.f90444c + ")";
    }

    private a() {
    }
}
