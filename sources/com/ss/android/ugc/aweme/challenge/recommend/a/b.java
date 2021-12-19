package com.ss.android.ugc.aweme.challenge.recommend.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "intervene_list")

    /* renamed from: a  reason: collision with root package name */
    public List<a> f70006a;
    @c(a = "need_history")

    /* renamed from: b  reason: collision with root package name */
    public boolean f70007b;
    @c(a = "fill_history_end")

    /* renamed from: c  reason: collision with root package name */
    public boolean f70008c;
    @c(a = "need_privacy_history")

    /* renamed from: d  reason: collision with root package name */
    public boolean f70009d;
    @c(a = "show_privacy_count")

    /* renamed from: e  reason: collision with root package name */
    public int f70010e;

    static {
        Covode.recordClassIndex(43180);
    }

    public final List<a> a() {
        List<a> list = this.f70006a;
        if (list == null) {
            return new ArrayList(0);
        }
        return list;
    }
}
