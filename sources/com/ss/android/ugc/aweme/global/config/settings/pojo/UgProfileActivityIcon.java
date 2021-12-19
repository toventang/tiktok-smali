package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class UgProfileActivityIcon {
    @c(a = "icon_url")
    private UrlModel iconUrl;
    @c(a = "profile_activity_button_list")
    private List<UgProfileActivityButton> profileActivityButtonList;

    static {
        Covode.recordClassIndex(63097);
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public List<UgProfileActivityButton> getProfileActivityButtonList() {
        return this.profileActivityButtonList;
    }
}
