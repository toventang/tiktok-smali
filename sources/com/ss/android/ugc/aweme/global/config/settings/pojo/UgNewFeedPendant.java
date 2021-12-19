package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class UgNewFeedPendant {
    @c(a = "bar_color")
    private List<String> barColor = new ArrayList();
    @c(a = "bg_color")
    private List<String> bgColor = new ArrayList();
    @c(a = "big_png_fragments_urls")
    private List<String> bigPngFragmentsUrls = new ArrayList();
    @c(a = "cap_color1")
    private String capsuleBackgroundColor;
    @c(a = "capsule_color")
    private List<String> capsuleColor = new ArrayList();
    @c(a = "cap_color2")
    private String capsuleParallelogramColor;
    @c(a = "clock_color")
    private String clockColor;
    @c(a = "disappear_after")
    private Integer disappearAfter;
    @c(a = "dismiss_after")
    private Integer dismissAfter;
    @c(a = "expanded_pendant_frame_list")
    private List<Integer> expandedPendantFrameList = new ArrayList();
    @c(a = "folded_pendant_frame_list")
    private List<Integer> foldedPendantFrameList = new ArrayList();
    @c(a = "fragment_lottie_frame_list")
    private List<Integer> fragmentLottieFrameList = new ArrayList();
    @c(a = "frequent_limit")
    private UgFrequentLimit frequentLimit;
    @c(a = "h5_link")
    private String h5Link;
    @c(a = "k_capsule")
    private Boolean kCapsule;
    @c(a = "k_capsule_content")
    private List<String> kCapsuleContent = new ArrayList();
    @c(a = "lottie_file_md5")
    private String lottieFileMd5;
    @c(a = "lottie_file_zip")
    private List<String> lottieFileZip = new ArrayList();
    @c(a = "mini_pendant_closable")
    private Boolean miniPendantClosable;
    @c(a = "mini_pendant_switchable")
    private Boolean miniPendantSwitchable;
    @c(a = "text_color")
    private String newDayColor;
    @c(a = "new_user")
    private UgNewUser newUser;
    @c(a = "pendant_type")
    private Integer pendantType = 0;
    @c(a = "promotion_hashtag_ids")
    private List<String> promotionIds;
    @c(a = "resource_url")
    private List<UrlModel> resourceUrl = new ArrayList();
    @c(a = "router_url")
    private String routerUrl;
    @c(a = "second_h5_link")
    private String secondH5Link;
    @c(a = "second_lottie_time")
    private List<IntArray> secondLottieTime = new ArrayList();
    @c(a = "show_in_follow")
    private Boolean showInFollow;
    @c(a = "show_times")
    private Integer showTimes;
    @c(a = "small_png_fragments_urls")
    private List<String> smallPngFragmentsUrls = new ArrayList();
    @c(a = "teenager_mode_enable")
    private Boolean teenagerModeEnable;
    @c(a = "right_color")
    private String tickColor;
    @c(a = "text")
    private String tickText;
    @c(a = "timer_link")
    private String timerLink;
    @c(a = "clock_lottie_file_md5")
    private String timerLottieFileMd5;
    @c(a = "clock_lottie_file_zip")
    private List<String> timerLottieFileZip = new ArrayList();
    @c(a = "use_origin_pendant")
    private Boolean useOriginPendant;
    @c(a = "user_limit")
    private UgUserLimit userLimit;

    static {
        Covode.recordClassIndex(63094);
    }

    public List<String> getBarColor() {
        return this.barColor;
    }

    public List<String> getBgColor() {
        return this.bgColor;
    }

    public List<String> getBigPngFragmentsUrls() {
        return this.bigPngFragmentsUrls;
    }

    public String getCapsuleBackgroundColor() {
        return this.capsuleBackgroundColor;
    }

    public List<String> getCapsuleColor() {
        return this.capsuleColor;
    }

    public String getCapsuleParallelogramColor() {
        return this.capsuleParallelogramColor;
    }

    public String getClockColor() {
        return this.clockColor;
    }

    public Integer getDismissAfter() {
        return this.dismissAfter;
    }

    public List<Integer> getExpandedPendantFrameList() {
        return this.expandedPendantFrameList;
    }

    public List<Integer> getFoldedPendantFrameList() {
        return this.foldedPendantFrameList;
    }

    public List<Integer> getFragmentLottieFrameList() {
        return this.fragmentLottieFrameList;
    }

    public List<String> getKCapsuleContent() {
        return this.kCapsuleContent;
    }

    public List<String> getLottieFileZip() {
        return this.lottieFileZip;
    }

    public String getNewDayColor() {
        return this.newDayColor;
    }

    public List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public List<UrlModel> getResourceUrl() {
        return this.resourceUrl;
    }

    public String getRouterUrl() {
        return this.routerUrl;
    }

    public List<IntArray> getSecondLottieTime() {
        return this.secondLottieTime;
    }

    public List<String> getSmallPngFragmentsUrls() {
        return this.smallPngFragmentsUrls;
    }

    public String getTickColor() {
        return this.tickColor;
    }

    public String getTickText() {
        return this.tickText;
    }

    public String getTimerLink() {
        return this.timerLink;
    }

    public String getTimerLottieFileMd5() {
        return this.timerLottieFileMd5;
    }

    public List<String> getTimerLottieFileZip() {
        return this.timerLottieFileZip;
    }

    public Boolean getUseOriginPendant() {
        return this.useOriginPendant;
    }

    public Integer getDisappearAfter() {
        Integer num = this.disappearAfter;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public UgFrequentLimit getFrequentLimit() {
        UgFrequentLimit ugFrequentLimit = this.frequentLimit;
        if (ugFrequentLimit != null) {
            return ugFrequentLimit;
        }
        throw new a();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getKCapsule() {
        Boolean bool = this.kCapsule;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public String getLottieFileMd5() {
        String str = this.lottieFileMd5;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getMiniPendantClosable() {
        Boolean bool = this.miniPendantClosable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getMiniPendantSwitchable() {
        Boolean bool = this.miniPendantSwitchable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public UgNewUser getNewUser() {
        UgNewUser ugNewUser = this.newUser;
        if (ugNewUser != null) {
            return ugNewUser;
        }
        throw new a();
    }

    public Integer getPendantType() {
        Integer num = this.pendantType;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getSecondH5Link() {
        String str = this.secondH5Link;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getShowInFollow() {
        Boolean bool = this.showInFollow;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getShowTimes() {
        Integer num = this.showTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getTeenagerModeEnable() {
        Boolean bool = this.teenagerModeEnable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public UgUserLimit getUserLimit() {
        UgUserLimit ugUserLimit = this.userLimit;
        if (ugUserLimit != null) {
            return ugUserLimit;
        }
        throw new a();
    }

    public void setBarColor(List<String> list) {
        this.barColor = list;
    }

    public void setBgColor(List<String> list) {
        this.bgColor = list;
    }

    public void setCapsuleBackgroundColor(String str) {
        this.capsuleBackgroundColor = str;
    }

    public void setCapsuleParallelogramColor(String str) {
        this.capsuleParallelogramColor = str;
    }

    public void setClockColor(String str) {
        this.clockColor = str;
    }

    public void setDismissAfter(Integer num) {
        this.dismissAfter = num;
    }

    public void setNewDayColor(String str) {
        this.newDayColor = str;
    }

    public void setPromotionIds(List<String> list) {
        this.promotionIds = list;
    }

    public void setRouterUrl(String str) {
        this.routerUrl = str;
    }

    public void setTickColor(String str) {
        this.tickColor = str;
    }

    public void setTickText(String str) {
        this.tickText = str;
    }

    public void setTimerLink(String str) {
        this.timerLink = str;
    }

    public void setTimerLottieFileMd5(String str) {
        this.timerLottieFileMd5 = str;
    }

    public void setTimerLottieFileZip(List<String> list) {
        this.timerLottieFileZip = list;
    }

    public void setUseOriginPendant(Boolean bool) {
        this.useOriginPendant = bool;
    }
}
