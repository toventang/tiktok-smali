package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;

public interface i {
    static {
        Covode.recordClassIndex(97998);
    }

    String getFirstFrameKey();

    String getPrepareKey();

    boolean isLoop();

    boolean isPlayLoop();
}
