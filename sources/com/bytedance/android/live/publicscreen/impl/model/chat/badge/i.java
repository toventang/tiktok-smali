package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public abstract class i extends b {

    /* renamed from: f  reason: collision with root package name */
    public final Handler f12450f;

    /* renamed from: g  reason: collision with root package name */
    public final b<i, z> f12451g;

    static {
        Covode.recordClassIndex(6839);
    }

    public abstract void e();

    public abstract void f();

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.android.live.publicscreen.impl.model.chat.badge.i, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(g gVar, Handler handler, b<? super i, z> bVar) {
        super(gVar);
        l.d(gVar, "");
        l.d(handler, "");
        l.d(bVar, "");
        this.f12450f = handler;
        this.f12451g = bVar;
    }
}
