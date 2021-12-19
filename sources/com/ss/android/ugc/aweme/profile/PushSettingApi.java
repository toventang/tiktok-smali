package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface PushSettingApi {
    static {
        Covode.recordClassIndex(74704);
    }

    @f(a = "/aweme/v1/user/set/settings/")
    ab<BaseResponse> setItem(@t(a = "field") String str, @t(a = "value") int i2);
}
