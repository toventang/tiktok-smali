package com.ss.android.ugc.aweme.services.cutvideo;

import com.bytedance.covode.number.Covode;

public interface ISplitVideoService {
    static {
        Covode.recordClassIndex(79594);
    }

    boolean playListAutoTake();

    boolean showPlayList();
}
