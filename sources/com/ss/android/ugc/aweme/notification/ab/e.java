package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f113120a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(72730);
    }

    public static final boolean a() {
        if (SettingsManager.a().a("shop_im_permission", 0) == 1) {
            return true;
        }
        return false;
    }
}
