package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;

public class RecordInteractExtra {
    @c(a = "clickable_open_url")
    private String clickableOpenUrl;
    @c(a = "clickable_web_url")
    private String clickableWebUrl;
    @c(a = "interaction_type")
    private int interactionType;
    @c(a = "interaction_icon")
    private String popIcon;
    @c(a = "interaction_text")
    private String popText;
    @c(a = "interaction_url")
    private String schemeUrl;
    @c(a = "sticker_id")
    private String stickerId;

    static {
        Covode.recordClassIndex(83644);
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

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public ExtraParams toExtraParams() {
        ExtraParams extraParams = new ExtraParams();
        extraParams.setInteractionIcon(this.popIcon);
        extraParams.setInteractionText(this.popText);
        extraParams.setInteractionType(this.interactionType);
        extraParams.setInteractionUrl(this.schemeUrl);
        extraParams.setClickableOpenUrl(this.clickableOpenUrl);
        extraParams.setClickableWebUrl(this.clickableWebUrl);
        return extraParams;
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

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void formatFromExtraParams(ExtraParams extraParams, String str) {
        if (extraParams != null) {
            this.stickerId = str;
            this.interactionType = extraParams.getInteractionType();
            this.popIcon = extraParams.getInteractionIcon();
            this.popText = extraParams.getInteractionText();
            this.schemeUrl = extraParams.getInteractionUrl();
            this.clickableOpenUrl = extraParams.getClickableOpenUrl();
            this.clickableWebUrl = extraParams.getClickableWebUrl();
        }
    }
}
