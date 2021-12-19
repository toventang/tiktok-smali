package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public interface LibraryLoaderProxy {
    static {
        Covode.recordClassIndex(28041);
    }

    boolean loadLibrary(String str);
}
