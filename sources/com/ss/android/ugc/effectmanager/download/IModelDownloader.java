package com.ss.android.ugc.effectmanager.download;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

public interface IModelDownloader {
    static {
        Covode.recordClassIndex(95363);
    }

    long download(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace monitorTrace);
}
