package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class VerificationBadgeType {
    @c(a = "action_type")
    private Integer actionType = 1;
    @c(a = "badge_type")
    private Integer badgeType = 1;
    @c(a = "link")
    private String link = "";

    static {
        Covode.recordClassIndex(63109);
    }

    public Integer getActionType() {
        return this.actionType;
    }

    public Integer getBadgeType() {
        return this.badgeType;
    }

    public String getLink() {
        return this.link;
    }
}
