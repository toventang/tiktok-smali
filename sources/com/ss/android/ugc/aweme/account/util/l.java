package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.ss.android.ugc.aweme.a;
import com.zhiliaoapp.musically.R;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f65491a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(40276);
    }

    private static boolean a(Integer num) {
        if (num == null || num.intValue() < 0) {
            return true;
        }
        return false;
    }

    public static final String a(b bVar) {
        Integer num;
        String str = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f43073d);
            str = bVar.f43075f;
        } else {
            num = null;
        }
        return a(num, str);
    }

    public static final String a(Integer num, String str) {
        if (!a(num) && str != null && str.length() != 0) {
            return str;
        }
        if (a.f62426a == null) {
            return "Sorry, error occurred";
        }
        String string = a.f62426a.getString(R.string.de8);
        h.f.b.l.b(string, "");
        return string;
    }
}
