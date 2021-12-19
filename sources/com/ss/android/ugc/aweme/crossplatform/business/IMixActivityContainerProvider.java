package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;

public interface IMixActivityContainerProvider {
    static {
        Covode.recordClassIndex(48811);
    }

    MixActivityContainer a(Activity activity, a aVar);
}
