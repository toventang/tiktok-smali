package com.ss.android.ugc.aweme.friends.invite;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class e implements Serializable {
    @c(a = "footer_invite_all")
    private boolean floatInviteAll;
    @c(a = "limit_invite_all")
    private int mLimitInviteAllCount;
    @c(a = "show_invite_all")
    private boolean showInviteAll;
    @c(a = "text")
    private String text;
    @c(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(61493);
    }

    public int getLimitInviteAllCount() {
        return this.mLimitInviteAllCount;
    }

    public String getText() {
        return this.text;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isFloatInviteAll() {
        return this.floatInviteAll;
    }

    public boolean isShowInviteAll() {
        return this.showInviteAll;
    }

    public void setFloatInviteAll(boolean z) {
        this.floatInviteAll = z;
    }

    public void setShowInviteAll(boolean z) {
        this.showInviteAll = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
