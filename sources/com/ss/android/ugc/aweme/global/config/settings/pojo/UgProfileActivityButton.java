package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class UgProfileActivityButton {
    @c(a = "h5_link")
    private String h5Link;
    @c(a = "activity_id")
    private String id;
    @c(a = StringSet.name)
    private String name;
    @c(a = "resource_url")
    private UrlModel resourceUrl;
    @c(a = "show_scenery")
    private Integer showScenery;
    @c(a = "tab_bubble_text")
    private String tabBubbleText;
    @c(a = "time_limit")
    private Integer timeLimit;

    static {
        Covode.recordClassIndex(63096);
    }

    public String getH5Link() {
        return this.h5Link;
    }

    public UrlModel getResourceUrl() {
        return this.resourceUrl;
    }

    public String getId() {
        String str = this.id;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getShowScenery() {
        Integer num = this.showScenery;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getTabBubbleText() {
        String str = this.tabBubbleText;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getTimeLimit() {
        Integer num = this.timeLimit;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public void setId(String str) {
        this.id = str;
    }
}
