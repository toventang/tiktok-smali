package com.bytedance.lynx.hybrid.resource.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.j.b;
import com.bytedance.lynx.hybrid.resource.c.a;
import com.bytedance.lynx.hybrid.resource.d.d;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.i.c;
import com.bytedance.lynx.hybrid.resource.j;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.z;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends c {
    static {
        Covode.recordClassIndex(25173);
    }

    @Override // com.bytedance.lynx.hybrid.resource.b.c
    public final e a(e eVar, d dVar) {
        l.c(eVar, "");
        l.c(dVar, "");
        new c();
        e b2 = b(eVar, dVar);
        if (b2 instanceof j) {
            ((j) b2).f41215c = true;
            b2.a(eVar.f41130l);
        }
        return b2;
    }

    private static e b(e eVar, d dVar) {
        Integer num = dVar.f41109e;
        if (num != null && num.intValue() == 2) {
            if (eVar instanceof j) {
                ((j) eVar).c("memory dynamic is 2");
            }
            com.bytedance.lynx.hybrid.j.c.a("MemoryLoader:return null because dynamic is 2", (b) null, (String) null, 6);
            return null;
        } else if (dVar.f41111g.length() != 0 && dVar.f41112h.length() != 0) {
            return a.b.f41072a.b(com.bytedance.lynx.hybrid.resource.c.b.a(dVar));
        } else {
            if (eVar instanceof j) {
                ((j) eVar).c("memory channel/bundle is empty");
            }
            com.bytedance.lynx.hybrid.j.c.a("MemoryLoader:return null because channel or bundle is empty", (b) null, (String) null, 6);
            return null;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.b.c
    public final void a(e eVar, d dVar, h.f.a.b<? super e, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.c(eVar, "");
        l.c(dVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        new c();
        e b2 = b(eVar, dVar);
        if (b2 == null) {
            JSONArray jSONArray = eVar.f41130l;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.name, "Memory");
            jSONObject.put("status", "fail");
            jSONObject.put("message", "not found");
            jSONArray.put(jSONObject);
            bVar2.invoke(new Throwable("memory loader return null"));
            return;
        }
        if (b2 instanceof j) {
            ((j) b2).f41215c = true;
        }
        InputStream a2 = b2.a();
        if (a2 == null || a2.available() <= 0) {
            if (eVar instanceof j) {
                ((j) eVar).c("memory size 0");
            }
            JSONArray jSONArray2 = eVar.f41130l;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "Memory");
            jSONObject2.put("status", "failed");
            jSONObject2.put("message", "size 0");
            jSONArray2.put(jSONObject2);
            eVar.a(jSONArray2);
            bVar2.invoke(new Throwable("memory loader size is 0"));
            return;
        }
        try {
            if (!(b2.p == d.BUILTIN || a2 == null)) {
                a2.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        JSONArray jSONArray3 = eVar.f41130l;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(StringSet.name, "Memory");
        jSONObject3.put("status", "success");
        jSONArray3.put(jSONObject3);
        eVar.a(jSONArray3);
        b2.a(eVar.f41130l);
        bVar.invoke(b2);
    }
}
