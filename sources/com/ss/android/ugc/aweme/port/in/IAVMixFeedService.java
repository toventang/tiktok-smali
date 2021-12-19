package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IAVMixFeedService {
    static {
        Covode.recordClassIndex(74484);
    }

    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();

    void showAddToMixInPublishPage(Activity activity, ah ahVar, String str, String str2, String str3, String str4);

    void updateFeedEvent();
}
