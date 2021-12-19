package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h {
    static {
        Covode.recordClassIndex(16337);
    }

    public static d a(Context context) {
        return new d(context, new ICommonParams() {
            /* class com.bytedance.crash.runtime.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16338);
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final long getUserId() {
                return 0;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }
        });
    }
}
