package com.bytedance.sdk.xbridge.registry.core_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c.d;
import com.bytedance.sdk.xbridge.registry.core_api.a.b;
import com.bytedance.sdk.xbridge.registry.core_api.a.c;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<String, c> f44077a = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(26942);
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f44079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f44080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.protocol.a f44081d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f44082e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f44083f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f44084g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f44085h;

        static {
            Covode.recordClassIndex(26943);
        }

        @Override // com.bytedance.sdk.xbridge.protocol.c.d
        public final void a(Object obj) {
            l.c(obj, "");
            this.f44079b.a(obj);
        }

        @Override // com.bytedance.sdk.xbridge.registry.core_api.a.b
        public final void a(com.bytedance.sdk.xbridge.registry.core_api.a.a aVar) {
            l.c(aVar, "");
            int i2 = f.f44086a[aVar.ordinal()];
            if (i2 == 1) {
                d dVar = this.f44079b;
                l.c(dVar, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", -1);
                jSONObject.put("data", new JSONObject());
                jSONObject.put("msg", "The URL is not authorized to call this JSBridge method");
                dVar.a(jSONObject);
            } else if (i2 == 2) {
                if (this.f44080c.hasNext()) {
                    this.f44078a.a(this.f44081d, (c) ((Map.Entry) this.f44080c.next()).getValue(), this.f44082e, this.f44083f, this.f44084g, this.f44079b, this.f44080c, this.f44085h);
                    return;
                }
                com.bytedance.sdk.xbridge.registry.core_api.d.a.a(this.f44079b);
            }
        }

        @Override // com.bytedance.sdk.xbridge.registry.core_api.a.b
        public final void a(String str, Object obj) {
            l.c(str, "");
            Iterator<T> it = this.f44081d.f43924f.iterator();
            while (it.hasNext()) {
                it.next().a(str, obj);
            }
        }

        a(e eVar, d dVar, Iterator it, com.bytedance.sdk.xbridge.protocol.a aVar, Object obj, String str, String str2, String str3) {
            this.f44078a = eVar;
            this.f44079b = dVar;
            this.f44080c = it;
            this.f44081d = aVar;
            this.f44082e = obj;
            this.f44083f = str;
            this.f44084g = str2;
            this.f44085h = str3;
        }
    }

    public final void a(com.bytedance.sdk.xbridge.protocol.a aVar, c cVar, Object obj, String str, String str2, d dVar, Iterator<? extends Map.Entry<String, c>> it, String str3) {
        cVar.a(obj, str, str3, str2, new a(this, dVar, it, aVar, obj, str, str2, str3));
    }
}
