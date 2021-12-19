package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class LiveStreamUrlExtra implements Serializable {
    @c(a = "anchor_interact_profile")
    int anchorInteractProfile;
    @c(a = "audience_interact_profile")
    int audienceInteractProfile;
    @c(a = "bitrate_adapt_strategy")
    int bitrateAdaptStrategy;
    @c(a = "default_bitrate")
    int defaultBitrate = 500;
    @c(a = "bframe_enable")
    boolean enableBFrame = true;
    @c(a = "fps")
    int fps = 15;
    @c(a = "gop_sec")
    float gopSec = 2.0f;
    @c(a = "hardware_encode")
    boolean hardwareEncode;
    @c(a = "height")
    int height = 640;
    @c(a = "roi")
    boolean isRoi;
    @c(a = "sw_roi")
    boolean isSwRoi;
    @c(a = "max_bitrate")
    int maxBitrate = 800;
    @c(a = "min_bitrate")
    int minBitrate = 200;
    @c(a = "ngb_push_url")
    String ngbPushUrl = "";
    @c(a = "ngb_push_url_postfix")
    String ngbPushUrlPrefix = "";
    private int previewHeight;
    private int previewWidth;
    @c(a = "video_profile")
    int profile = 1;
    @c(a = "super_resolution")
    SrConfig srConfig;
    @c(a = "width")
    int width = 360;

    static {
        Covode.recordClassIndex(59501);
    }

    public int getAnchorInteractProfile() {
        return this.anchorInteractProfile;
    }

    public int getAudienceInteractProfile() {
        return this.audienceInteractProfile;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public float getGopSec() {
        return this.gopSec;
    }

    public String getNgbPushUrl() {
        return this.ngbPushUrl;
    }

    public String getNgbPushUrlPrefix() {
        return this.ngbPushUrlPrefix;
    }

    public int getProfile() {
        return this.profile;
    }

    public SrConfig getSrConfig() {
        return this.srConfig;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isHardwareEncode() {
        return this.hardwareEncode;
    }

    public boolean isRoi() {
        return this.isRoi;
    }

    public boolean isSwRoi() {
        return this.isSwRoi;
    }

    public static class SrConfig implements Serializable {
        @c(a = "antialiasing")
        public boolean antiAlias;
        @c(a = "enable")
        public boolean enabled;
        @c(a = "strength")
        public int strength;

        static {
            Covode.recordClassIndex(59502);
        }

        public SrConfig() {
            this(false, false, 0);
        }

        public String toString() {
            return "SrConfig{enabled=" + this.enabled + ", antiAlias=" + this.antiAlias + ", strength=" + this.strength + '}';
        }

        public SrConfig(boolean z, boolean z2, int i2) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i2;
        }
    }

    public int getPreviewHeight() {
        int i2 = this.previewHeight;
        if (i2 == 0) {
            return 1280;
        }
        return i2;
    }

    public int getPreviewWidth() {
        int i2 = this.previewWidth;
        if (i2 == 0) {
            return 720;
        }
        return i2;
    }

    public int getDefaultBitrate() {
        if (this.defaultBitrate == 0) {
            this.defaultBitrate = 500;
        }
        return this.defaultBitrate;
    }

    public int getFPS() {
        if (this.fps == 0) {
            this.fps = 15;
        }
        return this.fps;
    }

    public int getHeight() {
        if (this.height == 0) {
            this.height = 640;
        }
        return this.height;
    }

    public int getMinBitrate() {
        if (this.minBitrate == 0) {
            this.minBitrate = 200;
        }
        return this.minBitrate;
    }

    public int getWidth() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == 0) {
            this.maxBitrate = (getDefaultBitrate() * 2) - getMinBitrate();
        }
        return this.maxBitrate;
    }

    public String toString() {
        return "LiveStreamUrlExtra{ngbPushUrl='" + this.ngbPushUrl + '\'' + ", ngbPushUrlPrefix='" + this.ngbPushUrlPrefix + '\'' + ", height=" + this.height + ", width=" + this.width + ", minBitrate=" + this.minBitrate + ", defaultBitrate=" + this.defaultBitrate + ", maxBitrate=" + this.maxBitrate + ", profile=" + this.profile + ", hardwareEncode=" + this.hardwareEncode + ", bitrateAdaptStrategy=" + this.bitrateAdaptStrategy + ", fps=" + this.fps + ", anchorInteractProfile=" + this.anchorInteractProfile + ", audienceInteractProfile=" + this.audienceInteractProfile + ", srConfig=" + this.srConfig + ", gopSec=" + this.gopSec + ", enableBFrame=" + this.enableBFrame + ", isRoi=" + this.isRoi + ", isSwRoi=" + this.isSwRoi + ", previewWidth=" + this.previewWidth + ", previewHeight=" + this.previewHeight + '}';
    }

    public void setAnchorInteractProfile(int i2) {
        this.anchorInteractProfile = i2;
    }

    public void setAudienceInteractProfile(int i2) {
        this.audienceInteractProfile = i2;
    }

    @c(a = "bitrate_adapt_strategy")
    public void setBitrateAdaptStrategy(int i2) {
        this.bitrateAdaptStrategy = i2;
    }

    public void setDefaultBitrate(int i2) {
        this.defaultBitrate = i2;
    }

    @c(a = "bframe_enable")
    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    public void setFPS(int i2) {
        this.fps = i2;
    }

    @c(a = "gop_sec")
    public void setGopSec(float f2) {
        this.gopSec = f2;
    }

    public void setHardwareEncode(boolean z) {
        this.hardwareEncode = z;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setMaxBitrate(int i2) {
        this.maxBitrate = i2;
    }

    public void setMinBitrate(int i2) {
        this.minBitrate = i2;
    }

    public void setNgbPushUrl(String str) {
        this.ngbPushUrl = str;
    }

    public void setNgbPushUrlPrefix(String str) {
        this.ngbPushUrlPrefix = str;
    }

    public void setProfile(int i2) {
        this.profile = i2;
    }

    @c(a = "roi")
    public void setRoi(boolean z) {
        this.isRoi = z;
    }

    public void setSrConfig(SrConfig srConfig2) {
        this.srConfig = srConfig2;
    }

    @c(a = "sw_roi")
    public void setSwRoi(boolean z) {
        this.isSwRoi = z;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }
}
