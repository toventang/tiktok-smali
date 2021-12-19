package com.ss.android.ugc.aweme.publish.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.publish.m;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.tools.f.b;

final class l implements m {
    static {
        Covode.recordClassIndex(77184);
    }

    @Override // com.ss.android.ugc.aweme.publish.m
    public final void a(Context context, String str) {
        h.f.b.l.d(context, "");
        if (!com.ss.android.ugc.aweme.settings.m.a()) {
            if (str == null || str.length() == 0) {
                str = "unknown";
            }
            r.a("publish_service_cancel", new b().a("invoke_type", "cancelSynthesis").a("scene", str).f149193a);
            h.c(b.a.a().a(str).a());
        }
    }
}
