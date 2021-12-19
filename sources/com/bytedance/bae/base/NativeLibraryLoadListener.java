package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoadListener {
    static {
        Covode.recordClassIndex(15342);
    }

    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
