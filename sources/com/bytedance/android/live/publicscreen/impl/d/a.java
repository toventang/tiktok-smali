package com.bytedance.android.live.publicscreen.impl.d;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a implements com.bytedance.android.live.publicscreen.a.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends IMessage>, b<? extends IMessage>> f12302a = new HashMap();

    static {
        Covode.recordClassIndex(6768);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.a
    public final <MESSAGE extends IMessage> void a(Class<MESSAGE> cls, b<MESSAGE> bVar) {
        l.d(cls, "");
        l.d(bVar, "");
        this.f12302a.put(cls, bVar);
    }
}
