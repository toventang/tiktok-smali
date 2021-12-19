package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoader {
    static {
        Covode.recordClassIndex(15343);
    }

    boolean load(String str);
}
