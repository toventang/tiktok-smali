package com.bytedance.android.ecommerce.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.android.ecommerce.k.e;
import com.bytedance.android.ecommerce.k.f;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7007a = "GET";

    /* renamed from: b  reason: collision with root package name */
    private final String f7008b = "POST";

    static {
        Covode.recordClassIndex(3358);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.fetch";
    }

    private static void a(Map<String, String> map, String str, b.AbstractC0814b bVar) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    e.a(jSONObject2, entry.getKey(), entry.getValue());
                }
                try {
                    jSONObject.put("header", jSONObject2);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
        e.a(jSONObject, "response", str);
        a.a(jSONObject, bVar);
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, final b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        final Map<String, Object> map;
        final Map<String, Object> map2;
        final String str;
        final Map<String, Object> map3;
        super.a(nVar, bVar, eVar);
        try {
            final String f2 = nVar.f("method");
            final String f3 = nVar.f("url");
            if (nVar.a("headers")) {
                map = nVar.h("headers").b();
            } else {
                map = null;
            }
            if (nVar.a("params")) {
                map2 = nVar.h("params").b();
            } else {
                map2 = null;
            }
            k i2 = nVar.i("body");
            if (i2.a() == o.Map) {
                n g2 = i2.g();
                if (g2 != null) {
                    map3 = g2.b();
                } else {
                    map3 = null;
                }
                str = null;
            } else if (i2.a() == o.String) {
                str = i2.e();
                map3 = null;
            } else {
                map3 = null;
                str = null;
            }
            if (!TextUtils.equals(f2, "GET") && !TextUtils.equals(f2, "POST")) {
                a.a("invalid request_method!", bVar);
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                com.bytedance.common.utility.b.e.a(new Runnable() {
                    /* class com.bytedance.android.ecommerce.b.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(3359);
                    }

                    public final void run() {
                        if (TextUtils.equals(f2, "GET")) {
                            d.this.a(f3, map, map2, bVar);
                        } else if (TextUtils.equals(f2, "POST")) {
                            Map<String, Object> map = map3;
                            if (map != null) {
                                d.this.b(f3, map, map, bVar);
                            } else {
                                d.this.a(f3, map, str, bVar);
                            }
                        }
                    }
                });
            } else if (TextUtils.equals(f2, "GET")) {
                a(f3, map, map2, bVar);
            } else if (TextUtils.equals(f2, "POST")) {
                b(f3, map, map3, bVar);
                if (map3 != null) {
                    b(f3, map, map3, bVar);
                } else {
                    a(f3, map, str, bVar);
                }
            }
        } catch (Throwable th) {
            a.a(th.getMessage(), bVar);
        }
    }

    public final void a(String str, Map<String, Object> map, String str2, b.AbstractC0814b bVar) {
        byte[] bArr;
        try {
            j.a aVar = new j.a();
            aVar.f26947a = true;
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = str2.getBytes();
            }
            a(aVar.f26948b, c.f7063a.d().f7041m.a(str, bArr, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            a.a("post failed:" + th.getMessage(), bVar);
        }
    }

    public final void b(String str, Map<String, Object> map, Map<String, Object> map2, b.AbstractC0814b bVar) {
        try {
            j.a aVar = new j.a();
            aVar.f26947a = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    arrayList.add(new Pair(str2, map2.get(str2).toString()));
                }
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            a(aVar.f26948b, c.f7063a.d().f7041m.a(str, arrayList, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            a.a("post failed:" + th.getMessage(), bVar);
        }
    }

    public final void a(String str, Map<String, Object> map, Map<String, Object> map2, b.AbstractC0814b bVar) {
        try {
            j.a aVar = new j.a();
            aVar.f26947a = true;
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    Object obj = map2.get(str2);
                    if (obj != null) {
                        arrayList.add(new Pair(str2, obj.toString()));
                    }
                }
            }
            if (arrayList.size() > 0) {
                str = f.a(str, arrayList);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3).toString());
                }
            }
            a(aVar.f26948b, c.f7063a.d().f7041m.a(str, hashMap), bVar);
        } catch (Throwable th) {
            th.getMessage();
            a.a("get failed:" + th.getMessage(), bVar);
        }
    }
}
