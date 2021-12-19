package com.bytedance.lobby.google;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;

final /* synthetic */ class c implements q {

    /* renamed from: a  reason: collision with root package name */
    private final LobbyViewModel f40211a;

    static {
        Covode.recordClassIndex(24789);
    }

    c(LobbyViewModel lobbyViewModel) {
        this.f40211a = lobbyViewModel;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(p pVar) {
        LobbyViewModel lobbyViewModel = this.f40211a;
        Status status = (Status) pVar;
        if (GoogleAuth.f40188b) {
            status.c();
        }
        AuthResult.a aVar = new AuthResult.a("google", 2);
        aVar.f40157a = status.c();
        lobbyViewModel.b(aVar.a());
    }
}
