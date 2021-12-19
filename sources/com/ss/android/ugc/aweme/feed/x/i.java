package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.feed.helper.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public final class i {
    static {
        Covode.recordClassIndex(60376);
    }

    public static JSONObject a(Aweme aweme, int i2, String str, String str2) {
        return e.a(RequestIdService.a().b(aweme, i2), str, str2, aweme);
    }
}
