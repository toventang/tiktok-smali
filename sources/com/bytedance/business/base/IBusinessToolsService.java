package com.bytedance.business.base;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public interface IBusinessToolsService extends IBugReportService {
    static {
        Covode.recordClassIndex(15729);
    }

    void initialize(Application application, BusinessToolsConfig businessToolsConfig);
}
