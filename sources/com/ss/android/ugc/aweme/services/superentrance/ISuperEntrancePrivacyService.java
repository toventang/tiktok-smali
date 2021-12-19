package com.ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ISuperEntrancePrivacyService {
    static {
        Covode.recordClassIndex(79831);
    }

    boolean hasPrivacyPermission(Context context);
}
