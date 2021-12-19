package com.bytedance.lobby.kakao;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.AuthType;
import com.kakao.auth.IApplicationConfig;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.KakaoAdapter;

public final class a extends KakaoAdapter {
    static {
        Covode.recordClassIndex(24812);
    }

    @Override // com.kakao.auth.KakaoAdapter
    public final IApplicationConfig getApplicationConfig() {
        return new IApplicationConfig() {
            /* class com.bytedance.lobby.kakao.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24814);
            }

            @Override // com.kakao.auth.IApplicationConfig
            public final Context getApplicationContext() {
                return LobbyCore.getApplication();
            }
        };
    }

    @Override // com.kakao.auth.KakaoAdapter
    public final ISessionConfig getSessionConfig() {
        return new ISessionConfig() {
            /* class com.bytedance.lobby.kakao.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24813);
            }

            @Override // com.kakao.auth.ISessionConfig
            public final boolean isSaveFormData() {
                return true;
            }

            @Override // com.kakao.auth.ISessionConfig
            public final boolean isSecureMode() {
                return false;
            }

            @Override // com.kakao.auth.ISessionConfig
            public final boolean isUsingWebviewTimer() {
                return false;
            }

            @Override // com.kakao.auth.ISessionConfig
            public final ApprovalType getApprovalType() {
                return ApprovalType.INDIVIDUAL;
            }

            @Override // com.kakao.auth.ISessionConfig
            public final AuthType[] getAuthTypes() {
                return new AuthType[]{AuthType.KAKAO_TALK, AuthType.KAKAO_STORY, AuthType.KAKAO_ACCOUNT};
            }
        };
    }
}
