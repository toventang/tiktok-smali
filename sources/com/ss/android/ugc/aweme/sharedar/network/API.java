package com.ss.android.ugc.aweme.sharedar.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.o;

public interface API {
    static {
        Covode.recordClassIndex(81762);
    }

    @o(a = "/tiktok/v1/shareshoot/invite/")
    @e
    b<BaseResponse> inviteFriend(@d Map<String, String> map);
}
