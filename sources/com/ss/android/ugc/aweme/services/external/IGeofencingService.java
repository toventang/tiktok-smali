package com.ss.android.ugc.aweme.services.external;

import android.widget.FrameLayout;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IGeofencingService {
    static {
        Covode.recordClassIndex(79635);
    }

    void injectGeoFencingSettingItem(Aweme aweme, FrameLayout frameLayout, m mVar);
}
