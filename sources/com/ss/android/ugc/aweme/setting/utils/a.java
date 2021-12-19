package com.ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f123031a = "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_list%3fhide_nav_bar%3d1%26report_from%3drate";

    /* renamed from: b  reason: collision with root package name */
    public static final a f123032b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80790);
    }

    public static final String a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.a().a("ad_interaction_entry_setting", "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_list%3fhide_nav_bar%3d1%26report_from%3drate");
        } catch (Throwable unused) {
            return f123031a;
        }
    }
}
