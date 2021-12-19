package com.ss.android.ugc.aweme.homepage.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.app.l;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;

public final class a {
    static {
        Covode.recordClassIndex(63181);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.business.a$a  reason: collision with other inner class name */
    public static final class RunnableC2423a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f99170a;

        static {
            Covode.recordClassIndex(63182);
        }

        public RunnableC2423a(long j2) {
            this.f99170a = j2;
        }

        public final void run() {
            a.a(this.f99170a);
        }
    }

    public static final void a(long j2) {
        boolean z;
        int a2 = l.a();
        int e2 = (int) d.e();
        if (a2 != e2) {
            z = true;
        } else {
            z = false;
        }
        j a3 = j.a();
        h.f.b.l.b(a3, "");
        if (a3.f66808a) {
            new f.c().b((w) new MobLaunchEventTask(z, j2)).a();
        }
        if (a2 == 0) {
            l.a(e2);
        }
        j a4 = j.a();
        h.f.b.l.b(a4, "");
        a4.f66808a = false;
        new f.c().b((w) new AntispamApiUploadTask()).a();
    }
}
