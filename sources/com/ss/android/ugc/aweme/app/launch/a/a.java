package com.ss.android.ugc.aweme.app.launch.a;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.notice.api.e.p;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f66822a = true;

    static {
        Covode.recordClassIndex(41148);
    }

    public static final void a(boolean z, String str) {
        l.d(str, "");
        if (z || !f.f34637l) {
            String a2 = com.bytedance.ies.ugc.statisticlogger.a.a();
            String installId = AppLog.getInstallId();
            if (m.a(a2) || m.a(installId)) {
                String str2 = "deviceId:" + a2 + " or iid:" + installId + " is empty!";
                p.a(str, "did_or_iid_is_empty", str2);
                com.ss.android.ugc.aweme.framework.a.a.b(6, "ws", str2);
                return;
            }
            q.f112739f.a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a.a$a  reason: collision with other inner class name */
    public static final class C1500a implements IAccountService.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1500a f66823a = new C1500a();

        static {
            Covode.recordClassIndex(41149);
        }

        C1500a() {
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.b
        public final void onAccountResult(int i2, boolean z, int i3, User user) {
            if (!z) {
                return;
            }
            if (i2 == 1 || i2 == 2) {
                a.a(true, "account_change");
            }
        }
    }
}
