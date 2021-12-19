package com.ss.android.ugc.aweme.bc.a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.e.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import h.f.b.l;

public final class c implements Runnable {
    static {
        Covode.recordClassIndex(42196);
    }

    public final void run() {
        IExternalService a2 = AVExternalServiceImpl.a();
        Application a3 = g.a();
        l.b(a3, "");
        a2.attachApplication(a3);
        a.f59474a = "/aweme";
    }
}
