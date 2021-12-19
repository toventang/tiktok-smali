package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.ss.android.ugc.aweme.cf;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f63007a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final h f63008b = i.a((h.f.a.a) a.f63009a);

    private static int c() {
        return ((Number) f63008b.getValue()).intValue();
    }

    private j() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63009a = new a();

        static {
            Covode.recordClassIndex(38810);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("login_default_open_screen", ClientExpManager.login_default_open_screen()));
        }
    }

    static {
        Covode.recordClassIndex(38809);
    }

    public static boolean a() {
        if (!AccountExperimentLayerServiceImpl.b().a(cf.MAKE_LOGIN_PAGE_DEFAULT)) {
            return false;
        }
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        if (e2.isLogin()) {
            return false;
        }
        if (c() == 1 || c() == 2) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (!AccountExperimentLayerServiceImpl.b().a(cf.MAKE_LOGIN_PAGE_DEFAULT)) {
            return false;
        }
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        if (!e2.isLogin() && c() == 2) {
            return true;
        }
        return false;
    }
}
