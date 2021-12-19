package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class f extends IMContact {
    private final UrlModel batchAvatar;
    private final List<IMUser> batchContacts;
    private final String batchGroupType;
    private final String batchName;
    private final String panelTitle;

    static {
        Covode.recordClassIndex(66566);
    }

    public final List<IMUser> getBatchContacts() {
        return this.batchContacts;
    }

    public final String getBatchGroupType() {
        return this.batchGroupType;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        return this.batchAvatar;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getDisplayName() {
        return this.batchName;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getNickName() {
        return this.batchName;
    }

    public final String getPanelTitle() {
        return this.panelTitle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(UrlModel urlModel, String str, String str2, List<? extends IMUser> list, String str3) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(str3, "");
        this.batchAvatar = urlModel;
        this.batchName = str;
        this.panelTitle = str2;
        this.batchContacts = list;
        this.batchGroupType = str3;
        this.relationListItemType = 15;
    }
}
