package com.kakao.auth.authorization.authcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.ISessionConfig;
import com.kakao.common.KakaoContextService;
import com.kakao.util.KakaoUtilService;

/* access modifiers changed from: package-private */
public class StoryAuthCodeService extends TalkAuthCodeService {
    static {
        Covode.recordClassIndex(34302);
    }

    @Override // com.kakao.auth.authorization.authcode.TalkAuthCodeService, com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean isLoginAvailable() {
        if (createLoggedInActivityIntent(null) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.auth.authorization.authcode.TalkAuthCodeService
    public Intent createLoggedInActivityIntent(Bundle bundle) {
        int i2;
        Intent createIntent = createIntent("com.kakao.story.intent.action.CAPRI_LOGGED_IN_ACTIVITY", this.contextService.phaseInfo().appKey(), redirectUriString(), bundle);
        KakaoUtilService kakaoUtilService = this.protocolService;
        Context context = this.context;
        if (this.sessionConfig.getApprovalType() == ApprovalType.PROJECT) {
            i2 = 99;
        } else {
            i2 = 80;
        }
        return kakaoUtilService.resolveIntent(context, createIntent, i2);
    }

    StoryAuthCodeService(Context context, KakaoContextService kakaoContextService, ISessionConfig iSessionConfig, KakaoUtilService kakaoUtilService) {
        super(context, kakaoContextService, iSessionConfig, kakaoUtilService);
    }

    @Override // com.kakao.auth.authorization.authcode.TalkAuthCodeService, com.kakao.auth.authorization.authcode.AuthCodeService
    public boolean handleActivityResult(int i2, int i3, Intent intent, AuthCodeListener authCodeListener) {
        return super.handleActivityResult(i2, i3, intent, authCodeListener);
    }
}
