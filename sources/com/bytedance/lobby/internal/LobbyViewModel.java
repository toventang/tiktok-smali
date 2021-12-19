package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;

public class LobbyViewModel extends BaseViewModel<AuthResult> {
    static {
        Covode.recordClassIndex(24800);
    }

    /* Return type fixed from 'androidx.lifecycle.LiveData' to match base method */
    @Override // com.bytedance.lobby.internal.BaseViewModel
    public final /* bridge */ /* synthetic */ LiveData<AuthResult> g() {
        return super.g();
    }

    public LobbyViewModel(Application application) {
        super(application);
    }

    public static LobbyViewModel a(e eVar) {
        return (LobbyViewModel) ae.a(eVar, (ad.b) null).a(LobbyViewModel.class);
    }
}
