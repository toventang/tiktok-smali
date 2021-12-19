package com.bytedance.android.livesdk.j;

import com.bytedance.covode.number.Covode;

public enum q {
    GUIDE,
    MODERATOR_LIST,
    TEMPORARY_MUTE,
    MANAGE_MODERATOR,
    MUTE,
    BLOCK,
    COMMENT_SETTING,
    RANKINGS_SWITCH,
    SCREEN_RECORD_SETTING,
    DISMISS;
    
    private boolean goNextPage = true;

    static {
        Covode.recordClassIndex(10280);
    }

    public final boolean getGoNextPage() {
        return this.goNextPage;
    }

    public final void setGoNextPage(boolean z) {
        this.goNextPage = z;
    }

    private q() {
    }
}
