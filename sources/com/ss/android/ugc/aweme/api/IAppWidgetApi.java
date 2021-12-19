package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;

public interface IAppWidgetApi {
    static {
        Covode.recordClassIndex(40832);
    }

    @h(a = "/tiktok/v1/widget/challenge/")
    b<AppWidgetStruct> fetchChallenge(@z(a = "count") int i2, @z(a = "cursor") long j2, @z(a = "widget_size") int i3);
}
