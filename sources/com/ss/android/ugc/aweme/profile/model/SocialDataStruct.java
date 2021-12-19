package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;
import java.util.List;

public final class SocialDataStruct implements Serializable {
    @c(a = "enable_permission_pop_up")
    private final boolean enablePermissionPopup;
    @c(a = "social_platform_settings")
    private List<SocialPlatformSetting> socialPlatformSettings;

    static {
        Covode.recordClassIndex(75258);
    }

    public final boolean getEnablePermissionPopup() {
        return this.enablePermissionPopup;
    }

    public final List<SocialPlatformSetting> getSocialPlatformSettings() {
        return this.socialPlatformSettings;
    }

    public final void setSocialPlatformSettings(List<SocialPlatformSetting> list) {
        this.socialPlatformSettings = list;
    }

    public SocialDataStruct(List<SocialPlatformSetting> list, boolean z) {
        this.socialPlatformSettings = list;
        this.enablePermissionPopup = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialDataStruct(List list, boolean z, int i2, g gVar) {
        this(list, (i2 & 2) != 0 ? true : z);
    }
}
