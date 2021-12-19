package com.bytedance.sdk.b.d.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.b.a;
import com.bytedance.sdk.b.b.c;
import com.bytedance.sdk.b.d.a.b;
import com.bytedance.sdk.b.d.e.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements com.bytedance.sdk.b.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private b f43571a = new c();

    /* renamed from: b  reason: collision with root package name */
    private b f43572b = new e();

    static {
        Covode.recordClassIndex(26671);
    }

    @Override // com.bytedance.sdk.b.d.a.a
    public final void a(com.bytedance.sdk.b.d.b.a<String> aVar) {
        String a2 = com.bytedance.sdk.b.f.a.a("/oversea/carrier_flow/settings/");
        if (!TextUtils.isEmpty(a2)) {
            d.a().a(new b<String>(a2, aVar) {
                /* class com.bytedance.sdk.b.d.d.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(26674);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.b
                public final /* synthetic */ String a(JSONObject jSONObject) {
                    return jSONObject.toString();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.b.d.a.a
    public final void a(String str, com.bytedance.sdk.b.d.b.a<c> aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("free_flow_id", str);
        String a2 = com.bytedance.sdk.b.f.a.a("/oversea/carrier_flow/query_flow/");
        if (!TextUtils.isEmpty(a2)) {
            d.a().a(new b<c>(a2, hashMap, aVar) {
                /* class com.bytedance.sdk.b.d.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26672);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.b
                public final /* synthetic */ c a(JSONObject jSONObject) {
                    String jSONObject2 = jSONObject.toString();
                    com.bytedance.sdk.b.c.a.a("get mobile data result:".concat(String.valueOf(jSONObject2)));
                    c a2 = c.a(jSONObject2);
                    com.bytedance.sdk.b.e.a a3 = com.bytedance.sdk.b.e.a.a();
                    if (a3.f43606a != null && !TextUtils.isEmpty(jSONObject2)) {
                        a3.f43606a.edit().putString("mobile_status_string", jSONObject2).apply();
                    }
                    return a2;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.b.d.a.a
    public final void a(boolean z, com.bytedance.sdk.b.d.b.a<Boolean> aVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("free_flow_auth", str);
        String a2 = com.bytedance.sdk.b.f.a.a("/oversea/carrier_flow/free_flow_auth/");
        if (!TextUtils.isEmpty(a2)) {
            d.a().a(new d<Boolean>(a2, hashMap, aVar) {
                /* class com.bytedance.sdk.b.d.d.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(26675);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.d
                public final /* synthetic */ Boolean a(JSONObject jSONObject) {
                    return true;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.b.d.a.a
    public final void a(String str, com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.b> aVar, boolean z) {
        if (!z) {
            b bVar = this.f43571a;
            if (bVar != null) {
                bVar.a(str, aVar);
                return;
            }
            return;
        }
        b bVar2 = this.f43572b;
        if (bVar2 != null) {
            bVar2.a(str, aVar);
        }
    }

    @Override // com.bytedance.sdk.b.d.a.a
    public final void a(String str, String str2, Map<String, String> map, com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.a> aVar, String str3) {
        HashMap hashMap = new HashMap();
        if (!hashMap.containsKey("in_use_mccmnc")) {
            hashMap.put("in_use_mccmnc", str);
        }
        hashMap.put("all_mccmncs", str2);
        hashMap.put("free_flow_id", str3);
        String a2 = com.bytedance.sdk.b.f.a.a("/oversea/carrier_flow/data_plans/");
        if (!TextUtils.isEmpty(a2)) {
            d.a().a(new b<com.bytedance.sdk.b.b.a>(a2, hashMap, aVar) {
                /* class com.bytedance.sdk.b.d.d.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(26673);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.b
                public final /* synthetic */ com.bytedance.sdk.b.b.a a(JSONObject jSONObject) {
                    String jSONArray;
                    JSONArray jSONArray2 = jSONObject.getJSONArray("plans");
                    if (jSONArray2 == null || (jSONArray = jSONArray2.toString()) == null) {
                        return null;
                    }
                    com.bytedance.sdk.b.c.a.a("get data plan info result:".concat(String.valueOf(jSONArray)));
                    com.bytedance.sdk.b.b.a aVar = new com.bytedance.sdk.b.b.a();
                    JSONArray jSONArray3 = new JSONArray(jSONArray);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i2);
                        a.C1050a aVar2 = new a.C1050a();
                        aVar2.setPlanId(optJSONObject.optString("plan_id"));
                        aVar2.setTitle(optJSONObject.optString("title"));
                        aVar2.setContent(optJSONObject.optString("content"));
                        aVar2.setIconUrl(optJSONObject.optString("icon"));
                        aVar2.setUrl(optJSONObject.optString("url"));
                        arrayList.add(aVar2);
                    }
                    aVar.f43505a = arrayList;
                    return aVar;
                }
            });
        }
    }
}
