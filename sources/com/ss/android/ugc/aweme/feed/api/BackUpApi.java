package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;

public final class BackUpApi {

    /* renamed from: a  reason: collision with root package name */
    public static final IBackUpApi f91916a = ((IBackUpApi) a.a(b.f59141e, IBackUpApi.class));

    public interface IBackUpApi {
        static {
            Covode.recordClassIndex(57858);
        }

        @h(a = "aweme/v1/aweme/statistics/")
        q<AwemeStatisticsResponse> queryAwemeStatistics(@z(a = "aweme_ids") String str, @z(a = "type") int i2);
    }

    static {
        Covode.recordClassIndex(57857);
    }
}
