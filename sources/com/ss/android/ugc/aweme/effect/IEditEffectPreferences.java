package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.a;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@a(a = "EditEffectConfig")
public interface IEditEffectPreferences {
    static {
        Covode.recordClassIndex(55835);
    }

    @c(a = "fallback_resource_version")
    int getResourceVersion(int i2);

    @b(a = "fallback_resource_version")
    void setResourceVersion(int i2);
}
