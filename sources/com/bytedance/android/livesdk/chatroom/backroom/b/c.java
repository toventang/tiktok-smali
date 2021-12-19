package com.bytedance.android.livesdk.chatroom.backroom.b;

import com.bytedance.android.livesdk.chatroom.backroom.f.a;
import com.bytedance.android.livesdk.chatroom.backroom.f.b;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c implements a {
    static {
        Covode.recordClassIndex(8334);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.b.a
    public final boolean a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        String str;
        l.d(stackContext, "");
        if (enterRoomConfig2 != null) {
            str = a.a(enterRoomConfig2);
        } else {
            str = null;
        }
        return n.a((Iterable) ((List) b.f15026a.getValue()), (Object) str);
    }
}
