package com.ss.android.ugc.aweme.kids.discovery.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.kids.common.a.a;
import com.ss.android.ugc.aweme.kids.discovery.c.d;
import f.a.t;
import h.f.b.l;

public final class DetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final DetailApi f106420a = new DetailApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RetrofitApi f106421b = ((RetrofitApi) RetrofitFactory.a().a(a.f105880a).a(RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(68006);
        }

        @h(a = "/tiktok/v1/kids/category/videos/")
        t<d> getDetailList(@z(a = "ch_id") String str, @z(a = "cursor") int i2, @z(a = "count") int i3);
    }

    private DetailApi() {
    }

    static {
        Covode.recordClassIndex(68005);
    }

    public static t<d> a(String str, int i2, int i3) {
        l.d(str, "");
        return f106421b.getDetailList(str, i2, i3);
    }
}
