package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class DuetConfig {
    private Serializable author;
    private final boolean defaultUseMic;
    private String duetChallenge;
    private String duetFrom;
    private Integer duetGameScore;
    private Effect duetLayout;
    private int duetVideoHeight;
    private int duetVideoWidth;
    private final boolean isFromDuetButton;
    private final boolean isFromDuetSticker;
    private StickerDownloadConfig mStickerDownloadConfig;
    private int minDuration;
    private String mp4Path;
    private String originVideo;
    public String outputDir;
    private String wavPath;

    static {
        Covode.recordClassIndex(79686);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i2, boolean z, boolean z2) {
        this(str, str2, str3, serializable, str4, i2, z, z2, false, 256, null);
    }

    public static final class Builder {
        private DuetConfig config;

        static {
            Covode.recordClassIndex(79687);
        }

        public final DuetConfig build() {
            return this.config;
        }

        public Builder() {
            this.config = new DuetConfig("", "", "", new Serializable() {
                /* class com.ss.android.ugc.aweme.services.external.ui.DuetConfig.Builder.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79688);
                }
            }, "", 0, false, false, false, 256, null);
        }

        public final Builder minDuration(int i2) {
            this.config.setMinDuration(i2);
            return this;
        }

        public Builder(DuetConfig duetConfig) {
            l.d(duetConfig, "");
            this.config = duetConfig;
        }

        public final Builder author(Serializable serializable) {
            l.d(serializable, "");
            this.config.setAuthor(serializable);
            return this;
        }

        public final Builder duetFrom(String str) {
            l.d(str, "");
            this.config.setDuetFrom(str);
            return this;
        }

        public final Builder mp4Path(String str) {
            l.d(str, "");
            this.config.setMp4Path(str);
            return this;
        }

        public final Builder originalVideo(String str) {
            l.d(str, "");
            this.config.setOriginVideo(str);
            return this;
        }

        public final Builder outputDir(String str) {
            l.d(str, "");
            this.config.setOutputDir(str);
            return this;
        }

        public final Builder wavPath(String str) {
            l.d(str, "");
            this.config.setWavPath(str);
            return this;
        }
    }

    public final Serializable getAuthor() {
        return this.author;
    }

    public final boolean getDefaultUseMic() {
        return this.defaultUseMic;
    }

    public final String getDuetChallenge() {
        return this.duetChallenge;
    }

    public final String getDuetFrom() {
        return this.duetFrom;
    }

    public final Integer getDuetGameScore() {
        return this.duetGameScore;
    }

    public final Effect getDuetLayout() {
        return this.duetLayout;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public final StickerDownloadConfig getMStickerDownloadConfig() {
        return this.mStickerDownloadConfig;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final boolean isFromDuetButton() {
        return this.isFromDuetButton;
    }

    public final boolean isFromDuetSticker() {
        return this.isFromDuetSticker;
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str == null) {
            l.a("outputDir");
        }
        return str;
    }

    public final void setDuetChallenge(String str) {
        this.duetChallenge = str;
    }

    public final void setDuetGameScore(Integer num) {
        this.duetGameScore = num;
    }

    public final void setDuetLayout(Effect effect) {
        this.duetLayout = effect;
    }

    public final void setDuetVideoHeight(int i2) {
        this.duetVideoHeight = i2;
    }

    public final void setDuetVideoWidth(int i2) {
        this.duetVideoWidth = i2;
    }

    public final void setMStickerDownloadConfig(StickerDownloadConfig stickerDownloadConfig) {
        this.mStickerDownloadConfig = stickerDownloadConfig;
    }

    public final void setMinDuration(int i2) {
        this.minDuration = i2;
    }

    public final void setAuthor(Serializable serializable) {
        l.d(serializable, "");
        this.author = serializable;
    }

    public final void setDuetFrom(String str) {
        l.d(str, "");
        this.duetFrom = str;
    }

    public final void setMp4Path(String str) {
        l.d(str, "");
        this.mp4Path = str;
    }

    public final void setOriginVideo(String str) {
        l.d(str, "");
        this.originVideo = str;
    }

    public final void setOutputDir(String str) {
        l.d(str, "");
        this.outputDir = str;
    }

    public final void setWavPath(String str) {
        l.d(str, "");
        this.wavPath = str;
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i2, boolean z, boolean z2, boolean z3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(serializable, "");
        l.d(str4, "");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.author = serializable;
        this.duetFrom = str4;
        this.minDuration = i2;
        this.defaultUseMic = z;
        this.isFromDuetSticker = z2;
        this.isFromDuetButton = z3;
        this.duetGameScore = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i2, boolean z, boolean z2, boolean z3, int i3, g gVar) {
        this(str, str2, str3, serializable, str4, i2, z, z2, (i3 & 256) != 0 ? false : z3);
    }
}
