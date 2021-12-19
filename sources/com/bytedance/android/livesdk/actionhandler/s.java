package com.bytedance.android.livesdk.actionhandler;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.n;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.a;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.Objects;

public final class s implements f {
    static {
        Covode.recordClassIndex(7567);
    }

    private static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (m.a(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        String queryParameter2 = uri.getQueryParameter("status_bar_height");
        if (!m.a(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean canHandle(Uri uri) {
        if (TextUtils.equals("webcast_webview", uri.getHost()) && !TextUtils.equals("1", uri.getQueryParameter("use_new_container"))) {
            return true;
        }
        if (TextUtils.equals("webcast_lynxview", uri.getHost()) || !TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri) {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        a a2;
        Activity activity;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Activity activity2;
        String a3 = a(uri);
        if (m.a(a3)) {
            return false;
        }
        String a4 = a(uri);
        String str4 = "";
        if (!m.a(a4)) {
            String queryParameter = uri.getQueryParameter(StringSet.type);
            if (queryParameter == null) {
                queryParameter = str4;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != 106852524) {
                if (hashCode == 110066619 && !queryParameter.equals("fullscreen")) {
                }
            } else if (queryParameter.equals("popup")) {
                if (TextUtils.equals("bottom", uri.getQueryParameter("gravity"))) {
                    if (a(uri, "disable_mask_click_close", 0) == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    d.b a5 = e.a(a4).a(a(uri, "radius", 8), a(uri, "radius", 8), 0, 0);
                    a5.f14302c = a(uri, "height", 400);
                    a5.f14301b = (int) y.e(y.c());
                    a5.f14309j = 80;
                    a5.x = uri.getQueryParameter("title");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_bar")) || "1".equals(uri.getQueryParameter("show_title_bar"))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    a5.y = z8;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_share")) || "1".equals(uri.getQueryParameter("show_title_share"))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a5.z = z9;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("title_bar_share_add_report_action")) || "1".equals(uri.getQueryParameter("title_bar_share_add_report_action"))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a5.A = z10;
                    a5.B = uri.getQueryParameter("report_schema");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_close")) || "1".equals(uri.getQueryParameter("show_title_close"))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a5.C = z11;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("use_page_back")) || "1".equalsIgnoreCase(uri.getQueryParameter("use_page_back"))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a5.r = z12;
                    d.b b2 = a5.b(uri.getQueryParameter("popup_enter_type"));
                    if (a(uri, "show_dim", -1) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b2.q = z13;
                    d.b a6 = b2.a(uri.getQueryParameter("mask_alpha"));
                    a6.w = z7;
                    if ("1".equals(uri.getQueryParameter("pull_down_close"))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    a6.H = z14;
                    a6.I = n.a(uri, "variable_height", uri.getQueryParameter("variable_height"));
                    a6.E = uri.toString();
                    a2 = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager().a(a6);
                    if (!(context instanceof Activity)) {
                        activity2 = ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getTopActivity();
                    } else {
                        activity2 = context;
                    }
                    androidx.fragment.app.e b3 = com.bytedance.android.live.core.f.a.b(activity2);
                    if (b3 != null) {
                        a.a(b3, a2);
                    }
                } else {
                    if (a(uri, "mask_click_disable", 0) == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d.b a7 = e.a(a4).a(a(uri, "radius", 8));
                    a7.f14302c = a(uri, "height", 400);
                    a7.f14301b = a(uri, "width", 300);
                    a7.w = z2;
                    a7.f14309j = 17;
                    a7.x = uri.getQueryParameter("title");
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_bar")) || "1".equals(uri.getQueryParameter("show_title_bar"))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a7.y = z3;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("show_title_close")) || "1".equals(uri.getQueryParameter("show_title_close"))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    a7.C = z4;
                    if ("true".equalsIgnoreCase(uri.getQueryParameter("use_page_back")) || "1".equalsIgnoreCase(uri.getQueryParameter("use_page_back"))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    a7.r = z5;
                    if (a(uri, "show_dim", -1) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    a7.q = z6;
                    d.b a8 = a7.b(uri.getQueryParameter("popup_enter_type")).a(uri.getQueryParameter("mask_alpha"));
                    a8.E = uri.toString();
                    String queryParameter2 = uri.getQueryParameter("close_button");
                    if (!m.a(queryParameter2) && "true".equals(queryParameter2)) {
                        a8.f14312m = true;
                    }
                    String queryParameter3 = uri.getQueryParameter("disable_background");
                    if (!m.a(queryParameter3) && "true".equals(queryParameter3)) {
                        a8.w = false;
                    }
                    a2 = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager().a(a8);
                    if (!(context instanceof Activity)) {
                        activity = ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getTopActivity();
                    } else {
                        activity = context;
                    }
                    androidx.fragment.app.e b4 = com.bytedance.android.live.core.f.a.b(activity);
                    if (b4 != null) {
                        a.a(b4, a2);
                    }
                }
                if (a2 != null) {
                    return true;
                }
            }
        }
        d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
        d.a b5 = e.b(a3);
        if (a(uri, "hide_nav_bar", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        b5.f14292c = z;
        if (uri != null) {
            str = uri.getQueryParameter("status_bar_color");
        } else {
            str = str4;
        }
        b5.f14295f = str;
        if (uri != null) {
            str2 = uri.getQueryParameter("status_bar_bg_color");
        } else {
            str2 = str4;
        }
        b5.f14296g = str2;
        boolean z15 = false;
        if (a(uri, "hide_status_bar", 0) == 1) {
            z15 = true;
        }
        b5.f14293d = z15;
        if (uri != null) {
            str3 = uri.getQueryParameter("soft_input_mode");
        } else {
            str3 = str4;
        }
        b5.f14299j = str3;
        if (uri != null) {
            str4 = uri.toString();
        }
        b5.f14297h = str4;
        webViewManager.a(context, b5);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }

    private static int a(Uri uri, String str, int i2) {
        try {
            return Integer.parseInt((String) Objects.requireNonNull(uri.getQueryParameter(str)));
        } catch (Exception unused) {
            return i2;
        }
    }
}
