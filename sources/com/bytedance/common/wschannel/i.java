package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.b.c;
import com.bytedance.common.wschannel.client.j;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    a f27217a;

    /* renamed from: b  reason: collision with root package name */
    final e f27218b;

    /* renamed from: c  reason: collision with root package name */
    final j f27219c;

    /* renamed from: d  reason: collision with root package name */
    final Context f27220d;

    /* renamed from: e  reason: collision with root package name */
    SsWsApp f27221e;

    /* renamed from: f  reason: collision with root package name */
    c f27222f;

    /* renamed from: g  reason: collision with root package name */
    AtomicBoolean f27223g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(16048);
    }

    @Override // com.bytedance.common.wschannel.h
    public final boolean b() {
        if (this.f27222f == c.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.h
    public final void a() {
        this.f27219c.a(this.f27220d, this.f27217a.f26993a);
        this.f27223g.set(true);
    }

    @Override // com.bytedance.common.wschannel.h
    public final void a(a aVar) {
        if (aVar == null || aVar.f26993a != this.f27217a.f26993a) {
            throw new IllegalArgumentException("channelId isn't the same");
        } else if (!this.f27223g.get()) {
            this.f27217a = aVar;
            SsWsApp a2 = k.a(aVar);
            this.f27221e = a2;
            this.f27219c.b(this.f27220d, a2);
        }
    }

    @Override // com.bytedance.common.wschannel.h
    public final void a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.f27304m != this.f27217a.f26993a) {
            throw new IllegalArgumentException("channelId isn't the same");
        } else if (!this.f27223g.get()) {
            this.f27219c.a(this.f27220d, new MainProcessMsg(wsChannelMsg, null));
        }
    }

    i(Context context, j jVar, a aVar, e eVar) {
        this.f27220d = context;
        this.f27219c = jVar;
        this.f27217a = aVar;
        this.f27218b = eVar;
        this.f27221e = k.a(aVar);
    }
}
