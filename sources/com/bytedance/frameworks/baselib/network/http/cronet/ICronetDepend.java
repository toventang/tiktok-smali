package com.bytedance.frameworks.baselib.network.http.cronet;

import com.bytedance.covode.number.Covode;

public interface ICronetDepend {
    static {
        Covode.recordClassIndex(17007);
    }

    String getSsCookieKey();

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void setAdapter(ICronetDepend iCronetDepend);
}
