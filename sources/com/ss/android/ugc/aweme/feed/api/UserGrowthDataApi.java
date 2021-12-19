package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import f.a.t;

public final class UserGrowthDataApi {

    public interface NewUserProgressDataApi {
        static {
            Covode.recordClassIndex(57889);
        }

        @h(a = "/tiktok/v1/guidance/progressbar/")
        t<NewUserProgressModel> getGuidanceProgressBarData();
    }

    static {
        Covode.recordClassIndex(57888);
    }
}
