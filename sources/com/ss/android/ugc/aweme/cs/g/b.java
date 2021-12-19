package com.ss.android.ugc.aweme.cs.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.bm;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f79061a = "privacy_setting_permission";

    /* renamed from: b  reason: collision with root package name */
    public static final Keva f79062b;

    /* renamed from: c  reason: collision with root package name */
    public static int f79063c;

    /* renamed from: d  reason: collision with root package name */
    public static int f79064d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f79065e = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(49081);
        Keva repo = Keva.getRepo("publish_privacy_settings_cache");
        f79062b = repo;
        f79063c = repo.getInt("privacy_setting_comment", 0);
    }

    public static int a() {
        m a2;
        if (bm.a() == 0 || (a2 = a.s().a("video_visibility_select")) == null || a2.f76684a != 1) {
            return f79062b.getInt(a(f79061a), 0);
        }
        return f79062b.getInt(a(f79061a), -1);
    }

    public static String a(String str) {
        String c2 = g.a().A().c();
        if (c2 == null || c2.length() == 0) {
            return str;
        }
        return str + c2;
    }
}
