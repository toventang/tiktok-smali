package com.bytedance.sdk.xbridge.a.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.c;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.d.e;
import h.f.b.l;

public final class b implements c {
    static {
        Covode.recordClassIndex(26832);
    }

    @Override // com.bytedance.sdk.xbridge.a.b.c
    public final Boolean a(a aVar) {
        l.c(aVar, "");
        Uri parse = Uri.parse(aVar.f43929c);
        l.a((Object) parse, "");
        String host = parse.getHost();
        String str = aVar.f43933g;
        String str2 = aVar.f43928b;
        boolean z = false;
        if (host == null) {
            c.a a2 = com.bytedance.sdk.xbridge.a.b.a(str, str2);
            if (a2 == null) {
                return null;
            }
            if (a2 == c.a.PUBLIC) {
                z = true;
            }
            e.c("MagpiePermission", "EmptyHostAuthFilter doAuthFilter result = ".concat(String.valueOf(z)));
            return Boolean.valueOf(z);
        }
        e.c("MagpiePermission", "EmptyHostAuthFilter doAuthFilter result = false");
        return false;
    }
}
