package com.appsflyer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    static {
        Covode.recordClassIndex(2660);
    }

    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        m35("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        m35("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        MethodCollector.i(2435);
        onAppOpenAttributionNative(map);
        MethodCollector.o(2435);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        MethodCollector.i(2429);
        onInstallConversionDataLoadedNative(map);
        MethodCollector.o(2429);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m35(String str, String str2) {
        MethodCollector.i(2942);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    onInstallConversionFailureNative(jSONObject);
                    MethodCollector.o(2942);
                    return;
                }
            } else if (str.equals("onAttributionFailure")) {
                onAttributionFailureNative(jSONObject);
            }
            MethodCollector.o(2942);
        } catch (JSONException e2) {
            e2.printStackTrace();
            MethodCollector.o(2942);
        }
    }
}
