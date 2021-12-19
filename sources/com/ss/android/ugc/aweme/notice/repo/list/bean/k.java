package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

public final class k extends BaseResponse implements d {
    @c(a = "avatar_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<UrlModel> f112868a;
    @c(a = "enable")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f112869b;

    /* renamed from: c  reason: collision with root package name */
    private String f112870c;

    static {
        Covode.recordClassIndex(72556);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.f112870c;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.f112870c = str;
    }
}
