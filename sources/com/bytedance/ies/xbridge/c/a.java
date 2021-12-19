package com.bytedance.ies.xbridge.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class a implements b {

    /* renamed from: d  reason: collision with root package name */
    public c f35883d;

    static {
        Covode.recordClassIndex(21444);
    }

    @Override // com.bytedance.ies.xbridge.b
    public Class<? extends com.bytedance.ies.xbridge.model.params.a> d() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.b
    public Class<? extends com.bytedance.ies.xbridge.model.c.a> e() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.b
    public void f() {
    }

    @Override // com.bytedance.ies.xbridge.b
    public b.a c() {
        return b.a.PRIVATE;
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(c cVar) {
        this.f35883d = cVar;
    }

    public final <T> T a(Class<T> cls) {
        l.c(cls, "");
        c cVar = this.f35883d;
        if (cVar != null) {
            return (T) cVar.a(cls);
        }
        return null;
    }

    public static void a(b.AbstractC0814b bVar, Map<String, Object> map, String str) {
        l.c(bVar, "");
        l.c(map, "");
        l.c(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        bVar.a(linkedHashMap);
    }

    public static void a(b.AbstractC0814b bVar, int i2, String str, Map<String, Object> map) {
        l.c(bVar, "");
        l.c(str, "");
        l.c(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i2));
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        bVar.a(linkedHashMap);
    }

    public static /* synthetic */ void a(b.AbstractC0814b bVar, int i2, String str, Map map, int i3) {
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 8) != 0) {
            map = new LinkedHashMap();
        }
        a(bVar, i2, str, map);
    }
}
