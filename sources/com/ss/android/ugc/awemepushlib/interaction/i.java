package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.awemepushlib.c.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    static {
        Covode.recordClassIndex(95104);
    }

    public static boolean a() {
        if (m.a(AppLog.getClientId()) || m.a(a.a())) {
            return false;
        }
        return true;
    }

    public static void a(b bVar, int i2) {
        int i3;
        JSONObject jSONObject = new JSONObject(com.ss.android.ugc.awemepushlib.c.a.a(bVar, i2, com.ss.android.ugc.awemepushlib.f.a.a()));
        try {
            jSONObject.put("real_receive_time", System.currentTimeMillis());
            if (AccountService.a().e().isChildrenMode()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_push_enabled", i3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        r.a("push_receive", jSONObject);
    }

    public static void a(boolean z, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (new JSONObject(str).getInt("IsCommerce") == 1) {
                    CommercializeFeedServiceImpl.a().a(z, str);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, boolean z) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getQueryParameter("gd_label"), "click_push_user")) {
                r.a("follow_recommend", new d().a("enter_from", "push_out_app").a("scene_type", "push").a("action_type", "show").a("to_user_id", parse.getQueryParameter("to_user_id")).a("rule_id", parse.getQueryParameter("rule_id")).a("rec_type", parse.getQueryParameter("rec_type")).a("follow_type", parse.getQueryParameter("follow_type")).a("relation_type", parse.getQueryParameter("relation_type")).f66730a);
            }
            String host = parse.getHost();
            List<String> pathSegments = parse.getPathSegments();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            StringBuilder sb = new StringBuilder("//");
            sb.append(host);
            for (String str3 : pathSegments) {
                if (!TextUtils.isEmpty(str3)) {
                    sb.append("/");
                    try {
                        Long.parseLong(str3);
                        sb.append("xxx");
                    } catch (NumberFormatException unused) {
                        sb.append(str3);
                    }
                }
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                sb.append("?");
                Iterator<String> it = queryParameterNames.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("open_url", sb.toString());
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject.put("is_push", str2);
                o.b("deep_link_collect", "", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(b bVar, boolean z, int i2) {
        String str;
        String str2;
        Map<String, String> a2 = com.ss.android.ugc.awemepushlib.c.a.a(bVar, i2, com.ss.android.ugc.awemepushlib.f.a.a());
        String str3 = "1";
        if (z) {
            str = str3;
        } else {
            str = "0";
        }
        a2.put("has_image", str);
        if (bVar.extra.style == 5) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        a2.put("mediastyle", str2);
        if (TextUtils.isEmpty(bVar.extra.bg_color)) {
            str3 = "0";
        }
        a2.put("colorized", str3);
        r.a("push_show", new JSONObject(a2));
        a(true, bVar.extra.rawExtra);
    }

    public static void a(Context context, String str, long j2, long j3, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            q.a(context, "apn", str, j2, j3, jSONObjectArr[0]);
        } else {
            q.a(context, "apn", str, j2, j3);
        }
    }
}
