package com.bytedance.android.livesdk.rank.impl.f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.view.StarHostView;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(12243);
    }

    public static final StarHostView.b a(Rank rank, int i2, boolean z) {
        User user;
        int i3;
        boolean z2;
        if (rank != null) {
            user = rank.getUser();
        } else {
            user = null;
        }
        if (rank != null) {
            i3 = rank.getComboCount();
            if (rank != null && rank.getRoomId() > 0) {
                z2 = true;
            }
            z2 = false;
        } else {
            i3 = 1;
            z2 = false;
        }
        return new StarHostView.b(user, i2, i3, z2, z);
    }
}
