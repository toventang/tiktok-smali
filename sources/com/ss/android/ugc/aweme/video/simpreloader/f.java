package com.ss.android.ugc.aweme.video.simpreloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.c;
import com.ss.android.ugc.aweme.video.preload.api.g;
import org.json.JSONObject;

public final class f implements g {
    static {
        Covode.recordClassIndex(94202);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.g
    public final boolean b() {
        return c.a();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.g
    public final boolean a() {
        return c.b();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.g
    public final JSONObject a(JSONObject jSONObject) {
        return com.ss.android.ugc.aweme.video.util.c.a(jSONObject);
    }
}
