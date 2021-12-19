package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class SuperEntranceConfig {
    @c(a = "effect_id")
    private String effectId = "";
    @c(a = "effect_ids")
    private List<String> effectIds = new ArrayList();
    @c(a = "effect_tip")
    private String effectTip = "";
    @c(a = "loop_video_md5")
    private String loopVideoMd5 = "";
    @c(a = "loop_video_url")
    private String loopVideoUrl = "";
    @c(a = "plus_icon_md5")
    private String plusIconMd5 = "";
    @c(a = "plus_icon_url")
    private String plusIconUrl = "";
    @c(a = "try_tip")
    private String tryTip = "";
    @c(a = "valid_times")
    private List<ValidTimesConfig> validTimes = new ArrayList();
    @c(a = "video_back_img_md5")
    private String videoBackImgMd5 = "";
    @c(a = "video_back_img_url")
    private String videoBackImgUrl = "";
    @c(a = "video_md5")
    private String videoMd5 = "";
    @c(a = "video_url")
    private String videoUrl = "";

    static {
        Covode.recordClassIndex(63084);
    }

    public String getEffectId() {
        return this.effectId;
    }

    public List<String> getEffectIds() {
        return this.effectIds;
    }

    public String getEffectTip() {
        return this.effectTip;
    }

    public String getLoopVideoMd5() {
        return this.loopVideoMd5;
    }

    public String getLoopVideoUrl() {
        return this.loopVideoUrl;
    }

    public String getPlusIconMd5() {
        return this.plusIconMd5;
    }

    public String getPlusIconUrl() {
        return this.plusIconUrl;
    }

    public String getTryTip() {
        return this.tryTip;
    }

    public List<ValidTimesConfig> getValidTimes() {
        return this.validTimes;
    }

    public String getVideoBackImgMd5() {
        return this.videoBackImgMd5;
    }

    public String getVideoBackImgUrl() {
        return this.videoBackImgUrl;
    }

    public String getVideoMd5() {
        return this.videoMd5;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
}
