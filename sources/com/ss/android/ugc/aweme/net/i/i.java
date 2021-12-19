package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i implements AttachUserData, b.AbstractC0800b {

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArrayList<String> f112378a;

    /* renamed from: b  reason: collision with root package name */
    private final int f112379b = 10;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f112380c;

    static {
        Covode.recordClassIndex(72217);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    public i() {
        Npth.setAttachUserData(this, CrashType.ALL);
        this.f112378a = new CopyOnWriteArrayList<>(Collections.nCopies(10, ""));
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.AbstractC0800b
    public final void a(Request request) {
        l.d(request, "");
        l.d(request, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.AbstractC0800b
    public final void c(Request request) {
        l.d(request, "");
        l.d(request, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.AbstractC0800b
    public final void a(u<?> uVar) {
        l.d(uVar, "");
        l.d(uVar, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.AbstractC0800b
    public final void b(Request request) {
        l.d(request, "");
        String path = request.getPath();
        this.f112380c %= this.f112379b;
        this.f112378a.set(this.f112380c, path);
        this.f112380c++;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return ag.b(v.a("paths_in_crash", this.f112378a.toString()));
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.AbstractC0800b
    public final void a(Throwable th) {
        l.d(th, "");
        l.d(th, "");
    }
}
