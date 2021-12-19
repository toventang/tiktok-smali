package com.ss.android.ugc.aweme.preinstall;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IPreInstallService {
    static {
        Covode.recordClassIndex(74655);
    }

    void initOnAppCreate(Context context, a aVar);
}
