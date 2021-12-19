package com.ss.android.ugc.aweme.detail.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79985a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49773);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49774);
        }

        private a() {
        }

        static boolean a() {
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                return true;
            }
            IAccountUserService g3 = b.g();
            l.b(g3, "");
            User curUser = g3.getCurUser();
            l.b(curUser, "");
            if (curUser.getCommerceUserLevel() <= 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }
}
