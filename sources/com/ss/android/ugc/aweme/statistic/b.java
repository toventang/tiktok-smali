package com.ss.android.ugc.aweme.statistic;

import android.app.Application;
import android.os.Bundle;
import b.i;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.config.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.experiment.ca;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: com.ss.android.ugc.aweme.statistic.b$b  reason: collision with other inner class name */
    public static final class C3502b extends d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f134686b;

        static {
            Covode.recordClassIndex(88017);
        }

        /* renamed from: com.ss.android.ugc.aweme.statistic.b$b$a */
        public static final class a implements d.a {
            static {
                Covode.recordClassIndex(88018);
            }

            a() {
            }

            @Override // com.bytedance.ies.ugc.statisticlogger.config.d.a
            public final j a() {
                return new AppLogNetworkClient();
            }
        }

        @Override // com.bytedance.ies.ugc.statisticlogger.config.d
        public final d.a a() {
            return new a();
        }

        @Override // com.bytedance.ies.ugc.statisticlogger.config.d
        public final boolean b() {
            if (cn.f89703a) {
                return ((Boolean) ca.f89685a.getValue()).booleanValue();
            }
            if (!com.bytedance.ies.abmock.b.a().a(false, "disable_mt_log_frequency_control", false)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3502b(Application application, Application application2) {
            super(application2);
            this.f134686b = application;
        }
    }

    static {
        Covode.recordClassIndex(88015);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f134685a;

        static {
            Covode.recordClassIndex(88016);
        }

        a(Application application) {
            this.f134685a = application;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bundle bundle = new Bundle();
            if (f.a(this.f134685a)) {
                bundle.putString("web_ua", RawURLGetter.a("other"));
            }
            if (f.a(this.f134685a)) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                bundle.putInt("user_mode", curUser.getUserMode());
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                User curUser2 = g3.getCurUser();
                l.b(curUser2, "");
                bundle.putInt("user_period", curUser2.getUserPeriod());
                bundle.putInt("is_kids_mode", in.d() ? 1 : 0);
                bundle.putInt("filter_warn", com.ss.android.ugc.aweme.compliance.api.a.o().b());
            }
            AppLog.setCustomerHeader(bundle);
            return z.f158842a;
        }
    }

    public static final void a(Application application) {
        l.d(application, "");
        try {
            i.b(new a(application), i.f4824a);
            com.bytedance.ies.ugc.statisticlogger.config.b.a(new C3502b(application, application));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
