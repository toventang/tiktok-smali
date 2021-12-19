package com.ss.ttvideoengine.n;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.j.d;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.n.b.h;
import com.ss.ttvideoengine.n.b.i;
import com.ss.ttvideoengine.w;

public final class a {
    static {
        Covode.recordClassIndex(101719);
    }

    public static w a(e eVar, w wVar) {
        int abs;
        if (eVar == null || wVar == null) {
            return w.Standard;
        }
        int length = w.getAllResolutions().length;
        w[] i2 = eVar.i();
        if (i2 == null || i2.length == 0) {
            return wVar;
        }
        w wVar2 = wVar;
        for (w wVar3 : i2) {
            if (wVar3 != null && (abs = Math.abs(wVar3.ordinal() - wVar.ordinal())) < length) {
                wVar2 = wVar3;
                if (abs == 0) {
                    break;
                }
                length = abs;
            }
        }
        return wVar2;
    }

    public static w b(e eVar, w wVar) {
        if (eVar == null || wVar == null) {
            return w.Standard;
        }
        long j2 = 0;
        w[] i2 = eVar.i();
        if (!(i2 == null || i2.length == 0)) {
            for (w wVar2 : i2) {
                long a2 = aj.a(eVar, wVar2);
                if (a2 > j2) {
                    wVar = wVar2;
                    j2 = a2;
                }
            }
        }
        return wVar;
    }

    public static w c(e eVar, w wVar) {
        if (eVar == null || wVar == null) {
            return w.Standard;
        }
        w[] i2 = eVar.i();
        if (!(i2 == null || i2.length == 0)) {
            for (w wVar2 : i2) {
                if (aj.a(eVar, wVar2) > 0 && wVar2.ordinal() > wVar.ordinal()) {
                    wVar = wVar2;
                }
            }
        }
        return wVar;
    }

    public static w a(e eVar, w wVar, double d2, h hVar) {
        if (!(eVar == null || wVar == null || hVar == null)) {
            i iVar = new i(hVar);
            i.a aVar = new i.a();
            aVar.f153122a = d2;
            d dVar = iVar.a(eVar, aVar.a()).f153112a;
            if (dVar != null) {
                return dVar.c();
            }
        }
        return wVar;
    }
}
