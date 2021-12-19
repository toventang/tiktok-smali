package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final b f78416a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final e f78417b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(48695);
    }

    public static final b a() {
        try {
            return (b) SettingsManager.a().a("creator_plus_settings", b.class, f78416a);
        } catch (Throwable unused) {
            return null;
        }
    }

    static String a(String str) {
        String str2;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        return str + "_" + str2;
    }
}
