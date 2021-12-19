package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class BusinessExtraData {
    @c(a = "clickable_open_url")
    private String clickableOpenUrl;
    @c(a = "clickable_web_url")
    private String clickableWebUrl;
    @c(a = "interaction_type")
    private int interactionType;
    @c(a = "interaction_url")
    private String interactionUrl;
    @c(a = "interaction_icon")
    private String popIcon;
    @c(a = "interaction_text")
    private String popText;
    @c(a = "sticker_id")
    private String stickerId;

    static {
        Covode.recordClassIndex(85483);
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public String getSchemaUrlOpenFirst() {
        if (!com.bytedance.x.c.c.a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        if (!com.bytedance.x.c.c.a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        return this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        if (!com.bytedance.x.c.c.a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        if (!com.bytedance.x.c.c.a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        return this.interactionUrl;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i2) {
        this.interactionType = i2;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
