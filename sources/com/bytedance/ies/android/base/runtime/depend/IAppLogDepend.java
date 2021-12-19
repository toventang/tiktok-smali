package com.bytedance.ies.android.base.runtime.depend;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public interface IAppLogDepend {
    static {
        Covode.recordClassIndex(18657);
    }

    void appendCommonParams(StringBuilder sb, boolean z);

    String getCategory(boolean z);

    ExecutorService getLogThreadPool();

    void onEventV1(Context context, String str, String str2, String str3, String str4, long j2, JSONObject jSONObject);

    void onEventV3Bundle(String str, Bundle bundle);

    void onEventV3Json(String str, JSONObject jSONObject);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);
}
