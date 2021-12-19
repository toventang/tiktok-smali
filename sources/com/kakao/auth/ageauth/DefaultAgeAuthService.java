package com.kakao.auth.ageauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.authorization.authcode.KakaoWebViewActivity;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.Utility;
import com.kakao.util.helper.log.Logger;
import com.ss.android.ugc.tiktok.security.a.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultAgeAuthService implements AgeAuthService {
    private static DefaultAgeAuthService instance;
    public Handler sHandler;

    static {
        Covode.recordClassIndex(34264);
    }

    /* access modifiers changed from: package-private */
    public static class AgeAuthResult {
        private KakaoException exception;
        private AtomicInteger result = new AtomicInteger();

        static {
            Covode.recordClassIndex(34267);
        }

        public KakaoException getException() {
            return this.exception;
        }

        public AtomicInteger getResult() {
            return this.result;
        }

        public void setException(KakaoException kakaoException) {
            this.exception = kakaoException;
        }

        public void setResult(AtomicInteger atomicInteger) {
            this.result = atomicInteger;
        }
    }

    public static DefaultAgeAuthService getInstance() {
        if (instance == null) {
            instance = new DefaultAgeAuthService(new Handler(Looper.getMainLooper()));
        }
        return instance;
    }

    DefaultAgeAuthService(Handler handler) {
        this.sHandler = handler;
    }

    public static void com_kakao_auth_ageauth_DefaultAgeAuthService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.kakao.auth.ageauth.AgeAuthService
    public int requestAgeAuth(final Bundle bundle, final Context context) {
        final AgeAuthResult ageAuthResult = new AgeAuthResult();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.sHandler.post(new Runnable() {
            /* class com.kakao.auth.ageauth.DefaultAgeAuthService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34265);
            }

            public void run() {
                try {
                    DefaultAgeAuthService.this.requestWebviewAuth(context, bundle, new ResultReceiver(DefaultAgeAuthService.this.sHandler) {
                        /* class com.kakao.auth.ageauth.DefaultAgeAuthService.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(34266);
                        }

                        /* access modifiers changed from: protected */
                        public void onReceiveResult(int i2, Bundle bundle) {
                            int value = AuthService.AgeAuthStatus.CLIENT_ERROR.getValue();
                            if (i2 == 0) {
                                String string = bundle.getString("key.redirect.url");
                                if (!(string == null || Uri.parse(string).getQueryParameter("status") == null)) {
                                    value = Integer.valueOf(Uri.parse(string).getQueryParameter("status")).intValue();
                                }
                            } else if (i2 == 1) {
                                ageAuthResult.setException((KakaoException) bundle.getSerializable("key.exception"));
                            }
                            ageAuthResult.getResult().set(value);
                            countDownLatch.countDown();
                        }
                    });
                } catch (Exception e2) {
                    ageAuthResult.getResult().set(AuthService.AgeAuthStatus.CLIENT_ERROR.getValue());
                    ageAuthResult.setException(new KakaoException(e2));
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            Logger.e(e2.toString());
        }
        if (ageAuthResult.getException() == null) {
            return ageAuthResult.getResult().get();
        }
        throw ageAuthResult.getException();
    }

    public boolean requestWebviewAuth(Context context, Bundle bundle, ResultReceiver resultReceiver) {
        boolean isUsingWebviewTimer = KakaoSDK.getAdapter().getSessionConfig().isUsingWebviewTimer();
        Uri buildUri = Utility.buildUri(ServerProtocol.accountAuthority(), "ageauths/main.html", bundle);
        Logger.d("AgeAuth request Url : ".concat(String.valueOf(buildUri)));
        Intent newIntent = KakaoWebViewActivity.newIntent(context);
        newIntent.putExtra("key.url", buildUri.toString());
        newIntent.putExtra("key.use.webview.timers", isUsingWebviewTimer);
        newIntent.putExtra("key.result.receiver", resultReceiver);
        com_kakao_auth_ageauth_DefaultAgeAuthService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, newIntent);
        return true;
    }
}
