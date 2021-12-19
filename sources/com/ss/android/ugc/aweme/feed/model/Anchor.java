package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class Anchor implements Serializable {
    @c(a = "anchor_id")
    public String anchorId;
    @c(a = "anchor_info")
    public AnchorCommonStruct anchorInfo;
    @c(a = "business_type")
    public Integer businessType = 0;
    @c(a = "shop_link")
    public AnchorShopLinkStruct shopLinkStruct;
    @c(a = "show_type")
    public Integer showType = 0;
    @c(a = "wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    static {
        Covode.recordClassIndex(59294);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo2) {
        this.wikipediaInfo = wikipediaInfo2;
    }
}
