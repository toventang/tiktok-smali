package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.u;
import h.f.b.l;
import java.util.List;

public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public h f35282a;

    /* renamed from: b  reason: collision with root package name */
    public int f35283b;

    /* renamed from: c  reason: collision with root package name */
    public String f35284c;

    /* renamed from: d  reason: collision with root package name */
    public final b f35285d;

    /* renamed from: e  reason: collision with root package name */
    public TypedInput f35286e;

    /* renamed from: f  reason: collision with root package name */
    public Object f35287f;

    /* renamed from: g  reason: collision with root package name */
    public T f35288g;

    /* renamed from: h  reason: collision with root package name */
    public TypedInput f35289h;

    /* renamed from: i  reason: collision with root package name */
    public s f35290i;

    /* renamed from: j  reason: collision with root package name */
    private final c f35291j;

    /* renamed from: k  reason: collision with root package name */
    private final u<T> f35292k;

    static {
        Covode.recordClassIndex(21134);
    }

    public final u<T> a() {
        c cVar = new c(this.f35282a.a(), this.f35283b, this.f35284c, this.f35285d.a(), this.f35286e);
        cVar.f42478f = this.f35287f;
        if (this.f35292k.f42629a.a()) {
            u<T> a2 = u.a((Object) this.f35288g, cVar);
            l.b(a2, "");
            return a2;
        }
        u<T> a3 = u.a(this.f35289h, cVar);
        l.b(a3, "");
        return a3;
    }

    public g(u<T> uVar) {
        l.d(uVar, "");
        this.f35292k = uVar;
        c cVar = uVar.f42629a;
        l.b(cVar, "");
        this.f35291j = cVar;
        h a2 = h.a(cVar.f42473a);
        l.b(a2, "");
        this.f35282a = a2;
        this.f35283b = cVar.f42474b;
        String str = cVar.f42475c;
        l.b(str, "");
        this.f35284c = str;
        List<b> list = cVar.f42476d;
        l.b(list, "");
        this.f35285d = new b(list);
        this.f35286e = cVar.f42477e;
        this.f35287f = cVar.f42478f;
        this.f35288g = uVar.f42630b;
        this.f35289h = uVar.f42631c;
        this.f35290i = uVar.f42632d;
    }
}
