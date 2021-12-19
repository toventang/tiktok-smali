package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import org.json.JSONObject;

public interface IUpdateSettingService {
    static {
        Covode.recordClassIndex(80507);
    }

    f a();

    void a(String str, int i2);

    void a(JSONObject jSONObject);
}
