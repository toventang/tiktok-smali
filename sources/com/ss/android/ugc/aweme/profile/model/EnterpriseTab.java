package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class EnterpriseTab implements Serializable {
    @c(a = "show_tab_settings")
    boolean showTabSettings;
    @c(a = "tab_link")
    String tabLink;
    @c(a = "tab_type")
    int tabType;
    @c(a = "title")
    String title;

    static {
        Covode.recordClassIndex(75217);
    }

    public String getTabLink() {
        return this.tabLink;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTabSettings() {
        return this.showTabSettings;
    }

    public void setShowTabSettings(boolean z) {
        this.showTabSettings = z;
    }

    public void setTabLink(String str) {
        this.tabLink = str;
    }

    public void setTabType(int i2) {
        this.tabType = i2;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
