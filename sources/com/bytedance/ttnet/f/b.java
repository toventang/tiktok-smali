package com.bytedance.ttnet.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a;
import com.bytedance.frameworks.baselib.network.http.d.a.a.e;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.ttnet.f.c;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f44617a;

    /* renamed from: b  reason: collision with root package name */
    public a f44618b;

    /* renamed from: c  reason: collision with root package name */
    public String f44619c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f44620d;

    /* renamed from: e  reason: collision with root package name */
    private String f44621e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f44622f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f44623g = "";

    static {
        Covode.recordClassIndex(27286);
    }

    public static String a() {
        if (TextUtils.isEmpty(c.f44624a)) {
            return null;
        }
        try {
            return new JSONObject(c.f44624a).getString("data");
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(long j2) {
        String str;
        if (this.f44620d) {
            SharedPreferences a2 = d.a(this.f44617a, "ttnet_tnc_config", 0);
            String string = a2.getString("tnc_config_str", null);
            String string2 = a2.getString("ttnet_tnc_etag", null);
            String string3 = a2.getString("ttnet_tnc_abtest", null);
            if (TextUtils.isEmpty(string)) {
                string = a();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                k.a().a(jSONObject, c.a.TTCACHE.mValue, string2, string3, j2);
                e.a().a(jSONObject);
                a.a(jSONObject);
                a a3 = a(jSONObject);
                if (a3 != null) {
                    this.f44618b = a3;
                }
                if (Logger.debug()) {
                    StringBuilder sb = new StringBuilder("loadLocalConfig: ");
                    if (a3 == null) {
                        str = "null";
                    } else {
                        str = a3.toString();
                    }
                    Logger.d("TNCConfigHandler", sb.append(str).toString());
                }
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }

    public static a a(JSONObject jSONObject) {
        boolean z;
        try {
            k.a().f29208e.clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            a aVar = new a();
            if (optJSONObject == null) {
                return aVar;
            }
            boolean z2 = true;
            if (optJSONObject.has("local_enable")) {
                if (optJSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f44605a = z;
            }
            if (optJSONObject.has("probe_enable")) {
                if (optJSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f44606b = z2;
            }
            if (optJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = optJSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        String string = jSONArray.getString(i2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                aVar.f44607c = hashMap;
            } else {
                aVar.f44607c = null;
            }
            if (optJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = optJSONObject.getJSONObject("host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            k.a().f29208e.put(next, string2);
                        }
                    }
                }
            }
            aVar.f44608d = optJSONObject.optInt("req_to_cnt", aVar.f44608d);
            aVar.f44609e = optJSONObject.optInt("req_to_api_cnt", aVar.f44609e);
            aVar.f44610f = optJSONObject.optInt("req_to_ip_cnt", aVar.f44610f);
            aVar.f44611g = optJSONObject.optInt("req_err_cnt", aVar.f44611g);
            aVar.f44612h = optJSONObject.optInt("req_err_api_cnt", aVar.f44612h);
            aVar.f44613i = optJSONObject.optInt("req_err_ip_cnt", aVar.f44613i);
            aVar.f44614j = optJSONObject.optInt("update_interval", aVar.f44614j);
            aVar.f44615k = optJSONObject.optInt("update_random_range", aVar.f44615k);
            aVar.f44616l = optJSONObject.optString("http_code_black", aVar.f44616l);
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public b(Context context, boolean z) {
        this.f44617a = context;
        this.f44620d = z;
        this.f44618b = new a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:56|57|58|(1:60)|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        if (android.text.TextUtils.isEmpty(r21.f44619c) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r21.f44618b = new com.bytedance.ttnet.f.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cf, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d0, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        r1 = com.ss.android.ugc.aweme.bf.d.a(r21.f44617a, "ttnet_tnc_config", 0).edit();
        r1.putString("tnc_config_str", "").apply();
        com.bytedance.ttnet.utils.b.a(r21.f44617a, 4, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01eb, code lost:
        if (android.text.TextUtils.isEmpty(r24) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ed, code lost:
        r1.putString("ttnet_tnc_etag", r24).apply();
        com.bytedance.ttnet.utils.b.a(r21.f44617a, 5, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ff, code lost:
        if (android.text.TextUtils.isEmpty(r21.f44619c) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        r21.f44619c = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        r1.putString("ttnet_tnc_abtest", r21.f44619c).apply();
        com.bytedance.ttnet.utils.b.a(r21.f44617a, 6, r21.f44619c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0213, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0186 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(org.json.JSONObject r22, com.bytedance.ttnet.f.c.a r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.f.b.a(org.json.JSONObject, com.bytedance.ttnet.f.c$a, java.lang.String, java.lang.String, long):boolean");
    }
}
