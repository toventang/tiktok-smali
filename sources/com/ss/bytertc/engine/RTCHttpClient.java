package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public interface RTCHttpClient {

    public interface RtcHttpCallback {
        static {
            Covode.recordClassIndex(100807);
        }

        void run(int i2, String str);
    }

    static {
        Covode.recordClassIndex(100806);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i2);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i2);
}
