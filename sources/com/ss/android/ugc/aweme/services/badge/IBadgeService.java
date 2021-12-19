package com.ss.android.ugc.aweme.services.badge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IBadgeService {
    static {
        Covode.recordClassIndex(79582);
    }

    void showBadgeShareDialog(Activity activity, Aweme aweme);
}
