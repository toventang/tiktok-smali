package com.ss.android.ugc.aweme.ttep.effectapply;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface EffectFetchApi {
    static {
        Covode.recordClassIndex(92302);
    }

    @t(a = "/api/app/effect_meta")
    @g
    i<a> getEffectMeta(@e(a = "effect_id") String str, @e(a = "sdk_version") String str2, @e(a = "device_platform") String str3);

    @t(a = "/api/internal/effect_meta")
    @g
    i<a> getEffectMetaWithoutLogin(@e(a = "effect_id") String str, @e(a = "sdk_version") String str2, @e(a = "device_platform") String str3);
}
