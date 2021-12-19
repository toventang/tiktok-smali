package com.bytedance.tux.extension.player;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static d f44963a = d.PLAYER_IDLE;

    /* renamed from: b  reason: collision with root package name */
    public static c f44964b = c.PREVIEW;

    /* renamed from: c  reason: collision with root package name */
    public static final e f44965c = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(27442);
    }

    public static void a(c cVar) {
        l.c(cVar, "");
        f44964b = cVar;
    }

    public static void a(d dVar) {
        l.c(dVar, "");
        f44963a = dVar;
    }
}
