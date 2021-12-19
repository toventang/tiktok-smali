package com.bytedance.android.ecommerce.j;

import com.bytedance.android.ecommerce.a.f;
import com.bytedance.android.ecommerce.a.l;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f7088a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f7089b;

    /* renamed from: c  reason: collision with root package name */
    public JSONArray f7090c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.bytedance.android.ecommerce.a.a> f7091d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<f> f7092e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, f> f7093f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private j f7094g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, l> f7095h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Map<String, l> f7096i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private Map<String, com.bytedance.android.ecommerce.a.a> f7097j = new HashMap();

    static {
        Covode.recordClassIndex(3404);
    }

    @Override // com.bytedance.android.ecommerce.j.e
    public final f b(String str) {
        return this.f7093f.get(str);
    }

    @Override // com.bytedance.android.ecommerce.j.e
    public final String c(String str) {
        return this.f7094g.a(c.f7063a.d().f7040l, str);
    }

    @Override // com.bytedance.android.ecommerce.j.e
    public final com.bytedance.android.ecommerce.a.a d(String str) {
        return this.f7097j.get(str);
    }

    @Override // com.bytedance.android.ecommerce.j.e
    public final com.bytedance.android.ecommerce.a.a a(String str) {
        for (com.bytedance.android.ecommerce.a.a aVar : this.f7091d) {
            if (Pattern.matches(aVar.f6872c, str)) {
                return aVar;
            }
        }
        return null;
    }

    public a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, j jVar) {
        this.f7088a = jSONArray;
        this.f7089b = jSONArray2;
        this.f7090c = jSONArray3;
        this.f7094g = jVar;
        if (this.f7088a != null) {
            for (int i2 = 0; i2 < this.f7088a.length(); i2++) {
                try {
                    com.bytedance.android.ecommerce.a.a aVar = new com.bytedance.android.ecommerce.a.a((JSONObject) this.f7088a.get(i2));
                    this.f7091d.add(aVar);
                    this.f7097j.put(aVar.f6876g, aVar);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f7089b != null) {
            for (int i3 = 0; i3 < this.f7089b.length(); i3++) {
                try {
                    f fVar = new f((JSONObject) this.f7089b.get(i3));
                    this.f7092e.add(fVar);
                    this.f7093f.put(fVar.f6955a, fVar);
                    for (f fVar2 : fVar.p) {
                        this.f7092e.add(fVar2);
                        this.f7093f.put(fVar2.f6955a, fVar2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (this.f7090c != null) {
            for (int i4 = 0; i4 < this.f7090c.length(); i4++) {
                try {
                    l lVar = new l((JSONObject) this.f7090c.get(i4));
                    this.f7095h.put(lVar.f7000h, lVar);
                    this.f7096i.put(lVar.f6993a, lVar);
                } catch (Throwable unused3) {
                }
            }
        }
    }
}
