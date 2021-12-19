package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public interface IImplService {
    static {
        Covode.recordClassIndex(65495);
    }

    boolean enableExpressionTab();

    a getRelationListAdapter(boolean z);

    boolean isMtCase();

    boolean isUserVerified(IMUser iMUser);

    boolean needAwemeMsgShowFollow();

    boolean needSessionListShowMore();

    void setupStatusBar(Activity activity);
}
