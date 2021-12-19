package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;
import h.m.p;

public final class h {

    /* renamed from: a */
    public static final String[] f102208a = new String[0];

    /* renamed from: b */
    public static final h f102209b = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(65403);
    }

    public static String[] a() {
        SettingsManager a2 = SettingsManager.a();
        String[] strArr = f102208a;
        String[] strArr2 = (String[]) a2.a("tt_dm_illegal_schema", String[].class, strArr);
        return strArr2 == null ? strArr : strArr2;
    }

    public static boolean b(String str, String[] strArr) {
        Uri parse;
        l.d(strArr, "");
        if (strArr.length == 0 || str == null || str.length() == 0 || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String scheme = parse.getScheme();
        if (scheme == null || scheme.length() == 0) {
            return true;
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str2 = strArr[i2];
            if (!p.a(scheme, str2, true)) {
                i2++;
            } else if (str2 != null) {
                return true;
            }
        }
        return false;
    }

    public static String a(String str, String[] strArr) {
        boolean z;
        boolean z2;
        l.d(strArr, "");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.length() != 0) {
                    z3 = false;
                }
            }
            if (z3) {
                return str;
            }
            return parse.buildUpon().scheme("tiktok").build().toString();
        } catch (Exception e2) {
            a.a("MessagingIllegalSchemeSetting", "replaceIllegalScheme failed ".concat(String.valueOf(str)), e2);
            return str;
        }
    }
}
