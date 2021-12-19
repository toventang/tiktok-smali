package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.g;

public final class PhotoMvAnchorConfig {
    public static final Companion Companion = new Companion(null);
    private MusicModel musicModel;
    private String slideshowMvId;
    private String templateType;

    static {
        Covode.recordClassIndex(79707);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79708);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getSlideshowMvId() {
        return this.slideshowMvId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public final void setSlideshowMvId(String str) {
        this.slideshowMvId = str;
    }

    public final void setTemplateType(String str) {
        this.templateType = str;
    }
}
