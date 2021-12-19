package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.authorization.authcode.AuthCodeService;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.common.KakaoContextService;
import com.kakao.util.KakaoUtilService;
import java.util.List;
import java.util.Map;

public interface AuthCodeManager {
    static {
        Covode.recordClassIndex(34284);
    }

    boolean handleActivityResult(int i2, int i3, Intent intent);

    boolean isStoryLoginAvailable();

    boolean isTalkLoginAvailable();

    void requestAuthCode(AuthType authType, Activity activity, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, Fragment fragment, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper, Map<String, String> map, AuthCodeCallback authCodeCallback);

    void requestAuthCodeWithCustomAccountsUrl(StartActivityWrapper startActivityWrapper, Map<String, String> map, String str, Map<String, String> map2, AuthCodeCallback authCodeCallback);

    void requestAuthCodeWithScopes(AuthType authType, StartActivityWrapper startActivityWrapper, List<String> list, AuthCodeCallback authCodeCallback);

    public static class Factory {
        private static AuthCodeManager authCodeManager;

        static {
            Covode.recordClassIndex(34285);
        }

        public static AuthCodeManager getInstance() {
            return authCodeManager;
        }

        public static AuthCodeManager initialize(Application application, ISessionConfig iSessionConfig) {
            if (authCodeManager == null) {
                authCodeManager = new KakaoAuthCodeManager(KakaoContextService.getInstance(), iSessionConfig, AuthCodeService.Factory.createTalkService(application, iSessionConfig, KakaoUtilService.Factory.getInstance()), AuthCodeService.Factory.createStoryService(application, iSessionConfig, KakaoUtilService.Factory.getInstance()), AuthCodeService.Factory.createWebService(application, new Handler(Looper.getMainLooper()), iSessionConfig));
            }
            return authCodeManager;
        }
    }
}
