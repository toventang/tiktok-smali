package com.ss.android.ugc.aweme.notice.repo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.b.a;
import com.ss.android.ugc.aweme.services.RetrofitService;

public final class NotificationApi {

    public interface INotificationApi {
        static {
            Covode.recordClassIndex(72504);
        }

        @h(a = "/aweme/v1/feedback/cancel/")
        b<String> cancelFeedback();

        @h(a = "/aweme/v1/notice/count/")
        b<NoticeList> query(@z(a = "source") int i2);
    }

    static {
        Covode.recordClassIndex(72503);
    }

    public static NoticeList a(int i2) {
        return ((INotificationApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(a.C2885a.f112790c).create(INotificationApi.class)).query(i2).execute().f42630b;
    }
}
