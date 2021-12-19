package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class em {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f89937a;

    /* renamed from: b  reason: collision with root package name */
    public static String[] f89938b;

    /* renamed from: c  reason: collision with root package name */
    public static final em f89939c = new em();

    private em() {
    }

    static {
        String[] strArr;
        Covode.recordClassIndex(56463);
        String[] strArr2 = {"surl", "fallback_url"};
        f89937a = strArr2;
        try {
            strArr = (String[]) SettingsManager.a().a("lynxview_command_blacklist", String[].class, strArr2);
        } catch (Exception unused) {
            strArr = f89937a;
        }
        f89938b = strArr;
    }
}
