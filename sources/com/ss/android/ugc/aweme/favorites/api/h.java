package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class h extends BaseResponse {
    @c(a = "is_valid")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f90470a = null;

    static {
        Covode.recordClassIndex(56786);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f90470a, ((h) obj).f90470a);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.f90470a;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionNameCheckResponse(isValid=" + this.f90470a + ")";
    }

    private h() {
    }
}
