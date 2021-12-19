package com.ss.android.ugc.playerkit.simapicommon.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    private final List<a> captionInfos;
    private final boolean enableAutoCaption;
    private final boolean hasOriginalAudio;
    private final c originalLanguageInfo;

    static {
        Covode.recordClassIndex(98028);
    }

    public final List<a> getCaptionInfos() {
        return this.captionInfos;
    }

    public final boolean getEnableAutoCaption() {
        return this.enableAutoCaption;
    }

    public final boolean getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    public final c getOriginalLanguageInfo() {
        return this.originalLanguageInfo;
    }

    public b(boolean z, boolean z2, c cVar, List<a> list) {
        l.c(cVar, "");
        l.c(list, "");
        this.enableAutoCaption = z;
        this.hasOriginalAudio = z2;
        this.originalLanguageInfo = cVar;
        this.captionInfos = list;
    }
}
