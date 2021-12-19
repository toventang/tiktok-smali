package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Map<Class<?>, a> f49067a;

    public interface a {
        static {
            Covode.recordClassIndex(30664);
        }

        void a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        Covode.recordClassIndex(30660);
        HashMap hashMap = new HashMap();
        f49067a = hashMap;
        hashMap.put(String.class, new a() {
            /* class com.facebook.share.internal.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(30661);
            }

            @Override // com.facebook.share.internal.b.a
            public final void a(JSONObject jSONObject, String str, Object obj) {
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String[].class, new a() {
            /* class com.facebook.share.internal.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(30662);
            }

            @Override // com.facebook.share.internal.b.a
            public final void a(JSONObject jSONObject, String str, Object obj) {
                JSONArray jSONArray = new JSONArray();
                for (String str2 : (String[]) obj) {
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        hashMap.put(JSONArray.class, new a() {
            /* class com.facebook.share.internal.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(30663);
            }

            @Override // com.facebook.share.internal.b.a
            public final void a(JSONObject jSONObject, String str, Object obj) {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }
}
