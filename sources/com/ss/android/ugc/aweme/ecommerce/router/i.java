package com.ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class i {
    static {
        Covode.recordClassIndex(54705);
    }

    public static final <T extends m> T a(h hVar, Uri uri) {
        l.d(hVar, "");
        T t = (T) hVar.a(uri);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T");
        return t;
    }
}
