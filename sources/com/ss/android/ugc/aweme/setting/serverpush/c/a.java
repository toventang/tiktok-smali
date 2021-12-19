package com.ss.android.ugc.aweme.setting.serverpush.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122596a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80447);
    }

    public static boolean a() {
        if (!com.ss.android.ugc.aweme.upvote.b.a.a() || in.d()) {
            return false;
        }
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return true;
        }
        return false;
    }

    public static String b() {
        if (com.ss.android.ugc.aweme.upvote.b.a.b()) {
            String b2 = h.b(R.string.f99);
            l.b(b2, "");
            return b2;
        } else if (!com.ss.android.ugc.aweme.upvote.b.a.c()) {
            return "";
        } else {
            String b3 = h.b(R.string.fdk);
            l.b(b3, "");
            return b3;
        }
    }
}
