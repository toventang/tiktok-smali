package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.tux.h.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.tasks.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.miniapp.utils.a;
import com.zhiliaoapp.musically.R;

public final class w extends n {
    static {
        Covode.recordClassIndex(46756);
    }

    public static boolean a(int i2) {
        return i2 == 11 || i2 == 14 || i2 == 12 || i2 == 13 || i2 == 15 || i2 == 20 || i2 == 19 || i2 == 21;
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    private static boolean a(Aweme aweme, int i2) {
        if (TextUtils.equals(aweme.getAwemeRawAd().getType(), "app") || !a(i2)) {
            return false;
        }
        return true;
    }

    public static boolean e(Context context, Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return c(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    private static boolean b(Aweme aweme, int i2) {
        if (!b.J(aweme)) {
            return false;
        }
        if (i2 == 3 || i2 == 11 || i2 == 14 || i2 == 20 || i2 == 12 || i2 == 2 || i2 == 1 || i2 == 35 || i2 == 4) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !path.endsWith(".apk")) {
            return false;
        }
        String string = context.getString(R.string.rm);
        Activity a2 = c.a(context);
        if (a2 == null) {
            return true;
        }
        new com.bytedance.tux.g.b(a2).a(string).b();
        return true;
    }

    public static boolean d(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (!b.A(aweme)) {
            return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, aweme.getAwemeRawAd().getPackageName());
        }
        Activity a2 = c.a(context);
        if (a2 == null) {
            return true;
        }
        new com.bytedance.tux.g.b(a2).e(R.string.of).b();
        return true;
    }

    public static boolean d(Context context, String str) {
        if (!str.contains("aweme/detaillist") || b()) {
            return true;
        }
        Activity a2 = c.a(context);
        if (a2 == null) {
            return false;
        }
        new com.bytedance.tux.g.b(a2).e(R.string.de8).b();
        return false;
    }

    private static void h(Context context, Aweme aweme, int i2) {
        IAdSceneService f2 = AdSceneServiceImpl.f();
        if (f2 != null) {
            f2.c().a(aweme, context, i2);
        }
        if (i2 == 2 && com.ss.android.ugc.aweme.commercialize.tasks.b.a()) {
            d.a(context, aweme, aweme.getAwemeRawAd().getOpenUrl(), i2);
        } else if ((b.aN(aweme) && n.a(context, aweme)) || a.a(context, aweme)) {
        } else {
            if (!b.av(aweme) || !a(context, i2)) {
                d(context, aweme);
            }
        }
    }

    static boolean g(Context context, Aweme aweme, int i2) {
        if (!aweme.isAd() || !b.s(aweme)) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return false;
        }
        if ((i2 == 1 || i2 == 2) && b.v(aweme)) {
            Activity a2 = c.a(context);
            if (a2 != null) {
                new com.bytedance.tux.g.b(a2).e(R.string.h3n).b();
            }
            return true;
        } else if (!TextUtils.equals(type, "app") && (i2 == 1 || i2 == 18 || i2 == 4 || i2 == 35 || i2 == 5 || i2 == 36 || i2 == 7 || i2 == 37 || i2 == 38)) {
            return b(context, aweme, i2);
        } else {
            if (a(aweme, i2) || b(aweme, i2)) {
                return b(context, aweme, i2);
            }
            type.hashCode();
            switch (type.hashCode()) {
                case -1354573786:
                    if (type.equals("coupon")) {
                        return c(context, aweme, i2);
                    }
                    break;
                case 96801:
                    if (type.equals("app")) {
                        h(context, aweme, i2);
                        return false;
                    }
                    break;
                case 117588:
                    if (type.equals("web")) {
                        return b(context, aweme, i2);
                    }
                    break;
                case 3148996:
                    if (type.equals("form")) {
                        return d(context, aweme, i2);
                    }
                    break;
                case 957829685:
                    if (type.equals("counsel")) {
                        return a(context, aweme, i2);
                    }
                    break;
                case 1893962841:
                    if (type.equals("redpacket")) {
                        return f(context, aweme, i2);
                    }
                    break;
            }
            return false;
        }
    }

    public static boolean a(Context context, Aweme aweme, int i2, com.ss.android.ugc.aweme.commercialize.j.b bVar) {
        if (context == null || aweme == null) {
            return false;
        }
        if (bp.a(context, aweme, i2, new x(context, aweme, i2, bVar))) {
            return true;
        }
        if (!b.aE(aweme)) {
            return g(context, aweme, i2);
        }
        at.a(context, aweme, i2);
        return false;
    }
}
