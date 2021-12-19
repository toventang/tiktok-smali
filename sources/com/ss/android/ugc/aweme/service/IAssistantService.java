package com.ss.android.ugc.aweme.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IAssistantService {
    static {
        Covode.recordClassIndex(79350);
    }

    void openPage(Context context);

    void register();
}
