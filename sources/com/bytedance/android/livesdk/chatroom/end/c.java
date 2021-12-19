package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdkapi.depend.model.live.p;
import com.bytedance.covode.number.Covode;
import f.a.d.g;
import java.util.HashMap;

final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f15429a = new c();

    static {
        Covode.recordClassIndex(8522);
    }

    private c() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(((p) obj).f23165a));
        hashMap.put("connection_type", "anchor");
        return hashMap;
    }
}
