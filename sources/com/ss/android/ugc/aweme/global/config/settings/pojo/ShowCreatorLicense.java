package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ShowCreatorLicense {
    @c(a = "click_type")
    private int clickType;
    @c(a = "popup_content")
    private String popupContent;
    @c(a = "popup_interval")
    private int popupInterval;
    @c(a = "popup_linkText")
    private String popupLinktext;
    @c(a = "popup_msg")
    private String popupMsg;
    @c(a = "popup_times_limit")
    private int popupTimesLimit;
    @c(a = "popup_title")
    private String popupTitle;
    @c(a = "popup_url")
    private String popupUrl;
    @c(a = "show")
    private int show;

    static {
        Covode.recordClassIndex(63079);
    }

    public int getClickType() {
        return this.clickType;
    }

    public String getPopupContent() {
        return this.popupContent;
    }

    public int getPopupInterval() {
        return this.popupInterval;
    }

    public String getPopupLinktext() {
        return this.popupLinktext;
    }

    public String getPopupMsg() {
        return this.popupMsg;
    }

    public int getPopupTimesLimit() {
        return this.popupTimesLimit;
    }

    public String getPopupTitle() {
        return this.popupTitle;
    }

    public String getPopupUrl() {
        return this.popupUrl;
    }

    public int getShow() {
        return this.show;
    }
}
