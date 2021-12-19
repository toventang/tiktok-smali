package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f134291a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(87826);
    }

    public static void a(String str, int i2, String str2, UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(str, "");
        l.d(str2, "");
        r.a("widget_time_tracker_show", new d().a("widget_name", str).a("page", d.c()).a("is_selected", i2).a("position", str2).a("event_keyword", a.g(ugAwemeActivitySetting)).f66730a);
    }

    public static void a(String str, String str2, int i2, String str3, int i3, String str4, UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        r.a("widget_time_tracker_click", new d().a("position", str).a("widget_name", str2).a("page", d.c()).a("is_selected", i2).a("group_id", str3).a("is_tiktok_bonus", i3).a("click", str4).a("event_keyword", a.g(ugAwemeActivitySetting)).f66730a);
    }
}
