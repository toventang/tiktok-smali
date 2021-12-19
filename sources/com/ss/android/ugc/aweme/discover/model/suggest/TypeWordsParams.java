package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class TypeWordsParams implements Serializable {
    @c(a = "channel_id")
    private String channelId;

    static {
        Covode.recordClassIndex(50993);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final void setChannelId(String str) {
        this.channelId = str;
    }
}
