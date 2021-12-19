package com.ss.android.ugc.aweme.profile.settings;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import h.m.p;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f116628a = "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch";

    /* renamed from: b  reason: collision with root package name */
    public static final c f116629b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(75353);
    }

    private static String a() {
        String str;
        try {
            str = SettingsManager.a().a("account_switch_schema", "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch");
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch";
        }
        if (str == null) {
            l.b();
        }
        return str;
    }

    public static String a(int i2, String str) {
        String language;
        String str2 = "";
        l.d(str, str2);
        String a2 = p.a(p.a(a(), "((page_action_type))", String.valueOf(i2), false), "((enter_from))", str, false);
        Locale a3 = com.ss.android.ugc.aweme.i18n.language.i18n.c.a(d.a());
        if (!(a3 == null || (language = a3.getLanguage()) == null)) {
            str2 = language;
        }
        return p.a(a2, "((locale))", str2, false);
    }
}
