package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LiveFEConfigs {
    @c(a = "honor_level")
    private HonorLevel honorLevel;

    static {
        Covode.recordClassIndex(63056);
    }

    public HonorLevel getHonorLevel() {
        HonorLevel honorLevel2 = this.honorLevel;
        if (honorLevel2 != null) {
            return honorLevel2;
        }
        throw new a();
    }
}
