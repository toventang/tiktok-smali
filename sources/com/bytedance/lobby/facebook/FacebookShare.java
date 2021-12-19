package com.bytedance.lobby.facebook;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a.b;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.LobbyCore;

public class FacebookShare extends FacebookProvider<Object> implements b {
    static {
        Covode.recordClassIndex(24774);
    }

    public FacebookShare(d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }
}
