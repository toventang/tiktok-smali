package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.experiment.bd;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f134315a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(87841);
    }

    public static boolean a() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return g2.isLogin();
    }

    private static String b() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return g2.getCurUserId();
    }

    public static String a(String str) {
        l.d(str, "");
        String b2 = b();
        if (bd.b()) {
            if (b2 != null) {
                return str + "_" + b2;
            }
            return str;
        } else if (b2 != null) {
            return str + "_" + b();
        } else {
            return str;
        }
    }
}
