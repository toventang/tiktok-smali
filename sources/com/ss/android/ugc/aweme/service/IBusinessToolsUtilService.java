package com.ss.android.ugc.aweme.service;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public interface IBusinessToolsUtilService {
    static {
        Covode.recordClassIndex(79351);
    }

    void initBusinessToolsLogic(Application application);
}
