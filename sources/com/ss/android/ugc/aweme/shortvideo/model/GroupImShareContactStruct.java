package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class GroupImShareContactStruct extends ImShareContactStruct {
    private String conversationName = "";
    private int groupMemberCount;
    private boolean newGroupAvatar;

    static {
        Covode.recordClassIndex(84452);
    }

    public final String getConversationName() {
        return this.conversationName;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public final String getDisplayName() {
        return this.conversationName;
    }

    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final boolean getNewGroupAvatar() {
        return this.newGroupAvatar;
    }

    public final void setGroupMemberCount(int i2) {
        this.groupMemberCount = i2;
    }

    public final void setNewGroupAvatar(boolean z) {
        this.newGroupAvatar = z;
    }

    public final void setConversationName(String str) {
        l.d(str, "");
        this.conversationName = str;
    }
}
