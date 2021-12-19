package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTLibraryLoaderProxy {
    static {
        Covode.recordClassIndex(101394);
    }

    boolean loadLibrary(String str);
}
