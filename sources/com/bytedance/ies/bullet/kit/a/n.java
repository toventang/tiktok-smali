package com.bytedance.ies.bullet.kit.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f32290a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f32291b;

    private n() {
    }

    static {
        Covode.recordClassIndex(18927);
        ArrayList arrayList = new ArrayList();
        arrayList.add("http");
        arrayList.add("local_file");
        arrayList.add("assets");
        arrayList.add("https");
        arrayList.add("lynxview");
        f32291b = arrayList;
    }

    public static ap a(ap apVar, j jVar) {
        l.c(apVar, "");
        l.c(jVar, "");
        boolean z = false;
        if (h.a.n.a((Iterable) f32291b, (Object) apVar.n.getScheme()) || apVar.q != null || jVar.f32638l.length() > 0) {
            z = true;
        }
        apVar.t = z;
        return apVar;
    }

    public static boolean a(i iVar, String str) {
        l.c(iVar, "");
        l.c(str, "");
        if (!iVar.f32625f.isEmpty()) {
            for (String str2 : iVar.f32625f) {
                if (p.a((CharSequence) str, (CharSequence) str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
