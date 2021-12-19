package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f116475a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(75182);
    }

    public static void a(int i2, int i3, String str) {
        String str2;
        if (i3 == 1) {
            str2 = "personal_homepage";
        } else if (i3 != 2) {
            str2 = "edit_profile_page";
        } else {
            str2 = "modify_username_notify";
        }
        b(i2, str2, str);
    }

    public static void a(int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("modify_username_confirm", new d().a("enter_from", str).a("status", i2).a("click_method", str2).f66730a);
    }

    public static void b(int i2, String str, String str2) {
        l.d(str, "");
        r.a("save_username", new d().a("enter_from", str).a("status", i2).a("error_code", str2).f66730a);
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a(str, new d().a(StringSet.type, str3).a("enter_method", str2).f66730a);
    }
}
