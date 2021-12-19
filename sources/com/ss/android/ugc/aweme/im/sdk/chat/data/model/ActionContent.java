package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ActionContent extends BaseContent {
    @c(a = "event")
    private String event = "click";
    @c(a = "menu_key")
    private String menuKey;

    static {
        Covode.recordClassIndex(64018);
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getMenuKey() {
        return this.menuKey;
    }

    public final void setEvent(String str) {
        this.event = str;
    }

    public final void setMenuKey(String str) {
        this.menuKey = str;
    }
}
