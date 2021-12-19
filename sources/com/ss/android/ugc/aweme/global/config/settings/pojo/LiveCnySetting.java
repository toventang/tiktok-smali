package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LiveCnySetting {
    @c(a = "force_update_room")
    private Boolean forceUpdateRoom = true;

    static {
        Covode.recordClassIndex(63055);
    }

    public Boolean getForceUpdateRoom() {
        Boolean bool = this.forceUpdateRoom;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
