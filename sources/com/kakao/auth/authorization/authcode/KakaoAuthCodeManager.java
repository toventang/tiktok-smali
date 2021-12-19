package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.AuthorizationResult;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.common.KakaoContextService;
import com.kakao.network.ServerProtocol;
import com.kakao.util.helper.Utility;
import com.kakao.util.helper.log.Logger;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* access modifiers changed from: package-private */
public class KakaoAuthCodeManager implements AuthCodeListener, AuthCodeManager {
    private final Queue<AuthCodeService> authCodeManagers = new LinkedList();
    private KakaoContextService contextService;
    private AuthCodeRequest currentRequest;
    private AuthCodeService kakaoManager;
    private final int requestCode = 1001;
    private final ISessionConfig sessionConfig;
    private StartActivityWrapper startActivityWrapper;
    private AuthCodeService storyManager;
    private AuthCodeService webManager;

    static {
        Covode.recordClassIndex(34291);
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public boolean isStoryLoginAvailable() {
        return this.storyManager.isLoginAvailable();
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public boolean isTalkLoginAvailable() {
        return this.kakaoManager.isLoginAvailable();
    }

    /* access modifiers changed from: package-private */
    public String getRefreshToken() {
        try {
            return Session.getCurrentSession().getTokenInfo().getRefreshToken();
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.kakao.auth.authorization.authcode.KakaoAuthCodeManager$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$kakao$auth$AuthType;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 34292(0x85f4, float:4.8053E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.kakao.auth.AuthType[] r0 = com.kakao.auth.AuthType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.AnonymousClass1.$SwitchMap$com$kakao$auth$AuthType = r2
                com.kakao.auth.AuthType r0 = com.kakao.auth.AuthType.KAKAO_TALK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.AnonymousClass1.$SwitchMap$com$kakao$auth$AuthType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.kakao.auth.AuthType r0 = com.kakao.auth.AuthType.KAKAO_TALK_ONLY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.AnonymousClass1.$SwitchMap$com$kakao$auth$AuthType     // Catch:{ NoSuchFieldError -> 0x002e }
                com.kakao.auth.AuthType r0 = com.kakao.auth.AuthType.KAKAO_STORY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.AnonymousClass1.$SwitchMap$com$kakao$auth$AuthType     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.kakao.auth.AuthType r0 = com.kakao.auth.AuthType.KAKAO_LOGIN_ALL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.AnonymousClass1.<clinit>():void");
        }
    }

    private String getRedirectUri(String str) {
        return "kakao" + str + "://oauth";
    }

    /* access modifiers changed from: package-private */
    public String getScopesString(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = null;
        for (String str : list) {
            if (sb != null) {
                sb.append(",");
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    private void addToAuthCodeServicesQueue(AuthType authType) {
        if (authType == null) {
            authType = AuthType.KAKAO_TALK;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$kakao$auth$AuthType[authType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.authCodeManagers.add(this.kakaoManager);
        } else if (i2 == 3) {
            this.authCodeManagers.add(this.storyManager);
        } else if (i2 == 4) {
            this.authCodeManagers.add(this.kakaoManager);
            this.authCodeManagers.add(this.storyManager);
        }
        if (authType != AuthType.KAKAO_TALK_ONLY) {
            this.authCodeManagers.add(this.webManager);
        }
    }

    /* access modifiers changed from: package-private */
    public Uri createScopeUpdateUri(AuthCodeRequest authCodeRequest) {
        Bundle bundle = new Bundle();
        bundle.putString("client_id", authCodeRequest.getAppKey());
        bundle.putString("redirect_uri", authCodeRequest.getRedirectURI());
        bundle.putString("response_type", "code");
        Bundle extraParams = authCodeRequest.getExtraParams();
        if (extraParams != null && !extraParams.isEmpty()) {
            for (String str : extraParams.keySet()) {
                String string = extraParams.getString(str);
                if (string != null) {
                    bundle.putString(str, string);
                }
            }
        }
        return Utility.buildUri(ServerProtocol.authAuthority(), "oauth/authorize", bundle);
    }

    /* access modifiers changed from: package-private */
    public void tryNextAuthCodeService(AuthCodeRequest authCodeRequest) {
        AuthCodeCallback callback = authCodeRequest.getCallback();
        while (true) {
            AuthCodeService peek = this.authCodeManagers.peek();
            if (peek != null) {
                Logger.d("trying " + peek.getClass().getSimpleName());
                if (!peek.requestAuthCode(authCodeRequest, this.startActivityWrapper, this)) {
                    this.authCodeManagers.poll();
                } else {
                    return;
                }
            } else if (callback != null) {
                onAuthCodeReceived(authCodeRequest.getRequestCode().intValue(), AuthorizationResult.createAuthCodeOAuthErrorResult("Failed to get Authorization Code."));
                return;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AuthCodeRequest createAuthCodeRequest(String str, AuthCodeCallback authCodeCallback) {
        ApprovalType approvalType;
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(str, getRedirectUri(str), 1001, authCodeCallback);
        if (this.sessionConfig.getApprovalType() == null) {
            approvalType = ApprovalType.INDIVIDUAL;
        } else {
            approvalType = this.sessionConfig.getApprovalType();
        }
        authCodeRequest.putExtraParam("approval_type", approvalType.toString());
        return authCodeRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    @Override // com.kakao.auth.authorization.authcode.AuthCodeListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAuthCodeReceived(int r7, com.kakao.auth.authorization.AuthorizationResult r8) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.authorization.authcode.KakaoAuthCodeManager.onAuthCodeReceived(int, com.kakao.auth.authorization.AuthorizationResult):void");
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCode(AuthType authType, Activity activity, AuthCodeCallback authCodeCallback) {
        requestAuthCode(authType, new StartActivityWrapper(activity), authCodeCallback);
    }

    /* access modifiers changed from: package-private */
    public void startTryingAuthCodeServices(AuthType authType, AuthCodeRequest authCodeRequest, StartActivityWrapper startActivityWrapper2) {
        addToAuthCodeServicesQueue(authType);
        this.currentRequest = authCodeRequest;
        this.startActivityWrapper = startActivityWrapper2;
        tryNextAuthCodeService(authCodeRequest);
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCode(AuthType authType, Fragment fragment, AuthCodeCallback authCodeCallback) {
        requestAuthCode(authType, new StartActivityWrapper(fragment), authCodeCallback);
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public boolean handleActivityResult(int i2, int i3, Intent intent) {
        if (this.currentRequest == null) {
            Logger.w("Auth code was not requested or the request has already been processed.");
            return false;
        }
        AuthCodeService poll = this.authCodeManagers.poll();
        if (poll != null && poll.handleActivityResult(i2, i3, intent, this)) {
            return true;
        }
        tryNextAuthCodeService(this.currentRequest);
        return true;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper2, AuthCodeCallback authCodeCallback) {
        AuthCodeRequest createAuthCodeRequest = createAuthCodeRequest(this.contextService.phaseInfo().appKey(), authCodeCallback);
        createAuthCodeRequest.setAccountUri(createAccountUri(createAuthCodeRequest, "kakao_accounts/view/login", null));
        startTryingAuthCodeServices(authType, createAuthCodeRequest, startActivityWrapper2);
    }

    /* access modifiers changed from: package-private */
    public Uri createAccountUri(AuthCodeRequest authCodeRequest, String str, Map<String, String> map) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(ServerProtocol.accountAuthority()).path(str).appendQueryParameter("continue", createScopeUpdateUri(authCodeRequest).toString());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return appendQueryParameter.build();
    }

    /* access modifiers changed from: package-private */
    public AuthCodeRequest createAuthCodeRequest(String str, Map<String, String> map, AuthCodeCallback authCodeCallback) {
        ApprovalType approvalType;
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(str, getRedirectUri(str), 1001, authCodeCallback);
        if (this.sessionConfig.getApprovalType() == null) {
            approvalType = ApprovalType.INDIVIDUAL;
        } else {
            approvalType = this.sessionConfig.getApprovalType();
        }
        authCodeRequest.putExtraParam("approval_type", approvalType.toString());
        if (map == null) {
            return authCodeRequest;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            authCodeRequest.putExtraParam(entry.getKey(), entry.getValue());
        }
        return authCodeRequest;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCodeWithScopes(AuthType authType, StartActivityWrapper startActivityWrapper2, List<String> list, AuthCodeCallback authCodeCallback) {
        AuthCodeRequest createAuthCodeRequest = createAuthCodeRequest(this.contextService.phaseInfo().appKey(), getRefreshToken(), list, authCodeCallback);
        createAuthCodeRequest.setAccountUri(createScopeUpdateUri(createAuthCodeRequest));
        startTryingAuthCodeServices(authType, createAuthCodeRequest, startActivityWrapper2);
    }

    /* access modifiers changed from: package-private */
    public AuthCodeRequest createAuthCodeRequest(String str, String str2, List<String> list, AuthCodeCallback authCodeCallback) {
        ApprovalType approvalType;
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(str, getRedirectUri(str), 1001, authCodeCallback);
        authCodeRequest.putExtraHeader("RT", str2);
        authCodeRequest.putExtraParam("scope", getScopesString(list));
        if (this.sessionConfig.getApprovalType() == null) {
            approvalType = ApprovalType.INDIVIDUAL;
        } else {
            approvalType = this.sessionConfig.getApprovalType();
        }
        authCodeRequest.putExtraParam("approval_type", approvalType.toString());
        return authCodeRequest;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper2, Map<String, String> map, AuthCodeCallback authCodeCallback) {
        AuthCodeRequest createAuthCodeRequest = createAuthCodeRequest(this.contextService.phaseInfo().appKey(), map, authCodeCallback);
        createAuthCodeRequest.setAccountUri(createAccountUri(createAuthCodeRequest, "kakao_accounts/view/login", null));
        startTryingAuthCodeServices(authType, createAuthCodeRequest, startActivityWrapper2);
    }

    KakaoAuthCodeManager(KakaoContextService kakaoContextService, ISessionConfig iSessionConfig, AuthCodeService authCodeService, AuthCodeService authCodeService2, AuthCodeService authCodeService3) {
        this.contextService = kakaoContextService;
        this.sessionConfig = iSessionConfig;
        this.kakaoManager = authCodeService;
        this.storyManager = authCodeService2;
        this.webManager = authCodeService3;
    }

    @Override // com.kakao.auth.authorization.authcode.AuthCodeManager
    public void requestAuthCodeWithCustomAccountsUrl(StartActivityWrapper startActivityWrapper2, Map<String, String> map, String str, Map<String, String> map2, AuthCodeCallback authCodeCallback) {
        AuthCodeRequest createAuthCodeRequest = createAuthCodeRequest(this.contextService.phaseInfo().appKey(), authCodeCallback);
        createAuthCodeRequest.setAccountUri(createAccountUri(createAuthCodeRequest, str, map2));
        startTryingAuthCodeServices(AuthType.KAKAO_ACCOUNT, createAuthCodeRequest, startActivityWrapper2);
    }
}
