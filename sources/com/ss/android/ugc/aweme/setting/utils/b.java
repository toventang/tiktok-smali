package com.ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import android.net.Uri;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.c.a;
import com.bytedance.router.SmartRouter;
import h.f.b.l;
import h.m.p;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f123033a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(80791);
    }

    public static final void a(Context context, String str, Map<String, String> map) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        String str3 = "";
        l.d(context, str3);
        l.d(str, str3);
        l.d(map, str3);
        String str4 = map.get("anchor_type");
        String str5 = map.get("shoot_way");
        String str6 = map.get("creation_id");
        StringBuilder sb = new StringBuilder(str);
        if (str4 == null) {
            String str7 = map.get("title");
            String str8 = map.get("close");
            if (str8 == null || str8.length() == 0 || p.a(str8, "true", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str9 = map.get("hide_nav_bar");
            if (str9 == null || str9.length() == 0 || p.a(str9, "true", true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean a2 = p.a(map.get("back"), "true", true);
            boolean a3 = p.a(map.get("addButton"), "true", true);
            Uri parse = Uri.parse(str);
            l.b(parse, str3);
            if (parse.getQuery() != null) {
                str2 = str + '&';
            } else {
                str2 = str + '?';
            }
            sb = new StringBuilder(str2).append("addButton=".concat(String.valueOf(a3))).append("&back=".concat(String.valueOf(a2))).append("&close=".concat(String.valueOf(z2)));
            l.b(sb, str3);
            if (!(str7 == null || str7.length() == 0)) {
                sb.append("&title=".concat(String.valueOf(str7)));
            }
            if (!(str5 == null || str5.length() == 0)) {
                sb.append("&shoot_way=".concat(String.valueOf(str5)));
            }
            if (!(str6 == null || str6.length() == 0)) {
                sb.append("&creation_id=".concat(String.valueOf(str6)));
            }
            if (z3) {
                sb.append("&hide_nav_bar=1&status_bar_height=" + n.c(context, (float) a.a(context)));
            } else {
                sb.append("&hide_nav_bar=0&status_bar_height=0");
            }
            str4 = "Wiki";
        }
        boolean a4 = p.a(map.get("show_keyboard"), "true", true);
        String str10 = map.get("host_filter");
        if (str10 != null && p.a(str10, "true", true)) {
            Uri parse2 = Uri.parse(str);
            l.b(parse2, str3);
            String host = parse2.getHost();
            if (host != null) {
                str3 = host;
            }
        }
        String str11 = map.get("disable_app_link");
        if (str11 == null || str11.length() == 0 || p.a(map.get("disable_app_link"), "true", true)) {
            z = true;
        } else {
            z = false;
        }
        SmartRouter.buildRoute(context, "//wiki").withParam("url", sb.toString()).withParam("shoot_way", str5).withParam("creation_id", str6).withParam("show_keyboard", a4).withParam("anchor_type", str4).withParam("author_id", map.get("author_id")).withParam("group_id", map.get("group_id")).withParam("enter_from", map.get("enter_from")).withParam("language", map.get("language")).withParam("wiki_entry", map.get("wiki_entry")).withParam("anchor_entry", map.get("anchor_entry")).withParam("host_filter", str3).withParam("disable_app_link", z).open();
    }
}
