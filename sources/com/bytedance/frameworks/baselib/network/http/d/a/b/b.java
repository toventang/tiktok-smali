package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.f;

public final class b extends f {
    static {
        Covode.recordClassIndex(17060);
    }

    public b() {
        super(f.a.UNKNOWN_DISPATCH_STRATEGY);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.f
    public final String a(Uri uri) {
        return uri.toString();
    }
}
