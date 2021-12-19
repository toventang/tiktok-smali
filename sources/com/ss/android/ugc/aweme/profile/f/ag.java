package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import h.f.b.l;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f116393a = new ag();

    /* renamed from: b  reason: collision with root package name */
    private static final int f116394b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f116395c = 2;

    private ag() {
    }

    static {
        Covode.recordClassIndex(75147);
    }

    public static boolean a() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = iESSettingsProxy.getProAccountEnableDetailInfo();
            l.b(proAccountEnableDetailInfo, "");
            Integer isProaccountDisplay = proAccountEnableDetailInfo.getIsProaccountDisplay();
            int i2 = f116395c;
            if (isProaccountDisplay == null) {
                return false;
            }
            if (isProaccountDisplay.intValue() == i2) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
