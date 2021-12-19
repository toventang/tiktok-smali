package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class VideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final String filePath;

    static {
        Covode.recordClassIndex(79720);
    }

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public VideoMedia(String str) {
        l.d(str, "");
        this.filePath = str;
    }
}
