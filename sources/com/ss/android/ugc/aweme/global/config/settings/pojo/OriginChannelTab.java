package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class OriginChannelTab {
    @c(a = "channel_tab_id")
    private Integer channelTabId;
    @c(a = "i18n_name")
    private String i18nName;
    @c(a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(63064);
    }

    public Integer getChannelTabId() {
        return this.channelTabId;
    }

    public String getI18nName() {
        return this.i18nName;
    }

    public String getName() {
        return this.name;
    }
}
