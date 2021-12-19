package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {
    static {
        Covode.recordClassIndex(17192);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static List<String> a(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<Pattern> b(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(Pattern.compile(string));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }
}
