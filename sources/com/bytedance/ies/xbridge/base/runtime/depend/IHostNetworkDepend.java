package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostNetworkDepend {

    public static final class a {
        static {
            Covode.recordClassIndex(21418);
        }
    }

    static {
        Covode.recordClassIndex(21417);
    }

    XIRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();
}
