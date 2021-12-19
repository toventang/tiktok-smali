package com.ss.android.ugc.aweme.im.sdk.chat.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.im.sdk.chat.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.a;
import h.a.af;
import h.f.b.l;
import h.j.h;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicIntegerArray f100100a = new AtomicIntegerArray(a.values().length);

    static {
        Covode.recordClassIndex(63798);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.a.b
    public final void a() {
        Iterator it = h.a(0, this.f100100a.length()).iterator();
        while (it.hasNext()) {
            this.f100100a.set(((af) it).a(), 0);
        }
    }

    private static long a(String str) {
        l.d(str, "");
        return b.a.c(str);
    }

    private final void a(a aVar) {
        this.f100100a.incrementAndGet(aVar.ordinal());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r1 != 4) goto L_0x0060;
     */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.im.core.d.ai r9) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.a.c.a(com.bytedance.im.core.d.ai):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.a.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        long a2 = a(str);
        AtomicIntegerArray atomicIntegerArray = this.f100100a;
        String a3 = a.a();
        e.d dVar = e.d.f100111a;
        l.d(atomicIntegerArray, "");
        l.d(a3, "");
        l.d(dVar, "");
        if (atomicIntegerArray.length() == a.values().length) {
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("send_message", "[" + (atomicIntegerArray.get(a.SEND_SUCCESS.ordinal()) + atomicIntegerArray.get(a.SEND_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.SEND_FAIL.ordinal()) + ']');
            aVar.put("send_emoji", "[" + (atomicIntegerArray.get(a.BIG_EMOJI_SUCCESS.ordinal()) + atomicIntegerArray.get(a.BIG_EMOJI_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.BIG_EMOJI_FAIL.ordinal()) + ']');
            aVar.put("send_favorite_emoji", "[" + (atomicIntegerArray.get(a.SELF_EMOJI_SUCCESS.ordinal()) + atomicIntegerArray.get(a.SELF_EMOJI_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.SELF_EMOJI_FAIL.ordinal()) + ']');
            aVar.put("send_giphy", "[" + (atomicIntegerArray.get(a.SEARCH_GIF_SUCCESS.ordinal()) + atomicIntegerArray.get(a.SEARCH_GIF_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.SEARCH_GIF_FAIL.ordinal()) + ']');
            aVar.put("send_text", "[" + (atomicIntegerArray.get(a.TEXT_SUCCESS.ordinal()) + atomicIntegerArray.get(a.TEXT_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.TEXT_FAIL.ordinal()) + ']');
            aVar.put("send_video", "[" + (atomicIntegerArray.get(a.VIDEO_SUCCESS.ordinal()) + atomicIntegerArray.get(a.VIDEO_FAIL.ordinal())) + ", " + atomicIntegerArray.get(a.VIDEO_FAIL.ordinal()) + ']');
            aVar.put("to_user_id", String.valueOf(a2));
            aVar.put("process_id", a3);
            dVar.invoke("chat_stats", aVar);
        }
        e eVar = e.f100108a;
        long a4 = a(str);
        AtomicIntegerArray atomicIntegerArray2 = this.f100100a;
        e.c cVar = new e.c(eVar);
        l.d(str2, "");
        l.d(atomicIntegerArray2, "");
        l.d(cVar, "");
        if (atomicIntegerArray2.length() == a.values().length) {
            androidx.c.a aVar2 = new androidx.c.a();
            aVar2.put("event", "chat_stats");
            aVar2.put("label", "message");
            aVar2.put("success_cnt", String.valueOf(atomicIntegerArray2.get(a.SEND_SUCCESS.ordinal())));
            aVar2.put("fail_cnt", String.valueOf(atomicIntegerArray2.get(a.SEND_UNEXPECTED_FAIL.ordinal())));
            aVar2.put("session_id", String.valueOf(a4));
            aVar2.put("source_type", str2);
            cVar.invoke(aVar2);
        }
    }
}
