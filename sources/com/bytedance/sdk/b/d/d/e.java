package com.bytedance.sdk.b.d.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.d.a.b;
import com.bytedance.sdk.b.d.b.a;
import com.bytedance.sdk.b.d.e.d;
import java.util.TreeMap;
import org.json.JSONObject;

public final class e implements b {
    static {
        Covode.recordClassIndex(26684);
    }

    @Override // com.bytedance.sdk.b.d.a.b
    public final void a(String str, a<com.bytedance.sdk.b.b.b> aVar) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("mccmnc", str);
        String a2 = com.bytedance.sdk.b.f.a.a("/oversea/carrier_flow/query_free_id/");
        if (!TextUtils.isEmpty(a2)) {
            AnonymousClass1 r1 = new b<com.bytedance.sdk.b.b.b>(a2, treeMap, aVar) {
                /* class com.bytedance.sdk.b.d.d.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26685);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.b
                public final /* synthetic */ com.bytedance.sdk.b.b.b a(JSONObject jSONObject) {
                    String optString = jSONObject.optString("data");
                    if (optString == null) {
                        return null;
                    }
                    com.bytedance.sdk.b.c.a.a("get free flow id result:".concat(String.valueOf(optString)));
                    com.bytedance.sdk.b.b.b a2 = com.bytedance.sdk.b.b.b.a(optString);
                    com.bytedance.sdk.b.e.a.a().a(optString);
                    return a2;
                }
            };
            r1.f43598i = false;
            d.a().a(r1);
        }
    }
}
