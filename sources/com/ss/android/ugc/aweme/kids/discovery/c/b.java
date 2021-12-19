package com.ss.android.ugc.aweme.kids.discovery.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "category_list")

    /* renamed from: a  reason: collision with root package name */
    public List<a> f106430a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public int f106431b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public int f106432c;

    static {
        Covode.recordClassIndex(68014);
    }

    public final boolean a() {
        if (this.f106431b == 1) {
            return true;
        }
        return false;
    }
}
