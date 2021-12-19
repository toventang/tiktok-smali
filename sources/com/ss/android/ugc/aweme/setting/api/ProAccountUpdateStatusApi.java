package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import l.b.o;

public interface ProAccountUpdateStatusApi {
    static {
        Covode.recordClassIndex(80021);
    }

    @o(a = "/tiktok/user/setting/proaccount_update_status/update/v1/")
    ab<BaseResponse> updateStatus();
}
