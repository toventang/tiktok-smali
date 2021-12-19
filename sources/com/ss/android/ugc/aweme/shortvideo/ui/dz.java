package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.ac;
import com.ss.android.ugc.aweme.shortvideo.publish.aj;
import com.ss.android.ugc.tools.utils.q;
import f.a.t;
import h.f.a.a;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dz implements a {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131705a;

    static {
        Covode.recordClassIndex(86255);
    }

    dz(cj cjVar) {
        this.f131705a = cjVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        String str;
        t<ac> b2;
        t<ac> a2;
        cj cjVar = this.f131705a;
        q.a("TitleSensitivity SensitiveTitleCheck() ");
        com.ss.android.ugc.aweme.photo.a.a value = cjVar.f131606m.getValue();
        if (value != null) {
            aj a3 = cjVar.r.a(value.getPermission(), c.u.e().e());
            if (a3 == null) {
                cjVar.n();
                q.a("TitleSensitivity SensitiveTitleCheck() checker is null");
            } else {
                q.a("TitleSensitivity SensitiveTitleCheck() goes to sync  data");
                ee eeVar = new ee(cjVar);
                ef efVar = new ef(cjVar);
                eg egVar = new eg(cjVar, a3);
                l.d(eeVar, "");
                l.d(efVar, "");
                l.d(egVar, "");
                q.a("TitleSensitivity start synchronize data with 2 different response");
                if (a3.f129724d || a3.f129722b != null || a3.f129721a != null || (str = a3.f129723c) == null || str.length() == 0) {
                    egVar.invoke();
                } else {
                    eeVar.invoke();
                    q.a("TitleSensitivity showloding when sync data");
                    t<ac> tVar = a3.f129725e;
                    a3.f129727g = (tVar == null || (b2 = tVar.b(f.a.h.a.b(f.a.k.a.f158006c))) == null || (a2 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) == null) ? null : a2.a(new aj.d(a3, efVar, egVar), new aj.e(efVar, egVar));
                }
            }
        }
        return null;
    }
}
