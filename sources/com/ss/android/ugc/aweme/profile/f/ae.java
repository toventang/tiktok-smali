package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import h.f.b.l;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f116389a = new ae();

    /* renamed from: b  reason: collision with root package name */
    private static final int f116390b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f116391c = 2;

    private ae() {
    }

    static {
        Covode.recordClassIndex(75145);
    }

    public static boolean a() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = iESSettingsProxy.getProAccountEnableDetailInfo();
            l.b(proAccountEnableDetailInfo, "");
            Integer isProaccountDisplay = proAccountEnableDetailInfo.getIsProaccountDisplay();
            int i2 = f116391c;
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
