package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public final class RecommendUserHint extends User {
    private int recDialogType;

    static {
        Covode.recordClassIndex(61603);
    }

    public final int getRecDialogType() {
        return this.recDialogType;
    }

    public final void setRecDialogType(int i2) {
        this.recDialogType = i2;
    }
}
