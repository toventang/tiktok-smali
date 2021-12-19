package com.kakao.auth;

import com.bytedance.covode.number.Covode;

public abstract class KakaoAdapter {
    static {
        Covode.recordClassIndex(34243);
    }

    public abstract IApplicationConfig getApplicationConfig();

    public IPushConfig getPushConfig() {
        return new IPushConfig() {
            /* class com.kakao.auth.KakaoAdapter.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34245);
            }

            @Override // com.kakao.auth.IPushConfig
            public String getDeviceUUID() {
                return null;
            }

            @Override // com.kakao.auth.IPushConfig
            public ApiResponseCallback<Integer> getTokenRegisterCallback() {
                return null;
            }
        };
    }

    public ISessionConfig getSessionConfig() {
        return new ISessionConfig() {
            /* class com.kakao.auth.KakaoAdapter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34244);
            }

            @Override // com.kakao.auth.ISessionConfig
            public boolean isSaveFormData() {
                return true;
            }

            @Override // com.kakao.auth.ISessionConfig
            public boolean isSecureMode() {
                return false;
            }

            @Override // com.kakao.auth.ISessionConfig
            public boolean isUsingWebviewTimer() {
                return false;
            }

            @Override // com.kakao.auth.ISessionConfig
            public ApprovalType getApprovalType() {
                return ApprovalType.INDIVIDUAL;
            }

            @Override // com.kakao.auth.ISessionConfig
            public AuthType[] getAuthTypes() {
                return new AuthType[]{AuthType.KAKAO_LOGIN_ALL};
            }
        };
    }
}
