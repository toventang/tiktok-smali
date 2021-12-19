package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface LibraryLoaderProxy {
    static {
        Covode.recordClassIndex(28020);
    }

    boolean loadLibrary(String str);
}
