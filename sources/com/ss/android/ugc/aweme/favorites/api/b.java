package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "item_archive_detail")

    /* renamed from: a  reason: collision with root package name */
    public final d f90445a;

    static {
        Covode.recordClassIndex(56778);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f90445a, ((b) obj).f90445a);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.f90445a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionAllFavoritesResponse(detail=" + this.f90445a + ")";
    }

    private b() {
        this.f90445a = null;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
