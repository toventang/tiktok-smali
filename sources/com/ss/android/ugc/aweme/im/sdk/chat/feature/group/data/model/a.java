package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.io.Serializable;

public final class a extends IMContact implements Serializable {
    private ah member;
    private final String secUid;
    private final String uid;
    private IMUser user;

    static {
        Covode.recordClassIndex(64279);
    }

    public final ah getMember() {
        return this.member;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final IMUser getUser() {
        return this.user;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        IMUser iMUser = this.user;
        if (iMUser != null) {
            return iMUser.getDisplayAvatar();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getDisplayName() {
        IMUser iMUser = this.user;
        if (iMUser != null) {
            return iMUser.getDisplayName();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getNickName() {
        IMUser iMUser = this.user;
        if (iMUser != null) {
            return iMUser.getNickName();
        }
        return null;
    }

    public final void setMember(ah ahVar) {
        this.member = ahVar;
    }

    public final void setUser(IMUser iMUser) {
        this.user = iMUser;
    }

    public a(String str, String str2) {
        l.d(str, "");
        this.uid = str;
        this.secUid = str2;
    }
}
