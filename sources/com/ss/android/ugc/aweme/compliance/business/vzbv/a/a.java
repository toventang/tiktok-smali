package com.ss.android.ugc.aweme.compliance.business.vzbv.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a {
    static {
        Covode.recordClassIndex(47780);
    }

    public static void a(String str) {
        r.a(str, new d().a("confirm_content", "go_private").a("cancel_content", "skip").a("button_design", "left_right").f66730a);
    }

    public static void a(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "account_privacy_show";
        } else {
            str2 = "account_privacy_confirm";
        }
        r.a(str2, new d().a("is_register", !z ? 1 : 0).f66730a);
    }

    public static void b(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "force_account_privacy_show";
        } else {
            str2 = "force_account_privacy_confirm";
        }
        r.a(str2, new d().a("is_register", !z ? 1 : 0).f66730a);
    }
}
