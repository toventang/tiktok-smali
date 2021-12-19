package com.kakao.auth;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IApplicationConfig {
    static {
        Covode.recordClassIndex(34238);
    }

    Context getApplicationContext();
}
