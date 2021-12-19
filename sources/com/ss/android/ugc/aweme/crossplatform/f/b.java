package com.ss.android.ugc.aweme.crossplatform.f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f78847a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(48913);
    }

    public static final boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        l.b(parse, "");
        String scheme = parse.getScheme();
        l.b(parse2, "");
        if (!(!l.a((Object) scheme, (Object) parse2.getScheme())) && !(!l.a((Object) parse.getHost(), (Object) parse2.getHost())) && !(!l.a((Object) parse.getPath(), (Object) parse2.getPath()))) {
            return true;
        }
        return false;
    }
}
