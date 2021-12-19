package com.ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f138752a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f138753b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(90754);
        l.a a2 = l.a(o.SERIAL);
        a2.f79173b = "draft-executor";
        ExecutorService a3 = g.a(a2.a());
        h.f.b.l.b(a3, "");
        f138752a = a3;
    }
}
