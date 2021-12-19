package com.ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.m.p;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final ai f74733a = new ai();

    private ai() {
    }

    static {
        Covode.recordClassIndex(46091);
    }

    public static final void a(String str) {
        int a2;
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (TextUtils.equals(parse.getHost(), "stickers") && (a2 = p.a((CharSequence) str, "/") + 1) < str.length()) {
                String substring = str.substring(a2);
                l.b(substring, "");
                r.a("enter_prop_detail", new d().a("enter_from", "draw_ad").a("prop_id", substring).f66730a);
            }
        }
    }
}
