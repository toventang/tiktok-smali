package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.g;

public final class ShareAwemeConfig {
    public static final Companion Companion = new Companion(null);
    private boolean autoPlay;
    private int borderRadius = n.a(4.0d);
    private boolean enablePlayControl;
    private float height = ((float) n.a(252.0d));
    private boolean isLoop;
    private boolean isMute = true;
    private boolean needResize;
    private boolean showMuteBtn;
    private boolean showTitle = true;
    private float width = ((float) n.a(158.0d));

    static {
        Covode.recordClassIndex(64059);
    }

    public static final class Builder {
        private final ShareAwemeConfig mConfig = new ShareAwemeConfig();

        static {
            Covode.recordClassIndex(64060);
        }

        public final ShareAwemeConfig build() {
            return this.mConfig;
        }

        public final Builder autoPlay(boolean z) {
            this.mConfig.setAutoPlay(z);
            return this;
        }

        public final Builder borderRadius(int i2) {
            this.mConfig.setBorderRadius(i2);
            return this;
        }

        public final Builder enablePlayControl(boolean z) {
            this.mConfig.setEnablePlayControl(z);
            return this;
        }

        public final Builder height(float f2) {
            this.mConfig.setHeight(f2);
            return this;
        }

        public final Builder isLoop(boolean z) {
            this.mConfig.setLoop(z);
            return this;
        }

        public final Builder isMute(boolean z) {
            this.mConfig.setMute(z);
            return this;
        }

        public final Builder needResize(boolean z) {
            this.mConfig.setNeedResize(z);
            return this;
        }

        public final Builder showMuteBtn(boolean z) {
            this.mConfig.setShowMuteBtn(z);
            return this;
        }

        public final Builder showTitle(boolean z) {
            this.mConfig.setShowTitle(z);
            return this;
        }

        public final Builder width(float f2) {
            this.mConfig.setWidth(f2);
            return this;
        }
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64061);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final int getBorderRadius() {
        return this.borderRadius;
    }

    public final boolean getEnablePlayControl() {
        return this.enablePlayControl;
    }

    public final float getHeight() {
        return this.height;
    }

    public final boolean getNeedResize() {
        return this.needResize;
    }

    public final boolean getShowMuteBtn() {
        return this.showMuteBtn;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setBorderRadius(int i2) {
        this.borderRadius = i2;
    }

    public final void setEnablePlayControl(boolean z) {
        this.enablePlayControl = z;
    }

    public final void setHeight(float f2) {
        this.height = f2;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setMute(boolean z) {
        this.isMute = z;
    }

    public final void setNeedResize(boolean z) {
        this.needResize = z;
    }

    public final void setShowMuteBtn(boolean z) {
        this.showMuteBtn = z;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public final void setWidth(float f2) {
        this.width = f2;
    }
}
