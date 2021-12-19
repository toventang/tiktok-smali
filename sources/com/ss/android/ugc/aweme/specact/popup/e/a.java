package com.ss.android.ugc.aweme.specact.popup.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134641a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(87966);
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str) || (!p.b(str, "http", false) && !p.b(str, "https", false))) {
            return false;
        }
        return true;
    }

    public static void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        if (a(str)) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        } else {
            SmartRouter.buildRoute(context, str).open();
        }
    }

    public static String a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (p.a((CharSequence) str, str2 + '=', 0, false, 6) != -1) {
            return b(str, str2, str3);
        }
        g gVar = new g(str);
        gVar.a(str2, str3);
        String a2 = gVar.a();
        l.b(a2, "");
        return a2;
    }

    private static String b(String str, String str2, String str3) {
        boolean z;
        String str4;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        try {
            int a2 = p.a((CharSequence) str, str2 + '=', 0, false, 6);
            if (a2 != -1) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    String substring = str.substring(0, a2);
                    l.b(substring, "");
                    sb.append(substring).append(str2 + '=').append(str3);
                    int a3 = p.a((CharSequence) str, "&", a2, false, 4);
                    if (a3 != -1) {
                        String substring2 = str.substring(a3);
                        l.b(substring2, "");
                        sb.append(substring2);
                    }
                    str4 = sb.toString();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str4 = str;
            }
            l.b(str4, "");
            return str4;
        } catch (StringIndexOutOfBoundsException unused) {
            return str;
        }
    }
}
