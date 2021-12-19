package com.ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.s.a;
import com.ss.android.ugc.aweme.utils.aw;

public final class d {
    static {
        Covode.recordClassIndex(41251);
    }

    public static void handleAttachBaseContext(AwemeApplicationImpl awemeApplicationImpl) {
        awemeApplicationImpl.attachBaseContextAfterMultiDex();
        if (a.i()) {
            f.a(ae.n());
        }
        if (a.l()) {
            f.a(ae.s());
        }
        if (com.ss.android.common.util.f.a(awemeApplicationImpl.f66922c)) {
            a.b.f109011a.b("cold_boot_application_attach_duration", true);
            aw.b("cold_boot_application_attach_duration");
            a.b.f109011a.a("cold_boot_application_attach_to_create", true);
            aw.a("cold_boot_application_attach_to_create");
        }
    }
}
