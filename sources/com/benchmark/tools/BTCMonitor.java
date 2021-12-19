package com.benchmark.tools;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class BTCMonitor {

    public interface IMonitor {
        static {
            Covode.recordClassIndex(3054);
        }

        void monitorLog(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(3053);
    }
}
