package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;

public class TTClassLoad {
    static {
        Covode.recordClassIndex(100608);
    }

    static Object getClassLoader() {
        return TTClassLoad.class.getClassLoader();
    }
}
