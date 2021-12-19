package com.ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.application.AwemeApplicationImpl;
import com.ss.android.ugc.aweme.experiment.j;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.legoImp.task.AppAttachUserStoreOptTask;
import com.ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.s.a;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(41252);
    }

    public static List<n> attachBaseContextAfterMultiDex(AwemeApplicationImpl awemeApplicationImpl) {
        if (f.b()) {
            awemeApplicationImpl.f66925f = new AwemeApplicationImpl.BeforeSuperOnCreateLegoTasks();
            awemeApplicationImpl.f66924e = new AwemeApplicationImpl.OnCreateLegoTasks();
            f.e().a(ae.q()).a(awemeApplicationImpl.f66925f).a(awemeApplicationImpl.f66924e).a();
        }
        f.d e2 = f.e();
        if (j.b()) {
            e2.a(ae.p());
        }
        if (((Boolean) a.f120727a.getValue()).booleanValue()) {
            e2.a(ae.q()).a(new AppAttachUserStoreOptTask());
        }
        awemeApplicationImpl.a(e2);
        if (a.c()) {
            e2.a(ae.q()).a(ae.j());
        }
        if (a.e()) {
            e2.a(ae.q()).a(ae.m());
        }
        if (a.f()) {
            e2.a(ae.q()).a(new AppFlyerLoadPropertiesTask());
        }
        e2.a();
        AwemeApplicationImpl.a(awemeApplicationImpl.f66921b.b());
        return null;
    }
}
