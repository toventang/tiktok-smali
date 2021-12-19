package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.common.KakaoContextService;
import com.kakao.util.KakaoUtilService;

public interface AuthCodeService {
    static {
        Covode.recordClassIndex(34287);
    }

    boolean handleActivityResult(int i2, int i3, Intent intent, AuthCodeListener authCodeListener);

    boolean isLoginAvailable();

    boolean requestAuthCode(AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper, AuthCodeListener authCodeListener);

    public static class Factory {
        static {
            Covode.recordClassIndex(34288);
        }

        static AuthCodeService createWebService(Context context, Handler handler, ISessionConfig iSessionConfig) {
            return new WebAuthCodeService(context, handler, iSessionConfig);
        }

        static AuthCodeService createStoryService(Context context, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
            return new StoryAuthCodeService(context, KakaoContextService.getInstance(), iSessionConfig, kakaoUtilService);
        }

        static AuthCodeService createTalkService(Context context, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
            return new TalkAuthCodeService(context, KakaoContextService.getInstance(), iSessionConfig, kakaoUtilService);
        }
    }
}
