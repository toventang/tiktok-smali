package com.bytedance.ies.bullet.kit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.b.a;
import com.bytedance.ies.bullet.kit.a.b.b;
import com.bytedance.ies.bullet.kit.a.f;
import com.bytedance.ies.bullet.kit.a.p;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.z;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends c {
    static {
        Covode.recordClassIndex(18891);
    }

    @Override // com.bytedance.ies.bullet.kit.a.a.c
    public final ap a(ap apVar, d dVar) {
        l.c(apVar, "");
        l.c(dVar, "");
        p pVar = new p();
        ap b2 = b(apVar, dVar);
        if (b2 instanceof f) {
            ((f) b2).f32242c = true;
            b2.b(apVar.f32563l);
            b2.a(apVar.f32564m);
            JSONObject jSONObject = b2.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("me_total", pVar.b());
            }
        }
        return b2;
    }

    private final ap b(ap apVar, d dVar) {
        Integer num = dVar.f32636j;
        if (num != null && num.intValue() == 2) {
            if (apVar instanceof f) {
                ((f) apVar).c("memory dynamic is 2");
            }
            j.b.a(this, "MemoryLoader:return null because dynamic is 2", null, null, 6);
            return null;
        } else if (dVar.f32638l.length() != 0 && dVar.f32639m.length() != 0) {
            return a.b.f32215a.b(b.a(apVar, dVar));
        } else {
            if (apVar instanceof f) {
                ((f) apVar).c("memory channel/bundle is empty");
            }
            j.b.a(this, "MemoryLoader:return null because channel or bundle is empty", null, null, 6);
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.a.a.c
    public final void a(ap apVar, d dVar, h.f.a.b<? super ap, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.c(apVar, "");
        l.c(dVar, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        p pVar = new p();
        ap b2 = b(apVar, dVar);
        if (b2 == null) {
            JSONObject jSONObject = apVar.f32563l.f32555h;
            if (jSONObject != null) {
                jSONObject.put("me_total", pVar.b());
            }
            JSONArray jSONArray = apVar.f32564m;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.name, "Memory");
            jSONObject2.put("status", "fail");
            jSONObject2.put("message", "not found");
            jSONArray.put(jSONObject2);
            bVar2.invoke(new Throwable("memory loader return null"));
            return;
        }
        if (b2 instanceof f) {
            ((f) b2).f32242c = true;
        }
        b2.b(apVar.f32563l);
        JSONObject jSONObject3 = b2.f32563l.f32555h;
        if (jSONObject3 != null) {
            jSONObject3.put("me_total", pVar.b());
        }
        InputStream a2 = b2.a();
        if (a2 == null || a2.available() <= 0) {
            if (apVar instanceof f) {
                ((f) apVar).c("memory size 0");
            }
            JSONArray jSONArray2 = apVar.f32564m;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(StringSet.name, "Memory");
            jSONObject4.put("status", "failed");
            jSONObject4.put("message", "size 0");
            jSONArray2.put(jSONObject4);
            apVar.a(jSONArray2);
            bVar2.invoke(new Throwable("memory loader size is 0"));
            return;
        }
        try {
            if (!(b2.q == ao.BUILTIN || a2 == null)) {
                a2.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        JSONArray jSONArray3 = apVar.f32564m;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(StringSet.name, "Memory");
        jSONObject5.put("status", "success");
        jSONArray3.put(jSONObject5);
        apVar.a(jSONArray3);
        b2.a(apVar.f32564m);
        bVar.invoke(b2);
    }
}
