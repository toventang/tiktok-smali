package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.IPublishPageService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.ITestActivityService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;

public interface IUIService {
    static {
        Covode.recordClassIndex(79646);
    }

    IVideo2GifUIService abilityUiService();

    IDraftService draftService();

    IEditService editService();

    IPublishPageService publishService();

    IRecordService recordService();

    ITestActivityService schemaTestService();

    void startSuperEntraceActivity(Context context);
}
