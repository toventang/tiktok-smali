package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;

public interface IAbnormalExitLogService {
    static {
        Covode.recordClassIndex(79626);
    }

    void logAppAbnormalExit();

    void logRestoreDialogClick(boolean z);

    void logRestoreDialogShow();
}
