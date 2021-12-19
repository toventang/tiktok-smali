package com.ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ISuperEntranceService {
    static {
        Covode.recordClassIndex(79832);
    }

    List<String> getSuperEntranceEffectList();

    boolean isNeedShowSuperEntranceTabDirect();

    boolean isSuperEntranceResReady();

    void preDownloadSuperEntranceRes(Context context);

    void setShowedSuperEntranceTab();

    void setSuperEntranceRecordClicked(Context context, boolean z);

    boolean shouldShowSuperEntranceRecord(Context context);

    boolean shouldStartSuperEntrance(Context context);
}
