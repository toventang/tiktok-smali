package com.bytedance.sdk.b.d.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.d.a.b;
import com.bytedance.sdk.b.d.b.a;
import com.bytedance.sdk.b.d.d.d;
import java.util.HashMap;
import org.json.JSONObject;

public final class c implements b {
    static {
        Covode.recordClassIndex(26678);
    }

    @Override // com.bytedance.sdk.b.d.a.b
    public final void a(String str, a<com.bytedance.sdk.b.b.b> aVar) {
        final String str2;
        final String str3;
        final String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("apiKey", "D95CZC3v2x8yCXXQAcZDVbdHTNgk8596wnVDdgJmJVfu3Y2FsavdM2scyWqsQ2DMqdARu8GGm9anvvB7");
        hashMap.put("appInBackground", "0");
        hashMap.put("userIsOnline", "0");
        final String b2 = com.bytedance.sdk.b.f.a.b(str);
        if (str.equals("72430") || str.equals("72431")) {
            str2 = "http://api.oston.io/keepon/user?mccmnc=".concat(String.valueOf(str));
            str4 = "api.keepon.media";
            str3 = "/api/user";
        } else {
            str2 = "http://api.keepon.media/api/user?mccmnc=".concat(String.valueOf(str));
            str4 = "api.oston.io";
            str3 = "/keepon/user";
        }
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass1 r1 = new d<com.bytedance.sdk.b.b.b>(str2, hashMap, aVar) {
                /* class com.bytedance.sdk.b.d.d.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26679);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.b.d.d.d
                public final /* synthetic */ com.bytedance.sdk.b.b.b a(JSONObject jSONObject) {
                    String jSONObject2 = jSONObject.toString();
                    if (jSONObject2 == null) {
                        return null;
                    }
                    com.bytedance.sdk.b.c.a.a("get free flow id result:".concat(String.valueOf(jSONObject2)));
                    com.bytedance.sdk.b.b.b a2 = com.bytedance.sdk.b.b.b.a(jSONObject2);
                    com.bytedance.sdk.b.e.a.a().a(jSONObject2);
                    return a2;
                }
            };
            r1.f43598i = false;
            r1.f43588c = new d.a() {
                /* class com.bytedance.sdk.b.d.d.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(26680);
                }

                @Override // com.bytedance.sdk.b.d.d.d.a
                public final void a(int i2, int i3, String str) {
                    com.bytedance.apm.b.a("bdugfs_free_flow_id_rate", com.bytedance.sdk.b.f.a.a(i2, b2, str4, str3, str2, i3), (JSONObject) null, com.bytedance.sdk.b.f.a.c(str));
                }
            };
            com.bytedance.sdk.b.d.e.d.a().a(r1);
        }
    }
}
