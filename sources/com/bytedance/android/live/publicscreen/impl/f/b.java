package com.bytedance.android.live.publicscreen.impl.f;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.IdReasonMessage;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12369a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(6798);
    }

    public static final void a(a aVar) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("clickedMessage", e.a.f9628b.b(IdMessage.from(aVar)));
            i.b().b("ttlive_text_message_clicked_on_name", hashMap);
        }
    }

    public static final void b(a aVar) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("clickedMessage", e.a.f9628b.b(IdMessage.from(aVar)));
            i.b().b("ttlive_text_message_clicked_on_content", hashMap);
        }
    }

    public static final void a(a aVar, String str) {
        l.d(str, "");
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("discardedMessage", e.a.f9628b.b(IdReasonMessage.from(aVar, str)));
            i.b().b("ttlive_message_discarded_on_message", hashMap);
        }
    }

    public static final void b(a aVar, String str) {
        l.d(str, "");
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("discardedMessage", e.a.f9628b.b(IdReasonMessage.from(aVar, str)));
            i.b().b("ttlive_message_discarded_on_buffer", hashMap);
        }
    }
}
