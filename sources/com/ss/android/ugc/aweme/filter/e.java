package com.ss.android.ugc.aweme.filter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.internal.j;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.tools.a.a;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.h.a.l;
import com.ss.android.ugc.tools.utils.q;

public final class e implements j {
    static {
        Covode.recordClassIndex(60537);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.j
    public final void a(f fVar, String str, long j2, l lVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(lVar, "");
        g.a().I().a("filter_download_error_rate", 0, new ar().a("tools_use_downloader", Boolean.valueOf(lVar instanceof a)).a("url", str).a("duration", String.valueOf(j2)).a());
        d.a("tool_performance_resource_download", new b().a("resource_type", "color_filter").a("duration", j2).a("status", 0).a("resource_id", fVar.f95550a).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.j
    public final void a(f fVar, String str, long j2, l lVar, Exception exc, Integer num) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(exc, "");
        ap I = g.a().I();
        ar arVar = new ar();
        String b2 = q.b(exc);
        h.f.b.l.b(b2, "");
        I.a("filter_download_error_rate", 1, arVar.a("exception", b2).a("tools_use_downloader", Boolean.valueOf(lVar instanceof a)).a("url", str).a("filter_id", Integer.valueOf(fVar.f95550a)).a("filter_name", fVar.f95552c).a());
        b a2 = new b().a("resource_type", "color_filter").a("duration", j2).a("status", 1).a("resource_id", fVar.f95550a).a("error_domain", EffectPlatformFactory.a().getHosts().get(0)).a("error_code", num);
        String message = exc.getMessage();
        if (message == null) {
            message = "empty_error_msg";
        }
        d.a("tool_performance_resource_download", a2.a("error_msg", message).f149193a);
    }
}
