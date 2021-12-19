package com.ss.android.ugc.aweme.live.settings;

import b.i;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import l.b.f;
import l.b.u;

public interface LiveSDKSettingApi {
    static {
        Covode.recordClassIndex(69588);
    }

    @f(a = "/webcast/setting/")
    i<c> querySettings(@u Map<String, String> map);
}
