package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.log.Logger;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public class WebAuthCodeService implements AuthCodeService {
    private Context context;
    private Handler handler;
    private ISessionConfig sessionConfig;

    static {
        Covode.recordClassIndex(34304);
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean handleActivityResult(int i2, int i3, Intent intent, AuthCodeListener authCodeListener) {
        return false;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean isLoginAvailable() {
        return true;
    }

    private Bundle getFullScreenOptions(StartActivityWrapper startActivityWrapper) {
        Window window;
        Activity activity = (Activity) startActivityWrapper.getContext();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i2 = window.getAttributes().flags;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            i3 = window.getAttributes().layoutInDisplayCutoutMode;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key.system.ui.visibility", systemUiVisibility);
        bundle.putInt("key.window.flags", i2);
        bundle.putInt("key.layout.in.display.cutout.mode", i3);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void startActivity(StartActivityWrapper startActivityWrapper, Intent intent) {
        startActivityWrapper.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public ResultReceiver getResultReceiver(final AuthCodeRequest authCodeRequest, final AuthCodeListener authCodeListener) {
        return new ResultReceiver(this.handler) {
            /* class com.kakao.auth.authorization.authcode.WebAuthCodeService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34305);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i2, Bundle bundle) {
                WebAuthCodeService.this.onReceivedResult(authCodeRequest.getRequestCode().intValue(), i2, bundle, authCodeListener);
            }
        };
    }

    WebAuthCodeService(Context context2, Handler handler2, ISessionConfig iSessionConfig) {
        this.context = context2;
        this.handler = handler2;
        this.sessionConfig = iSessionConfig;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean requestAuthCode(AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper, AuthCodeListener authCodeListener) {
        try {
            startActivity(startActivityWrapper, createAuthorizeIntentWithUri(startActivityWrapper, authCodeRequest, authCodeListener));
            return true;
        } catch (Throwable th) {
            Logger.e("WebViewAuthHandler failed", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public Intent createAuthorizeIntentWithUri(StartActivityWrapper startActivityWrapper, AuthCodeRequest authCodeRequest, AuthCodeListener authCodeListener) {
        Intent newIntent = KakaoWebViewActivity.newIntent(startActivityWrapper.getContext());
        if (authCodeRequest.getAccountUri() != null) {
            newIntent.putExtra("key.url", authCodeRequest.getAccountUri().toString());
        }
        newIntent.putExtra("key.extra.headers", authCodeRequest.getExtraHeaders());
        newIntent.putExtra("key.use.webview.timers", this.sessionConfig.isUsingWebviewTimer());
        newIntent.putExtra("key.result.receiver", getResultReceiver(authCodeRequest, authCodeListener));
        newIntent.putExtra("key.fullscreen.options", getFullScreenOptions(startActivityWrapper));
        return newIntent;
    }

    /* access modifiers changed from: package-private */
    public void onReceivedResult(int i2, int i3, Bundle bundle, AuthCodeListener authCodeListener) {
        KakaoException kakaoException;
        String str = null;
        if (i3 == 0) {
            kakaoException = null;
            str = bundle.getString("key.redirect.url");
        } else if (i3 != 1) {
            kakaoException = null;
        } else {
            kakaoException = (KakaoException) bundle.getSerializable("key.exception");
        }
        onWebViewCompleted(i2, str, kakaoException, authCodeListener);
    }

    /* access modifiers changed from: package-private */
    public void onWebViewCompleted(int i2, String str, KakaoException kakaoException, AuthCodeListener authCodeListener) {
        AuthorizationResult authorizationResult;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(parse.getQueryParameter("code"))) {
                authCodeListener.onAuthCodeReceived(i2, AuthorizationResult.createSuccessAuthCodeResult(str));
                return;
            }
            String queryParameter = parse.getQueryParameter("error");
            String queryParameter2 = parse.getQueryParameter("error_description");
            if (queryParameter == null || !queryParameter.equalsIgnoreCase("access_denied")) {
                authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult(queryParameter2);
            } else {
                authorizationResult = AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.w_));
            }
        } else if (kakaoException == null) {
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult("Failed to get Authorization Code.");
        } else if (kakaoException.isCancledOperation()) {
            authorizationResult = AuthorizationResult.createAuthCodeCancelResult(kakaoException.getMessage());
        } else {
            authorizationResult = AuthorizationResult.createAuthCodeOAuthErrorResult(kakaoException);
        }
        authCodeListener.onAuthCodeReceived(i2, authorizationResult);
    }
}
