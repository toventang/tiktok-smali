package com.bytedance.sdk.b.d.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.d.b.b;
import com.bytedance.sdk.b.d.e.c;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public abstract class d<T> extends c<String> {

    /* renamed from: a  reason: collision with root package name */
    private final b<String> f43586a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.sdk.b.d.b.a<T> f43587b;

    /* renamed from: c  reason: collision with root package name */
    public a f43588c = null;

    interface a {
        static {
            Covode.recordClassIndex(26683);
        }

        void a(int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(26681);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(JSONObject jSONObject);

    @Override // com.bytedance.sdk.b.d.e.a
    public final /* synthetic */ Object a(String str) {
        com.bytedance.sdk.b.c.a.a("response raw result: ".concat(String.valueOf(str)));
        return str;
    }

    public d(String str, Map<String, String> map, com.bytedance.sdk.b.d.b.a<T> aVar) {
        super(str, map);
        AnonymousClass1 r1 = new b<String>() {
            /* class com.bytedance.sdk.b.d.d.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26682);
            }

            @Override // com.bytedance.sdk.b.d.b.b
            public final void a(Exception exc) {
                if (d.this.f43587b != null) {
                    d.this.f43587b.a(exc);
                }
                if (d.this.f43588c != null) {
                    d.this.f43588c.a(0, -2, exc.toString());
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.sdk.b.d.b.a<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.b.d.b.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                if (d.this.f43587b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int optInt = jSONObject.optInt("status_code");
                        if (optInt == 0) {
                            d.this.f43587b.a(d.this.a(jSONObject));
                            if (d.this.f43588c != null) {
                                d.this.f43588c.a(1, optInt, "");
                                return;
                            }
                            return;
                        }
                        String optString = jSONObject.optString("msg");
                        d.this.f43587b.a(optInt, optString);
                        if (d.this.f43588c != null) {
                            d.this.f43588c.a(0, optInt, optString);
                        }
                    } catch (Exception e2) {
                        d.this.f43587b.a(e2);
                        if (d.this.f43588c != null) {
                            d.this.f43588c.a(0, -1, e2.toString());
                        }
                    }
                }
            }
        };
        this.f43586a = r1;
        this.f43587b = aVar;
        a((b) r1);
    }
}
