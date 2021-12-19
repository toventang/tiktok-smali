package com.bytedance.android.livesdk.container.config.live;

import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LivePageConfig extends LiveHybridConfig {
    @a(a = "soft_input_mode")
    private String softInputMode = "adjustNothing";

    static {
        Covode.recordClassIndex(9299);
    }

    public final String getSoftInputMode() {
        return this.softInputMode;
    }

    public final void setSoftInputMode(String str) {
        l.d(str, "");
        this.softInputMode = str;
    }
}
