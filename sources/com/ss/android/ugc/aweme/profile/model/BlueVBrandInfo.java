package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class BlueVBrandInfo implements Serializable {
    @c(a = "brand_id")
    public int brandId;
    @c(a = "brand_name")
    public String brandName;
    @c(a = "category_id")
    public int categoryId;
    @c(a = "category_name")
    public String categoryName;
    @c(a = "heat")
    public long heat;
    @c(a = "logo_url")
    public UrlModel logoUrl;
    @c(a = "rank")
    public int rank;
    @c(a = "rank_diff")
    public int rankDiff;
    @c(a = "tag_name")
    public String tagName;

    static {
        Covode.recordClassIndex(75210);
    }

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i2) {
        this.brandId = i2;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i2) {
        this.categoryId = i2;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j2) {
        this.heat = j2;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i2) {
        this.rank = i2;
    }

    public void setRankDiff(int i2) {
        this.rankDiff = i2;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
