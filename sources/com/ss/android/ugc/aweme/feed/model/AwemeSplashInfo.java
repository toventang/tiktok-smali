package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.a;
import com.google.gson.a.c;
import java.io.Serializable;

public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    public String anchorId;
    @c(a = "awesome_splash_id")
    private String awesomeSplashId;
    public transient boolean contextTrackSent;
    @c(a = "disable_hotstart_show")
    private boolean disableHotStartShow;
    @c(a = "enable_splash_open")
    private boolean enableSplashOpen;
    @c(a = "end_time")
    private int endTime;
    @c(a = "enter_app_text")
    private String enterAppText;
    public transient boolean hasUpdateLiving;
    @c(a = "hot_show_type")
    private int hotShowType;
    @c(a = "is_invalid_ad")
    private boolean isInvalidAd;
    @a(a = false, b = false)
    private transient boolean isShown;
    @c(a = "label_info")
    private LabelInfo labelInfo;
    @c(a = "logo_color")
    private int logoColor;
    @c(a = "predownload_text")
    private String predownloadText;
    @c(a = "preload_type")
    private int preloadType;
    @c(a = "show_live_info")
    private int showLiveInfo;
    @c(a = "skip_info")
    private SkipInfo skipInfo;
    @c(a = "splash_button_text")
    private String splashButtonText;
    @c(a = "splash_feed_type")
    private int splashFeedType;
    @c(a = "splash_show_time")
    private float splashShowTime = 3000.0f;
    @c(a = "swipe_up_delay")
    private long swipeUpDelay;
    @c(a = "swipe_up_type")
    private int swipeUpType;
    public transient TopViewLiveInfo topViewLiveInfo;

    static {
        Covode.recordClassIndex(59329);
    }

    public class LabelInfo implements Serializable {
        @c(a = "background_color")
        private String backgroundColor;
        @c(a = "position")
        private int position;
        @c(a = "text")
        private String text;
        @c(a = "text_color")
        private String textColor;

        static {
            Covode.recordClassIndex(59330);
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    public class SkipInfo implements Serializable {
        @c(a = "background_color")
        private String backgroundColor;
        @c(a = "button_extra_style")
        private int buttonExtraStyle;
        @c(a = "countdown_unit")
        private String countdownUnit;
        @c(a = "countdown_enable")
        private int countdown_enable;
        @c(a = "height_extra_size")
        private int heightExtraSize;
        @c(a = "position")
        private int position;
        @c(a = "text")
        private String text;
        @c(a = "text_color")
        private String textColor;
        @c(a = "width_extra_size")
        private int widthExtraSize;

        static {
            Covode.recordClassIndex(59331);
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getButtonExtraStyle() {
            return this.buttonExtraStyle;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public SkipInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getEnterAppText() {
        return this.enterAppText;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public int getLogoColor() {
        return this.logoColor;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public int getShowLiveInfo() {
        return this.showLiveInfo;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public String getSplashButtonText() {
        return this.splashButtonText;
    }

    public int getSplashFeedType() {
        return this.splashFeedType;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public long getSwipeUpDelay() {
        return this.swipeUpDelay;
    }

    public int getSwipeUpType() {
        return this.swipeUpType;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i2) {
        this.endTime = i2;
    }

    public void setHotShowType(int i2) {
        this.hotShowType = i2;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setLogoColor(int i2) {
        this.logoColor = i2;
    }

    public void setPreloadType(int i2) {
        this.preloadType = i2;
    }

    public void setShowLiveInfo(int i2) {
        this.showLiveInfo = i2;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashButtonText(String str) {
        this.splashButtonText = str;
    }

    public void setSplashFeedType(int i2) {
        this.splashFeedType = i2;
    }

    public void setSplashShowTime(float f2) {
        this.splashShowTime = f2;
    }
}
