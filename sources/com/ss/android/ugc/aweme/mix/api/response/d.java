package com.ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class d extends BaseResponse implements g {
    @c(a = "mix")

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.mix.model.d f109798a;

    /* renamed from: b  reason: collision with root package name */
    private a<?> f109799b;

    static {
        Covode.recordClassIndex(70317);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final a<?> getRequestInfo() {
        return this.f109799b;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final void setRequestInfo(a<?> aVar) {
        if (aVar != null) {
            this.f109799b = aVar;
        }
    }
}
