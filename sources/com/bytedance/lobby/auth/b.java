package com.bytedance.lobby.auth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyViewModel;

public final class b {
    static {
        Covode.recordClassIndex(24754);
    }

    public static void a(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            AuthResult.a aVar = new AuthResult.a(str, 2);
            aVar.f40157a = false;
            aVar.f40158b = new c(1, "[" + str + "] provider currently does not support logging out, please contact Lobby developer for further details.");
            lobbyViewModel.b(aVar.a());
        }
    }

    public static void a(LobbyViewModel lobbyViewModel, String str, int i2) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            AuthResult.a aVar = new AuthResult.a(str, i2);
            aVar.f40157a = false;
            aVar.f40158b = new c(2, "[" + str + "] provider is not available, make sure you have added it to your dependency.", "before_goto_URL");
            lobbyViewModel.b(aVar.a());
        }
    }
}
