package com.ss.android.ugc.aweme.shortvideo.util;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.publish.f.h;
import h.f.b.l;
import java.util.Arrays;
import java.util.Locale;

public final class bs {
    static {
        Covode.recordClassIndex(86636);
    }

    public static final g b(h hVar) {
        if (!(hVar instanceof d)) {
            return null;
        }
        return ((d) hVar).f118722a;
    }

    public static final String a(h hVar) {
        g b2 = b(hVar);
        if (b2 == null) {
            return "";
        }
        String a2 = a.a(Locale.US, "https:%d ttnet:%d", Arrays.copyOf(new Object[]{Integer.valueOf(b2.f118759j), Integer.valueOf(b2.t)}, 2));
        l.b(a2, "");
        return a2;
    }
}
