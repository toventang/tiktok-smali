package com.ss.android.ugc.aweme.profile.settings;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f116626a = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";

    /* renamed from: b  reason: collision with root package name */
    public static final b f116627b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(75352);
    }

    public static String a() {
        String str;
        try {
            str = SettingsManager.a().a("download_app_link_schema", "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))");
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";
        }
        if (str == null) {
            l.b();
        }
        return str;
    }
}
