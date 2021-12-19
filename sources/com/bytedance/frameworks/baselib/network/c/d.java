package com.bytedance.frameworks.baselib.network.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class d extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f28909c = d.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private List<String> f28910d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<String> f28911e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f28912f = false;

    static {
        Covode.recordClassIndex(16973);
    }

    public d(int i2) {
        super(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.c.b
    public final void a(JSONObject jSONObject) {
        b(jSONObject);
        a(jSONObject.optJSONArray("keep_list"), this.f28910d);
        a(jSONObject.optJSONArray("remove_list"), this.f28911e);
        if (!this.f28910d.isEmpty() && !this.f28911e.isEmpty()) {
            this.f28912f = true;
        }
    }

    private static void a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == null)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        list.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.c.b
    public final boolean a(Request request, Map<String, List<String>> map) {
        if (this.f28912f || !a(request)) {
            return false;
        }
        if (!this.f28910d.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f28910d) {
                if (map.containsKey(str)) {
                    linkedHashMap.put(str, map.get(str));
                }
            }
            map.clear();
            map.putAll(linkedHashMap);
            return true;
        } else if (this.f28911e.isEmpty()) {
            return true;
        } else {
            for (String str2 : this.f28911e) {
                map.remove(str2);
            }
            return true;
        }
    }
}
