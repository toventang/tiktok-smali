package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class PublishConfig {
    private String challenge;
    public String creationId;
    public String enterFrom;
    private String musicId;
    public String shootway;
    private String videoId;
    private String videoPath;

    static {
        Covode.recordClassIndex(79709);
    }

    public static class Builder {
        private PublishConfig config = new PublishConfig(null);

        static {
            Covode.recordClassIndex(79710);
        }

        public final PublishConfig build() {
            return this.config;
        }

        public final Builder challenge(String str) {
            l.d(str, "");
            this.config.setChallenge(str);
            return this;
        }

        public final Builder creationId(String str) {
            l.d(str, "");
            this.config.setCreationId(str);
            return this;
        }

        public final Builder enterFrom(String str) {
            l.d(str, "");
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder musicId(String str) {
            l.d(str, "");
            this.config.setMusicId(str);
            return this;
        }

        public final Builder shootWay(String str) {
            l.d(str, "");
            this.config.setShootway(str);
            return this;
        }

        public final Builder videoId(String str) {
            l.d(str, "");
            this.config.setVideoId(str);
            return this;
        }

        public final Builder videoPath(String str) {
            l.d(str, "");
            this.config.setVideoPath(str);
            return this;
        }
    }

    private PublishConfig() {
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getCreationId() {
        String str = this.creationId;
        if (str == null) {
            l.a("creationId");
        }
        return str;
    }

    public final String getEnterFrom() {
        String str = this.enterFrom;
        if (str == null) {
            l.a("enterFrom");
        }
        return str;
    }

    public final String getShootway() {
        String str = this.shootway;
        if (str == null) {
            l.a("shootway");
        }
        return str;
    }

    public final void setChallenge(String str) {
        this.challenge = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public /* synthetic */ PublishConfig(g gVar) {
        this();
    }

    public final void setCreationId(String str) {
        l.d(str, "");
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        l.d(str, "");
        this.enterFrom = str;
    }

    public final void setShootway(String str) {
        l.d(str, "");
        this.shootway = str;
    }
}
