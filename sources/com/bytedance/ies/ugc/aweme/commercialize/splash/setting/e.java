package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.o;
import h.f.b.l;
import h.q;
import h.r;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final o f34806a = new o();

    /* renamed from: b  reason: collision with root package name */
    public static final e f34807b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20879);
    }

    public static final String a() {
        Object obj;
        try {
            SettingsManager a2 = SettingsManager.a();
            o oVar = f34806a;
            o oVar2 = (o) a2.a("splash_setting_json", o.class, oVar);
            if (oVar2 != null) {
                oVar = oVar2;
            }
            obj = q.m223constructorimpl(oVar);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        o oVar3 = (o) obj;
        if (oVar3 == null) {
            oVar3 = f34806a;
        }
        String oVar4 = oVar3.toString();
        l.b(oVar4, "");
        return oVar4;
    }
}
