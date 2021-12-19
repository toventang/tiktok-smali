package com.ss.ugc.effectplatform.j;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.h.g;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.c;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.task.ah;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.task.d;
import com.ss.ugc.effectplatform.task.n;
import com.ss.ugc.effectplatform.util.t;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f153625a;

    static {
        Covode.recordClassIndex(102430);
    }

    public e(a aVar) {
        l.c(aVar, "");
        this.f153625a = aVar;
    }

    public final String a(List<String> list, Map<String, String> map, com.ss.ugc.effectplatform.h.e<List<Effect>> eVar) {
        String a2 = t.a();
        if (eVar != null) {
            this.f153625a.K.a(a2, eVar);
        }
        al alVar = this.f153625a.z;
        if (alVar != null) {
            alVar.a(new d(this.f153625a, list, a2, map));
        }
        return a2;
    }

    public final String a(Effect effect, boolean z, g gVar) {
        d.a.f.d gVar2;
        l.c(effect, "");
        String a2 = t.a();
        if (p.a((CharSequence) effect.getId())) {
            if (gVar != null) {
                gVar.onFail(effect, new com.ss.ugc.effectplatform.model.e(10014));
            }
            return a2;
        }
        if (gVar != null) {
            this.f153625a.K.a(a2, gVar);
        }
        if (z) {
            gVar2 = new n(this.f153625a, effect, a2);
        } else {
            gVar2 = new com.ss.ugc.effectplatform.task.g(effect, this.f153625a, a2);
        }
        al alVar = this.f153625a.z;
        if (alVar != null) {
            alVar.a(gVar2);
        }
        return a2;
    }

    public final String a(List<? extends Effect> list, c cVar, com.ss.ugc.effectplatform.h.e<List<Effect>> eVar) {
        l.c(list, "");
        String a2 = t.a();
        if (eVar != null) {
            this.f153625a.K.a(a2, eVar);
        }
        al alVar = this.f153625a.z;
        if (alVar != null) {
            alVar.a(new com.ss.ugc.effectplatform.task.e(this.f153625a, list, a2, cVar));
        }
        return a2;
    }

    public final String a(String str, String str2, int i2, int i3, Map<String, String> map, com.ss.ugc.effectplatform.h.e<SearchEffectResponseV2> eVar, String str3) {
        l.c(str, "");
        l.c(str2, "");
        String a2 = t.a();
        if (eVar != null) {
            this.f153625a.K.a(a2, eVar);
        }
        al alVar = this.f153625a.z;
        if (alVar != null) {
            alVar.a(new ah(this.f153625a, str, str2, i2, i3, map, a2, str3));
        }
        return a2;
    }
}
