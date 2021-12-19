package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.e;
import java.io.Serializable;

public final class a extends com.ss.android.ugc.aweme.im.sdk.chat.data.a {
    private Serializable chatExt;
    private IMUser fromUser;
    private e imAdLog;
    private String shareUserId;

    static {
        Covode.recordClassIndex(64614);
    }

    public final Serializable getChatExt() {
        return this.chatExt;
    }

    public final IMUser getFromUser() {
        return this.fromUser;
    }

    public final e getImAdLog() {
        return this.imAdLog;
    }

    public final String getShareUserId() {
        return this.shareUserId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.a
    public final IMUser getSingleChatFromUser() {
        return this.fromUser;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.a
    public final String getSingleChatFromUserId() {
        IMUser iMUser = this.fromUser;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final void setChatExt(Serializable serializable) {
        this.chatExt = serializable;
    }

    public final void setFromUser(IMUser iMUser) {
        this.fromUser = iMUser;
    }

    public final void setImAdLog(e eVar) {
        this.imAdLog = eVar;
    }

    public final void setShareUserId(String str) {
        this.shareUserId = str;
    }
}
