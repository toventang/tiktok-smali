package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public abstract class ImShareContactStruct implements Serializable {
    private UrlModel avatar = new UrlModel();
    private String conversationId = "";

    static {
        Covode.recordClassIndex(84455);
    }

    public abstract String getDisplayName();

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final void setAvatar(UrlModel urlModel) {
        l.d(urlModel, "");
        this.avatar = urlModel;
    }

    public final void setConversationId(String str) {
        l.d(str, "");
        this.conversationId = str;
    }
}
