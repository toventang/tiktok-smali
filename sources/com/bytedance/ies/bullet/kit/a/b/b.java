package com.bytedance.ies.bullet.kit.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.b.l;
import h.m.p;
import h.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f32225a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(18899);
    }

    public static String a(ap apVar, j jVar) {
        String str;
        l.c(apVar, "");
        l.c(jVar, "");
        if (p.b(jVar.f32639m, "/", false)) {
            String str2 = jVar.f32639m;
            if (str2 != null) {
                str = str2.substring(1);
                l.a((Object) str, "");
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } else {
            str = jVar.f32639m;
        }
        return jVar.y + '_' + jVar.f32638l + '_' + str;
    }
}
