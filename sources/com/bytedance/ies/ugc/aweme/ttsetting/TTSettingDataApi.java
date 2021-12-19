package com.bytedance.ies.ugc.aweme.ttsetting;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.gson.l;

public final class TTSettingDataApi {

    public interface SettingApi {
        static {
            Covode.recordClassIndex(21086);
        }

        @h(a = "/service/settings/v2/")
        b<l> getResponse(@z(a = "has_local_cache") boolean z, @z(a = "app") int i2, @z(a = "default") int i3);
    }

    static {
        Covode.recordClassIndex(21085);
    }
}
