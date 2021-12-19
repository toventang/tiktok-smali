package com.bytedance.sdk.xbridge.registry.core_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.c.d;
import com.bytedance.sdk.xbridge.registry.core.b;
import h.f.b.l;

public abstract class c<Input> {

    /* renamed from: a  reason: collision with root package name */
    public final b f44063a;

    /* renamed from: b  reason: collision with root package name */
    public final Input f44064b;

    static {
        Covode.recordClassIndex(26928);
    }

    public abstract com.bytedance.sdk.xbridge.registry.core.a.a<Input> a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44065a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f44066b;

        static {
            Covode.recordClassIndex(26929);
        }

        a(c cVar, d dVar) {
            this.f44065a = cVar;
            this.f44066b = dVar;
        }
    }

    public c(b bVar, Input input) {
        l.c(bVar, "");
        this.f44063a = bVar;
        this.f44064b = input;
    }
}
