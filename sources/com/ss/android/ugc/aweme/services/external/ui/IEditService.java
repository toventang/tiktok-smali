package com.ss.android.ugc.aweme.services.external.ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IEditService {
    static {
        Covode.recordClassIndex(79695);
    }

    void startEdit(Context context, EditConfig editConfig);

    void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig);
}
