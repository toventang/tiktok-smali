package com.bytedance.android.livesdk.au;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.covode.number.Covode;

public final class a implements ad.b {
    static {
        Covode.recordClassIndex(7849);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
