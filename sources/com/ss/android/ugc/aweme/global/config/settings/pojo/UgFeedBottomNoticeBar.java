package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class UgFeedBottomNoticeBar {
    @c(a = "hashtag_ids")
    private List<String> hashTagIds;
    @c(a = "icon")
    private String icon;
    @c(a = "jump_link")
    private String jumpLink;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(63091);
    }

    public List<String> getHashTagIds() {
        return this.hashTagIds;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getJumpLink() {
        return this.jumpLink;
    }

    public String getText() {
        return this.text;
    }

    public void setHashTagIds(List<String> list) {
        this.hashTagIds = list;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setJumpLink(String str) {
        this.jumpLink = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
