package com.bytedance.bae.base;

import com.bytedance.covode.number.Covode;

class WebRtcClassLoader {
    static {
        Covode.recordClassIndex(15357);
    }

    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        return WebRtcClassLoader.class.getClassLoader();
    }
}
