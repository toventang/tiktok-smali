package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.setting.model.p;
import l.b.f;

public interface ShareSettingApi {
    static {
        Covode.recordClassIndex(79979);
    }

    @f(a = "/aweme/v2/platform/share/settings/")
    q<p> queryRawSetting();
}
