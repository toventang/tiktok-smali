package com.kakao.auth.helper;

import android.app.Activity;
import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.KakaoSDK;

public interface CurrentActivityProvider {
    static {
        Covode.recordClassIndex(34316);
    }

    Activity getCurrentActivity();

    public static class Factory {
        private static CurrentActivityProvider instance = new DefaultCurrentActivityProvider((Application) KakaoSDK.getAdapter().getApplicationConfig().getApplicationContext());

        public static CurrentActivityProvider getInstance() {
            return instance;
        }

        static {
            Covode.recordClassIndex(34317);
        }
    }
}
