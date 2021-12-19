package com.ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.upvote.event.c;
import com.zhiliaoapp.musically.R;

public final class b {
    static {
        Covode.recordClassIndex(47692);
    }

    public static void a(String str, Uri.Builder builder) {
        boolean z;
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (curUser == null || !curUser.isDisciplineMember()) {
            z = false;
        } else {
            z = true;
        }
        Uri parse = Uri.parse(str);
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        if (SharePrefCache.inst().getIsFirstReportVideo().c().booleanValue() && !z) {
            builder.appendQueryParameter("isFirst", "1");
        }
    }

    public static void a(Activity activity, Uri.Builder builder, Bundle bundle) {
        a("https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html", builder);
        Uri build = builder.build();
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", build.toString());
        bundle2.putBoolean("show_load_dialog", false);
        bundle2.putBoolean("hide_nav_bar", true);
        bundle2.putString("status_bar_color", activity.getResources().getString(R.color.nd).replace("#", ""));
        bundle2.putLong("enter_time", System.currentTimeMillis());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        ReportWebPageDialogActivity.a.a(activity, bundle2, build.getQueryParameter("object_id"), build.getQueryParameter("enter_from"));
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme) {
        d a2 = new d().a("author_id", str5).a("object_id", str4).a("object_type", str2).a("enter_from", str).a("enter_method", str7).a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            a2.a("room_id", str6);
        }
        h.a(a2, aweme);
        if (aweme != null) {
            c.a(a2, aweme, str);
        }
        r.a("click_report", a2.f66730a);
    }
}
