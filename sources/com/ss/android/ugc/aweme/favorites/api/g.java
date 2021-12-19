package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class g extends BaseResponse {
    @c(a = "item_archive_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f90469a;

    static {
        Covode.recordClassIndex(56785);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f90469a, ((g) obj).f90469a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f90469a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionManageResponse(collectionId=" + this.f90469a + ")";
    }
}
