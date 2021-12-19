package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class GlobalTips {
    @c(a = "at_too_more")
    private String atTooMore;
    @c(a = "draft_publish")
    private String draftPublish;
    @c(a = "net_weak")
    private String netWeak;
    @c(a = "not_comment")
    private String notComment;
    @c(a = "not_has_more")
    private String notHasMore;
    @c(a = "not_share")
    private String notShare;
    @c(a = "search_tips")
    private String searchTips;
    @c(a = "self_see_not_share")
    private String selfSeeNotShare;
    @c(a = "share_fail")
    private String shareFail;

    static {
        Covode.recordClassIndex(63042);
    }

    public String getAtTooMore() {
        String str = this.atTooMore;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getDraftPublish() {
        String str = this.draftPublish;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNetWeak() {
        String str = this.netWeak;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNotComment() {
        String str = this.notComment;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNotHasMore() {
        String str = this.notHasMore;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNotShare() {
        String str = this.notShare;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getSearchTips() {
        String str = this.searchTips;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getSelfSeeNotShare() {
        String str = this.selfSeeNotShare;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getShareFail() {
        String str = this.shareFail;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
