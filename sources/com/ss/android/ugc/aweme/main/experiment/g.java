package com.ss.android.ugc.aweme.main.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.cn;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f109254a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f109255b = i.a((h.f.a.a) a.f109257a);

    /* renamed from: c  reason: collision with root package name */
    private static Keva f109256c;

    private static boolean f() {
        return ((Boolean) f109255b.getValue()).booleanValue();
    }

    private g() {
    }

    public static boolean b() {
        if (b.a().a(true, "following_foru_swipe_disable_unloginuser", 0) == 1) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        Keva keva = f109256c;
        if (keva != null) {
            return keva.getBoolean("swiped", false);
        }
        return false;
    }

    public static void e() {
        Keva keva = f109256c;
        if (keva != null) {
            keva.storeBoolean("swiped", true);
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109257a = new a();

        static {
            Covode.recordClassIndex(69963);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "following_foru_swipe_disable_unloginuser", 0) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static boolean c() {
        if (!b()) {
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(69962);
        try {
            f109256c = Keva.getRepoFromSp(d.a(), "MTMainTabPreferences", 0);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a("SharedPreferencesAnnotatedManager getSP failed " + th.getMessage());
        }
    }

    public static boolean a() {
        if (cn.f89703a) {
            if (!f() || com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
                return false;
            }
            return true;
        } else if (b.a().a(true, "following_foru_swipe_disable_unloginuser", 0) == 0 || com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            return false;
        } else {
            return true;
        }
    }
}
