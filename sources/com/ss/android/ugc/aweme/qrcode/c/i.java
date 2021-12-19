package com.ss.android.ugc.aweme.qrcode.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.c.a;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class i extends a {
    static {
        Covode.recordClassIndex(77780);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(a.AbstractC3089a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        l.d(str, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        String host = parse.getHost();
        if (!TextUtils.isEmpty(host) && com.ss.android.ugc.aweme.qrcode.api.a.a(host)) {
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() > 1 && l.a((Object) pathSegments.get(0), (Object) "v")) {
                a.AbstractC3089a aVar = this.f119721b;
                String str2 = pathSegments.get(1);
                l.b(str2, "");
                return aVar.a(1, (String) n.h((List) p.b(str2, new String[]{"."})), str, null);
            } else if (pathSegments.size() >= 4 && l.a((Object) pathSegments.get(2), (Object) "video")) {
                return this.f119721b.a(1, pathSegments.get(3), str, null);
            }
        }
        return false;
    }
}
