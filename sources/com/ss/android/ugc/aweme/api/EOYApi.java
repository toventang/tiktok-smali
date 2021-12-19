package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import java.util.Map;
import l.b.f;

public interface EOYApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66438a = a.f66439a;

    static {
        Covode.recordClassIndex(40830);
    }

    @f(a = "/tiktok/eoy21/discover_more/list/v1")
    t<Map<Object, Object>> discoverMore(@l.b.t(a = "count") int i2, @l.b.t(a = "offset") int i3, @l.b.t(a = "extra") String str, @l.b.t(a = "need_complete_aweme_list") boolean z);

    @f(a = "/tiktok/eoy21/question_cloud/list/v1")
    t<Map<Object, Object>> questionCloud();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f66439a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(40831);
        }

        public static EOYApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(EOYApi.class);
            l.b(create, "");
            return (EOYApi) create;
        }
    }
}
