package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import java.util.List;

public final class GroupGreetingContent extends BaseContent {
    @c(a = "members")
    private List<? extends IMUser> userList;

    static {
        Covode.recordClassIndex(64036);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        return "";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getUserList() {
        return this.userList;
    }

    public final void setUserList(List<? extends IMUser> list) {
        List list2;
        e.a.a();
        if (list != null) {
            list2 = n.k(list);
        } else {
            list2 = null;
        }
        this.userList = e.a(list2);
    }
}
