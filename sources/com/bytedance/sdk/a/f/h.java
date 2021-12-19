package com.bytedance.sdk.a.f;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.a.c.c;
import com.bytedance.sdk.a.a.c.d;
import com.bytedance.sdk.a.o.i;
import com.ss.android.account.f;
import com.ss.android.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class h<R extends b> implements com.bytedance.sdk.a.a.c.a, c {

    /* renamed from: h  reason: collision with root package name */
    private static com.bytedance.sdk.a.a.c.b f43204h = new com.bytedance.sdk.a.a.c.b() {
        /* class com.bytedance.sdk.a.f.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(26496);
        }

        @Override // com.bytedance.sdk.a.a.c.b
        public final d a(c cVar) {
            a aVar = new a(cVar, (byte) 0);
            aVar.b();
            return aVar;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static j f43205i = new j() {
        /* class com.bytedance.sdk.a.f.h.AnonymousClass3 */

        static {
            Covode.recordClassIndex(26497);
        }

        @Override // com.bytedance.sdk.a.f.j
        public final void a(k kVar) {
            WeakHandler weakHandler = ((e) e.a(f.a().b())).v;
            Message obtain = Message.obtain(weakHandler, 100);
            obtain.obj = kVar;
            weakHandler.sendMessage(obtain);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    protected Context f43206a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.a.d.a f43207b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.sdk.a.d.b f43208c;

    /* renamed from: d  reason: collision with root package name */
    protected com.bytedance.sdk.a.a.a.a f43209d;

    /* renamed from: e  reason: collision with root package name */
    private String f43210e;

    /* renamed from: f  reason: collision with root package name */
    private d f43211f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43212g;

    /* access modifiers changed from: protected */
    public abstract R a(boolean z, com.bytedance.sdk.a.d.b bVar);

    public abstract void a(R r);

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject, JSONObject jSONObject2);

    /* access modifiers changed from: protected */
    public abstract void b(JSONObject jSONObject, JSONObject jSONObject2);

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!"success".equals(str)) {
            a(str, jSONObject, jSONObject2);
            return false;
        } else if (jSONObject2 == null) {
            return true;
        } else {
            b(jSONObject, jSONObject2);
            return true;
        }
    }

    static class a extends com.bytedance.sdk.a.o.a implements d {

        /* renamed from: g  reason: collision with root package name */
        private c f43215g;

        static {
            Covode.recordClassIndex(26498);
        }

        @Override // com.bytedance.sdk.a.j.a.c
        public final void run() {
            this.f43215g.b();
        }

        private a(c cVar) {
            this.f43215g = cVar;
        }

        /* synthetic */ a(c cVar, byte b2) {
            this(cVar);
        }
    }

    @Override // com.bytedance.sdk.a.a.c.a
    public final void a() {
        this.f43209d = null;
    }

    @Override // com.bytedance.sdk.a.a.c.d
    public final void c() {
        this.f43209d = null;
        d dVar = this.f43211f;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final void d() {
        this.f43211f = f43204h.a(this);
    }

    static {
        Covode.recordClassIndex(26494);
    }

    @Override // com.bytedance.sdk.a.a.c.c
    public final void b() {
        final R e2 = e();
        if (e2 != null) {
            com.bytedance.sdk.a.d.b bVar = this.f43208c;
            if (bVar != null) {
                e2.f43072c = bVar.f43160d;
                e2.f43070a = this.f43208c.f43162f;
            }
            if (TextUtils.isEmpty(e2.f43072c)) {
                e2.f43072c = this.f43210e;
            }
            a(e2);
            com.ss.android.account.a.b bVar2 = com.ss.android.account.d.a().f58191a;
            if ((this.f43208c.f43158b == 1104 || this.f43208c.f43158b == 1105) && bVar2 != null && !bVar2.a()) {
                new Object() {
                    /* class com.bytedance.sdk.a.f.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26495);
                    }
                };
                return;
            }
            f43205i.a(new k(this.f43209d, e2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        if (r8 == -14) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        if (com.bytedance.sdk.a.o.e.a(r10) == false) goto L_0x01c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private R e() {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.a.f.h.e():com.bytedance.sdk.a.a.a.b");
    }

    public static String a(String str) {
        String b2 = i.b(str, "passport_csrf_token");
        if (TextUtils.isEmpty(b2)) {
            return i.b(str, "passport_csrf_token_default");
        }
        return b2;
    }

    private static JSONObject a(JSONObject jSONObject) {
        Exception e2;
        JSONObject jSONObject2 = null;
        if (jSONObject == null || !jSONObject.has("data")) {
            return null;
        }
        try {
            Object opt = jSONObject.opt("data");
            if (opt == null) {
                return null;
            }
            if (opt instanceof JSONObject) {
                return (JSONObject) opt;
            }
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("data", jSONArray);
                    jSONObject2 = jSONObject3;
                } catch (Exception e3) {
                    e2 = e3;
                    jSONObject2 = jSONObject3;
                }
            }
            return jSONObject2;
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            return jSONObject2;
        }
    }

    private void a(com.ss.android.h hVar) {
        Context context;
        if (hVar != null) {
            try {
                List<g> list = hVar.f59523c;
                if (list != null) {
                    for (g gVar : list) {
                        if ("x-tt-multi-sids".equalsIgnoreCase(gVar.f59519a)) {
                            String str = gVar.f59520b;
                            if (!TextUtils.isEmpty(str) && (context = this.f43206a) != null) {
                                e.a(context).b(str);
                            }
                        }
                        if ("x-tt-logid".equalsIgnoreCase(gVar.f59519a)) {
                            String str2 = gVar.f59520b;
                            if (!TextUtils.isEmpty(str2)) {
                                this.f43208c.f43162f = str2;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void a(List<g> list) {
        String str = null;
        try {
            Context context = this.f43206a;
            if (context != null) {
                str = e.a(context).f();
            }
            if (!TextUtils.isEmpty(str)) {
                list.add(new g("x-tt-multi-sids", str));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private com.ss.android.h a(String str, Map<String, String> map) {
        com.bytedance.sdk.a.o.h hVar = new com.bytedance.sdk.a.o.h(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hVar.a(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        if (f.a().d()) {
            hVar.a("multi_login", "1");
            a(arrayList);
        }
        a(str, arrayList);
        hVar.a("account_sdk_source", "app");
        hVar.a("passport-sdk-version");
        String hVar2 = hVar.toString();
        this.f43208c.f43160d = hVar2;
        com.bytedance.sdk.a.d c2 = f.a().c();
        if (c2 != null) {
            return c2.a(hVar2, arrayList);
        }
        return null;
    }

    private static void a(String str, List<g> list) {
        try {
            String a2 = a(str);
            if (!TextUtils.isEmpty(a2)) {
                list.add(new g("x-tt-passport-csrf-token", a2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public h(Context context, com.bytedance.sdk.a.d.a aVar, com.bytedance.sdk.a.a.a.a aVar2) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f43206a = applicationContext;
        this.f43210e = aVar.f43146a;
        this.f43207b = aVar;
        this.f43209d = aVar2;
        if (aVar2 != null) {
            aVar2.f43180b = this;
        }
        this.f43208c = new com.bytedance.sdk.a.d.b(aVar);
    }

    private void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
            if (jSONObject2.has("error_code")) {
                com.bytedance.sdk.a.d.b bVar = this.f43208c;
                bVar.f43158b = jSONObject2.optInt("error_code", bVar.f43158b);
            } else if (jSONObject2.has("code")) {
                com.bytedance.sdk.a.d.b bVar2 = this.f43208c;
                bVar2.f43158b = jSONObject2.optInt("code", bVar2.f43158b);
            }
            this.f43208c.f43159c = jSONObject2.optString("description");
            com.bytedance.sdk.a.d.b bVar3 = this.f43208c;
            bVar3.f43161e = bVar3.f43159c;
            a(jSONObject2, jSONObject);
        }
    }
}
