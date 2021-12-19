package com.bytedance.push.frontier.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.a.a;

@a(a = "frontier_local_setting")
public interface FrontierLocalSetting extends ILocalSettings {
    static {
        Covode.recordClassIndex(25757);
    }

    long a();

    void a(long j2);

    void a(a aVar);

    a b();
}
