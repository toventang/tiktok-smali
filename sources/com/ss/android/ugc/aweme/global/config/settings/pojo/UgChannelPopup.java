package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class UgChannelPopup {
    @c(a = "button_text")
    private String buttonText;
    @c(a = "campaign_list")
    private List<String> campaignList = new ArrayList();
    @c(a = "campaign_name")
    private String campaignName;
    @c(a = "content")
    private String content;
    @c(a = "h5_link")
    private String h5Link;
    @c(a = "image_style")
    private Integer imageStyle;
    @c(a = "link_schema")
    private String linkSchema;
    @c(a = "resource_url")
    private UrlModel resourceUrl;
    @c(a = "show_for_all")
    private Boolean showForAll;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63090);
    }

    public List<String> getCampaignList() {
        return this.campaignList;
    }

    public String getButtonText() {
        String str = this.buttonText;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getCampaignName() {
        String str = this.campaignName;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getImageStyle() {
        Integer num = this.imageStyle;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getLinkSchema() {
        String str = this.linkSchema;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public Boolean getShowForAll() {
        Boolean bool = this.showForAll;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
