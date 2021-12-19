package com.bytedance.router.dynamic;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RouterConfig {
    private Map<String, String> mIncMapping = Collections.emptyMap();
    private Map<String, String> mRewriteMapping = Collections.emptyMap();
    private String mTag = "";

    static {
        Covode.recordClassIndex(26179);
    }

    public Map<String, String> getIncMapping() {
        return this.mIncMapping;
    }

    public Map<String, String> getRewriteMapping() {
        return this.mRewriteMapping;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", this.mTag);
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, String> entry : this.mIncMapping.entrySet()) {
                jSONArray.put(entry.getKey() + "," + entry.getValue());
            }
            jSONObject.put("incMapping", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry<String, String> entry2 : this.mRewriteMapping.entrySet()) {
                jSONArray2.put(entry2.getKey() + "," + entry2.getValue());
            }
            jSONObject.put("rewriteMapping", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static RouterConfig load(String str) {
        return parse(str);
    }

    public RouterConfig(String str) {
        this.mTag = str;
    }

    public void setIncMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mIncMapping = Collections.emptyMap();
        } else {
            this.mIncMapping = map;
        }
    }

    public void setRewriteMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mRewriteMapping = Collections.emptyMap();
        } else {
            this.mRewriteMapping = map;
        }
    }

    private static RouterConfig parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            RouterConfig routerConfig = new RouterConfig(jSONObject.optString("tag"));
            routerConfig.setIncMapping(parseJsonArray(jSONObject.optJSONArray("incMapping")));
            routerConfig.setRewriteMapping(parseJsonArray(jSONObject.optJSONArray("rewriteMapping")));
            return routerConfig;
        } catch (JSONException e2) {
            e2.printStackTrace();
            Logger.e("DynamicMapping#load failed: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static Map<String, String> parseJsonArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split(",");
                if (split.length != 2) {
                    Logger.e("DynamicMapping#parseJsonArray illegal schema mapping: ".concat(String.valueOf(optString)));
                } else if (split[0] == null || split[1] == null) {
                    Logger.e("DynamicMapping#parseJsonArray illegal schema mapping(null): ".concat(String.valueOf(optString)));
                } else {
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    if (TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
                        Logger.e("DynamicMapping#parseJsonArray illegal schema mapping empty: ".concat(String.valueOf(optString)));
                    } else {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean isExpired(Context context, RouterConfig routerConfig) {
        if (context == null || routerConfig == null) {
            return true;
        }
        String str = "";
        try {
            str = str + context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
            Bundle bundle = com_bytedance_router_dynamic_RouterConfig_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                str = str + "_" + String.valueOf(bundle.getInt("UPDATE_VERSION_CODE"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && str.equals(routerConfig.mTag)) {
            return false;
        }
        return true;
    }

    public static ApplicationInfo com_bytedance_router_dynamic_RouterConfig_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return b.f107191a;
    }
}
