package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final e f84229a = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final j f84230b = new j();

    private j() {
    }

    public static final int a() {
        return b().f84213b * 1000;
    }

    static {
        Covode.recordClassIndex(52526);
    }

    public static final e b() {
        SettingsManager a2 = SettingsManager.a();
        e eVar = f84229a;
        e eVar2 = (e) a2.a("ecom_pdp_settings_config", e.class, eVar);
        return eVar2 == null ? eVar : eVar2;
    }
}
