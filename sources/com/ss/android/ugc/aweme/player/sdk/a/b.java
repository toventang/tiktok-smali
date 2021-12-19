package com.ss.android.ugc.aweme.player.sdk.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.a;
import com.ss.ttvideoengine.j.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f115106a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(73986);
    }

    public static List<c> a(List<a> list) {
        l.c(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            c.a aVar = new c.a();
            aVar.f152891b = t.f115326b;
            aVar.f152890a = t.f115325a;
            aVar.f152893d = t.f115328d;
            Integer num = t.f115327c;
            if (num != null) {
                aVar.f152894e = num.intValue();
            }
            Float f2 = t.f115329e;
            if (f2 != null) {
                aVar.f152895f = f2.floatValue();
            }
            Float f3 = t.f115330f;
            if (f3 != null) {
                aVar.f152896g = f3.floatValue();
            }
            String str = t.f115331g;
            if (str != null) {
                aVar.f152897h = str;
            }
            c cVar = new c();
            cVar.f152882a = aVar.f152890a;
            cVar.f152883b = aVar.f152891b;
            cVar.f152884c = aVar.f152892c;
            cVar.f152885d = aVar.f152893d;
            cVar.f152886e = aVar.f152894e;
            cVar.f152887f = aVar.f152895f;
            cVar.f152888g = aVar.f152896g;
            cVar.f152889h = aVar.f152897h;
            l.a((Object) cVar, "");
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
