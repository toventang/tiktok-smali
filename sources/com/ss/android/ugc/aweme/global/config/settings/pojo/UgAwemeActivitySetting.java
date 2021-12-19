package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class UgAwemeActivitySetting {
    @c(a = "activity_end_time")
    private Long activityEndTime;
    @c(a = "activity_id")
    private String activityId;
    @c(a = "activity_start_time")
    private Long activityStartTime;
    @c(a = "activity_tasks")
    private List<UgActivityTasks> activityTasks = new ArrayList();
    @c(a = "channel_popup")
    private UgChannelPopup channelPopup;
    @c(a = "is_new_user")
    private Boolean isNewUser;
    @c(a = "login_banner")
    private UgLoginBanner loginBanner;
    @c(a = "new_feed_pendant")
    private UgNewFeedPendant newFeedPendant;
    @c(a = "overall_switch")
    private Boolean overallSwitch;
    @c(a = "pendant_version")
    private Integer pendantVersion;
    @c(a = "profile_activity_button")
    private UgProfileActivityButton profileActivityButton;
    @c(a = "profile_activity_icon")
    private UgProfileActivityIcon profileActivityIcon;
    @c(a = "profile_tab_guide")
    private UgProfileTabGuide profileTabGuide;
    @c(a = "shortcut_info")
    private UgShortcutInfo shortcutInfo;
    @c(a = "feed_bottom_notice_bar")
    private UgFeedBottomNoticeBar ugFeedBottomNoticeBar;

    static {
        Covode.recordClassIndex(63088);
    }

    public List<UgActivityTasks> getActivityTasks() {
        return this.activityTasks;
    }

    public UgFeedBottomNoticeBar getUgFeedBottomNoticeBar() {
        return this.ugFeedBottomNoticeBar;
    }

    public Long getActivityEndTime() {
        Long l2 = this.activityEndTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public String getActivityId() {
        String str = this.activityId;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Long getActivityStartTime() {
        Long l2 = this.activityStartTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public UgChannelPopup getChannelPopup() {
        UgChannelPopup ugChannelPopup = this.channelPopup;
        if (ugChannelPopup != null) {
            return ugChannelPopup;
        }
        throw new a();
    }

    public Boolean getIsNewUser() {
        Boolean bool = this.isNewUser;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public UgLoginBanner getLoginBanner() {
        UgLoginBanner ugLoginBanner = this.loginBanner;
        if (ugLoginBanner != null) {
            return ugLoginBanner;
        }
        throw new a();
    }

    public UgNewFeedPendant getNewFeedPendant() {
        UgNewFeedPendant ugNewFeedPendant = this.newFeedPendant;
        if (ugNewFeedPendant != null) {
            return ugNewFeedPendant;
        }
        throw new a();
    }

    public Boolean getOverallSwitch() {
        Boolean bool = this.overallSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getPendantVersion() {
        Integer num = this.pendantVersion;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public UgProfileActivityButton getProfileActivityButton() {
        UgProfileActivityButton ugProfileActivityButton = this.profileActivityButton;
        if (ugProfileActivityButton != null) {
            return ugProfileActivityButton;
        }
        throw new a();
    }

    public UgProfileActivityIcon getProfileActivityIcon() {
        UgProfileActivityIcon ugProfileActivityIcon = this.profileActivityIcon;
        if (ugProfileActivityIcon != null) {
            return ugProfileActivityIcon;
        }
        throw new a();
    }

    public UgProfileTabGuide getProfileTabGuide() {
        UgProfileTabGuide ugProfileTabGuide = this.profileTabGuide;
        if (ugProfileTabGuide != null) {
            return ugProfileTabGuide;
        }
        throw new a();
    }

    public UgShortcutInfo getShortcutInfo() {
        UgShortcutInfo ugShortcutInfo = this.shortcutInfo;
        if (ugShortcutInfo != null) {
            return ugShortcutInfo;
        }
        throw new a();
    }

    public void setUgFeedBottomNoticeBar(UgFeedBottomNoticeBar ugFeedBottomNoticeBar2) {
        this.ugFeedBottomNoticeBar = ugFeedBottomNoticeBar2;
    }
}
