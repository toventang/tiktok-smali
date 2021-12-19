package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ChangeBanMusicConfig {
    private final String creationId;
    private final String mp4Path;
    private final String originVideo;
    public String outputDir;
    private int videoHeight;
    private int videoWidth;
    private final String wavPath;

    static {
        Covode.recordClassIndex(79684);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str == null) {
            l.a("outputDir");
        }
        return str;
    }

    public final void setVideoHeight(int i2) {
        this.videoHeight = i2;
    }

    public final void setVideoWidth(int i2) {
        this.videoWidth = i2;
    }

    public final void setOutputDir(String str) {
        l.d(str, "");
        this.outputDir = str;
    }

    public ChangeBanMusicConfig(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.creationId = str4;
    }
}
