package com.ss.android.ugc.aweme.compliance.business.commentfilter.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.commentfilter.b.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.o;
import l.b.t;

public final class CommentFilterApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f76867a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(API.class));

    public interface API {
        static {
            Covode.recordClassIndex(47511);
        }

        @f(a = "/aweme/v2/comment/filter/get_words/")
        i<a> getCommentFilterKeywords();

        @o(a = "/aweme/v2/comment/filter/update_words/")
        i<BaseResponse> setCommentFilterKeywords(@t(a = "words") String str);

        @o(a = "/tiktok/v1/comment/filter/trigger/")
        f.a.t<BaseResponse> triggerSyncServerCommentFilter();
    }

    static {
        Covode.recordClassIndex(47510);
    }
}
