package com.ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public final class e extends BaseResponse implements g {
    @c(a = "videos")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f109800a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f109801b;
    @c(a = "max_cursor")

    /* renamed from: c  reason: collision with root package name */
    public long f109802c;
    @c(a = "min_cursor")

    /* renamed from: e  reason: collision with root package name */
    public long f109803e;
    @c(a = "has_more_of_load_before")

    /* renamed from: f  reason: collision with root package name */
    public boolean f109804f;
    @c(a = "has_more_of_load_more")

    /* renamed from: g  reason: collision with root package name */
    public boolean f109805g;

    /* renamed from: h  reason: collision with root package name */
    private a<?> f109806h;

    static {
        Covode.recordClassIndex(70318);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final a<?> getRequestInfo() {
        return this.f109806h;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final void setRequestInfo(a<?> aVar) {
        if (aVar != null) {
            this.f109806h = aVar;
        }
    }
}
