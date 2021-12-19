package com.ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.video.i;

public final class u {
    static {
        Covode.recordClassIndex(59197);
    }

    public static i a(Activity activity) {
        if (activity instanceof e) {
            return FeedSharePlayerViewModel.getPlayerManager((e) activity);
        }
        return null;
    }

    public static boolean b(Activity activity) {
        if (a(activity) != null) {
            return true;
        }
        return false;
    }
}
