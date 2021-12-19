package com.bytedance.lobby.vk;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.vk.api.sdk.VK;

/* access modifiers changed from: package-private */
public class VkProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24822);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
        VK.a(this.f3469a);
    }

    VkProvider(d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }
}
