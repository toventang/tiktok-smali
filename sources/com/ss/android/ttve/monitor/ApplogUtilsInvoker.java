package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class ApplogUtilsInvoker {
    static {
        Covode.recordClassIndex(37672);
    }

    public static native void nativeInit();

    public static void onNativeCallback_onAppLogJson(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        b.a(str, jSONObject, str3);
    }

    public static void onNativeCallback_onAppLogClientJson(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        b.a(str, jSONObject, str3, z, true);
    }
}
