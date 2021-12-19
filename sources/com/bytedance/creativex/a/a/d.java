package com.bytedance.creativex.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class d extends v<HashMap<String, Serializable>> {

    /* renamed from: a  reason: collision with root package name */
    private final f f28030a;

    /* renamed from: b  reason: collision with root package name */
    private final c f28031b;

    static {
        Covode.recordClassIndex(16415);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ HashMap<String, Serializable> read(a aVar) {
        l.d(aVar, "");
        HashMap hashMap = new HashMap();
        aVar.c();
        while (aVar.e()) {
            String h2 = aVar.h();
            c cVar = this.f28031b;
            l.b(h2, "");
            Object a2 = this.f28030a.a(aVar.i(), (Class) cVar.a(h2));
            if (a2 == null) {
                hashMap.put(h2, a2);
            } else if (a2 instanceof Serializable) {
                hashMap.put(h2, a2);
            } else {
                throw new IllegalStateException("type not supported yet".toString());
            }
        }
        aVar.d();
        return hashMap;
    }

    public d(f fVar, c cVar) {
        l.d(fVar, "");
        l.d(cVar, "");
        this.f28030a = fVar;
        this.f28031b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, HashMap<String, Serializable> hashMap) {
        HashMap<String, Serializable> hashMap2 = hashMap;
        l.d(cVar, "");
        l.d(hashMap2, "");
        cVar.d();
        for (Map.Entry<String, Serializable> entry : hashMap2.entrySet()) {
            String key = entry.getKey();
            Serializable value = entry.getValue();
            Class<?> a2 = this.f28031b.a(key);
            cVar.a(key);
            cVar.b(this.f28030a.b(value, a2));
        }
        cVar.e();
    }
}
