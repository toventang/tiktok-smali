package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public interface LoaderListener {
    static {
        Covode.recordClassIndex(101128);
    }

    void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskStart(LoaderEventInfo loaderEventInfo);
}
