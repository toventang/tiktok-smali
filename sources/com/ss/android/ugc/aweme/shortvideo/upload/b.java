package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(86484);
    }

    private static final int a(g gVar) {
        if (!gVar.w) {
            return -1;
        }
        if (c.b(i.f115645a)) {
            return 1;
        }
        return 0;
    }

    public static final int a(g gVar, String str) {
        l.d(gVar, "");
        l.d(str, "");
        int a2 = a(gVar);
        q.a("TTUploader " + str + " checkNetState: " + a2);
        return a2;
    }
}
