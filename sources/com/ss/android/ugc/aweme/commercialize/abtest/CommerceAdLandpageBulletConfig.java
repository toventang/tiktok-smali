package com.ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class CommerceAdLandpageBulletConfig {
    @c(a = "ad_landpage_card_enable")
    private boolean adLandpageCardEnable;
    @c(a = "ad_landpage_fake_enable")
    private boolean adLandpageFakeEnable;
    @c(a = "ad_landpage_non_fullscreen_enable")
    private boolean adLandpageNonFullScreenEnable;
    @c(a = "ad_landpage_real_enable")
    private boolean adLandpageRealEnable;
    @c(a = "douplus_enable")
    private boolean douplusEnable;
    @c(a = "ad_landpage_enable")
    private boolean totalEnable;

    static {
        Covode.recordClassIndex(45313);
    }

    public final boolean getAdLandpageCardEnable() {
        return this.adLandpageCardEnable;
    }

    public final boolean getAdLandpageFakeEnable() {
        return this.adLandpageFakeEnable;
    }

    public final boolean getAdLandpageNonFullScreenEnable() {
        return this.adLandpageNonFullScreenEnable;
    }

    public final boolean getAdLandpageRealEnable() {
        return this.adLandpageRealEnable;
    }

    public final boolean getDouplusEnable() {
        return this.douplusEnable;
    }

    public final boolean getTotalEnable() {
        return this.totalEnable;
    }

    public final void setAdLandpageCardEnable(boolean z) {
        this.adLandpageCardEnable = z;
    }

    public final void setAdLandpageFakeEnable(boolean z) {
        this.adLandpageFakeEnable = z;
    }

    public final void setAdLandpageNonFullScreenEnable(boolean z) {
        this.adLandpageNonFullScreenEnable = z;
    }

    public final void setAdLandpageRealEnable(boolean z) {
        this.adLandpageRealEnable = z;
    }

    public final void setDouplusEnable(boolean z) {
        this.douplusEnable = z;
    }

    public final void setTotalEnable(boolean z) {
        this.totalEnable = z;
    }
}
