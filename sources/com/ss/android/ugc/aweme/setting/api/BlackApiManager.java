package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.model.e;
import java.util.concurrent.ExecutionException;
import l.b.f;
import l.b.t;

public final class BlackApiManager {

    /* renamed from: a  reason: collision with root package name */
    static BlackApi f122043a = ((BlackApi) a.a(Api.f66569d, BlackApi.class));

    interface BlackApi {
        static {
            Covode.recordClassIndex(80008);
        }

        @f(a = "/aweme/v1/user/block/list/")
        q<e> fetchBlackList(@t(a = "index") int i2, @t(a = "count") int i3);

        @f(a = "/aweme/v1/im/set/chatpriv/")
        q<BaseResponse> setChatAuthority(@t(a = "val") int i2);
    }

    static {
        Covode.recordClassIndex(80007);
    }

    public static e a(int i2) {
        try {
            return f122043a.fetchBlackList(i2, 10).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
