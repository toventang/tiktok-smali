package com.ss.android.common.applog.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected HashSet<String> f59190a;

    /* renamed from: b  reason: collision with root package name */
    protected HashMap<String, HashSet<String>> f59191b;

    static {
        Covode.recordClassIndex(36596);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str);

    /* access modifiers changed from: protected */
    public abstract boolean a(HashSet<String> hashSet, String str);

    public static final a a(Context context) {
        Map<String, ?> map;
        a aVar;
        Set set;
        Set set2;
        try {
            SharedPreferences a2 = d.a(context, "sp_filter_name", 0);
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            try {
                map = a2.getAll();
            } catch (Throwable unused) {
                map = null;
            }
            if (map == null || map.size() <= 0) {
                return null;
            }
            int i2 = 0;
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    if ("is_block".equals(key)) {
                        i2 = a2.getInt("is_block", 0);
                    } else if ("events".equals(key)) {
                        try {
                            set2 = (Set) entry.getValue();
                        } catch (Throwable unused2) {
                            set2 = null;
                        }
                        if (set2 != null && set2.size() > 0) {
                            hashSet.addAll(set2);
                        }
                    } else if (!TextUtils.isEmpty(key)) {
                        HashSet hashSet2 = new HashSet();
                        try {
                            set = (Set) entry.getValue();
                        } catch (Throwable unused3) {
                            set = null;
                        }
                        if (set != null && set.size() > 0) {
                            hashSet2.addAll(set);
                        }
                        if (hashSet2.size() > 0) {
                            hashMap.put(key, hashSet2);
                        }
                    }
                }
            }
            if (i2 > 0) {
                aVar = new b(hashSet, hashMap);
            } else {
                aVar = new d(hashSet, hashMap);
            }
            return aVar;
        } catch (Throwable unused4) {
            return null;
        }
    }

    protected a(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        this.f59190a = hashSet;
        this.f59191b = hashMap;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        HashMap<String, HashSet<String>> hashMap;
        HashSet<String> hashSet;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet<String> hashSet2 = this.f59190a;
        if (hashSet2 != null && hashSet2.size() > 0) {
            if (a(str)) {
                return false;
            }
            if (jSONObject != null && (hashMap = this.f59191b) != null && hashMap.size() > 0 && this.f59191b.containsKey(str) && (hashSet = this.f59191b.get(str)) != null && hashSet.size() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    if (a(hashSet, keys.next())) {
                        try {
                            keys.remove();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final a a(Context context, JSONObject jSONObject) {
        a aVar;
        try {
            SharedPreferences.Editor edit = d.a(context, "sp_filter_name", 0).edit();
            edit.clear().commit();
            if (jSONObject == null) {
                return null;
            }
            if (!jSONObject.has("event_list")) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("event_list");
            if (optJSONObject == null) {
                return null;
            }
            int optInt = optJSONObject.optInt("is_block", 0);
            edit.putInt("is_block", optInt);
            HashSet hashSet = new HashSet();
            JSONArray optJSONArray = optJSONObject.optJSONArray("events");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
            if (hashSet.size() > 0) {
                edit.putStringSet("events", hashSet);
            }
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        HashSet hashSet2 = new HashSet();
                        JSONArray optJSONArray2 = optJSONObject2.optJSONArray(next);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                String optString2 = optJSONArray2.optString(i3);
                                if (!TextUtils.isEmpty(optString2)) {
                                    hashSet2.add(optString2);
                                }
                            }
                        }
                        if (hashSet2.size() > 0) {
                            hashMap.put(next, hashSet2);
                        }
                    }
                }
            }
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    edit.putStringSet((String) entry.getKey(), (Set) entry.getValue());
                }
            }
            edit.commit();
            if (optInt > 0) {
                aVar = new b(hashSet, hashMap);
            } else {
                aVar = new d(hashSet, hashMap);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
