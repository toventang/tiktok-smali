package com.ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitorService {
    static {
        Covode.recordClassIndex(95298);
    }

    void monitorCommonLog(String str, String str2, JSONObject jSONObject);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDirectOnTimer(String str, String str2, float f2);

    void monitorOnTimer(String str, String str2, float f2);

    void monitorStatusAndDuration(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i2, JSONObject jSONObject);
}
