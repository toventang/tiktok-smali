package com.bytedance.lobby.kakao;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.KakaoSDK;

public class KakaoProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24811);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
        if (KakaoSDK.getAdapter() == null) {
            KakaoSDK.init(new a());
        }
    }

    KakaoProvider(d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }
}
