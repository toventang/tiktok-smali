package com.ss.android.ugc.aweme.forward.statistics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONObject;

public interface IForwardStatisticsService {
    static {
        Covode.recordClassIndex(61327);
    }

    c a(c cVar, Aweme aweme, String str);

    String a();

    HashMap<String, String> a(Aweme aweme, String str);

    HashMap<String, String> a(String str, Aweme aweme);

    JSONObject a(JSONObject jSONObject, Aweme aweme, String str);

    void a(String str, Aweme aweme, String str2, String str3);

    c b(c cVar, Aweme aweme, String str);
}
