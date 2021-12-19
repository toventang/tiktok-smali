package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

public interface IVideoCoverService {
    static {
        Covode.recordClassIndex(79851);
    }

    void getVideoCoverByCallback(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback);
}
