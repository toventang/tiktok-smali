package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.component.music.MusicService;
import org.json.JSONObject;

public final class z implements d {
    static {
        Covode.recordClassIndex(94850);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        MusicService.m().j();
    }
}
