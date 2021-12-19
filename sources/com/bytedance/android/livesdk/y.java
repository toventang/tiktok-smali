package com.bytedance.android.livesdk;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f22910a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(13539);
    }

    public static final void a(String str) {
        l.d(str, "");
        i.b();
        i.b("ttlive_fetch_message_polling_failed", str);
    }

    public static final void a(List<? extends IdMessage> list, List<? extends ReasonMessage> list2) {
        l.d(list, "");
        l.d(list2, "");
        HashMap hashMap = new HashMap();
        if (!list.isEmpty()) {
            hashMap.put("successfulMessages", e.a.f9628b.b(list));
        }
        if (!list2.isEmpty()) {
            hashMap.put("failedMessages", e.a.f9628b.b(list2));
        }
        i.b().b("ttlive_fetch_message_polling_succeeded", hashMap);
    }
}
