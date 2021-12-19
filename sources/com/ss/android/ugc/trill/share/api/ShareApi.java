package com.ss.android.ugc.trill.share.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.h;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

public final class ShareApi {

    /* renamed from: a  reason: collision with root package name */
    static final ShareService f150608a = ((ShareService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(ShareService.class));

    public interface ShareService {
        static {
            Covode.recordClassIndex(99045);
        }

        @h(a = "/aweme/v1/thrid/platform/share/")
        b<AutoShare> autoShare(@aa Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(99044);
    }
}
