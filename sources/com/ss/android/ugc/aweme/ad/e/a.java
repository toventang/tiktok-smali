package com.ss.android.ugc.aweme.ad.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class a implements Serializable {
    @c(a = "ad_landing_page_auto_jump_allow_list")
    List<String> autoJumpAllowList;
    @c(a = "ad_landing_page_auto_jump_intercept_list")
    List<String> autoJumpInterceptList;
    @c(a = "ad_landing_page_click_jump_interval")
    int autoJumpInterval;
    @c(a = "ad_landing_page_click_jump_interval_tips")
    String autoJumpIntervalTips;
    @c(a = "ad_landing_page_click_jump_control_enabled")
    boolean clickControlEnabled = true;
    @c(a = "ad_landing_page_click_jump_allow_list")
    List<String> clickJumpAllowList;
    @c(a = "ad_landing_page_auto_jump_control_enabled")
    boolean jumpControlEnabled = true;
    @c(a = "ad_landing_page_pause_list")
    List<String> pauseList;
    @c(a = "ad_splash_landing_page_auto_jump_allow_list")
    List<String> splashAdAutoJumpAllowList;

    static {
        Covode.recordClassIndex(40444);
    }

    public List<String> getAutoJumpAllowList() {
        return this.autoJumpAllowList;
    }

    public List<String> getAutoJumpInterceptList() {
        return this.autoJumpInterceptList;
    }

    public int getAutoJumpInterval() {
        return this.autoJumpInterval;
    }

    public String getAutoJumpIntervalTips() {
        return this.autoJumpIntervalTips;
    }

    public List<String> getClickJumpAllowList() {
        return this.clickJumpAllowList;
    }

    public List<String> getPauseList() {
        return this.pauseList;
    }

    public List<String> getSplashAdAutoJumpAllowList() {
        return this.splashAdAutoJumpAllowList;
    }

    public boolean isClickControlEnabled() {
        return this.clickControlEnabled;
    }

    public boolean isJumpControlEnabled() {
        return this.jumpControlEnabled;
    }

    public void setAutoJumpAllowList(List<String> list) {
        this.autoJumpAllowList = list;
    }

    public void setAutoJumpInterceptList(List<String> list) {
        this.autoJumpInterceptList = list;
    }

    public void setAutoJumpInterval(int i2) {
        this.autoJumpInterval = i2;
    }

    public void setAutoJumpIntervalTips(String str) {
        this.autoJumpIntervalTips = str;
    }

    public void setClickControlEnabled(boolean z) {
        this.clickControlEnabled = z;
    }

    public void setClickJumpAllowList(List<String> list) {
        this.clickJumpAllowList = list;
    }

    public void setJumpControlEnabled(boolean z) {
        this.jumpControlEnabled = z;
    }

    public void setPauseList(List<String> list) {
        this.pauseList = list;
    }

    public void setSplashAdAutoJumpAllowList(List<String> list) {
        this.splashAdAutoJumpAllowList = list;
    }
}
