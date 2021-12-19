package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

public interface IComplianceService {
    static {
        Covode.recordClassIndex(79628);
    }

    boolean getMusicPreventDownload();

    int getPublishPermission();
}
