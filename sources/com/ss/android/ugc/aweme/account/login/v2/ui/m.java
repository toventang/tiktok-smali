package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f65086a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(40002);
    }

    public static String a() {
        String str;
        try {
            str = SettingsManager.a().a("minor_default_private_hint_intro_url", "");
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "aweme://webview/?url=https%3A%2F%2Fsupport.tiktok.com%2F" + ((ILanguageService) a.a(ILanguageService.class)).a() + "%2Faccount-and-privacy%2Faccount-privacy-settings%2Fmaking-your-account-public-or-private";
        }
        if (str == null) {
            l.b();
        }
        return str;
    }
}
