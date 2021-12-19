package com.ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "age")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f62626a;

    static {
        Covode.recordClassIndex(38553);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f62626a, ((b) obj).f62626a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f62626a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBResponse(age=" + this.f62626a + ")";
    }

    private /* synthetic */ b() {
        this(0);
    }

    private b(Integer num) {
        this.f62626a = num;
    }
}
