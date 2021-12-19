package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import l.b.f;
import l.b.t;
import l.b.u;

public final class FeedActionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RetrofitApi f91922a = ((RetrofitApi) a.a(b.f59141e, RetrofitApi.class));

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(57867);
        }

        @f(a = "/aweme/v1/aweme/delete/")
        q<BaseResponse> deleteItem(@t(a = "aweme_id") String str);

        @f(a = "/aweme/v1/schedule/aweme/delete/")
        q<BaseResponse> deleteScheduleItem(@t(a = "aweme_id") String str);

        @f(a = "/aweme/v1/commit/item/digg/")
        q<BaseResponse> diggItem(@u Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57866);
    }
}
