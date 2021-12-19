package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class UserBioPermission implements Serializable {
    @c(a = "enable_download_app_link")
    private boolean enableDownloadAppLink;
    @c(a = "enable_email")
    private boolean enableEmail;
    @c(a = "enable_location")
    private boolean enableLocation;
    @c(a = "enable_phone")
    private boolean enablePhone;
    @c(a = "enable_url")
    private boolean enableUrl;

    static {
        Covode.recordClassIndex(75281);
    }

    public final boolean getEnableDownloadAppLink() {
        return this.enableDownloadAppLink;
    }

    public final boolean getEnableEmail() {
        return this.enableEmail;
    }

    public final boolean getEnableLocation() {
        return this.enableLocation;
    }

    public final boolean getEnablePhone() {
        return this.enablePhone;
    }

    public final boolean getEnableUrl() {
        return this.enableUrl;
    }

    public final void setEnableDownloadAppLink(boolean z) {
        this.enableDownloadAppLink = z;
    }

    public final void setEnableEmail(boolean z) {
        this.enableEmail = z;
    }

    public final void setEnableLocation(boolean z) {
        this.enableLocation = z;
    }

    public final void setEnablePhone(boolean z) {
        this.enablePhone = z;
    }

    public final void setEnableUrl(boolean z) {
        this.enableUrl = z;
    }
}
