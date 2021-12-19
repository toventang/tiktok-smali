package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.common.KakaoContextService;
import com.kakao.util.KakaoUtilService;
import com.kakao.util.helper.log.Logger;
import com.zhiliaoapp.musically.R;

public class TalkAuthCodeService implements AuthCodeService {
    protected Context context;
    protected KakaoContextService contextService;
    protected KakaoUtilService protocolService;
    protected ISessionConfig sessionConfig;

    static {
        Covode.recordClassIndex(34303);
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean isLoginAvailable() {
        if (createLoggedInActivityIntent(null) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public String redirectUriString() {
        return "kakao" + this.contextService.phaseInfo().appKey() + "://oauth";
    }

    public static Bundle com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isCapriProtocolMatched(Intent intent) {
        if (1 == intent.getIntExtra("com.kakao.sdk.talk.protocol.version", 0)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Intent createLoggedInActivityIntent(Bundle bundle) {
        int i2;
        ApprovalType approvalType = this.sessionConfig.getApprovalType();
        Intent createIntent = createIntent("com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY", this.contextService.phaseInfo().appKey(), redirectUriString(), bundle);
        KakaoUtilService kakaoUtilService = this.protocolService;
        Context context2 = this.context;
        if (approvalType == ApprovalType.PROJECT) {
            i2 = 178;
        } else {
            i2 = 139;
        }
        return kakaoUtilService.resolveIntent(context2, createIntent, i2);
    }

    /* access modifiers changed from: package-private */
    public void startActivityForResult(StartActivityWrapper startActivityWrapper, Intent intent, int i2) {
        if (startActivityWrapper != null) {
            startActivityWrapper.startActivityForResult(intent, i2);
        }
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean requestAuthCode(AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper, AuthCodeListener authCodeListener) {
        Intent createLoggedInActivityIntent = createLoggedInActivityIntent(authCodeRequest.getExtraParams());
        if (createLoggedInActivityIntent == null) {
            return false;
        }
        startActivityForResult(startActivityWrapper, createLoggedInActivityIntent, authCodeRequest.getRequestCode().intValue());
        return true;
    }

    /* access modifiers changed from: package-private */
    public AuthorizationResult parseAuthCodeIntent(int i2, int i3, Intent intent) {
        String string;
        String string2;
        if (intent == null || i3 == 0) {
            return AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.w_));
        }
        if (isCapriProtocolMatched(intent)) {
            return AuthorizationResult.createAuthCodeOAuthErrorResult("TalkProtocol is mismatched during requesting auth code through KakaoTalk.");
        }
        if (i3 != -1) {
            return AuthorizationResult.createAuthCodeOAuthErrorResult("got unexpected resultCode during requesting auth code. code=".concat(String.valueOf(i2)));
        }
        Bundle com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        String str = null;
        if (com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            string = null;
        } else {
            string = com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("com.kakao.sdk.talk.error.type");
            str = com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("com.kakao.sdk.talk.redirectUrl");
            if (string == null && str != null && str.startsWith(redirectUriString())) {
                Uri parse = Uri.parse(str);
                if (!TextUtils.isEmpty(parse.getQueryParameter("code"))) {
                    return AuthorizationResult.createSuccessAuthCodeResult(str);
                }
                String queryParameter = parse.getQueryParameter("error");
                String queryParameter2 = parse.getQueryParameter("error_description");
                if (queryParameter == null || !queryParameter.equalsIgnoreCase("access_denied")) {
                    return AuthorizationResult.createAuthCodeOAuthErrorResult(queryParameter2);
                }
                return AuthorizationResult.createAuthCodeCancelResult(this.context.getString(R.string.w_));
            } else if (com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                string2 = com_kakao_auth_authorization_authcode_TalkAuthCodeService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("com.kakao.sdk.talk.error.description");
                if (string != null || !string.equals("NotSupportError")) {
                    return AuthorizationResult.createAuthCodeOAuthErrorResult("redirectURL=" + str + ", " + string + " : " + string2);
                }
                if (string2 != null) {
                    Logger.i(string2, new Object[0]);
                }
                return AuthorizationResult.createAuthCodePassResult();
            }
        }
        string2 = "No result was passed from KakaoTalk.";
        if (string != null) {
        }
        return AuthorizationResult.createAuthCodeOAuthErrorResult("redirectURL=" + str + ", " + string + " : " + string2);
    }

    TalkAuthCodeService(Context context2, KakaoContextService kakaoContextService, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
        this.context = context2;
        this.contextService = kakaoContextService;
        this.sessionConfig = iSessionConfig;
        this.protocolService = kakaoUtilService;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean handleActivityResult(int i2, int i3, Intent intent, AuthCodeListener authCodeListener) {
        AuthorizationResult parseAuthCodeIntent = parseAuthCodeIntent(i2, i3, intent);
        if (parseAuthCodeIntent.isPass()) {
            return false;
        }
        authCodeListener.onAuthCodeReceived(i2, parseAuthCodeIntent);
        return true;
    }

    /* access modifiers changed from: protected */
    public Intent createIntent(String str, String str2, String str3, Bundle bundle) {
        Intent putExtra = new Intent().setAction(str).addCategory("android.intent.category.DEFAULT").putExtra("com.kakao.sdk.talk.protocol.version", 1).putExtra("com.kakao.sdk.talk.appKey", str2).putExtra("com.kakao.sdk.talk.redirectUri", str3).putExtra("com.kakao.sdk.talk.kaHeader", this.contextService.getAppConfiguration().getKAHeader());
        if (bundle != null && !bundle.isEmpty()) {
            putExtra.putExtra("com.kakao.sdk.talk.extraparams", bundle);
        }
        putExtra.addFlags(65536);
        return putExtra;
    }
}
