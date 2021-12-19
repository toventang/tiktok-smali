package com.ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.util.Map;

public interface IModelCache {
    static {
        Covode.recordClassIndex(95269);
    }

    String getCacheDir();

    LocalModelInfo getLocalModelInfoByName(String str, MonitorTrace monitorTrace);

    Map<String, LocalModelInfo> getLocalModelInfoList();

    boolean isBuiltInResource(String str);
}
