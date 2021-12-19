package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class BrandTab implements Serializable {
    @c(a = "industry_type")
    int industryType;
    @c(a = "show_brand_tab")
    boolean showBrandTab;
    @c(a = "title")
    String title;

    static {
        Covode.recordClassIndex(75211);
    }

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i2) {
        this.industryType = i2;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
