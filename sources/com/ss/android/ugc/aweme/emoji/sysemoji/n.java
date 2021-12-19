package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.utils.d;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f89405a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final o f89406b = new o("0");

    private n() {
    }

    public static boolean c() {
        if (a().f89407a == 0) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (a().f89407a == -1) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (a().f89409c == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56179);
    }

    public static o a() {
        try {
            o oVar = (o) SettingsManager.a().a("sys_emoji_config", o.class);
            if (oVar == null) {
                return f89406b;
            }
            return oVar;
        } catch (Throwable unused) {
            return f89406b;
        }
    }

    public static boolean b() {
        try {
            d a2 = d.a();
            l.b(a2, "");
            if (a2.e() < Integer.parseInt(a().f89408b)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            a.b(3, null, "SystemEmojiFetchSetting update fail " + a().f89408b);
            return false;
        }
    }
}
