package com.ss.android.ugc.aweme.fe.method;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.el;
import h.a.n;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f91314a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f91315b = n.b("status_bar_height", StringSet.type, "gravity", "status_bar_color", "radius", "height", "width", "hide_nav_bar", "hide_status", "close_button", "use_page_back", "disable_background", "show_title_bar", "title", "show_title_close", "show_title_share", "show_dim", "mask_alpha", "soft_input_mode", "use_new_container", "disable_back_press", "show_closeall");

    private l() {
    }

    static {
        Covode.recordClassIndex(57473);
    }

    public static final boolean a(String str) {
        return c(str);
    }

    private static boolean a(Uri uri) {
        if (TextUtils.equals("webcast_webview", uri.getHost()) || b(uri)) {
            return true;
        }
        return false;
    }

    private static boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast");
    }

    public static final boolean b(String str) {
        if (str == null) {
            return false;
        }
        try {
            ILiveOuterService s = LiveOuterService.s();
            h.f.b.l.b(s, "");
            if (s.l().b()) {
                ILiveOuterService s2 = LiveOuterService.s();
                h.f.b.l.b(s2, "");
                if (s2.d().a(d.a(), Uri.parse(str))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            b.a(th);
        }
        if (!el.a(str)) {
            return false;
        }
        ILiveOuterService s3 = LiveOuterService.s();
        h.f.b.l.b(s3, "");
        s3.d().f(str);
        return true;
    }

    public static final boolean c(String str) {
        if (str == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        h.f.b.l.b(parse, "");
        if (!a(parse)) {
            return b(str);
        }
        Uri parse2 = Uri.parse(str);
        String decode = URLDecoder.decode(parse2.getQueryParameter("url"));
        StringBuilder sb = new StringBuilder();
        Uri parse3 = Uri.parse(decode);
        Iterator<T> it = f91315b.iterator();
        while (it.hasNext()) {
            a(it.next(), sb, parse3, parse2);
        }
        k.a(decode, sb.toString());
        return true;
    }

    private static void a(String str, StringBuilder sb, Uri uri, Uri uri2) {
        String queryParameter;
        String queryParameter2;
        if (uri != null && (queryParameter2 = uri.getQueryParameter(str)) != null) {
            sb.append("&" + str + '=' + queryParameter2);
        } else if (uri2 != null && (queryParameter = uri2.getQueryParameter(str)) != null) {
            sb.append("&" + str + '=' + queryParameter);
        }
    }
}
