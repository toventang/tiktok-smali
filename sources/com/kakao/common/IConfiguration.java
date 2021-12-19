package com.kakao.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.SystemInfo;
import com.kakao.util.helper.Utility;
import org.json.JSONException;
import org.json.JSONObject;

public interface IConfiguration {
    static {
        Covode.recordClassIndex(34345);
    }

    String getAppVer();

    JSONObject getExtrasJson();

    String getKAHeader();

    String getKeyHash();

    String getPackageName();

    public static class Factory {
        static {
            Covode.recordClassIndex(34346);
        }

        static IConfiguration createConfiguration(Context context) {
            SystemInfo.initialize(context);
            String keyHash = Utility.getKeyHash(context);
            String kAHeader = SystemInfo.getKAHeader();
            String valueOf = String.valueOf(Utility.getAppVersion(context));
            String packageName = context.getPackageName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appPkg", context.getPackageName());
                jSONObject.put("KA", kAHeader);
                jSONObject.put("keyHash", keyHash);
                return new RequestConfiguration(keyHash, kAHeader, valueOf, packageName, jSONObject);
            } catch (JSONException e2) {
                throw new IllegalArgumentException("JSON parsing error. Malformed parameters were provided. Detailed error message: " + e2.toString());
            }
        }
    }
}
