package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f122195a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final g f122196b = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(80111);
    }

    public static final String a() {
        String str;
        try {
            str = SettingsManager.a().a("creator_fund_setting_entry_schema", "");
            l.b(str, "");
        } catch (Throwable th) {
            a.a("creator_fund_investigate action = creator_fund_setting_entry_schema_error, throwable = " + th.getMessage());
            str = f122195a;
        }
        a.a("creator_fund_investigate action = creator_fund_setting_entry_schema, content = ".concat(String.valueOf(str)));
        return str;
    }
}
