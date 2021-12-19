package com.ss.android.ugc.aweme.profile.widgets.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f117944a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f117945b = new d();

    private d() {
    }

    static {
        String a2;
        Covode.recordClassIndex(76442);
        SettingsManager a3 = SettingsManager.a();
        String str = "";
        if (!(a3 == null || (a2 = a3.a("tip_entry_schema", str)) == null)) {
            str = a2;
        }
        f117944a = str;
    }
}
