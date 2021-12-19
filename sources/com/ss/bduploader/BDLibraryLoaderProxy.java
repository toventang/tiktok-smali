package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDLibraryLoaderProxy {
    static {
        Covode.recordClassIndex(100645);
    }

    boolean loadLibrary(String str);
}
