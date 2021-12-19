package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.in;
import java.util.HashMap;
import java.util.Map;
import l.b.f;
import l.b.u;
import l.b.x;

public final class ChallengeUtilApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f109459a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f109460b = (Api.f66569d + "/aweme/v1/challenge/detail/");

    /* renamed from: c  reason: collision with root package name */
    private static final String f109461c = (Api.f66569d + "/aweme/v1/commerce/challenge/detail/");

    /* renamed from: d  reason: collision with root package name */
    private static final RealApi f109462d;

    interface RealApi {
        static {
            Covode.recordClassIndex(70092);
        }

        @f
        q<ChallengeDetail> getChallengeDetail(@x String str, @u Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(70091);
        String str = Api.f66569d;
        f109459a = str;
        f109462d = (RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(RealApi.class);
    }

    public static String a(String str) {
        if (CommerceChallengeServiceImpl.e().b(str)) {
            in.d();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ch_id", str);
        hashMap.put("query_type", "0");
        hashMap.put("click_reason", "0");
        return null;
    }
}
