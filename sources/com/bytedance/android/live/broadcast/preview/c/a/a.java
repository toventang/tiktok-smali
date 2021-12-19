package com.bytedance.android.live.broadcast.preview.c.a;

import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.broadcast.af;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class a implements com.bytedance.android.live.broadcast.preview.c.a {
    static {
        Covode.recordClassIndex(4073);
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        DataChannel dataChannel = aVar.f8151b;
        if (dataChannel == null || dataChannel.b(ab.class) == null) {
            return false;
        }
        aVar.f8151b.c(af.class, com.bytedance.android.live.broadcast.model.l.NORMAL_BLOCK);
        return true;
    }
}
