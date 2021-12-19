package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.ak;
import h.f.b.l;

public final class t {
    static {
        Covode.recordClassIndex(77199);
    }

    public static final int c() {
        return Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0);
    }

    public static final boolean a() {
        int i2 = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0);
        if (i2 == 0) {
            return ak.a();
        }
        if (i2 != 1) {
            return false;
        }
        return true;
    }

    public static final int b() {
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        Boolean a2 = c.f115634m.c().a();
        l.b(a2, "");
        return repo.getInt("save_to_local_config", a2.booleanValue() ? 1 : 0);
    }

    public static final String d() {
        int i2 = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0);
        if (i2 != 0) {
            if (i2 != 1) {
                return "0";
            }
            return "1";
        } else if (ak.a()) {
            return "d1";
        } else {
            return "d0";
        }
    }

    public static final void a(int i2) {
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("save_to_local_config", i2);
    }
}
