package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class TabSetting implements Serializable {
    @c(a = "aggregation_tab")
    AggregationTab aggregationTab;
    @c(a = "brand_tab")
    BrandTab brandTab;
    @c(a = "enterprise_tab")
    EnterpriseTab enterpriseTab;
    @c(a = "hide_like_tab")
    boolean hideLikeTab;
    @c(a = "private_tab")
    PrivateTab privateTab;
    @c(a = "shop_tab")
    public ShopTab shopTab;

    static {
        Covode.recordClassIndex(75262);
    }

    public AggregationTab getAggregationTab() {
        return this.aggregationTab;
    }

    public BrandTab getBrandTab() {
        return this.brandTab;
    }

    public EnterpriseTab getEnterpriseTab() {
        return this.enterpriseTab;
    }

    public PrivateTab getPrivateTab() {
        return this.privateTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setAggregationTab(AggregationTab aggregationTab2) {
        this.aggregationTab = aggregationTab2;
    }

    public void setBrandTab(BrandTab brandTab2) {
        this.brandTab = brandTab2;
    }

    public void setEnterpriseTab(EnterpriseTab enterpriseTab2) {
        this.enterpriseTab = enterpriseTab2;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
