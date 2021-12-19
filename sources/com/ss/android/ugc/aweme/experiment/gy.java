package com.ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.h.e;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;

public final class gy {

    /* renamed from: a  reason: collision with root package name */
    public static final e f90188a = new e(d.a(), "change_username");

    /* renamed from: b  reason: collision with root package name */
    public static final gy f90189b = new gy();

    private gy() {
    }

    static {
        Covode.recordClassIndex(56576);
    }

    public static final boolean a() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String b2 = in.b(g2.getCurUser());
        l.b(b2, "");
        return a(b2);
    }

    public static final boolean a(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        h.m.l lVar = new h.m.l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        try {
            Object a2 = SettingsManager.a().a("handle_settings", ga.class);
            l.b(a2, "");
            String str2 = ((ga) a2).f90130a;
            if (str2 != null) {
                lVar = new h.m.l(str2);
            }
        } catch (Throwable unused) {
            lVar = new h.m.l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        }
        return lVar.matches(str);
    }
}
