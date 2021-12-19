package com.bytedance.lobby.kakao;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.b;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;

public class KakaoAuth extends KakaoProvider<AuthResult> implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f40254b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    public LobbyViewModel f40255d;

    /* renamed from: e  reason: collision with root package name */
    private ISessionCallback f40256e;

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
    }

    static {
        Covode.recordClassIndex(24808);
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        Session currentSession;
        AccessToken tokenInfo;
        if (KakaoSDK.getAdapter() == null || (currentSession = Session.getCurrentSession()) == null || (tokenInfo = currentSession.getTokenInfo()) == null) {
            return null;
        }
        return tokenInfo.getAccessToken();
    }

    public KakaoAuth(com.bytedance.lobby.d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
        if ((i2 == 2 || i2 == 3) && KakaoSDK.getAdapter() != null && Session.getCurrentSession() != null) {
            Session.getCurrentSession().close();
        }
    }

    public final void a(c cVar) {
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
        aVar.f40157a = false;
        aVar.f40158b = cVar;
        this.f40255d.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, Bundle bundle) {
        this.f40255d = LobbyViewModel.a(eVar);
        if (!t_()) {
            b.a(this.f40255d, this.f40228c.f40176b, 1);
            return;
        }
        this.f40256e = new ISessionCallback() {
            /* class com.bytedance.lobby.kakao.KakaoAuth.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24809);
            }

            @Override // com.kakao.auth.ISessionCallback
            public final void onSessionOpened() {
                final Session currentSession = Session.getCurrentSession();
                if (currentSession != null) {
                    AuthService.getInstance().requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                        /* class com.bytedance.lobby.kakao.KakaoAuth.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(24810);
                        }

                        @Override // com.kakao.auth.ApiResponseCallback
                        public final void onNotSignedUp() {
                            KakaoAuth.this.a(new c(-999, "KakaoSDK ApiResponseCallback onNotSignedUp"));
                        }

                        @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                        public final void onFailure(ErrorResult errorResult) {
                            c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new c(3, "KakaoSDK ApiResponseCallback onFailure with no ErrorResult");
                            }
                            kakaoAuth.a(cVar);
                        }

                        @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                        public final void onFailureForUiThread(ErrorResult errorResult) {
                            c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new c(3, "KakaoSDK ApiResponseCallback onFailureForUiThread with no ErrorResult");
                            }
                            kakaoAuth.a(cVar);
                        }

                        @Override // com.kakao.auth.ApiResponseCallback
                        public final void onSessionClosed(ErrorResult errorResult) {
                            c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new c(3, "KakaoSDK ApiResponseCallback onSessionClosed with no ErrorResult");
                            }
                            kakaoAuth.a(cVar);
                        }

                        @Override // com.kakao.network.callback.ResponseCallback
                        public final /* synthetic */ void onSuccess(Object obj) {
                            AccessTokenInfoResponse accessTokenInfoResponse = (AccessTokenInfoResponse) obj;
                            if (accessTokenInfoResponse == null) {
                                KakaoAuth.this.a(new c(3, "KakaoSDK ApiResponseCallback onSuccess called, but AccessTokenInfoResponse is null."));
                                return;
                            }
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            Session session = currentSession;
                            long currentTimeMillis = System.currentTimeMillis() + accessTokenInfoResponse.getExpiresInMillis();
                            AuthResult.a aVar = new AuthResult.a(kakaoAuth.f40228c.f40176b, 1);
                            aVar.f40157a = true;
                            aVar.f40161e = session.getTokenInfo().getAccessToken();
                            aVar.f40163g = currentTimeMillis;
                            aVar.f40160d = String.valueOf(accessTokenInfoResponse.getUserId());
                            kakaoAuth.f40255d.b(aVar.a());
                        }
                    });
                }
            }

            @Override // com.kakao.auth.ISessionCallback
            public final void onSessionOpenFailed(KakaoException kakaoException) {
                AuthResult.a aVar = new AuthResult.a(KakaoAuth.this.f40228c.f40176b, 1);
                aVar.f40157a = false;
                aVar.f40158b = new c(kakaoException).setCancelled(true);
                KakaoAuth.this.f40255d.b(aVar.a());
            }
        };
        Session.getCurrentSession().addCallback(this.f40256e);
        Session.getCurrentSession().checkAndImplicitOpen();
        Session.getCurrentSession().open(AuthType.KAKAO_LOGIN_ALL, eVar);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        if (Session.getCurrentSession().isOpened()) {
            Session.getCurrentSession().close();
            AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
            aVar.f40157a = true;
            this.f40255d.b(aVar.a());
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        if (this.f40256e != null) {
            Session.getCurrentSession().handleActivityResult(i2, i3, intent);
        }
    }
}
