package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import h.f.b.l;
import h.m.p;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f66689a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(41058);
    }

    public static boolean a(String str) {
        if (m.a(str)) {
            return false;
        }
        return l.a((Object) "1", (Object) str);
    }

    public static boolean b(String str) {
        l.d(str, "");
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || !a(parse.getQueryParameter("hide_more"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static final Intent a(Context context, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (uri == null || context == null) {
            return null;
        }
        try {
            Intent intent = new Intent();
            try {
                intent.setClass(context, CrossPlatformActivity.class);
                String queryParameter = uri.getQueryParameter("url");
                if (queryParameter == null) {
                    return null;
                }
                if (queryParameter.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                boolean a2 = a(uri.getQueryParameter("rotate"));
                boolean a3 = a(uri.getQueryParameter("no_hw"));
                boolean a4 = a(uri.getQueryParameter("hide_more"));
                boolean a5 = a(uri.getQueryParameter("hide_bar"));
                boolean a6 = a(uri.getQueryParameter("hide_status_bar"));
                boolean a7 = a(uri.getQueryParameter("hide_nav_bar"));
                boolean a8 = a(uri.getQueryParameter("hide_more"));
                if (a5 || a7) {
                    z2 = true;
                    intent.putExtra("hide_nav_bar", true);
                } else {
                    z2 = true;
                }
                if (a6) {
                    intent.putExtra("hide_status_bar", z2);
                }
                String queryParameter2 = uri.getQueryParameter("ad_id");
                if (!m.a(queryParameter2)) {
                    if (queryParameter2 == null) {
                        try {
                            l.b();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    l.b(intent.putExtra("ad_id", Long.parseLong(queryParameter2)), "");
                }
                String queryParameter3 = uri.getQueryParameter("adinfojson");
                if (!m.a(queryParameter3)) {
                    JSONObject jSONObject = new JSONObject(queryParameter3);
                    String string = jSONObject.getString("cid");
                    String string2 = jSONObject.getString("log_extra");
                    if (!m.a(string)) {
                        intent.putExtra("ad_id", Long.parseLong(string));
                    }
                    if (!m.a(string2)) {
                        intent.putExtra("bundle_download_app_log_extra", string2);
                    }
                }
                if (p.b(queryParameter, "http://", true) || p.b(queryParameter, "https://", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    queryParameter = URLDecoder.decode(queryParameter, "UTF-8");
                }
                intent.setData(Uri.parse(queryParameter));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (a2) {
                    intent.putExtra("orientation", 0);
                }
                if (a3) {
                    intent.putExtra("bundle_no_hw_acceleration", a3);
                }
                if (a4) {
                    intent.putExtra("hide_more", a4);
                }
                if (a8) {
                    intent.putExtra("hide_more", a8);
                }
                String queryParameter4 = uri.getQueryParameter("title");
                if (m.a(queryParameter4)) {
                    queryParameter4 = Uri.parse(queryParameter).getQueryParameter("title");
                }
                String queryParameter5 = uri.getQueryParameter("title_extra");
                if (!m.a(queryParameter5)) {
                    queryParameter4 = queryParameter5;
                }
                if (!m.a(queryParameter4)) {
                    intent.putExtra("title", queryParameter4);
                    z4 = true;
                } else {
                    intent.putExtra("title", " ");
                    z4 = true;
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter6 = uri.getQueryParameter("gd_label");
                if (!m.a(queryParameter6)) {
                    intent.putExtra("gd_label", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("gd_ext_json");
                if (!m.a(queryParameter7)) {
                    intent.putExtra("gd_ext_json", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("webview_track_key");
                if (!m.a(queryParameter8)) {
                    intent.putExtra("webview_track_key", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("wap_headers");
                if (!m.a(queryParameter9)) {
                    intent.putExtra("wap_headers", queryParameter9);
                }
                intent.putExtra("bundle_auto_play_audio", a(uri.getQueryParameter("auto_play_bgm")));
                if (a(uri.getQueryParameter("hide_loading"))) {
                    z4 = false;
                }
                intent.putExtra("show_load_dialog", z4);
                String queryParameter10 = uri.getQueryParameter("status_bar_color");
                if (!m.a(queryParameter10)) {
                    intent.putExtra("status_bar_color", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("load_no_cache");
                if (!m.a(queryParameter11)) {
                    intent.putExtra("load_no_cache", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("add_common");
                if (!m.a(queryParameter12)) {
                    intent.putExtra("add_common", queryParameter12);
                }
                return intent;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
