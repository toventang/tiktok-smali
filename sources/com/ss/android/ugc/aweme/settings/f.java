package com.ss.android.ugc.aweme.settings;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.b.a;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.settings.e;
import h.a.n;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f123106a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(80852);
    }

    public static int a() {
        e.a aVar = e.f123102b;
        if (aVar != null) {
            return aVar.f123105b;
        }
        return LiveFeedRefreshTimeSetting.DEFAULT;
    }

    public static String a(String str, String str2) {
        String d2 = x.d();
        if (d2 == null) {
            return null;
        }
        Uri parse = Uri.parse(d2);
        if (str == null) {
            l.b(parse, "");
            str = a.a(parse, "enter_from");
        }
        l.b(parse, "");
        return a.a(parse, n.b("enter_from", "enter_method")).buildUpon().appendQueryParameter("enter_from", str).appendQueryParameter("enter_method", str2).build().toString();
    }
}
