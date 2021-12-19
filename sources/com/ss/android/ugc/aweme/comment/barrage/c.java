package com.ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;

public final class c extends Comment implements Serializable {
    private final Aweme aweme;
    private boolean isAnchorsFold = true;
    private boolean isTaggedPeopleFold = true;
    private final b mobParams;

    static {
        Covode.recordClassIndex(44035);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final b getMobParams() {
        return this.mobParams;
    }

    public final boolean isAnchorsFold() {
        return this.isAnchorsFold;
    }

    public final boolean isTaggedPeopleFold() {
        return this.isTaggedPeopleFold;
    }

    public final void setAnchorsFold(boolean z) {
        this.isAnchorsFold = z;
    }

    public final void setTaggedPeopleFold(boolean z) {
        this.isTaggedPeopleFold = z;
    }

    public c(Aweme aweme2, b bVar) {
        l.d(aweme2, "");
        l.d(bVar, "");
        this.aweme = aweme2;
        this.mobParams = bVar;
    }
}
