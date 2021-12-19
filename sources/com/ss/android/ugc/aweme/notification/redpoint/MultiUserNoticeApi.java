package com.ss.android.ugc.aweme.notification.redpoint;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.api.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.t;

public final class MultiUserNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    static final MultiUserNoticeRetrofitApi f113786a = ((MultiUserNoticeRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(a.f113228e).create(MultiUserNoticeRetrofitApi.class));

    public interface MultiUserNoticeRetrofitApi {
        static {
            Covode.recordClassIndex(73171);
        }

        @f(a = "/aweme/v1/notice/multi_user/count/")
        i<e> getMultiUserNoticeCount(@t(a = "user_ids") String str);
    }

    static {
        Covode.recordClassIndex(73170);
    }
}
