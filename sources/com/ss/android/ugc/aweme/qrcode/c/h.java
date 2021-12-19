package com.ss.android.ugc.aweme.qrcode.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.c;
import com.ss.android.ugc.aweme.qrcode.c.a;
import java.util.Collection;
import java.util.List;

public final class h extends a {

    /* renamed from: c  reason: collision with root package name */
    private Context f119725c;

    static {
        Covode.recordClassIndex(77779);
    }

    public h(a.AbstractC3089a aVar, Context context) {
        super(aVar);
        this.f119725c = context;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (!TextUtils.isEmpty(host) && com.ss.android.ugc.aweme.qrcode.api.a.a(host)) {
            List<String> pathSegments = parse.getPathSegments();
            if (!b.a((Collection) pathSegments) && pathSegments.size() >= 3 && TextUtils.equals("share", pathSegments.get(0))) {
                String str2 = pathSegments.get(2);
                int a2 = c.a(pathSegments.get(1));
                this.f119720a = c.b(a2, str2);
                return this.f119721b.a(a2, str2, str, null);
            }
        }
        return false;
    }
}
