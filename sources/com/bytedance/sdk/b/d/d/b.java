package com.bytedance.sdk.b.d.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.d.b.a;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public abstract class b<T> extends com.bytedance.sdk.b.d.e.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.sdk.b.d.b.b<String> f43577a;

    /* renamed from: b  reason: collision with root package name */
    public final a<T> f43578b;

    static {
        Covode.recordClassIndex(26676);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(JSONObject jSONObject);

    @Override // com.bytedance.sdk.b.d.e.a
    public final /* synthetic */ Object a(String str) {
        com.bytedance.sdk.b.c.a.a("response raw result: ".concat(String.valueOf(str)));
        return str;
    }

    public b(String str, Map<String, String> map, a<T> aVar) {
        super(str, map);
        AnonymousClass1 r0 = new com.bytedance.sdk.b.d.b.b<String>() {
            /* class com.bytedance.sdk.b.d.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26677);
            }

            @Override // com.bytedance.sdk.b.d.b.b
            public final void a(Exception exc) {
                if (b.this.f43578b != null) {
                    b.this.f43578b.a(exc);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.bytedance.sdk.b.d.b.a<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.b.d.b.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                if (b.this.f43578b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int optInt = jSONObject.optInt("status_code", -1);
                        if (optInt == 0) {
                            b.this.f43578b.a(b.this.a(jSONObject));
                            return;
                        }
                        b.this.f43578b.a(optInt, jSONObject.optString("msg"));
                    } catch (Exception e2) {
                        b.this.f43578b.a(e2);
                    }
                }
            }
        };
        this.f43577a = r0;
        this.f43578b = aVar;
        a((com.bytedance.sdk.b.d.b.b) r0);
    }
}
