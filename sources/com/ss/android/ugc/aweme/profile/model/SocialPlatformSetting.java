package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class SocialPlatformSetting implements Serializable {
    @c(a = "display_consent_page")
    private final boolean displayConsentPage;
    @c(a = "onboarding_rec_strategy")
    private final int onBoardingRecStrategy;
    @c(a = "social_platform")
    private final int socialPlatform;
    @c(a = "sync_status")
    private boolean syncStatus;

    static {
        Covode.recordClassIndex(75260);
    }

    public SocialPlatformSetting() {
        this(0, false, 0, false, 15, null);
    }

    public final boolean getDisplayConsentPage() {
        return this.displayConsentPage;
    }

    public final int getOnBoardingRecStrategy() {
        return this.onBoardingRecStrategy;
    }

    public final int getSocialPlatform() {
        return this.socialPlatform;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    public SocialPlatformSetting(int i2, boolean z, int i3, boolean z2) {
        this.socialPlatform = i2;
        this.syncStatus = z;
        this.onBoardingRecStrategy = i3;
        this.displayConsentPage = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialPlatformSetting(int i2, boolean z, int i3, boolean z2, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? true : z2);
    }
}
