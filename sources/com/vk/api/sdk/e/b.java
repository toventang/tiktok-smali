package com.vk.api.sdk.e;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.b.c;
import com.vk.api.sdk.b.g;
import com.vk.api.sdk.b.h;
import com.vk.api.sdk.d;
import com.vk.api.sdk.d.d;
import com.vk.api.sdk.e;
import com.vk.api.sdk.i;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public class b<T> extends com.vk.api.sdk.internal.a<T> implements e<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f156302c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<String, String> f156303a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f156304b;

    static {
        Covode.recordClassIndex(103802);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103803);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: org.json.JSONObject */
    /* JADX WARN: Multi-variable type inference failed */
    public T a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        return jSONObject;
    }

    public b(String str) {
        l.c(str, "");
        this.f156304b = str;
    }

    @Override // com.vk.api.sdk.e
    public final T a(String str) {
        l.c(str, "");
        try {
            return a(new JSONObject(str));
        } catch (Throwable th) {
            throw new com.vk.api.sdk.c.b(-2, this.f156304b, true, "[" + this.f156304b + "] " + th.getLocalizedMessage(), null, null, null, 112, null);
        }
    }

    @Override // com.vk.api.sdk.internal.a
    public final T b(d dVar) {
        l.c(dVar, "");
        com.vk.api.sdk.b bVar = dVar.f156269c;
        this.f156303a.put("lang", bVar.p);
        this.f156303a.put("device_id", bVar.f156231d.getValue());
        this.f156303a.put("v", bVar.f156232e);
        l.c(bVar, "");
        i.a aVar = new i.a();
        LinkedHashMap<String, String> linkedHashMap = this.f156303a;
        l.c(linkedHashMap, "");
        aVar.f156340c.putAll(linkedHashMap);
        String str = this.f156304b;
        l.c(str, "");
        aVar.f156338a = str;
        String str2 = bVar.f156232e;
        l.c(str2, "");
        aVar.f156339b = str2;
        i a2 = aVar.a();
        l.c(a2, "");
        l.c(a2, "");
        com.vk.api.sdk.d.b a3 = dVar.a();
        d.a aVar2 = new d.a();
        l.c(a2, "");
        String str3 = a2.f156333a;
        l.c(str3, "");
        aVar2.f156294a = str3;
        String str4 = a2.f156334b;
        l.c(str4, "");
        aVar2.f156295b = str4;
        Map<String, String> map = a2.f156335c;
        l.c(map, "");
        aVar2.f156296c.putAll(map);
        com.vk.api.sdk.b.b eVar = new com.vk.api.sdk.b.e(dVar, a3, aVar2, dVar.f156269c.f156231d.getValue(), dVar.f156269c.p, this);
        l.c(a2, "");
        l.c(eVar, "");
        if (!a2.f156337e) {
            eVar = new h(dVar, a2.f156336d, eVar);
        }
        com.vk.api.sdk.b.b gVar = new g(dVar, a2.f156336d, new com.vk.api.sdk.b.d(dVar, eVar));
        if (a2.f156336d > 0) {
            gVar = new c(dVar, a2.f156336d, gVar);
        }
        l.c(gVar, "");
        T t = (T) gVar.a(new com.vk.api.sdk.b.a());
        if (t == null) {
            l.a();
        }
        return t;
    }
}
