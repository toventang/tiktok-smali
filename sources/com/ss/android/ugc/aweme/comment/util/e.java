package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.d.a.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f72837a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(44865);
    }

    public static final void a(String str, long j2) {
        if (str != null) {
            AwemeService.b().a(str, j2);
            c.a(new ag(14, str));
        }
    }
}
