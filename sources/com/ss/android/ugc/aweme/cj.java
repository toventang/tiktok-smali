package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.n.a;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.AgeGateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.LoginService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class cj {

    /* renamed from: a  reason: collision with root package name */
    static List<IAccountService.b> f71083a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static an f71084b;

    /* renamed from: c  reason: collision with root package name */
    private static LoginService f71085c;

    /* renamed from: d  reason: collision with root package name */
    private static BindService f71086d;

    static {
        Covode.recordClassIndex(43760);
    }

    public static String b() {
        return f71084b.e().getCurUserId();
    }

    public static AgeGateService c() {
        return (AgeGateService) f71084b.c();
    }

    public static boolean d() {
        return f71084b.e().isLogin();
    }

    public static void e() {
        f71084b.e().accountUserClear();
    }

    public static User f() {
        return f71084b.e().getCurUser();
    }

    public static LoginService g() {
        if (f71085c == null) {
            f71085c = (LoginService) f71084b.g();
        }
        return f71085c;
    }

    public static BaseBindService h() {
        if (f71086d == null) {
            f71086d = (BindService) f71084b.h();
        }
        return f71086d;
    }

    public static void i() {
        for (IAccountService.b bVar : f71083a) {
            bVar.onAccountResult(4, true, 0, null);
        }
    }

    public static boolean a() {
        if (g().getLoginParam() == null || !g().getLoginParam().f62400g) {
            return false;
        }
        return true;
    }

    public static void a(a aVar) {
        f71084b.e().updateUserInfo(aVar);
    }

    public static void a(IAccountService.b bVar) {
        MethodCollector.i(8521);
        synchronized (cj.class) {
            try {
                if (!f71083a.contains(bVar)) {
                    f71083a.add(bVar);
                }
            } finally {
                MethodCollector.o(8521);
            }
        }
    }

    public static void a(User user) {
        for (IAccountService.b bVar : f71083a) {
            bVar.onAccountResult(1, true, 0, user);
        }
    }

    public static void a(boolean z) {
        for (IAccountService.b bVar : f71083a) {
            bVar.onAccountResult(3, z, 0, null);
        }
    }

    public static void a(boolean z, User user) {
        for (IAccountService.b bVar : f71083a) {
            bVar.onAccountResult(2, z, 0, user);
        }
    }

    public static void a(int i2, int i3, String str) {
        an anVar = f71084b;
        if (anVar.f66374a != null) {
            anVar.f66374a.notifyProgress(i2, i3, str);
        }
    }

    public static void a(int i2, int i3, Object obj) {
        an anVar = f71084b;
        if (i2 == 1) {
            if (anVar.f66374a != null) {
                anVar.f66374a.returnResult(i2, i3, obj);
            }
        } else if (i2 == 15) {
            if (anVar.f66379f != null) {
                anVar.f66379f.returnResult(i2, i3, obj);
                anVar.f66379f = null;
            }
        } else if (i2 == 16) {
            if (anVar.f66376c != null) {
                anVar.f66376c.returnResult(i2, i3, obj);
            }
        } else if (i2 != 17) {
            if (anVar.f66375b != null) {
                anVar.f66375b.returnResult(i2, i3, obj);
            }
            if (anVar.f66377d != null) {
                anVar.f66377d.returnResult(i2, i3, obj);
            }
            if (anVar.f66378e != null) {
                anVar.f66378e.returnResult(i2, i3, obj);
            }
        } else if (anVar.f66377d != null) {
            anVar.f66377d.returnResult(i2, i3, obj);
        }
    }
}
