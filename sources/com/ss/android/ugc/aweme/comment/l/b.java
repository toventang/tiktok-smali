package com.ss.android.ugc.aweme.comment.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f72080a = "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_form%3fhide_nav_bar%3d1%26report_type%3d3";

    /* renamed from: b  reason: collision with root package name */
    public static final b f72081b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(44278);
    }

    public static final String a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.a().a("report_ads_problem_schema_setting", "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_form%3fhide_nav_bar%3d1%26report_type%3d3");
        } catch (Throwable unused) {
            return f72080a;
        }
    }
}
