package com.ss.android.ugc.aweme.kids.a.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public long f105305a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f105306b;
    @c(a = "mc_list")

    /* renamed from: c  reason: collision with root package name */
    public List<d> f105307c;

    static {
        Covode.recordClassIndex(67502);
    }

    public final List<d> a() {
        List<d> list = this.f105307c;
        if (list == null || list.isEmpty()) {
            return this.f105307c;
        }
        return c.a(this.f105307c);
    }
}
