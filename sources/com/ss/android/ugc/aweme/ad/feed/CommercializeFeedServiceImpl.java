package com.ss.android.ugc.aweme.ad.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.b;
import h.f.b.l;
import org.json.JSONObject;

public final class CommercializeFeedServiceImpl implements ICommercializeFeedService {
    static {
        Covode.recordClassIndex(40445);
    }

    public static ICommercializeFeedService a() {
        MethodCollector.i(347);
        Object a2 = b.a(ICommercializeFeedService.class, false);
        if (a2 != null) {
            ICommercializeFeedService iCommercializeFeedService = (ICommercializeFeedService) a2;
            MethodCollector.o(347);
            return iCommercializeFeedService;
        }
        if (b.I == null) {
            synchronized (ICommercializeFeedService.class) {
                try {
                    if (b.I == null) {
                        b.I = new CommercializeFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(347);
                    throw th;
                }
            }
        }
        CommercializeFeedServiceImpl commercializeFeedServiceImpl = (CommercializeFeedServiceImpl) b.I;
        MethodCollector.o(347);
        return commercializeFeedServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final void a(boolean z, String str) {
        String str2;
        l.d(str, "");
        l.d(str, "");
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.getInt("CostType") == 3) {
            String string = jSONObject.getString("CreativeId");
            String string2 = jSONObject.getString("LogExtra");
            if (z) {
                str2 = "ad_message_show";
            } else {
                str2 = "ad_message_click";
            }
            l.b(string, "");
            a.a("message_ad", str2, string, string2, null).b("refer", "countdown_push").a("message_type", "2").b();
        }
    }
}
