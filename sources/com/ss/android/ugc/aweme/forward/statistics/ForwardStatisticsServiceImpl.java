package com.ss.android.ugc.aweme.forward.statistics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.b;
import java.util.HashMap;
import org.json.JSONObject;

public class ForwardStatisticsServiceImpl implements IForwardStatisticsService {
    static {
        Covode.recordClassIndex(61326);
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final String a() {
        f.j();
        return "list";
    }

    public static IForwardStatisticsService b() {
        MethodCollector.i(2196);
        Object a2 = b.a(IForwardStatisticsService.class, false);
        if (a2 != null) {
            IForwardStatisticsService iForwardStatisticsService = (IForwardStatisticsService) a2;
            MethodCollector.o(2196);
            return iForwardStatisticsService;
        }
        if (b.br == null) {
            synchronized (IForwardStatisticsService.class) {
                try {
                    if (b.br == null) {
                        b.br = new ForwardStatisticsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2196);
                    throw th;
                }
            }
        }
        ForwardStatisticsServiceImpl forwardStatisticsServiceImpl = (ForwardStatisticsServiceImpl) b.br;
        MethodCollector.o(2196);
        return forwardStatisticsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final HashMap<String, String> a(Aweme aweme, String str) {
        return a.a(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final HashMap<String, String> a(String str, Aweme aweme) {
        return a.a(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final c a(c cVar, Aweme aweme, String str) {
        return a.a(cVar, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final JSONObject a(JSONObject jSONObject, Aweme aweme, String str) {
        return a.a(c.a(jSONObject), aweme, str).a();
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final c b(c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new c();
        }
        if (aweme != null) {
            cVar.a("enter_from", str);
            cVar.a("author_id", aweme.getAuthorUid());
            cVar.a("request_id", ac.b(aweme));
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final void a(String str, Aweme aweme, String str2, String str3) {
        d dVar = new d();
        dVar.a((HashMap<? extends String, ? extends String>) a.a(str, aweme)).a((HashMap<? extends String, ? extends String>) a.a(aweme, str2)).a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            dVar.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("click_comment_and_repost", dVar.f66730a);
    }
}
