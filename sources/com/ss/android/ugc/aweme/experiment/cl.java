package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class cl {

    /* renamed from: a  reason: collision with root package name */
    public static final cl f89701a = new cl();

    private cl() {
    }

    static {
        Covode.recordClassIndex(56373);
    }

    public static final boolean b() {
        if (cm.a() == 0 && ck.a() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean a() {
        if (cm.a() == 2 || SettingsManager.a().a("can_exp_video_archive", 0) == 1 || ck.a() == 2) {
            return true;
        }
        return false;
    }
}
