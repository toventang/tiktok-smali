package com.bytedance.ies.d.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.a.ag;
import h.a.z;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ak {
    static {
        Covode.recordClassIndex(19839);
    }

    public static final Map<String, String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return ag.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String optString = jSONObject.optString("key");
            l.a((Object) optString, "");
            String optString2 = jSONObject.optString("value");
            l.a((Object) optString2, "");
            linkedHashMap.put(optString, optString2);
        }
        return linkedHashMap;
    }

    public static final List<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            l.a((Object) string, "");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final Map<String, List<String>> b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return ag.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            l.a((Object) next, "");
            linkedHashMap.put(next, a(jSONObject.optJSONArray(next)));
        }
        return linkedHashMap;
    }

    public static final SortedMap<String, String> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TreeMap();
        }
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            treeMap.put(next, jSONObject.getString(next));
        }
        return treeMap;
    }

    public static final SortedMap<String, ai> c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TreeMap();
        }
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            String string = jSONObject2.getString("value");
            String string2 = jSONObject2.getString(StringSet.type);
            l.a((Object) string2, "");
            Locale locale = Locale.ROOT;
            l.a((Object) locale, "");
            if (string2 != null) {
                String lowerCase = string2.toLowerCase(locale);
                l.a((Object) lowerCase, "");
                switch (lowerCase.hashCode()) {
                    case -1249586564:
                        if (!lowerCase.equals("variable")) {
                            break;
                        } else {
                            l.a((Object) next, "");
                            l.a((Object) string, "");
                            treeMap.put(next, new al(string));
                            break;
                        }
                    case -892481938:
                        if (!lowerCase.equals("static")) {
                            break;
                        } else {
                            l.a((Object) next, "");
                            l.a((Object) string, "");
                            treeMap.put(next, new ag(string));
                            break;
                        }
                    case -362445944:
                        if (!lowerCase.equals("pathparam")) {
                            break;
                        } else {
                            l.a((Object) next, "");
                            l.a((Object) string, "");
                            treeMap.put(next, new t(string));
                            break;
                        }
                    case 107944136:
                        if (!lowerCase.equals("query")) {
                            break;
                        } else {
                            l.a((Object) next, "");
                            l.a((Object) string, "");
                            treeMap.put(next, new s(string));
                            break;
                        }
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        return treeMap;
    }

    public static final JSONObject a(Map<String, String> map) {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (T t : map.entrySet()) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        return jSONObject;
    }

    public static final String a(String str, Map<String, String> map) {
        l.c(str, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String builder = buildUpon.toString();
        l.a((Object) builder, "");
        return builder;
    }
}
