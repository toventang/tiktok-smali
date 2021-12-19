package com.ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.detail.g.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;

public final class DetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final IDetailApi f79607a = ((IDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(IDetailApi.class));

    /* renamed from: b  reason: collision with root package name */
    private static final String f79608b = (b.f59141e + "/aweme/v1/aweme/detail/");

    public interface IDetailApi {
        static {
            Covode.recordClassIndex(49452);
        }

        @h(a = "/aweme/v1/aweme/detail/")
        com.bytedance.retrofit2.b<String> queryAweme(@z(a = "aweme_id") String str, @z(a = "origin_type") String str2, @z(a = "request_source") int i2, @z(a = "notice_source") int i3, @z(a = "translator_id") String str3);

        @t(a = "/tiktok/v1/ad/experience/ad/history/detail/")
        @g
        com.bytedance.retrofit2.b<String> queryAwemeFromInbox(@e(a = "aweme_id") String str, @e(a = "msg_extra") String str2);

        @t(a = "/aweme/v1/multi/aweme/detail/")
        @g
        com.bytedance.retrofit2.b<a> queryBatchAweme(@e(a = "aweme_ids") String str, @e(a = "origin_type") String str2, @e(a = "push_params") String str3, @e(a = "request_source") int i2);
    }

    static {
        Covode.recordClassIndex(49451);
    }

    public static a a(String str, String str2, String str3, int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if ("chat".equals(str3)) {
            i2 = 3;
            str3 = "";
        }
        return f79607a.queryBatchAweme(str, str3, str2, i2).execute().f42630b;
    }

    public static Aweme a(String str, String str2, int i2, String str3) {
        T t = f79607a.queryAweme(str, str2, "message".equals(str2) ? 1 : 0, i2, str3).execute().f42630b;
        JSONObject jSONObject = new JSONObject((String) t);
        Api.a(jSONObject, t, f79608b);
        return (Aweme) GsonHolder.c().b().a(jSONObject.optString("aweme_detail"), Aweme.class);
    }
}
