package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ShoppingLiveConfig {
    @c(a = "compatible_with_old_version")
    private Boolean compatibleWithOldVersion;

    static {
        Covode.recordClassIndex(63077);
    }

    public Boolean getCompatibleWithOldVersion() {
        Boolean bool = this.compatibleWithOldVersion;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
