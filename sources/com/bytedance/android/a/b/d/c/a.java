package com.bytedance.android.a.b.d.c;

import android.text.TextUtils;
import com.bytedance.android.a.a.e;
import com.bytedance.android.a.b.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.a.a.b.a f6729a = new com.bytedance.android.a.a.b.b(e.d().f6644b, "ad_tracker_c2s_store_v2_adym3");

    static {
        Covode.recordClassIndex(3240);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void a(int i2) {
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void a() {
        this.f6729a.b().c();
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void d() {
        this.f6729a.c();
        this.f6729a = null;
    }

    public a() {
        com.bytedance.android.a.a.b.a aVar = e.d().f6648f;
        if (aVar != null && aVar.c("sp_c2s_store_version") < 2) {
            aVar.b("sp_c2s_store_version").c();
        }
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<com.bytedance.android.a.a.d.b> b() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Map<String, ?> a2 = this.f6729a.a();
        for (String str : a2.keySet()) {
            Object obj = a2.get(str);
            if (obj instanceof String) {
                com.bytedance.android.a.a.d.b a3 = a((String) obj);
                if (a3 != null) {
                    arrayList.add(a3);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                this.f6729a.d(str2);
            }
            this.f6729a.c();
        }
        return arrayList;
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<com.bytedance.android.a.a.d.b> c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Map<String, ?> a2 = this.f6729a.a();
        for (String str : a2.keySet()) {
            Object obj = a2.get(str);
            if (obj instanceof String) {
                com.bytedance.android.a.a.d.b a3 = a((String) obj);
                if (a3 == null) {
                    arrayList2.add(str);
                } else if (a3.f6628j > 0) {
                    arrayList.add(a3);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                this.f6729a.d(str2);
            }
            this.f6729a.c();
        }
        return arrayList;
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void c(com.bytedance.android.a.a.d.b bVar) {
        a(bVar);
    }

    @Override // com.bytedance.android.a.b.d.b
    public final void b(com.bytedance.android.a.a.d.b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.f6619a)) {
            String str = bVar.f6619a;
            if (!TextUtils.isEmpty(str)) {
                this.f6729a.d(str).c();
            }
        }
    }

    @Override // com.bytedance.android.a.b.d.b
    public final List<com.bytedance.android.a.a.d.b> a(List<com.bytedance.android.a.a.d.b> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.android.a.a.d.b bVar : list) {
            if (!a(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.a.b.d.b
    public final boolean a(com.bytedance.android.a.a.d.b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f6619a)) {
            return false;
        }
        String d2 = d(bVar);
        if (TextUtils.isEmpty(d2)) {
            return false;
        }
        this.f6729a.a(bVar.f6619a, d2).c();
        return true;
    }

    private static String d(com.bytedance.android.a.a.d.b bVar) {
        if (bVar == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", bVar.f6619a).put("tracker_key", bVar.f6620b).put("ad_id", bVar.f6621c).put("is_standard", bVar.f6622d).put("non_std_ad_id", bVar.f6623e);
            JSONArray jSONArray = new JSONArray();
            List<String> list = bVar.f6624f;
            if (list != null) {
                for (String str : list) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", bVar.f6625g).put("ad_extra_data", bVar.f6626h).put("create_timestamp", bVar.f6627i).put("track_label", bVar.f6629k).put("tried_count", bVar.f6628j).put("retry_when_network_available", bVar.f6631m).put("expire_seconds", bVar.n);
            Map<String, String> map = bVar.f6630l;
            if (!(map == null || map.size() == 0)) {
                jSONObject.putOpt("context_macro_map", new JSONObject(map));
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static com.bytedance.android.a.a.d.b a(String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("tracker_key");
            long optLong = jSONObject.optLong("ad_id");
            boolean optBoolean = jSONObject.optBoolean("is_standard");
            long optLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.getString(i2));
                }
            }
            String optString3 = jSONObject.optString("log_extra");
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            try {
                long optLong3 = jSONObject.optLong("create_timestamp");
                String optString4 = jSONObject.optString("track_label");
                if (TextUtils.isEmpty(optString4) && jSONObject.has("track_type")) {
                    switch (jSONObject.optInt("track_type")) {
                        case 0:
                            optString4 = "show";
                            break;
                        case 1:
                            optString4 = "play";
                            break;
                        case 2:
                            optString4 = "click";
                            break;
                        case 3:
                        default:
                            com.bytedance.android.a.a.h.a.a("unknown c2s track type");
                            optString4 = "";
                            break;
                        case 4:
                            optString4 = "play_valid";
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            optString4 = "play_over";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            optString4 = "play_25";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            optString4 = "play_50";
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            optString4 = "play_75";
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            optString4 = "cpv_6s";
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            optString4 = "cpv_15s";
                            break;
                    }
                }
                int optInt = jSONObject.optInt("tried_count", 0);
                boolean optBoolean2 = jSONObject.optBoolean("retry_when_network_available");
                long optLong4 = jSONObject.optLong("expire_seconds", -1);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("context_macro_map");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    hashMap = null;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString5 = optJSONObject2.optString(next);
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(next, optString5);
                    }
                } else {
                    hashMap = null;
                }
                com.bytedance.android.a.a.d.b bVar = new com.bytedance.android.a.a.d.b(optString, optString2, optLong, arrayList, optString4, optBoolean, optLong2, optString3, optJSONObject, optInt, hashMap);
                bVar.f6627i = optLong3;
                bVar.f6631m = optBoolean2;
                bVar.n = optLong4;
                return bVar;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
