package com.bytedance.android.live.publicscreen.impl.a;

import com.bytedance.android.live.publicscreen.impl.model.chat.b;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Long> f12211a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final a f12212b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(6725);
    }

    public static void a(b bVar) {
        l.d(bVar, "");
        Set<Long> set = f12211a;
        MESSAGE message = bVar.f12190d;
        l.b(message, "");
        set.remove(Long.valueOf(((i) message).f19628a));
    }
}
