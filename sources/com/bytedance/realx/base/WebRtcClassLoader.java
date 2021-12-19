package com.bytedance.realx.base;

import com.bytedance.covode.number.Covode;

class WebRtcClassLoader {
    static {
        Covode.recordClassIndex(25936);
    }

    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
