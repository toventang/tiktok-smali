package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class bo {

    /* renamed from: a  reason: collision with root package name */
    public static final bp f122098a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final bo f122099b = new bo();

    private bo() {
    }

    static {
        Covode.recordClassIndex(80061);
    }

    public static bp a() {
        try {
            bp bpVar = (bp) SettingsManager.a().a("profile_badge", bp.class, f122098a);
            if (bpVar == null) {
                return new bp();
            }
            return bpVar;
        } catch (Throwable unused) {
            return new bp();
        }
    }
}
