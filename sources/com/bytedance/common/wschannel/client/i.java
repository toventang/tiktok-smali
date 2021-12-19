package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class i extends b {
    static {
        Covode.recordClassIndex(16022);
    }

    public i(c.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, a aVar) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
        if (parcelableArrayListExtra != null) {
            for (SocketState socketState : parcelableArrayListExtra) {
                if (socketState != null) {
                    a(socketState.f27270d, socketState.f27268b);
                }
            }
        }
    }
}
