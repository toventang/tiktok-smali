package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

class AVClassLoad {
    static {
        Covode.recordClassIndex(101294);
    }

    AVClassLoad() {
    }

    static Object getClassLoader() {
        return AVClassLoad.class.getClassLoader();
    }
}
