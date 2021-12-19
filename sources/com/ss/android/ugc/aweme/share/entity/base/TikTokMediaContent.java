package com.ss.android.ugc.aweme.share.entity.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.openshare.entity.a;

public class TikTokMediaContent {
    public a mMediaObject;

    static {
        Covode.recordClassIndex(81072);
    }

    public TikTokMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        a aVar = this.mMediaObject;
        if (aVar == null) {
            return 0;
        }
        return aVar.type();
    }

    public TikTokMediaContent(a aVar) {
        this.mMediaObject = aVar;
    }
}
