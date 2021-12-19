package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;

public interface AVApi {
    static {
        Covode.recordClassIndex(90745);
    }

    <T> T a(String str, Class<T> cls);

    String a();
}
