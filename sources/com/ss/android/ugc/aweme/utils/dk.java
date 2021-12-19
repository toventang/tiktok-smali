package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import java.util.regex.Pattern;

public final class dk {
    static {
        Covode.recordClassIndex(93436);
    }

    private static boolean a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    private static boolean b(String str) {
        if (str == null || !str.toLowerCase().contains("tiktok")) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, Context context) {
        if (str == null || str.length() < 2) {
            new a(context).a(R.string.fm3).a();
            return false;
        } else if (str.length() > 24) {
            new a(context).a(R.string.fm4).a();
            return false;
        } else if (!str.matches("[0-9A-Za-z_.]*")) {
            new a(context).a(R.string.fm0).a();
            return false;
        } else if (!a(str)) {
            return true;
        } else {
            new a(context).a(R.string.fm1).a();
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3, Context context) {
        if (b(str3) || TextUtils.equals(str, "2062")) {
            new a(context).a(R.string.cci).a();
            return false;
        } else if (TextUtils.equals(str, "2064")) {
            new a(context).a(R.string.fm2).a();
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            new a(context).a(str2).a();
            return false;
        }
    }
}
