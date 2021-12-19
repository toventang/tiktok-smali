package com.bytedance.android.ecommerce.j;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.j.j;
import com.bytedance.android.ecommerce.k.a;
import com.bytedance.android.ecommerce.k.e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f7118a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public String f7119b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7120c = "StarlingService";

    static {
        Covode.recordClassIndex(3422);
    }

    @Override // com.bytedance.android.ecommerce.j.j
    public final String a(String str) {
        if (!this.f7118a.isEmpty()) {
            return this.f7118a.get(str);
        }
        throw new RuntimeException("mStarlingMap is empty");
    }

    @Override // com.bytedance.android.ecommerce.j.j
    public final String a(String str, String str2) {
        try {
            if (TextUtils.equals(str, this.f7119b)) {
                return this.f7118a.get(str2);
            }
            Map<String, String> a2 = e.a(new JSONObject(a.a(c.f7063a.d().f7029a, "pipo_starling.json")));
            c(str, null, null);
            return a2.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.android.ecommerce.j.j
    public final void a(String str, final j.a aVar) {
        if (!TextUtils.equals(this.f7119b, str) && !TextUtils.isEmpty(str)) {
            this.f7119b = str;
            this.f7118a.clear();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.bytedance.common.utility.b.e.a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.j.o.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(3423);
                    }

                    public final void run() {
                        o oVar = o.this;
                        oVar.b(oVar.f7119b, aVar, null);
                    }
                });
            } else {
                b(this.f7119b, aVar, null);
            }
        }
    }

    @Override // com.bytedance.android.ecommerce.j.j
    public final void a(String str, j.a aVar, String str2) {
        c(str2, aVar, str);
    }

    private void c(String str, final j.a aVar, final String str2) {
        if (!TextUtils.equals(this.f7119b, str)) {
            this.f7119b = str;
            final AnonymousClass2 r2 = new j.a() {
                /* class com.bytedance.android.ecommerce.j.o.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3424);
                }

                @Override // com.bytedance.android.ecommerce.j.j.a
                public final void a(Map<String, String> map) {
                    o.this.f7118a = map;
                    j.a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(map);
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.bytedance.common.utility.b.e.a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.j.o.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(3425);
                    }

                    public final void run() {
                        o oVar = o.this;
                        oVar.b(oVar.f7119b, r2, str2);
                    }
                });
            } else {
                b(this.f7119b, r2, str2);
            }
        } else if (aVar != null) {
            aVar.a(this.f7118a);
        }
    }

    public final void b(String str, j.a aVar, String str2) {
        String str3;
        JSONObject optJSONObject;
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(e.a(new JSONObject(a.a(c.f7063a.d().f7029a, "pipo_starling.json"))));
        } catch (Throwable unused) {
        }
        i g2 = c.f7063a.g();
        String a2 = g2.a(str);
        if (!TextUtils.isEmpty(a2)) {
            try {
                hashMap.putAll(e.a(new JSONObject(a2)));
            } catch (Throwable unused2) {
            }
        }
        long b2 = g2.b(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = com.bytedance.android.ecommerce.d.a.a("/payment/v1/cashier_starling");
        } else {
            str3 = str2 + "/payment/v1/cashier_starling";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", b2);
            jSONObject.put("language", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("Content-Type", "application/json");
            JSONObject jSONObject2 = new JSONObject(c.f7063a.d().f7041m.a(str3, jSONObject.toString().getBytes(), hashMap2));
            if (TextUtils.equals(jSONObject2.optString("result_code"), "success") && (optJSONObject = jSONObject2.optJSONObject("text_package")) != null) {
                Map<String, String> a3 = e.a(optJSONObject);
                if (a3.size() > 0) {
                    hashMap.putAll(a3);
                    this.f7118a.putAll(hashMap);
                    i g3 = c.f7063a.g();
                    g3.a(str, Long.valueOf(jSONObject2.optLong("version")));
                    g3.a(str, optJSONObject.toString());
                    if (aVar != null) {
                        aVar.a(this.f7118a);
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            th.getLocalizedMessage();
        }
        this.f7118a.putAll(hashMap);
        if (aVar != null) {
            aVar.a(this.f7118a);
        }
    }
}
