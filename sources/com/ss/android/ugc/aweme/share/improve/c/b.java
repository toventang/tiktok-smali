package com.ss.android.ugc.aweme.share.improve.c;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.Objects;

public final class b {
    static {
        Covode.recordClassIndex(81284);
    }

    public static final String a(String str) {
        if (str == null || p.b(str, "http://", false) || p.b(str, "https://", false)) {
            return str;
        }
        return "https://".concat(String.valueOf(str));
    }

    public static final boolean b(Context context) {
        l.d(context, "");
        if (androidx.core.content.b.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static final Activity a(Context context) {
        l.d(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                Objects.requireNonNull(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return f.j();
    }

    public static final String b(String str) {
        if (str == null || str.length() == 0 || p.a((CharSequence) str, (CharSequence) "timestamp=", false)) {
            return str;
        }
        h hVar = new h(str);
        hVar.a("timestamp", System.currentTimeMillis() / 1000);
        return hVar.a();
    }

    public static final boolean a(File file) {
        if (file.exists() && file.length() <= 104857600) {
            return true;
        }
        return false;
    }

    public static final String c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            return str;
        }
        h hVar = new h(str);
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        hVar.a("user_id", g3.getCurUserId());
        IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g4, "");
        hVar.a("sec_user_id", g4.getCurSecUserId());
        return hVar.a();
    }
}
